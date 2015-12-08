// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package dagger.internal:
//            Binding

public final class ProblemDetector
{

    public ProblemDetector()
    {
    }

    private static void detectCircularDependencies(Collection collection, List list)
    {
        Iterator iterator = collection.iterator();
_L2:
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_257;
            }
            collection = (Binding)iterator.next();
        } while (collection.isCycleFree());
        if (collection.isVisiting())
        {
            int j = list.indexOf(collection);
            StringBuilder stringbuilder = (new StringBuilder()).append("Dependency cycle:");
            for (int i = j; i < list.size(); i++)
            {
                stringbuilder.append("\n    ").append(i - j).append(". ").append(((Binding)list.get(i)).provideKey).append(" bound by ").append(list.get(i));
            }

            stringbuilder.append("\n    ").append(0).append(". ").append(((Binding) (collection)).provideKey);
            throw new IllegalStateException(stringbuilder.toString());
        }
        collection.setVisiting(true);
        list.add(collection);
        ArraySet arrayset = new ArraySet();
        collection.getDependencies(arrayset, arrayset);
        detectCircularDependencies(((Collection) (arrayset)), list);
        collection.setCycleFree(true);
        list.remove(list.size() - 1);
        collection.setVisiting(false);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        list.remove(list.size() - 1);
        collection.setVisiting(false);
        throw exception;
    }

    public void detectCircularDependencies(Collection collection)
    {
        detectCircularDependencies(collection, ((List) (new ArrayList())));
    }

    public void detectProblems(Collection collection)
    {
        detectCircularDependencies(collection);
        detectUnusedBinding(collection);
    }

    public void detectUnusedBinding(Collection collection)
    {
        ArrayList arraylist = new ArrayList();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            Binding binding = (Binding)collection.next();
            if (!binding.library() && !binding.dependedOn())
            {
                arraylist.add(binding);
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            collection = new StringBuilder();
            collection.append("You have these unused @Provider methods:");
            for (int i = 0; i < arraylist.size(); i++)
            {
                collection.append("\n    ").append(i + 1).append(". ").append(((Binding)arraylist.get(i)).requiredBy);
            }

            collection.append("\n    Set library=true in your module to disable this check.");
            throw new IllegalStateException(collection.toString());
        } else
        {
            return;
        }
    }

    private class ArraySet extends AbstractSet
    {

        private final ArrayList list = new ArrayList();

        public boolean add(Object obj)
        {
            list.add(obj);
            return true;
        }

        public Iterator iterator()
        {
            return list.iterator();
        }

        public int size()
        {
            throw new UnsupportedOperationException();
        }

        ArraySet()
        {
        }
    }

}
