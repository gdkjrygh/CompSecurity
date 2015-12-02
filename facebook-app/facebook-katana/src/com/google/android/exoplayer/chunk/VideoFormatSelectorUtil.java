// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer.MediaCodecUtil;
import com.google.android.exoplayer.util.Util;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.chunk:
//            Format, FormatWrapper

public final class VideoFormatSelectorUtil
{

    private VideoFormatSelectorUtil()
    {
    }

    private static Point a(Display display)
    {
        Point point = new Point();
        if (Util.a >= 17)
        {
            a(display, point);
            return point;
        }
        if (Util.a >= 16)
        {
            b(display, point);
            return point;
        } else
        {
            c(display, point);
            return point;
        }
    }

    private static Point a(boolean flag, int i, int j, int k, int l)
    {
        boolean flag2 = true;
        int j1 = i;
        int i1 = j;
        if (flag)
        {
            boolean flag1;
            if (k > l)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (i <= j)
            {
                flag2 = false;
            }
            j1 = i;
            i1 = j;
            if (flag1 != flag2)
            {
                i1 = i;
                j1 = j;
            }
        }
        if (k * i1 >= l * j1)
        {
            return new Point(j1, Util.a(j1 * l, k));
        } else
        {
            return new Point(Util.a(i1 * k, l), i1);
        }
    }

    private static void a(Display display, Point point)
    {
        display.getRealSize(point);
    }

    private static boolean a(Format format, String as[], boolean flag, int i)
    {
        while (as != null && !Util.a(as, format.b) || flag && (format.d >= 1280 || format.e >= 720) || format.d > 0 && format.e > 0 && format.d * format.e > i) 
        {
            return false;
        }
        return true;
    }

    public static int[] a(Context context, List list, String as[], boolean flag)
    {
        context = a(((WindowManager)context.getSystemService("window")).getDefaultDisplay());
        return a(list, as, flag, true, ((Point) (context)).x, ((Point) (context)).y);
    }

    private static int[] a(List list, String as[], boolean flag, boolean flag1, int i, int j)
    {
        int k = 0x7fffffff;
        ArrayList arraylist = new ArrayList();
        int j1 = MediaCodecUtil.a();
        int k1 = list.size();
        for (int l = 0; l < k1; l++)
        {
            Format format = ((FormatWrapper)list.get(l)).e_();
            if (!a(format, as, flag, j1))
            {
                continue;
            }
            arraylist.add(Integer.valueOf(l));
            if (format.d <= 0 || format.e <= 0)
            {
                continue;
            }
            Point point = a(flag1, i, j, format.d, format.e);
            int i1 = format.d * format.e;
            if (format.d >= (int)((float)point.x * 0.98F) && format.e >= (int)((float)point.y * 0.98F) && i1 < k)
            {
                k = i1;
            }
        }

        for (i = arraylist.size() - 1; i >= 0; i--)
        {
            as = ((FormatWrapper)list.get(i)).e_();
            if (((Format) (as)).d <= 0 || ((Format) (as)).e <= 0)
            {
                continue;
            }
            j = ((Format) (as)).d;
            if (((Format) (as)).e * j > k)
            {
                arraylist.remove(i);
            }
        }

        return Util.a(arraylist);
    }

    private static void b(Display display, Point point)
    {
        display.getSize(point);
    }

    private static void c(Display display, Point point)
    {
        point.x = display.getWidth();
        point.y = display.getHeight();
    }
}
