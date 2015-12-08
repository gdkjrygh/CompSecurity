// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.social.jni.crashreporter.NativeCrashReporterActivity;

public final class ndx
    implements Runnable
{

    private String a;

    public ndx(NativeCrashReporterActivity nativecrashreporteractivity, String s)
    {
        a = s;
        super();
    }

    public final void run()
    {
        throw new ndw(a);
    }
}
