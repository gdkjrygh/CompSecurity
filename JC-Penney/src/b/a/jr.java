// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package b.a:
//            ks, jq, ji

public final class jr extends ks
{

    private final List d;

    public jr(ji ji)
    {
        super(null, ji);
        ji = new jq();
        ji.a(0);
        d = Collections.singletonList(ji);
    }

    public final Collection a()
    {
        return d;
    }

    protected final void b()
    {
    }
}
