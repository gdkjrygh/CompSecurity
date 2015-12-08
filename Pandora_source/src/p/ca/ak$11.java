// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.Intent;
import android.view.View;

// Referenced classes of package p.ca:
//            ak

class bject
    implements android.view.nClickListener
{

    final ak a;

    public void onClick(View view)
    {
        if (android.os.VERSION.SDK_INT >= 18)
        {
            a.startActivity(new Intent("android.settings.DREAM_SETTINGS"));
            return;
        } else
        {
            a.startActivity(new Intent("android.settings.DISPLAY_SETTINGS"));
            return;
        }
    }

    w.View(ak ak1)
    {
        a = ak1;
        super();
    }
}
