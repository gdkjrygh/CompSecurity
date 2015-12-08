// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import com.roidapp.photogrid.common.c;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageEditor

final class jb
    implements android.content.DialogInterface.OnClickListener
{

    final ImageEditor a;

    jb(ImageEditor imageeditor)
    {
        a = imageeditor;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        c.a("174", a);
    }
}
