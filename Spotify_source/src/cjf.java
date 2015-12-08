// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

public final class cjf
{

    // Unreferenced inner class cjf$1

/* anonymous class */
    final class _cls1 extends cjg
    {

        private Context a;
        private boolean b;

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


    // Unreferenced inner class cjf$2

/* anonymous class */
    final class _cls2 extends cjg
    {

        private Context a;
        private cjh b;

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
                b = cjh1;
                super((byte)0);
            }
    }


    // Unreferenced inner class cjf$3

/* anonymous class */
    final class _cls3 extends cjg
    {

        private Context a;
        private int b;

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


    // Unreferenced inner class cjf$4

/* anonymous class */
    final class _cls4 extends cjg
    {

        private Context a;
        private cjh b;

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
                b = cjh1;
                super((byte)0);
            }
    }

}
