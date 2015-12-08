// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.util.Comparator;

final class csk
    implements Comparator
{

    csk(csj csj)
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (csl)obj;
        obj1 = (csl)obj1;
        return Long.signum(((csl) (obj)).b.lastModified() - ((csl) (obj1)).b.lastModified());
    }
}
