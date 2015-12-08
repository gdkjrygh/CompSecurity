// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens;


// Referenced classes of package com.google.android.libraries.wordlens:
//            QVTextAlignment

final class e
{

    static final int a[];

    static 
    {
        a = new int[QVTextAlignment.values().length];
        try
        {
            a[QVTextAlignment.kQVTextAlignment_Left.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[QVTextAlignment.kQVTextAlignment_Right.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[QVTextAlignment.kQVTextAlignment_Justified.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[QVTextAlignment.kMaxQVTextAlignment.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[QVTextAlignment.kQVTextAlignment_Center.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[QVTextAlignment.kQVTextAlignment_Default.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
