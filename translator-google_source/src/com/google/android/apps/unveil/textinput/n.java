// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;


final class n
{

    static final int a[];

    static 
    {
        a = new int[TextInput.SnapMode.values().length];
        try
        {
            a[TextInput.SnapMode.DEBUG_BOTH_HIGHRES.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[TextInput.SnapMode.TAKE_PICTURE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[TextInput.SnapMode.DEBUG_BOTH_LOWRES.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[TextInput.SnapMode.RECENT_FRAME.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
