// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ciu
    implements ded
{

    public final cnn a;
    public final ckg b[];
    public final List c = new ArrayList();

    public ciu(cnn cnn1)
    {
        a = (cnn)b.a(cnn1, "sequence", null);
        b = new ckg[cnn1.a()];
    }

    public final void a()
    {
        ckg ackg[] = b;
        int j = ackg.length;
        for (int i = 0; i < j; i++)
        {
            dee.a(ackg[i]);
        }

        for (Iterator iterator = c.iterator(); iterator.hasNext(); dee.a((ded)iterator.next())) { }
    }
}
