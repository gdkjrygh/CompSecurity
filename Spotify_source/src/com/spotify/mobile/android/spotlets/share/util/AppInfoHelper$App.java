// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.util;


public final class mNameStringResId extends Enum
{

    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j h;
    public static final j i;
    public static final j j;
    private static final j k[];
    public int mId;
    public int mNameStringResId;
    public String mPackageNameSpace;

    public static mNameStringResId valueOf(String s)
    {
        return (mNameStringResId)Enum.valueOf(com/spotify/mobile/android/spotlets/share/util/AppInfoHelper$App, s);
    }

    public static mNameStringResId[] values()
    {
        return (mNameStringResId[])k.clone();
    }

    static 
    {
        a = new <init>("FACEBOOK", 0, 0x7f11010b, "com.facebook.katana", 0x7f0804b7);
        b = new <init>("FACEBOOK_MESSENGER", 1, 0x7f11010c, "com.facebook.orca", 0x7f0804b8);
        c = new <init>("GENERIC_EMAIL", 2, 0x7f11010d, "com.android.email", 0x7f0804b9);
        d = new <init>("GENERIC_MMS", 3, 0x7f11010e, "com.android.mms", 0x7f0804ba);
        e = new <init>("GENERIC_SMS", 4, 0x7f11010f, "com.android.sms", 0x7f0804bb);
        f = new <init>("GOOGLE_DOCS", 5, 0x7f110110, "com.google.android.apps.docs", 0x7f0804bc);
        g = new <init>("GOOGLE_HANGOUTS", 6, 0x7f110111, "com.google.android.talk", 0x7f0804bd);
        h = new <init>("TUMBLR", 7, 0x7f110112, "com.tumblr", 0x7f0804be);
        i = new <init>("TWITTER", 8, 0x7f110113, "com.twitter.android", 0x7f0804bf);
        j = new <init>("WHATS_APP", 9, 0x7f110114, "com.whatsapp", 0x7f0804c0);
        k = (new k[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }

    private (String s, int l, int i1, String s1, int j1)
    {
        super(s, l);
        mId = i1;
        mPackageNameSpace = s1;
        mNameStringResId = j1;
    }
}
