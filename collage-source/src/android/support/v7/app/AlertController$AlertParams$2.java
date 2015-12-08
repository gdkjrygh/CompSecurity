// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ListView;

// Referenced classes of package android.support.v7.app:
//            AlertController

class sCheckedColumn extends CursorAdapter
{

    private final int mIsCheckedIndex;
    private final int mLabelIndex;
    final val.dialog this$0;
    final AlertController val$dialog;
    final ListView val$listView;

    public void bindView(View view, Context context, Cursor cursor)
    {
        ((CheckedTextView)view.findViewById(0x1020014)).setText(cursor.getString(mLabelIndex));
        view = val$listView;
        int i = cursor.getPosition();
        boolean flag;
        if (cursor.getInt(mIsCheckedIndex) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setItemChecked(i, flag);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return nflater.inflate(AlertController.access$1200(val$dialog), viewgroup, false);
    }

    (boolean flag, ListView listview, AlertController alertcontroller)
    {
        this$0 = final_;
        val$listView = listview;
        val$dialog = alertcontroller;
        super(final_context, Cursor.this, flag);
        final_ = getCursor();
        mLabelIndex = final_.getColumnIndexOrThrow(abelColumn);
        mIsCheckedIndex = final_.getColumnIndexOrThrow(sCheckedColumn);
    }
}
