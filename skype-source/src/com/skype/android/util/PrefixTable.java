// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.support.v4.util.j;

public class PrefixTable
{
    private static final class a
    {

        Object a;

        public final String toString()
        {
            return (new StringBuilder("{key:\"key\", value:\"")).append(a).append("\"}").toString();
        }

        a()
        {
        }
    }


    private j a;
    private a b;

    public PrefixTable()
    {
        a = new j();
        b = new a();
    }
}
