// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import com.soundcloud.propeller.schema.BaseTable;
import com.soundcloud.propeller.schema.Column;

public interface Tables
{
    public static class Comments extends BaseTable
    {

        public static final Column BODY;
        public static final Column CREATED_AT;
        static final String SQL = "CREATE TABLE IF NOT EXISTS Comments (_id INTEGER PRIMARY KEY,urn TEXT UNIQUE,user_id INTEGER,track_id INTEGER,timestamp INTEGER,created_at INTEGER,body TEXT);";
        public static final Comments TABLE;
        public static final Column TIMESTAMP;
        public static final Column TRACK_ID;
        public static final Column URN;
        public static final Column USER_ID;
        public static final Column _ID;

        static 
        {
            Comments comments = new Comments();
            TABLE = comments;
            _ID = Column.create(comments, "_id");
            URN = Column.create(TABLE, "urn");
            USER_ID = Column.create(TABLE, "user_id");
            TRACK_ID = Column.create(TABLE, "track_id");
            TIMESTAMP = Column.create(TABLE, "timestamp");
            CREATED_AT = Column.create(TABLE, "created_at");
            BODY = Column.create(TABLE, "body");
        }

        Comments()
        {
            super("Comments", com.soundcloud.propeller.schema.Table.PrimaryKey.of(new String[] {
                "_id"
            }));
        }
    }

    public static class OfflineContent extends BaseTable
    {

        public static final int ID_OFFLINE_LIKES = 0;
        static final String SQL = "CREATE TABLE IF NOT EXISTS OfflineContent (_id INTEGER,_type INTEGER,PRIMARY KEY (_id, _type),FOREIGN KEY(_id, _type) REFERENCES Sounds(_id, _type));";
        public static final OfflineContent TABLE;
        public static final int TYPE_COLLECTION = 2;
        public static final int TYPE_PLAYLIST = 1;
        public static final Column _ID;
        public static final Column _TYPE;

        static 
        {
            OfflineContent offlinecontent = new OfflineContent();
            TABLE = offlinecontent;
            _ID = Column.create(offlinecontent, "_id");
            _TYPE = Column.create(TABLE, "_type");
        }

        protected OfflineContent()
        {
            super("OfflineContent", com.soundcloud.propeller.schema.Table.PrimaryKey.of(new String[] {
                "_id", "_type"
            }));
        }
    }

    public static class PlayQueue extends BaseTable
    {

        public static final Column RELATED_ENTITY;
        public static final Column REPOSTER_ID;
        public static final Column SOURCE;
        public static final Column SOURCE_VERSION;
        static final String SQL = "CREATE TABLE IF NOT EXISTS PlayQueue (_id INTEGER PRIMARY KEY AUTOINCREMENT,track_id INTEGER,reposter_id INTEGER,related_entity TEXT,source VARCHAR(255),source_version VARCHAR(255));";
        public static final PlayQueue TABLE;
        public static final Column TRACK_ID;

        static 
        {
            PlayQueue playqueue = new PlayQueue();
            TABLE = playqueue;
            TRACK_ID = Column.create(playqueue, "track_id");
            REPOSTER_ID = Column.create(TABLE, "reposter_id");
            RELATED_ENTITY = Column.create(TABLE, "related_entity");
            SOURCE = Column.create(TABLE, "source");
            SOURCE_VERSION = Column.create(TABLE, "source_version");
        }

        protected PlayQueue()
        {
            super("PlayQueue", com.soundcloud.propeller.schema.Table.PrimaryKey.of(new String[] {
                "_id"
            }));
        }
    }

    public static class RecommendationSeeds extends BaseTable
    {

        public static final int REASON_LIKED = 0;
        public static final int REASON_LISTENED_TO = 1;
        public static final Column RECOMMENDATION_REASON;
        public static final Column SEED_SOUND_ID;
        public static final Column SEED_SOUND_TYPE;
        static final String SQL = "CREATE TABLE IF NOT EXISTS RecommendationSeeds (_id INTEGER PRIMARY KEY,seed_sound_id INTEGER, seed_sound_type INTEGER, recommendation_reason INTEGER, FOREIGN KEY(seed_sound_id, seed_sound_type) REFERENCES Sounds(_id, _type));";
        public static final RecommendationSeeds TABLE;
        public static final Column _ID;

