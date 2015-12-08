// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.stream.Style;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            ModelList, PathException, Context, Model

class ModelMap extends LinkedHashMap
    implements Iterable
{

    private final Class type;

    public ModelMap(Class class1)
    {
        type = class1;
    }

    private ModelMap getModels(Style style)
        throws Exception
    {
        ModelMap modelmap = new ModelMap(type);
        ModelList modellist;
        String s1;
        for (Iterator iterator1 = keySet().iterator(); iterator1.hasNext(); modelmap.put(s1, modellist))
        {
            String s = (String)iterator1.next();
            ModelList modellist1 = (ModelList)get(s);
            s1 = style.getElement(s);
            modellist = modellist1;
            if (modellist1 != null)
            {
                modellist = modellist1.build();
            }
            if (modelmap.containsKey(s1))
            {
                throw new PathException("Path with name '%s' is a duplicate of '%s' in %s ", new Object[] {
                    s, s1, type
                });
            }
        }

        return modelmap;
    }

    public ModelMap getModels(Context context)
        throws Exception
    {
        Style style = context.getStyle();
        context = this;
        if (style != null)
        {
            context = getModels(style);
        }
        return context;
    }

    public Iterator iterator()
    {
        return values().iterator();
    }

    public Model lookup(String s, int i)
    {
        s = (ModelList)get(s);
        if (s != null)
        {
            return s.lookup(i);
        } else
        {
            return null;
        }
    }

    public void register(String s, Model model)
    {
        ModelList modellist1 = (ModelList)get(s);
        ModelList modellist = modellist1;
        if (modellist1 == null)
        {
            modellist = new ModelList();
            put(s, modellist);
        }
        modellist.register(model);
    }
}
