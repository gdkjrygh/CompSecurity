// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.os.AsyncTask;

public class CrashTest
{

    public CrashTest()
    {
    }

    public static void a(String s)
    {
        throw new RuntimeException(s);
    }

    // Unreferenced inner class com/crashlytics/android/core/CrashTest$1

/* anonymous class */
    class _cls1 extends AsyncTask
    {

        final long a;

        private transient Void a()
        {
            try
            {
                Thread.sleep(a);
            }
            catch (InterruptedException interruptedexception) { }
            CrashTest.a("Background thread crash");
            return null;
        }

        protected Object doInBackground(Object aobj[])
        {
            return a();
        }
    }

}
