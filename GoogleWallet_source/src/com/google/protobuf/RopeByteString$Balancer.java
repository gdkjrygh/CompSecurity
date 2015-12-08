// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.util.Arrays;
import java.util.Stack;

// Referenced classes of package com.google.protobuf:
//            RopeByteString, ByteString

static final class <init>
{

    private final Stack prefixesStack;

    private ByteString balance(ByteString bytestring, ByteString bytestring1)
    {
        doBalance(bytestring);
        doBalance(bytestring1);
        for (bytestring = (ByteString)prefixesStack.pop(); !prefixesStack.isEmpty(); bytestring = new RopeByteString((ByteString)prefixesStack.pop(), bytestring, null)) { }
        return bytestring;
    }

    private void doBalance(ByteString bytestring)
    {
        if (bytestring.isBalanced())
        {
            insert(bytestring);
            return;
        }
        if (bytestring instanceof RopeByteString)
        {
            bytestring = (RopeByteString)bytestring;
            doBalance(RopeByteString.access$400(bytestring));
            doBalance(RopeByteString.access$500(bytestring));
            return;
        } else
        {
            bytestring = String.valueOf(bytestring.getClass());
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(bytestring).length() + 49)).append("Has a new type of ByteString been created? Found ").append(bytestring).toString());
        }
    }

    private static int getDepthBinForLength(int i)
    {
        int j = Arrays.binarySearch(RopeByteString.access$600(), i);
        i = j;
        if (j < 0)
        {
            i = -(j + 1) - 1;
        }
        return i;
    }

    private void insert(ByteString bytestring)
    {
        int i = getDepthBinForLength(bytestring.size());
        int k = RopeByteString.access$600()[i + 1];
        if (prefixesStack.isEmpty() || ((ByteString)prefixesStack.peek()).size() >= k)
        {
            prefixesStack.push(bytestring);
            return;
        }
        i = RopeByteString.access$600()[i];
        Object obj;
        for (obj = (ByteString)prefixesStack.pop(); !prefixesStack.isEmpty() && ((ByteString)prefixesStack.peek()).size() < i; obj = new RopeByteString((ByteString)prefixesStack.pop(), ((ByteString) (obj)), null)) { }
        bytestring = new RopeByteString(((ByteString) (obj)), bytestring, null);
        do
        {
            if (prefixesStack.isEmpty())
            {
                break;
            }
            int j = getDepthBinForLength(bytestring.size());
            j = RopeByteString.access$600()[j + 1];
            if (((ByteString)prefixesStack.peek()).size() >= j)
            {
                break;
            }
            bytestring = new RopeByteString((ByteString)prefixesStack.pop(), bytestring, null);
        } while (true);
        prefixesStack.push(bytestring);
    }


    private ()
    {
        prefixesStack = new Stack();
    }

    prefixesStack(prefixesStack prefixesstack)
    {
        this();
    }
}
