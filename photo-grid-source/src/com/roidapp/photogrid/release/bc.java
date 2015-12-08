// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.AdapterView;
import com.roidapp.baselib.c.an;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.release:
//            EffectsList

final class bc
    implements android.widget.AdapterView.OnItemClickListener
{

    final EffectsList a;

    bc(EffectsList effectslist)
    {
        a = effectslist;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (!EffectsList.b(a)) goto _L4; else goto _L3
_L3:
        EffectsList.a(a, "exchange");
_L6:
        return;
_L4:
        an.a(new WeakReference(a), a.getString(0x7f070209));
        return;
_L2:
        if (i == 1)
        {
            EffectsList.a(a, "move_zoom_rotate");
            return;
        }
        if (i == 2)
        {
            EffectsList.a(a, "sketch");
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
