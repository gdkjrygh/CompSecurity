// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model.smil;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.auditude.ads.model.smil:
//            Sequence, Par, Ref

class refs
    implements Iterable, Iterator
{

    private int index;
    private ArrayList refs;
    final Sequence this$0;

    public boolean hasNext()
    {
        return true;
    }

    public Iterator iterator()
    {
        return this;
    }

    public Ref next()
    {
        if (refs.size() > index)
        {
            ArrayList arraylist = refs;
            int i = index;
            index = i + 1;
            return (Ref)arraylist.get(i);
        } else
        {
            return null;
        }
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
    }

    public (ArrayList arraylist)
    {
        this$0 = Sequence.this;
        super();
        refs = new ArrayList();
        index = 0;
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        sequence = arraylist.iterator();
_L5:
        if (Iterator.this.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        arraylist = ((Par)Iterator.this.next()).getRefList();
        if (arraylist != null && arraylist.size() > 0)
        {
            arraylist = arraylist.iterator();
            while (arraylist.hasNext()) 
            {
                Ref ref = (Ref)arraylist.next();
                if (ref.getPrimaryAsset() != null)
                {
                    refs.add(ref);
                }
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
    }
}
