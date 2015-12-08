// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.text.TextUtils;
import b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import llb;

public class Message
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new llb();
    public final int a;
    public final byte b[];
    public final String c;
    public final String d;

    public Message(int i, byte abyte0[], String s, String s1)
    {
        a = i;
        b = (byte[])b.d(abyte0);
        c = (String)b.d(s1);
        String s2 = s;
        if (s == null)
        {
            s2 = "";
        }
        d = s2;
        boolean flag;
        if (abyte0.length <= 0x19000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", new Object[] {
            Integer.valueOf(abyte0.length), Integer.valueOf(0x19000)
        });
        if (s1.length() <= 32)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", new Object[] {
            Integer.valueOf(s1.length()), Integer.valueOf(32)
        });
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Message))
            {
                return false;
            }
            obj = (Message)obj;
            if (!TextUtils.equals(d, ((Message) (obj)).d) || !TextUtils.equals(c, ((Message) (obj)).c) || !Arrays.equals(b, ((Message) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            d, c, Integer.valueOf(Arrays.hashCode(b))
        });
    }

    public String toString()
    {
        return (new StringBuilder("Message{namespace='")).append(d).append("', type='").append(c).append("', content=[").append(b.length).append(" bytes]}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        llb.a(this, parcel);
    }

}
