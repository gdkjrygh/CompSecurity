// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.FitbitMobile;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.fitbit.e.a;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Locale;
import java.util.UUID;

public class GCMNotification
    implements Parcelable
{
    public static final class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        public static final Type c;
        public static final Type d;
        public static final Type e;
        public static final Type f;
        public static final Type g;
        public static final Type h;
        private static final EnumSet i;
        private static final Type j[];
        private boolean requiresProfile;

        public static Type a(String s)
        {
            if (s == null)
            {
                return a;
            }
            if (s.contains("friend/invite/"))
            {
                return c;
            }
            if (s.contains("friend/message/"))
            {
                return d;
            }
            if (s.contains("corporate/"))
            {
                return e;
            }
            if (s.matches("challenge/[a-zA-Z0-9]*/invite"))
            {
                return f;
            }
            if (s.matches("challenge/[a-zA-Z0-9]*/message") || s.matches("challenge/[a-zA-Z0-9]*/cheer/[a-zA-Z0-9]*"))
            {
                return g;
            }
            if (s.contains("badge/"))
            {
                return h;
            }
            Type type = a;
            try
            {
                s = valueOf(s.toUpperCase(Locale.US));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return b;
            }
            return s;
        }

        public static Collection a()
        {
            return Collections.unmodifiableSet(i);
        }

        static boolean a(Type type)
        {
            return type.requiresProfile;
        }

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/fitbit/FitbitMobile/GCMNotification$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])j.clone();
        }

        public boolean b()
        {
            return i.contains(this);
        }

        static 
        {
            a = new Type("GOAL_RELATED", 0, true);
            b = new Type("UNKNOWN", 1, true);
            c = new Type("FRIEND_INVITE", 2, true);
            d = new Type("FRIEND_MESSAGE", 3, true);
            e = new Type("CORPORATE", 4, true);
            f = new Type("CHALLENGE_INVITE", 5, true);
            g = new Type("CHALLENGE_MESSAGE", 6, true);
            h = new Type("NEW_BADGE", 7, true);
            j = (new Type[] {
                a, b, c, d, e, f, g, h
            });
            i = EnumSet.of(d, e, c, f, g);
        }

        private Type(String s, int i1, boolean flag)
        {
            super(s, i1);
            requiresProfile = flag;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final String a = "friend/invite/";
    private static final String b = "challenge/[a-zA-Z0-9]*/invite";
    private static final String c = "challenge/[a-zA-Z0-9]*/message";
    private static final String d = "challenge/[a-zA-Z0-9]*/cheer/[a-zA-Z0-9]*";
    private static final String e = "friend/message/";
    private static final String f = "corporate/";
    private static final String g = "badge/";
    private Type h;
    private String i;
    private int j;
    private String k;
    private String l;

    private GCMNotification(Type type, String s, String s1)
    {
        h = type;
        i = s1;
        j = UUID.randomUUID().hashCode();
        k = s;
    }

    GCMNotification(Type type, String s, String s1, _cls1 _pcls1)
    {
        this(type, s, s1);
    }

    static int a(GCMNotification gcmnotification, int i1)
    {
        gcmnotification.j = i1;
        return i1;
    }

    public static GCMNotification a(String s, String s1)
    {
        Type type = com.fitbit.FitbitMobile.Type.a(s);
        s1 = new GCMNotification(type, a(s, type), s1);
        if (type == Type.g)
        {
            s1.a(b(s, type));
        }
        return s1;
    }

    static String a(GCMNotification gcmnotification, String s)
    {
        gcmnotification.l = s;
        return s;
    }

    private static String a(String s, Type type)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
    /* anonymous class not found */
    class _anm2 {}

        com.fitbit.FitbitMobile._cls2.a[type.ordinal()];
        JVM INSTR tableswitch 1 6: default 52
    //                   1 54
    //                   2 72
    //                   3 86
    //                   4 100
    //                   5 100
    //                   6 120;
           goto _L2 _L3 _L4 _L5 _L6 _L6 _L7
_L2:
        return null;
_L3:
        int i1;
        int j1;
        j1 = "friend/invite/".length();
        i1 = s.length();
_L9:
        return s.substring(j1, i1);
_L4:
        j1 = "friend/message/".length();
        i1 = s.length();
        continue; /* Loop/switch isn't completed */
_L5:
        j1 = "corporate/".length();
        i1 = s.length();
        continue; /* Loop/switch isn't completed */
_L6:
        j1 = s.indexOf("/") + 1;
        i1 = s.indexOf("/", j1);
        continue; /* Loop/switch isn't completed */
_L7:
        j1 = s.indexOf("/") + 1;
        i1 = s.length();
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static String b(String s, Type type)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        com.fitbit.FitbitMobile._cls2.a[type.ordinal()];
        JVM INSTR tableswitch 5 5: default 32
    //                   5 34;
           goto _L2 _L3
_L2:
        return null;
_L3:
        if ((s = s.split("/")) != null && s.length == 4)
        {
            return s[3];
        }
        if (true) goto _L2; else goto _L4
_L4:
    }

    public PendingIntent a(Context context)
    {
        Intent intent = new Intent("com.fitbit.FitbitMobile.NotificationBroadcastReceiver.ACTION");
        intent.setPackage(context.getPackageName());
        intent.putExtra("com.fitbit.FitbitMobile.GCMIntentService.GCM_NOTIFICATION_KEY", this);
        context = PendingIntent.getBroadcast(context, j, intent, 0);
        com.fitbit.e.a.a("GCMNotification", String.format("Pending Intent for %s", new Object[] {
            intent
        }), new Object[0]);
        return context;
    }

    public Type a()
    {
        return h;
    }

    public void a(String s)
    {
        l = s;
    }

    public String b()
    {
        return i;
    }

    public boolean c()
    {
        return com.fitbit.FitbitMobile.Type.a(h);
    }

    public int d()
    {
        return j;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return k;
    }

    public long f()
    {
        long l1 = 0L;
        try
        {
            if (k != null)
            {
                l1 = Long.valueOf(k).longValue();
            }
        }
        catch (NumberFormatException numberformatexception)
        {
            return 0L;
        }
        return l1;
    }

    public String g()
    {
        return l;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeInt(h.ordinal());
        parcel.writeString(i);
        parcel.writeInt(j);
        parcel.writeString(k);
        parcel.writeValue(l);
    }


    /* member class not found */
    class _cls1 {}

}
