// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package eu.janmuller.android.simplecropimage;

import android.app.ProgressDialog;
import java.util.ArrayList;

// Referenced classes of package eu.janmuller.android.simplecropimage:
//            e, b

final class a
    implements Runnable
{

    final a a;

    public final void run()
    {
        b b1 = a.a;
        a a1 = a;
        b1.f.remove(a1);
        if (a.a.getWindow() != null)
        {
            a.a.dismiss();
        }
    }

    ( )
    {
        a = ;
        super();
    }
}
