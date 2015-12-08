// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;

import fs.org.simpleframework.xml.util.Cache;
import fs.org.simpleframework.xml.util.WeakCache;

// Referenced classes of package fs.org.simpleframework.xml.transform:
//            DefaultMatcher, TransformCache, Transform, Matcher, 
//            TransformException

public class Transformer
{

    private final TransformCache cache = new TransformCache();
    private final Cache error = new WeakCache();
    private final Matcher matcher;

    public Transformer(Matcher matcher1)
    {
        matcher = new DefaultMatcher(matcher1);
    }

    private Transform lookup(Class class1)
        throws Exception
    {
        Transform transform = (Transform)cache.fetch(class1);
        if (transform != null)
        {
            return transform;
        }
        if (error.contains(class1))
        {
            return null;
        } else
        {
            return match(class1);
        }
    }

    private Transform match(Class class1)
        throws Exception
    {
        Transform transform = matcher.match(class1);
        if (transform != null)
        {
            cache.cache(class1, transform);
            return transform;
        } else
        {
            error.cache(class1, this);
            return transform;
        }
    }

    public Object read(String s, Class class1)
        throws Exception
    {
        Transform transform = lookup(class1);
        if (transform == null)
        {
            throw new TransformException("Transform of %s not supported", new Object[] {
                class1
            });
        } else
        {
            return transform.read(s);
        }
    }

    public boolean valid(Class class1)
        throws Exception
    {
        return lookup(class1) != null;
    }

    public String write(Object obj, Class class1)
        throws Exception
    {
        Transform transform = lookup(class1);
        if (transform == null)
        {
            throw new TransformException("Transform of %s not supported", new Object[] {
                class1
            });
        } else
        {
            return transform.write(obj);
        }
    }
}
