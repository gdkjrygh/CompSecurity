// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;


// Referenced classes of package net.hockeyapp.android:
//            UpdateActivity

final class a
    implements Runnable
{

    private UpdateActivity a;

    public final void run()
    {
        a.showDialog(0);
    }

    (UpdateActivity updateactivity)
    {
        a = updateactivity;
        super();
    }
}
