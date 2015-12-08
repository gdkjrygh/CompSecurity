// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text;

import java.text.Format;
import java.util.Locale;

public interface FormatFactory
{

    public abstract Format getFormat(String s, String s1, Locale locale);
}
