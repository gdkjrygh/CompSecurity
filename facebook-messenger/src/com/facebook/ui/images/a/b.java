// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.a;

import android.content.Context;
import com.google.common.b.j;
import java.io.File;
import java.io.OutputStream;

// Referenced classes of package com.facebook.ui.images.a:
//            a

class b
    implements j
{

    final File a;
    final a b;

    b(a a1, File file)
    {
        b = a1;
        a = file;
        super();
    }

    public OutputStream a()
    {
        return com.facebook.ui.images.a.a.a(b).openFileOutput(a.getName(), 0);
    }

    public Object b()
    {
        return a();
    }
}
