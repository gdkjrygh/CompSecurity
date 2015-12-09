// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p.people;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.apps.wallet.p2p.api.Contact;
import com.google.common.base.Strings;
import java.io.InputStream;

public class ContactsUtil
{

    private static final String CONTACT_PROJECTION[] = {
        "_id", "display_name", "data1", "photo_id"
    };
    private static final String SELECT_BY_EMAIL = String.format("%s='%s' and %s=?", new Object[] {
        "account_type", "com.google", "data1"
    });
    private final ContentResolver contentResolver;

    public ContactsUtil(ContentResolver contentresolver)
    {
        contentResolver = contentresolver;
    }

    private Cursor queryContact(String s)
    {
        return contentResolver.query(android.provider.ContactsContract.Data.CONTENT_URI, CONTACT_PROJECTION, SELECT_BY_EMAIL, new String[] {
            s
        }, null);
    }

    public final Contact getContact(String s)
    {
        Cursor cursor = queryContact(s);
        Contact contact;
        if (cursor.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        cursor.moveToFirst();
        contact = new Contact(cursor.getString(cursor.getColumnIndex("photo_id")), cursor.getString(cursor.getColumnIndex("display_name")), s, "");
        cursor.close();
        return contact;
        cursor.close();
_L2:
        return new Contact(s);
        Exception exception;
        exception;
        cursor.close();
        if (true) goto _L2; else goto _L1
_L1:
        s;
        cursor.close();
        throw s;
    }

    public final Bitmap getProfilePhotoFor(String s)
    {
        Cursor cursor = queryContact(s);
_L4:
        if (!cursor.moveToNext()) goto _L2; else goto _L1
_L1:
        s = cursor.getString(cursor.getColumnIndex("photo_id"));
        if (Strings.isNullOrEmpty(s)) goto _L4; else goto _L3
_L3:
        Object obj = ContentUris.withAppendedId(android.provider.ContactsContract.Data.CONTENT_URI, Long.parseLong(s));
        s = null;
        obj = contentResolver.openInputStream(((android.net.Uri) (obj)));
        s = ((String) (obj));
        Bitmap bitmap = BitmapFactory.decodeStream(((InputStream) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        ((InputStream) (obj)).close();
        cursor.close();
        return bitmap;
        Exception exception;
        exception;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        s.close();
        throw exception;
        s;
        cursor.close();
_L6:
        return null;
_L2:
        cursor.close();
        if (true) goto _L6; else goto _L5
_L5:
        s;
        cursor.close();
        throw s;
    }

    public final boolean hasEmailAsContact(String s)
    {
        return queryContact(s).getCount() > 0;
    }

}
