// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;


// Referenced classes of package net.hockeyapp.android:
//            UpdateActivity

class a
    implements Runnable
{

    final UpdateActivity a;

    public void run()
    {
        a.showDialog(0);
    }

    (UpdateActivity updateactivity)
    {
        a = updateactivity;
        super();
    }
}
