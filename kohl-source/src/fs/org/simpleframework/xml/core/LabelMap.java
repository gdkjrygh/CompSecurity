// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Label, Context, Policy

class LabelMap extends LinkedHashMap
    implements Iterable
{

    private final Policy policy;

    public LabelMap()
    {
        this(null);
    }

    public LabelMap(Policy policy1)
    {
        policy = policy1;
    }

    public Set getKeys()
        throws Exception
    {
        HashSet hashset = new HashSet();
        Iterator iterator1 = iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Object obj = (Label)iterator1.next();
            if (obj != null)
            {
                String s = ((Label) (obj)).getPath();
                obj = ((Label) (obj)).getName();
                hashset.add(s);
                hashset.add(obj);
            }
        } while (true);
        return hashset;
    }

    public Set getKeys(Context context)
        throws Exception
    {
        HashSet hashset = new HashSet();
        Iterator iterator1 = iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Object obj = (Label)iterator1.next();
            if (obj != null)
            {
                String s = ((Label) (obj)).getPath(context);
                obj = ((Label) (obj)).getName(context);
                hashset.add(s);
                hashset.add(obj);
            }
        } while (true);
        return hashset;
    }

    public Label getLabel(String s)
    {
        return (Label)remove(s);
    }

    public LabelMap getLabels(Context context)
        throws Exception
    {
        LabelMap labelmap = new LabelMap(policy);
        Iterator iterator1 = iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Label label = (Label)iterator1.next();
            if (label != null)
            {
                labelmap.put(label.getPath(context), label);
            }
        } while (true);
        return labelmap;
    }

    public Set getPaths()
        throws Exception
    {
        HashSet hashset = new HashSet();
        Iterator iterator1 = iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Label label = (Label)iterator1.next();
            if (label != null)
            {
                hashset.add(label.getPath());
            }
        } while (true);
        return hashset;
    }

    public Set getPaths(Context context)
        throws Exception
    {
        HashSet hashset = new HashSet();
        Iterator iterator1 = iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Label label = (Label)iterator1.next();
            if (label != null)
            {
                hashset.add(label.getPath(context));
            }
        } while (true);
        return hashset;
    }

    public boolean isStrict(Context context)
    {
        if (policy == null)
        {
            return context.isStrict();
        }
        return context.isStrict() && policy.isStrict();
    }

    public Iterator iterator()
    {
        return values().iterator();
    }
}
