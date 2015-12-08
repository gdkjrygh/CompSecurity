// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.activityfeed.model.UserModel;

public final class edj extends ftv
{

    public edj(Context context)
    {
        super(context, false);
    }

    protected final volatile ddd a(Context context, ViewGroup viewgroup)
    {
        return dds.a(context, viewgroup);
    }

    protected final void a(ddd ddd, Object obj)
    {
        ddd = (ddi)ddd;
        obj = (UserModel)obj;
        ddd.a(((UserModel) (obj)).getName());
        ddd.a().setTag(obj);
        c.b(ddd.d(), ((UserModel) (obj)).getImage());
    }
}
