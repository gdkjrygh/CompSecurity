// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.d.a;


public interface a
{

    public static final String a[] = {
        "START_DOCUMENT", "END_DOCUMENT", "START_TAG", "END_TAG", "TEXT", "CDSECT", "ENTITY_REF", "IGNORABLE_WHITESPACE", "PROCESSING_INSTRUCTION", "COMMENT", 
        "DOCDECL"
    };

    public abstract String getAttributeValue(String s, String s1);

    public abstract int getColumnNumber();

    public abstract int getLineNumber();

    public abstract String getName();

    public abstract String getPositionDescription();

    public abstract int next();

}
