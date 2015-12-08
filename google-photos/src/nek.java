// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class nek
{

    public int a;
    public final Uri b;
    public final njx c;
    public final nej d;

    nek(Uri uri, nej nej1)
    {
        b = uri;
        d = nej1;
        if (nej1 == neh.b())
        {
            uri = njx.b;
        } else
        {
            uri = njx.a;
        }
        c = uri;
    }

    public final int a(Context context, List list)
    {
        context = (ejr)olm.a(context, ejr);
        context = context.a(b, nej.a, d.a(list), nej.b(list), null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        int i;
        if (!context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_70;
        }
        i = context.getInt(0);
        if (context != null)
        {
            context.close();
        }
        return i;
        if (context != null)
        {
            context.close();
        }
        return 0;
        list;
        context = null;
_L2:
        if (context != null)
        {
            context.close();
        }
        throw list;
        list;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final Cursor a(Context context, long l)
    {
        context = (ejr)olm.a(context, ejr);
        Uri uri = b;
        String as[] = d.f;
        d.getClass();
        return context.a(uri, as, "_id = ?", new String[] {
            String.valueOf(l)
        }, null);
    }

    public final Set a(Context context)
    {
        Object obj;
        obj = new HashSet();
        context = ((ejr)olm.a(context, ejr)).a(b, d.e, d.c, null, null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        for (; context.moveToNext(); ((Set) (obj)).add(Integer.valueOf(context.getInt(0)))) { }
        break MISSING_BLOCK_LABEL_85;
        obj;
        context.close();
        throw obj;
        context.close();
        return ((Set) (obj));
    }

    public final String toString()
    {
        String s = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 13)).append("MediaSource{").append(s).append("}").toString();
    }
}
