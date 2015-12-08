// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.widget.ImageButton;
import com.actionbarsherlock.internal.view.View_HasStateListenerSupport;
import com.actionbarsherlock.internal.view.View_OnAttachStateChangeListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            ActionMenuPresenter

private class setEnabled extends ImageButton
    implements setEnabled, View_HasStateListenerSupport
{

    private final Set mListeners = new HashSet();
    final ActionMenuPresenter this$0;

    public void addOnAttachStateChangeListener(View_OnAttachStateChangeListener view_onattachstatechangelistener)
    {
        mListeners.add(view_onattachstatechangelistener);
    }

    public boolean needsDividerAfter()
    {
        return false;
    }

    public boolean needsDividerBefore()
    {
        return false;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Iterator iterator = mListeners.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((View_OnAttachStateChangeListener)iterator.next()).onViewAttachedToWindow(this);
        } while (true);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Iterator iterator = mListeners.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                if (ActionMenuPresenter.access$0(ActionMenuPresenter.this) != null)
                {
                    ActionMenuPresenter.access$0(ActionMenuPresenter.this).ss();
                }
                return;
            }
            ((View_OnAttachStateChangeListener)iterator.next()).onViewDetachedFromWindow(this);
        } while (true);
    }

    public boolean performClick()
    {
        if (super.performClick())
        {
            return true;
        } else
        {
            playSoundEffect(0);
            showOverflowMenu();
            return true;
        }
    }

    public void removeOnAttachStateChangeListener(View_OnAttachStateChangeListener view_onattachstatechangelistener)
    {
        mListeners.remove(view_onattachstatechangelistener);
    }

    public (Context context)
    {
        this$0 = ActionMenuPresenter.this;
        super(context, null, com.actionbarsherlock.OverflowMenuButton.this._fld0);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
    }
}
