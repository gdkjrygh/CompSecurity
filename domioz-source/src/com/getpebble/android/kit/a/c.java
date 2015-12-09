// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.getpebble.android.kit.a;


// Referenced classes of package com.getpebble.android.kit.a:
//            f

public final class c extends RuntimeException
{

    public c(f f1, f f2)
    {
        super(String.format("Expected type '%s', but got '%s' for key 0x%08x", new Object[] {
            f1.name(), f2.name(), Long.valueOf(0L)
        }));
    }
}
