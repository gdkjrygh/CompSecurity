// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.CharMatcher;
import java.io.IOException;

// Referenced classes of package com.google.common.io:
//            BaseEncoding

final class dding
    implements dding
{

    int bitBuffer;
    int bitBufferLength;
    boolean hitPadding;
    final CharMatcher paddingMatcher;
    int readChars;
    final bitBufferLength this$0;
    final bitBufferLength val$reader;

    public final int read()
        throws IOException
    {
        byte byte0 = -1;
        int i;
label0:
        do
        {
            char c;
            do
            {
                i = val$reader.reader();
                if (i == -1)
                {
                    i = byte0;
                    if (!hitPadding)
                    {
                        i = byte0;
                        if (!cess._mth000(this._cls0.this).StartPosition(readChars))
                        {
                            throw new >((new StringBuilder("Invalid input length ")).append(readChars).toString());
                        }
                    }
                    break label0;
                }
                readChars = readChars + 1;
                c = (char)i;
                if (!paddingMatcher.matches(c))
                {
                    break;
                }
                if (!hitPadding && (readChars == 1 || !cess._mth000(this._cls0.this).StartPosition(readChars - 1)))
                {
                    throw new >((new StringBuilder("Padding cannot start at index ")).append(readChars).toString());
                }
                hitPadding = true;
            } while (true);
            if (hitPadding)
            {
                throw new >((new StringBuilder("Expected padding character but found '")).append(c).append("' at index ").append(readChars).toString());
            }
            bitBuffer = bitBuffer << cess._mth000(this._cls0.this)._fld0;
            bitBuffer = bitBuffer | cess._mth000(this._cls0.this)._mth0(c);
            bitBufferLength = bitBufferLength + cess._mth000(this._cls0.this)._fld0;
            if (bitBufferLength < 8)
            {
                continue;
            }
            bitBufferLength = bitBufferLength - 8;
            i = bitBuffer >> bitBufferLength & 0xff;
            break;
        } while (true);
        return i;
    }

    ()
    {
        this$0 = final_;
        val$reader = val.reader.this;
        super();
        bitBuffer = 0;
        bitBufferLength = 0;
        readChars = 0;
        hitPadding = false;
        paddingMatcher = dding();
    }
}
