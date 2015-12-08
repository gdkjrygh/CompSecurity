// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.widgets.list.CollectionPager;
import com.google.android.apps.wallet.widgets.list.PageResult;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.ObjectArrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecord, PurchaseRecordRow, PurchaseRecordNotFoundException

public class PurchaseRecordManager
    implements CollectionPager
{

    static final com.google.wallet.proto.NanoWalletTransport.ClientRetryStrategy DEFAULT_RETRY_STRATEGY;
    private static final Optional NO_PAGE_TOKEN = Optional.absent();
    private final com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters contextParameters;
    private final Function conversionFunction = new Function() {

        final PurchaseRecordManager this$0;

        private static PurchaseRecord apply(com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord clientpurchaserecord)
        {
            if (clientpurchaserecord == null)
            {
                return null;
            } else
            {
                return PurchaseRecord.fromClientPurchaseRecord(clientpurchaserecord);
            }
        }

        public final volatile Object apply(Object obj)
        {
            return apply((com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord)obj);
        }

            
            {
                this$0 = PurchaseRecordManager.this;
                super();
            }
    };
    private final FeatureManager featureManager;
    private final RpcCaller rpcCaller;

    PurchaseRecordManager(RpcCaller rpccaller, com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters layoutcontextparameters, FeatureManager featuremanager)
    {
        rpcCaller = rpccaller;
        contextParameters = layoutcontextparameters;
        featureManager = featuremanager;
    }

    private com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsResponse checkedFetch(com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest fetchtransactionsrequest)
        throws com.google.android.apps.wallet.widgets.list.CollectionPager.FetchPageException
    {
        try
        {
            fetchtransactionsrequest = fetch(fetchtransactionsrequest);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest fetchtransactionsrequest)
        {
            throw new com.google.android.apps.wallet.widgets.list.CollectionPager.FetchPageException("The server returned an unexpected result. Try again later", fetchtransactionsrequest);
        }
        return fetchtransactionsrequest;
    }

    private com.google.wallet.proto.api.NanoWalletTransaction.SearchTransactionsResponse checkedSearch(com.google.wallet.proto.api.NanoWalletTransaction.SearchTransactionsRequest searchtransactionsrequest)
        throws com.google.android.apps.wallet.widgets.list.CollectionPager.FetchPageException
    {
        try
        {
            searchtransactionsrequest = search(searchtransactionsrequest);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.wallet.proto.api.NanoWalletTransaction.SearchTransactionsRequest searchtransactionsrequest)
        {
            throw new com.google.android.apps.wallet.widgets.list.CollectionPager.FetchPageException("The server returned an unexpected result when searching. Try again later", searchtransactionsrequest);
        }
        return searchtransactionsrequest;
    }

    private com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo createRequestRenderInfo()
    {
        com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo requestrenderinfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
        requestrenderinfo.entrypointNames = (String[])Iterables.toArray(LayoutMatcher.WOBS_ENTRY_POINT_NAMES, java/lang/String);
        requestrenderinfo.contextParameters = contextParameters;
        return requestrenderinfo;
    }

    private com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsResponse fetch(com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest fetchtransactionsrequest)
        throws RpcException
    {
        setRenderInfo(fetchtransactionsrequest);
        fetchtransactionsrequest.shouldEnrichMerchant = Boolean.valueOf(featureManager.isFeatureEnabled(Feature.TRANSACTION_RICH_MERCHANT_DETAILS));
        return (com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsResponse)rpcCaller.call("b/transaction/fetch", fetchtransactionsrequest, new com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsResponse());
    }

    private PageResult fetchFirstPage()
        throws com.google.android.apps.wallet.widgets.list.CollectionPager.FetchPageException
    {
        Object obj = new com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest();
        setRenderInfo(((com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest) (obj)));
        obj.queries = (new com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.QueryParams[] {
            getPendingQuery(), getCompletedQuery(Optional.absent())
        });
        obj = checkedFetch(((com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest) (obj)));
        ArrayList arraylist = new ArrayList();
        if (((com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsResponse) (obj)).responses.length == 0)
        {
            throw new com.google.android.apps.wallet.widgets.list.CollectionPager.FetchPageException("Expected query responses for the query request params.");
        }
        arraylist.addAll(Arrays.asList(((com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsResponse) (obj)).responses[0].purchaseRecords));
        obj = ((com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsResponse) (obj)).responses[((com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsResponse) (obj)).responses.length - 1];
        arraylist.addAll(Arrays.asList(((com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsResponse.QueryResponse) (obj)).purchaseRecords));
        if (((com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsResponse.QueryResponse) (obj)).nextPageToken != null)
        {
            obj = ((com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsResponse.QueryResponse) (obj)).nextPageToken;
        } else
        {
            obj = null;
        }
        return new PageResult(Lists.transform(arraylist, conversionFunction), ((String) (obj)));
    }

    private PageResult fetchNextPage(String s)
        throws com.google.android.apps.wallet.widgets.list.CollectionPager.FetchPageException
    {
        com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest fetchtransactionsrequest = new com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest();
        setRenderInfo(fetchtransactionsrequest);
        fetchtransactionsrequest.queries = (com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.QueryParams[])ObjectArrays.concat(fetchtransactionsrequest.queries, getCompletedQuery(Optional.of(s)));
        s = checkedFetch(fetchtransactionsrequest).responses[0];
        return new PageResult(Lists.transform(Arrays.asList(((com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsResponse.QueryResponse) (s)).purchaseRecords), conversionFunction), ((com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsResponse.QueryResponse) (s)).nextPageToken);
    }

    private PageResult fetchPageWithFullTextQuery(String s, Optional optional)
        throws com.google.android.apps.wallet.widgets.list.CollectionPager.FetchPageException
    {
        com.google.wallet.proto.api.NanoWalletTransaction.SearchTransactionsRequest searchtransactionsrequest;
        boolean flag;
        if (!Strings.isNullOrEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        searchtransactionsrequest = new com.google.wallet.proto.api.NanoWalletTransaction.SearchTransactionsRequest();
        setRenderInfo(searchtransactionsrequest);
        searchtransactionsrequest.searchCriteria = new com.google.wallet.proto.api.NanoWalletTransaction.SearchCriteria();
        searchtransactionsrequest.searchCriteria.query = s;
        s = new com.google.wallet.proto.api.NanoWalletTransaction.PaginationCriteria();
        s.maxNumberResults = Integer.valueOf(20);
        if (optional.isPresent())
        {
            s.continuationToken = (String)optional.get();
        }
        searchtransactionsrequest.paginationCriteria = s;
        optional = checkedSearch(searchtransactionsrequest);
        s = new ArrayList();
        s.addAll(Arrays.asList(((com.google.wallet.proto.api.NanoWalletTransaction.SearchTransactionsResponse) (optional)).purchaseRecords));
        optional = ((com.google.wallet.proto.api.NanoWalletTransaction.SearchTransactionsResponse) (optional)).nextPageToken;
        return new PageResult(Lists.transform(s, conversionFunction), optional);
    }

    private static com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.QueryParams getCompletedQuery(Optional optional)
    {
        com.google.wallet.proto.api.NanoWalletTransaction.PaginationCriteria paginationcriteria = new com.google.wallet.proto.api.NanoWalletTransaction.PaginationCriteria();
        paginationcriteria.maxNumberResults = Integer.valueOf(20);
        if (optional.isPresent())
        {
            paginationcriteria.continuationToken = (String)optional.get();
        }
        optional = new com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.QueryParams();
        optional.type = Integer.valueOf(2);
        com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.ByPendingState bypendingstate = new com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.ByPendingState();
        bypendingstate.pending = Boolean.valueOf(false);
        optional.byPendingState = bypendingstate;
        optional.paginationCriteria = paginationcriteria;
        return optional;
    }

    private static com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.QueryParams getPendingQuery()
    {
        com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.QueryParams queryparams = new com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.QueryParams();
        queryparams.type = Integer.valueOf(2);
        com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.ByPendingState bypendingstate = new com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.ByPendingState();
        bypendingstate.pending = Boolean.valueOf(true);
        queryparams.byPendingState = bypendingstate;
        return queryparams;
    }

    private List getPurchaseRecordsWithType(int i)
        throws RpcException
    {
        Object obj = new com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest();
        Object obj1 = new com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.QueryParams();
        obj1.type = Integer.valueOf(i);
        obj.queries = (com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.QueryParams[])ObjectArrays.concat(((com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest) (obj)).queries, obj1);
        obj1 = fetch(((com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest) (obj))).responses[0];
        obj = Lists.newArrayList();
        com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord aclientpurchaserecord[] = ((com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsResponse.QueryResponse) (obj1)).purchaseRecords;
        int j = aclientpurchaserecord.length;
        for (i = 0; i < j; i++)
        {
            ((List) (obj)).add(PurchaseRecord.fromClientPurchaseRecord(aclientpurchaserecord[i]));
        }

        return ((List) (obj));
    }

    private com.google.wallet.proto.api.NanoWalletTransaction.SearchTransactionsResponse search(com.google.wallet.proto.api.NanoWalletTransaction.SearchTransactionsRequest searchtransactionsrequest)
        throws RpcException
    {
        searchtransactionsrequest.shouldEnrichMerchant = Boolean.valueOf(featureManager.isFeatureEnabled(Feature.TRANSACTION_RICH_MERCHANT_DETAILS));
        return (com.google.wallet.proto.api.NanoWalletTransaction.SearchTransactionsResponse)rpcCaller.call("b/transaction/search", searchtransactionsrequest, new com.google.wallet.proto.api.NanoWalletTransaction.SearchTransactionsResponse());
    }

    private void setRenderInfo(com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest fetchtransactionsrequest)
    {
        if (featureManager.isFeatureEnabled(Feature.TRANSACTIONS_USE_WOBL))
        {
            fetchtransactionsrequest.renderInfo = createRequestRenderInfo();
            return;
        } else
        {
            fetchtransactionsrequest.supportedMrfTag = (String[])PurchaseRecordRow.supportedRowTags.toArray(new String[0]);
            return;
        }
    }

    private void setRenderInfo(com.google.wallet.proto.api.NanoWalletTransaction.SearchTransactionsRequest searchtransactionsrequest)
    {
        if (featureManager.isFeatureEnabled(Feature.TRANSACTIONS_USE_WOBL))
        {
            searchtransactionsrequest.renderInfo = createRequestRenderInfo();
        }
    }

    public final PageResult fetchFirstPage(Optional optional)
        throws com.google.android.apps.wallet.widgets.list.CollectionPager.FetchPageException
    {
        if (optional.isPresent())
        {
            return fetchPageWithFullTextQuery((String)optional.get(), NO_PAGE_TOKEN);
        } else
        {
            return fetchFirstPage();
        }
    }

    public final PageResult fetchNextPage(Optional optional, String s)
        throws com.google.android.apps.wallet.widgets.list.CollectionPager.FetchPageException
    {
        if (optional.isPresent())
        {
            return fetchPageWithFullTextQuery((String)optional.get(), Optional.of(s));
        } else
        {
            return fetchNextPage(s);
        }
    }

    public final PurchaseRecord get(String s)
        throws RpcException, PurchaseRecordNotFoundException
    {
        com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest fetchtransactionsrequest;
        com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.QueryParams queryparams;
        com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.ByIds byids;
        boolean flag;
        if (!Strings.isNullOrEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        fetchtransactionsrequest = new com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest();
        setRenderInfo(fetchtransactionsrequest);
        queryparams = new com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.QueryParams();
        queryparams.type = Integer.valueOf(10);
        byids = new com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.ByIds();
        byids.ids = (String[])ObjectArrays.concat(byids.ids, s);
        queryparams.byIds = byids;
        fetchtransactionsrequest.queries = (com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsRequest.QueryParams[])ObjectArrays.concat(fetchtransactionsrequest.queries, queryparams);
        s = fetch(fetchtransactionsrequest).responses[0];
        if (((com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsResponse.QueryResponse) (s)).purchaseRecords.length != 1)
        {
            throw new PurchaseRecordNotFoundException();
        } else
        {
            return PurchaseRecord.fromClientPurchaseRecord(((com.google.wallet.proto.api.NanoWalletTransaction.FetchTransactionsResponse.QueryResponse) (s)).purchaseRecords[0]);
        }
    }

    public final List getClaimablePurchaseRecords()
        throws RpcException
    {
        return getPurchaseRecordsWithType(6);
    }

    public final List getIncomingMoneyRequests()
        throws RpcException
    {
        return getPurchaseRecordsWithType(9);
    }

    public final List getPendingStoredValueTransactions()
        throws RpcException
    {
        return getPurchaseRecordsWithType(7);
    }

    public final List getStoredValueTransactions()
        throws RpcException
    {
        return Arrays.asList(((com.google.wallet.proto.api.NanoWalletStatement.StoredValueStatementsResponse)rpcCaller.call("b/transaction/fetchStoredValueStatements", new com.google.wallet.proto.api.NanoWalletStatement.StoredValueStatementsRequest(), new com.google.wallet.proto.api.NanoWalletStatement.StoredValueStatementsResponse())).statementLink);
    }

    static 
    {
        DEFAULT_RETRY_STRATEGY = new com.google.wallet.proto.NanoWalletTransport.ClientRetryStrategy();
        com.google.wallet.proto.NanoWalletTransport.ClientRetryStrategy.ConstantRetryStrategy constantretrystrategy = new com.google.wallet.proto.NanoWalletTransport.ClientRetryStrategy.ConstantRetryStrategy();
        constantretrystrategy.totalNumberOfAttempts = Integer.valueOf(3);
        constantretrystrategy.delayMillis = Long.valueOf(3000L);
        DEFAULT_RETRY_STRATEGY.constantRetryStrategy = constantretrystrategy;
    }
}
