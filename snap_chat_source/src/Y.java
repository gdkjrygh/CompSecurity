// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public abstract class Y
{
    public static interface a
    {

        public abstract ap onCreateLoader(int i, Bundle bundle);

        public abstract void onLoadFinished(ap ap, Object obj);

        public abstract void onLoaderReset(ap ap);
    }


    public Y()
    {
    }

    public abstract ap a(int i, a a1);

    public abstract void a(int i);

    public boolean a()
    {
        return false;
    }

    public abstract ap b(int i);

    public abstract ap b(int i, a a1);
}
