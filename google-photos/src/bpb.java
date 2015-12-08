// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;
import java.util.Iterator;
import java.util.List;

final class bpb
    implements ba
{

    private bpa a;

    bpb(bpa bpa1)
    {
        a = bpa1;
        super();
    }

    public final void aa_()
    {
        bpa.a(a);
        if (bpa.b(a).e() < 2)
        {
            am am = bpa.b(a).a(bpa.w());
            if (am instanceof PlayerScreenFragment)
            {
                ((PlayerScreenFragment)am).c_(true);
            }
        }
        for (Iterator iterator = bpa.c(a).iterator(); iterator.hasNext(); ((bph)iterator.next()).a()) { }
    }
}
