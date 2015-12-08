// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import android.content.Context;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.android.paste.graphics.SpotifyIcon;
import dky;
import gcw;
import gen;

public class ConnectDevice
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ConnectDevice(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i1)
        {
            return new ConnectDevice[i1];
        }

    };
    public static final String a[] = {
        "_id", "name", "is_active", "is_self", "is_connecting", "is_enabled", "is_volume_capable", "is_zeroconf", "is_dial", "device_hash", 
        "secondary_device_hash", "is_being_activated", "type", "is_license_compatible", "attach_id", "is_attached", "device_state", "brand", "model", "is_newly_discovered"
    };
    public String b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public DeviceType l;
    public String m;
    public boolean n;
    public DeviceState o;
    public String p;
    public boolean q;
    public SpotifyIcon r;
    private boolean s;
    private boolean t;
    private boolean u;
    private String v;

    protected ConnectDevice()
    {
    }

    private ConnectDevice(Parcel parcel)
    {
        Object obj1 = null;
        super();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = gen.a(parcel);
        f = gen.a(parcel);
        g = gen.a(parcel);
        s = gen.a(parcel);
        h = gen.a(parcel);
        i = gen.a(parcel);
        j = gen.a(parcel);
        k = gen.a(parcel);
        int i1 = parcel.readInt();
        Object obj;
        if (i1 == -1)
        {
            obj = null;
        } else
        {
            obj = DeviceType.values()[i1];
        }
        l = ((DeviceType) (obj));
        t = gen.a(parcel);
        u = gen.a(parcel);
        m = parcel.readString();
        n = gen.a(parcel);
        i1 = parcel.readInt();
        if (i1 == -1)
        {
            obj = obj1;
        } else
        {
            obj = DeviceState.values()[i1];
        }
        o = ((DeviceState) (obj));
        p = parcel.readString();
        v = parcel.readString();
        q = gen.a(parcel);
        r = SpotifyIcon.values()[parcel.readInt()];
    }

    ConnectDevice(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public static ConnectDevice a(Cursor cursor, Context context, String s1, dky dky1)
    {
        Object obj = null;
        ConnectDevice connectdevice = new ConnectDevice();
        connectdevice.b = gcw.a(cursor, 9, "");
        connectdevice.c = gcw.a(cursor, 10, "");
        connectdevice.d = gcw.a(cursor, 1, context.getString(0x7f0801c4));
        connectdevice.e = gcw.a(cursor, 2);
        connectdevice.f = gcw.a(cursor, 3);
        connectdevice.g = gcw.a(cursor, 5);
        connectdevice.s = gcw.a(cursor, 4);
        connectdevice.h = gcw.a(cursor, 6);
        connectdevice.i = gcw.a(cursor, 7);
        connectdevice.j = gcw.a(cursor, 8);
        connectdevice.k = gcw.a(cursor, 11);
        int i1 = cursor.getInt(12);
        context = DeviceType.values();
        final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[DeviceType.values().length];
                try
                {
                    a[DeviceType.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[DeviceType.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[DeviceType.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[DeviceType.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[DeviceType.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[DeviceType.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[DeviceType.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[DeviceType.h.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[DeviceType.i.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[DeviceType.j.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[DeviceType.k.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[DeviceType.l.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (i1 >= 0 && i1 < context.length)
        {
            connectdevice.l = context[i1];
        } else
        {
            connectdevice.l = DeviceType.a;
        }
        connectdevice.u = gcw.a(cursor, 13);
        connectdevice.m = gcw.a(cursor, 14, "");
        connectdevice.n = gcw.a(cursor, 15);
        i1 = cursor.getInt(16);
        context = DeviceState.values();
        if (i1 >= 0 && i1 < context.length)
        {
            connectdevice.o = context[i1];
        } else
        {
            connectdevice.o = null;
        }
        connectdevice.p = gcw.a(cursor, 17, "");
        connectdevice.v = gcw.a(cursor, 18, "");
        connectdevice.q = gcw.a(cursor, 19);
        context = obj;
        if (dky1 != null)
        {
            context = dky1.b(connectdevice);
        }
        cursor = context;
        if (context != null) goto _L2; else goto _L1
_L1:
        cursor = connectdevice.l;
        _cls2.a[cursor.ordinal()];
        JVM INSTR tableswitch 1 12: default 380
    //                   1 424
    //                   2 431
    //                   3 438
    //                   4 445
    //                   5 452
    //                   6 459
    //                   7 466
    //                   8 473
    //                   9 480
    //                   10 487
    //                   11 494
    //                   12 501;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L3:
        cursor = SpotifyIcon.bv;
_L2:
        connectdevice.r = cursor;
        connectdevice.t = connectdevice.a(s1);
        return connectdevice;
_L4:
        cursor = SpotifyIcon.bv;
        continue; /* Loop/switch isn't completed */
_L5:
        cursor = SpotifyIcon.bu;
        continue; /* Loop/switch isn't completed */
_L6:
        cursor = SpotifyIcon.by;
        continue; /* Loop/switch isn't completed */
_L7:
        cursor = SpotifyIcon.bx;
        continue; /* Loop/switch isn't completed */
_L8:
        cursor = SpotifyIcon.bv;
        continue; /* Loop/switch isn't completed */
_L9:
        cursor = SpotifyIcon.bA;
        continue; /* Loop/switch isn't completed */
_L10:
        cursor = SpotifyIcon.bz;
        continue; /* Loop/switch isn't completed */
_L11:
        cursor = SpotifyIcon.bA;
        continue; /* Loop/switch isn't completed */
_L12:
        cursor = SpotifyIcon.bv;
        continue; /* Loop/switch isn't completed */
_L13:
        cursor = SpotifyIcon.bb;
        continue; /* Loop/switch isn't completed */
_L14:
        cursor = SpotifyIcon.bA;
        continue; /* Loop/switch isn't completed */
_L15:
        cursor = SpotifyIcon.bv;
        if (true) goto _L2; else goto _L16
_L16:
    }

    public final boolean a(String s1)
    {
        return s1 != null && (b.equals(s1) || c.equals(s1));
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof ConnectDevice) && b.equals(((ConnectDevice)obj).b);
    }

    public int hashCode()
    {
        return b.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        byte byte0 = -1;
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        gen.a(parcel, e);
        gen.a(parcel, f);
        gen.a(parcel, g);
        gen.a(parcel, s);
        gen.a(parcel, h);
        gen.a(parcel, i);
        gen.a(parcel, j);
        gen.a(parcel, k);
        if (l == null)
        {
            i1 = -1;
        } else
        {
            i1 = l.ordinal();
        }
        parcel.writeInt(i1);
        gen.a(parcel, t);
        gen.a(parcel, u);
        parcel.writeString(m);
        gen.a(parcel, n);
        if (o == null)
        {
            i1 = byte0;
        } else
        {
            i1 = o.ordinal();
        }
        parcel.writeInt(i1);
        parcel.writeString(p);
        parcel.writeString(v);
        gen.a(parcel, q);
        parcel.writeInt(r.ordinal());
    }


    private class DeviceType extends Enum
    {

        public static final DeviceType a;
        public static final DeviceType b;
        public static final DeviceType c;
        public static final DeviceType d;
        public static final DeviceType e;
        public static final DeviceType f;
        public static final DeviceType g;
        public static final DeviceType h;
        public static final DeviceType i;
        public static final DeviceType j;
        public static final DeviceType k;
        public static final DeviceType l;
        private static final DeviceType m[];

        public static DeviceType valueOf(String s1)
        {
            return (DeviceType)Enum.valueOf(com/spotify/mobile/android/service/ConnectDevice$DeviceType, s1);
        }

        public static DeviceType[] values()
        {
            return (DeviceType[])m.clone();
        }

        static 
        {
            a = new DeviceType("UNKNOWN", 0);
            b = new DeviceType("COMPUTER", 1);
            c = new DeviceType("TABLET", 2);
            d = new DeviceType("SMARTPHONE", 3);
            e = new DeviceType("SPEAKER", 4);
            f = new DeviceType("TV", 5);
            g = new DeviceType("AVR", 6);
            h = new DeviceType("STB", 7);
            i = new DeviceType("AUDIO_DONGLE", 8);
            j = new DeviceType("GAME_CONSOLE", 9);
            k = new DeviceType("CAST_VIDEO", 10);
            l = new DeviceType("CAST_AUDIO", 11);
            m = (new DeviceType[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l
            });
        }

        private DeviceType(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class DeviceState extends Enum
    {

        public static final DeviceState a;
        public static final DeviceState b;
        public static final DeviceState c;
        public static final DeviceState d;
        public static final DeviceState e;
        public static final DeviceState f;
        private static DeviceState g;
        private static DeviceState h;
        private static final DeviceState i[];

        public static DeviceState valueOf(String s1)
        {
            return (DeviceState)Enum.valueOf(com/spotify/mobile/android/service/ConnectDevice$DeviceState, s1);
        }

        public static DeviceState[] values()
        {
            return (DeviceState[])i.clone();
        }

        static 
        {
            a = new DeviceState("CONNECTING", 0);
            b = new DeviceState("INCOMPATIBLE", 1);
            c = new DeviceState("UNAVAILABLE", 2);
            g = new DeviceState("LOGGED_IN", 3);
            d = new DeviceState("NOT_LOGGED_IN", 4);
            e = new DeviceState("PREMIUM_REQUIRED", 5);
            h = new DeviceState("NOT_INSTALLED", 6);
            f = new DeviceState("UNSUPPORTED_URI", 7);
            i = (new DeviceState[] {
                a, b, c, g, d, e, h, f
            });
        }

        private DeviceState(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
