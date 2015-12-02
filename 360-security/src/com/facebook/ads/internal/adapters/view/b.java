// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.ads.InterstitialAdActivity;

// Referenced classes of package com.facebook.ads.internal.adapters.view:
//            a

public interface com.facebook.ads.internal.adapters.view.b
{
    public static interface a
    {

        public abstract void a(View view);

        public abstract void a(String s);
    }

    public static final class b extends Enum
    {

        public static final b a;
        private static final b b[];

        public static com.facebook.ads.internal.adapters.view.b a(b b1, InterstitialAdActivity interstitialadactivity, a a1)
        {
            static class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[b.values().length];
                    try
                    {
                        a[b.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror) { }
                }
            }

            switch (_cls1.a[b1.ordinal()])
            {
            default:
                return null;

            case 1: // '\001'
                return new com.facebook.ads.internal.adapters.view.a(interstitialadactivity, a1);
            }
        }

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/facebook/ads/internal/adapters/view/b$b, s);
        }

        public static b[] values()
        {
            return (b[])b.clone();
        }

        static 
        {
            a = new b("DISPLAY", 0);
            b = (new b[] {
                a
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void a();

    public abstract void a(Intent intent, Bundle bundle);

    public abstract void a(Bundle bundle);

    public abstract void b();

    public abstract void c();
}
