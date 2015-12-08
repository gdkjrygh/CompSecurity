// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.content;

import android.content.ContentProvider;
import roboguice.RoboGuice;
import roboguice.inject.RoboInjector;

public abstract class RoboContentProvider extends ContentProvider
{

    public RoboContentProvider()
    {
    }

    public boolean onCreate()
    {
        RoboGuice.getInjector(getContext()).injectMembers(this);
        return true;
    }
}
