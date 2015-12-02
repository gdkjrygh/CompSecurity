// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;

import java.util.List;
import java.util.Random;

// Referenced classes of package com.google.android.exoplayer.chunk:
//            FormatEvaluator, Format

public final class 
    implements FormatEvaluator
{

    private final Random a = new Random();

    public final void a()
    {
    }

    public final void a(List list, long l, Format aformat[],  )
    {
        list = aformat[a.nextInt(aformat.length)];
        if (.a != null && !.a.equals(list))
        {
            .a = 3;
        }
        .a = list;
    }

    public final void b()
    {
    }

    public ()
    {
    }
}
