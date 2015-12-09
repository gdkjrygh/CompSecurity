// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import com.jcp.util.au;

// Referenced classes of package com.jcp.fragments:
//            gh

class gl
    implements android.view.View.OnClickListener
{

    final String a;
    final gh b;

    gl(gh gh1, String s)
    {
        b = gh1;
        a = s;
        super();
    }

    public void onClick(View view)
    {
        au.c(b.i(), a);
    }
}
