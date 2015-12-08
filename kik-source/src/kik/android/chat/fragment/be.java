// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package kik.android.chat.fragment:
//            KikAddToBlockFragment

final class be
    implements android.widget.AdapterView.OnItemClickListener
{

    final KikAddToBlockFragment a;

    be(KikAddToBlockFragment kikaddtoblockfragment)
    {
        a = kikaddtoblockfragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        view = (Cursor)adapterview.getItemAtPosition(i);
        adapterview = view.getString(view.getColumnIndex("suggest_intent_data_id"));
        view = view.getString(view.getColumnIndex("suggest_text_1"));
        KikAddToBlockFragment.a(a, adapterview, view);
    }
}
