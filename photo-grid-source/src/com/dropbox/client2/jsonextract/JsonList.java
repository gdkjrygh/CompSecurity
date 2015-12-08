// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.jsonextract;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dropbox.client2.jsonextract:
//            JsonBase, JsonThing, JsonExtractor, JsonExtractionException

public final class JsonList extends JsonBase
    implements Iterable
{

    public JsonList(List list)
    {
        super(list);
    }

    public JsonList(List list, String s)
    {
        super(list, s);
    }

    private static String pathConcatIndex(String s, int i)
    {
        return JsonThing.pathConcat(s, Integer.toString(i));
    }

    public final volatile JsonExtractionException error(String s)
    {
        return super.error(s);
    }

    public final void expectLength(int i)
    {
        if (((List)internal).size() != i)
        {
            throw error((new StringBuilder("expecting array to have length ")).append(i).append(", but it has length ").append(((List)internal).size()).toString());
        } else
        {
            return;
        }
    }

    public final ArrayList extract(JsonExtractor jsonextractor)
    {
        ArrayList arraylist = new ArrayList(length());
        for (Iterator iterator1 = ((List)internal).iterator(); iterator1.hasNext(); arraylist.add(jsonextractor.extract(new JsonThing(iterator1.next())))) { }
        return arraylist;
    }

    public final JsonThing get(int i)
    {
        if (i >= ((List)internal).size())
        {
            throw error((new StringBuilder("expecting array to have an element at index ")).append(i).append(", but it only has length ").append(((List)internal).size()).toString());
        } else
        {
            return new JsonThing(((List)internal).get(i), pathConcatIndex(path, i));
        }
    }

    public final Iterator iterator()
    {
        return new WrapperIterator(path, ((List)internal).iterator(), null);
    }

    public final int length()
    {
        return ((List)internal).size();
    }


    private class WrapperIterator
        implements Iterator
    {

        private final Iterator internal;
        private int numReturned;
        private final String path;

        public final boolean hasNext()
        {
            return internal.hasNext();
        }

        public final JsonThing next()
        {
            int i = numReturned;
            numReturned = i + 1;
            return new JsonThing(internal.next(), JsonList.pathConcatIndex(path, i));
        }

        public final volatile Object next()
        {
            return next();
        }

        public final void remove()
        {
            throw new UnsupportedOperationException("can't remove");
        }

        private WrapperIterator(String s, Iterator iterator1)
        {
            numReturned = 0;
            path = s;
            internal = iterator1;
        }

        WrapperIterator(String s, Iterator iterator1, _cls1 _pcls1)
        {
            this(s, iterator1);
        }
    }

}