        static 
        {
            RecommendationSeeds recommendationseeds = new RecommendationSeeds();
            TABLE = recommendationseeds;
            _ID = Column.create(recommendationseeds, "_id");
            SEED_SOUND_ID = Column.create(TABLE, "seed_sound_id");
            SEED_SOUND_TYPE = Column.create(TABLE, "seed_sound_type");
            RECOMMENDATION_REASON = Column.create(TABLE, "recommendation_reason");
        }

        protected RecommendationSeeds()
        {
            super("RecommendationSeeds", com.soundcloud.propeller.schema.Table.PrimaryKey.of(new String[] {
                "_id"
            }));
        }
    }

    public static class Recommendations extends BaseTable
    {

        public static final Column RECOMMENDED_SOUND_ID;
        public static final Column RECOMMENDED_SOUND_TYPE;
        public static final Column SEED_ID;
        static final String SQL = "CREATE TABLE IF NOT EXISTS Recommendations (_id INTEGER PRIMARY KEY,seed_id INTEGER, recommended_sound_id INTEGER,recommended_sound_type INTEGER,FOREIGN KEY(seed_id) REFERENCES RecommendationSeeds(_id) FOREIGN KEY(recommended_sound_id, recommended_sound_type) REFERENCES Sounds(_id, _type));";
        public static final Recommendations TABLE;
        public static final Column _ID;

        static 
        {
            Recommendations recommendations = new Recommendations();
            TABLE = recommendations;
            _ID = Column.create(recommendations, "_id");
            SEED_ID = Column.create(TABLE, "seed_id");
            RECOMMENDED_SOUND_ID = Column.create(TABLE, "recommended_sound_id");
            RECOMMENDED_SOUND_TYPE = Column.create(TABLE, "recommended_sound_type");
        }

        protected Recommendations()
        {
            super("Recommendations", com.soundcloud.propeller.schema.Table.PrimaryKey.of(new String[] {
                "_id"
            }));
        }
    }

    public static class Shortcuts extends BaseTable
    {

        public static final Column DISPLAY_TEXT;
        public static final Column KIND;
        public static final String KIND_FOLLOWING = "following";
        static final String SQL = "CREATE VIEW IF NOT EXISTS Shortcuts AS SELECT 'like' AS kind, Sounds._id AS _id, Sounds._type AS _type, title AS display_text FROM Likes INNER JOIN Sounds ON Likes._id = Sounds._id AND Likes._type = Sounds._type UNION SELECT 'following' AS kind, Users._id, 0 AS _type, username AS text from UserAssociations INNER JOIN Users ON UserAssociations.target_id = Users._id";
        public static final Shortcuts TABLE;
        public static final String TYPE_LIKE = "like";
        public static final Column _ID;
        public static final Column _TYPE;

        static 
        {
            Shortcuts shortcuts = new Shortcuts();
            TABLE = shortcuts;
            KIND = Column.create(shortcuts, "kind");
            _ID = Column.create(TABLE, "_id");
            _TYPE = Column.create(TABLE, "_type");
            DISPLAY_TEXT = Column.create(TABLE, "display_text");
        }

        protected Shortcuts()
        {
            super("Shortcuts", com.soundcloud.propeller.schema.Table.PrimaryKey.of(new String[] {
                "_id", "kind"
            }));
        }
    }

    public static class Stations extends BaseTable
    {

        public static final Column LAST_PLAYED_TRACK_POSITION;
        public static final Column PERMALINK;
        static final String SQL = "CREATE TABLE IF NOT EXISTS Stations (station_urn TEXT,type TEXT,title TEXT,permalink TEXT,last_played_track_position INTEGER DEFAULT NULL,PRIMARY KEY(station_urn) ON CONFLICT REPLACE);";
        public static final Column STATION_URN;
        public static final Stations TABLE;
        public static final Column TITLE;
        public static final Column TYPE;

