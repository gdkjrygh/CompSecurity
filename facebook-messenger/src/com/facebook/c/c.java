// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c;

import android.os.Bundle;

public interface c
{

    public abstract void abortBroadcast();

    public abstract int getResultCode();

    public abstract String getResultData();

    public abstract Bundle getResultExtras(boolean flag);

    public abstract void setResult(int i, String s, Bundle bundle);

    public abstract void setResultCode(int i);

    public abstract void setResultData(String s);

    public abstract void setResultExtras(Bundle bundle);
}
