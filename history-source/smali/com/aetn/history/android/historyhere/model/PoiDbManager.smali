.class public Lcom/aetn/history/android/historyhere/model/PoiDbManager;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "PoiDbManager.java"


# static fields
.field static final C_ADDRESS_1:Ljava/lang/String; = "address_1"

.field static final C_ADDRESS_2:Ljava/lang/String; = "address_2"

.field static final C_CATEGORY:Ljava/lang/String; = "category"

.field static final C_CITY:Ljava/lang/String; = "city"

.field static final C_DESCRIPTION:Ljava/lang/String; = "description"

.field static final C_ID:Ljava/lang/String; = "_id"

.field static final C_IMAGE:Ljava/lang/String; = "image"

.field static final C_INACTIVE:Ljava/lang/String; = "inactive"

.field static final C_LATITUDE:Ljava/lang/String; = "latitude"

.field static final C_LONGITUDE:Ljava/lang/String; = "longitude"

.field static final C_POI_ID:Ljava/lang/String; = "poi_id"

.field static final C_QUALITY:Ljava/lang/String; = "quality"

.field static final C_SHORT_DESCRIPTION:Ljava/lang/String; = "short_description"

.field static final C_STATE:Ljava/lang/String; = "state"

.field static final C_TITLE:Ljava/lang/String; = "title"

.field static final C_ZIP:Ljava/lang/String; = "zip"

.field static final DB_NAME:Ljava/lang/String; = "historyhereDB"

.field static final DB_VERSION:I = 0x2

.field static final FAVORITES_TABLE:Ljava/lang/String; = "favorites"

.field static final POI_TABLE:Ljava/lang/String; = "pois"

.field private static mInstance:Lcom/aetn/history/android/historyhere/model/PoiDbManager;


# instance fields
.field final TAG:Ljava/lang/String;

.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 45
    const-string v0, "historyhereDB"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    .line 46
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->mContext:Landroid/content/Context;

    .line 48
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    const-string v1, "DB: PoiDbManager: init"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    return-void
.end method

