// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.mime;

import java.io.InputStream;

public interface TypedInput
{

    public abstract InputStream in();

    public abstract long length();

    public abstract String mimeType();
}
