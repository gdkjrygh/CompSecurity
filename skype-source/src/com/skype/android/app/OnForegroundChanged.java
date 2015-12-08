// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;


public class OnForegroundChanged
{

    private boolean foregrounded;

    public OnForegroundChanged(boolean flag)
    {
        foregrounded = flag;
    }

    public boolean isForegrounded()
    {
        return foregrounded;
    }
}
