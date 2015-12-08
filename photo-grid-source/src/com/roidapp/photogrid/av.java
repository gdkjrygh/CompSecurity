// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.content.DialogInterface;
import java.io.File;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

final class av
    implements android.content.DialogInterface.OnClickListener
{

    final File a;
    final MainPage b;

    av(MainPage mainpage, File file)
    {
        b = mainpage;
        a = file;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.delete();
    }
}
