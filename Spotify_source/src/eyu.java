// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.party.json.AlbumJacksonModel;
import com.spotify.mobile.android.spotlets.party.json.ArtistJacksonModel;
import com.spotify.mobile.android.spotlets.party.json.AudioJacksonModel;
import com.spotify.mobile.android.spotlets.party.json.CurveJacksonModel;
import com.spotify.mobile.android.spotlets.party.json.FadeInTransitionJacksonModel;
import com.spotify.mobile.android.spotlets.party.json.FadeOutTransitionJacksonModel;
import com.spotify.mobile.android.spotlets.party.json.PointJacksonModel;
import com.spotify.mobile.android.spotlets.party.json.TrackJacksonModel;
import com.spotify.mobile.android.spotlets.party.json.TracksJacksonModel;
import com.spotify.mobile.android.spotlets.party.json.TransitionCurveJacksonModel;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class eyu
{

    public String a;
    public String b;
    private final Resolver c;
    private final Player d;
    private final ObjectMapper e;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback f;

    public eyu(Resolver resolver)
    {
        f = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback() {

            public final void onPlayForbidden(List list)
            {
                TextUtils.join(",", list);
            }

            public final void onPlaySuccess()
            {
            }

        };
        c = resolver;
        d = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(c, ViewUri.m.toString(), FeatureIdentifier.G, FeatureIdentifier.G);
        e = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    private static String a(TransitionCurveJacksonModel transitioncurvejacksonmodel)
    {
        JSONArray jsonarray = new JSONArray();
        JSONObject jsonobject;
        for (transitioncurvejacksonmodel = transitioncurvejacksonmodel.fadeCurves.iterator(); transitioncurvejacksonmodel.hasNext(); jsonarray.put(jsonobject))
        {
            CurveJacksonModel curvejacksonmodel = (CurveJacksonModel)transitioncurvejacksonmodel.next();
            jsonobject = new JSONObject();
            jsonobject.put("start_point", curvejacksonmodel.startPoint);
            jsonobject.put("end_point", curvejacksonmodel.endPoint);
            jsonobject.put("fade_curve", a(curvejacksonmodel));
        }

        return jsonarray.toString();
    }

    private Map a(TrackJacksonModel trackjacksonmodel)
    {
        HashMap hashmap = new HashMap();
        if (!TextUtils.isEmpty(trackjacksonmodel.name))
        {
            hashmap.put("title", trackjacksonmodel.name);
        }
        if (!trackjacksonmodel.artists.isEmpty() && !TextUtils.isEmpty(((ArtistJacksonModel)trackjacksonmodel.artists.get(0)).name))
        {
            hashmap.put("artist_name", ((ArtistJacksonModel)trackjacksonmodel.artists.get(0)).name);
        }
        if (!TextUtils.isEmpty(trackjacksonmodel.album.name))
        {
            hashmap.put("album_title", trackjacksonmodel.album.name);
        }
        if (!TextUtils.isEmpty(trackjacksonmodel.album.image))
        {
            hashmap.put("image_url", trackjacksonmodel.album.image);
        }
        hashmap.put("audio.fade_in_duration", String.valueOf(trackjacksonmodel.audio.fadeInDuration));
        hashmap.put("audio.fade_out_duration", String.valueOf(trackjacksonmodel.audio.fadeOutDuration));
        if (trackjacksonmodel.audio.fadeInStartTime > 0L)
        {
            hashmap.put("audio.fade_in_start_time", String.valueOf(trackjacksonmodel.audio.fadeInStartTime));
        }
        if (trackjacksonmodel.audio.fadeOutStartTime > 0L)
        {
            hashmap.put("audio.fade_out_start_time", String.valueOf(trackjacksonmodel.audio.fadeOutStartTime));
        }
        if (trackjacksonmodel.audio.overlap != null)
        {
            hashmap.put("overlap", trackjacksonmodel.audio.overlap.toString());
        }
        if (!trackjacksonmodel.proofedUsernames.isEmpty())
        {
            try
            {
                hashmap.put("party.proofedUsernames", e.writeValueAsString(trackjacksonmodel.proofedUsernames));
            }
            catch (JsonProcessingException jsonprocessingexception)
            {
                Logger.b(jsonprocessingexception, "Could not serialize usernames", new Object[0]);
            }
        }
        if (trackjacksonmodel.audio.fadeInTransition != null && trackjacksonmodel.audio.fadeInTransition.fadeInCurve != null)
        {
            try
            {
                hashmap.put("audio.fade_in_curves", a(trackjacksonmodel.audio.fadeInTransition.fadeInCurve));
            }
            catch (JSONException jsonexception)
            {
                Logger.b(jsonexception, "Failed building fade in curves.", new Object[0]);
            }
        }
        if (trackjacksonmodel.audio.fadeOutTransition != null && trackjacksonmodel.audio.fadeOutTransition.fadeOutCurve != null)
        {
            try
            {
                hashmap.put("audio.fade_out_curves", a(trackjacksonmodel.audio.fadeOutTransition.fadeOutCurve));
            }
            catch (JSONException jsonexception1)
            {
                Logger.b(jsonexception1, "Failed building fade out curves.", new Object[0]);
            }
        }
        if (trackjacksonmodel.mediaManifest != null)
        {
            hashmap.put("media.manifest", trackjacksonmodel.mediaManifest);
        }
        return hashmap;
    }

    private static JSONArray a(CurveJacksonModel curvejacksonmodel)
    {
        JSONArray jsonarray = new JSONArray();
        JSONObject jsonobject;
        for (curvejacksonmodel = curvejacksonmodel.controlPoints.iterator(); curvejacksonmodel.hasNext(); jsonarray.put(jsonobject))
        {
            PointJacksonModel pointjacksonmodel = (PointJacksonModel)curvejacksonmodel.next();
            jsonobject = new JSONObject();
            jsonobject.put("x", pointjacksonmodel.x);
            jsonobject.put("y", pointjacksonmodel.y);
        }

        return jsonarray;
    }

    public final void a(TracksJacksonModel tracksjacksonmodel, int i)
    {
        PlayerTrack aplayertrack[] = new PlayerTrack[tracksjacksonmodel.tracks.size()];
        int k = tracksjacksonmodel.tracks.size();
        for (int j = 0; j < k; j++)
        {
            TrackJacksonModel trackjacksonmodel = (TrackJacksonModel)tracksjacksonmodel.tracks.get(j);
            aplayertrack[j] = PlayerTrack.create(trackjacksonmodel.uri, trackjacksonmodel.album.uri, ((ArtistJacksonModel)trackjacksonmodel.artists.get(0)).uri, String.format("%s:%s", new Object[] {
                null, trackjacksonmodel.uri
            }), a(trackjacksonmodel));
        }

        tracksjacksonmodel = ViewUri.m.toString();
        HashMap hashmap = new HashMap();
        hashmap.put("context_description", a);
        hashmap.put("context_long_description", b);
        tracksjacksonmodel = PlayerContext.create(tracksjacksonmodel, aplayertrack, hashmap);
        com.spotify.mobile.android.cosmos.player.v2.PlayOptions playoptions = (new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder()).skipToIndex(0, i).build();
        d.playWithViewUri(tracksjacksonmodel, playoptions, ViewUri.m.toString(), f);
    }
}
