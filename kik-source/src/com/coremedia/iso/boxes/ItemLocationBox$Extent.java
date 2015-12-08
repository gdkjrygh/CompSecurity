// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.IsoTypeWriterVariable;
import java.nio.ByteBuffer;

// Referenced classes of package com.coremedia.iso.boxes:
//            ItemLocationBox

public class ize
{

    public long extentIndex;
    public long extentLength;
    public long extentOffset;
    final ItemLocationBox this$0;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ize)obj;
            if (extentIndex != ((extentIndex) (obj)).extentIndex)
            {
                return false;
            }
            if (extentLength != ((extentLength) (obj)).extentLength)
            {
                return false;
            }
            if (extentOffset != ((extentOffset) (obj)).extentOffset)
            {
                return false;
            }
        }
        return true;
    }

    public void getContent(ByteBuffer bytebuffer)
    {
        if (getVersion() == 1 && indexSize > 0)
        {
            IsoTypeWriterVariable.write(extentIndex, bytebuffer, indexSize);
        }
        IsoTypeWriterVariable.write(extentOffset, bytebuffer, offsetSize);
        IsoTypeWriterVariable.write(extentLength, bytebuffer, lengthSize);
    }

    public int getSize()
    {
        int i;
        if (indexSize > 0)
        {
            i = indexSize;
        } else
        {
            i = 0;
        }
        return i + offsetSize + lengthSize;
    }

    public int hashCode()
    {
        return ((int)(extentOffset ^ extentOffset >>> 32) * 31 + (int)(extentLength ^ extentLength >>> 32)) * 31 + (int)(extentIndex ^ extentIndex >>> 32);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Extent");
        stringbuilder.append("{extentOffset=").append(extentOffset);
        stringbuilder.append(", extentLength=").append(extentLength);
        stringbuilder.append(", extentIndex=").append(extentIndex);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public (long l, long l1, long l2)
    {
        this$0 = ItemLocationBox.this;
        super();
        extentOffset = l;
        extentLength = l1;
        extentIndex = l2;
    }

    public extentIndex(ByteBuffer bytebuffer)
    {
        this$0 = ItemLocationBox.this;
        super();
        if (getVersion() == 1 && indexSize > 0)
        {
            extentIndex = IsoTypeReaderVariable.read(bytebuffer, indexSize);
        }
        extentOffset = IsoTypeReaderVariable.read(bytebuffer, offsetSize);
        extentLength = IsoTypeReaderVariable.read(bytebuffer, lengthSize);
    }
}
