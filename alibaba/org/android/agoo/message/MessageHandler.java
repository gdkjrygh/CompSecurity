// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo.message;

import android.os.Bundle;

public interface MessageHandler
{

    public abstract void onHandleError(String s);

    public abstract void onHandleMessage(String s, Bundle bundle);
}
