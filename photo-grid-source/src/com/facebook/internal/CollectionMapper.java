// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.Iterator;

// Referenced classes of package com.facebook.internal:
//            Mutable

public class CollectionMapper
{

    private CollectionMapper()
    {
    }

    public static void iterate(final Collection collection, ValueMapper valuemapper, final OnMapperCompleteListener onMapperCompleteListener)
    {
        final Mutable didReturnError = new Mutable(Boolean.valueOf(false));
        final Mutable pendingJobCount = new Mutable(Integer.valueOf(1));
        onMapperCompleteListener = new _cls1();
        Object obj;
        final Object key;
        for (Iterator iterator = collection.keyIterator(); iterator.hasNext(); valuemapper.mapValue(obj, ((OnMapValueCompleteListener) (key))))
        {
            key = iterator.next();
            obj = collection.get(key);
            key = new _cls2();
            pendingJobCount.value = Integer.valueOf(((Integer)pendingJobCount.value).intValue() + 1);
        }

        onMapperCompleteListener.onComplete();
    }

    private class _cls1
        implements OnMapperCompleteListener
    {

        final Mutable val$didReturnError;
        final OnMapperCompleteListener val$onMapperCompleteListener;
        final Mutable val$pendingJobCount;

        public final void onComplete()
        {
            if (!((Boolean)didReturnError.value).booleanValue())
            {
                Mutable mutable = pendingJobCount;
                Integer integer = Integer.valueOf(((Integer)pendingJobCount.value).intValue() - 1);
                mutable.value = integer;
                if (integer.intValue() == 0)
                {
                    onMapperCompleteListener.onComplete();
                    return;
                }
            }
        }

        public final void onError(FacebookException facebookexception)
        {
            if (((Boolean)didReturnError.value).booleanValue())
            {
                return;
            } else
            {
                didReturnError.value = Boolean.valueOf(true);
                onMapperCompleteListener.onError(facebookexception);
                return;
            }
        }

        _cls1()
        {
            didReturnError = mutable;
            pendingJobCount = mutable1;
            onMapperCompleteListener = onmappercompletelistener;
            super();
        }
    }


    private class Collection
    {

        public abstract Object get(Object obj);

        public abstract Iterator keyIterator();

        public abstract void set(Object obj, Object obj1, OnErrorListener onerrorlistener);
    }


    private class _cls2
        implements OnMapValueCompleteListener
    {

        final Collection val$collection;
        final OnMapperCompleteListener val$jobCompleteListener;
        final Object val$key;

        public final void onComplete(Object obj)
        {
            collection.set(key, obj, jobCompleteListener);
            jobCompleteListener.onComplete();
        }

        public final void onError(FacebookException facebookexception)
        {
            jobCompleteListener.onError(facebookexception);
        }

        _cls2()
        {
            collection = collection1;
            key = obj;
            jobCompleteListener = onmappercompletelistener;
            super();
        }
    }


    private class ValueMapper
    {

        public abstract void mapValue(Object obj, OnMapValueCompleteListener onmapvaluecompletelistener);
    }


    private class OnMapperCompleteListener
        implements OnErrorListener
    {

        public abstract void onComplete();
    }

}
