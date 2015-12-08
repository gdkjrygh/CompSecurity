// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.user.TopArtistModel;

public final class fkq extends ftv
{

    public fkq(Context context)
    {
        super(context, false);
    }

    public fkq(Context context, byte byte0)
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
        obj = (TopArtistModel)obj;
        ddd.a(((TopArtistModel) (obj)).getName());
        ddd.a().setTag(obj);
        ddd.c(a.getResources().getQuantityString(0x7f09001a, ((TopArtistModel) (obj)).getFollowersCount(), new Object[] {
            Integer.valueOf(((TopArtistModel) (obj)).getFollowersCount())
        }));
        gji gji1 = c;
        gji1.a(ddd.e(), ((TopArtistModel) (obj)).getImageUrl(), dff.g(gji1.a), dfo.a());
    }
}
