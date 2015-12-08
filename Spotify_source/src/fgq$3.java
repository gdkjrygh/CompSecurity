// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.Iterator;
import java.util.Set;

final class ang.Object
    implements android.view.nFocusChangeListener
{

    private fgq a;

    public final void onFocusChange(View view, boolean flag)
    {
        for (view = a.a.iterator(); view.hasNext(); ((fhb)view.next()).a(flag)) { }
    }

    (fgq fgq1)
    {
        a = fgq1;
        super();
    }
}
