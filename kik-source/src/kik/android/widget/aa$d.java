// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.database.Cursor;
import com.kik.g.p;
import java.util.HashMap;
import java.util.Map;
import kik.android.util.bf;

// Referenced classes of package kik.android.widget:
//            aa, GalleryWidget

final class a extends bf
{

    p a;
    final aa b;

    protected final Object doInBackground(Object aobj[])
    {
        aobj = new HashMap();
        String as[] = aa.e(b);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            Cursor cursor = aa.d(b).a(s);
            if (cursor == null)
            {
                continue;
            }
            if (cursor.getCount() > 0)
            {
                a a1 = new <init>(b);
                a1.a = s;
                a1.b = cursor.getLong(aa.f(b));
                a1.c = cursor.getCount();
                a1.d = aa.a(cursor);
                ((Map) (aobj)).put(s, a1);
            }
            cursor.close();
        }

        return ((Object) (aobj));
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Map)obj;
        a.a(obj);
    }

    ryWidget(aa aa1, p p1)
    {
        b = aa1;
        super();
        a = p1;
    }
}
