// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.threads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.parcels.a;
import com.google.common.a.fi;
import java.util.Iterator;

// Referenced classes of package com.facebook.messages.model.threads:
//            h

public class SendError
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    public static final SendError a;
    public static final SendError b = new SendError("create_thread_failed", true);
    public static final SendError c = new SendError("broadcast_message_failed", true);
    public static final SendError d;
    public static final SendError e;
    public static final SendError f;
    public static final SendError g;
    private static final fi h;
    private final String i;
    private final boolean j;

    private SendError(Parcel parcel)
    {
        i = parcel.readString();
        j = com.facebook.common.parcels.a.a(parcel);
    }

    SendError(Parcel parcel, h h1)
    {
        this(parcel);
    }

    private SendError(String s, boolean flag)
    {
        i = s;
        j = flag;
    }

    public static SendError a(String s)
    {
        for (Iterator iterator = h.iterator(); iterator.hasNext();)
        {
            SendError senderror = (SendError)iterator.next();
            if (senderror.a().equals(s))
            {
                return senderror;
            }
        }

        return g;
    }

    public String a()
    {
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        parcel.writeString(i);
        com.facebook.common.parcels.a.a(parcel, j);
    }

    static 
    {
        a = new SendError("none", true);
        d = new SendError("other_message_from_thread_failed", true);
        e = new SendError("pending_send_on_startup", true);
        f = new SendError("photo_upload_failed", true);
        g = new SendError("unknown", true);
        h = fi.a(a, d, e, f, g);
    }
}
