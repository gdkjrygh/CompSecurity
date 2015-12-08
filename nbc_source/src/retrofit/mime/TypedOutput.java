// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.mime;

import java.io.IOException;
import java.io.OutputStream;

public interface TypedOutput
{

    public abstract String fileName();

    public abstract long length();

    public abstract String mimeType();

    public abstract void writeTo(OutputStream outputstream)
        throws IOException;
}
