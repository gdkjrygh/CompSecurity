// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.fitbit.e.a;
import com.fitbit.galileo.GalileoTrackerType;
import java.util.ArrayList;
import java.util.List;

public final class TrackerAuthCredentials
    implements Parcelable
{
    public static final class Cipher extends Enum
    {

        public static final Cipher a;
        public static final Cipher b;
        private static final Cipher c[];

        public static Cipher a(GalileoTrackerType galileotrackertype)
        {
            com.fitbit.e.a.d("Cipher", String.format("Determining Cipher for %s", new Object[] {
                galileotrackertype.name()
            }), new Object[0]);
        /* anonymous class not found */
        class _anm2 {}

            switch (com.fitbit.livedata.auth._cls2.a[galileotrackertype.ordinal()])
            {
            default:
                return b;

            case 1: // '\001'
                return a;
            }
        }

        public static Cipher valueOf(String s)
        {
            return (Cipher)Enum.valueOf(com/fitbit/livedata/auth/TrackerAuthCredentials$Cipher, s);
        }

        public static Cipher[] values()
        {
            return (Cipher[])c.clone();
        }

        static 
        {
            a = new Cipher("AES", 0);
            b = new Cipher("XTEA", 1);
            c = (new Cipher[] {
                a, b
            });
        }

        private Cipher(String s, int i)
        {
            super(s, i);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final String a;
    private final String b;
    private final Cipher c;
    private byte d[];
    private int e;

    TrackerAuthCredentials(Cipher cipher, String s, String s1)
    {
        c = cipher;
        a = s;
        b = s1;
        e();
    }

    static int a(TrackerAuthCredentials trackerauthcredentials, int i)
    {
        trackerauthcredentials.e = i;
        return i;
    }

    static byte[] a(TrackerAuthCredentials trackerauthcredentials, byte abyte0[])
    {
        trackerauthcredentials.d = abyte0;
        return abyte0;
    }

    private void e()
    {
        boolean flag = false;
        if (!a())
        {
            return;
        }
        ArrayList arraylist = new ArrayList();
        char ac[] = new char[2];
        char[] _tmp = ac;
        ac[0] = '0';
        ac[1] = '0';
        for (int i = 0; i < a.length() / 2; i++)
        {
            ac[0] = a.charAt(i * 2);
            ac[1] = a.charAt(i * 2 + 1);
            arraylist.add(Byte.valueOf((byte)Integer.decode(String.format("0x%c%c", new Object[] {
                Character.valueOf(ac[0]), Character.valueOf(ac[1])
            })).intValue()));
        }

        d = new byte[arraylist.size()];
        for (int j = ((flag) ? 1 : 0); j < arraylist.size(); j++)
        {
            d[j] = ((Byte)arraylist.get(j)).byteValue();
        }

        e = Integer.parseInt(b);
    }

    public boolean a()
    {
        return a != null && a.length() != 0 && b != null && b.length() != 0;
    }

    public int b()
    {
        return e;
    }

    public byte[] c()
    {
        return d;
    }

    public Cipher d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("[").append(a).append(", ").append(b).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeInt(c.ordinal());
        parcel.writeByteArray(d);
        parcel.writeInt(e);
    }


    /* member class not found */
    class _cls1 {}

}
