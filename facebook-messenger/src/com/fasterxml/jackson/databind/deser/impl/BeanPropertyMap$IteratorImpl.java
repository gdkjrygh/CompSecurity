// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class _nextBucketIndex
    implements Iterator
{

    private final next _buckets[];
    private next _currentBucket;
    private int _nextBucketIndex;

    public boolean hasNext()
    {
        return _currentBucket != null;
    }

    public SettableBeanProperty next()
    {
        _currentBucket _lcurrentbucket = _currentBucket;
        if (_lcurrentbucket == null)
        {
            throw new NoSuchElementException();
        }
        Object obj;
        int i;
        for (obj = _lcurrentbucket._currentBucket; obj == null && _nextBucketIndex < _buckets.length; obj = obj[i])
        {
            obj = _buckets;
            i = _nextBucketIndex;
            _nextBucketIndex = i + 1;
        }

        _currentBucket = ((_currentBucket) (obj));
        return _lcurrentbucket._currentBucket;
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    public ( a[])
    {
        int i;
        int k;
        _buckets = a;
        i = 0;
        k = _buckets.length;
_L3:
        int j;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        a = _buckets;
        j = i + 1;
        a = a[i];
        if (a == null) goto _L2; else goto _L1
_L1:
        _currentBucket = a;
_L4:
        _nextBucketIndex = j;
        return;
_L2:
        i = j;
          goto _L3
        j = i;
          goto _L4
    }
}
