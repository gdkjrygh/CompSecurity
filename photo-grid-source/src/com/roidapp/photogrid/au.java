// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.content.DialogInterface;
import android.content.Intent;
import com.roidapp.photogrid.release.PhotoGridActivity;
import java.io.File;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

final class au
    implements android.content.DialogInterface.OnClickListener
{

    final File a;
    final MainPage b;

    au(MainPage mainpage, File file)
    {
        b = mainpage;
        a = file;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (!b.isFinishing())
        {
            dialoginterface = new Intent(b, com/roidapp/photogrid/release/PhotoGridActivity);
            dialoginterface.putExtra("isCrash", true);
            dialoginterface.putExtra("crashFile", a.getAbsolutePath());
            b.startActivity(dialoginterface);
            b.finish();
        }
    }
}
