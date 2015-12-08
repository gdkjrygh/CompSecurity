// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264;


public class BTree
{

    private BTree one;
    private Object value;
    private BTree zero;

    public BTree()
    {
    }

    public void addString(String s, Object obj)
    {
        if (s.length() == 0)
        {
            value = obj;
            return;
        }
        BTree btree;
        if (s.charAt(0) == '0')
        {
            if (zero == null)
            {
                zero = new BTree();
            }
            btree = zero;
        } else
        {
            if (one == null)
            {
                one = new BTree();
            }
            btree = one;
        }
        btree.addString(s.substring(1), obj);
    }

    public BTree down(int i)
    {
        if (i == 0)
        {
            return zero;
        } else
        {
            return one;
        }
    }

    public Object getValue()
    {
        return value;
    }
}
