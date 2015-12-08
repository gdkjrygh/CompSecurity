// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;
import com.roidapp.baselib.a.a;
import com.roidapp.cloudlib.common.c;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            UploadManagerActivity, n, c

final class m
    implements Runnable
{

    final UploadManagerActivity a;
    private String b;
    private boolean c;
    private WeakReference d;
    private final int e = 240;

    public m(UploadManagerActivity uploadmanageractivity, String s, ImageView imageview, boolean flag)
    {
        a = uploadmanageractivity;
        super();
        b = s;
        c = flag;
        d = new WeakReference(imageview);
    }

    static WeakReference a(m m1)
    {
        return m1.d;
    }

    public final void run()
    {
        android.graphics.Bitmap bitmap;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        bitmap = com.roidapp.baselib.a.a.a(b, 240, 240, false, true);
_L1:
        a.c.post(new n(this, bitmap));
        return;
        try
        {
            bitmap = com.roidapp.cloudlib.common.c.a(b, 240);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            Log.e("UploadManagerActivity", (new StringBuilder("decode ")).append(b).append(" as thumbnail meet OOM.").toString());
            a.d.g();
            outofmemoryerror.printStackTrace();
            return;
        }
          goto _L1
    }
}
