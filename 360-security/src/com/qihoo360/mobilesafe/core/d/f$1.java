// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core.d;

import java.util.LinkedHashMap;

// Referenced classes of package com.qihoo360.mobilesafe.core.d:
//            f

class a extends LinkedHashMap
{

    final f a;

    protected boolean removeEldestEntry(java.util.Entry entry)
    {
        return size() > 200;
    }

    (f f1, int i, float f2, boolean flag)
    {
        a = f1;
        super(i, f2, flag);
    }
}
