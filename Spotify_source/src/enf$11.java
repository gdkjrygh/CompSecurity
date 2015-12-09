// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class ng.Object
    implements android.widget.View.OnItemLongClickListener
{

    private enf a;

    public final boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (fxh)view.getTag(0x7f110041);
        if (adapterview != null)
        {
            adapterview.a(a.k());
            return true;
        } else
        {
            return false;
        }
    }

    iew(enf enf1)
    {
        a = enf1;
        super();
    }
}
