// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class PlaySearchEditText extends EditText
{

    public PlaySearchEditText(Context context)
    {
        super(context);
    }

    public PlaySearchEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setCustomSelectionActionModeCallback(new android.view.ActionMode.Callback() {

                final PlaySearchEditText this$0;

                public final boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
                {
                    return false;
                }

                public final boolean onCreateActionMode(ActionMode actionmode, Menu menu)
                {
                    return false;
                }

                public final void onDestroyActionMode(ActionMode actionmode)
                {
                }

                public final boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
                {
                    return false;
                }

            
            {
                this$0 = PlaySearchEditText.this;
                super();
            }
            });
        }
    }

    public boolean onKeyPreIme(int i, KeyEvent keyevent)
    {
        if (i == 4 && hasFocus() && keyevent.getAction() == 1)
        {
            android.view.KeyEvent.DispatcherState dispatcherstate = getKeyDispatcherState();
            if (dispatcherstate != null)
            {
                dispatcherstate.handleUpEvent(keyevent);
            }
            if (!keyevent.isCanceled())
            {
                clearFocus();
                return true;
            }
        }
        return super.onKeyPreIme(i, keyevent);
    }
}
