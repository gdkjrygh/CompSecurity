// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import java.util.Comparator;

public final class oiw
    implements Comparator
{

    public oiw()
    {
    }

    public static int a(oiv oiv1, oiv oiv2)
    {
        Rect rect = oiv1.a();
        Rect rect1 = oiv2.a();
        int i;
        if (rect.bottom <= rect1.top)
        {
            i = -1;
        } else
        {
            if (rect.top >= rect1.bottom)
            {
                return 1;
            }
            int j = rect.left - rect1.left;
            i = j;
            if (j == 0)
            {
                int k = rect.top - rect1.top;
                i = k;
                if (k == 0)
                {
                    int l = rect.bottom - rect1.bottom;
                    i = l;
                    if (l == 0)
                    {
                        int i1 = rect.right - rect1.right;
                        i = i1;
                        if (i1 == 0)
                        {
                            return oiv1.hashCode() - oiv2.hashCode();
                        }
                    }
                }
            }
        }
        return i;
    }

    public final int compare(Object obj, Object obj1)
    {
        return a((oiv)obj, (oiv)obj1);
    }
}
