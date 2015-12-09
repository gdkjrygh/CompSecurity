// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ShareExerciseGalleryActivity

private class a extends CursorAdapter
{

    final ShareExerciseGalleryActivity a;

    public String a(int i)
    {
        Cursor cursor = getCursor();
        if (cursor.moveToPosition(i))
        {
            return cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        } else
        {
            return null;
        }
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        view = (ImageView)view;
        long l = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        cursor = Uri.withAppendedPath(android.provider.L_CONTENT_URI, Long.toString(l));
        Picasso.with(context).load(cursor).fit().centerCrop().into(view);
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return LayoutInflater.from(context).inflate(0x7f0400fb, viewgroup, false);
    }

    public (ShareExerciseGalleryActivity shareexercisegalleryactivity, Context context, Cursor cursor)
    {
        a = shareexercisegalleryactivity;
        super(context, cursor, 0);
    }
}
