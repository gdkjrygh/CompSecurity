// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.collection.model.policy.DecorationPolicy;
import com.spotify.mobile.android.spotlets.collection.model.policy.ListPolicy;
import com.spotify.mobile.android.spotlets.collection.model.policy.Policy;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootFolder;
import com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootItem;
import com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class fdh extends epe
    implements epf
{

    private static final Policy l;
    private final gxt k = new gxt(new Class[0]);

    public fdh(Context context, Resolver resolver)
    {
        super(context, resolver);
    }

    private String b()
    {
        UriBuilder uribuilder = (new UriBuilder("sp://core-playlist/v1/rootlist")).a(500);
        uribuilder.n = super.c;
        uribuilder.e = super.e;
        uribuilder = uribuilder.a(super.i, super.j);
        uribuilder.c = super.b;
        uribuilder.q = com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format.b;
        return uribuilder.a();
    }

    protected final fip a(byte abyte0[])
    {
        Object obj = (ProtoPlaylistRootResponse)k.a(abyte0, com/spotify/mobile/android/spotlets/playlist/proto/ProtoPlaylistRootResponse);
        if (obj == null || ((ProtoPlaylistRootResponse) (obj)).root == null)
        {
            return null;
        }
        abyte0 = new fdj[((ProtoPlaylistRootResponse) (obj)).root.item.size()];
        int i = 0;
        for (obj = ((ProtoPlaylistRootResponse) (obj)).root.item.iterator(); ((Iterator) (obj)).hasNext();)
        {
            abyte0[i] = fdk.a((ProtoPlaylistRootItem)((Iterator) (obj)).next());
            i++;
        }

        return new fdk._cls1(abyte0);
    }

    public final void a(epg epg)
    {
        a(b(), epg, l);
    }

    protected final byte[] a(fip fip1)
    {
        com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootResponse.Builder builder = null;
        if (fip1 != null) goto _L2; else goto _L1
_L1:
        fip1 = builder;
_L4:
        return fip1.a();
_L2:
        builder = new com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootResponse.Builder();
        if (fip1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        fip1 = null;
_L5:
        fip1 = builder.root(fip1).build();
        if (true) goto _L4; else goto _L3
_L3:
        ArrayList arraylist = new ArrayList();
        fip1 = (fdj[])fip1.getItems();
        int j = fip1.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(fdl.a(fip1[i]));
        }

        fip1 = (new com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootFolder.Builder()).folder_metadata(null).item(arraylist).row_id("").build();
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final volatile byte[] a(Object obj)
    {
        return fdl.a((fdj)obj).a();
    }

    protected final fip b(byte abyte0[])
    {
        return a(abyte0);
    }

    public final void b(epg epg)
    {
        b(b(), epg, l);
    }

    public final Object c(byte abyte0[])
    {
        return fdk.a((ProtoPlaylistRootItem)k.a(abyte0, com/spotify/mobile/android/spotlets/playlist/proto/ProtoPlaylistRootItem));
    }

    static 
    {
        ListPolicy listpolicy = new ListPolicy();
        Object obj = new HashMap();
        ((HashMap) (obj)).put("link", Boolean.valueOf(true));
        ((HashMap) (obj)).put("name", Boolean.valueOf(true));
        ((HashMap) (obj)).put("offline", Boolean.valueOf(true));
        ((HashMap) (obj)).put("syncProgress", Boolean.valueOf(true));
        listpolicy.setListAttributes(((java.util.Map) (obj)));
        obj = new DecorationPolicy();
        ((DecorationPolicy) (obj)).setListPolicy(listpolicy);
        l = new Policy(((DecorationPolicy) (obj)));
    }
}
