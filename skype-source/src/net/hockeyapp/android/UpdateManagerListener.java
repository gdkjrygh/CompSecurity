// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;


// Referenced classes of package net.hockeyapp.android:
//            UpdateActivity, UpdateFragment

public abstract class UpdateManagerListener
{

    public UpdateManagerListener()
    {
    }

    public Class getUpdateActivityClass()
    {
        return net/hockeyapp/android/UpdateActivity;
    }

    public Class getUpdateFragmentClass()
    {
        return net/hockeyapp/android/UpdateFragment;
    }

    public void onNoUpdateAvailable()
    {
    }

    public void onUpdateAvailable()
    {
    }
}
