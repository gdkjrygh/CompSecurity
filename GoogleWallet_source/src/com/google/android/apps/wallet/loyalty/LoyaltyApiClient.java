// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.loyalty.discovery.LoyaltyDiscoveryApiClient;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.wobs.add.LinkPromptConverter;
import com.google.android.apps.wallet.wobs.add.SharedDataPromptConverter;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.commerce.wobs.common.Entrypoint;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyProgram, LoyaltyFactory

public class LoyaltyApiClient
{

    private static final Object CACHE_KEY_ALL_SHARED_DATA_PROMPTS = new Object();
    private static final String TAG = com/google/android/apps/wallet/loyalty/LoyaltyApiClient.getSimpleName();
    private final Cache allSharedDataPromptsCache;
    private final com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters contextParameters;
    private final LoyaltyDiscoveryApiClient discoveryApiClient;
    private final RpcCaller rpcCaller;
    private final Cache suggestedProgramCache;

    LoyaltyApiClient(RpcCaller rpccaller, com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters layoutcontextparameters, LoyaltyDiscoveryApiClient loyaltydiscoveryapiclient)
    {
        allSharedDataPromptsCache = CacheBuilder.newBuilder().expireAfterWrite(10L, TimeUnit.MINUTES).maximumSize(1L).build();
        suggestedProgramCache = CacheBuilder.newBuilder().expireAfterWrite(10L, TimeUnit.MINUTES).build();
        rpcCaller = rpccaller;
        contextParameters = layoutcontextparameters;
        discoveryApiClient = loyaltydiscoveryapiclient;
    }

    private com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo createDiscoverableDetailsRenderInfo()
    {
        com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo requestrenderinfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
        requestrenderinfo.contextParameters = contextParameters;
        return requestrenderinfo;
    }

    private LoyaltyProgram createLoyaltyProgram(Context context, com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram discoverableloyaltyprogram, boolean flag)
        throws RpcException
    {
        if (flag)
        {
            Preconditions.checkNotNull(discoverableloyaltyprogram.signupInfo);
            context = fetchPromptsForConfigs(discoverableloyaltyprogram.signupInfo.sharedDataConfigs);
        } else
        {
            Preconditions.checkNotNull(discoverableloyaltyprogram.linkingInfo);
            Integer integer;
            com.google.common.collect.ImmutableList.Builder builder;
            if (discoverableloyaltyprogram.linkingInfo.identifierLabel != null)
            {
                context = discoverableloyaltyprogram.linkingInfo.identifierLabel;
            } else
            {
                context = context.getString(com.google.android.apps.walletnfcrel.R.string.loyalty_membership_id_hint);
            }
            integer = discoverableloyaltyprogram.linkingInfo.identifierTypeOrdinal;
            builder = ImmutableList.builder();
            builder.add(LoyaltyFactory.createLocalMemberIdPrompt(integer, context));
            builder.add(LoyaltyFactory.createBarcodePrompt());
            builder.addAll(fetchPromptsForConfigs(discoverableloyaltyprogram.linkingInfo.sharedDataConfigs));
            context = builder.build();
        }
        return new LoyaltyProgram(discoverableloyaltyprogram, context);
    }

    private com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo createRenderingInfo()
    {
        com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo requestrenderinfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
        requestrenderinfo.entrypointNames = (String[])Iterables.toArray(LayoutMatcher.WOBS_ENTRY_POINT_NAMES, java/lang/String);
        requestrenderinfo.contextParameters = contextParameters;
        return requestrenderinfo;
    }

    private ImmutableList fetchPromptsForConfigs(com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataConfig ashareddataconfig[])
        throws RpcException
    {
        if (ashareddataconfig.length > 0)
        {
            SparseArray sparsearray = getAllSharedDataPrompts();
            java.util.ArrayList arraylist = Lists.newArrayList();
            int j = ashareddataconfig.length;
            for (int i = 0; i < j; i++)
            {
                arraylist.add(sparsearray.get(ashareddataconfig[i].sharedDataId.intValue()));
            }

            return SharedDataPromptConverter.convert(arraylist);
        } else
        {
            return ImmutableList.of();
        }
    }

