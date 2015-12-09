// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            a

class a
    implements FilenameFilter
{

    final a a;

    public boolean accept(File file, String s)
    {
        return file.equals(com.cardinalblue.android.piccollage.controller.a.a(a)) && s.endsWith(".bundle");
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
