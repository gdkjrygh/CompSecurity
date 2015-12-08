// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;

public final class fzd
{

    public final ArrayList a = new ArrayList();

    public fzd()
    {
    }

    public static boolean a(Object obj)
    {
        do
        {
            if (obj instanceof String)
            {
                return TextUtils.isEmpty((String)obj);
            }
            if (obj instanceof Number)
            {
                return ((Number)obj).doubleValue() == 0.0D;
            }
            if (obj instanceof Boolean)
            {
                return false;
            }
            if (!(obj instanceof myb))
            {
                break;
            }
            obj = Double.valueOf(((myb)obj).a());
        } while (true);
        if (obj == null)
        {
            return true;
        } else
        {
            obj = String.valueOf(obj);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 20)).append("Unknown object type=").append(((String) (obj))).toString());
        }
    }

    public final void a(String s, String s1, int i)
    {
        String s2 = s;
        if (s == null)
        {
            s2 = "";
        }
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        if (!a(s2) || !a(s))
        {
            a.add(new fyw(s2, s, i));
        }
    }

    public final void a(String s, ArrayList arraylist, int i)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        s = oqs.a();
        for (int j = 0; j < arraylist.size(); j++)
        {
            if (a(arraylist.get(j)))
            {
                continue;
            }
            if (j > 0)
            {
                s.append("    ");
            }
            s.append((String)arraylist.get(j));
        }

        if (!a(s1) || s.length() != 0)
        {
            a.add(new fyw(s1, s.toString(), i));
        }
        oqs.a(s);
    }
}
