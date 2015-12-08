// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.common;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.c;
import com.google.android.gms.wearable.o;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.app.common:
//            WearConversationMessageItem, Charsets

public class WearConversationHistory
    implements Iterable
{
    public static class DeserializeResult
        implements g
    {

        private WearConversationHistory conversationHistory;
        private final Status status;

        public WearConversationHistory geConversationHistory()
        {
            return conversationHistory;
        }

        public Status getStatus()
        {
            return status;
        }

        private DeserializeResult(Status status1)
        {
            status = status1;
        }


        private DeserializeResult(WearConversationHistory wearconversationhistory)
        {
            conversationHistory = wearconversationhistory;
            status = new Status(0);
        }

    }


    private static final String AUTHOR = "author";
    private static final String MESSAGE = "message";
    private List wearConversationMessageItems;

    public WearConversationHistory()
    {
        wearConversationMessageItems = new ArrayList();
    }

    public static WearConversationHistory deserialize(String s)
        throws JSONException
    {
        WearConversationHistory wearconversationhistory = new WearConversationHistory();
        s = new JSONArray(s);
        for (int i = 0; i < s.length(); i++)
        {
            JSONObject jsonobject = s.getJSONObject(i);
            WearConversationMessageItem wearconversationmessageitem = new WearConversationMessageItem(jsonobject.optString("message", null));
            wearconversationmessageitem.setAuthor(jsonobject.optString("author", null));
            wearconversationhistory.add(wearconversationmessageitem);
        }

        return wearconversationhistory;
    }

    public static void deserialize(com.google.android.gms.common.api.c c1, Asset asset, h h)
    {
        o.a.a(c1, asset).a(new h(h) {

            final h val$resultCallback;

            public final volatile void onResult(g g)
            {
                onResult((com.google.android.gms.wearable.c.d)g);
            }

            public final void onResult(com.google.android.gms.wearable.c.d d)
            {
                boolean flag = d.getStatus().d();
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_115;
                }
                WearConversationHistory wearconversationhistory = WearConversationHistory.deserialize((new Scanner(d.b(), Charsets.UTF_8.name())).useDelimiter("\\A").next());
                resultCallback.onResult(new DeserializeResult(wearconversationhistory));
_L1:
                d.a();
                return;
                Object obj;
                obj;
                Status status = new Status(13, ((JSONException) (obj)).getMessage());
                resultCallback.onResult(new DeserializeResult(status));
                  goto _L1
                status;
                d.a();
                throw status;
                resultCallback.onResult(new DeserializeResult(d.getStatus()));
                  goto _L1
            }

            
            {
                resultCallback = h1;
                super();
            }
        });
    }

    public void add(WearConversationMessageItem wearconversationmessageitem)
    {
        wearConversationMessageItems.add(wearconversationmessageitem);
    }

    public void add(CharSequence charsequence)
    {
        wearConversationMessageItems.add(new WearConversationMessageItem(charsequence));
    }

    public List getWearConversationMessageItems()
    {
        return wearConversationMessageItems;
    }

    public Iterator iterator()
    {
        return wearConversationMessageItems.iterator();
    }

    public Asset serializeAsAsset()
    {
        Asset asset;
        try
        {
            asset = Asset.a(serializeAsJson().getBytes(Charsets.UTF_8));
        }
        catch (JSONException jsonexception)
        {
            throw new IllegalStateException(jsonexception);
        }
        return asset;
    }

    public String serializeAsJson()
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        JSONObject jsonobject;
        for (Iterator iterator1 = wearConversationMessageItems.iterator(); iterator1.hasNext(); jsonarray.put(jsonobject))
        {
            WearConversationMessageItem wearconversationmessageitem = (WearConversationMessageItem)iterator1.next();
            jsonobject = new JSONObject();
            jsonobject.putOpt("author", wearconversationmessageitem.getAuthor());
            jsonobject.put("message", wearconversationmessageitem.getMessageText());
        }

        return jsonarray.toString();
    }
}
