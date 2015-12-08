// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;


public interface TextFilterable
{
    public static interface StringFilter
    {

        public abstract boolean matches(String s, String s1);
    }


    public static final StringFilter CONTAINS = new StringFilter() {

        public final boolean matches(String s, String s1)
        {
            return s.contains(s1);
        }

    };
    public static final StringFilter STARTS_WITH = new StringFilter() {

        public final boolean matches(String s, String s1)
        {
            return s.startsWith(s1);
        }

    };
    public static final StringFilter WORD_STARTS_WITH = new StringFilter() {

        public final boolean matches(String s, String s1)
        {
            return s.startsWith(s1) || s.contains((new StringBuilder(" ")).append(s1).toString());
        }

    };

}
