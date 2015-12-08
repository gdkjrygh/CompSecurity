// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;

final class dlo
    implements dkl
{

    static final Set a = Collections.singleton("type");
    private final fbj b;

    dlo(Context context)
    {
        b = (fbj)olm.a(context, fbj);
    }

    public final volatile ekf a(int i, Object obj)
    {
        return a((Cursor)obj);
    }

    public final ekf a(Cursor cursor)
    {
        boolean flag1 = true;
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("type"));
        boolean flag;
        if (i == euv.b.f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i == euv.c.f)
        {
            if (!TextUtils.isEmpty(cursor.getString(cursor.getColumnIndexOrThrow("content_uri"))) && fbj.a())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        return new gth(flag);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return gtg;
    }

}
