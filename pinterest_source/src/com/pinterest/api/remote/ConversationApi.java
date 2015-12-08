// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.api.ApiFields;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.RequestParams;
import com.pinterest.base.Device;
import com.pinterest.kit.utils.PStringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class ConversationApi extends BaseApi
{

    public static void a(BaseApiResponseHandler baseapiresponsehandler, String s)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("page_size", Device.getPageSizeString());
        requestparams.a("fields", ApiFields.G);
        a("conversations/", requestparams, baseapiresponsehandler, s);
    }

    public static void a(String s, BaseApiResponseHandler baseapiresponsehandler)
    {
        c((new StringBuilder("conversations/")).append(s).append("/").toString(), baseapiresponsehandler, null);
    }

    public static void a(String s, String s1, BaseApiResponseHandler baseapiresponsehandler)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("reason", s1);
        c((new StringBuilder("conversations/")).append(s).append("/report/").toString(), requestparams, baseapiresponsehandler, null);
    }

    public static void a(String s, String s1, String s2, BaseApiResponseHandler baseapiresponsehandler)
    {
        a(s, s2, null, s1, baseapiresponsehandler, null);
    }

    public static void a(String s, String s1, String s2, BaseApiResponseHandler baseapiresponsehandler, String s3)
    {
        a(s, s2, s1, null, baseapiresponsehandler, s3);
    }

    private static void a(String s, String s1, String s2, String s3, BaseApiResponseHandler baseapiresponsehandler, String s4)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("pin", s2);
        requestparams.a("board", s3);
        requestparams.a("text", s1);
        requestparams.a("fields", ApiFields.H);
        c((new StringBuilder("conversations/")).append(s).append("/messages/").toString(), requestparams, baseapiresponsehandler, s4);
    }

    public static void a(Collection collection, BaseApiResponseHandler baseapiresponsehandler, String s)
    {
        RequestParams requestparams = new RequestParams();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        collection = collection.iterator();
        do
        {
            if (collection.hasNext())
            {
                TypeAheadItem typeaheaditem = (TypeAheadItem)collection.next();
                switch (_cls1.a[typeaheaditem.getItemType().ordinal()])
                {
                case 1: // '\001'
                case 2: // '\002'
                    arraylist1.add(typeaheaditem.getIdentifier());
                    break;

                case 3: // '\003'
                case 4: // '\004'
                case 5: // '\005'
                case 6: // '\006'
                case 7: // '\007'
                    arraylist.add(typeaheaditem.getUid());
                    break;
                }
            } else
            {
                requestparams.a("user_ids", PStringUtils.concatStringArray(arraylist, ","));
                requestparams.a("emails", PStringUtils.concatStringArray(arraylist1, ","));
                requestparams.a("text", null);
                requestparams.a("fields", ApiFields.G);
                c("conversations/", requestparams, baseapiresponsehandler, s);
                return;
            }
        } while (true);
    }

    public static void b(BaseApiResponseHandler baseapiresponsehandler, String s)
    {
        c("conversations/badge/", baseapiresponsehandler, s);
    }

    public static void b(String s, BaseApiResponseHandler baseapiresponsehandler)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("peek", Boolean.FALSE);
        a((new StringBuilder("conversations/")).append(s).append("/messages/").toString(), requestparams, baseapiresponsehandler, null);
    }

    public static void d(String s, String s1, BaseApiResponseHandler baseapiresponsehandler, String s2)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("ids", s);
        if (s1 != null)
        {
            requestparams.a("bookmark", s1);
        }
        a("conversations/poll/", requestparams, baseapiresponsehandler, s2);
    }

    public static void e(String s, String s1, BaseApiResponseHandler baseapiresponsehandler, String s2)
    {
        a(s, s1, null, null, baseapiresponsehandler, s2);
    }

    public static void f(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        a((new StringBuilder("conversations/")).append(s).append("/?fields=").append(ApiFields.G).toString(), baseapiresponsehandler, s1);
    }

    public static void g(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", ApiFields.H);
        a((new StringBuilder("conversations/")).append(s).append("/messages/").toString(), requestparams, baseapiresponsehandler, s1);
    }

    public static void h(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        if (s != null)
        {
            BaseApi.e((new StringBuilder()).append(s).append("&fields=").append(ApiFields.H).toString(), baseapiresponsehandler, s1);
        }
    }

    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[com.pinterest.activity.search.model.TypeAheadItem.ItemType.values().length];
            try
            {
                a[com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMAIL_CONTACT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[com.pinterest.activity.search.model.TypeAheadItem.ItemType.PHONE_CONTACT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[com.pinterest.activity.search.model.TypeAheadItem.ItemType.FOLLOWEE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[com.pinterest.activity.search.model.TypeAheadItem.ItemType.MUTUAL_FOLLOW.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[com.pinterest.activity.search.model.TypeAheadItem.ItemType.FACEBOOK_CONTACT.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.pinterest.activity.search.model.TypeAheadItem.ItemType.TWITTER_CONTACT.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.pinterest.activity.search.model.TypeAheadItem.ItemType.PINNER.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
