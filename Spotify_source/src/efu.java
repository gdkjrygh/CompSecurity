// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.album.model.Album;
import com.spotify.mobile.android.spotlets.album.model.AlbumArtist;
import com.spotify.mobile.android.spotlets.album.model.AlbumDisc;
import com.spotify.mobile.android.spotlets.album.model.AlbumImage;
import com.spotify.mobile.android.spotlets.album.model.AlbumTrack;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class efu extends gbg
{

    private gji c;

    public efu(Context context)
    {
        super(context);
        dmz.a(gjj);
        c = gjj.a(getContext());
        b(getContext().getString(0x7f080069));
        super.b.setImageDrawable(dff.a(getContext()));
    }

    public final void a(Album album)
    {
        int i;
        ctz.a(album);
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).set(1, album.year);
        ((Calendar) (obj)).set(2, album.month);
        ((Calendar) (obj)).set(5, album.day);
        a(((Calendar) (obj)).getTime().getTime() / 1000L);
        c(album.getFirstArtistName());
        obj = album.discs.iterator();
        i = 0;
        do
        {
label0:
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                Iterator iterator = ((AlbumDisc)((Iterator) (obj)).next()).tracks.iterator();
                int j = i;
                do
                {
                    i = j;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    j += ((AlbumTrack)iterator.next()).duration;
                } while (true);
            }
        } while (true);
        a(i / 1000);
        if (album.artists.size() > 0)
        {
            album = ((AlbumArtist)album.artists.get(0)).image;
            if (album != null)
            {
                c.c(super.b, ((AlbumImage) (album)).uri);
            }
        }
        return;
    }
}
