// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.common.base.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            HasChildren, IntermediateRepresentation

public class IrUtil
{

    public IrUtil()
    {
    }

    public static List findElements(IntermediateRepresentation intermediaterepresentation, Class class1)
    {
        return findElements(intermediaterepresentation, class1, null);
    }

    public static List findElements(IntermediateRepresentation intermediaterepresentation, Class class1, Predicate predicate)
    {
        ArrayList arraylist = new ArrayList();
        findElementsImpl(intermediaterepresentation, class1, predicate, arraylist);
        return arraylist;
    }

    private static void findElementsImpl(IntermediateRepresentation intermediaterepresentation, Class class1, Predicate predicate, List list)
    {
        if (class1.isAssignableFrom(intermediaterepresentation.getClass()) && (predicate == null || predicate.apply(intermediaterepresentation)))
        {
            list.add(intermediaterepresentation);
        }
        if (intermediaterepresentation instanceof HasChildren)
        {
            for (intermediaterepresentation = ((HasChildren)intermediaterepresentation).getChildren().iterator(); intermediaterepresentation.hasNext(); findElementsImpl((IntermediateRepresentation)intermediaterepresentation.next(), class1, predicate, list)) { }
        }
    }

    public static IntermediateRepresentation findFirstElement(IntermediateRepresentation intermediaterepresentation, Class class1)
    {
        return findFirstElement(intermediaterepresentation, class1, null);
    }

    public static IntermediateRepresentation findFirstElement(IntermediateRepresentation intermediaterepresentation, Class class1, Predicate predicate)
    {
label0:
        {
            if (class1.isAssignableFrom(intermediaterepresentation.getClass()) && (predicate == null || predicate.apply(intermediaterepresentation)))
            {
                return intermediaterepresentation;
            }
            if (!(intermediaterepresentation instanceof HasChildren))
            {
                break label0;
            }
            intermediaterepresentation = ((HasChildren)intermediaterepresentation).getChildren().iterator();
            IntermediateRepresentation intermediaterepresentation1;
            do
            {
                if (!intermediaterepresentation.hasNext())
                {
                    break label0;
                }
                intermediaterepresentation1 = findFirstElement((IntermediateRepresentation)intermediaterepresentation.next(), class1, predicate);
            } while (intermediaterepresentation1 == null);
            return intermediaterepresentation1;
        }
        return null;
    }
}
