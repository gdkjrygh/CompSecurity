// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//            NativeCrashWriter, CodedOutputStream

private static abstract class children
{

    private final write children[];
    private final int tag;

    public int getPropertiesSize()
    {
        return 0;
    }

    public int getSize()
    {
        int i = getSizeNoTag();
        return i + CodedOutputStream.computeRawVarint32Size(i) + CodedOutputStream.computeTagSize(tag);
    }

    public int getSizeNoTag()
    {
        int j = getPropertiesSize();
        tag atag[] = children;
        int k = atag.length;
        for (int i = 0; i < k; i++)
        {
            j += atag[i].getSize();
        }

        return j;
    }

    public void write(CodedOutputStream codedoutputstream)
        throws IOException
    {
        codedoutputstream.writeTag(tag, 2);
        codedoutputstream.writeRawVarint32(getSizeNoTag());
        writeProperties(codedoutputstream);
        getSize agetsize[] = children;
        int j = agetsize.length;
        for (int i = 0; i < j; i++)
        {
            agetsize[i].write(codedoutputstream);
        }

    }

    public void writeProperties(CodedOutputStream codedoutputstream)
        throws IOException
    {
    }

    public transient (int i,  a[])
    {
        tag = i;
        if (a == null)
        {
            a = NativeCrashWriter.access$000();
        }
        children = a;
    }
}
