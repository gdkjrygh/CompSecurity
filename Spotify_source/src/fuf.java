// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;

public final class fuf
    implements android.widget.AdapterView.OnItemLongClickListener
{

    private Context a;

    public fuf(Context context)
    {
        a = context;
    }

    public final boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((AdapterView) (view.getTag(0x7f110041)));
        if (adapterview == null)
        {
            return false;
        } else
        {
            ((fxh)adapterview).a(a);
            return true;
        }
    }
}
