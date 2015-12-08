// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageEditor, aq

final class ja
    implements android.view.View.OnClickListener
{

    final aq a;
    final ImageEditor b;

    ja(ImageEditor imageeditor, aq aq)
    {
        b = imageeditor;
        a = aq;
        super();
    }

    public final void onClick(View view)
    {
        b.a(a);
    }
}
