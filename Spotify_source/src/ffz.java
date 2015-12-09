// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonPlayable;
import com.spotify.mobile.android.spotlets.search.model.SearchResults;
import com.spotify.mobile.android.spotlets.search.model.offline.OfflineResults;
import com.spotify.mobile.android.spotlets.search.model.offline.OfflineTrack;
import com.spotify.mobile.android.spotlets.search.model.offline.OfflineTrackAlbum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ffz
    implements ghl
{

    private final Context a;
    private final fgc b;

    public ffz(Context context, fgc fgc1)
    {
        a = (Context)ctz.a(context);
        b = (fgc)ctz.a(fgc1);
    }

    public final Object a(Object obj)
    {
        Object obj1 = (OfflineResults)obj;
        String s = a.getString(0x7f08046b);
        Integer integer;
        com.spotify.mobile.android.porcelain.json.collection.PorcelainJsonImmutableLinearCollection porcelainjsonimmutablelinearcollection;
        if (((OfflineResults) (obj1)).tracks.hasResults())
        {
            ArrayList arraylist = new ArrayList(((OfflineResults) (obj1)).tracks.count + 1);
            obj = new dpg();
            obj.a = s;
            arraylist.add(((dpg) (obj)).b());
            int i = 0;
            while (i < ((OfflineResults) (obj1)).tracks.results.size()) 
            {
                OfflineTrack offlinetrack = (OfflineTrack)((OfflineResults) (obj1)).tracks.results.get(i);
                dpe dpe1 = new dpe();
                dpe1.g = true;
                Object obj3 = new StringBuilder();
                ((StringBuilder) (obj3)).append(offlinetrack.artists());
                if (offlinetrack.album != null)
                {
                    ((StringBuilder) (obj3)).append(" \u2022 ").append(offlinetrack.album.name);
                }
                obj = new dpn();
                Object obj2 = dpa.b(offlinetrack.getName());
                obj2.a = com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format.a;
                obj3 = dpa.b(((StringBuilder) (obj3)).toString());
                obj3.a = com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format.a;
                dpe1.a = ((dpn) (obj)).a(new dpo[] {
                    obj2, obj3
                }).a();
                obj2 = new dpm();
                obj2.e = offlinetrack.getName();
                obj2.d = offlinetrack.artists();
                obj = offlinetrack.mainArtistUri();
                if (obj == null)
                {
                    obj = "";
                }
                obj2.c = (String)obj;
                if (offlinetrack.album != null)
                {
                    obj2.a = offlinetrack.album.getUri();
                    obj2.b = offlinetrack.album.getName();
                    obj2.f = offlinetrack.album.getImageUri();
                } else
                {
                    obj2.b = "";
                    obj2.a = "";
                }
                obj3 = JsonNodeFactory.instance.objectNode().put("row", i);
                if (offlinetrack.isLocal)
                {
                    obj = "local";
                } else
                {
                    obj = "synced";
                }
                obj = ((ObjectNode) (obj3)).put("origin", ((String) (obj))).put("section", "offline-results");
                obj3 = new dpl();
                obj3.c = "offline-track-results";
                obj3.a = offlinetrack.getUri();
                obj3.b = new com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonPlayable.PorcelainJsonEntityInfo(((dpm) (obj2)).a, ((dpm) (obj2)).b, ((dpm) (obj2)).c, ((dpm) (obj2)).d, ((dpm) (obj2)).e, ((dpm) (obj2)).f);
                obj3.d = ((com.fasterxml.jackson.databind.JsonNode) (obj));
                dpe1.e = new PorcelainJsonPlayable(null, ((dpl) (obj3)).a, ((dpl) (obj3)).b, ((dpl) (obj3)).c, ((dpl) (obj3)).d);
                arraylist.add(dpe1.b());
                i++;
            }
            obj = arraylist;
        } else
        {
            obj = Collections.emptyList();
        }
        obj1 = ((OfflineResults) (obj1)).searchTerm;
        porcelainjsonimmutablelinearcollection = dpa.b("offline-results", ((List) (obj)));
        if (b.isSessionAvailable())
        {
            obj = b.getCurrentSessionId();
        } else
        {
            obj = null;
        }
        if (b.isSessionAvailable())
        {
            integer = Integer.valueOf(b.getCurrentSequenceNumber());
        } else
        {
            integer = null;
        }
        return new SearchResults(((String) (obj1)), porcelainjsonimmutablelinearcollection, null, s, null, ((String) (obj)), integer, "offlineTracks", Boolean.valueOf(false), Boolean.valueOf(true), null);
    }
}
