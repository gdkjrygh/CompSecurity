// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.release:
//            kg

final class kk extends Handler
{

    final kg a;

    kk(kg kg1)
    {
        a = kg1;
        super();
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            break;
        }
        if (kg.g(a) != null)
        {
            kg.g(a).setVisibility(8);
        }
        kg.a(a, true);
        if (kg.h(a) != null && !kg.h(a).isRecycled())
        {
            Log.e("load bitmap", "end...................");
            kg.i(a).setImageBitmap(kg.h(a));
            int i = kg.j(a).getMeasuredWidth();
            int j = kg.j(a).getMeasuredHeight();
            if (i > 0 && j > 0)
            {
                kg.c(a, i);
                kg.d(a, j);
            }
            message = kg.k(a).getLayoutParams();
            i = kg.h(a).getWidth();
            j = kg.h(a).getHeight();
            if (i <= kg.e(a) && j <= kg.f(a))
            {
                message.width = i;
                message.height = j;
            } else
            {
                float f = (float)kg.e(a) / (float)kg.f(a);
                float f1 = (float)i / (float)j;
                if (f > f1)
                {
                    message.height = kg.f(a);
                    message.width = (int)(f1 * (float)kg.f(a));
                } else
                {
                    message.width = kg.e(a);
                    message.height = (int)(((float)kg.e(a) * 1.0F) / f1);
                }
            }
            kg.k(a).setLayoutParams(message);
            if (kg.l(a) > 0)
            {
                kg.k(a).setVisibility(0);
                kg.m(a).setVisibility(0);
            } else
            {
                kg.k(a).setVisibility(8);
                kg.m(a).setVisibility(8);
            }
            kg.m(a).setText(String.valueOf(kg.l(a)));
            return;
        } else
        {
            kg.k(a).setVisibility(8);
            kg.m(a).setVisibility(8);
            return;
        }
    }
}
