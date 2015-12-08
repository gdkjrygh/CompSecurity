// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package brut.util;

import java.io.DataInput;
import java.io.IOException;

// Referenced classes of package brut.util:
//            DataInputDelegate

public class ExtDataInput extends DataInputDelegate
{

    public ExtDataInput(DataInput datainput)
    {
        super(datainput);
    }

    public int[] readIntArray(int i)
        throws IOException
    {
        int ai[] = new int[i];
        for (int j = 0; j < i; j++)
        {
            ai[j] = readInt();
        }

        return ai;
    }

    public void skipCheckInt(int i)
        throws IOException
    {
        int j = readInt();
        if (j != i)
        {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            }));
        } else
        {
            return;
        }
    }

    public void skipInt()
        throws IOException
    {
        skipBytes(4);
    }
}
