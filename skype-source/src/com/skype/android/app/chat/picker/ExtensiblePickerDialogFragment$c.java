// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.support.v4.view.s;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package com.skype.android.app.chat.picker:
//            ExtensiblePickerDialogFragment, AbstractPickerTab

private final class <init> extends s
{

    final ExtensiblePickerDialogFragment this$0;

    public final void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView(((AbstractPickerTab)obj).getContentView());
    }

    public final int getCount()
    {
        return ExtensiblePickerDialogFragment.access$400(ExtensiblePickerDialogFragment.this).size();
    }

    public final int getItemPosition(Object obj)
    {
        if (ExtensiblePickerDialogFragment.access$400(ExtensiblePickerDialogFragment.this).contains(obj))
        {
            return ExtensiblePickerDialogFragment.access$400(ExtensiblePickerDialogFragment.this).indexOf(obj);
        } else
        {
            return -2;
        }
    }

    public final Object instantiateItem(ViewGroup viewgroup, int i)
    {
        AbstractPickerTab abstractpickertab = (AbstractPickerTab)ExtensiblePickerDialogFragment.access$400(ExtensiblePickerDialogFragment.this).get(i);
        viewgroup.addView(abstractpickertab.getContentView());
        return abstractpickertab;
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        return ((AbstractPickerTab)obj).getContentView() == view;
    }

    private ()
    {
        this$0 = ExtensiblePickerDialogFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
