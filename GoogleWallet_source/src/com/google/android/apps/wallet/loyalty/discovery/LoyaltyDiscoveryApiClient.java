// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty.discovery;

import android.location.Location;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.commerce.wobs.common.Entrypoint;
import com.google.common.base.Throwables;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class LoyaltyDiscoveryApiClient
{

    private static final Object CACHE_KEY_ALL_DISCOVERABLE_PROGRAMS = new Object();
    private final com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters contextParameters;
    private final Cache featuredProgramCache;
    private final Cache featuredProgramListCache;
    private final Cache featuredProgramsByLocation;
    private final RpcCaller rpcCaller;

    public LoyaltyDiscoveryApiClient(RpcCaller rpccaller, com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters layoutcontextparameters)
    {
        featuredProgramCache = CacheBuilder.newBuilder().expireAfterWrite(10L, TimeUnit.MINUTES).build();
        featuredProgramListCache = CacheBuilder.newBuilder().expireAfterWrite(10L, TimeUnit.MINUTES).build();
        featuredProgramsByLocation = CacheBuilder.newBuilder().maximumSize(3L).expireAfterWrite(10L, TimeUnit.MINUTES).build();
        rpcCaller = rpccaller;
        contextParameters = layoutcontextparameters;
    }

    private static com.google.wallet.proto.NanoWalletEntities.PhysicalLocation convertLocation(Location location)
    {
        com.google.wallet.proto.NanoWalletEntities.PhysicalLocation physicallocation = new com.google.wallet.proto.NanoWalletEntities.PhysicalLocation();
        physicallocation.latitude = Double.valueOf(location.getLatitude());
        physicallocation.longitude = Double.valueOf(location.getLongitude());
        physicallocation.accuracy = Float.valueOf(location.getAccuracy());
        return physicallocation;
    }

    private com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsRequest createDiscoverLoyaltyProgramsRequest(Location location)
    {
        com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsRequest discoverloyaltyprogramsrequest = new com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsRequest();
        discoverloyaltyprogramsrequest.pageSize = Integer.valueOf(500);
        discoverloyaltyprogramsrequest.renderInfo = createDiscoverableDetailsRenderInfo();
        discoverloyaltyprogramsrequest.renderInfo.entrypointNames = (new String[] {
            Entrypoint.DISCOVERABLE_DETAILS.toString()
        });
        discoverloyaltyprogramsrequest.supportsOptionalData = Boolean.valueOf(true);
        if (location != null)
        {
            discoverloyaltyprogramsrequest.location = convertLocation(location);
        }
        return discoverloyaltyprogramsrequest;
    }

    private com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo createDiscoverableDetailsRenderInfo()
    {
        com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo requestrenderinfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
        requestrenderinfo.contextParameters = contextParameters;
        return requestrenderinfo;
    }

    private static RuntimeException handleCacheExecutionException(ExecutionException executionexception)
        throws RpcException
    {
        if (executionexception.getCause() instanceof RpcException)
        {
            throw (RpcException)executionexception.getCause();
        } else
        {
            return Throwables.propagate(executionexception.getCause());
        }
    }

    private Location normalizeCacheKey(Location location)
    {
        Object obj = featuredProgramsByLocation.asMap().keySet();
        if (!((Set) (obj)).contains(location)) goto _L2; else goto _L1
_L1:
        return location;
_L2:
        Location location1;
        obj = ((Set) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            location1 = (Location)((Iterator) (obj)).next();
        } while (location1.distanceTo(location) >= 5000F);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return location1;
    }

    private com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsResponse queryProgramByLocation(Location location)
        throws RpcException
    {
        location = createDiscoverLoyaltyProgramsRequest(location);
        return (com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsResponse)rpcCaller.call("b/loyalty/discover", location, new com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsResponse());
    }

    private void updateFeaturedProgramCache(com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsResponse discoverloyaltyprogramsresponse)
    {
        discoverloyaltyprogramsresponse = discoverloyaltyprogramsresponse.programs;
        int j = discoverloyaltyprogramsresponse.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = discoverloyaltyprogramsresponse[i];
            featuredProgramCache.put(((com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram) (obj)).programId, obj);
        }

    }

    public final com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram fetchFeaturedProgram(final String programId)
        throws CallErrorException, RpcException
    {
        try
        {
            programId = (com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram)featuredProgramCache.get(programId, new Callable() {

                final LoyaltyDiscoveryApiClient this$0;
                final String val$programId;

                private com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram call()
                    throws Exception
                {
                    Object obj = new com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyProgramsRequest();
                    obj.programId = (new String[] {
                        programId
                    });
                    obj.renderInfo = createDiscoverableDetailsRenderInfo();
                    ((com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyProgramsRequest) (obj)).renderInfo.entrypointNames = (new String[] {
                        Entrypoint.DISCOVERABLE_DETAILS.toString()
                    });
                    obj.supportsOptionalData = Boolean.valueOf(true);
                    obj = (com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyProgramsResponse)rpcCaller.call("b/loyalty/getProgramsById", ((com.google.protobuf.nano.MessageNano) (obj)), new com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyProgramsResponse());
                    if (((com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyProgramsResponse) (obj)).callError != null)
                    {
                        throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyProgramsResponse) (obj)).callError);
                    }
                    if (((com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyProgramsResponse) (obj)).programs.length == 0)
                    {
                        obj = String.valueOf("Server returned a 0 length list of programs, programId=");
                        String s = String.valueOf(programId);
                        if (s.length() != 0)
                        {
                            obj = ((String) (obj)).concat(s);
                        } else
                        {
                            obj = new String(((String) (obj)));
                        }
                        throw new RpcException(((String) (obj)));
                    } else
                    {
                        return ((com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyProgramsResponse) (obj)).programs[0];
                    }
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = LoyaltyDiscoveryApiClient.this;
                programId = s;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (final String programId)
        {
            Throwable throwable = programId.getCause();
            if (throwable instanceof RpcException)
            {
                throw (RpcException)throwable;
            }
            if (throwable instanceof CallErrorException)
            {
                throw (CallErrorException)throwable;
            } else
            {
                throw Throwables.propagate(programId.getCause());
            }
        }
        return programId;
    }

    public final com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsResponse fetchFeaturedPrograms(final Location locationKey)
        throws RpcException
    {
        if (locationKey == null)
        {
            try
            {
                locationKey = (com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsResponse)featuredProgramListCache.get(CACHE_KEY_ALL_DISCOVERABLE_PROGRAMS, new Callable() {

                    final LoyaltyDiscoveryApiClient this$0;

                    private com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsResponse call()
                        throws RpcException
                    {
                        com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsResponse discoverloyaltyprogramsresponse = queryProgramByLocation(null);
                        updateFeaturedProgramCache(discoverloyaltyprogramsresponse);
                        return discoverloyaltyprogramsresponse;
                    }

                    public final volatile Object call()
                        throws Exception
                    {
                        return call();
                    }

            
            {
                this$0 = LoyaltyDiscoveryApiClient.this;
                super();
            }
                });
            }
            // Misplaced declaration of an exception variable
            catch (final Location locationKey)
            {
                throw handleCacheExecutionException(locationKey);
            }
            return locationKey;
        }
        try
        {
            locationKey = normalizeCacheKey(locationKey);
            locationKey = (com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsResponse)featuredProgramsByLocation.get(locationKey, new Callable() {

                final LoyaltyDiscoveryApiClient this$0;
                final Location val$locationKey;

                private com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsResponse call()
                    throws RpcException
                {
                    com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsResponse discoverloyaltyprogramsresponse = queryProgramByLocation(locationKey);
                    updateFeaturedProgramCache(discoverloyaltyprogramsresponse);
                    return discoverloyaltyprogramsresponse;
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = LoyaltyDiscoveryApiClient.this;
                locationKey = location;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (final Location locationKey)
        {
            throw handleCacheExecutionException(locationKey);
        }
        return locationKey;
    }

    public final com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram getCachedFeaturedProgramIfPresent(String s)
    {
        return (com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram)featuredProgramCache.getIfPresent(s);
    }





}
