// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.spotify.mobile.android.service.session.SessionState;

public final class ecy extends dzr
{

    public ecy(Context context)
    {
        super(context);
    }

    public final Cursor a(ContentResolver contentresolver, Uri uri)
    {
        return contentresolver.query(uri, SessionState.a, null, null, null);
    }

    public final Object a(Cursor cursor)
    {
        if (cursor == null || !cursor.moveToFirst())
        {
            return null;
        } else
        {
            return SessionState.a(cursor);
        }
    }

    protected final Uri s()
    {
        return dtw.a;
    }
}
