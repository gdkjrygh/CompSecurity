// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

final class RemoteInputCompatBase
{
    public static abstract class RemoteInput
    {

        protected abstract String a();

        protected abstract CharSequence b();

        protected abstract CharSequence[] c();

        protected abstract boolean d();

        protected abstract Bundle e();

        public RemoteInput()
        {
        }
    }

    public static interface RemoteInput.Factory
    {

        public abstract RemoteInput build(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle);

        public abstract RemoteInput[] newArray(int i);
    }

}
