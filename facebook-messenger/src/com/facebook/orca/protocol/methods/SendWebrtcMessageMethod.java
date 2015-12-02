// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.p;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class SendWebrtcMessageMethod
    implements f
{

    private static final Class a = com/facebook/orca/protocol/methods/SendWebrtcMessageMethod;

    public SendWebrtcMessageMethod()
    {
    }

    public n a(Params params)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("webrtc_message_id", params.b()));
        arraylist.add(new BasicNameValuePair("payload", params.c()));
        return n.newBuilder().a("sendWebrtcMessage").b("POST").c((new StringBuilder()).append(Long.toString(params.a())).append("/voip_calls").toString()).a(arraylist).a(t.JSON).k();
    }

    public volatile n a(Object obj)
    {
        return a((Params)obj);
    }

    public Boolean a(Params params, r r1)
    {
        r1.c();
        return Boolean.valueOf(true);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((Params)obj, r1);
    }


    private class Params
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new av();
        private final long a;
        private final String b;
        private final String c;

        public long a()
        {
            return a;
        }

        public String b()
        {
            return b;
        }

        public String c()
        {
            return c;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeLong(a);
            parcel.writeString(b);
            parcel.writeString(c);
        }


        public Params(long l, String s, String s1)
        {
            a = l;
            b = s;
            c = s1;
        }

        public Params(Parcel parcel)
        {
            a = parcel.readLong();
            b = parcel.readString();
            c = parcel.readString();
        }
    }

}
