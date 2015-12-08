// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.FutureTask;

final class gvy extends FutureTask
    implements Comparable
{

    private final gvc a;

    public gvy(gvc gvc1)
    {
        super(gvc1, null);
        a = gvc1;
    }

    public final int compareTo(Object obj)
    {
        obj = (gvy)obj;
        com.squareup.picasso.Picasso.Priority priority = a.o;
        com.squareup.picasso.Picasso.Priority priority1 = ((gvy) (obj)).a.o;
        if (priority == priority1)
        {
            return a.a - ((gvy) (obj)).a.a;
        } else
        {
            return priority1.ordinal() - priority.ordinal();
        }
    }
}
