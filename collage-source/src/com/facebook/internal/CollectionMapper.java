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
    public static interface Collection
    {

        public abstract Object get(Object obj);

        public abstract Iterator keyIterator();

        public abstract void set(Object obj, Object obj1, OnErrorListener onerrorlistener);
    }

    public static interface OnErrorListener
    {

        public abstract void onError(FacebookException facebookexception);
    }

    public static interface OnMapValueCompleteListener
        extends OnErrorListener
    {

        public abstract void onComplete(Object obj);
    }

    public static interface OnMapperCompleteListener
        extends OnErrorListener
    {

        public abstract void onComplete();
    }

    public static interface ValueMapper
    {

        public abstract void mapValue(Object obj, OnMapValueCompleteListener onmapvaluecompletelistener);
    }


    private CollectionMapper()
    {
    }

    public static void iterate(Collection collection, ValueMapper valuemapper, OnMapperCompleteListener onmappercompletelistener)
    {
        Object obj = new Mutable(Boolean.valueOf(false));
        Mutable mutable = new Mutable(Integer.valueOf(1));
        onmappercompletelistener = new OnMapperCompleteListener(((Mutable) (obj)), mutable, onmappercompletelistener) {

            final Mutable val$didReturnError;
            final OnMapperCompleteListener val$onMapperCompleteListener;
            final Mutable val$pendingJobCount;

            public void onComplete()
            {
                if (!((Boolean)didReturnError.value).booleanValue())
                {
                    Mutable mutable1 = pendingJobCount;
                    Integer integer1 = Integer.valueOf(((Integer)pendingJobCount.value).intValue() - 1);
                    mutable1.value = integer1;
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
        obj = collection.keyIterator();
        Object obj1 = new LinkedList();
        for (; ((Iterator) (obj)).hasNext(); ((List) (obj1)).add(((Iterator) (obj)).next())) { }
        Object obj2;
        for (Iterator iterator = ((List) (obj1)).iterator(); iterator.hasNext(); valuemapper.mapValue(obj1, ((OnMapValueCompleteListener) (obj2))))
        {
            obj2 = iterator.next();
            obj1 = collection.get(obj2);
            obj2 = new OnMapValueCompleteListener(collection, obj2, onmappercompletelistener) {

                final Collection val$collection;
                final OnMapperCompleteListener val$jobCompleteListener;
                final Object val$key;

                public void onComplete(Object obj3)
                {
                    collection.set(key, obj3, jobCompleteListener);
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
            Integer integer = (Integer)mutable.value;
            mutable.value = Integer.valueOf(((Integer)mutable.value).intValue() + 1);
        }

        onmappercompletelistener.onComplete();
    }
}
