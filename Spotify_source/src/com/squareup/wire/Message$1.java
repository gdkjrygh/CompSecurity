// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.wire;


// Referenced classes of package com.squareup.wire:
//            Message

final class tatype
{

    static final int a[];

    static 
    {
        a = new int[tatype.values().length];
        try
        {
            a[tatype.INT32.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            a[tatype.INT64.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            a[tatype.UINT32.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            a[tatype.UINT64.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            a[tatype.SINT32.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            a[tatype.SINT64.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            a[tatype.BOOL.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            a[tatype.ENUM.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            a[tatype.FIXED32.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            a[tatype.SFIXED32.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[tatype.FLOAT.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[tatype.FIXED64.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[tatype.SFIXED64.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[tatype.DOUBLE.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[tatype.STRING.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[tatype.BYTES.ordinal()] = 16;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[tatype.MESSAGE.ordinal()] = 17;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
