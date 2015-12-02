// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.picking;

import android.content.Context;
import com.google.common.b.j;
import java.io.OutputStream;

// Referenced classes of package com.facebook.orca.photos.picking:
//            PickMediaOperation

class g
    implements j
{

    final String a;
    final PickMediaOperation b;

    g(PickMediaOperation pickmediaoperation, String s)
    {
        b = pickmediaoperation;
        a = s;
        super();
    }

    public OutputStream a()
    {
        return b.n().openFileOutput(a, 3);
    }

    public Object b()
    {
        return a();
    }
}
