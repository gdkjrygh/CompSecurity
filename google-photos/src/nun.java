// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nun extends nzc
{

    private final pkk a;

    public nun(Context context, nyg nyg, pkk pkk1)
    {
        super(context, nyg, "mutatephotofilters", new pcb(), new pcc());
        if (pkk1.a == null)
        {
            throw new IllegalArgumentException("Missing photoRef");
        }
        if (pkk1.c == null)
        {
            throw new IllegalArgumentException("Missing params");
        }
        if (pkk1.a.a != null && pkk1.a.b == null)
        {
            throw new IllegalArgumentException("ownerId without photoId");
        }
        if (pkk1.a.b != null && pkk1.a.a == null)
        {
            throw new IllegalArgumentException("photoId without ownerId");
        }
        if (pkk1.c.a == null)
        {
            throw new IllegalArgumentException("MutateFilterParams without versionId");
        } else
        {
            a = pkk1;
            return;
        }
    }

    protected final void a(qlw qlw)
    {
        ((pcb)qlw).a = a;
    }
}
