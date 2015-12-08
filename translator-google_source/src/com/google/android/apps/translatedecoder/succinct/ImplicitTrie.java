// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.succinct;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.succinct:
//            TrieNodeList, b, a

public class ImplicitTrie
    implements Serializable
{

    private static final Logger a = Logger.getLogger("translate");
    private static final long serialVersionUID = 0x500229211a862ae5L;
    private final List nodes;
    private final int order;

    public ImplicitTrie(int i, List list)
    {
        order = i;
        nodes = list;
        if (i != list.size())
        {
            throw new RuntimeException("order is not correct!");
        } else
        {
            return;
        }
    }

    public static ImplicitTrie readFromByteBuffer(ByteBuffer bytebuffer)
    {
        int j = bytebuffer.getInt();
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < j; i++)
        {
            arraylist.add(TrieNodeList.readFromByteBuffer(bytebuffer));
        }

        return new ImplicitTrie(j, arraylist);
    }

    public static ImplicitTrie readFromFile(String s)
    {
        ObjectInputStream objectinputstream1 = new ObjectInputStream(new FileInputStream(s));
        ObjectInputStream objectinputstream = objectinputstream1;
        ImplicitTrie implicittrie = (ImplicitTrie)objectinputstream1.readObject();
        objectinputstream1.close();
        return implicittrie;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        objectinputstream1 = null;
_L6:
        objectinputstream = objectinputstream1;
        Logger logger = a;
        objectinputstream = objectinputstream1;
        Level level = Level.SEVERE;
        objectinputstream = objectinputstream1;
        s = String.valueOf(s);
        objectinputstream = objectinputstream1;
        if (s.length() == 0) goto _L2; else goto _L1
_L1:
        objectinputstream = objectinputstream1;
        s = "Read failed. file=".concat(s);
_L3:
        objectinputstream = objectinputstream1;
        logger.log(level, s, classnotfoundexception.getCause());
        objectinputstream = objectinputstream1;
        throw new RuntimeException("Class ImplicitTrie is not found!");
        s;
_L4:
        if (objectinputstream != null)
        {
            objectinputstream.close();
        }
        throw s;
_L2:
        objectinputstream = objectinputstream1;
        s = new String("Read failed. file=");
          goto _L3
        s;
        objectinputstream = null;
          goto _L4
        classnotfoundexception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public b lookup(List list)
    {
        int ai[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            ai[i] = ((Integer)list.get(i)).intValue();
        }

        return lookup(ai);
    }

    public b lookup(int ai[])
    {
        return lookup(ai, 0, ai.length - 1);
    }

    public b lookup(int ai[], int i, int j)
    {
        b b1;
        int k;
        int l;
        int k1;
        k1 = (j - i) + 1;
        if (ai == null || k1 > order)
        {
            return null;
        }
        b1 = new b();
        k = ((TrieNodeList)nodes.get(0)).size();
        l = 0;
        j = 0;
_L4:
        if (l >= k1) goto _L2; else goto _L1
_L1:
        TrieNodeList trienodelist;
        int i1;
        trienodelist = (TrieNodeList)nodes.get(l);
        i1 = com.google.android.apps.translatedecoder.succinct.a.a(trienodelist, j, k, ai[i + l]);
        if (i1 == -1) goto _L2; else goto _L3
_L3:
        trienodelist.fill(i1, b1);
        if (l < k1 - 1)
        {
            k = b1.b;
            if (i1 == trienodelist.size() - 1)
            {
                j = ((TrieNodeList)nodes.get(l + 1)).size();
            } else
            if (i1 < trienodelist.size() - 1)
            {
                trienodelist.fill(i1 + 1, b1);
                j = b1.b;
            } else
            {
                throw new RuntimeException("Returned pos must be wrong!");
            }
        } else
        {
            int j1 = j;
            j = k;
            k = j1;
        }
        i1 = l + 1;
        l = k;
        k = j;
        j = l;
        l = i1;
        if (true) goto _L4; else goto _L2
_L2:
        if (l >= k1)
        {
            return b1;
        } else
        {
            return null;
        }
    }

    public int order()
    {
        return order;
    }

    public b reverseTrieLookup(int ai[], int i, int j, int ai1[])
    {
        b b1;
        b b2;
        int k;
        int l;
        int k1;
        b2 = null;
        for (k1 = (j - i) + 1; ai == null || k1 > order;)
        {
            return null;
        }

        k = ((TrieNodeList)nodes.get(0)).size();
        l = 0;
        i = 0;
        b1 = null;
_L4:
        if (l >= k1) goto _L2; else goto _L1
_L1:
        TrieNodeList trienodelist;
        int i1;
        trienodelist = (TrieNodeList)nodes.get(l);
        i1 = com.google.android.apps.translatedecoder.succinct.a.a(trienodelist, i, k, ai[j - l]);
        if (i1 == -1) goto _L2; else goto _L3
_L3:
        b b3 = b2;
        if (b2 == null)
        {
            b3 = new b();
        }
        trienodelist.fill(i1, b3);
        if (l < k1 - 1)
        {
            i = b3.b;
            if (i1 == trienodelist.size() - 1)
            {
                i1 = ((TrieNodeList)nodes.get(l + 1)).size();
                k = i;
                i = i1;
            } else
            if (i1 < trienodelist.size() - 1)
            {
                b2 = b1;
                if (b1 == null)
                {
                    b2 = new b();
                }
                trienodelist.fill(i1 + 1, b2);
                i1 = b2.b;
                b1 = b2;
                k = i;
                i = i1;
            } else
            {
                throw new RuntimeException("Returned pos must be wrong!");
            }
        } else
        {
            int j1 = i;
            i = k;
            k = j1;
        }
        i1 = l + 1;
        l = k;
        k = i;
        i = l;
        b2 = b3;
        l = i1;
        if (true) goto _L4; else goto _L2
_L2:
        ai1[0] = l;
        return b2;
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        bytebuffer.putInt(order);
        for (Iterator iterator = nodes.iterator(); iterator.hasNext(); ((TrieNodeList)iterator.next()).writeToByteBuffer(bytebuffer)) { }
    }

    public void writeToFile(String s)
    {
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(new FileOutputStream(s));
        objectoutputstream.writeObject(this);
        objectoutputstream.close();
        return;
        s;
        objectoutputstream = null;
_L2:
        if (objectoutputstream != null)
        {
            objectoutputstream.close();
        }
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
