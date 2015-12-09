// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.database.DataSetObserver;
import java.util.List;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            a

class  extends DataSetObserver
{

    final a a;

    public void onChanged()
    {
        se.emilsjolander.stickylistheaders.a.c(a);
    }

    public void onInvalidated()
    {
        se.emilsjolander.stickylistheaders.a.a(a).clear();
        se.emilsjolander.stickylistheaders.a.b(a);
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
