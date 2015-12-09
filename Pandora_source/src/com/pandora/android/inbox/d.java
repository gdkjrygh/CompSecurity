// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.inbox;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.cw.c;
import p.cx.h;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.df.a;

// Referenced classes of package com.pandora.android.inbox:
//            InboxNotification, InboxNotificationProcessor

class d extends h
{
    public static interface a
    {

        public abstract void a(Long long1);
    }


    private c a;
    private a c;

    public d(c c1, a a1)
    {
        a = c1;
        c = a1;
    }

    private InboxNotification[] a(JSONArray jsonarray)
    {
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList();
        i = 0;
_L3:
        if (i >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        InboxNotification inboxnotification = com.pandora.android.inbox.InboxNotification.a(jsonarray.getJSONObject(i));
        if (inboxnotification != null)
        {
            try
            {
                arraylist.add(inboxnotification);
            }
            catch (JSONException jsonexception)
            {
                p.df.a.e("InboxPollingManager", "Unable to parse inbox message", jsonexception);
            }
        }
        i++;
          goto _L3
_L2:
        return (InboxNotification[])arraylist.toArray(new InboxNotification[arraylist.size()]);
    }

    private long[] b(JSONArray jsonarray)
        throws JSONException
    {
        long al[] = new long[jsonarray.length()];
        for (int i = 0; i < jsonarray.length(); i++)
        {
            al[i] = jsonarray.getLong(i);
        }

        return al;
    }

    public d a()
    {
        return new d(a, c);
    }

    public transient Void a(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        boolean flag = false;
        long l = System.currentTimeMillis();
        JSONObject jsonobject = a.e().a(((Long)aobj[0]).longValue(), 0L, 0);
        if (jsonobject != null)
        {
            boolean flag1 = true;
            aobj = jsonobject.optJSONArray("messageList");
            if (aobj != null)
            {
                aobj = a(((JSONArray) (aobj)));
            } else
            {
                aobj = null;
            }
            if (aobj != null)
            {
                com.pandora.android.inbox.InboxNotificationProcessor.a(a.s(), ((InboxNotification []) (aobj)));
            }
            aobj = jsonobject.optJSONArray("deletedMessageIdList");
            if (aobj != null)
            {
                aobj = b(((JSONArray) (aobj)));
            } else
            {
                aobj = null;
            }
            flag = flag1;
            if (aobj != null)
            {
                com.pandora.android.inbox.InboxNotificationProcessor.c(a.s(), ((long []) (aobj)));
                flag = flag1;
            }
        }
        if (flag)
        {
            c.a(Long.valueOf(l));
        }
        return null;
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return a(aobj);
    }

    public h b()
    {
        return a();
    }
}
