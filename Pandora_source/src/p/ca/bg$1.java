// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.view.View;

// Referenced classes of package p.ca:
//            bg

class Object
    implements Runnable
{

    final bg a;

    public void run()
    {
        a.getView().findViewById(0x7f100300).setVisibility(0);
    }

    ew.View(bg bg1)
    {
        a = bg1;
        super();
    }
}
