// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.content.res.Resources;
import com.pandora.android.provider.b;

public class v
{

    public static String a(p.cw.d.a a1)
    {
        int i;
        i = 0;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[p.cw.d.a.values().length];
                try
                {
                    a[p.cw.d.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cw.d.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cw.d.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cw.d.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[a1.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("getMessageFromCode: unknown code ").append(a1).toString());

        case 1: // '\001'
        case 4: // '\004'
            break;

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_77;

        case 2: // '\002'
            i = 0x7f08017a;
            break;
        }
_L1:
        if (i == 0)
        {
            return "";
        } else
        {
            return b.a.h().getResources().getString(i);
        }
        i = 0x7f080150;
          goto _L1
    }
}
