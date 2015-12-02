// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core.d;

import java.util.LinkedHashMap;

// Referenced classes of package com.qihoo360.mobilesafe.core.d:
//            e

class a extends LinkedHashMap
{

    final e a;

    protected boolean removeEldestEntry(java.util.Entry entry)
    {
        return size() > 200;
    }

    (e e1, int i, float f, boolean flag)
    {
        a = e1;
        super(i, f, flag);
    }
}
