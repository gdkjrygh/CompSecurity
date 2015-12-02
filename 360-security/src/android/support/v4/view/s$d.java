// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            s, v

static class  extends 
{

    long a()
    {
        return v.a();
    }

    public void a(View view, int i, Paint paint)
    {
        v.a(view, i, paint);
    }

    public void a(View view, Paint paint)
    {
        a(view, d(view), paint);
        view.invalidate();
    }

    public int d(View view)
    {
        return v.a(view);
    }

    ()
    {
    }
}
