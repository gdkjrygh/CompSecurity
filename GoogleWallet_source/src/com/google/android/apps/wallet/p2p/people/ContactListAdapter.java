// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p.people;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.wallet.p2p.api.Contact;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.roundedimage.RoundedImage;
import com.google.common.base.Strings;

public final class ContactListAdapter extends CursorAdapter
{

    private final int emailColumn;
    private final int nameColumn;
    private final int photoColumn;

    public ContactListAdapter(Context context, Cursor cursor)
    {
        super(context, cursor, 0);
        nameColumn = cursor.getColumnIndex("display_name");
        emailColumn = cursor.getColumnIndex("data1");
        photoColumn = cursor.getColumnIndex("photo_id");
    }

    public final void bindView(View view, Context context, Cursor cursor)
    {
        context = cursor.getString(nameColumn);
        String s = cursor.getString(emailColumn);
        Object obj = cursor.getString(photoColumn);
        cursor = (RoundedImage)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.contactPhoto);
        if (obj != null && ((String) (obj)).length() > 0)
        {
            try
            {
                obj = ContentUris.withAppendedId(android.provider.ContactsContract.Data.CONTENT_URI, Long.parseLong(((String) (obj))));
                cursor.setImage(BitmapFactory.decodeStream(mContext.getContentResolver().openInputStream(((android.net.Uri) (obj)))));
            }
            catch (Exception exception)
            {
                cursor.setImage(null);
            }
        } else
        {
            cursor.setImage(null);
        }
        if (Strings.isNullOrEmpty(context))
        {
            ((TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.contactName)).setText(s);
            ((TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.contactEmail)).setText("");
            return;
        }
        if (context.equals(s))
        {
            ((TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.contactName)).setText(context);
            ((TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.contactEmail)).setText("");
            return;
        } else
        {
            ((TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.contactName)).setText(context);
            ((TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.contactEmail)).setText(s);
            return;
        }
    }

    public final Contact getContact(Cursor cursor)
    {
        String s = cursor.getString(nameColumn);
        String s1 = cursor.getString(emailColumn);
        return new Contact(cursor.getString(photoColumn), s, s1, "");
    }

    public final View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.contact_list_item, viewgroup, false);
    }
}
