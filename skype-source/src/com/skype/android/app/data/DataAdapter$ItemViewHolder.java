// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.data;

import android.view.View;
import android.widget.CompoundButton;

// Referenced classes of package com.skype.android.app.data:
//            DataAdapter

public static abstract class  extends android.support.v7.widget.
    implements android.view., android.view., android.widget.ngeListener
{

    private Object item;
     itemAdapter;

    private void checkFromAdapter(boolean flag)
    {
        updateCheckboxState(flag);
        updateViewCheckedState(flag);
    }

    private void checkFromUser(boolean flag)
    {
        itemAdapter.dispatchItemCheck(this, item, flag);
        updateViewCheckedState(flag);
    }

    public void checkFromElsewhere(boolean flag)
    {
        itemAdapter.dispatchItemCheck(this, item, flag);
        updateCheckboxState(flag);
        updateViewCheckedState(flag);
    }

    public Object getData()
    {
        return item;
    }

    public boolean isItemChecked()
    {
        return itemAdapter.isItemChecked(item);
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        checkFromUser(flag);
    }

    public void onClick(View view)
    {
        itemAdapter.dispatchItemClick(this, view.getId(), item);
    }

    public boolean onLongClick(View view)
    {
        return itemAdapter.dispatchItemLongClick(this, view.getId(), item);
    }

    protected abstract void onSetData(Object obj);

    public void onViewAttachedToWindow()
    {
    }

    public void onViewDetachedFromWindow()
    {
    }

    public void onViewRecycled()
    {
    }

    public final void setData(Object obj)
    {
        item = obj;
        onSetData(obj);
        checkFromAdapter(itemAdapter.isItemChecked(obj));
    }

    final void setItemAdapter( )
    {
        itemAdapter = ;
    }

    public void toggleCheck()
    {
        checkFromElsewhere(isItemChecked());
    }

    protected void updateCheckboxState(boolean flag)
    {
    }

    protected void updateViewCheckedState(boolean flag)
    {
    }

    public (View view)
    {
        super(view);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }
}
