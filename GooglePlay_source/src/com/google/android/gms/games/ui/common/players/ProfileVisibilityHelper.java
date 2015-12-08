// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.players;


public interface ProfileVisibilityHelper
{
    public static interface ProfileVisibilityHelperProvider
    {

        public abstract ProfileVisibilityHelper getProfileVisibilityHelper();
    }


    public abstract boolean isProfileVisibilityPublic();

    public abstract void setProfileVisibility(boolean flag);
}
