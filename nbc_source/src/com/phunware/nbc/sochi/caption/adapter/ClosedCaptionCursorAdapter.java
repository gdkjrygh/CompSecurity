// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.adapter;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import java.util.HashSet;
import java.util.Set;

public class ClosedCaptionCursorAdapter extends CursorAdapter
{

    private static final String TAG = "ClosedCaptionCursorAdapter";
    private final LayoutInflater inflater;
    private final HashSet mCheckedIds = new HashSet();
    private boolean mIsMultiMode;
    private final int mListItemResId;
    private final HashSet mPendingDeletedIds = new HashSet();
    private Drawable mPressedDrawable;

    public ClosedCaptionCursorAdapter(Context context, int i)
    {
        super(context, null, 0);
        mIsMultiMode = false;
        inflater = (LayoutInflater)context.getSystemService("layout_inflater");
        mListItemResId = i;
    }

    public static void updateBackgroundResourceWithRetainedPadding(View view, int i)
    {
        int j = view.getPaddingBottom();
        int k = view.getPaddingTop();
        int l = view.getPaddingLeft();
        view.setBackgroundResource(i);
        view.setPadding(l, k, 0, j);
    }

    public static void updateBackgroundResourceWithRetainedPadding(View view, Drawable drawable)
    {
        int i = view.getPaddingBottom();
        int j = view.getPaddingTop();
        int k = view.getPaddingLeft();
        view.setBackgroundDrawable(drawable);
        view.setPadding(k, j, 0, i);
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        if (!cursor.isClosed())
        {
            int i = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
            context = cursor.getString(cursor.getColumnIndex("title"));
            ((CheckedTextView)view.findViewById(0x1020014)).setText(context);
            if (isChecked(i))
            {
                updateBackgroundResourceWithRetainedPadding(view, mPressedDrawable);
            } else
            {
                updateBackgroundResourceWithRetainedPadding(view, 0x7f020144);
            }
            if (mPendingDeletedIds.contains(Integer.valueOf(i)))
            {
                view.setVisibility(8);
                return;
            }
        }
    }

    public void checkAllItems()
    {
        if (getCursor() != null)
        {
            mCheckedIds.clear();
            getCursor().moveToFirst();
            do
            {
                if (!getCursor().moveToNext())
                {
                    break;
                }
                int i = getCursor().getInt(getCursor().getColumnIndexOrThrow("_id"));
                if ((long)i > 0L)
                {
                    toggleChecked(i);
                }
            } while (true);
        }
        notifyDataSetChanged();
    }

    public void enterMultiMode()
    {
        mCheckedIds.clear();
        mIsMultiMode = true;
        notifyDataSetChanged();
    }

    public void exitMultiMode()
    {
        if (mIsMultiMode)
        {
            mCheckedIds.clear();
            mIsMultiMode = false;
            notifyDataSetChanged();
        }
    }

    public int getCheckedItemCount()
    {
        return mCheckedIds.size();
    }

    public Set getCheckedItems()
    {
        return mCheckedIds;
    }

    public boolean isChecked(long l)
    {
        return mCheckedIds.contains(Long.valueOf(l));
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return inflater.inflate(mListItemResId, viewgroup, false);
    }

    public void setChecked(long l, boolean flag)
    {
        if (flag)
        {
            mCheckedIds.add(Long.valueOf(l));
        } else
        {
            mCheckedIds.remove(Long.valueOf(l));
        }
        if (mIsMultiMode)
        {
            notifyDataSetChanged();
        }
    }

    public void setPressedDrawable(Drawable drawable)
    {
        mPressedDrawable = drawable;
    }

    public Cursor swapCursor(Cursor cursor)
    {
        mCheckedIds.clear();
        mIsMultiMode = false;
        return super.swapCursor(cursor);
    }

    public void toggleChecked(long l)
    {
        Long long1 = Long.valueOf(l);
        if (mCheckedIds.contains(long1))
        {
            mCheckedIds.remove(long1);
        } else
        {
            mCheckedIds.add(long1);
        }
        notifyDataSetChanged();
    }
}
