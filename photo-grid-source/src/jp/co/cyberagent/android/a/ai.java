// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.graphics.PointF;
import java.util.Comparator;

// Referenced classes of package jp.co.cyberagent.android.a:
//            ag

final class ai
    implements Comparator
{

    final ag a;

    ai(ag ag)
    {
        a = ag;
        super();
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (PointF)obj;
        obj1 = (PointF)obj1;
        if (((PointF) (obj)).x < ((PointF) (obj1)).x)
        {
            return -1;
        }
        return ((PointF) (obj)).x <= ((PointF) (obj1)).x ? 0 : 1;
    }
}
