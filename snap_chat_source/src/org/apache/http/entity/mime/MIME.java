// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime;

import java.nio.charset.Charset;
import org.apache.http.Consts;

public final class MIME
{

    public static final Charset DEFAULT_CHARSET;
    public static final Charset UTF8_CHARSET;

    static 
    {
        DEFAULT_CHARSET = Consts.ASCII;
        UTF8_CHARSET = Consts.UTF_8;
    }
}
