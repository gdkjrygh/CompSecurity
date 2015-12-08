// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            as

final class av
    implements android.view.View.OnClickListener
{

    final as a;

    av(as as1)
    {
        a = as1;
        super();
    }

    public final void onClick(View view)
    {
        a.dismiss();
    }
}
