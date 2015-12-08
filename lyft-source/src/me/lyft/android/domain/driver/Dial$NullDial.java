// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;


// Referenced classes of package me.lyft.android.domain.driver:
//            Dial

class T extends Dial
{

    private static final Dial INSTANCE = new <init>();

    static Dial getInstance()
    {
        return INSTANCE;
    }

    public boolean isNull()
    {
        return true;
    }


    private ()
    {
        super(T, "", "", Integer.valueOf(0), Integer.valueOf(0), Boolean.valueOf(false));
    }
}
