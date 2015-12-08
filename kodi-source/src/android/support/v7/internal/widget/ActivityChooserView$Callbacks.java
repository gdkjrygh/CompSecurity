// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ActionProvider;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserView, ActivityChooserModel

private class ooserViewAdapter
    implements android.view.ChooserView.Callbacks, android.view.ChooserView.Callbacks, android.widget.r, android.widget.r
{

    final ActivityChooserView this$0;

    private void notifyOnDismissListener()
    {
        if (ActivityChooserView.access$1000(ActivityChooserView.this) != null)
        {
            ActivityChooserView.access$1000(ActivityChooserView.this).onDismiss();
        }
    }

    public void onClick(View view)
    {
        if (view == ActivityChooserView.access$700(ActivityChooserView.this))
        {
            dismissPopup();
            view = ActivityChooserView.access$000(ActivityChooserView.this).getDefaultActivity();
            int i = ActivityChooserView.access$000(ActivityChooserView.this).getDataModel().getActivityIndex(view);
            view = ActivityChooserView.access$000(ActivityChooserView.this).getDataModel().chooseActivity(i);
            if (view != null)
            {
                view.addFlags(0x80000);
                getContext().startActivity(view);
            }
            return;
        }
        if (view == ActivityChooserView.access$800(ActivityChooserView.this))
        {
            ActivityChooserView.access$602(ActivityChooserView.this, false);
            ActivityChooserView.access$500(ActivityChooserView.this, ActivityChooserView.access$900(ActivityChooserView.this));
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
        ActivityChooserView.access$500(ActivityChooserView.this, 0x7fffffff);
_L5:
        return;
_L2:
        dismissPopup();
        if (!ActivityChooserView.access$600(ActivityChooserView.this))
        {
            break; /* Loop/switch isn't completed */
        }
        if (i > 0)
        {
            ActivityChooserView.access$000(ActivityChooserView.this).getDataModel().setDefaultActivity(i);
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (!ActivityChooserView.access$000(ActivityChooserView.this).getShowDefaultActivity())
        {
            i++;
        }
        adapterview = ActivityChooserView.access$000(ActivityChooserView.this).getDataModel().chooseActivity(i);
        if (adapterview != null)
        {
            adapterview.addFlags(0x80000);
            getContext().startActivity(adapterview);
            return;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public boolean onLongClick(View view)
    {
        if (view == ActivityChooserView.access$700(ActivityChooserView.this))
        {
            if (ActivityChooserView.access$000(ActivityChooserView.this).getCount() > 0)
            {
                ActivityChooserView.access$602(ActivityChooserView.this, true);
                ActivityChooserView.access$500(ActivityChooserView.this, ActivityChooserView.access$900(ActivityChooserView.this));
            }
            return true;
        } else
        {
            throw new IllegalArgumentException();
        }
    }
}
