// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.jsonextract;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.dropbox.client2.jsonextract:
//            JsonBase, JsonThing, JsonExtractionException

public final class JsonMap extends JsonBase
    implements Iterable
{

    public JsonMap(Map map)
    {
        super(map);
    }

    public JsonMap(Map map, String s)
    {
        super(map, s);
    }

    private static boolean isEnglishDigit(char c)
    {
        return c >= '0' && c <= '9';
    }

    private static boolean isEnglishLetter(char c)
    {
        return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }

    private static boolean isIdentLike(String s)
    {
        boolean flag1 = true;
        if (s.length() != 0) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        if (!isEnglishLetter(s.charAt(0)))
        {
            return false;
        }
        int i = 1;
        do
        {
            flag = flag1;
            if (i >= s.length())
            {
                continue;
            }
            char c = s.charAt(i);
            if (!isEnglishLetter(c) && !isEnglishDigit(c))
            {
                return false;
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String pathConcatField(String s, String s1)
    {
        String s2 = s1;
        if (!isIdentLike(s1))
        {
            s2 = (new StringBuilder("\"")).append(s1).append('"').toString();
        }
        return JsonThing.pathConcat(s, s2);
    }

    public final volatile JsonExtractionException error(String s)
    {
        return super.error(s);
    }

    public final JsonThing get(String s)
    {
        if (!((Map)internal).containsKey(s))
        {
            throw error((new StringBuilder("expecting object to have field \"")).append(s).append("\", but it does not").toString());
        } else
        {
            return new JsonThing(((Map)internal).get(s), pathConcatField(path, s));
        }
    }

    public final JsonThing getOrNull(String s)
    {
        if (!((Map)internal).containsKey(s))
        {
            return null;
        } else
        {
            return new JsonThing(((Map)internal).get(s), pathConcatField(path, s));
        }
    }

    public final Iterator iterator()
    {
        return new WrapperIterator(path, ((Map)internal).entrySet().iterator(), null);
    }


    private class WrapperIterator
        implements Iterator
    {

        private final Iterator internal;
        private final String path;

        public final boolean hasNext()
        {
            return internal.hasNext();
        }

        public final volatile Object next()
        {
            return next();
        }

        public final java.util.Map.Entry next()
        {
            return new WrappedEntry(path, (java.util.Map.Entry)internal.next(), null);
        }

        public final void remove()
        {
            throw new UnsupportedOperationException("can't remove");
        }

        private WrapperIterator(String s, Iterator iterator1)
        {
            path = s;
            internal = iterator1;
        }

        WrapperIterator(String s, Iterator iterator1, _cls1 _pcls1)
        {
            this(s, iterator1);
        }

        private class WrappedEntry
            implements java.util.Map.Entry
        {

            private final String key;
            private final JsonThing value;

            public final volatile Object getKey()
            {
                return getKey();
            }

            public final String getKey()
            {
                return key;
            }

            public final JsonThing getValue()
            {
                return value;
            }

            public final volatile Object getValue()
            {
                return getValue();
            }

            public final JsonThing setValue(JsonThing jsonthing)
            {
                throw new UnsupportedOperationException();
            }

            public final volatile Object setValue(Object obj)
            {
                return setValue((JsonThing)obj);
            }

            private WrappedEntry(String s, java.util.Map.Entry entry)
            {
                key = (String)entry.getKey();
                value = new JsonThing(entry.getValue(), JsonMap.pathConcatField(s, key));
            }

            WrappedEntry(String s, java.util.Map.Entry entry, _cls1 _pcls1)
            {
                this(s, entry);
            }
        }

    }

}
