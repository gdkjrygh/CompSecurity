// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.eureka.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.widget.ImageView;
import java.net.URL;

// Referenced classes of package com.pandora.android.eureka.dialog:
//            c

class a
    implements Runnable
{

    Bitmap a;
    final c b;

    public void run()
    {
        try
        {
            a = BitmapFactory.decodeStream((new URL(c.a(b).toString())).openStream());
        }
        catch (Exception exception)
        {
            a = BitmapFactory.decodeResource(c.b(b).getResources(), 0x7f0200e9);
        }
        if (c.c(b))
        {
            return;
        } else
        {
            c.d(b).post(new Runnable() {

                final c._cls4 a;

                public void run()
                {
                    c.d(a.b).setImageBitmap(a.a);
                }

            
            {
                a = c._cls4.this;
                super();
            }
            });
            return;
        }
    }

    _cls1.a(c c1)
    {
        b = c1;
        super();
        a = null;
    }
}