        static 
        {
            Stations stations = new Stations();
            TABLE = stations;
            STATION_URN = Column.create(stations, "station_urn");
            TYPE = Column.create(TABLE, "type");
            TITLE = Column.create(TABLE, "title");
            PERMALINK = Column.create(TABLE, "permalink");
            LAST_PLAYED_TRACK_POSITION = Column.create(TABLE, "last_played_track_position");
        }

        protected Stations()
        {
            super("Stations", com.soundcloud.propeller.schema.Table.PrimaryKey.of(new String[] {
                "station_urn"
            }));
        }
    }

    public static class StationsCollections extends BaseTable
    {

        public static final Column COLLECTION_TYPE;
        public static final Column POSITION;
        static final String SQL = "CREATE TABLE IF NOT EXISTS StationsCollections (station_urn TEXT NOT NULL,collection_type INTEGER NOT NULL,position INTEGER,updated_locally_at INTEGER,PRIMARY KEY(station_urn, collection_type) ON CONFLICT IGNORE,FOREIGN KEY(station_urn) REFERENCES Stations(station_urn));";
        public static final Column STATION_URN;
        public static final StationsCollections TABLE;
        public static final Column UPDATED_LOCALLY_AT;

        static 
        {
            StationsCollections stationscollections = new StationsCollections();
            TABLE = stationscollections;
            STATION_URN = Column.create(stationscollections, "station_urn");
            COLLECTION_TYPE = Column.create(TABLE, "collection_type");
            POSITION = Column.create(TABLE, "position");
            UPDATED_LOCALLY_AT = Column.create(TABLE, "updated_locally_at");
        }

        protected StationsCollections()
        {
            super("StationsCollections", com.soundcloud.propeller.schema.Table.PrimaryKey.of(new String[] {
                "station_urn, collection_type"
            }));
        }
    }

    public static class StationsPlayQueues extends BaseTable
    {

        public static final Column POSITION;
        static final String SQL = "CREATE TABLE IF NOT EXISTS StationsPlayQueues (station_urn TEXT,track_urn TEXT,position INTEGER DEFAULT 0,PRIMARY KEY(station_urn, track_urn, position) ON CONFLICT REPLACE,FOREIGN KEY(station_urn) REFERENCES Stations(station_urn));";
        public static final Column STATION_URN;
        public static final StationsPlayQueues TABLE;
        public static final Column TRACK_URN;

        static 
        {
            StationsPlayQueues stationsplayqueues = new StationsPlayQueues();
            TABLE = stationsplayqueues;
            STATION_URN = Column.create(stationsplayqueues, "station_urn");
            TRACK_URN = Column.create(TABLE, "track_urn");
            POSITION = Column.create(TABLE, "position");
        }

        protected StationsPlayQueues()
        {
            super("StationsPlayQueues", com.soundcloud.propeller.schema.Table.PrimaryKey.of(new String[] {
                "station_urn", "track_urn", "position"
            }));
        }
    }

    public static class TrackDownloads extends BaseTable
    {

        public static final Column DOWNLOADED_AT;
        public static final Column REMOVED_AT;
        public static final Column REQUESTED_AT;
        static final String SQL = "CREATE TABLE IF NOT EXISTS TrackDownloads (_id INTEGER PRIMARY KEY,requested_at INTEGER DEFAULT CURRENT_TIMESTAMP,downloaded_at INTEGER DEFAULT NULL,removed_at INTEGER DEFAULT NULL,unavailable_at INTEGER DEFAULT NULL);";
        public static final TrackDownloads TABLE;
        public static final Column UNAVAILABLE_AT;
        public static final Column _ID;

        static 
        {
            TrackDownloads trackdownloads = new TrackDownloads();
            TABLE = trackdownloads;
            _ID = Column.create(trackdownloads, "_id");
            REMOVED_AT = Column.create(TABLE, "removed_at");
            REQUESTED_AT = Column.create(TABLE, "requested_at");
            DOWNLOADED_AT = Column.create(TABLE, "downloaded_at");
            UNAVAILABLE_AT = Column.create(TABLE, "unavailable_at");
        }

        protected TrackDownloads()
        {
            super("TrackDownloads", com.soundcloud.propeller.schema.Table.PrimaryKey.of(new String[] {
                "_id"
            }));
        }
    }

}
