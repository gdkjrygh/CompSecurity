// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class fap extends Exception
{

    public final List a;

    public fap(List list)
    {
        super("Files are not deletable.");
        a = list;
    }
}
