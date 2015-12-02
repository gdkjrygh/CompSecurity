// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.animatablelistview;


// Referenced classes of package com.facebook.widget.animatablelistview:
//            o

class p
{

    static final int a[];

    static 
    {
        a = new int[o.values().length];
        try
        {
            a[o.REVEAL_WITH_ANIMATION_DOWN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[o.REVEAL_WITH_ANIMATION_UP.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[o.HIDE_WITH_ANIMATION_DOWN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[o.HIDE_WITH_ANIMATION_UP.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
