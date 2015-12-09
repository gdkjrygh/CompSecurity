// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.wobs.add.LinkPromptConverter;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.common.base.Throwables;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class GiftCardsClient
{

    private final com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters contextParameters;
    private final Cache discoverGiftCardsCache;
    private final RpcCaller rpcCaller;

    public GiftCardsClient(RpcCaller rpccaller, com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters layoutcontextparameters)
    {
        discoverGiftCardsCache = CacheBuilder.newBuilder().expireAfterWrite(10L, TimeUnit.MINUTES).build();
        rpcCaller = rpccaller;
        contextParameters = layoutcontextparameters;
    }

    private com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo createRenderingInfo()
    {
        com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo requestrenderinfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
        requestrenderinfo.entrypointNames = (String[])Iterables.toArray(LayoutMatcher.WOBS_ENTRY_POINT_NAMES, java/lang/String);
        requestrenderinfo.contextParameters = contextParameters;
        return requestrenderinfo;
    }

    public final List discoverGiftCards(final String query)
        throws RpcException, CallErrorException
    {
        try
        {
            query = (List)discoverGiftCardsCache.get(query, new Callable() {

                final GiftCardsClient this$0;
                final String val$query;

                private List call()
                    throws Exception
                {
                    Object obj = new com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverGiftCardsRequest();
                    if (!query.isEmpty())
                    {
                        obj.queryString = query;
                    }
                    obj.pageSize = Integer.valueOf(500);
                    obj = (com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverGiftCardsResponse)rpcCaller.call("b/giftcards/discover", ((com.google.protobuf.nano.MessageNano) (obj)), new com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverGiftCardsResponse());
                    if (((com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverGiftCardsResponse) (obj)).callError != null)
                    {
                        throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverGiftCardsResponse) (obj)).callError);
                    } else
                    {
                        return ImmutableList.copyOf(((com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverGiftCardsResponse) (obj)).forms);
                    }
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = GiftCardsClient.this;
                query = s;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (final String query)
        {
            if (query.getCause() instanceof RpcException)
            {
                throw (RpcException)query.getCause();
            }
            if (query.getCause() instanceof CallErrorException)
            {
                throw (CallErrorException)query.getCause();
            } else
            {
                throw Throwables.propagate(query);
            }
        }
        return query;
    }

    public final com.google.wallet.proto.api.NanoWalletGiftCards.GetEditFormResponse getEditForm(byte abyte0[], String s)
        throws RpcException, CallErrorException
    {
        com.google.wallet.proto.api.NanoWalletGiftCards.GetEditFormRequest geteditformrequest = new com.google.wallet.proto.api.NanoWalletGiftCards.GetEditFormRequest();
        geteditformrequest.serverData = abyte0;
        geteditformrequest.contextUri = s;
        geteditformrequest.renderInfo = createRenderingInfo();
        abyte0 = (com.google.wallet.proto.api.NanoWalletGiftCards.GetEditFormResponse)rpcCaller.call("b/giftcards/getEditForm", geteditformrequest, new com.google.wallet.proto.api.NanoWalletGiftCards.GetEditFormResponse());
        if (((com.google.wallet.proto.api.NanoWalletGiftCards.GetEditFormResponse) (abyte0)).callError != null)
        {
            throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletGiftCards.GetEditFormResponse) (abyte0)).callError);
        } else
        {
            return abyte0;
        }
    }

    public final com.google.wallet.proto.api.NanoWalletGiftCards.GetGiftCardFormResponse getLinkForm(String s)
        throws RpcException, CallErrorException
    {
        com.google.wallet.proto.api.NanoWalletGiftCards.GetGiftCardFormRequest getgiftcardformrequest = new com.google.wallet.proto.api.NanoWalletGiftCards.GetGiftCardFormRequest();
        getgiftcardformrequest.discoverableId = s;
        getgiftcardformrequest.renderInfo = createRenderingInfo();
        s = (com.google.wallet.proto.api.NanoWalletGiftCards.GetGiftCardFormResponse)rpcCaller.call("b/giftcards/getGiftCardForm", getgiftcardformrequest, new com.google.wallet.proto.api.NanoWalletGiftCards.GetGiftCardFormResponse());
        if (((com.google.wallet.proto.api.NanoWalletGiftCards.GetGiftCardFormResponse) (s)).callError != null)
        {
            throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletGiftCards.GetGiftCardFormResponse) (s)).callError);
        } else
        {
            return s;
        }
    }

    public final com.google.wallet.proto.api.NanoWalletGiftCards.LinkGiftCardsResponse link(String s, List list, com.google.wallet.proto.api.NanoUserAddedImages.UserAddedImage auseraddedimage[])
        throws RpcException, CallErrorException
    {
        com.google.wallet.proto.api.NanoWalletGiftCards.LinkGiftCardsRequest linkgiftcardsrequest = new com.google.wallet.proto.api.NanoWalletGiftCards.LinkGiftCardsRequest();
        linkgiftcardsrequest.discoverableId = s;
        linkgiftcardsrequest.formSubmission = new com.google.wallet.proto.api.NanoWalletWobForms.InputFormSubmission();
        linkgiftcardsrequest.formSubmission.linkValues = LinkPromptConverter.createValues(list);
        linkgiftcardsrequest.renderInfo = createRenderingInfo();
        linkgiftcardsrequest.userAddedImage = auseraddedimage;
        s = (com.google.wallet.proto.api.NanoWalletGiftCards.LinkGiftCardsResponse)rpcCaller.call("b/giftcards/linkGiftCard", linkgiftcardsrequest, new com.google.wallet.proto.api.NanoWalletGiftCards.LinkGiftCardsResponse());
        if (((com.google.wallet.proto.api.NanoWalletGiftCards.LinkGiftCardsResponse) (s)).callError != null)
        {
            throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletGiftCards.LinkGiftCardsResponse) (s)).callError);
        } else
        {
            return s;
        }
    }

    public final com.google.wallet.proto.api.NanoWalletGiftCards.LinkAdhocGiftCardsResponse linkAdhoc(List list, com.google.wallet.proto.api.NanoUserAddedImages.UserAddedImage auseraddedimage[])
        throws RpcException, CallErrorException
    {
        com.google.wallet.proto.api.NanoWalletGiftCards.LinkAdhocGiftCardsRequest linkadhocgiftcardsrequest = new com.google.wallet.proto.api.NanoWalletGiftCards.LinkAdhocGiftCardsRequest();
        linkadhocgiftcardsrequest.renderInfo = createRenderingInfo();
        linkadhocgiftcardsrequest.userAddedImage = auseraddedimage;
        linkadhocgiftcardsrequest.formSubmission = new com.google.wallet.proto.api.NanoWalletWobForms.InputFormSubmission();
        linkadhocgiftcardsrequest.formSubmission.linkValues = LinkPromptConverter.createValues(list);
        list = (com.google.wallet.proto.api.NanoWalletGiftCards.LinkAdhocGiftCardsResponse)rpcCaller.call("b/giftcards/linkAdhocGiftCard", linkadhocgiftcardsrequest, new com.google.wallet.proto.api.NanoWalletGiftCards.LinkAdhocGiftCardsResponse());
        if (((com.google.wallet.proto.api.NanoWalletGiftCards.LinkAdhocGiftCardsResponse) (list)).callError != null)
        {
            throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletGiftCards.LinkAdhocGiftCardsResponse) (list)).callError);
        } else
        {
            return list;
        }
    }

    public final com.google.wallet.proto.NanoWalletObjects.WobInstance updateWobInstance(byte abyte0[], List list)
        throws RpcException, CallErrorException
    {
        com.google.wallet.proto.api.NanoWalletGiftCards.UpdateWobInstanceRequest updatewobinstancerequest = new com.google.wallet.proto.api.NanoWalletGiftCards.UpdateWobInstanceRequest();
        updatewobinstancerequest.serverData = abyte0;
        updatewobinstancerequest.formSubmission = new com.google.wallet.proto.api.NanoWalletWobForms.InputFormSubmission();
        updatewobinstancerequest.formSubmission.linkValues = LinkPromptConverter.createValues(list);
        updatewobinstancerequest.renderInfo = createRenderingInfo();
        abyte0 = (com.google.wallet.proto.api.NanoWalletGiftCards.UpdateWobInstanceResponse)rpcCaller.call("b/giftcards/updateWobInstance", updatewobinstancerequest, new com.google.wallet.proto.api.NanoWalletGiftCards.UpdateWobInstanceResponse());
        if (((com.google.wallet.proto.api.NanoWalletGiftCards.UpdateWobInstanceResponse) (abyte0)).callError != null)
        {
            throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletGiftCards.UpdateWobInstanceResponse) (abyte0)).callError);
        }
        if (((com.google.wallet.proto.api.NanoWalletGiftCards.UpdateWobInstanceResponse) (abyte0)).wobInstance == null)
        {
            throw new RpcException("crossbar returned an empty UpdateWobInstanceResponse.");
        } else
        {
            return ((com.google.wallet.proto.api.NanoWalletGiftCards.UpdateWobInstanceResponse) (abyte0)).wobInstance;
        }
    }

}
