// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import com.snapchat.android.util.SnapMediaUtils;
import java.util.Iterator;
import java.util.List;

final class nit> extends aA
{

    final Pp this$0;

    protected final int c(Object obj)
    {
        obj = (id.graphics.Bitmap)obj;
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if (obj != null)
        {
            i = ((flag) ? 1 : 0);
            if (((aphics.Bitmap) (obj)).mBitmapList != null)
            {
                obj = ((apList) (obj)).mBitmapList.iterator();
                for (i = 0; ((Iterator) (obj)).hasNext(); i = SnapMediaUtils.f((Bitmap)((Iterator) (obj)).next()) + i) { }
            }
        }
        return (int)Math.ceil((float)i / 1024F);
    }

    >(int i)
    {
        this$0 = Pp.this;
        super(i);
    }
}
