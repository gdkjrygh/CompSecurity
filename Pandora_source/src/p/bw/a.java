// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bw;

import android.content.Context;
import android.util.SparseArray;
import com.pandora.android.provider.b;
import com.pandora.android.util.r;
import com.pandora.android.util.s;
import com.pandora.radio.data.f;
import p.cw.c;

public class a extends SparseArray
{

    private final Context a;

    public a(Context context)
    {
        a = context;
        a();
    }

    private void a()
    {
        put(-1, a.getString(0x7f08016f));
        put(0, a.getString(0x7f080176));
        put(1, a.getString(0x7f08015a));
        put(11, a.getString(0x7f080160));
        put(1001, a.getString(0x7f080162));
        put(1002, a.getString(0x7f080169));
        put(1004, a.getString(0x7f080153));
        put(1006, a.getString(0x7f08017f));
        put(1010, a.getString(0x7f080170));
        put(1011, a.getString(0x7f080164));
        put(1012, a.getString(0x7f080167));
        put(1013, a.getString(0x7f08015b));
        put(1016, a.getString(0x7f080164));
        put(1024, a.getString(0x7f08016b));
        put(1015, a.getString(0x7f080158, new Object[] {
            b.a.b().l().c()
        }));
        put(1023, a.getString(0x7f080159, new Object[] {
            b.a.b().l().c()
        }));
        put(1025, a.getString(0x7f080163));
        put(1026, a.getString(0x7f080161));
        put(1027, a.getString(0x7f080175));
        put(1029, a.getString(0x7f080165));
        put(1034, a.getString(0x7f080157, new Object[] {
            b.a.b().l().c()
        }));
        put(1000, a.getString(0x7f080173));
        put(1005, a.getString(0x7f08017e));
        put(1036, a.getString(0x7f080168));
        put(1035, a.getString(0x7f080184));
        put(1037, a.getString(0x7f080286));
        put(1007, a.getString(0x7f080286));
        put(1038, a.getString(0x7f080254));
        put(12, a.getString(0x7f08016d));
        put(1003, a.getString(0x7f080188));
        put(13, a.getString(0x7f080188));
        put(1044, a.getString(0x7f08016a));
        put(3000, a.getString(0x7f080254));
        put(3001, a.getString(0x7f08017d));
        put(3002, String.format(a.getString(0x7f080186), new Object[] {
            Integer.valueOf(3002)
        }));
        put(3003, a.getString(0x7f08016f));
        put(3004, a.getString(0x7f080152));
        put(3005, String.format(a.getString(0x7f080186), new Object[] {
            Integer.valueOf(3005)
        }));
    }

    private String b(int i)
    {
        String s1;
        if (i < 0)
        {
            s1 = a.getString(0x7f080283);
        } else
        {
            s1 = String.valueOf(i);
        }
        return String.format(a.getString(0x7f080185), new Object[] {
            s1
        });
    }

    public String a(int i)
    {
        String s1;
        if (i == 1024)
        {
            if (r.a())
            {
                i = 0x7f08016c;
            } else
            {
                i = 0x7f08016b;
            }
            s1 = a.getString(i);
        } else
        {
            String s2 = (String)super.get(i);
            s1 = s2;
            if (s.a(s2))
            {
                return b(i);
            }
        }
        return s1;
    }

    public Object get(int i)
    {
        return a(i);
    }
}
