// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            KikStartGroupFragment

final class pt
    implements TextWatcher
{

    final KikStartGroupFragment a;

    pt(KikStartGroupFragment kikstartgroupfragment)
    {
        a = kikstartgroupfragment;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (charsequence != null && !charsequence.toString().isEmpty() && a.groupNameClearButton != null)
        {
            cv.b(new View[] {
                a.groupNameClearButton
            });
        } else
        if (a.groupNameClearButton != null)
        {
            cv.e(new View[] {
                a.groupNameClearButton
            });
            return;
        }
    }
}
