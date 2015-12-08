// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.widget.SectionIndexer;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            a, h

class g extends a
    implements SectionIndexer
{

    SectionIndexer b;

    g(Context context, h h)
    {
        super(context, h);
        b = (SectionIndexer)h;
    }

    public int getPositionForSection(int i)
    {
        return b.getPositionForSection(i);
    }

    public int getSectionForPosition(int i)
    {
        return b.getSectionForPosition(i);
    }

    public Object[] getSections()
    {
        return b.getSections();
    }
}
