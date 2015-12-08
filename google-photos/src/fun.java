// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class fun
    implements fva
{

    private final Context a;

    fun(Context context)
    {
        a = context;
    }

    public final ekf a(int i, Object obj)
    {
        elj elj1 = null;
        obj = (fvb)obj;
        if (((fvb) (obj)).b)
        {
            obj = a.getString(b.qs);
        } else
        {
            obj = ((fvb) (obj)).a;
            if (obj == null)
            {
                obj = null;
            } else
            {
                int j = ((Cursor) (obj)).getColumnIndex("bucket_display_name");
                i = j;
                if (j < 0)
                {
                    i = ((Cursor) (obj)).getColumnIndex("bucket_display_name");
                }
                if (i < 0)
                {
                    obj = null;
                } else
                {
                    obj = ((Cursor) (obj)).getString(i);
                }
            }
        }
        if (obj != null)
        {
            elj1 = new elj(((String) (obj)));
        }
        return elj1;
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return elj;
    }
}
