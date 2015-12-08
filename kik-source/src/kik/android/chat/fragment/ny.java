// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            KikPreferenceLaunchpad

final class ny
    implements Runnable
{

    final KikPreferenceLaunchpad a;

    ny(KikPreferenceLaunchpad kikpreferencelaunchpad)
    {
        a = kikpreferencelaunchpad;
        super();
    }

    public final void run()
    {
        a.a();
    }
}
