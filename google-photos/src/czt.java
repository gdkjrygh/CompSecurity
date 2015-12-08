// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

public final class czt
{

    public final cok a;
    public final SparseArray b;
    public final pyj c;
    public final List d;
    public final cnq e;
    public final cnq f;

    public czt(cok cok1, SparseArray sparsearray, pyj pyj1, List list, cnq cnq, cnq cnq1)
    {
        a = (cok)b.a(cok1, "dimensions", null);
        b = (SparseArray)b.a(sparsearray, "clipIdentifierToMetrics", null);
        c = (pyj)b.a(pyj1, "globalThemeParams", null);
        d = Collections.unmodifiableList(list);
        e = cnq;
        f = cnq1;
    }
}
