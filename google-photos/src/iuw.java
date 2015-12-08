// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

public final class iuw extends mua
{

    private am d;

    public iuw(Context context, ay ay1)
    {
        super(context, ay1);
    }

    public final void a(am am1)
    {
        d = am1;
    }

    public final void a(String s)
    {
        al al1 = (al)b.a("photos_background_task_dialog");
        if (al1 != null && TextUtils.equals(s, ((am) (al1)).q.getString("arg_task_tag")))
        {
            al1.a(false);
        }
    }

    public final void a(String s, String s1, String s2, boolean flag)
    {
        if ((al)b.a("photos_background_task_dialog") == null)
        {
            if (s == null)
            {
                s = new iux();
                s.f(new Bundle());
            } else
            {
                s = iuy.a(s, s1);
            }
            ((am) (s)).q.putString("arg_task_tag", s2);
            s.b(flag);
            s.a(d, 0);
            s.a(b, "photos_background_task_dialog");
        }
    }

    public final boolean a(mue mue1)
    {
        boolean flag1 = false;
        Object obj;
        if (mue.a(mue1))
        {
            obj = mue1.c;
        }
        obj = a;
        boolean flag = flag1;
        if (mue1 != null)
        {
            flag = flag1;
            if (!TextUtils.isEmpty(mue1.d))
            {
                c = false;
                obj = ((dgk)olm.a(((Context) (obj)), dgk)).a();
                obj.d = mue1.d;
                ((dgg) (obj)).a().c();
                flag = true;
            }
        }
        return flag;
    }
}
