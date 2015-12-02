// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.common.w.e;
import com.facebook.common.w.n;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.p;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.server.SendMessageByRecipientsParams;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            aj, an, ad

public class SendBroadcastMethod
    implements f
{

    private final ad a;
    private final an b;

    public SendBroadcastMethod(ad ad1, an an1)
    {
        a = ad1;
        b = an1;
    }

    public com.facebook.http.protocol.n a(aj aj1)
    {
        java.util.ArrayList arraylist = hq.a();
        SendMessageByRecipientsParams sendmessagebyrecipientsparams = aj.a(aj1);
        if (sendmessagebyrecipientsparams.c())
        {
            arraylist.add(new BasicNameValuePair("name", sendmessagebyrecipientsparams.b()));
        }
        arraylist.add(new BasicNameValuePair("is_broadcast", "1"));
        com.facebook.messages.model.threads.Message message = sendmessagebyrecipientsparams.a();
        b.a(arraylist, message, null);
        if (!n.a(aj.b(aj1)))
        {
            arraylist.add(new BasicNameValuePair("media", aj.b(aj1)));
        }
        arraylist.add(new BasicNameValuePair("to", a.a(sendmessagebyrecipientsparams.d()).toString()));
        return com.facebook.http.protocol.n.newBuilder().a("sendBroadcast").b("POST").c("me/threads").a(arraylist).a(t.JSON).k();
    }

    public volatile com.facebook.http.protocol.n a(Object obj)
    {
        return a((aj)obj);
    }

    public ev a(aj aj1, r r1)
    {
        aj1 = r1.c();
        r1 = ev.k();
        Iterator iterator = aj1.fields();
        while (iterator.hasNext()) 
        {
            aj1 = (java.util.Map.Entry)iterator.next();
            String s = (String)aj1.getKey();
            aj1 = (JsonNode)aj1.getValue();
            int i = e.d(aj1.get("error_code"));
            if (i == 0)
            {
                aj1 = e.b(aj1.get("result").get("tid"));
            } else
            {
                aj1 = null;
            }
            r1.b(s, new SingleBroadcastResult(i, aj1));
        }
        return r1.b();
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((aj)obj, r1);
    }

    private class SingleBroadcastResult
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new ak();
        public final int a;
        public final String b;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(a);
            parcel.writeString(null);
        }


        public SingleBroadcastResult(int i, String s)
        {
            a = i;
            b = s;
        }

        private SingleBroadcastResult(Parcel parcel)
        {
            a = parcel.readInt();
            String s = parcel.readString();
            parcel = s;
            if (s.equals(""))
            {
                parcel = null;
            }
            b = parcel;
        }

        SingleBroadcastResult(Parcel parcel, ai ai)
        {
            this(parcel);
        }
    }

}
