// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

// Referenced classes of package retrofit.mime:
//            TypedOutput

public final class MultipartTypedOutput
    implements TypedOutput
{

    public static final String DEFAULT_TRANSFER_ENCODING = "binary";
    private final String boundary;
    private final byte footer[];
    private long length;
    private final List mimeParts;

    public MultipartTypedOutput()
    {
        this(UUID.randomUUID().toString());
    }

    MultipartTypedOutput(String s)
    {
        mimeParts = new LinkedList();
        boundary = s;
        footer = buildBoundary(s, false, true);
        length = footer.length;
    }

    private static byte[] buildBoundary(String s, boolean flag, boolean flag1)
    {
        StringBuilder stringbuilder;
        try
        {
            stringbuilder = new StringBuilder(s.length() + 8);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("Unable to write multipart boundary", s);
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        stringbuilder.append("\r\n");
        stringbuilder.append("--");
        stringbuilder.append(s);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        stringbuilder.append("--");
        stringbuilder.append("\r\n");
        s = stringbuilder.toString().getBytes("UTF-8");
        return s;
    }

    private static byte[] buildHeader(String s, String s1, TypedOutput typedoutput)
    {
        StringBuilder stringbuilder;
        long l;
        try
        {
            stringbuilder = new StringBuilder(128);
            stringbuilder.append("Content-Disposition: form-data; name=\"");
            stringbuilder.append(s);
            s = typedoutput.fileName();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("Unable to write multipart header", s);
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        stringbuilder.append("\"; filename=\"");
        stringbuilder.append(s);
        stringbuilder.append("\"\r\nContent-Type: ");
        stringbuilder.append(typedoutput.mimeType());
        l = typedoutput.length();
        if (l == -1L)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        stringbuilder.append("\r\nContent-Length: ").append(l);
        stringbuilder.append("\r\nContent-Transfer-Encoding: ");
        stringbuilder.append(s1);
        stringbuilder.append("\r\n\r\n");
        s = stringbuilder.toString().getBytes("UTF-8");
        return s;
    }

    public final void addPart(String s, String s1, TypedOutput typedoutput)
    {
        if (s == null)
        {
            throw new NullPointerException("Part name must not be null.");
        }
        if (s1 == null)
        {
            throw new NullPointerException("Transfer encoding must not be null.");
        }
        if (typedoutput == null)
        {
            throw new NullPointerException("Part body must not be null.");
        }
        s = new MimePart(s, s1, typedoutput, boundary, mimeParts.isEmpty());
        mimeParts.add(s);
        long l = s.size();
        if (l == -1L)
        {
            length = -1L;
        } else
        if (length != -1L)
        {
            length = l + length;
            return;
        }
    }

    public final void addPart(String s, TypedOutput typedoutput)
    {
        addPart(s, "binary", typedoutput);
    }

    public final String fileName()
    {
        return null;
    }

    public final int getPartCount()
    {
        return mimeParts.size();
    }

    final List getParts()
    {
        ArrayList arraylist = new ArrayList(mimeParts.size());
        ByteArrayOutputStream bytearrayoutputstream;
        for (Iterator iterator = mimeParts.iterator(); iterator.hasNext(); arraylist.add(bytearrayoutputstream.toByteArray()))
        {
            MimePart mimepart = (MimePart)iterator.next();
            bytearrayoutputstream = new ByteArrayOutputStream();
            mimepart.writeTo(bytearrayoutputstream);
        }

        return arraylist;
    }

    public final long length()
    {
        return length;
    }

    public final String mimeType()
    {
        return (new StringBuilder("multipart/form-data; boundary=")).append(boundary).toString();
    }

    public final void writeTo(OutputStream outputstream)
    {
        for (Iterator iterator = mimeParts.iterator(); iterator.hasNext(); ((MimePart)iterator.next()).writeTo(outputstream)) { }
        outputstream.write(footer);
    }



    private class MimePart
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
                partBoundary = MultipartTypedOutput.buildBoundary(boundary, isFirst, false);
                partHeader = MultipartTypedOutput.buildHeader(name, transferEncoding, body);
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

        public MimePart(String s, String s1, TypedOutput typedoutput, String s2, boolean flag)
        {
            name = s;
            transferEncoding = s1;
            body = typedoutput;
            isFirst = flag;
            boundary = s2;
        }
    }

}
