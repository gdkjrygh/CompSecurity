// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v7.internal.widget:
//            e

static final class c
    implements android.view.TreeObserver.OnScrollChangedListener
{

    final Field a;
    final PopupWindow b;
    final android.view.TreeObserver.OnScrollChangedListener c;

    public final void onScrollChanged()
    {
        WeakReference weakreference = (WeakReference)a.get(b);
        if (weakreference == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (weakreference.get() == null)
        {
            return;
        }
        try
        {
            c.onScrollChanged();
            return;
        }
        catch (IllegalAccessException illegalaccessexception) { }
    }

    edListener(Field field, PopupWindow popupwindow, android.view.TreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        a = field;
        b = popupwindow;
        c = onscrollchangedlistener;
        super();
    }
}
