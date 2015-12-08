// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v7.internal.widget:
//            AppCompatPopupWindow

static final class val.originalListener
    implements android.view.llChangedListener
{

    final Field val$fieldAnchor;
    final android.view.llChangedListener val$originalListener;
    final PopupWindow val$popup;

    public void onScrollChanged()
    {
        WeakReference weakreference = (WeakReference)val$fieldAnchor.get(val$popup);
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
            val$originalListener.onScrollChanged();
            return;
        }
        catch (IllegalAccessException illegalaccessexception) { }
    }

    (Field field, PopupWindow popupwindow, android.view.llChangedListener llchangedlistener)
    {
        val$fieldAnchor = field;
        val$popup = popupwindow;
        val$originalListener = llchangedlistener;
        super();
    }
}
