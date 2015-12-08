// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            j, g

public class f
    implements j
{

    Context a;

    public f(Context context)
    {
        a = context;
    }

    public int a(int i, int k)
    {
        Display display = ((WindowManager)a.getSystemService("window")).getDefaultDisplay();
        int l = display.getWidth();
        int i1 = display.getHeight();
        return (int)Math.min(3F, Math.max(1.0F, Math.min((float)i / (float)l, (float)k / (float)i1)));
    }

    public Bitmap a(byte abyte0[], int i)
    {
        if (abyte0 == null)
        {
            return null;
        }
        if (Integer.parseInt(android.os.Build.VERSION.SDK) < 4)
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inSampleSize = i;
            return BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        } else
        {
            return (new g(this, i)).a(abyte0);
        }
    }
}
