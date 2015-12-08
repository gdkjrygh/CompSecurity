// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.jni.crashreporter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import b;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import ndx;

public final class NativeCrashReporterActivity extends Activity
{

    public NativeCrashReporterActivity()
    {
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        String s = getIntent().getStringExtra("runnableName");
        bundle = getIntent().getSerializableExtra("runnableArgs");
        if (bundle != null)
        {
            bundle = (HashMap)bundle;
        } else
        {
            bundle = null;
        }
        if (s != null)
        {
            try
            {
                ((Runnable)Class.forName(s).getDeclaredConstructor(new Class[] {
                    java/util/Map
                }).newInstance(new Object[] {
                    bundle
                })).run();
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                bundle = String.valueOf(s);
                if (bundle.length() != 0)
                {
                    bundle = "Failed to find class: ".concat(bundle);
                } else
                {
                    bundle = new String("Failed to find class: ");
                }
                Log.e("NativeCrashReporterActivity", bundle, classnotfoundexception);
            }
            catch (InstantiationException instantiationexception)
            {
                bundle = String.valueOf(s);
                if (bundle.length() != 0)
                {
                    bundle = "Failed to instantiate class: ".concat(bundle);
                } else
                {
                    bundle = new String("Failed to instantiate class: ");
                }
                Log.e("NativeCrashReporterActivity", bundle, instantiationexception);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                Log.e("NativeCrashReporterActivity", "Failed to find constructor that takes a Map<String,String> as argument", bundle);
            }
            catch (Exception exception)
            {
                bundle = String.valueOf(s);
                if (bundle.length() != 0)
                {
                    bundle = "Failed to execute runnable: ".concat(bundle);
                } else
                {
                    bundle = new String("Failed to execute runnable: ");
                }
                Log.e("NativeCrashReporterActivity", bundle, exception);
            }
        }
        b.a(new ndx(this, getIntent().getStringExtra("description")), 3000L);
    }
}
