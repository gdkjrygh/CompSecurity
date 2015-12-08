// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.session;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.provider.PaymentState;
import cty;
import gcw;
import java.util.Arrays;

public class SessionState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new SessionState(parcel.readString(), parcel.readString(), ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue(), ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue(), ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue(), ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue(), parcel.readInt(), parcel.readString(), ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue(), ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue(), ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue(), (PaymentState)parcel.readParcelable(com/spotify/mobile/android/provider/PaymentState.getClassLoader()), parcel.readString(), parcel.readString());
        }

        public final volatile Object[] newArray(int i1)
        {
            return new SessionState[i1];
        }

    };
    public static final String a[] = {
        "current_user", "can_sync", "logged_in", "logging_in", "current_account_type", "country_code", "logging_out", "current_user_name", "connected", "can_connect", 
        "can_stream", "payment_state", "product_type", "player_type"
    };
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final PaymentState l;
    public final String m;
    private final boolean n;
    private final String o;

    public SessionState(String s, String s1, boolean flag, boolean flag1, boolean flag2, boolean flag3, int i1, 
            String s2, boolean flag4, boolean flag5, boolean flag6, PaymentState paymentstate, String s3, String s4)
    {
        b = s;
        c = s1;
        d = flag;
        e = flag1;
        f = flag2;
        g = flag3;
        h = i1;
        i = s2;
        j = flag4;
        k = flag5;
        n = flag6;
        l = paymentstate;
        m = s3;
        o = s4;
    }

    public static SessionState a(Cursor cursor)
    {
        boolean flag2 = false;
        String s = gcw.a(cursor, 0, "");
        String s1 = gcw.a(cursor, 7, "");
        boolean flag3 = gcw.a(cursor, 1);
        boolean flag;
        boolean flag1;
        if (cursor.getInt(2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (cursor.getInt(3) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (cursor.getInt(6) != 0)
        {
            flag2 = true;
        }
        return new SessionState(s, s1, flag3, flag, flag1, flag2, cursor.getInt(4), cursor.getString(5), gcw.a(cursor, 8), gcw.a(cursor, 9), gcw.a(cursor, 10), new PaymentState(gcw.a(cursor, 11, "")), gcw.a(cursor, 12, ""), gcw.a(cursor, 13, ""));
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (SessionState)obj;
            if (!cty.a(Boolean.valueOf(d), Boolean.valueOf(((SessionState) (obj)).d)) || !cty.a(b, ((SessionState) (obj)).b) || !cty.a(c, ((SessionState) (obj)).c) || !cty.a(i, ((SessionState) (obj)).i) || !cty.a(Integer.valueOf(h), Integer.valueOf(((SessionState) (obj)).h)) || !cty.a(Boolean.valueOf(e), Boolean.valueOf(((SessionState) (obj)).e)) || !cty.a(Boolean.valueOf(f), Boolean.valueOf(((SessionState) (obj)).f)) || !cty.a(Boolean.valueOf(j), Boolean.valueOf(((SessionState) (obj)).j)) || !cty.a(Boolean.valueOf(k), Boolean.valueOf(((SessionState) (obj)).k)) || !cty.a(Boolean.valueOf(n), Boolean.valueOf(((SessionState) (obj)).n)) || !cty.a(l, ((SessionState) (obj)).l) || !cty.a(m, ((SessionState) (obj)).m) || !cty.a(o, ((SessionState) (obj)).o) || !cty.a(Boolean.valueOf(g), Boolean.valueOf(((SessionState) (obj)).g)))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c, Boolean.valueOf(d), i, Integer.valueOf(h), Boolean.valueOf(e), Boolean.valueOf(f), Boolean.valueOf(j), Boolean.valueOf(k), Boolean.valueOf(n), 
            l, m, o, Boolean.valueOf(g)
        });
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeValue(Boolean.valueOf(d));
        parcel.writeValue(Boolean.valueOf(e));
        parcel.writeValue(Boolean.valueOf(f));
        parcel.writeValue(Boolean.valueOf(g));
        parcel.writeInt(h);
        parcel.writeString(i);
        parcel.writeValue(Boolean.valueOf(j));
        parcel.writeValue(Boolean.valueOf(k));
        parcel.writeValue(Boolean.valueOf(n));
        parcel.writeParcelable(l, i1);
        parcel.writeString(m);
        parcel.writeString(o);
    }

}