.method private createPoiTable(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 3
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;

    .prologue
    .line 67
    const-string v0, "CREATE TABLE IF NOT EXISTS pois (_id int primary key, poi_id text, title text, image text, category text, longitude double, latitude double, address_1 text, address_2 text, city text, state text, zip text, short_description text, quality long, inactive long, description text)"

    .line 85
    .local v0, "sql":Ljava/lang/String;
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 86
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    const-string v2, "DB PoiDbManager: created POITable"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    return-void
.end method

.method public static declared-synchronized getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiDbManager;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 52
    const-class v1, Lcom/aetn/history/android/historyhere/model/PoiDbManager;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->mInstance:Lcom/aetn/history/android/historyhere/model/PoiDbManager;

    if-nez v0, :cond_0

    .line 53
    new-instance v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->mInstance:Lcom/aetn/history/android/historyhere/model/PoiDbManager;

    .line 55
    :cond_0
    sget-object v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->mInstance:Lcom/aetn/history/android/historyhere/model/PoiDbManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 52
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public addPois(Ljava/util/ArrayList;Z)Z
    .locals 9
    .param p2, "clearOldValues"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;Z)Z"
        }
    .end annotation

    .prologue
    .local p1, "pois":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    const/4 v8, 0x1

    .line 166
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    const-string v5, "addPois(): "

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 169
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    if-eqz p2, :cond_0

    .line 170
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    const-string v5, "addPois(): delete previous entries"

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    const-string v4, "delete from pois"

    invoke-virtual {v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 174
    :cond_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 175
    const-string v3, "insert into pois(poi_id,title,image,latitude,longitude,address_1,address_2,city,state,zip,quality,inactive,short_description) values (?,?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 190
    .local v3, "sql":Ljava/lang/String;
    invoke-virtual {v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v1

    .line 191
    .local v1, "insert":Landroid/database/sqlite/SQLiteStatement;
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 192
    .local v2, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v8, v5}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 193
    const/4 v5, 0x2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 194
    const/4 v5, 0x3

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 195
    const/4 v5, 0x4

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLocation()Lcom/aetn/history/android/historyhere/model/POI$Location;

    move-result-object v6

    iget-wide v6, v6, Lcom/aetn/history/android/historyhere/model/POI$Location;->lat:D

    invoke-virtual {v1, v5, v6, v7}, Landroid/database/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 196
    const/4 v5, 0x5

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLocation()Lcom/aetn/history/android/historyhere/model/POI$Location;

    move-result-object v6

    iget-wide v6, v6, Lcom/aetn/history/android/historyhere/model/POI$Location;->lng:D

    invoke-virtual {v1, v5, v6, v7}, Landroid/database/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 197
    const/4 v5, 0x6

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getAddress1()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 198
    const/4 v5, 0x7

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getAddress2()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 199
    const/16 v5, 0x8

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getCity()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 200
    const/16 v5, 0x9

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getState()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 201
    const/16 v5, 0xa

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getZip()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 202
    const/16 v5, 0xb

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getQuality()I

    move-result v6

    int-to-long v6, v6

    invoke-virtual {v1, v5, v6, v7}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 203
    const/16 v5, 0xc

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getInactive()I

    move-result v6

    int-to-long v6, v6

    invoke-virtual {v1, v5, v6, v7}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 204
    const/16 v5, 0xd

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getShortDescription()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 205
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    goto/16 :goto_0

    .line 207
    .end local v2    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_1
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 208
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 210
    return v8
.end method

.method public convertOldFavorites(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 10
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;

    .prologue
    const/4 v9, 0x0

    .line 107
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    const-string v7, "convertOldFavorites()!"

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    const/4 v5, 0x0

    .line 109
    .local v5, "tableDoesExist":Z
    const-string v6, "select DISTINCT tbl_name from sqlite_master where tbl_name = \'favorites\'"

    invoke-virtual {p1, v6, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 110
    .local v0, "cursor":Landroid/database/Cursor;
    if-eqz v0, :cond_1

    .line 111
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v6

    if-lez v6, :cond_0

    .line 112
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 113
    const/4 v5, 0x1

    .line 115
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 117
    :cond_1
    if-eqz v5, :cond_4

    .line 118
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    const-string v7, "convertOldFavorites() table does exist!!"

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    const-string v3, "select * from favorites;"

    .line 120
    .local v3, "query":Ljava/lang/String;
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "convertOldFavorites() : query: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    const-string v1, ""

    .line 122
    .local v1, "favs":Ljava/lang/String;
    invoke-virtual {p1, v3, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 123
    .local v4, "rows":Landroid/database/Cursor;
    const-string v6, "poi_id"

    invoke-interface {v4, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    .line 124
    .local v2, "idRow":I
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 125
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-interface {v4, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ","

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 128
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_3

    .line 129
    const/4 v6, 0x0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    invoke-virtual {v1, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 130
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->mContext:Landroid/content/Context;

    invoke-static {v6, v1}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->addFavorite(Landroid/content/Context;Ljava/lang/String;)V

    .line 132
    :cond_3
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "convertOldFavorites() favs:*"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "*"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 135
    const-string v6, "drop table if exists favorites"

    invoke-virtual {p1, v6}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 139
    .end local v1    # "favs":Ljava/lang/String;
    .end local v2    # "idRow":I
    .end local v3    # "query":Ljava/lang/String;
    .end local v4    # "rows":Landroid/database/Cursor;
    :goto_1
    return-void

    .line 137
    :cond_4
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    const-string v7, "convertOldFavorites() table does NOT exist!!"

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public getFavoritePoiList([Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 26
    .param p1, "sArray"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 391
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v13

    .line 392
    .local v13, "db":Landroid/database/sqlite/SQLiteDatabase;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    const-string v4, "getFavoritePoiList() 1: "

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 395
    .local v10, "al":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    const-string v18, ""

    .line 396
    .local v18, "poiQuery":Ljava/lang/String;
    move-object/from16 v0, p1

    array-length v4, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v4, :cond_0

    aget-object v21, p1, v3

    .line 397
    .local v21, "s":Ljava/lang/String;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v18

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    move-object/from16 v0, v21

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\',"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 396
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 400
    .end local v21    # "s":Ljava/lang/String;
    :cond_0
    new-instance v11, Ljava/lang/StringBuilder;

    move-object/from16 v0, v18

    invoke-direct {v11, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 401
    .local v11, "b":Ljava/lang/StringBuilder;
    const-string v3, ","

    move-object/from16 v0, v18

    invoke-virtual {v0, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    const-string v4, ","

    move-object/from16 v0, v18

    invoke-virtual {v0, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    const-string v5, ""

    invoke-virtual {v11, v3, v4, v5}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 404
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "select * from pois where poi_id IN ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, v18

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ");"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    .line 406
    .local v19, "query":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getFavoritePoiList() : query: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, v19

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    const/4 v3, 0x0

    move-object/from16 v0, v19

    invoke-virtual {v13, v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v20

    .line 409
    .local v20, "rows":Landroid/database/Cursor;
    const-string v3, "poi_id"

    move-object/from16 v0, v20

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 410
    .local v14, "idRow":I
    const-string v3, "title"

    move-object/from16 v0, v20

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v24

    .line 411
    .local v24, "titleRow":I
    const-string v3, "image"

    move-object/from16 v0, v20

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 412
    .local v15, "imageRow":I
    const-string v3, "short_description"

    move-object/from16 v0, v20

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    .line 413
    .local v22, "shortDescRow":I
    const-string v3, "latitude"

    move-object/from16 v0, v20

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 414
    .local v16, "latRow":I
    const-string v3, "longitude"

    move-object/from16 v0, v20

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v17

    .line 415
    .local v17, "lngRow":I
    const-string v3, "address_1"

    move-object/from16 v0, v20

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 416
    .local v8, "address1Row":I
    const-string v3, "address_2"

    move-object/from16 v0, v20

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    .line 417
    .local v9, "address2Row":I
    const-string v3, "city"

    move-object/from16 v0, v20

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 418
    .local v12, "cityRow":I
    const-string v3, "state"

    move-object/from16 v0, v20

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v23

    .line 419
    .local v23, "stateRow":I
    const-string v3, "zip"

    move-object/from16 v0, v20

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v25

    .line 421
    .local v25, "zipRow":I
    :goto_1
    invoke-interface/range {v20 .. v20}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 422
    new-instance v2, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;-><init>()V

    .line 423
    .local v2, "myPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    move-object/from16 v0, v20

    invoke-interface {v0, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setId(Ljava/lang/String;)V

    .line 424
    move-object/from16 v0, v20

    move/from16 v1, v24

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setTitle(Ljava/lang/String;)V

    .line 425
    move-object/from16 v0, v20

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setShortDescription(Ljava/lang/String;)V

    .line 426
    move-object/from16 v0, v20

    move/from16 v1, v16

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v3

    move-object/from16 v0, v20

    move/from16 v1, v17

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v5

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setLocation(DD)V

    .line 427
    move-object/from16 v0, v20

    invoke-interface {v0, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setImage(Ljava/lang/String;)V

    .line 428
    move-object/from16 v0, v20

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 429
    move-object/from16 v0, v20

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 430
    move-object/from16 v0, v20

    invoke-interface {v0, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 431
    move-object/from16 v0, v20

    move/from16 v1, v23

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 432
    move-object/from16 v0, v20

    move/from16 v1, v25

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 428
    invoke-virtual/range {v2 .. v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setAddress(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 433
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 435
    .end local v2    # "myPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_1
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getFavoritePoiList() 3: al.size():"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 436
    invoke-interface/range {v20 .. v20}, Landroid/database/Cursor;->close()V

    .line 437
    invoke-virtual {v13}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 438
    return-object v10
.end method

.method public getPoiById(Ljava/lang/String;)Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 22
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 533
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v11

    .line 534
    .local v11, "db":Landroid/database/sqlite/SQLiteDatabase;
    const/4 v2, 0x0

    .line 537
    .local v2, "myPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SELECT * FROM pois where poi_id = \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, p1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\';"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    .line 538
    .local v16, "query":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getPoiById() : query: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, v16

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 540
    const/4 v3, 0x0

    move-object/from16 v0, v16

    invoke-virtual {v11, v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v17

    .line 541
    .local v17, "rows":Landroid/database/Cursor;
    const-string v3, "poi_id"

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 542
    .local v12, "idRow":I
    const-string v3, "title"

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v20

    .line 543
    .local v20, "titleRow":I
    const-string v3, "image"

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 544
    .local v13, "imageRow":I
    const-string v3, "latitude"

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 545
    .local v14, "latRow":I
    const-string v3, "longitude"

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 546
    .local v15, "lngRow":I
    const-string v3, "address_1"

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 547
    .local v8, "address1Row":I
    const-string v3, "address_2"

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    .line 548
    .local v9, "address2Row":I
    const-string v3, "city"

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    .line 549
    .local v10, "cityRow":I
    const-string v3, "state"

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v19

    .line 550
    .local v19, "stateRow":I
    const-string v3, "zip"

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v21

    .line 551
    .local v21, "zipRow":I
    const-string v3, "short_description"

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v18

    .line 553
    .local v18, "shortDescriptionRow":I
    invoke-interface/range {v17 .. v17}, Landroid/database/Cursor;->getCount()I

    move-result v3

    if-eqz v3, :cond_0

    .line 554
    invoke-interface/range {v17 .. v17}, Landroid/database/Cursor;->moveToNext()Z

    .line 555
    new-instance v2, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .end local v2    # "myPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-direct {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;-><init>()V

    .line 556
    .restart local v2    # "myPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    move-object/from16 v0, v17

    invoke-interface {v0, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setId(Ljava/lang/String;)V

    .line 557
    move-object/from16 v0, v17

    move/from16 v1, v20

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setTitle(Ljava/lang/String;)V

    .line 558
    move-object/from16 v0, v17

    invoke-interface {v0, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setImage(Ljava/lang/String;)V

    .line 559
    move-object/from16 v0, v17

    invoke-interface {v0, v14}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v3

    move-object/from16 v0, v17

    invoke-interface {v0, v15}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v5

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setLocation(DD)V

    .line 560
    move-object/from16 v0, v17

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 561
    move-object/from16 v0, v17

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 562
    move-object/from16 v0, v17

    invoke-interface {v0, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 563
    move-object/from16 v0, v17

    move/from16 v1, v19

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 564
    move-object/from16 v0, v17

    move/from16 v1, v21

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 560
    invoke-virtual/range {v2 .. v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setAddress(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 565
    invoke-interface/range {v17 .. v18}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setShortDescription(Ljava/lang/String;)V

    .line 567
    :cond_0
    invoke-interface/range {v17 .. v17}, Landroid/database/Cursor;->close()V

    .line 568
    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 569
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    const-string v4, "getPoiById() 3: "

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 570
    return-object v2
.end method

.method public getPoiList()Ljava/util/ArrayList;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 363
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    const-string v3, "getPoiList() 1: "

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 365
    .local v9, "al":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 366
    .local v1, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v2, "pois"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v15

    .line 367
    .local v15, "rows":Landroid/database/Cursor;
    const-string v2, "poi_id"

    invoke-interface {v15, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    .line 368
    .local v10, "idRow":I
    const-string v2, "title"

    invoke-interface {v15, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 369
    .local v16, "titleRow":I
    const-string v2, "image"

    invoke-interface {v15, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 370
    .local v11, "imageRow":I
    const-string v2, "latitude"

    invoke-interface {v15, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 371
    .local v12, "latRow":I
    const-string v2, "longitude"

    invoke-interface {v15, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 372
    .local v13, "lngRow":I
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getPoiList() 3: latRow:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "|lngRow:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    :goto_0
    invoke-interface {v15}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 374
    new-instance v14, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {v14}, Lcom/aetn/history/android/historyhere/model/POIDetail;-><init>()V

    .line 375
    .local v14, "myPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-interface {v15, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setId(Ljava/lang/String;)V

    .line 376
    invoke-interface/range {v15 .. v16}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setTitle(Ljava/lang/String;)V

    .line 377
    invoke-interface {v15, v12}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v2

    invoke-interface {v15, v13}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v4

    invoke-virtual {v14, v2, v3, v4, v5}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setLocation(DD)V

    .line 378
    invoke-interface {v15, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setImage(Ljava/lang/String;)V

    .line 380
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 382
    .end local v14    # "myPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    .line 383
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 384
    return-object v9
.end method

.method public getPoiListWithinBounds(DDDD)Ljava/util/ArrayList;
    .locals 23
    .param p1, "top"    # D
    .param p3, "bottom"    # D
    .param p5, "left"    # D
    .param p7, "right"    # D
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDDD)",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 444
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    const-string v4, "getPoiListWithinBounds() 1: "

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 445
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 446
    .local v10, "al":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v12

    .line 449
    .local v12, "db":Landroid/database/sqlite/SQLiteDatabase;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "select * from pois where latitude <="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-wide/from16 v0, p1

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " AND "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "latitude"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " >= "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-wide/from16 v0, p3

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " AND "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "longitude"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " >= "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-wide/from16 v0, p5

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " AND "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "longitude"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " <= "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-wide/from16 v0, p7

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " AND INACTIVE = 0;"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 454
    .local v17, "query":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getPoiListWithinBounds() : query: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, v17

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 456
    const/4 v3, 0x0

    move-object/from16 v0, v17

    invoke-virtual {v12, v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v18

    .line 457
    .local v18, "rows":Landroid/database/Cursor;
    const-string v3, "poi_id"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 458
    .local v13, "idRow":I
    const-string v3, "title"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v21

    .line 459
    .local v21, "titleRow":I
    const-string v3, "image"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 460
    .local v14, "imageRow":I
    const-string v3, "latitude"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 461
    .local v15, "latRow":I
    const-string v3, "longitude"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 462
    .local v16, "lngRow":I
    const-string v3, "address_1"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 463
    .local v8, "address1Row":I
    const-string v3, "address_2"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    .line 464
    .local v9, "address2Row":I
    const-string v3, "city"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 465
    .local v11, "cityRow":I
    const-string v3, "state"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v20

    .line 466
    .local v20, "stateRow":I
    const-string v3, "zip"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    .line 467
    .local v22, "zipRow":I
    const-string v3, "short_description"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v19

    .line 469
    .local v19, "shortDescriptionRow":I
    :goto_0
    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 470
    new-instance v2, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;-><init>()V

    .line 471
    .local v2, "myPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    move-object/from16 v0, v18

    invoke-interface {v0, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setId(Ljava/lang/String;)V

    .line 472
    move-object/from16 v0, v18

    move/from16 v1, v21

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setTitle(Ljava/lang/String;)V

    .line 473
    move-object/from16 v0, v18

    invoke-interface {v0, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setImage(Ljava/lang/String;)V

    .line 474
    move-object/from16 v0, v18

    invoke-interface {v0, v15}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v3

    move-object/from16 v0, v18

    move/from16 v1, v16

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v5

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setLocation(DD)V

    .line 475
    move-object/from16 v0, v18

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 476
    move-object/from16 v0, v18

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 477
    move-object/from16 v0, v18

    invoke-interface {v0, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 478
    move-object/from16 v0, v18

    move/from16 v1, v20

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 479
    move-object/from16 v0, v18

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 475
    invoke-virtual/range {v2 .. v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setAddress(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 480
    invoke-interface/range {v18 .. v19}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setShortDescription(Ljava/lang/String;)V

    .line 481
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 483
    .end local v2    # "myPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->close()V

    .line 484
    invoke-virtual {v12}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 485
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getPoiListWithinBounds() 3: ReturnedList.size()"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 486
    return-object v10
.end method

.method public getPoisFromList(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 23
    .param p1, "list"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 269
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v12

    .line 270
    .local v12, "db":Landroid/database/sqlite/SQLiteDatabase;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "select * from pois where poi_id IN ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, p1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ");"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 272
    .local v17, "query":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getRowsForUpdate() : query: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, v17

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 276
    .local v10, "al":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    const/4 v3, 0x0

    move-object/from16 v0, v17

    invoke-virtual {v12, v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v18

    .line 277
    .local v18, "rows":Landroid/database/Cursor;
    const-string v3, "poi_id"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 278
    .local v13, "idRow":I
    const-string v3, "title"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v21

    .line 279
    .local v21, "titleRow":I
    const-string v3, "image"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 280
    .local v14, "imageRow":I
    const-string v3, "short_description"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v19

    .line 281
    .local v19, "shortDescRow":I
    const-string v3, "latitude"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 282
    .local v15, "latRow":I
    const-string v3, "longitude"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 283
    .local v16, "lngRow":I
    const-string v3, "address_1"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 284
    .local v8, "address1Row":I
    const-string v3, "address_2"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    .line 285
    .local v9, "address2Row":I
    const-string v3, "city"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 286
    .local v11, "cityRow":I
    const-string v3, "state"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v20

    .line 287
    .local v20, "stateRow":I
    const-string v3, "zip"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    .line 289
    .local v22, "zipRow":I
    :goto_0
    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 290
    new-instance v2, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;-><init>()V

    .line 291
    .local v2, "myPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    move-object/from16 v0, v18

    invoke-interface {v0, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setId(Ljava/lang/String;)V

    .line 292
    move-object/from16 v0, v18

    move/from16 v1, v21

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setTitle(Ljava/lang/String;)V

    .line 293
    invoke-interface/range {v18 .. v19}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setShortDescription(Ljava/lang/String;)V

    .line 294
    move-object/from16 v0, v18

    invoke-interface {v0, v15}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v3

    move-object/from16 v0, v18

    move/from16 v1, v16

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v5

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setLocation(DD)V

    .line 295
    move-object/from16 v0, v18

    invoke-interface {v0, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setImage(Ljava/lang/String;)V

    .line 296
    move-object/from16 v0, v18

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 297
    move-object/from16 v0, v18

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 298
    move-object/from16 v0, v18

    invoke-interface {v0, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 299
    move-object/from16 v0, v18

    move/from16 v1, v20

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 300
    move-object/from16 v0, v18

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 296
    invoke-virtual/range {v2 .. v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setAddress(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 303
    .end local v2    # "myPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getRowsForUpdate() 3: al.size():"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->close()V

    .line 305
    invoke-virtual {v12}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 306
    return-object v10
.end method

.method public getRandomPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 23

    .prologue
    .line 492
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v11

    .line 495
    .local v11, "db":Landroid/database/sqlite/SQLiteDatabase;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v3

    iget v0, v3, Lcom/aetn/history/android/historyhere/model/Configuration;->supriseMeQualityMin:I

    move/from16 v16, v0

    .line 496
    .local v16, "qualityNum":I
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SELECT * FROM pois WHERE INACTIVE = 0 AND QUALITY = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move/from16 v0, v16

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " ORDER BY RANDOM() LIMIT 1;"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 497
    .local v17, "query":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getRandomPoi() : query: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, v17

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 499
    const/4 v3, 0x0

    move-object/from16 v0, v17

    invoke-virtual {v11, v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v18

    .line 500
    .local v18, "rows":Landroid/database/Cursor;
    const-string v3, "poi_id"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 501
    .local v12, "idRow":I
    const-string v3, "title"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v21

    .line 502
    .local v21, "titleRow":I
    const-string v3, "image"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 503
    .local v13, "imageRow":I
    const-string v3, "latitude"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 504
    .local v14, "latRow":I
    const-string v3, "longitude"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 505
    .local v15, "lngRow":I
    const-string v3, "address_1"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 506
    .local v8, "address1Row":I
    const-string v3, "address_2"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    .line 507
    .local v9, "address2Row":I
    const-string v3, "city"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    .line 508
    .local v10, "cityRow":I
    const-string v3, "state"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v20

    .line 509
    .local v20, "stateRow":I
    const-string v3, "zip"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    .line 510
    .local v22, "zipRow":I
    const-string v3, "short_description"

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v19

    .line 512
    .local v19, "shortDescriptionRow":I
    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->moveToNext()Z

    .line 513
    new-instance v2, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;-><init>()V

    .line 514
    .local v2, "myPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    move-object/from16 v0, v18

    invoke-interface {v0, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setId(Ljava/lang/String;)V

    .line 515
    move-object/from16 v0, v18

    move/from16 v1, v21

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setTitle(Ljava/lang/String;)V

    .line 516
    move-object/from16 v0, v18

    invoke-interface {v0, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setImage(Ljava/lang/String;)V

    .line 517
    move-object/from16 v0, v18

    invoke-interface {v0, v14}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v3

    move-object/from16 v0, v18

    invoke-interface {v0, v15}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v5

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setLocation(DD)V

    .line 518
    move-object/from16 v0, v18

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 519
    move-object/from16 v0, v18

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 520
    move-object/from16 v0, v18

    invoke-interface {v0, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 521
    move-object/from16 v0, v18

    move/from16 v1, v20

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 522
    move-object/from16 v0, v18

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 518
    invoke-virtual/range {v2 .. v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setAddress(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 523
    invoke-interface/range {v18 .. v19}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setShortDescription(Ljava/lang/String;)V

    .line 525
    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->close()V

    .line 526
    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 527
    return-object v2
.end method

.method public getRowsForUpdate(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;)",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 316
    .local p1, "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    .line 317
    .local v6, "db":Landroid/database/sqlite/SQLiteDatabase;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    move-object/from16 v19, v0

    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "getRowsForUpdate() 1: the number of requested items is: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v21

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v19 .. v20}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 320
    .local v4, "al":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    const-string v14, ""

    .line 321
    .local v14, "poiQuery":Ljava/lang/String;
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_0
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_0

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 322
    .local v13, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v20

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    const-string v21, "\'"

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual {v13}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    const-string v21, "\',"

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 323
    goto :goto_0

    .line 325
    .end local v13    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 326
    .local v5, "b":Ljava/lang/StringBuilder;
    const-string v19, ","

    move-object/from16 v0, v19

    invoke-virtual {v14, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v19

    const-string v20, ","

    move-object/from16 v0, v20

    invoke-virtual {v14, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v20

    add-int/lit8 v20, v20, 0x1

    const-string v21, ""

    move/from16 v0, v19

    move/from16 v1, v20

    move-object/from16 v2, v21

    invoke-virtual {v5, v0, v1, v2}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 330
    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    const-string v20, "select * from pois where poi_id IN ("

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    const-string v20, ");"

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 332
    .local v15, "query":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    move-object/from16 v19, v0

    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "getRowsForUpdate() : query: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v19 .. v20}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    const/16 v19, 0x0

    move-object/from16 v0, v19

    invoke-virtual {v6, v15, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v16

    .line 335
    .local v16, "rows":Landroid/database/Cursor;
    const-string v19, "poi_id"

    move-object/from16 v0, v16

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 336
    .local v8, "idRow":I
    const-string v19, "title"

    move-object/from16 v0, v16

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v18

    .line 337
    .local v18, "titleRow":I
    const-string v19, "image"

    move-object/from16 v0, v16

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    .line 338
    .local v9, "imageRow":I
    const-string v19, "description"

    move-object/from16 v0, v16

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    .line 339
    .local v7, "descRow":I
    const-string v19, "short_description"

    move-object/from16 v0, v16

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v17

    .line 340
    .local v17, "shortDescRow":I
    const-string v19, "latitude"

    move-object/from16 v0, v16

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    .line 341
    .local v10, "latRow":I
    const-string v19, "longitude"

    move-object/from16 v0, v16

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 343
    .local v11, "lngRow":I
    :goto_1
    invoke-interface/range {v16 .. v16}, Landroid/database/Cursor;->moveToNext()Z

    move-result v19

    if-eqz v19, :cond_1

    .line 344
    new-instance v12, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {v12}, Lcom/aetn/history/android/historyhere/model/POIDetail;-><init>()V

    .line 345
    .local v12, "myPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    move-object/from16 v0, v16

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v12, v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setId(Ljava/lang/String;)V

    .line 346
    move-object/from16 v0, v16

    move/from16 v1, v18

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v12, v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setTitle(Ljava/lang/String;)V

    .line 347
    move-object/from16 v0, v16

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v12, v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setDescription(Ljava/lang/String;)V

    .line 348
    invoke-interface/range {v16 .. v17}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v12, v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setShortDescription(Ljava/lang/String;)V

    .line 349
    move-object/from16 v0, v16

    invoke-interface {v0, v10}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v19

    move-object/from16 v0, v16

    invoke-interface {v0, v11}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v21

    move-wide/from16 v0, v19

    move-wide/from16 v2, v21

    invoke-virtual {v12, v0, v1, v2, v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setLocation(DD)V

    .line 350
    move-object/from16 v0, v16

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v12, v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setImage(Ljava/lang/String;)V

    .line 351
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 353
    .end local v12    # "myPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    move-object/from16 v19, v0

    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "getRowsForUpdate() 3: al.size():"

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v21

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v19 .. v20}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    invoke-interface/range {v16 .. v16}, Landroid/database/Cursor;->close()V

    .line 355
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 356
    return-object v4
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;

    .prologue
    .line 61
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    const-string v1, "DB: PoiDbManager: onCreate"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->createPoiTable(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 63
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 2
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
    .param p2, "oldVersion"    # I
    .param p3, "newVersion"    # I

    .prologue
    .line 92
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    const-string v1, "DB: PoiDbManager: onUpgrade"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->createPoiTable(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 96
    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->convertOldFavorites(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 97
    return-void
.end method

.method public updatePois(Ljava/util/ArrayList;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .local p1, "pois":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    const/4 v8, 0x1

    .line 216
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->TAG:Ljava/lang/String;

    const-string v5, "addPois(): "

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 220
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 221
    const-string v3, "update pois set title= ? ,image= ? ,latitude= ? ,longitude= ? ,address_1= ? ,address_2= ? ,city= ? ,state= ? ,zip= ? ,quality= ? ,inactive= ? ,short_description= ? WHERE poi_id = ?"

    .line 235
    .local v3, "sql":Ljava/lang/String;
    invoke-virtual {v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v1

    .line 236
    .local v1, "insert":Landroid/database/sqlite/SQLiteStatement;
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 237
    .local v2, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v8, v5}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 238
    const/4 v5, 0x2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 239
    const/4 v5, 0x3

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLocation()Lcom/aetn/history/android/historyhere/model/POI$Location;

    move-result-object v6

    iget-wide v6, v6, Lcom/aetn/history/android/historyhere/model/POI$Location;->lat:D

    invoke-virtual {v1, v5, v6, v7}, Landroid/database/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 240
    const/4 v5, 0x4

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLocation()Lcom/aetn/history/android/historyhere/model/POI$Location;

    move-result-object v6

    iget-wide v6, v6, Lcom/aetn/history/android/historyhere/model/POI$Location;->lng:D

    invoke-virtual {v1, v5, v6, v7}, Landroid/database/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 241
    const/4 v5, 0x5

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getAddress1()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 242
    const/4 v5, 0x6

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getAddress2()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 243
    const/4 v5, 0x7

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getCity()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 244
    const/16 v5, 0x8

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getState()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 245
    const/16 v5, 0x9

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getZip()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 246
    const/16 v5, 0xa

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getQuality()I

    move-result v6

    int-to-long v6, v6

    invoke-virtual {v1, v5, v6, v7}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 247
    const/16 v5, 0xb

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getInactive()I

    move-result v6

    int-to-long v6, v6

    invoke-virtual {v1, v5, v6, v7}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 248
    const/16 v5, 0xc

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getShortDescription()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 249
    const/16 v5, 0xd

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 250
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    goto/16 :goto_0

    .line 252
    .end local v2    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 253
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 254
    return v8
.end method
