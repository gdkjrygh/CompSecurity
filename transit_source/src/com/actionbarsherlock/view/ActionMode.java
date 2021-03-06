// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.view;

import android.view.View;

// Referenced classes of package com.actionbarsherlock.view:
//            Menu, MenuInflater, MenuItem

public abstract class ActionMode
{
    public static interface Callback
    {

        public abstract boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem);

        public abstract boolean onCreateActionMode(ActionMode actionmode, Menu menu);

        public abstract void onDestroyActionMode(ActionMode actionmode);

        public abstract boolean onPrepareActionMode(ActionMode actionmode, Menu menu);
    }


    private Object mTag;

    public ActionMode()
    {
    }

    public abstract void finish();

    public abstract View getCustomView();

    public abstract Menu getMenu();

    public abstract MenuInflater getMenuInflater();

    public abstract CharSequence getSubtitle();

    public Object getTag()
    {
        return mTag;
    }

    public abstract CharSequence getTitle();

    public abstract void invalidate();

    public boolean isUiFocusable()
    {
        return true;
    }

    public abstract void setCustomView(View view);

    public abstract void setSubtitle(int i);

    public abstract void setSubtitle(CharSequence charsequence);

    public void setTag(Object obj)
    {
        mTag = obj;
    }

    public abstract void setTitle(int i);

    public abstract void setTitle(CharSequence charsequence);
}
