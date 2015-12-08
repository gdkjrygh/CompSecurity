// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.emilsjolander.components.stickylistheaders;

import android.content.Context;
import android.widget.Checkable;

// Referenced classes of package com.emilsjolander.components.stickylistheaders:
//            WrapperView

final class CheckableWrapperView extends WrapperView
    implements Checkable
{

    public CheckableWrapperView(Context context)
    {
        super(context);
    }

    public final boolean isChecked()
    {
        return ((Checkable)mItem).isChecked();
    }

    public final void setChecked(boolean flag)
    {
        ((Checkable)mItem).setChecked(flag);
    }

    public final void toggle()
    {
        boolean flag;
        if (!isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChecked(flag);
    }
}
