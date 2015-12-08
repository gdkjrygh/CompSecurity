// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;

final class ijg
    implements ikf
{

    private final Context a;

    public ijg(Context context)
    {
        a = context;
    }

    private String a(int i, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        mvu mvu1 = new mvu(mvj.b(a, i));
        mvu1.a = "shared_media";
        mvu1.b = (new String[] {
            "remote_url"
        });
        mvu1.c = "media_key = ?";
        mvu1.d = (new String[] {
            s
        });
        s = mvu1.a();
        String s1;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_99;
        }
        s1 = s.getString(s.getColumnIndexOrThrow("remote_url"));
        s.close();
        return s1;
        s.close();
        return null;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        return new hjt(a(i, ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("cover_item_media_key"))), null, 0L);
    }

    public final Set a()
    {
        return Collections.singleton("cover_item_media_key");
    }

    public final Class b()
    {
        return hjt;
    }
}
