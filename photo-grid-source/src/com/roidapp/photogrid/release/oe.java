// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

// Referenced classes of package com.roidapp.photogrid.release:
//            oa

final class oe
    implements android.view.ViewTreeObserver.OnScrollChangedListener
{

    final Field a;
    final android.view.ViewTreeObserver.OnScrollChangedListener b;
    final oa c;

    oe(oa oa1, Field field, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        c = oa1;
        a = field;
        b = onscrollchangedlistener;
        super();
    }

    public final void onScrollChanged()
    {
        WeakReference weakreference = (WeakReference)a.get(c.a);
        if (weakreference == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (weakreference.get() == null)
        {
            return;
        }
        try
        {
            b.onScrollChanged();
            return;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            illegalaccessexception.printStackTrace();
        }
    }
}
