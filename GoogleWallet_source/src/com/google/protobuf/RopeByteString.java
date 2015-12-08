// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

// Referenced classes of package com.google.protobuf:
//            ByteString, LiteralByteString

final class RopeByteString extends ByteString
{
    static final class Balancer
    {

        private final Stack prefixesStack;

        private ByteString balance(ByteString bytestring, ByteString bytestring1)
        {
            doBalance(bytestring);
            doBalance(bytestring1);
            for (bytestring = (ByteString)prefixesStack.pop(); !prefixesStack.isEmpty(); bytestring = new RopeByteString((ByteString)prefixesStack.pop(), bytestring)) { }
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
                doBalance(((RopeByteString) (bytestring)).left);
                doBalance(((RopeByteString) (bytestring)).right);
                return;
            } else
            {
                bytestring = String.valueOf(bytestring.getClass());
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(bytestring).length() + 49)).append("Has a new type of ByteString been created? Found ").append(bytestring).toString());
            }
        }

        private static int getDepthBinForLength(int i)
        {
            int j = Arrays.binarySearch(RopeByteString.minLengthByDepth, i);
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
            int k = RopeByteString.minLengthByDepth[i + 1];
            if (prefixesStack.isEmpty() || ((ByteString)prefixesStack.peek()).size() >= k)
            {
                prefixesStack.push(bytestring);
                return;
            }
            i = RopeByteString.minLengthByDepth[i];
            Object obj;
            for (obj = (ByteString)prefixesStack.pop(); !prefixesStack.isEmpty() && ((ByteString)prefixesStack.peek()).size() < i; obj = new RopeByteString((ByteString)prefixesStack.pop(), ((ByteString) (obj)))) { }
            bytestring = new RopeByteString(((ByteString) (obj)), bytestring);
            do
            {
                if (prefixesStack.isEmpty())
                {
                    break;
                }
                int j = getDepthBinForLength(bytestring.size());
                j = RopeByteString.minLengthByDepth[j + 1];
                if (((ByteString)prefixesStack.peek()).size() >= j)
                {
                    break;
                }
                bytestring = new RopeByteString((ByteString)prefixesStack.pop(), bytestring);
            } while (true);
            prefixesStack.push(bytestring);
        }


        private Balancer()
        {
            prefixesStack = new Stack();
        }

    }

    static final class PieceIterator
        implements Iterator
    {

        private final Stack breadCrumbs;
        private LiteralByteString next;

        private LiteralByteString getLeafByLeft(ByteString bytestring)
        {
            for (; bytestring instanceof RopeByteString; bytestring = ((RopeByteString) (bytestring)).left)
            {
                bytestring = (RopeByteString)bytestring;
                breadCrumbs.push(bytestring);
            }

            return (LiteralByteString)bytestring;
        }

        private LiteralByteString getNextNonEmptyLeaf()
        {
            LiteralByteString literalbytestring;
            do
            {
                if (breadCrumbs.isEmpty())
                {
                    return null;
                }
                literalbytestring = getLeafByLeft(((RopeByteString)breadCrumbs.pop()).right);
            } while (literalbytestring.isEmpty());
            return literalbytestring;
        }

        public final boolean hasNext()
        {
            return next != null;
        }

        public final LiteralByteString next()
        {
            if (next == null)
            {
                throw new NoSuchElementException();
            } else
            {
                LiteralByteString literalbytestring = next;
                next = getNextNonEmptyLeaf();
                return literalbytestring;
            }
        }

        public final volatile Object next()
        {
            return next();
        }

        public final void remove()
        {
            throw new UnsupportedOperationException();
        }

        private PieceIterator(ByteString bytestring)
        {
            breadCrumbs = new Stack();
            next = getLeafByLeft(bytestring);
        }

    }

    final class RopeByteIterator
        implements ByteString.ByteIterator
    {

        private ByteString.ByteIterator bytes;
        int bytesRemaining;
        private final PieceIterator pieces;
        final RopeByteString this$0;

        private Byte next()
        {
            return Byte.valueOf(nextByte());
        }

        public final boolean hasNext()
        {
            return bytesRemaining > 0;
        }

        public final volatile Object next()
        {
            return next();
        }

        public final byte nextByte()
        {
            if (!bytes.hasNext())
            {
                bytes = pieces.next().iterator();
            }
            bytesRemaining = bytesRemaining - 1;
            return bytes.nextByte();
        }

        public final void remove()
        {
            throw new UnsupportedOperationException();
        }

        private RopeByteIterator()
        {
            this$0 = RopeByteString.this;
            super();
            pieces = new PieceIterator(RopeByteString.this);
            bytes = pieces.next().iterator();
            bytesRemaining = size();
        }

    }


    private static final int minLengthByDepth[];
    private int hash;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    private RopeByteString(ByteString bytestring, ByteString bytestring1)
    {
        hash = 0;
        left = bytestring;
        right = bytestring1;
        leftLength = bytestring.size();
        totalLength = leftLength + bytestring1.size();
        treeDepth = Math.max(bytestring.getTreeDepth(), bytestring1.getTreeDepth()) + 1;
    }


    static ByteString concatenate(ByteString bytestring, ByteString bytestring1)
    {
        RopeByteString ropebytestring;
        if (bytestring instanceof RopeByteString)
        {
            ropebytestring = (RopeByteString)bytestring;
        } else
        {
            ropebytestring = null;
        }
        if (bytestring1.size() == 0)
        {
            return bytestring;
        }
        if (bytestring.size() == 0)
        {
            return bytestring1;
        }
        int i = bytestring.size() + bytestring1.size();
        if (i < 128)
        {
            return concatenateBytes(bytestring, bytestring1);
        }
        if (ropebytestring != null && ropebytestring.right.size() + bytestring1.size() < 128)
        {
            bytestring = concatenateBytes(ropebytestring.right, bytestring1);
            return new RopeByteString(ropebytestring.left, bytestring);
        }
        if (ropebytestring != null && ropebytestring.left.getTreeDepth() > ropebytestring.right.getTreeDepth() && ropebytestring.getTreeDepth() > bytestring1.getTreeDepth())
        {
            bytestring = new RopeByteString(ropebytestring.right, bytestring1);
            return new RopeByteString(ropebytestring.left, bytestring);
        }
        int j = Math.max(bytestring.getTreeDepth(), bytestring1.getTreeDepth());
        if (i >= minLengthByDepth[j + 1])
        {
            return new RopeByteString(bytestring, bytestring1);
        } else
        {
            return (new Balancer()).balance(bytestring, bytestring1);
        }
    }

    private static LiteralByteString concatenateBytes(ByteString bytestring, ByteString bytestring1)
    {
        int i = bytestring.size();
        int j = bytestring1.size();
        byte abyte0[] = new byte[i + j];
        bytestring.copyTo(abyte0, 0, 0, i);
        bytestring1.copyTo(abyte0, 0, i, j);
        return new LiteralByteString(abyte0);
    }

    private boolean equalsFragments(ByteString bytestring)
    {
        int j = 0;
        PieceIterator pieceiterator = new PieceIterator(this);
        LiteralByteString literalbytestring = (LiteralByteString)pieceiterator.next();
        int i = 0;
        PieceIterator pieceiterator1 = new PieceIterator(bytestring);
        bytestring = (LiteralByteString)pieceiterator1.next();
        int k = 0;
        do
        {
            int j1 = literalbytestring.size() - j;
            int l = bytestring.size() - i;
            int i1 = Math.min(j1, l);
            boolean flag;
            if (j == 0)
            {
                flag = literalbytestring.equalsRange(bytestring, i, i1);
            } else
            {
                flag = bytestring.equalsRange(literalbytestring, j, i1);
            }
            if (!flag)
            {
                return false;
            }
            k += i1;
            if (k >= totalLength)
            {
                if (k == totalLength)
                {
                    return true;
                } else
                {
                    throw new IllegalStateException();
                }
            }
            if (i1 == j1)
            {
                j = 0;
                literalbytestring = (LiteralByteString)pieceiterator.next();
            } else
            {
                j += i1;
            }
            if (i1 == l)
            {
                i = 0;
                bytestring = (LiteralByteString)pieceiterator1.next();
            } else
            {
                i += i1;
            }
        } while (true);
    }

    protected final void copyToInternal(byte abyte0[], int i, int j, int k)
    {
        if (i + k <= leftLength)
        {
            left.copyToInternal(abyte0, i, j, k);
            return;
        }
        if (i >= leftLength)
        {
            right.copyToInternal(abyte0, i - leftLength, j, k);
            return;
        } else
        {
            int l = leftLength - i;
            left.copyToInternal(abyte0, i, j, l);
            right.copyToInternal(abyte0, 0, j + l, k - l);
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ByteString))
            {
                return false;
            }
            obj = (ByteString)obj;
            if (totalLength != ((ByteString) (obj)).size())
            {
                return false;
            }
            if (totalLength != 0)
            {
                if (hash != 0)
                {
                    int i = ((ByteString) (obj)).peekCachedHashCode();
                    if (i != 0 && hash != i)
                    {
                        return false;
                    }
                }
                return equalsFragments(((ByteString) (obj)));
            }
        }
        return true;
    }

    protected final int getTreeDepth()
    {
        return treeDepth;
    }

    public final int hashCode()
    {
        int j = hash;
        int i = j;
        if (j == 0)
        {
            int k = partialHash(totalLength, 0, totalLength);
            i = k;
            if (k == 0)
            {
                i = 1;
            }
            hash = i;
        }
        return i;
    }

    protected final boolean isBalanced()
    {
        return totalLength >= minLengthByDepth[treeDepth];
    }

    public final boolean isValidUtf8()
    {
        boolean flag = false;
        int i = left.partialIsValidUtf8(0, 0, leftLength);
        if (right.partialIsValidUtf8(i, 0, right.size()) == 0)
        {
            flag = true;
        }
        return flag;
    }

    public final ByteString.ByteIterator iterator()
    {
        return new RopeByteIterator();
    }

    public final volatile Iterator iterator()
    {
        return iterator();
    }

    protected final int partialHash(int i, int j, int k)
    {
        if (j + k <= leftLength)
        {
            return left.partialHash(i, j, k);
        }
        if (j >= leftLength)
        {
            return right.partialHash(i, j - leftLength, k);
        } else
        {
            int l = leftLength - j;
            i = left.partialHash(i, j, l);
            return right.partialHash(i, 0, k - l);
        }
    }

    protected final int partialIsValidUtf8(int i, int j, int k)
    {
        if (j + k <= leftLength)
        {
            return left.partialIsValidUtf8(i, j, k);
        }
        if (j >= leftLength)
        {
            return right.partialIsValidUtf8(i, j - leftLength, k);
        } else
        {
            int l = leftLength - j;
            i = left.partialIsValidUtf8(i, j, l);
            return right.partialIsValidUtf8(i, 0, k - l);
        }
    }

    protected final int peekCachedHashCode()
    {
        return hash;
    }

    public final int size()
    {
        return totalLength;
    }

    public final String toString(String s)
        throws UnsupportedEncodingException
    {
        if (size() == 0 && "UTF-8".equals(s))
        {
            return "";
        } else
        {
            return new String(toByteArray(), s);
        }
    }

    final void writeToInternal(OutputStream outputstream, int i, int j)
        throws IOException
    {
        if (i + j <= leftLength)
        {
            left.writeToInternal(outputstream, i, j);
            return;
        }
        if (i >= leftLength)
        {
            right.writeToInternal(outputstream, i - leftLength, j);
            return;
        } else
        {
            int k = leftLength - i;
            left.writeToInternal(outputstream, i, k);
            right.writeToInternal(outputstream, 0, j - k);
            return;
        }
    }

    static 
    {
        ArrayList arraylist = new ArrayList();
        int k = 1;
        int i = 1;
        do
        {
            int l = k;
            if (i <= 0)
            {
                break;
            }
            arraylist.add(Integer.valueOf(i));
            k = i;
            i = l + i;
        } while (true);
        arraylist.add(Integer.valueOf(0x7fffffff));
        minLengthByDepth = new int[arraylist.size()];
        for (int j = 0; j < minLengthByDepth.length; j++)
        {
            minLengthByDepth[j] = ((Integer)arraylist.get(j)).intValue();
        }

    }



}
