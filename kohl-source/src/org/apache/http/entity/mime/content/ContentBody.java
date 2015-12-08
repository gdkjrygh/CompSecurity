// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime.content;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.apache.http.entity.mime.content:
//            ContentDescriptor

public interface ContentBody
    extends ContentDescriptor
{

    public abstract String getFilename();

    public abstract void writeTo(OutputStream outputstream)
        throws IOException;
}
