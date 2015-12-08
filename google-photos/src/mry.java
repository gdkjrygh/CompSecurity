// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import java.util.List;
import java.util.Locale;

public final class mry
    implements mru
{

    private static List d;
    public final int a;
    public final msn b;
    public String c;

    public mry(int i, msn msn1)
    {
        a = i;
        b = msn1;
    }

    public static void a(Context context, int i)
    {
        a(context, -1, (new msn()).a(context));
    }

    public static void a(Context context, int i, msn msn1)
    {
        (new mry(i, msn1)).b(context);
    }

    public static void a(View view, int i)
    {
        a(view.getContext(), i, (new msn()).a(view));
    }

    public final String a(Context context, mrw mrw1)
    {
        if (c != null)
        {
            return c;
        } else
        {
            return mrw1.a(context);
        }
    }

    public final void a(Context context)
    {
        if (d == null)
        {
            d = olm.c(context, msq);
        }
        for (int i = 0; i < d.size(); i++)
        {
            d.get(i);
        }

    }

    public final void b(Context context)
    {
        ((mrv)olm.a(context, mrv)).a(context, this);
    }

    public final String toString()
    {
        return String.format(Locale.getDefault(), "UserEvent action: %d on: %s", new Object[] {
            Integer.valueOf(a), b.toString()
        });
    }
}
