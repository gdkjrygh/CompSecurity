// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.widget:
//            CursorAdapter

private final class <init> extends DataSetObserver
{

    final CursorAdapter this$0;

    public final void onChanged()
    {
        mDataValid = true;
        notifyDataSetChanged();
    }

    public final void onInvalidated()
    {
        mDataValid = false;
        notifyDataSetInvalidated();
    }

    private ()
    {
        this$0 = CursorAdapter.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
