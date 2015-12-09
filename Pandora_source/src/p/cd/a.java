// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cd;

import android.content.Context;
import com.pandora.radio.provider.d;
import com.pandora.radio.provider.i;
import java.util.List;
import p.cw.c;

public class a extends android.support.v4.content.a
{

    protected final c f;
    protected final String g;
    protected final boolean h;
    protected List i;

    public a(Context context, c c1, String s)
    {
        this(context, c1, s, false);
    }

    private a(Context context, c c1, String s, boolean flag)
    {
        super(context);
        f = c1;
        g = s;
        h = flag;
    }

    public void a(List list)
    {
        super.deliverResult(list);
        i = list;
    }

    public Object c()
    {
        return e();
    }

    public void deliverResult(Object obj)
    {
        a((List)obj);
    }

    public List e()
    {
        return f.w().e().a(g, h);
    }

    protected void onStartLoading()
    {
        super.onStartLoading();
        if (i != null)
        {
            a(i);
            return;
        } else
        {
            forceLoad();
            return;
        }
    }
}
