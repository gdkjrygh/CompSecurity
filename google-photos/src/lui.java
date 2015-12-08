// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lui
{

    public lui()
    {
    }

    public final luh a(int i, luj luj)
    {
        if (android.os.Build.VERSION.SDK_INT < 12)
        {
            return new lto(0x100000, luj);
        } else
        {
            return new lry(0x100000, luj);
        }
    }
}
