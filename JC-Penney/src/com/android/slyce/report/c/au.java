// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.graphics.Bitmap;
import android.view.View;
import java.util.List;

// Referenced classes of package com.android.slyce.report.c:
//            an, a

public class au extends an
{

    private final a a;
    private final a b;

    public au(List list, a a1, a a2)
    {
        super(list);
        a = a1;
        b = a2;
    }

    public void a()
    {
    }

    public void a(View view)
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        Object aobj[] = a.a();
        if (1 != aobj.length) goto _L2; else goto _L3
_L3:
        Object obj;
        Object obj1;
        obj = aobj[0];
        obj1 = b.a(view);
        if (obj != obj1) goto _L5; else goto _L4
_L4:
        return;
_L5:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof Bitmap) || !(obj1 instanceof Bitmap)) goto _L7; else goto _L6
_L6:
        if (((Bitmap)obj).sameAs((Bitmap)obj1)) goto _L4; else goto _L2
_L2:
        a.a(view);
        return;
_L7:
        if (obj.equals(obj1))
        {
            return;
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    public volatile void b(View view)
    {
        super.b(view);
    }
}
