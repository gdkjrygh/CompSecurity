// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import java.util.ArrayList;

public abstract class ebt
    implements ebi, gpi
{

    protected final eay a;
    private ecb b;
    private final gou c;
    private ebg d;

    public ebt(eay eay, ecb ecb1, Context context)
    {
        a = eay;
        b = ecb1;
        dmz.a(gow);
        c = gow.a(context, this);
    }

    public final void a()
    {
        c.b();
    }

    public final void a(RadioStationsModel radiostationsmodel)
    {
        radiostationsmodel = b(radiostationsmodel);
        if (radiostationsmodel != null && d != null)
        {
            ebg ebg1 = d;
            ArrayList arraylist = new ArrayList(radiostationsmodel.length);
            int j = radiostationsmodel.length;
            for (int i = 0; i < j; i++)
            {
                RadioStationModel radiostationmodel = radiostationsmodel[i];
                android.net.Uri uri = b.a(dto.a(radiostationmodel.imageUri));
                ebh ebh1 = new ebh(radiostationmodel.getPlayableUri());
                ebh1.b = radiostationmodel.title;
                ebh1.d = uri;
                ebh1.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.a;
                arraylist.add(ebh1.a());
            }

            ebg1.a(arraylist);
        }
        c.b();
        d = null;
    }

    public final void a(gpg gpg)
    {
    }

    public final void a(String s, ebg ebg1, Flags flags)
    {
        d = ebg1;
        c.a();
    }

    protected abstract RadioStationModel[] b(RadioStationsModel radiostationsmodel);

    public final void p()
    {
    }
}
