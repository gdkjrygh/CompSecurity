// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity

final class lz
    implements android.content.DialogInterface.OnClickListener
{

    final PhotoGridActivity a;

    lz(PhotoGridActivity photogridactivity)
    {
        a = photogridactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.GET_CONTENT");
        dialoginterface.setType("image/*");
        try
        {
            a.startActivityForResult(dialoginterface, 43523);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            dialoginterface.printStackTrace();
        }
    }
}
