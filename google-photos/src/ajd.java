// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import java.util.Comparator;

final class ajd
    implements Comparator
{

    ajd(ajc ajc)
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (Pair)obj;
        return (int)(((ajb)((Pair)obj1).second).b - ((ajb)((Pair) (obj)).second).b);
    }
}
