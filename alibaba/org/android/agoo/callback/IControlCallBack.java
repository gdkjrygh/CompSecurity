// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo.callback;

import android.content.Context;
import android.content.Intent;

public interface IControlCallBack
{

    public abstract Class callAgooService();

    public abstract void callDeletedMessages(Context context, int i);

    public abstract void callError(Context context, String s);

    public abstract void callMessage(Context context, Intent intent);

    public abstract boolean callRecoverableError(Context context, String s);

    public abstract void callRegistered(Context context, String s);

    public abstract boolean callShouldProcessMessage(Context context, Intent intent);

    public abstract void callUnregistered(Context context, String s);

    public abstract void callUserCommand(Context context, Intent intent);

    public abstract void callUserHandleIntent(Context context, Intent intent);

    public abstract void callVote(Context context, long l);
}
