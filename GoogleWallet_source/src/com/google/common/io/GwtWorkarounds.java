// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;

final class GwtWorkarounds
{
    static interface ByteInput
    {

        public abstract int read()
            throws IOException;
    }

    static interface ByteOutput
    {

        public abstract void close()
            throws IOException;

        public abstract void write(byte byte0)
            throws IOException;
    }

    static interface CharInput
    {

        public abstract int read()
            throws IOException;
    }

    static interface CharOutput
    {

        public abstract void write(char c)
            throws IOException;
    }


    static CharInput asCharInput(CharSequence charsequence)
    {
        Preconditions.checkNotNull(charsequence);
        return new CharInput(charsequence) {

            int index;
            final CharSequence val$chars;

            public final int read()
            {
                if (index < chars.length())
                {
                    CharSequence charsequence1 = chars;
                    int i = index;
                    index = i + 1;
                    return charsequence1.charAt(i);
                } else
                {
                    return -1;
                }
            }

            
            {
                chars = charsequence;
                super();
                index = 0;
            }
        };
    }

    static CharOutput stringBuilderOutput(int i)
    {
        return new CharOutput(new StringBuilder(i)) {

            final StringBuilder val$builder;

            public final String toString()
            {
                return builder.toString();
            }

            public final void write(char c)
            {
                builder.append(c);
            }

            
            {
                builder = stringbuilder;
                super();
            }
        };
    }
}
