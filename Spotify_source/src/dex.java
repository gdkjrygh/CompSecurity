// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.android.glue.organisms.header.transformations.TransformationSet;
import java.util.List;

public class dex extends dez
{

    dez a;
    int b;
    protected TransformationSet c;

    public dex(float f, float f1, int i, dez dez1)
    {
        super(f, f1);
        b = i;
        a = dez1;
        c = new TransformationSet();
        TransformationSet transformationset = c;
        if (i == 0)
        {
            dez1 = com.spotify.android.glue.organisms.header.transformations.TransformationSet.ExecutionOrder.a;
        } else
        {
            dez1 = com.spotify.android.glue.organisms.header.transformations.TransformationSet.ExecutionOrder.b;
        }
        transformationset.a = dez1;
    }

    public final dex a()
    {
        return new dex(d, e, 1, this);
    }

    public final dey a(float f, float f1)
    {
        Object obj = new dfd(d, e, f, f1);
        obj = new dfc(((dfd) (obj)).a, ((dfd) (obj)).b, ((dfd) (obj)).c, ((dfd) (obj)).d);
        c.b.add(obj);
        if (b == 0)
        {
            d = f;
            e = f1;
        }
        return dey.a(this, ((dfc) (obj)));
    }

    protected final void a(TransformationSet transformationset, float f, float f1)
    {
        c.b.add(transformationset);
        if (b == 0)
        {
            d = f;
            e = f1;
        }
    }

    public final dez b()
    {
        a.a(c, d, e);
        return a;
    }
}
