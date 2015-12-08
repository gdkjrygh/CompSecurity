// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;

public final class ass
    implements atm
{

    private final asx a;

    public ass(asx asx)
    {
        a = asx;
    }

    public final atn a(Object obj, int i, int j, ani ani)
    {
        obj = (File)obj;
        return new atn(new azw(obj), new asw(((File) (obj)), a));
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
