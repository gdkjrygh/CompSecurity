.class public Lcom/thetransitapp/droid/data/TransitDatabaseHelper;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "TransitDatabaseHelper.java"


# static fields
.field private static final CACHE_TABLE_CREATE:Ljava/lang/String; = "CREATE TABLE IF NOT EXISTS cache (id INTEGER PRIMARY KEY AUTOINCREMENT, cache_key TEXT, cache_value TEXT, date_created DATE);"

.field private static final CACHE_TABLE_NAME:Ljava/lang/String; = "cache"

.field private static final DATABASE_NAME:Ljava/lang/String; = "transit"

.field private static final DATABASE_VERSION:I = 0x2

.field private static final FAVORITE_TABLE_CREATE:Ljava/lang/String; = "CREATE TABLE IF NOT EXISTS favorite (id INTEGER PRIMARY KEY AUTOINCREMENT, route_id TEXT, date_created DATE);"

.field private static final FAVORITE_TABLE_NAME:Ljava/lang/String; = "favorite"

.field public static final LAST_PLAN_FETCH_KEY:Ljava/lang/String; = "LAST_PLAN_FETCH_KEY"

.field private static final LOCATION_TABLE_CREATE:Ljava/lang/String; = "CREATE TABLE IF NOT EXISTS location (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, latitude FLOAT, longitude FLOAT, date_created DATE);"

.field private static final LOCATION_TABLE_NAME:Ljava/lang/String; = "location"

.field private static final SAVED_DIRECTION_TABLE_CREATE:Ljava/lang/String; = "CREATE TABLE IF NOT EXISTS saved_directions (id INTEGER PRIMARY KEY AUTOINCREMENT, route_id TEXT, latitude FLOAT, longitude FLOAT, direction INTEGER, direction_index INTEGER);"

.field private static final SAVED_DIRECTION_TABLE_NAME:Ljava/lang/String; = "saved_directions"

.field private static final TRANSIT_MODE_TABLE_CREATE:Ljava/lang/String; = "CREATE TABLE IF NOT EXISTS transit_mode (id INTEGER PRIMARY KEY AUTOINCREMENT, bundle_id TEXT, mode_id TEXT);"

.field private static final TRANSIT_MODE_TABLE_NAME:Ljava/lang/String; = "transit_mode"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 55
    const-string v0, "transit"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 56
    return-void
.end method

