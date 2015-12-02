// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.ads:
//            b, NativeAd

class t>
    implements android.view..OnTouchListener
{

    final b a;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            if (b.a(a))
            {
                view = new Intent();
                view.setAction("android.intent.action.VIEW");
                view.addCategory("android.intent.category.BROWSABLE");
                view.setData(Uri.parse(b.b(a).m()));
                b.c(a).startActivity(view);
            } else
            {
                b.d(a);
            }
            return true;
        } else
        {
            return false;
        }
    }

    ent(b b1)
    {
        a = b1;
        super();
    }
}
