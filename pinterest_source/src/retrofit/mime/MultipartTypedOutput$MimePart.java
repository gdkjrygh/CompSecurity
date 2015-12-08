// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.mime;

import java.io.OutputStream;

// Referenced classes of package retrofit.mime:
//            MultipartTypedOutput, TypedOutput

final class boundary
{

    private final TypedOutput body;
    private final String boundary;
    private boolean isBuilt;
    private final boolean isFirst;
    private final String name;
    private byte partBoundary[];
    private byte partHeader[];
    private final String transferEncoding;

    private void build()
    {
        if (isBuilt)
        {
            return;
        } else
        {
            partBoundary = MultipartTypedOutput.access$000(boundary, isFirst, false);
            partHeader = MultipartTypedOutput.access$100(name, transferEncoding, body);
            isBuilt = true;
            return;
        }
    }

    public final long size()
    {
        long l = -1L;
        build();
        if (body.length() > -1L)
        {
            l = body.length() + (long)partBoundary.length + (long)partHeader.length;
        }
        return l;
    }

    public final void writeTo(OutputStream outputstream)
    {
        build();
        outputstream.write(partBoundary);
        outputstream.write(partHeader);
        body.writeTo(outputstream);
    }

    public (String s, String s1, TypedOutput typedoutput, String s2, boolean flag)
    {
        name = s;
        transferEncoding = s1;
        body = typedoutput;
        isFirst = flag;
        boundary = s2;
    }
}
