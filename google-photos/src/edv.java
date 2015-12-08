// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

final class edv
    implements hhg
{

    private List a;
    private edp b;

    edv(edp edp1, List list)
    {
        b = edp1;
        a = list;
        super();
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        Iterator iterator = a.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        afn afn = ((hhg)iterator.next()).a(viewgroup, i);
        if (afn == null) goto _L4; else goto _L3
_L3:
        viewgroup = afn;
_L6:
        return viewgroup;
_L2:
        afn afn1 = (new dvm()).a(viewgroup, i);
        viewgroup = afn1;
        if (afn1 == null)
        {
            viewgroup = String.valueOf(edp.f(b).getResources().getResourceName(i));
            if (viewgroup.length() != 0)
            {
                viewgroup = "No view holder provider found for viewType: ".concat(viewgroup);
            } else
            {
                viewgroup = new String("No view holder provider found for viewType: ");
            }
            throw new IllegalStateException(viewgroup);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
