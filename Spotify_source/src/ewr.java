// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.onboarding.taste.model.Question;

public final class ewr extends eqk
{

    private ewv c;

    public ewr(ewv ewv1)
    {
        c = (ewv)ctz.a(ewv1);
    }

    public final int a(int i)
    {
        if (i == super.b())
        {
            return 1;
        } else
        {
            return super.a(i);
        }
    }

    public final abo a(ViewGroup viewgroup, int i)
    {
        if (i == 1)
        {
            return new ewt(viewgroup);
        } else
        {
            viewgroup = new ews(viewgroup);
            viewgroup.l = c;
            return viewgroup;
        }
    }

    public final int b()
    {
        return super.b() + 1;
    }

    public final Object f(int i)
    {
        if (i == super.b())
        {
            return new Question("PADDING", "PADDING", null, null);
        } else
        {
            return (Question)super.f(i);
        }
    }
}
