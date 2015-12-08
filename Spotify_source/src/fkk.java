// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.user.PlaylistModel;

public final class fkk extends ftv
{

    public fkk(Context context)
    {
        super(context, false);
    }

    public fkk(Context context, byte byte0)
    {
        super(context, true);
    }

    protected final ddd a(Context context, ViewGroup viewgroup)
    {
        return dds.d(context, viewgroup);
    }

    protected final void a(ddd ddd, Object obj)
    {
        ddd = (ddm)ddd;
        obj = (PlaylistModel)obj;
        ddd.a(((PlaylistModel) (obj)).getName());
        ddd.c(a.getResources().getQuantityString(0x7f09001c, ((PlaylistModel) (obj)).getFollowersCount(), new Object[] {
            Integer.valueOf(((PlaylistModel) (obj)).getFollowersCount())
        }));
        ImageView imageview = ddd.e();
        c.d(imageview, ((PlaylistModel) (obj)).getImageUrl());
        imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        ddd.a().setTag(obj);
    }
}
