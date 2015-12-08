// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

public final class olq extends ContextWrapper
    implements olp
{

    public final olm a;
    private LayoutInflater b;

    public olq()
    {
        super(null);
        a = new olm();
    }

    public olq(Context context)
    {
        this(context, olm.b(context));
    }

    private olq(Context context, olm olm1)
    {
        super(context);
        if (context == null)
        {
            throw new IllegalArgumentException("Cannot construct BinderContextWrapper with null Context");
        } else
        {
            a = new olm(this, olm1);
            return;
        }
    }

    public final void a(Context context)
    {
        attachBaseContext(context);
        a.a(context);
    }

    public final void a(olm olm1)
    {
        a.a = olm1;
    }

    public final olm ai_()
    {
        return a;
    }

    public final Object getSystemService(String s)
    {
        if (s.equals("layout_inflater"))
        {
            if (b == null)
            {
                b = ((LayoutInflater)super.getSystemService(s)).cloneInContext(this);
            }
            return b;
        } else
        {
            return super.getSystemService(s);
        }
    }
}
