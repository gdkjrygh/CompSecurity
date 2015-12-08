// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            o

final class q
    implements Runnable
{

    final ImageView a;
    final o b;

    q(o o, ImageView imageview)
    {
        b = o;
        a = imageview;
        super();
    }

    public final void run()
    {
        try
        {
            ((AnimationDrawable)a.getBackground()).start();
            return;
        }
        catch (ClassCastException classcastexception)
        {
            classcastexception.printStackTrace();
        }
    }
}
