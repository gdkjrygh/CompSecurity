// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import com.kik.android.a;
import java.util.Vector;
import kik.a.d.k;
import kik.a.e.i;
import kik.android.chat.KikApplication;
import kik.android.util.cq;

// Referenced classes of package kik.android.widget:
//            cq

public final class cp extends kik.android.chat.fragment.KikDialogFragment.a
{

    public cp(k k, Vector vector, Context context, String s, a a, i i)
    {
        context = View.inflate(context, 0x7f03003e, null);
        vector = new kik.android.widget.cq(this, a, s, (CheckBox)context.findViewById(0x7f0e00f0), i, vector, k);
        a(KikApplication.f(0x7f0901fe)).b(KikApplication.a(0x7f0901ff, new Object[] {
            (new StringBuilder()).append(cq.a(k)).append(" ").append(cq.b(k)).toString()
        })).b(KikApplication.f(0x7f090299), vector).a(KikApplication.f(0x7f0902fd), vector).a(context);
    }
}
