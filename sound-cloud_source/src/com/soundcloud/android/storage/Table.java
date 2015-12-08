// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;


// Referenced classes of package com.soundcloud.android.storage:
//            DatabaseSchema

public final class Table extends Enum
    implements com.soundcloud.propeller.schema.Table
{

    private static final Table $VALUES[];
    public static final Table Activities;
    public static final Table ActivityView;
    public static final Table CollectionItems;
    public static final Table CollectionPages;
    public static final Table Collections;
    public static final Table Comments;
    public static final Table Likes;
    public static final Table PlaylistTracks;
    public static final Table PlaylistTracksView;
    public static final Table Posts;
    public static final Table PromotedTracks;
    public static final Table Recordings;
    public static final Table Searches;
    public static final Table SoundAssociationView;
    public static final Table SoundStream;
    public static final Table SoundStreamView;
    public static final Table SoundView;
    public static final Table Sounds;
    public static final Table Suggestions;
    public static final String TAG = "DatabaseManager";
    public static final Table TrackMetadata;
    public static final Table TrackPolicies;
    public static final Table UserAssociationView;
    public static final Table UserAssociations;
    public static final Table Users;
    public static final Table Waveforms;
    public final String createString;
    public final String fields[];
    public final String id;
    public final com.soundcloud.propeller.schema.PrimaryKey primaryKey;
    public final String type;
    public final boolean view;

    private transient Table(String s, int i, com.soundcloud.propeller.schema.PrimaryKey primarykey, boolean flag, String s1, String as[])
    {
        super(s, i);
        primaryKey = primarykey;
        view = flag;
        if (s1 != null)
        {
            createString = buildCreateString(name(), s1, flag);
        } else
        {
            createString = null;
        }
        id = (new StringBuilder()).append(name()).append("._id").toString();
        type = (new StringBuilder()).append(name()).append("._type").toString();
        fields = as;
    }

    private transient Table(String s, int i, boolean flag, String s1, String as[])
    {
        this(s, i, com.soundcloud.propeller.schema.PrimaryKey.of(new String[] {
            "_id"
        }), flag, s1, as);
    }

    public static String buildCreateString(String s, String s1, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder("CREATE ");
        String s2;
        if (flag)
        {
            s2 = "VIEW";
        } else
        {
            s2 = "TABLE";
        }
        return stringbuilder.append(s2).append(" IF NOT EXISTS ").append(s).append(" ").append(s1).toString();
    }

    public static Table valueOf(String s)
    {
        return (Table)Enum.valueOf(com/soundcloud/android/storage/Table, s);
    }

    public static Table[] values()
    {
        return (Table[])$VALUES.clone();
    }

    public final String field(String s)
    {
        return (new StringBuilder()).append(name()).append(".").append(s).toString();
    }

    public final com.soundcloud.propeller.schema.PrimaryKey primaryKey()
    {
        return primaryKey;
    }

    public final String toString()
    {
        return name();
    }

    static 
    {
        SoundStream = new Table("SoundStream", 0, false, "(_id INTEGER PRIMARY KEY AUTOINCREMENT,sound_id INTEGER, sound_type INTEGER,reposter_id INTEGER,promoted_id INTEGER,created_at INTEGER,FOREIGN KEY(sound_id) REFERENCES Sounds(_id) );", new String[0]);
        PromotedTracks = new Table("PromotedTracks", 1, false, "(_id INTEGER PRIMARY KEY AUTOINCREMENT,created_at INTEGER,ad_urn TEXT, promoter_id INTEGER,promoter_name TEXT,tracking_track_clicked_urls TEXT,tracking_profile_clicked_urls TEXT,tracking_promoter_clicked_urls TEXT,tracking_track_played_urls TEXT,tracking_track_impression_urls TEXT);", new String[0]);
        Sounds = new Table("Sounds", 2, com.soundcloud.propeller.schema.PrimaryKey.of(new String[] {
            "_id", "_type"
        }), false, "(_id INTEGER,_type INTEGER,last_updated INTEGER,permalink VARCHAR(255),original_content_size INTEGER,duration INTEGER,state VARCHAR(50),created_at INTEGER,genre VARCHAR(100),tag_list VARCHAR(500),track_type VARCHAR(255),title VARCHAR(255),permalink_url VARCHAR(255),artwork_url VARCHAR(255), waveform_url VARCHAR(255), downloadable BOOLEAN, commentable BOOLEAN, download_url VARCHAR(255), stream_url VARCHAR(255),streamable BOOLEAN DEFAULT 0, sharing VARCHAR(255),license VARCHAR(100),purchase_url VARCHAR(255),playback_count INTEGER DEFAULT -1,download_count INTEGER DEFAULT -1,comment_count INTEGER DEFAULT -1,favoritings_count INTEGER DEFAULT -1,reposts_count INTEGER DEFAULT -1,shared_to_count INTEGER DEFAULT -1,sharing_note_text VARCHAR(255),tracks_uri VARCHAR(255),track_count INTEGER DEFAULT -1,playlist_type VARCHAR(255),user_id INTEGER,DESCRIPTION TEXT,PRIMARY KEY (_id, _type) ON CONFLICT IGNORE);", TableColumns.Sounds.ALL_FIELDS);
        TrackMetadata = new Table("TrackMetadata", 3, false, "(_id INTEGER PRIMARY KEY AUTOINCREMENT,user_id INTEGER, play_count INTEGER DEFAULT 0,cached INTEGER DEFAULT 0,type INTEGER DEFAULT 0,etag VARCHAR(34),url_hash VARCHAR(32),size INTEGER,bitrate INTEGER,UNIQUE (_id, user_id) ON CONFLICT IGNORE);", TableColumns.TrackMetadata.ALL_FIELDS);
        TrackPolicies = new Table("TrackPolicies", 4, com.soundcloud.propeller.schema.PrimaryKey.of(new String[] {
            "track_id"
        }), false, "(track_id INTEGER, monetizable BOOLEAN DEFAULT 0,syncable BOOLEAN DEFAULT 1,sub_mid_tier BOOLEAN DEFAULT 0,sub_high_tier BOOLEAN DEFAULT 0,policy TEXT,monetization_model TEXT,last_updated INTEGER, PRIMARY KEY (track_id) ON CONFLICT REPLACE );", TableColumns.TrackPolicies.ALL_FIELDS);
        Users = new Table("Users", 5, false, "(_id INTEGER PRIMARY KEY AUTOINCREMENT,_type INTEGER DEFAULT 0,username VARCHAR(255),avatar_url VARCHAR(255),permalink VARCHAR(255),permalink_url VARCHAR(255),full_name VARCHAR(255),description text,city VARCHAR(255),country VARCHAR(255),plan VARCHAR(16),primary_email_confirmed INTEGER,website VARCHAR(255),website_title VARCHAR(255), discogs_name VARCHAR(255),myspace_name VARCHAR(255),track_count INTEGER DEFAULT -1,followers_count INTEGER DEFAULT -1,followings_count INTEGER DEFAULT -1,public_favorites_count INTEGER DEFAULT -1,private_tracks_count INTEGER DEFAULT -1,last_updated INTEGER);", TableColumns.Users.ALL_FIELDS);
        Comments = new Table("Comments", 6, false, "(_id INTEGER PRIMARY KEY AUTOINCREMENT,urn TEXT UNIQUE,user_id INTEGER,track_id INTEGER,timestamp INTEGER,created_at INTEGER,body VARCHAR(255));", new String[0]);
        Activities = new Table("Activities", 7, false, "(_id INTEGER PRIMARY KEY AUTOINCREMENT,uuid VARCHAR(255),user_id INTEGER,sound_id INTEGER,sound_type INTEGER,comment_id INTEGER,type String,tags VARCHAR(255),created_at INTEGER,content_id INTEGER,sharing_note_text VARCHAR(255),sharing_note_created_at INTEGER,UNIQUE (created_at, type, content_id, sound_id, user_id));", new String[0]);
        Recordings = new Table("Recordings", 8, false, "(_id INTEGER PRIMARY KEY AUTOINCREMENT,user_id INTEGER,timestamp INTEGER,longitude VARCHAR(255),latitude VARCHAR(255),what_text VARCHAR(255),where_text VARCHAR(255),audio_path VARCHAR(255),artwork_path VARCHAR(255),duration INTEGER,description VARCHAR(255),four_square_venue_id VARCHAR(255), shared_emails text,shared_ids text, private_user_id INTEGER,tip_key VARCHAR(255),service_ids VARCHAR(255),is_private BOOLEAN,external_upload BOOLEAN,upload_status INTEGER DEFAULT 0,trim_left INTEGER,trim_right INTEGER,filters INTEGER,optimize INTEGER,fading INTEGER);", TableColumns.Recordings.ALL_FIELDS);
        Searches = new Table("Searches", 9, false, "(_id INTEGER PRIMARY KEY AUTOINCREMENT,created_at INTEGER,user_id INTEGER,query VARCHAR(255),search_type INTEGER,UNIQUE (user_id, search_type, query) ON CONFLICT REPLACE);", new String[0]);
        PlaylistTracks = new Table("PlaylistTracks", 10, com.soundcloud.propeller.schema.PrimaryKey.of(new String[] {
            "_id", "position", "playlist_id"
        }), false, "(playlist_id INTEGER, track_id INTEGER,position INTEGER,added_at INTEGER,removed_at INTEGER,PRIMARY KEY (track_id, position, playlist_id) ON CONFLICT IGNORE);", new String[0]);
        UserAssociations = new Table("UserAssociations", 11, false, "(owner_id INTEGER, target_id INTEGER,association_type INTEGER, resource_type INTEGER DEFAULT 0, position INTEGER, created_at INTEGER, added_at INTEGER, removed_at INTEGER, token VARCHAR(150), PRIMARY KEY(owner_id, target_id, association_type, resource_type) ON CONFLICT REPLACE);", new String[0]);
        CollectionItems = new Table("CollectionItems", 12, com.soundcloud.propeller.schema.PrimaryKey.of(new String[] {
            "user_id", "item_id", "collection_type", "resource_type"
        }), false, "(user_id INTEGER, item_id INTEGER,collection_type INTEGER, resource_type INTEGER DEFAULT 0, position INTEGER, created_at INTEGER, PRIMARY KEY(user_id, item_id, collection_type, resource_type) ON CONFLICT REPLACE);", new String[0]);
        Collections = new Table("Collections", 13, false, "(_id INTEGER PRIMARY KEY AUTOINCREMENT,uri VARCHAR(255),last_addition INTEGER, last_sync INTEGER, last_sync_attempt INTEGER, size INTEGER, sync_state INTEGER, extra VARCHAR(255), UNIQUE (uri));", new String[0]);
        CollectionPages = new Table("CollectionPages", 14, com.soundcloud.propeller.schema.PrimaryKey.of(new String[] {
            "collection_id", "page_index"
        }), false, "(collection_id INTEGER,page_index INTEGER,etag VARCHAR(255), size INTEGER, PRIMARY KEY(collection_id, page_index) ON CONFLICT REPLACE);", new String[0]);
        Suggestions = new Table("Suggestions", 15, false, "(_id INTEGER PRIMARY KEY AUTOINCREMENT,id  INTEGER,kind VARCHAR(32) NOT NULL,text VARCHAR(255) COLLATE NOCASE,icon_url       VARCHAR(255),permalink_url  VARCHAR(255),suggest_text_1 VARCHAR(255) NOT NULL,suggest_text_2 VARCHAR(255),suggest_icon_1 VARCHAR(255),suggest_intent_data VARCHAR(255),UNIQUE(id, kind) ON CONFLICT REPLACE)", TableColumns.Suggestions.ALL_FIELDS);
        Waveforms = new Table("Waveforms", 16, com.soundcloud.propeller.schema.PrimaryKey.of(new String[] {
            "track_id"
        }), false, "(track_id INTEGER, max_amplitude INTEGER, samples TEXT, created_at INTEGER,PRIMARY KEY (track_id) ON CONFLICT REPLACE );", new String[0]);
        Likes = new Table("Likes", 17, com.soundcloud.propeller.schema.PrimaryKey.of(new String[] {
            "_id", "_type"
        }), false, "(_id INTEGER NOT NULL,_type INTEGER NOT NULL,created_at INTEGER NOT NULL,added_at INTEGER DEFAULT NULL,removed_at INTEGER DEFAULT NULL,PRIMARY KEY (_id, _type),FOREIGN KEY(_id, _type) REFERENCES Sounds(_id, _type));", new String[0]);
        Posts = new Table("Posts", 18, com.soundcloud.propeller.schema.PrimaryKey.of(new String[] {
            "type", "target_type", "target_id"
        }), false, "(type STRING NOT NULL,target_id INTEGER NOT NULL,target_type INTEGER NOT NULL,created_at INTEGER NOT NULL,added_at INTEGER DEFAULT NULL,removed_at INTEGER DEFAULT NULL,PRIMARY KEY (type, target_id, target_type),FOREIGN KEY(target_id, target_type) REFERENCES Sounds(_id, _type));", new String[0]);
        SoundView = new Table("SoundView", 19, true, DatabaseSchema.DATABASE_CREATE_SOUND_VIEW, new String[0]);
        SoundStreamView = new Table("SoundStreamView", 20, true, "AS SELECT SoundStream._id as _id,SoundStream.created_at as created_at,SoundStream.sound_id as sound_id,SoundStream.sound_type as sound_type,SoundStream.reposter_id as reposter_id,SoundStream.promoted_id as promoted_id,Users.username as reposter_username,Users.permalink as reposter_permalink,Users.avatar_url as reposter_avatar_url,SoundView.* FROM SoundStream INNER JOIN ( SELECT _id, MAX(created_at) FROM SoundStream GROUP BY sound_id, sound_type, promoted_id ) dupes ON SoundStream._id = dupes._id  LEFT JOIN Users ON(   SoundStream.reposter_id = Users._id) LEFT JOIN SoundView ON(   SoundStream.sound_id = SoundView._id AND    SoundStream.sound_type = SoundView._type) ORDER BY SoundStream.created_at DESC", new String[0]);
        ActivityView = new Table("ActivityView", 21, true, "AS SELECT Activities._id as _id,Activities.uuid as uuid,Activities.type as type,Activities.tags as tags,Activities.created_at as created_at,Activities.comment_id as comment_id,Activities.sound_id as sound_id,Activities.sound_type as sound_type,Activities.user_id as user_id,Activities.content_id as content_id,Activities.sharing_note_text as sharing_note_text,Activities.sharing_note_created_at as sharing_note_created_at,Users.username as activity_user_username,Users.permalink as activity_user_permalink,Users.avatar_url as activity_user_avatar_url,SoundView.*,Comments.body as comment_body,Comments.created_at as comment_created_at,Comments.timestamp as comment_timestamp FROM Activities LEFT JOIN Users ON(   Activities.user_id = Users._id) LEFT JOIN SoundView ON(   Activities.sound_id = SoundView._id AND    Activities.sound_type = SoundView._type) LEFT JOIN Comments ON(   Activities.comment_id = Comments._id) LEFT JOIN Activities track_dup ON(   track_dup.sound_id = Activities.sound_id AND    track_dup.type = 'track-sharing' AND Activities.type = 'track') LEFT JOIN Activities set_dup ON(   set_dup.sound_id = Activities.sound_id AND    set_dup.type = 'playlist-sharing' AND Activities.type = 'playlist') WHERE track_dup._id IS NULL AND set_dup._id IS NULL ORDER BY created_at DESC", new String[0]);
        SoundAssociationView = new Table("SoundAssociationView", 22, true, DatabaseSchema.DATABASE_CREATE_SOUND_ASSOCIATION_VIEW, new String[0]);
        UserAssociationView = new Table("UserAssociationView", 23, com.soundcloud.propeller.schema.PrimaryKey.of(new String[] {
            "owner_id", "target_id", "association_type", "resource_type"
        }), true, DatabaseSchema.DATABASE_CREATE_USER_ASSOCIATION_VIEW, new String[0]);
        PlaylistTracksView = new Table("PlaylistTracksView", 24, true, "AS SELECT PlaylistTracks.playlist_id as playlist_id, PlaylistTracks.position as playlist_position, PlaylistTracks.added_at as playlist_added_at, SoundView.* FROM PlaylistTracks INNER JOIN SoundView ON(  PlaylistTracks.track_id = SoundView._id AND SoundView._type = 0)", new String[0]);
        $VALUES = (new Table[] {
            SoundStream, PromotedTracks, Sounds, TrackMetadata, TrackPolicies, Users, Comments, Activities, Recordings, Searches, 
            PlaylistTracks, UserAssociations, CollectionItems, Collections, CollectionPages, Suggestions, Waveforms, Likes, Posts, SoundView, 
            SoundStreamView, ActivityView, SoundAssociationView, UserAssociationView, PlaylistTracksView
        });
    }
}
