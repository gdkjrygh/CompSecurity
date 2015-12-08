// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class aum
    implements atm
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "http", "https"
    })));
    private final atm b;

    public aum(atm atm1)
    {
        b = atm1;
    }

    public final atn a(Object obj, int i, int j, ani ani)
    {
        obj = new ata(((Uri)obj).toString());
        return b.a(obj, i, j, ani);
    }

    public final boolean a(Object obj)
    {
        obj = (Uri)obj;
        return a.contains(((Uri) (obj)).getScheme());
    }

}
