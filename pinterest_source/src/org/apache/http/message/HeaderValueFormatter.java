// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.util.CharArrayBuffer;

public interface HeaderValueFormatter
{

    public abstract CharArrayBuffer formatElements(CharArrayBuffer chararraybuffer, HeaderElement aheaderelement[], boolean flag);

    public abstract CharArrayBuffer formatHeaderElement(CharArrayBuffer chararraybuffer, HeaderElement headerelement, boolean flag);

    public abstract CharArrayBuffer formatNameValuePair(CharArrayBuffer chararraybuffer, NameValuePair namevaluepair, boolean flag);

    public abstract CharArrayBuffer formatParameters(CharArrayBuffer chararraybuffer, NameValuePair anamevaluepair[], boolean flag);
}
