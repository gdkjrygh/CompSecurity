// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;


public class OnCallScreenForegroundChanged
{

    private boolean foregrounded;

    public OnCallScreenForegroundChanged(boolean flag)
    {
        foregrounded = flag;
    }

    public boolean isForegrounded()
    {
        return foregrounded;
    }
}
