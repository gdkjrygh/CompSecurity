// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            PathSelector

final class lv
    implements android.view.View.OnClickListener
{

    final PathSelector a;

    lv(PathSelector pathselector)
    {
        a = pathselector;
        super();
    }

    public final void onClick(View view)
    {
        a.setResult(52227, new Intent());
        a.finish();
    }
}