.method private getSavedDirectionCursor(Lcom/thetransitapp/droid/model/Route;Landroid/location/Location;Landroid/database/sqlite/SQLiteDatabase;)Landroid/database/Cursor;
    .locals 14
    .param p1, "route"    # Lcom/thetransitapp/droid/model/Route;
    .param p2, "location"    # Landroid/location/Location;
    .param p3, "db"    # Landroid/database/sqlite/SQLiteDatabase;

    .prologue
    .line 252
    const-wide v12, 0x3f747ae147ae147bL    # 0.005

    .line 253
    .local v12, "tolerance":D
    invoke-virtual/range {p2 .. p2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    add-double/2addr v0, v12

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object v8

    .line 254
    .local v8, "maxLat":Ljava/lang/String;
    invoke-virtual/range {p2 .. p2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    add-double/2addr v0, v12

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object v9

    .line 255
    .local v9, "maxLng":Ljava/lang/String;
    invoke-virtual/range {p2 .. p2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    sub-double/2addr v0, v12

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object v10

    .line 256
    .local v10, "minLat":Ljava/lang/String;
    invoke-virtual/range {p2 .. p2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    sub-double/2addr v0, v12

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object v11

    .line 258
    .local v11, "minLng":Ljava/lang/String;
    const-string v1, "saved_directions"

    const/4 v0, 0x3

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v3, "id"

    aput-object v3, v2, v0

    const/4 v0, 0x1

    const-string v3, "direction"

    aput-object v3, v2, v0

    const/4 v0, 0x2

    const-string v3, "direction_index"

    aput-object v3, v2, v0

    .line 259
    const-string v3, "(latitude BETWEEN ? AND ?) AND (longitude BETWEEN ? AND ?) AND route_id = ?"

    const/4 v0, 0x5

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object v10, v4, v0

    const/4 v0, 0x1

    .line 260
    aput-object v8, v4, v0

    const/4 v0, 0x2

    aput-object v11, v4, v0

    const/4 v0, 0x3

    aput-object v9, v4, v0

    const/4 v0, 0x4

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Route;->getId()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, p3

    .line 258
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public addLocationFavorite(Lcom/thetransitapp/droid/model/SimplePlacemark;)V
    .locals 7
    .param p1, "placemark"    # Lcom/thetransitapp/droid/model/SimplePlacemark;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation

    .prologue
    .line 170
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 172
    .local v3, "db":Landroid/database/sqlite/SQLiteDatabase;
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v2, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 173
    .local v2, "dateFormat":Ljava/text/DateFormat;
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 175
    .local v1, "date":Ljava/util/Date;
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 176
    .local v0, "addValues":Landroid/content/ContentValues;
    const-string v4, "name"

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    const-string v4, "latitude"

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLatitude()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 178
    const-string v4, "longitude"

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLongitude()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 179
    const-string v4, "date_created"

    invoke-virtual {v2, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    const-string v4, "location"

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 182
    return-void
.end method

.method public getCache(Ljava/lang/String;)Ljava/lang/String;
    .locals 11
    .param p1, "cacheKey"    # Ljava/lang/String;

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v10, 0x0

    .line 115
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 117
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "cache"

    new-array v2, v4, [Ljava/lang/String;

    const-string v3, "cache_value"

    aput-object v3, v2, v10

    const-string v3, "cache_key = ?"

    .line 118
    new-array v4, v4, [Ljava/lang/String;

    aput-object p1, v4, v10

    move-object v6, v5

    move-object v7, v5

    .line 117
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 119
    .local v8, "cur":Landroid/database/Cursor;
    const/4 v9, 0x0

    .line 121
    .local v9, "result":Ljava/lang/String;
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 122
    invoke-interface {v8, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 125
    :cond_0
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 126
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 128
    return-object v9
.end method

.method public getLocationFavorites()Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/SimplePlacemark;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v12, 0x1

    const/4 v11, 0x0

    const/4 v3, 0x0

    .line 148
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 150
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "location"

    new-array v2, v12, [Ljava/lang/String;

    const-string v4, "name, latitude, longitude"

    aput-object v4, v2, v11

    .line 151
    const-string v7, "date_created DESC"

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    .line 150
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 153
    .local v8, "cur":Landroid/database/Cursor;
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 155
    .local v10, "placemarks":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/SimplePlacemark;>;"
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_0

    .line 162
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 163
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 165
    return-object v10

    .line 156
    :cond_0
    new-instance v9, Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-interface {v8, v12}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v1

    const/4 v3, 0x2

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v3

    invoke-direct {v9, v1, v2, v3, v4}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(DD)V

    .line 157
    .local v9, "placemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    invoke-interface {v8, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->setName(Ljava/lang/String;)V

    .line 159
    invoke-interface {v10, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public getSavedDirection(Lcom/thetransitapp/droid/model/Route;Landroid/location/Location;)Lcom/thetransitapp/droid/model/RouteDirection;
    .locals 5
    .param p1, "route"    # Lcom/thetransitapp/droid/model/Route;
    .param p2, "location"    # Landroid/location/Location;

    .prologue
    .line 235
    const/4 v2, 0x0

    .line 237
    .local v2, "direction":Lcom/thetransitapp/droid/model/RouteDirection;
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 238
    .local v1, "db":Landroid/database/sqlite/SQLiteDatabase;
    invoke-direct {p0, p1, p2, v1}, Lcom/thetransitapp/droid/data/TransitDatabaseHelper;->getSavedDirectionCursor(Lcom/thetransitapp/droid/model/Route;Landroid/location/Location;Landroid/database/sqlite/SQLiteDatabase;)Landroid/database/Cursor;

    move-result-object v0

    .line 240
    .local v0, "cur":Landroid/database/Cursor;
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 241
    new-instance v2, Lcom/thetransitapp/droid/model/RouteDirection;

    .end local v2    # "direction":Lcom/thetransitapp/droid/model/RouteDirection;
    invoke-direct {v2}, Lcom/thetransitapp/droid/model/RouteDirection;-><init>()V

    .line 242
    .restart local v2    # "direction":Lcom/thetransitapp/droid/model/RouteDirection;
    invoke-static {}, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;->values()[Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v3

    const/4 v4, 0x1

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Lcom/thetransitapp/droid/model/RouteDirection;->setDirection(Lcom/thetransitapp/droid/model/Itinerary$DirectionType;)V

    .line 243
    const/4 v3, 0x2

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/thetransitapp/droid/model/RouteDirection;->setDirectionIndex(I)V

    .line 246
    :cond_0
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 248
    return-object v2
.end method

.method public isFavorite(Lcom/thetransitapp/droid/model/Route;)Z
    .locals 10
    .param p1, "route"    # Lcom/thetransitapp/droid/model/Route;

    .prologue
    const/4 v4, 0x1

    const/4 v7, 0x0

    const/4 v5, 0x0

    .line 76
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 78
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "favorite"

    new-array v2, v4, [Ljava/lang/String;

    const-string v3, "id"

    aput-object v3, v2, v7

    const-string v3, "route_id = ?"

    .line 79
    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Route;->getId()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v7

    move-object v6, v5

    move-object v7, v5

    .line 78
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 80
    .local v8, "cur":Landroid/database/Cursor;
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v9

    .line 82
    .local v9, "success":Z
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 83
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 85
    return v9
.end method

.method public isTransitModeSlected(Lcom/thetransitapp/droid/model/TransitBundle;Lcom/thetransitapp/droid/model/TransitMode;)Z
    .locals 12
    .param p1, "bundle"    # Lcom/thetransitapp/droid/model/TransitBundle;
    .param p2, "mode"    # Lcom/thetransitapp/droid/model/TransitMode;

    .prologue
    const/4 v5, 0x0

    const/4 v11, 0x1

    const/4 v10, 0x0

    .line 201
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 203
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "transit_mode"

    new-array v2, v11, [Ljava/lang/String;

    const-string v3, "id"

    aput-object v3, v2, v10

    const-string v3, "bundle_id = ? AND mode_id = ?"

    .line 204
    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitBundle;->getId()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v10

    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/TransitMode;->getId()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v11

    move-object v6, v5

    move-object v7, v5

    .line 203
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 205
    .local v8, "cur":Landroid/database/Cursor;
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v9

    .line 207
    .local v9, "isDisabled":Z
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 208
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 210
    if-eqz v9, :cond_0

    move v1, v10

    :goto_0
    return v1

    :cond_0
    move v1, v11

    goto :goto_0
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;

    .prologue
    .line 60
    const-string v0, "CREATE TABLE IF NOT EXISTS favorite (id INTEGER PRIMARY KEY AUTOINCREMENT, route_id TEXT, date_created DATE);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 61
    const-string v0, "CREATE TABLE IF NOT EXISTS cache (id INTEGER PRIMARY KEY AUTOINCREMENT, cache_key TEXT, cache_value TEXT, date_created DATE);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 62
    const-string v0, "CREATE TABLE IF NOT EXISTS location (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, latitude FLOAT, longitude FLOAT, date_created DATE);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 63
    const-string v0, "CREATE TABLE IF NOT EXISTS transit_mode (id INTEGER PRIMARY KEY AUTOINCREMENT, bundle_id TEXT, mode_id TEXT);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 64
    const-string v0, "CREATE TABLE IF NOT EXISTS saved_directions (id INTEGER PRIMARY KEY AUTOINCREMENT, route_id TEXT, latitude FLOAT, longitude FLOAT, direction INTEGER, direction_index INTEGER);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 65
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
    .param p2, "oldVersion"    # I
    .param p3, "newVersion"    # I

    .prologue
    .line 69
    packed-switch p2, :pswitch_data_0

    .line 73
    :goto_0
    return-void

    .line 71
    :pswitch_0
    const-string v0, "CREATE TABLE IF NOT EXISTS saved_directions (id INTEGER PRIMARY KEY AUTOINCREMENT, route_id TEXT, latitude FLOAT, longitude FLOAT, direction INTEGER, direction_index INTEGER);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_0

    .line 69
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public saveCache(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p1, "cacheKey"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation

    .prologue
    .line 133
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 135
    .local v3, "db":Landroid/database/sqlite/SQLiteDatabase;
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v2, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 136
    .local v2, "dateFormat":Ljava/text/DateFormat;
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 138
    .local v1, "date":Ljava/util/Date;
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 139
    .local v0, "addValues":Landroid/content/ContentValues;
    const-string v4, "cache_key"

    invoke-virtual {v0, v4, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    const-string v4, "cache_value"

    invoke-virtual {v0, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    const-string v4, "date_created"

    invoke-virtual {v2, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    const-string v4, "cache"

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 144
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 145
    return-void
.end method

.method public saveDirection(Lcom/thetransitapp/droid/model/Route;Lcom/thetransitapp/droid/model/RouteDirection;Landroid/location/Location;)V
    .locals 8
    .param p1, "route"    # Lcom/thetransitapp/droid/model/Route;
    .param p2, "routeDirection"    # Lcom/thetransitapp/droid/model/RouteDirection;
    .param p3, "location"    # Landroid/location/Location;

    .prologue
    const/4 v7, 0x0

    .line 214
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 215
    .local v2, "db":Landroid/database/sqlite/SQLiteDatabase;
    invoke-direct {p0, p1, p3, v2}, Lcom/thetransitapp/droid/data/TransitDatabaseHelper;->getSavedDirectionCursor(Lcom/thetransitapp/droid/model/Route;Landroid/location/Location;Landroid/database/sqlite/SQLiteDatabase;)Landroid/database/Cursor;

    move-result-object v1

    .line 217
    .local v1, "cur":Landroid/database/Cursor;
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 218
    const-string v3, "saved_directions"

    const-string v4, "id = ?"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    invoke-interface {v1, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-virtual {v2, v3, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 221
    :cond_0
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 222
    .local v0, "addValues":Landroid/content/ContentValues;
    const-string v3, "route_id"

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Route;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    const-string v3, "latitude"

    invoke-virtual {p3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 224
    const-string v3, "longitude"

    invoke-virtual {p3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 225
    const-string v3, "direction"

    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/RouteDirection;->getDirection()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;->ordinal()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 226
    const-string v3, "direction_index"

    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/RouteDirection;->getDirectionIndex()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 228
    const-string v3, "saved_directions"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 230
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 231
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 232
    return-void
.end method

.method public saveTransitModeSelection(Lcom/thetransitapp/droid/model/TransitBundle;)V
    .locals 8
    .param p1, "bundle"    # Lcom/thetransitapp/droid/model/TransitBundle;

    .prologue
    .line 185
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 187
    .local v1, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v3, "transit_mode"

    const-string v4, "bundle_id = ?"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitBundle;->getId()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-virtual {v1, v3, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 189
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitBundle;->getTransitModes()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    .line 198
    return-void

    .line 189
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/model/TransitMode;

    .line 190
    .local v2, "mode":Lcom/thetransitapp/droid/model/TransitMode;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/TransitMode;->isSelected()Z

    move-result v4

    if-nez v4, :cond_0

    .line 191
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 192
    .local v0, "addValues":Landroid/content/ContentValues;
    const-string v4, "bundle_id"

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitBundle;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    const-string v4, "mode_id"

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/TransitMode;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    const-string v4, "transit_mode"

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    goto :goto_0
.end method

.method public toggleFavorite(Lcom/thetransitapp/droid/model/Route;)V
    .locals 14
    .param p1, "route"    # Lcom/thetransitapp/droid/model/Route;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    const/4 v13, 0x1

    const/4 v12, 0x0

    .line 90
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 92
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "favorite"

    new-array v2, v13, [Ljava/lang/String;

    const-string v3, "id"

    aput-object v3, v2, v12

    const-string v3, "route_id = ?"

    .line 93
    new-array v4, v13, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Route;->getId()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v12

    move-object v6, v5

    move-object v7, v5

    .line 92
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 95
    .local v9, "cur":Landroid/database/Cursor;
    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 96
    const-string v1, "favorite"

    const-string v2, "route_id = ?"

    new-array v3, v13, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Route;->getId()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v12

    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 97
    invoke-virtual {p1, v12}, Lcom/thetransitapp/droid/model/Route;->setFavorite(Z)V

    .line 110
    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 111
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 112
    return-void

    .line 99
    :cond_0
    new-instance v11, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v11, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 100
    .local v11, "dateFormat":Ljava/text/DateFormat;
    new-instance v10, Ljava/util/Date;

    invoke-direct {v10}, Ljava/util/Date;-><init>()V

    .line 102
    .local v10, "date":Ljava/util/Date;
    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 103
    .local v8, "addValues":Landroid/content/ContentValues;
    const-string v1, "route_id"

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Route;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    const-string v1, "date_created"

    invoke-virtual {v11, v10}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    const-string v1, "favorite"

    invoke-virtual {v0, v1, v5, v8}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 107
    invoke-virtual {p1, v13}, Lcom/thetransitapp/droid/model/Route;->setFavorite(Z)V

    goto :goto_0
.end method
