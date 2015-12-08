// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import com.actionbarsherlock.view.ActionProvider;

// Referenced classes of package com.actionbarsherlock.widget:
//            ActivityChooserView, ActivityChooserModel

private class <init>
    implements android.widget.r, android.view.ner, android.view.ner, android.widget.r
{

    final ActivityChooserView this$0;

    private void notifyOnDismissListener()
    {
        if (ActivityChooserView.access$9(ActivityChooserView.this) != null)
        {
            ActivityChooserView.access$9(ActivityChooserView.this).onDismiss();
        }
    }

    public void onClick(View view)
    {
        if (view == ActivityChooserView.access$5(ActivityChooserView.this))
        {
            dismissPopup();
            view = ActivityChooserView.access$0(ActivityChooserView.this).getDefaultActivity();
            int i = ActivityChooserView.access$0(ActivityChooserView.this).getDataModel().getActivityIndex(view);
            view = ActivityChooserView.access$0(ActivityChooserView.this).getDataModel().chooseActivity(i);
            if (view != null)
            {
                ActivityChooserView.access$4(ActivityChooserView.this).startActivity(view);
            }
            return;
        }
        if (view == ActivityChooserView.access$6(ActivityChooserView.this))
        {
            ActivityChooserView.access$7(ActivityChooserView.this, false);
            ActivityChooserView.access$2(ActivityChooserView.this, ActivityChooserView.access$8(ActivityChooserView.this));
            return;
        } else
        {
            throw new IllegalArgumentException();
        }
    }

    public void onDismiss()
    {
        notifyOnDismissListener();
        if (mProvider != null)
        {
            mProvider.subUiVisibilityChanged(false);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        ((ooserViewAdapter)adapterview.getAdapter()).getItemViewType(i);
        JVM INSTR tableswitch 0 1: default 32
    //                   0 50
    //                   1 40;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException();
_L3:
        ActivityChooserView.access$2(ActivityChooserView.this, 0x7fffffff);
_L5:
        return;
_L2:
        dismissPopup();
        if (!ActivityChooserView.access$3(ActivityChooserView.this))
        {
            break; /* Loop/switch isn't completed */
        }
        if (i > 0)
        {
            ActivityChooserView.access$0(ActivityChooserView.this).getDataModel().setDefaultActivity(i);
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (!ActivityChooserView.access$0(ActivityChooserView.this).getShowDefaultActivity())
        {
            i++;
        }
        adapterview = ActivityChooserView.access$0(ActivityChooserView.this).getDataModel().chooseActivity(i);
        if (adapterview != null)
        {
            ActivityChooserView.access$4(ActivityChooserView.this).startActivity(adapterview);
            return;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public boolean onLongClick(View view)
    {
        if (view == ActivityChooserView.access$5(ActivityChooserView.this))
        {
            if (ActivityChooserView.access$0(ActivityChooserView.this).getCount() > 0)
            {
                ActivityChooserView.access$7(ActivityChooserView.this, true);
                ActivityChooserView.access$2(ActivityChooserView.this, ActivityChooserView.access$8(ActivityChooserView.this));
            }
            return true;
        } else
        {
            throw new IllegalArgumentException();
        }
    }

    private ooserViewAdapter()
    {
        this$0 = ActivityChooserView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
