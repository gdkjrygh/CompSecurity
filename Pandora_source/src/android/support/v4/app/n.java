// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.i;

// Referenced classes of package android.support.v4.app:
//            o

public abstract class n
{
    public static interface a
    {

        public abstract i onCreateLoader(int i, Bundle bundle);

        public abstract void onLoadFinished(i i, Object obj);

        public abstract void onLoaderReset(i i);
    }


    public n()
    {
    }

    public static void a(boolean flag)
    {
        o.a = flag;
    }

    public abstract i a(int i, Bundle bundle, a a1);

    public abstract void a(int i);

    public boolean a()
    {
        return false;
    }

    public abstract i b(int i);

    public abstract i b(int i, Bundle bundle, a a1);
}
