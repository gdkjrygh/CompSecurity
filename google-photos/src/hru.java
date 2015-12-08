// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class hru
{

    public Context a;
    private eto b;

    public hru(Context context)
    {
        a = context;
        b = (eto)olm.a(context, eto);
    }

    private void a(int i, int j, boolean flag, hsw hsw1)
    {
        qay qay1 = a(i, hsw1);
        if (qay1 == null)
        {
            return;
        }
        qaz aqaz[] = qay1.a;
        int j1 = aqaz.length;
        for (int k = 0; k < j1; k++)
        {
            qav aqav[] = aqaz[k].a;
            int k1 = aqav.length;
            int l = 0;
            while (l < k1) 
            {
                qav qav1 = aqav[l];
                if (qav1.d != null && qav1.d.intValue() == j)
                {
                    int i1;
                    if (flag)
                    {
                        i1 = 2;
                    } else
                    {
                        i1 = 1;
                    }
                    qav1.e = i1;
                }
                l++;
            }
        }

        a(i, hsw1, qay1);
    }

    qay a(int i, hsw hsw1)
    {
        Cursor cursor = mvj.b(b.a, i).rawQuery("SELECT * FROM explore_suggestions", null);
        do
        {
            if (!cursor.moveToNext())
            {
                break MISSING_BLOCK_LABEL_76;
            }
        } while (cursor.getInt(0) != hsw1.a());
        hsw1 = cursor.getBlob(1);
        hsw1 = (qay)mve.a(new qay(), hsw1);
        if (hsw1 != null)
        {
            cursor.close();
            return hsw1;
        }
        cursor.close();
        return null;
        hsw1;
        cursor.close();
        throw hsw1;
    }

    public final void a(int i, int j, boolean flag)
    {
        a(i, j, flag, hsw.f);
        a(i, j, flag, hsw.a);
    }

    public void a(int i, hsw hsw1, int j, long l, String s, String s1, 
            int k)
    {
        qay qay1 = a(i, hsw1);
        if (qay1 == null)
        {
            return;
        }
        ArrayList arraylist = new ArrayList();
        qaz aqaz[] = qay1.a;
        int k1 = aqaz.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            qaz qaz1 = aqaz[i1];
            arraylist.clear();
            qav aqav[] = qaz1.a;
            int l1 = aqav.length;
            int j1 = 0;
            while (j1 < l1) 
            {
                qav qav1 = aqav[j1];
                if (qav1.d != null && qav1.d.intValue() == j)
                {
                    qav1.b = s;
                    qav1.f = new qin();
                    qav1.f.a = new qio();
                    qav1.f.a.a = Long.valueOf(l);
                    if (!TextUtils.isEmpty(s1))
                    {
                        qav1.c = s1;
                    }
                }
                boolean flag;
                if (qav1.d == null || (long)k == -1L || qav1.d.intValue() != k)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    arraylist.add(qav1);
                }
                j1++;
            }
            Collections.sort(arraylist, hrw.a);
            qaz1.a = (qav[])arraylist.toArray(new qav[arraylist.size()]);
        }

        a(i, hsw1, qay1);
    }

    public final void a(int i, hsw hsw1, qay qay1)
    {
        p.a(qay1);
        b.a(i, Collections.singletonMap(Integer.valueOf(hsw1.a()), qlw.a(qay1)));
        a.getContentResolver().notifyChange(hrz.a(i), null);
    }
}
