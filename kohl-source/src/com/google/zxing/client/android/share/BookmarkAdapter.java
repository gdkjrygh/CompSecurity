// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.share;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

final class BookmarkAdapter extends BaseAdapter
{

    private final Context context;
    private final Cursor cursor;

    BookmarkAdapter(Context context1, Cursor cursor1)
    {
        context = context1;
        cursor = cursor1;
    }

    public int getCount()
    {
        return cursor.getCount();
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (!(view instanceof LinearLayout))
        {
            view = LayoutInflater.from(context).inflate(com.google.zxing.client.android.R.layout.bookmark_picker_list_item, viewgroup, false);
        }
        if (!cursor.isClosed())
        {
            cursor.moveToPosition(i);
            viewgroup = cursor.getString(0);
            ((TextView)view.findViewById(com.google.zxing.client.android.R.id.bookmark_title)).setText(viewgroup);
            viewgroup = cursor.getString(1);
            ((TextView)view.findViewById(com.google.zxing.client.android.R.id.bookmark_url)).setText(viewgroup);
        }
        return view;
    }
}
