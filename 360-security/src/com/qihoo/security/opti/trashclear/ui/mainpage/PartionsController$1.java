// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;


// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            PartionsController

static class rtionType
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[orageState.values().length];
        try
        {
            b[orageState.INTERNAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[orageState.INTERNAL_SYSTEM.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[orageState.INTERNAL_EXTERNAL.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[orageState.SYSTEM_INTERNAL_EXTERNAL.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[rtionType.values().length];
        try
        {
            a[rtionType.SYSTEM.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[rtionType.INTERNAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[rtionType.EXTERNAL.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
