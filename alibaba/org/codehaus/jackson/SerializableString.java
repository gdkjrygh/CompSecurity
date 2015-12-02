// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson;


public interface SerializableString
{

    public abstract char[] asQuotedChars();

    public abstract byte[] asQuotedUTF8();

    public abstract byte[] asUnquotedUTF8();

    public abstract int charLength();

    public abstract String getValue();
}
