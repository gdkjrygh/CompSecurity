// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import java.io.File;

// Referenced classes of package com.kik.cache:
//            s

public final class bb extends s
{

    public bb(File file, String s1)
    {
        super(file, s1);
    }

    protected final String b(String s1)
    {
        s1 = super.b(s1);
        return (new StringBuilder()).append(s1).append(".mp4").toString();
    }
}
