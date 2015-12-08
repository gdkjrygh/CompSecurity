// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

class Huffman
{
    private static final class Node
    {

        private final Node children[];
        private final int symbol;
        private final int terminalBits;




        Node()
        {
            children = new Node[256];
            symbol = 0;
            terminalBits = 0;
        }

        Node(int i, int j)
        {
            children = null;
            symbol = i;
            j &= 7;
            i = j;
            if (j == 0)
            {
                i = 8;
            }
            terminalBits = i;
        }
    }


    private static final int CODES[] = {
        8184, 0x7fffd8, 0xfffffe2, 0xfffffe3, 0xfffffe4, 0xfffffe5, 0xfffffe6, 0xfffffe7, 0xfffffe8, 0xffffea, 
        0x3ffffffc, 0xfffffe9, 0xfffffea, 0x3ffffffd, 0xfffffeb, 0xfffffec, 0xfffffed, 0xfffffee, 0xfffffef, 0xffffff0, 
        0xffffff1, 0xffffff2, 0x3ffffffe, 0xffffff3, 0xffffff4, 0xffffff5, 0xffffff6, 0xffffff7, 0xffffff8, 0xffffff9, 
        0xffffffa, 0xffffffb, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 
        1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 
        2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 
        32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 
        97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 
        107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 
        253, 8187, 0x7fff0, 8188, 16380, 34, 32765, 3, 35, 4, 
        36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 
        42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 
        121, 122, 123, 32766, 2044, 16381, 8189, 0xffffffc, 0xfffe6, 0x3fffd2, 
        0xfffe7, 0xfffe8, 0x3fffd3, 0x3fffd4, 0x3fffd5, 0x7fffd9, 0x3fffd6, 0x7fffda, 0x7fffdb, 0x7fffdc, 
        0x7fffdd, 0x7fffde, 0xffffeb, 0x7fffdf, 0xffffec, 0xffffed, 0x3fffd7, 0x7fffe0, 0xffffee, 0x7fffe1, 
        0x7fffe2, 0x7fffe3, 0x7fffe4, 0x1fffdc, 0x3fffd8, 0x7fffe5, 0x3fffd9, 0x7fffe6, 0x7fffe7, 0xffffef, 
        0x3fffda, 0x1fffdd, 0xfffe9, 0x3fffdb, 0x3fffdc, 0x7fffe8, 0x7fffe9, 0x1fffde, 0x7fffea, 0x3fffdd, 
        0x3fffde, 0xfffff0, 0x1fffdf, 0x3fffdf, 0x7fffeb, 0x7fffec, 0x1fffe0, 0x1fffe1, 0x3fffe0, 0x1fffe2, 
        0x7fffed, 0x3fffe1, 0x7fffee, 0x7fffef, 0xfffea, 0x3fffe2, 0x3fffe3, 0x3fffe4, 0x7ffff0, 0x3fffe5, 
        0x3fffe6, 0x7ffff1, 0x3ffffe0, 0x3ffffe1, 0xfffeb, 0x7fff1, 0x3fffe7, 0x7ffff2, 0x3fffe8, 0x1ffffec, 
        0x3ffffe2, 0x3ffffe3, 0x3ffffe4, 0x7ffffde, 0x7ffffdf, 0x3ffffe5, 0xfffff1, 0x1ffffed, 0x7fff2, 0x1fffe3, 
        0x3ffffe6, 0x7ffffe0, 0x7ffffe1, 0x3ffffe7, 0x7ffffe2, 0xfffff2, 0x1fffe4, 0x1fffe5, 0x3ffffe8, 0x3ffffe9, 
        0xffffffd, 0x7ffffe3, 0x7ffffe4, 0x7ffffe5, 0xfffec, 0xfffff3, 0xfffed, 0x1fffe6, 0x3fffe9, 0x1fffe7, 
        0x1fffe8, 0x7ffff3, 0x3fffea, 0x3fffeb, 0x1ffffee, 0x1ffffef, 0xfffff4, 0xfffff5, 0x3ffffea, 0x7ffff4, 
        0x3ffffeb, 0x7ffffe6, 0x3ffffec, 0x3ffffed, 0x7ffffe7, 0x7ffffe8, 0x7ffffe9, 0x7ffffea, 0x7ffffeb, 0xffffffe, 
        0x7ffffec, 0x7ffffed, 0x7ffffee, 0x7ffffef, 0x7fffff0, 0x3ffffee
    };
    private static final byte CODE_LENGTHS[] = {
        13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 
        30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 
        28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 
        28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 
        10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 
        5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 
        15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 
        7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 
        7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 
        8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 
        6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 
        6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 
        7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 
        20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 
        23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 
        23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 
        22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 
        22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 
        23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 
        22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 
        26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 
        26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 
        28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 
        21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 
        26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 
        27, 27, 27, 27, 27, 26
    };
    private static final Huffman INSTANCE = new Huffman();
    private final Node root = new Node();

    private Huffman()
    {
        buildTree();
    }

    private void addCode(int i, int j, byte byte0)
    {
        Node node1 = new Node(i, byte0);
        Node node;
        for (node = root; byte0 > 8; node = node.children[i])
        {
            byte0 -= 8;
            i = j >>> byte0 & 0xff;
            if (node.children == null)
            {
                throw new IllegalStateException("invalid dictionary: prefix not unique");
            }
            if (node.children[i] == null)
            {
                node.children[i] = new Node();
            }
        }

        byte0 = 8 - byte0;
        j = j << byte0 & 0xff;
        for (i = j; i < j + (1 << byte0); i++)
        {
            node.children[i] = node1;
        }

    }

    private void buildTree()
    {
        for (int i = 0; i < CODE_LENGTHS.length; i++)
        {
            addCode(i, CODES[i], CODE_LENGTHS[i]);
        }

    }

    public static Huffman get()
    {
        return INSTANCE;
    }

    byte[] decode(byte abyte0[])
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        Node node = root;
        int k = 0;
        int i = 0;
        int j = 0;
        Node node1;
        int l;
        do
        {
            l = i;
            node1 = node;
            if (j >= abyte0.length)
            {
                break;
            }
            k = k << 8 | abyte0[j] & 0xff;
            for (i += 8; i >= 8;)
            {
                node = node.children[k >>> i - 8 & 0xff];
                if (node.children == null)
                {
                    bytearrayoutputstream.write(node.symbol);
                    i -= node.terminalBits;
                    node = root;
                } else
                {
                    i -= 8;
                }
            }

            j++;
        } while (true);
        while (l > 0 && (((Node) (abyte0 = node1.children[k << 8 - l & 0xff])).children == null && ((Node) (abyte0)).terminalBits <= l)) 
        {
            bytearrayoutputstream.write(((Node) (abyte0)).symbol);
            l -= ((Node) (abyte0)).terminalBits;
            node1 = root;
        }
        return bytearrayoutputstream.toByteArray();
    }

}
