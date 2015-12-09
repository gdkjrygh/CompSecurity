// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tjeannin.provigen.annotation;

import java.lang.annotation.Annotation;

public interface Column
    extends Annotation
{
    public static class Type
    {

        public static final String BLOB = "BLOB";
        public static final String INTEGER = "INTEGER";
        public static final String REAL = "REAL";
        public static final String TEXT = "TEXT";

        public Type()
        {
        }
    }


    public abstract String value();
}
