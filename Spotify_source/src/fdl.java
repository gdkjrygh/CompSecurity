// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootItem;
import java.util.ArrayList;
import java.util.List;

public final class fdl
{

    public static ProtoPlaylistRootItem a(fdj fdj1)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        Object obj2 = null;
        if (fdj1 == null)
        {
            return null;
        }
        com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootItem.Builder builder1 = new com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootItem.Builder();
        fdi fdi1 = fdj1.k();
        if (fdi1 == null)
        {
            obj = null;
        } else
        {
            ArrayList arraylist = new ArrayList();
            obj = (fdj[])fdi1.getItems();
            int j = obj.length;
            for (int i = 0; i < j; i++)
            {
                arraylist.add(a(obj[i]));
            }

            com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootFolder.Builder builder3 = new com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootFolder.Builder();
            if (fdi1 == null)
            {
                obj = null;
            } else
            {
                obj = (new com.spotify.mobile.android.spotlets.playlist.proto.ProtoFolderMetadata.Builder()).name(fdi1.a()).num_folders(Integer.valueOf(fdi1.c())).num_playlists(Integer.valueOf(fdi1.d())).num_recursive_folders(Integer.valueOf(fdi1.e())).num_recursive_playlists(Integer.valueOf(fdi1.f())).id(fdi1.b()).build();
            }
            obj = builder3.folder_metadata(((com.spotify.mobile.android.spotlets.playlist.proto.ProtoFolderMetadata) (obj))).item(arraylist).row_id(fdi1.g()).build();
        }
        builder1 = builder1.folder(((com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootFolder) (obj)));
        if (fdj1 != null) goto _L2; else goto _L1
_L1:
        obj = obj2;
_L5:
        return builder1.playlist(((com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootPlaylist) (obj))).header_field(fdj1.getHeader()).build();
_L2:
        com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootPlaylist.Builder builder = new com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootPlaylist.Builder();
        if (fdj1 != null) goto _L4; else goto _L3
_L3:
        obj = null;
_L6:
        builder = builder.playlist_metadata(((com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistMetadata) (obj)));
        com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistMetadata.Builder builder2;
        if (fdj1 == null)
        {
            obj = obj1;
        } else
        {
            obj = (new com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistOfflineState.Builder()).sync_progress(Integer.valueOf(fdj1.m())).offline(fit.b(fdj1.l())).build();
        }
        obj = builder.playlist_offline_state(((com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistOfflineState) (obj))).row_id(fdj1.o()).build();
        if (true) goto _L5; else goto _L4
_L4:
        builder2 = (new com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistMetadata.Builder()).collaborative(Boolean.valueOf(fdj1.f())).followed(Boolean.valueOf(fdj1.g())).published(Boolean.valueOf(fdj1.h())).browsable_offline(Boolean.valueOf(fdj1.i())).description(fdj1.c()).link(fdj1.a()).name(fdj1.b()).owned_by_self(Boolean.valueOf(fdj1.j()));
        obj = fdj1.e();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (new com.spotify.mobile.android.spotlets.playlist.proto.ProtoUser.Builder()).link(((eny) (obj)).a()).display_name(((eny) (obj)).c()).username(((eny) (obj)).b()).build();
        }
        obj = builder2.owner(((com.spotify.mobile.android.spotlets.playlist.proto.ProtoUser) (obj))).pictures(eoa.a(fdj1.d())).total_length(Integer.valueOf(fdj1.n())).build();
          goto _L6
    }
}
