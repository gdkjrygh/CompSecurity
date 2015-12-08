// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.graphics.PointF;
import java.util.Comparator;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageToneCurveFilter

class this._cls0
    implements Comparator
{

    final GPUImageToneCurveFilter this$0;

    public int compare(PointF pointf, PointF pointf1)
    {
        if (pointf.x < pointf1.x)
        {
            return -1;
        }
        return pointf.x <= pointf1.x ? 0 : 1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((PointF)obj, (PointF)obj1);
    }

    A()
    {
        this$0 = GPUImageToneCurveFilter.this;
        super();
    }
}
