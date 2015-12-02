// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            aj, a

class ae
    implements aj
{

    ae()
    {
    }

    public int a(View view)
    {
        return 2;
    }

    long a()
    {
        return 10L;
    }

    public void a(View view, a a1)
    {
    }

    public void a(View view, Runnable runnable)
    {
        view.postDelayed(runnable, a());
    }

    public boolean a(View view, int i)
    {
        return false;
    }

    public void b(View view)
    {
        view.postInvalidateDelayed(a());
    }

    public void b(View view, int i)
    {
    }

    public int c(View view)
    {
        return 0;
    }
}
