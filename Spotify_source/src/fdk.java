// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.playlist.proto.ProtoFolderMetadata;
import com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistMetadata;
import com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistOfflineState;
import com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootFolder;
import com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootItem;
import com.spotify.mobile.android.spotlets.playlist.proto.ProtoPlaylistRootPlaylist;
import com.spotify.mobile.android.spotlets.playlist.proto.ProtoUser;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import java.util.Iterator;
import java.util.List;

public final class fdk
{

    public static fdj a(ProtoPlaylistRootItem protoplaylistrootitem)
    {
        ProtoPlaylistRootFolder protoplaylistrootfolder = null;
        if (protoplaylistrootitem != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (!TextUtils.isEmpty(protoplaylistrootitem.header_field))
        {
            return new fdj(protoplaylistrootitem) {

                private ProtoPlaylistRootItem a;

                public final String a()
                {
                    return "";
                }

                public final String b()
                {
                    return "";
                }

                public final String c()
                {
                    return null;
                }

                public final Covers d()
                {
                    return null;
                }

                public final eny e()
                {
                    return null;
                }

                public final boolean f()
                {
                    return false;
                }

                public final boolean g()
                {
                    return false;
                }

                public final String getHeader()
                {
                    return a.header_field;
                }

                public final boolean h()
                {
                    return false;
                }

                public final boolean i()
                {
                    return false;
                }

                public final boolean isHeader()
                {
                    return true;
                }

                public final boolean j()
                {
                    return false;
                }

                public final fdi k()
                {
                    return null;
                }

                public final int l()
                {
                    return 0;
                }

                public final int m()
                {
                    return 0;
                }

                public final int n()
                {
                    return 0;
                }

                public final String o()
                {
                    return null;
                }

            
            {
                a = protoplaylistrootitem;
                super();
            }
            };
        }
        if (protoplaylistrootitem.folder == null)
        {
            break; /* Loop/switch isn't completed */
        }
        protoplaylistrootfolder = protoplaylistrootitem.folder;
        protoplaylistrootitem = protoplaylistrootitem.folder.row_id;
        if (protoplaylistrootfolder != null && protoplaylistrootfolder.folder_metadata != null)
        {
            fdj afdj[] = new fdj[protoplaylistrootfolder.item.size()];
            Iterator iterator = protoplaylistrootfolder.item.iterator();
            for (int i = 0; iterator.hasNext(); i++)
            {
                afdj[i] = a((ProtoPlaylistRootItem)iterator.next());
            }

            return new fdj(protoplaylistrootfolder, new fdi(afdj, protoplaylistrootfolder, protoplaylistrootitem) {

                private fdj a[];
                private ProtoPlaylistRootFolder b;
                private String c;

                public final String a()
                {
                    return b.folder_metadata.name;
                }

                public final String b()
                {
                    return b.folder_metadata.id;
                }

                public final int c()
                {
                    Integer integer = b.folder_metadata.num_folders;
                    if (integer == null)
                    {
                        integer = Integer.valueOf(0);
                    }
                    return ((Integer)integer).intValue();
                }

                public final int d()
                {
                    Integer integer = b.folder_metadata.num_playlists;
                    if (integer == null)
                    {
                        integer = Integer.valueOf(0);
                    }
                    return ((Integer)integer).intValue();
                }

                public final int e()
                {
                    Integer integer = b.folder_metadata.num_recursive_folders;
                    if (integer == null)
                    {
                        integer = Integer.valueOf(0);
                    }
                    return ((Integer)integer).intValue();
                }

                public final int f()
                {
                    Integer integer = b.folder_metadata.num_recursive_playlists;
                    if (integer == null)
                    {
                        integer = Integer.valueOf(0);
                    }
                    return ((Integer)integer).intValue();
                }

                public final String g()
                {
                    return c;
                }

                public final volatile Object[] getItems()
                {
                    return a;
                }

                public final int getUnfilteredLength()
                {
                    return a.length;
                }

                public final int getUnrangedLength()
                {
                    return a.length;
                }

                public final boolean isLoading()
                {
                    return false;
                }

            
            {
                a = afdj;
                b = protoplaylistrootfolder;
                c = s;
                super();
            }
            }, protoplaylistrootitem) {

                private ProtoPlaylistRootFolder a;
                private fdi b;
                private String c;

                public final String a()
                {
                    return "";
                }

                public final String b()
                {
                    return a.folder_metadata.name;
                }

                public final String c()
                {
                    return null;
                }

                public final Covers d()
                {
                    return null;
                }

                public final eny e()
                {
                    return null;
                }

                public final boolean f()
                {
                    return false;
                }

                public final boolean g()
                {
                    return false;
                }

                public final String getHeader()
                {
                    return null;
                }

                public final boolean h()
                {
                    return false;
                }

                public final boolean i()
                {
                    return false;
                }

                public final boolean isHeader()
                {
                    return false;
                }

                public final boolean j()
                {
                    return false;
                }

                public final fdi k()
                {
                    return b;
                }

                public final int l()
                {
                    return 0;
                }

                public final int m()
                {
                    return 0;
                }

                public final int n()
                {
                    return 0;
                }

                public final String o()
                {
                    return c;
                }

            
            {
                a = protoplaylistrootfolder;
                b = fdi;
                c = s;
                super();
            }
            };
        }
        if (true) goto _L1; else goto _L3
_L3:
        ProtoPlaylistMetadata protoplaylistmetadata = protoplaylistrootitem.playlist.playlist_metadata;
        ProtoPlaylistOfflineState protoplaylistofflinestate = protoplaylistrootitem.playlist.playlist_offline_state;
        String s = protoplaylistrootitem.playlist.row_id;
        if (protoplaylistmetadata != null)
        {
            Covers covers;
            int j;
            if (protoplaylistofflinestate == null)
            {
                protoplaylistrootitem = "";
            } else
            {
                protoplaylistrootitem = protoplaylistofflinestate.offline;
            }
            j = com.spotify.mobile.android.provider.Metadata.OfflineSync.a(protoplaylistrootitem);
            covers = enz.a(protoplaylistmetadata.pictures);
            protoplaylistrootitem = protoplaylistmetadata.owner;
            if (protoplaylistrootitem == null)
            {
                protoplaylistrootitem = protoplaylistrootfolder;
            } else
            {
                protoplaylistrootitem = new eny(protoplaylistrootitem) {

                    private ProtoUser a;

                    public final String a()
                    {
                        return a.link;
                    }

                    public final String b()
                    {
                        return a.username;
                    }

                    public final String c()
                    {
                        if (!TextUtils.isEmpty(a.display_name))
                        {
                            return a.display_name;
                        } else
                        {
                            return a.username;
                        }
                    }

            
            {
                a = protouser;
                super();
            }
                };
            }
            return new fdj(protoplaylistmetadata, covers, protoplaylistrootitem, j, protoplaylistofflinestate, s) {

                private ProtoPlaylistMetadata a;
                private Covers b;
                private eny c;
                private int d;
                private ProtoPlaylistOfflineState e;
                private String f;

                public final String a()
                {
                    return a.link;
                }

                public final String b()
                {
                    return a.name;
                }

                public final String c()
                {
                    return a.description;
                }

                public final Covers d()
                {
                    return b;
                }

                public final eny e()
                {
                    return c;
                }

                public final boolean f()
                {
                    Boolean boolean1 = a.collaborative;
                    if (boolean1 == null)
                    {
                        boolean1 = Boolean.valueOf(false);
                    }
                    return ((Boolean)boolean1).booleanValue();
                }

                public final boolean g()
                {
                    Boolean boolean1 = a.followed;
                    if (boolean1 == null)
                    {
                        boolean1 = Boolean.valueOf(false);
                    }
                    return ((Boolean)boolean1).booleanValue();
                }

                public final String getHeader()
                {
                    return null;
                }

                public final boolean h()
                {
                    Boolean boolean1 = a.published;
                    if (boolean1 == null)
                    {
                        boolean1 = Boolean.valueOf(false);
                    }
                    return ((Boolean)boolean1).booleanValue();
                }

                public final boolean i()
                {
                    Boolean boolean1 = a.browsable_offline;
                    if (boolean1 == null)
                    {
                        boolean1 = Boolean.valueOf(false);
                    }
                    return ((Boolean)boolean1).booleanValue();
                }

                public final boolean isHeader()
                {
                    return false;
                }

                public final boolean j()
                {
                    Boolean boolean1 = a.owned_by_self;
                    if (boolean1 == null)
                    {
                        boolean1 = Boolean.valueOf(false);
                    }
                    return ((Boolean)boolean1).booleanValue();
                }

                public final fdi k()
                {
                    return null;
                }

                public final int l()
                {
                    return d;
                }

                public final int m()
                {
                    Integer integer;
                    if (e == null)
                    {
                        integer = null;
                    } else
                    {
                        integer = e.sync_progress;
                    }
                    if (integer == null)
                    {
                        integer = Integer.valueOf(0);
                    }
                    return ((Integer)integer).intValue();
                }

                public final int n()
                {
                    Integer integer = a.total_length;
                    if (integer == null)
                    {
                        integer = Integer.valueOf(0);
                    }
                    return ((Integer)integer).intValue();
                }

                public final String o()
                {
                    return f;
                }

            
            {
                a = protoplaylistmetadata;
                b = covers;
                c = eny;
                d = i1;
                e = protoplaylistofflinestate;
                f = s;
                super();
            }
            };
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    // Unreferenced inner class fdk$1

/* anonymous class */
    public final class _cls1
        implements fip
    {

        private fdj a[];

        public final volatile Object[] getItems()
        {
            return a;
        }

        public final int getUnfilteredLength()
        {
            return 0;
        }

        public final int getUnrangedLength()
        {
            return 0;
        }

        public final boolean isLoading()
        {
            return false;
        }

            public 
            {
                a = afdj;
                super();
            }
    }

}
