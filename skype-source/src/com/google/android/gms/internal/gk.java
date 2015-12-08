// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            gi

public final class gk
{
    private static abstract class a extends gi
    {

        public final void b()
        {
        }

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }

    public static interface b
    {

        public abstract void a(Bundle bundle);
    }


    // Unreferenced inner class com/google/android/gms/internal/gk$1

/* anonymous class */
    static final class _cls1 extends a
    {

        final Context a;
        final boolean b;

        public final void a()
        {
            android.content.SharedPreferences.Editor editor = a.getSharedPreferences("admob", 0).edit();
            editor.putBoolean("use_https", b);
            editor.apply();
        }

            
            {
                a = context;
                b = flag;
                super((byte)0);
            }
    }


    // Unreferenced inner class com/google/android/gms/internal/gk$2

/* anonymous class */
    static final class _cls2 extends a
    {

        final Context a;
        final b b;

        public final void a()
        {
            SharedPreferences sharedpreferences = a.getSharedPreferences("admob", 0);
            Bundle bundle = new Bundle();
            bundle.putBoolean("use_https", sharedpreferences.getBoolean("use_https", true));
            if (b != null)
            {
                b.a(bundle);
            }
        }

            
            {
                a = context;
                b = b1;
                super((byte)0);
            }
    }


    // Unreferenced inner class com/google/android/gms/internal/gk$3

/* anonymous class */
    static final class _cls3 extends a
    {

        final Context a;
        final int b;

        public final void a()
        {
            android.content.SharedPreferences.Editor editor = a.getSharedPreferences("admob", 0).edit();
            editor.putInt("webview_cache_version", b);
            editor.apply();
        }

            
            {
                a = context;
                b = i;
                super((byte)0);
            }
    }


    // Unreferenced inner class com/google/android/gms/internal/gk$4

/* anonymous class */
    static final class _cls4 extends a
    {

        final Context a;
        final b b;

        public final void a()
        {
            SharedPreferences sharedpreferences = a.getSharedPreferences("admob", 0);
            Bundle bundle = new Bundle();
            bundle.putInt("webview_cache_version", sharedpreferences.getInt("webview_cache_version", 0));
            if (b != null)
            {
                b.a(bundle);
            }
        }

            
            {
                a = context;
                b = b1;
                super((byte)0);
            }
    }

}
