// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import rx.functions.Action1;

public interface IKeyboardButton
{

    public static final long VIBRATE_TIMEOUT = 5L;

    public abstract void setButtonId(Integer integer);

    public abstract void setClickAction(Action1 action1);
}
