// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.SpeechService;
import com.fitbit.runtrack.b;
import com.fitbit.ui.a.c;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Locale;

// Referenced classes of package com.fitbit.runtrack.ui:
//            MultiChoiceDialogFragment

private static class addAll extends c
    implements android.view.ragment.a
{

    private void a(View view)
    {
        com.fitbit.savedstate. ;
        Resources resources;
        b b1;
        com.fitbit.data.domain.addAll addall;
         = (com.fitbit.savedstate.)view.getTag();
        resources = view.getResources();
        b1 = new b(EnumSet.of());
        addall = an.a().b().t();
        a[.ordinal()];
        JVM INSTR tableswitch 1 5: default 80
    //                   1 110
    //                   2 158
    //                   3 202
    //                   4 253
    //                   5 297;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        String s = b1.a(resources);
        view.getContext().startService(SpeechService.a(view.getContext(), Locale.getDefault(), s, 3, 0.8F));
        return;
_L2:
        int i;
        if (addall.ordinal(com.fitbit.data.domain.ordinal))
        {
            i = 0x7f100001;
        } else
        {
            i = 0x7f100000;
        }
        b1.a(new Length(resources.getFraction(i, 1, 1), addall));
        continue; /* Loop/switch isn't completed */
_L3:
        int j;
        if (addall.ordinal(com.fitbit.data.domain.ordinal))
        {
            j = 0x7f0e000a;
        } else
        {
            j = 0x7f0e0009;
        }
        b1.a(new Duration(resources.getInteger(j)));
        continue; /* Loop/switch isn't completed */
_L4:
        int k;
        if (addall.ordinal(com.fitbit.data.domain.ordinal))
        {
            k = 0x7f0e0006;
        } else
        {
            k = 0x7f0e0005;
        }
        b1.b(new Duration(resources.getInteger(k)));
        b1.a(addall);
        continue; /* Loop/switch isn't completed */
_L5:
        int l;
        if (addall.ordinal(com.fitbit.data.domain.ordinal))
        {
            l = 0x7f0e000c;
        } else
        {
            l = 0x7f0e000b;
        }
        b1.c(new Duration(resources.getInteger(l)));
        continue; /* Loop/switch isn't completed */
_L6:
        int i1;
        if (addall.ordinal(com.fitbit.data.domain.ordinal))
        {
            i1 = 0x7f0e0008;
        } else
        {
            i1 = 0x7f0e0007;
        }
        b1.a(resources.getInteger(i1));
        if (true) goto _L1; else goto _L7
_L7:
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f040139, viewgroup, false);
        }
        viewgroup = (CheckedTextView)view1.findViewById(0x1020014);
        view = (ordinal)getItem(i);
        viewgroup.setText(((getItem) (view)).a);
        viewgroup.setChecked(((a) (view)).c.booleanValue());
        viewgroup.setTag(Integer.valueOf(i));
        viewgroup.setOnClickListener(this);
        viewgroup = view1.findViewById(0x7f1103be);
        viewgroup.setTag(((c) (view)).b);
        viewgroup.setOnClickListener(this);
        return view1;
    }

    public void onClick(View view)
    {
        if (view.getId() != 0x7f1103be) goto _L2; else goto _L1
_L1:
        a(view);
_L5:
        return;
_L2:
        CheckedTextView checkedtextview;
        int i;
        int j;
        int k;
        checkedtextview = (CheckedTextView)view;
        checkedtextview.toggle();
        j = ((Integer)view.getTag()).intValue();
        MultiChoiceDialogFragment.a()[j] = checkedtextview.isChecked();
        view = MultiChoiceDialogFragment.a();
        k = view.length;
        i = 0;
_L6:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        if (view[i] == 0) goto _L4; else goto _L3
_L3:
        i = 1;
_L7:
        if (i == 0)
        {
            checkedtextview.toggle();
            MultiChoiceDialogFragment.a()[j] = checkedtextview.isChecked();
            return;
        }
          goto _L5
_L4:
        i++;
          goto _L6
        i = 0;
          goto _L7
    }

    public (Collection collection)
    {
        addAll(collection);
    }
}
