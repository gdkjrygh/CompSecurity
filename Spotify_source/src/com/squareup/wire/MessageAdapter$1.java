// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.wire;


// Referenced classes of package com.squareup.wire:
//            MessageAdapter, WireType

public final class 
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[WireType.values().length];
        try
        {
            b[WireType.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror22) { }
        try
        {
            b[WireType.f.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror21) { }
        try
        {
            b[WireType.b.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror20) { }
        try
        {
            b[WireType.c.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror19) { }
        try
        {
            b[WireType.d.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            b[WireType.e.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        a = new int[values().length];
        try
        {
            a[INT32.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            a[INT64.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            a[UINT64.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            a[UINT32.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            a[SINT32.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            a[SINT64.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            a[BOOL.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            a[ENUM.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            a[STRING.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            a[BYTES.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[MESSAGE.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[FIXED32.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[SFIXED32.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[FLOAT.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[FIXED64.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[SFIXED64.ordinal()] = 16;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[DOUBLE.ordinal()] = 17;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
