// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.content.DialogInterface;

// Referenced classes of package net.hockeyapp.android:
//            PaintActivity

final class a
    implements android.content.OnClickListener
{

    private PaintActivity a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            a.finish();
            break;
        }
    }

    kListener(PaintActivity paintactivity)
    {
        a = paintactivity;
        super();
    }
}
