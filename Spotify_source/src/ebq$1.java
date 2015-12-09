// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem;
import com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItems;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import java.util.ArrayList;

final class ang.Object
    implements epg
{

    private ebq a;

    public final void a(Object obj)
    {
        hkf hkf1;
        ebq ebq1;
        RecentlyPlayedItem arecentlyplayeditem[];
        ArrayList arraylist;
        obj = (RecentlyPlayedItems)obj;
        hkf1 = a.c;
        ebq1 = a;
        arecentlyplayeditem = ((RecentlyPlayedItems) (obj)).getItems();
        arraylist = new ArrayList();
        if (arecentlyplayeditem == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = arecentlyplayeditem.length;
        i = 0;
_L23:
        if (i >= j) goto _L2; else goto _L3
_L3:
        RecentlyPlayedItem recentlyplayeditem = arecentlyplayeditem[i];
        a[recentlyplayeditem.type.ordinal()];
        JVM INSTR tableswitch 1 5: default 108
    //                   1 344
    //                   2 397
    //                   3 397
    //                   4 397
    //                   5 397;
           goto _L4 _L5 _L6 _L6 _L6 _L6
_L4:
        String s;
        Assertion.b((new StringBuilder("Unknown type with link: ")).append(recentlyplayeditem.link).toString());
        s = "";
_L19:
        a[recentlyplayeditem.type.ordinal()];
        JVM INSTR tableswitch 1 5: default 180
    //                   1 406
    //                   2 468
    //                   3 494
    //                   4 534
    //                   5 508;
           goto _L7 _L8 _L9 _L10 _L11 _L12
_L7:
        Assertion.b((new StringBuilder("Unknown type with link: ")).append(recentlyplayeditem.link).toString());
        obj = "";
_L20:
        a[recentlyplayeditem.type.ordinal()];
        JVM INSTR tableswitch 1 5: default 252
    //                   1 561
    //                   2 573
    //                   3 585
    //                   4 597
    //                   5 612;
           goto _L13 _L14 _L15 _L16 _L17 _L18
_L13:
        Object obj1;
        Assertion.b((new StringBuilder("Unknown type with link: ")).append(recentlyplayeditem.link).toString());
        obj1 = Uri.EMPTY;
_L21:
        obj1 = new ebh(((Uri) (obj1)));
        obj1.a = com.spotify.mobile.android.service.media.browser.rowserItem.ActionType.a;
        obj1.d = ebq1.b.a(dto.a(recentlyplayeditem.imageUri));
        obj1.b = s;
        obj1.c = ((String) (obj));
        arraylist.add(((ebh) (obj1)).a());
        i++;
        continue; /* Loop/switch isn't completed */
_L5:
        if (recentlyplayeditem.isStarred)
        {
            s = ebq1.a.getString(0x7f0803ff);
        } else
        if (recentlyplayeditem.isTopTracks)
        {
            s = ebq1.a.getString(0x7f080400);
        } else
        {
            s = recentlyplayeditem.name;
        }
          goto _L19
_L6:
        s = recentlyplayeditem.name;
          goto _L19
_L8:
        if (!recentlyplayeditem.isOwnedBySelf && !TextUtils.isEmpty(recentlyplayeditem.ownerName))
        {
            obj = ebq1.a.getString(0x7f080451, new Object[] {
                recentlyplayeditem.ownerName
            });
        } else
        {
            obj = ebq1.a.getResources().getString(0x7f080450);
        }
          goto _L20
_L9:
        obj = ebq1.a.getString(0x7f08044e, new Object[] {
            recentlyplayeditem.artistName
        });
          goto _L20
_L10:
        obj = ebq1.a.getString(0x7f08044f);
          goto _L20
_L12:
        obj = ebq1.a.getString(0x7f080452, new Object[] {
            recentlyplayeditem.publisher
        });
          goto _L20
_L11:
        obj = gpl.a(ebq1.a, new SpotifyLink(gpl.c(recentlyplayeditem.link)));
          goto _L20
_L14:
        obj1 = eay.b(recentlyplayeditem.link);
          goto _L21
_L15:
        obj1 = eay.c(recentlyplayeditem.link);
          goto _L21
_L16:
        obj1 = eay.d(recentlyplayeditem.link);
          goto _L21
_L17:
        obj1 = gpl.a(gpl.d(recentlyplayeditem.link));
          goto _L21
_L18:
        obj1 = Uri.EMPTY;
          goto _L21
_L2:
        hkf1.onNext(arraylist);
        return;
        if (true) goto _L23; else goto _L22
_L22:
    }

    public final void a(String s)
    {
        a.c.onError(new RuntimeException(s));
    }

    (ebq ebq1)
    {
        a = ebq1;
        super();
    }
}
