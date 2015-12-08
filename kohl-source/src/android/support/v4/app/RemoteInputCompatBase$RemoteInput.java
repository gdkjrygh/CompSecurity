// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            RemoteInputCompatBase

public static abstract class Factory
{
    public static interface Factory
    {

        public abstract RemoteInputCompatBase.RemoteInput build(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle);

        public abstract RemoteInputCompatBase.RemoteInput[] newArray(int i);
    }


    protected abstract boolean getAllowFreeFormInput();

    protected abstract CharSequence[] getChoices();

    protected abstract Bundle getExtras();

    protected abstract CharSequence getLabel();

    protected abstract String getResultKey();

    public Factory()
    {
    }
}
