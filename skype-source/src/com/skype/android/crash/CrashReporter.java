// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.crash;

import android.app.Activity;

public interface CrashReporter
{

    public static final CrashReporter a = new CrashReporter() {

        public final void a()
        {
        }

        public final void a(Activity activity)
        {
        }

    };

    public abstract void a();

    public abstract void a(Activity activity);

}
