// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.socialchart.model.InfluencerModel;

public final class fjf extends ftv
{

    public fjf(Context context)
    {
        super(context, false);
    }

    protected final ddd a(Context context, ViewGroup viewgroup)
    {
        return dds.d(context, viewgroup);
    }

    protected final void a(ddd ddd, Object obj)
    {
        ddd = (ddm)ddd;
        obj = (InfluencerModel)obj;
        ddd.a(((InfluencerModel) (obj)).getName());
        ddd.b(a.getResources().getQuantityString(0x7f090020, ((InfluencerModel) (obj)).getPlays(), new Object[] {
            Integer.valueOf(((InfluencerModel) (obj)).getPlays())
        }));
        ddd.a().setTag(obj);
        if (TextUtils.isEmpty(((InfluencerModel) (obj)).getImageUrl()))
        {
            ddd.e().setImageDrawable(dff.j(a));
            return;
        } else
        {
            c.b(ddd.e(), ((InfluencerModel) (obj)).getImageUrl());
            return;
        }
    }
}
