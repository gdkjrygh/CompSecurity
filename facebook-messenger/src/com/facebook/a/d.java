// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import java.io.IOException;

// Referenced classes of package com.facebook.a:
//            c

public class d extends c
{

    public d(String s, IOException ioexception)
    {
        super((new StringBuilder()).append("I/O error while loading: ").append(s).toString(), ioexception);
    }
}
