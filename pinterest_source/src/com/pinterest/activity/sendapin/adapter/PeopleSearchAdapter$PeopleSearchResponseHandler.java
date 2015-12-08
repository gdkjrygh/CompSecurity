// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.adapter;

import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.activity.sendapin.providers.ContactsProvider;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.kit.log.PLog;
import java.util.List;

// Referenced classes of package com.pinterest.activity.sendapin.adapter:
//            PeopleSearchAdapter

class query extends BaseApiResponseHandler
{

    private String query;
    final PeopleSearchAdapter this$0;

    private void parseData(ApiResponse apiresponse)
    {
        List list1 = TypeAheadItem.parseData(apiresponse.getData());
        List list = ContactsProvider.getContactsWithEmail(_context, query, _emailMaxCount);
        apiresponse = list;
        if (getSearchScope() == com.pinterest.api.remote.e)
        {
            apiresponse = ContactsProvider.getContactsWithPhoneNumber(_context, query, _phoneMaxCount);
            if (list != null && !list.isEmpty())
            {
                list.addAll(apiresponse);
                apiresponse = list;
            }
        }
        PLog.log("PeopleSearchAdapter", "Request came back for %s with %d, %d results", new Object[] {
            query, Integer.valueOf(list1.size()), Integer.valueOf(apiresponse.size())
        });
        if (ApplicationInfo.isNonProduction() && PeopleSearchAdapter.access$300() && !apiresponse.isEmpty())
        {
            addToDataSet(query, apiresponse);
        } else
        {
            if (!list1.isEmpty() && !apiresponse.isEmpty())
            {
                list1.addAll(apiresponse);
                addToDataSet(query, list1);
                return;
            }
            if (apiresponse.isEmpty())
            {
                addToDataSet(query, list1);
                return;
            }
            if (list1.isEmpty())
            {
                addToDataSet(query, apiresponse);
                return;
            }
        }
    }

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        PLog.error(throwable, "PeopleSearchResponseHandler failed with response %s", new Object[] {
            apiresponse
        });
        setSpinnerState(false);
    }

    public void onSuccess(final ApiResponse response)
    {
        class _cls1 extends BackgroundTask
        {

            final PeopleSearchAdapter.PeopleSearchResponseHandler this$1;
            final ApiResponse val$response;

            public void run()
            {
                try
                {
                    parseData(response);
                    return;
                }
                catch (SecurityException securityexception)
                {
                    CrashReporting.a(securityexception);
                }
                TypeAheadItem typeaheaditem = new TypeAheadItem();
                typeaheaditem.setItemType(com.pinterest.activity.search.model.TypeAheadItem.ItemType.CONTACT_NOT_FOUND_MISSING_PERMISSION);
                typeaheaditem.setTitle(Resources.string(0x7f07017b));
                ArrayList arraylist = new ArrayList();
                arraylist.add(typeaheaditem);
                addToDataSet(query, arraylist);
            }

            _cls1()
            {
                this$1 = PeopleSearchAdapter.PeopleSearchResponseHandler.this;
                response = apiresponse;
                super();
            }
        }

        if (query.equalsIgnoreCase(_currentQuery))
        {
            (new _cls1()).execute();
        }
        setSpinnerState(false);
    }



    public _cls1(String s)
    {
        this$0 = PeopleSearchAdapter.this;
        super();
        query = s;
    }
}
