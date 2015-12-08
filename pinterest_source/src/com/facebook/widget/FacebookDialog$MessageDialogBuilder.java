// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import java.util.EnumSet;
import java.util.List;

public class e extends e
{

    protected EnumSet getDialogFeatures()
    {
        return EnumSet.of(MESSAGE_DIALOG);
    }

    public MESSAGE_DIALOG setFriends(List list)
    {
        return this;
    }

    public volatile e setFriends(List list)
    {
        return setFriends(list);
    }

    public setFriends setPlace(String s)
    {
        return this;
    }

    public volatile e setPlace(String s)
    {
        return setPlace(s);
    }

    public e(Activity activity)
    {
        super(activity);
    }
}
