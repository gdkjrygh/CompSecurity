// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.FacebookException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
        onMapperCompleteListener = new OnMapperCompleteListener() {

            final Mutable val$didReturnError;
            final OnMapperCompleteListener val$onMapperCompleteListener;
            final Mutable val$pendingJobCount;

            public void onComplete()
            {
                if (!((Boolean)didReturnError.value).booleanValue())
                {
                    Mutable mutable = pendingJobCount;
                    Integer integer1 = Integer.valueOf(((Integer)pendingJobCount.value).intValue() - 1);
                    mutable.value = integer1;
                    if (integer1.intValue() == 0)
                    {
                        onMapperCompleteListener.onComplete();
                        return;
                    }
                }
            }

            public void onError(FacebookException facebookexception)
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

            
            {
                didReturnError = mutable;
                pendingJobCount = mutable1;
                onMapperCompleteListener = onmappercompletelistener;
                super();
            }
        };
        didReturnError = collection.keyIterator();
        Object obj = new LinkedList();
        for (; didReturnError.hasNext(); ((List) (obj)).add(didReturnError.next())) { }
        final Object key;
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); valuemapper.mapValue(obj, ((OnMapValueCompleteListener) (key))))
        {
            key = iterator.next();
            obj = collection.get(key);
            key = new OnMapValueCompleteListener() {

                final Collection val$collection;
                final OnMapperCompleteListener val$jobCompleteListener;
                final Object val$key;

                public void onComplete(Object obj1)
                {
                    collection.set(key, obj1, jobCompleteListener);
                    jobCompleteListener.onComplete();
                }

                public void onError(FacebookException facebookexception)
                {
                    jobCompleteListener.onError(facebookexception);
                }

            
            {
                collection = collection1;
                key = obj;
                jobCompleteListener = onmappercompletelistener;
                super();
            }
            };
            Integer integer = (Integer)pendingJobCount.value;
            pendingJobCount.value = Integer.valueOf(((Integer)pendingJobCount.value).intValue() + 1);
        }

        onMapperCompleteListener.onComplete();
    }

    private class Collection
    {

        public abstract Object get(Object obj);

        public abstract Iterator keyIterator();

        public abstract void set(Object obj, Object obj1, OnErrorListener onerrorlistener);
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
