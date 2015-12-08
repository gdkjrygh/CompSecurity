// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.format.Formatter;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public final class fdv extends hgu
{

    private final dum a;
    private final fbx b;

    public fdv(dum dum1, fbx fbx1)
    {
        a = dum1;
        b = fbx1;
    }

    public final int a()
    {
        return aa.f;
    }

    public final void a(afn afn)
    {
        Object obj = (fcm)a.a(fcm);
        afn = (fdx)afn;
        Context context = ((fdx) (afn)).o.getContext();
        ((fdx) (afn)).s.setVisibility(8);
        ((fdx) (afn)).r.setVisibility(8);
        ((fdx) (afn)).q.setVisibility(8);
        switch (fdw.a[b.ordinal()])
        {
        default:
            afn = String.valueOf(b);
            throw new IllegalStateException((new StringBuilder(String.valueOf(afn).length() + 41)).append("unhandled DeviceManagementFeature state: ").append(afn).toString());

        case 1: // '\001'
            ((fdx) (afn)).r.setVisibility(0);
            ((fdx) (afn)).q.setVisibility(0);
            ((fdx) (afn)).p.setText(s.t);
            ((fdx) (afn)).q.setText(context.getResources().getQuantityString(b.nN, ((fcm) (obj)).d, new Object[] {
                Integer.valueOf(((fcm) (obj)).d)
            }));
            obj = ((fdx) (afn)).r.getIndeterminateDrawable();
            ((Drawable) (obj)).mutate();
            ((Drawable) (obj)).setColorFilter(context.getResources().getColor(b.nH), android.graphics.PorterDuff.Mode.MULTIPLY);
            ((fdx) (afn)).r.setIndeterminateDrawable(((Drawable) (obj)));
            return;

        case 2: // '\002'
            ((fdx) (afn)).s.setVisibility(0);
            break;
        }
        ((fdx) (afn)).p.setText(context.getString(s.A, new Object[] {
            Formatter.formatFileSize(context, ((fcm) (obj)).e)
        }));
    }

    public final long b()
    {
        return a.c;
    }
}
