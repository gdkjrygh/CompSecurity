// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            PickFolder

final class px
    implements android.view.View.OnClickListener
{

    final PickFolder a;

    px(PickFolder pickfolder)
    {
        a = pickfolder;
        super();
    }

    public final void onClick(View view)
    {
        PickFolder.c(a);
    }
}
