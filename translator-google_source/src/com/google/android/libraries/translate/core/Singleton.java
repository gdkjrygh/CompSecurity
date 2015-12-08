// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import android.content.Context;
import com.google.android.libraries.translate.logging.e;

// Referenced classes of package com.google.android.libraries.translate.core:
//            c, d, e, f, 
//            g, h, i, k

public final class Singleton
{

    public static final k a = new c();
    public static final k b = new d();
    public static final k c = new com.google.android.libraries.translate.core.e();
    public static final k d = new f();
    public static final k e = new g();
    public static final k f = new h();
    private static Context g;
    private static e h;
    private static String i;
    private static String j;

    public static Context a()
    {
        return g;
    }

    public static void a(Context context, e e1, TranslateClientId translateclientid)
    {
        g = context;
        h = e1;
        switch (i.a[translateclientid.ordinal()])
        {
        default:
            context = String.valueOf(i);
            if (context.length() != 0)
            {
                context = "Unknown clientID: ".concat(context);
            } else
            {
                context = new String("Unknown clientID: ");
            }
            throw new IllegalArgumentException(context);

        case 1: // '\001'
        case 2: // '\002'
            i = "at";
            j = "AndroidTranslate";
            return;

        case 3: // '\003'
            i = "aw";
            j = "AndroidWearableTranslate";
            return;
        }
    }

    public static e b()
    {
        return h;
    }

    public static String c()
    {
        return i;
    }

    public static String d()
    {
        return j;
    }


    private class TranslateClientId extends Enum
    {

        public static final TranslateClientId GLASS_SPEECH_ANDROID_TRANSLATE;
        public static final TranslateClientId PHONE_ANDROID_TRANSLATE;
        public static final TranslateClientId WEARABLE_ANDROID_TRANSLATE;
        private static final TranslateClientId a[];

        public static TranslateClientId valueOf(String s)
        {
            return (TranslateClientId)Enum.valueOf(com/google/android/libraries/translate/core/Singleton$TranslateClientId, s);
        }

        public static TranslateClientId[] values()
        {
            return (TranslateClientId[])a.clone();
        }

        static 
        {
            PHONE_ANDROID_TRANSLATE = new TranslateClientId("PHONE_ANDROID_TRANSLATE", 0);
            WEARABLE_ANDROID_TRANSLATE = new TranslateClientId("WEARABLE_ANDROID_TRANSLATE", 1);
            GLASS_SPEECH_ANDROID_TRANSLATE = new TranslateClientId("GLASS_SPEECH_ANDROID_TRANSLATE", 2);
            a = (new TranslateClientId[] {
                PHONE_ANDROID_TRANSLATE, WEARABLE_ANDROID_TRANSLATE, GLASS_SPEECH_ANDROID_TRANSLATE
            });
        }

        private TranslateClientId(String s, int k)
        {
            super(s, k);
        }
    }

}
