// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.android.glue.organisms.header.transformations.TransformationSet;

public final class dfa extends dez
{

    public TransformationSet a;

    public dfa(float f, float f1)
    {
        super(f, f1);
    }

    public final dex a()
    {
        return new dex(d, e, 0, this);
    }

    protected final void a(TransformationSet transformationset, float f, float f1)
    {
        a = transformationset;
    }

    public final TransformationSet c()
    {
        return a;
    }
}
