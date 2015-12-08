// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class izp
    implements izo
{

    private final Context a;

    public izp(Context context)
    {
        a = context;
    }

    public final String a(Uri uri)
    {
        return c.a(a, uri);
    }

    public final List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = list.size() - 1; i >= 0; i--)
        {
            Uri uri = Uri.parse((String)list.get(i));
            if (oql.b(uri) && c.a(uri) != null)
            {
                arraylist.add(uri);
            }
        }

        return arraylist;
    }

    public final int b(List list)
    {
        Context context = a;
        Object obj;
        boolean flag1;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); p.a(flag1, (new StringBuilder(String.valueOf(obj).length() + 38)).append("Uri provided is not a MediaStore Uri: ").append(((String) (obj))).toString()))
        {
            obj = (Uri)iterator.next();
            flag1 = oql.b(((Uri) (obj)));
            obj = String.valueOf(obj);
        }

        List list1 = olm.c(context, nkx);
        list = list.iterator();
        int i = 0;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Uri uri = (Uri)list.next();
            long l = ContentUris.parseId(uri);
            nkz nkz1 = c.a(uri);
            if (nkz1 != null)
            {
                boolean flag;
                if (context.getContentResolver().delete(nkz1.b(), nkz1.a(), new String[] {
    String.valueOf(l)
}) > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    for (Iterator iterator1 = list1.iterator(); iterator1.hasNext(); ((nkx)iterator1.next()).a(uri)) { }
                    i++;
                }
            }
        } while (true);
        return i;
    }
}
