// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import com.roidapp.photogrid.filter.b;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            mq, ml, hv, ig

final class mr
    implements Runnable
{

    final mq a;

    mr(mq mq1)
    {
        a = mq1;
        super();
    }

    public final void run()
    {
        int i;
        boolean flag;
        flag = false;
        if (mq.a(a).isEmpty())
        {
            a.l.sendEmptyMessage(3);
            return;
        }
        i = 0;
_L1:
        Object obj;
        hv hv1;
        if (i < mq.a(a).size())
        {
            hv1 = (hv)mq.a(a).get(i);
            Bitmap bitmap = hv1.a();
            if (bitmap == null || bitmap.isRecycled())
            {
                flag = true;
            } else
            {
label0:
                {
                    obj = bitmap;
                    if (a.i == null)
                    {
                        break label0;
                    }
                    obj = bitmap;
                    if (i >= a.i.length)
                    {
                        break label0;
                    }
                    bitmap = b.a(b.a(a.h), bitmap, hv1.e);
                    if (bitmap != null)
                    {
                        obj = bitmap;
                        if (!bitmap.isRecycled())
                        {
                            break label0;
                        }
                    }
                    flag = true;
                }
            }
        } else
        {
            i = 0;
        }
        if (flag)
        {
            obj = Message.obtain();
            obj.what = 703;
            obj.obj = a.i[i].n;
            a.K.sendMessage(((Message) (obj)));
            return;
        } else
        {
            a.l.sendEmptyMessage(3);
            return;
        }
        hv1.a = ((Bitmap) (obj));
        a.l.a(i * 4 + 36, 0);
        i++;
          goto _L1
    }
}