    private SparseArray getAllSharedDataPrompts()
        throws RpcException
    {
        SparseArray sparsearray;
        try
        {
            sparsearray = (SparseArray)allSharedDataPromptsCache.get(CACHE_KEY_ALL_SHARED_DATA_PROMPTS, new Callable() {

                final LoyaltyApiClient this$0;

                private SparseArray call()
                    throws Exception
                {
                    Object obj = new com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltySharedDataPromptsRequest();
                    obj.sharedDataIds = null;
                    com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltySharedDataPromptsResponse getloyaltyshareddatapromptsresponse = (com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltySharedDataPromptsResponse)rpcCaller.call("b/loyalty/getPrompts", ((com.google.protobuf.nano.MessageNano) (obj)), new com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltySharedDataPromptsResponse());
                    obj = new SparseArray();
                    com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataPrompt ashareddataprompt[] = getloyaltyshareddatapromptsresponse.sharedDataPrompts;
                    int j = ashareddataprompt.length;
                    for (int i = 0; i < j; i++)
                    {
                        com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataPrompt shareddataprompt = ashareddataprompt[i];
                        ((SparseArray) (obj)).put(shareddataprompt.sharedDataId.intValue(), shareddataprompt);
                    }

                    return ((SparseArray) (obj));
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = LoyaltyApiClient.this;
                super();
            }
            });
        }
        catch (ExecutionException executionexception)
        {
            throw handleCacheExecutionException(executionexception);
        }
        return sparsearray;
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

    public final com.google.wallet.proto.NanoWalletObjects.WobInstance editLoyalty(byte abyte0[], List list)
        throws RpcException, CallErrorException
    {
        com.google.wallet.proto.api.NanoWalletLoyalty.EditLoyaltyRequest editloyaltyrequest = new com.google.wallet.proto.api.NanoWalletLoyalty.EditLoyaltyRequest();
        editloyaltyrequest.serverData = abyte0;
        editloyaltyrequest.formSubmission = new com.google.wallet.proto.api.NanoWalletWobForms.InputFormSubmission();
        editloyaltyrequest.formSubmission.linkValues = LinkPromptConverter.createValues(list);
        editloyaltyrequest.renderInfo = createRenderingInfo();
        abyte0 = (com.google.wallet.proto.api.NanoWalletLoyalty.EditLoyaltyResponse)rpcCaller.call("b/loyalty/editLoyalty", editloyaltyrequest, new com.google.wallet.proto.api.NanoWalletLoyalty.EditLoyaltyResponse());
        if (((com.google.wallet.proto.api.NanoWalletLoyalty.EditLoyaltyResponse) (abyte0)).callError != null)
        {
            throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletLoyalty.EditLoyaltyResponse) (abyte0)).callError);
        }
        if (((com.google.wallet.proto.api.NanoWalletLoyalty.EditLoyaltyResponse) (abyte0)).wobInstance == null)
        {
            throw new RpcException("crossbar returned an empty EditLoyaltyResponse.");
        } else
        {
            return ((com.google.wallet.proto.api.NanoWalletLoyalty.EditLoyaltyResponse) (abyte0)).wobInstance;
        }
    }

    public final com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyEditFormResponse getEditForm(byte abyte0[])
        throws RpcException, CallErrorException
    {
        com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyEditFormRequest getloyaltyeditformrequest = new com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyEditFormRequest();
        getloyaltyeditformrequest.serverData = abyte0;
        getloyaltyeditformrequest.renderInfo = createRenderingInfo();
        abyte0 = (com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyEditFormResponse)rpcCaller.call("b/loyalty/getEditForm", getloyaltyeditformrequest, new com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyEditFormResponse());
        if (((com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyEditFormResponse) (abyte0)).callError != null)
        {
            throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyEditFormResponse) (abyte0)).callError);
        } else
        {
            return abyte0;
        }
    }

    public final com.google.wallet.proto.api.NanoWalletLoyalty.SuggestedLoyaltyProgramInfo[] getLoyaltyProgramSuggestions(final String query)
        throws RpcException
    {
        try
        {
            query = (com.google.wallet.proto.api.NanoWalletLoyalty.SuggestedLoyaltyProgramInfo[])suggestedProgramCache.get(query, new Callable() {

                final LoyaltyApiClient this$0;
                final String val$query;

                private com.google.wallet.proto.api.NanoWalletLoyalty.SuggestedLoyaltyProgramInfo[] call()
                    throws Exception
                {
                    com.google.wallet.proto.api.NanoWalletLoyalty.SuggestLoyaltyProgramsRequest suggestloyaltyprogramsrequest = new com.google.wallet.proto.api.NanoWalletLoyalty.SuggestLoyaltyProgramsRequest();
                    suggestloyaltyprogramsrequest.merchantNameInput = query;
                    suggestloyaltyprogramsrequest.maxResultsToFetch = Integer.valueOf(25);
                    return ((com.google.wallet.proto.api.NanoWalletLoyalty.SuggestLoyaltyProgramsResponse)rpcCaller.call("b/loyalty/suggestPrograms", suggestloyaltyprogramsrequest, new com.google.wallet.proto.api.NanoWalletLoyalty.SuggestLoyaltyProgramsResponse())).matchingPrograms;
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = LoyaltyApiClient.this;
                query = s;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (final String query)
        {
            throw handleCacheExecutionException(query);
        }
        return query;
    }

    public final transient ImmutableList getLoyaltyPrograms(Context context, boolean flag, String as[])
        throws CallErrorException, RpcException
    {
        int i = 0;
        Object obj = new com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyProgramsRequest();
        obj.programId = as;
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
        as = ImmutableList.builder();
        com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram adiscoverableloyaltyprogram[] = ((com.google.wallet.proto.api.NanoWalletLoyalty.GetLoyaltyProgramsResponse) (obj)).programs;
        for (int j = adiscoverableloyaltyprogram.length; i < j; i++)
        {
            as.add(createLoyaltyProgram(context, adiscoverableloyaltyprogram[i], flag));
        }

        return as.build();
    }

    public final LoyaltyProgram getSingleLoyaltyProgram(Context context, boolean flag, String s)
        throws CallErrorException, RpcException
    {
        com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram discoverableloyaltyprogram = discoveryApiClient.getCachedFeaturedProgramIfPresent(s);
        if (discoverableloyaltyprogram != null)
        {
            return createLoyaltyProgram(context, discoverableloyaltyprogram, flag);
        }
        s = getLoyaltyPrograms(context, flag, new String[] {
            s
        });
        if (s.size() != 1)
        {
            WLog.efmt(TAG, "One loyalty program expected, but %d returned from getLoyaltyProgram", new Object[] {
                Integer.valueOf(s.size())
            });
            s = new com.google.wallet.proto.NanoWalletError.CallError();
            s.title = context.getString(com.google.android.apps.walletnfcrel.R.string.loyalty_new_program_error_title);
            s.content = context.getString(com.google.android.apps.walletnfcrel.R.string.loyalty_program_failed_to_load_error_message);
            throw new CallErrorException(s);
        } else
        {
            return (LoyaltyProgram)s.get(0);
        }
    }

    public final com.google.wallet.proto.api.NanoWalletLoyalty.LinkLoyaltyProgramResponse link(String s, Integer integer, String s1, com.google.wallet.proto.NanoWalletEntities.Barcode barcode, Iterable iterable, boolean flag, com.google.wallet.proto.api.NanoUserAddedImages.UserAddedImage auseraddedimage[])
        throws RpcException
    {
        com.google.wallet.proto.api.NanoWalletLoyalty.LinkLoyaltyProgramRequest linkloyaltyprogramrequest = new com.google.wallet.proto.api.NanoWalletLoyalty.LinkLoyaltyProgramRequest();
        linkloyaltyprogramrequest.programId = s;
        linkloyaltyprogramrequest.sharedDataValues = (com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataValue[])Iterables.toArray(iterable, com/google/wallet/proto/api/NanoWalletLoyalty$SharedDataValue);
        linkloyaltyprogramrequest.forDifferentUser = Boolean.valueOf(flag);
        linkloyaltyprogramrequest.renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
        linkloyaltyprogramrequest.renderInfo.entrypointNames = (String[])LayoutMatcher.WOBS_ENTRY_POINT_NAMES.toArray(new String[0]);
        linkloyaltyprogramrequest.renderInfo.contextParameters = contextParameters;
        linkloyaltyprogramrequest.linkingId = s1;
        linkloyaltyprogramrequest.barcode = barcode;
        linkloyaltyprogramrequest.programStatus = integer;
        linkloyaltyprogramrequest.userAddedImage = auseraddedimage;
        s = (com.google.wallet.proto.api.NanoWalletLoyalty.LinkLoyaltyProgramResponse)rpcCaller.call("b/loyalty/link", linkloyaltyprogramrequest, new com.google.wallet.proto.api.NanoWalletLoyalty.LinkLoyaltyProgramResponse());
        if (((com.google.wallet.proto.api.NanoWalletLoyalty.LinkLoyaltyProgramResponse) (s)).callError != null)
        {
            integer = TAG;
            s1 = String.valueOf(((com.google.wallet.proto.api.NanoWalletLoyalty.LinkLoyaltyProgramResponse) (s)).callError.errorCode);
            WLog.d(integer, (new StringBuilder(String.valueOf(s1).length() + 30)).append("LinkLoyaltyResponse error code").append(s1).toString());
        }
        return s;
    }

    public final com.google.wallet.proto.api.NanoWalletLoyalty.LinkAdhocLoyaltyProgramResponse linkUserAddedProgram(String s, String s1, String s2, com.google.wallet.proto.NanoWalletEntities.Barcode barcode, int i, String s3, com.google.wallet.proto.api.NanoUserAddedImages.UserAddedImage auseraddedimage[])
        throws RpcException
    {
        com.google.wallet.proto.api.NanoWalletLoyalty.LinkAdhocLoyaltyProgramRequest linkadhocloyaltyprogramrequest = new com.google.wallet.proto.api.NanoWalletLoyalty.LinkAdhocLoyaltyProgramRequest();
        linkadhocloyaltyprogramrequest.merchantName = s;
        linkadhocloyaltyprogramrequest.backgroundColor = s3;
        linkadhocloyaltyprogramrequest.programIcon = Integer.valueOf(i);
        linkadhocloyaltyprogramrequest.programName = s1;
        linkadhocloyaltyprogramrequest.linkingId = s2;
        linkadhocloyaltyprogramrequest.barcode = barcode;
        linkadhocloyaltyprogramrequest.userAddedImage = auseraddedimage;
        s = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
        s.entrypointNames = (String[])LayoutMatcher.WOBS_ENTRY_POINT_NAMES.toArray(new String[0]);
        s.contextParameters = contextParameters;
        linkadhocloyaltyprogramrequest.renderInfo = s;
        return (com.google.wallet.proto.api.NanoWalletLoyalty.LinkAdhocLoyaltyProgramResponse)rpcCaller.call("b/loyalty/linkAdhocLoyaltyProgram", linkadhocloyaltyprogramrequest, new com.google.wallet.proto.api.NanoWalletLoyalty.LinkAdhocLoyaltyProgramResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletLoyalty.SignupLoyaltyProgramResponse signup(String s, Integer integer, Iterable iterable, boolean flag, boolean flag1)
        throws RpcException
    {
        com.google.wallet.proto.api.NanoWalletLoyalty.SignupLoyaltyProgramRequest signuployaltyprogramrequest = new com.google.wallet.proto.api.NanoWalletLoyalty.SignupLoyaltyProgramRequest();
        signuployaltyprogramrequest.programId = s;
        signuployaltyprogramrequest.sharedDataValues = (com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataValue[])Iterables.toArray(iterable, com/google/wallet/proto/api/NanoWalletLoyalty$SharedDataValue);
        signuployaltyprogramrequest.promotionalEmailOptIn = Boolean.valueOf(flag);
        signuployaltyprogramrequest.forDifferentUser = Boolean.valueOf(flag1);
        signuployaltyprogramrequest.renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
        signuployaltyprogramrequest.renderInfo.entrypointNames = (String[])LayoutMatcher.WOBS_ENTRY_POINT_NAMES.toArray(new String[0]);
        signuployaltyprogramrequest.renderInfo.contextParameters = contextParameters;
        signuployaltyprogramrequest.programStatus = integer;
        s = (com.google.wallet.proto.api.NanoWalletLoyalty.SignupLoyaltyProgramResponse)rpcCaller.call("b/loyalty/signup", signuployaltyprogramrequest, new com.google.wallet.proto.api.NanoWalletLoyalty.SignupLoyaltyProgramResponse());
        if (((com.google.wallet.proto.api.NanoWalletLoyalty.SignupLoyaltyProgramResponse) (s)).callError != null)
        {
            integer = TAG;
            iterable = String.valueOf(((com.google.wallet.proto.api.NanoWalletLoyalty.SignupLoyaltyProgramResponse) (s)).callError.errorCode);
            WLog.d(integer, (new StringBuilder(String.valueOf(iterable).length() + 33)).append("SignupLoyaltyResponse error codes").append(iterable).toString());
        }
        return s;
    }


}
