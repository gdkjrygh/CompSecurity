.class public Lcom/arist/dao/MusicDao;
.super Ljava/lang/Object;
.source "MusicDao.java"


# instance fields
.field private helper:Lcom/arist/dao/DBOpenHelper;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Lcom/arist/dao/DBOpenHelper;

    invoke-direct {v0, p1}, Lcom/arist/dao/DBOpenHelper;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/dao/MusicDao;->helper:Lcom/arist/dao/DBOpenHelper;

    .line 19
    return-void
.end method


# virtual methods
.method public deleteAllMusic()V
    .locals 2

    .prologue
    .line 252
    iget-object v1, p0, Lcom/arist/dao/MusicDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v1}, Lcom/arist/dao/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 253
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "delete from musictbl"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 254
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 255
    return-void
.end method

.method public deleteMusic(I)I
    .locals 5
    .param p1, "id"    # I

    .prologue
    .line 240
    const/4 v0, -0x1

    .line 241
    .local v0, "count":I
    iget-object v2, p0, Lcom/arist/dao/MusicDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v2}, Lcom/arist/dao/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 242
    .local v1, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v2, "musictbl"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "id="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 243
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 244
    return v0
.end method

.method public getAlbumNum()I
    .locals 1

    .prologue
    .line 316
    invoke-virtual {p0}, Lcom/arist/dao/MusicDao;->getAlbums()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getAlbums()Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/MusicFolder;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 261
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 263
    .local v9, "albums":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/MusicFolder;>;"
    iget-object v1, p0, Lcom/arist/dao/MusicDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v1}, Lcom/arist/dao/DBOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 264
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "musictbl"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "album_id"

    aput-object v5, v2, v4

    const/4 v4, 0x1

    const-string v5, "album"

    aput-object v5, v2, v4

    .line 265
    const-string v5, "album_id"

    move-object v4, v3

    move-object v6, v3

    move-object v7, v3

    .line 264
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 266
    .local v10, "c":Landroid/database/Cursor;
    if-eqz v10, :cond_0

    invoke-interface {v10}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 267
    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 277
    :cond_0
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 278
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 279
    return-object v9

    .line 268
    :cond_1
    new-instance v8, Lcom/arist/entity/MusicFolder;

    invoke-direct {v8}, Lcom/arist/entity/MusicFolder;-><init>()V

    .line 269
    .local v8, "album":Lcom/arist/entity/MusicFolder;
    const-string v1, "album_id"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v8, v1}, Lcom/arist/entity/MusicFolder;->setId(I)V

    .line 270
    const-string v1, "album"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Lcom/arist/entity/MusicFolder;->setName(Ljava/lang/String;)V

    .line 272
    const-string v1, "album_id"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    .line 271
    invoke-interface {v10, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/arist/dao/MusicDao;->getMusicNumByAlbumId(I)I

    move-result v1

    invoke-virtual {v8, v1}, Lcom/arist/entity/MusicFolder;->setNum(I)V

    .line 273
    const-string v1, "album"

    invoke-virtual {v8, v1}, Lcom/arist/entity/MusicFolder;->setPath(Ljava/lang/String;)V

    .line 274
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public getAllMusic()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;"
        }
    .end annotation

    .prologue
    .line 27
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .local v3, "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    iget-object v4, p0, Lcom/arist/dao/MusicDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v4}, Lcom/arist/dao/DBOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 31
    .local v1, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v4, "select id,duration,album_id,size,title,data,album,artist,folder_path from musictbl"

    .line 32
    const/4 v5, 0x0

    .line 30
    invoke-virtual {v1, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 33
    .local v0, "c":Landroid/database/Cursor;
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v4

    if-lez v4, :cond_0

    .line 34
    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-nez v4, :cond_1

    .line 52
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 53
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 54
    return-object v3

    .line 35
    :cond_1
    new-instance v2, Lcom/arist/entity/Music;

    invoke-direct {v2}, Lcom/arist/entity/Music;-><init>()V

    .line 37
    .local v2, "music":Lcom/arist/entity/Music;
    const-string v4, "id"

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/arist/entity/Music;->setId(I)V

    .line 38
    const-string v4, "duration"

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/arist/entity/Music;->setDuration(I)V

    .line 39
    const-string v4, "album_id"

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/arist/entity/Music;->setAlbumId(I)V

    .line 40
    const-string v4, "size"

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/arist/entity/Music;->setSize(J)V

    .line 42
    const-string v4, "title"

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/arist/entity/Music;->setTitle(Ljava/lang/String;)V

    .line 43
    const-string v4, "data"

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/arist/entity/Music;->setData(Ljava/lang/String;)V

    .line 44
    const-string v4, "album"

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/arist/entity/Music;->setAlbum(Ljava/lang/String;)V

    .line 45
    const-string v4, "artist"

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/arist/entity/Music;->setArtist(Ljava/lang/String;)V

    .line 47
    const-string v4, "folder_path"

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    .line 46
    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/arist/entity/Music;->setFolderPath(Ljava/lang/String;)V

    .line 49
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0
.end method

.method public getArtistNum()I
    .locals 1

    .prologue
    .line 425
    invoke-virtual {p0}, Lcom/arist/dao/MusicDao;->getArtists()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getArtists()Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/MusicFolder;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 368
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 370
    .local v9, "artists":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/MusicFolder;>;"
    iget-object v1, p0, Lcom/arist/dao/MusicDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v1}, Lcom/arist/dao/DBOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 371
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "musictbl"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "artist"

    aput-object v5, v2, v4

    .line 372
    const-string v5, "artist"

    move-object v4, v3

    move-object v6, v3

    move-object v7, v3

    .line 371
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 373
    .local v10, "c":Landroid/database/Cursor;
    if-eqz v10, :cond_0

    invoke-interface {v10}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 374
    const/4 v11, 0x0

    .line 375
    .local v11, "id":I
    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 385
    .end local v11    # "id":I
    :cond_0
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 386
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 387
    return-object v9

    .line 376
    .restart local v11    # "id":I
    :cond_1
    new-instance v8, Lcom/arist/entity/MusicFolder;

    invoke-direct {v8}, Lcom/arist/entity/MusicFolder;-><init>()V

    .line 377
    .local v8, "artist":Lcom/arist/entity/MusicFolder;
    add-int/lit8 v11, v11, 0x1

    invoke-virtual {v8, v11}, Lcom/arist/entity/MusicFolder;->setId(I)V

    .line 378
    const-string v1, "artist"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Lcom/arist/entity/MusicFolder;->setName(Ljava/lang/String;)V

    .line 380
    const-string v1, "artist"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    .line 379
    invoke-interface {v10, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/arist/dao/MusicDao;->getMusicNumbyArtist(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v8, v1}, Lcom/arist/entity/MusicFolder;->setNum(I)V

    .line 381
    const-string v1, "artist"

    invoke-virtual {v8, v1}, Lcom/arist/entity/MusicFolder;->setPath(Ljava/lang/String;)V

    .line 382
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public getFolder()Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 62
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .local v9, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    iget-object v1, p0, Lcom/arist/dao/MusicDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v1}, Lcom/arist/dao/DBOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 64
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "musictbl"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "folder_path"

    aput-object v5, v2, v4

    .line 65
    const-string v5, "folder_path"

    move-object v4, v3

    move-object v6, v3

    move-object v7, v3

    .line 64
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 66
    .local v8, "c":Landroid/database/Cursor;
    if-eqz v8, :cond_0

    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 67
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 71
    :cond_0
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 72
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 73
    return-object v9

    .line 68
    :cond_1
    const-string v1, "folder_path"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public getMusic(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 11
    .param p1, "selection"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 83
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .local v10, "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    iget-object v1, p0, Lcom/arist/dao/MusicDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v1}, Lcom/arist/dao/DBOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 86
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "musictbl"

    const/16 v2, 0x9

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "id"

    aput-object v3, v2, v6

    const-string v3, "duration"

    aput-object v3, v2, v7

    const/4 v3, 0x2

    .line 87
    const-string v4, "album_id"

    aput-object v4, v2, v3

    const/4 v3, 0x3

    const-string v4, "size"

    aput-object v4, v2, v3

    const/4 v3, 0x4

    const-string v4, "title"

    aput-object v4, v2, v3

    const/4 v3, 0x5

    const-string v4, "data"

    aput-object v4, v2, v3

    const/4 v3, 0x6

    const-string v4, "album"

    aput-object v4, v2, v3

    const/4 v3, 0x7

    const-string v4, "artist"

    aput-object v4, v2, v3

    const/16 v3, 0x8

    .line 88
    const-string v4, "folder_path"

    aput-object v4, v2, v3

    const-string v3, "folder_path=?"

    new-array v4, v7, [Ljava/lang/String;

    aput-object p1, v4, v6

    move-object v6, v5

    move-object v7, v5

    .line 86
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 90
    .local v8, "c":Landroid/database/Cursor;
    if-eqz v8, :cond_0

    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 91
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 108
    :cond_0
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 109
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 110
    return-object v10

    .line 92
    :cond_1
    new-instance v9, Lcom/arist/entity/Music;

    invoke-direct {v9}, Lcom/arist/entity/Music;-><init>()V

    .line 94
    .local v9, "music":Lcom/arist/entity/Music;
    const-string v1, "id"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setId(I)V

    .line 95
    const-string v1, "duration"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setDuration(I)V

    .line 96
    const-string v1, "album_id"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setAlbumId(I)V

    .line 97
    const-string v1, "size"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v9, v2, v3}, Lcom/arist/entity/Music;->setSize(J)V

    .line 99
    const-string v1, "title"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setTitle(Ljava/lang/String;)V

    .line 100
    const-string v1, "data"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setData(Ljava/lang/String;)V

    .line 101
    const-string v1, "album"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setAlbum(Ljava/lang/String;)V

    .line 102
    const-string v1, "artist"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setArtist(Ljava/lang/String;)V

    .line 103
    const-string v1, "folder_path"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setFolderPath(Ljava/lang/String;)V

    .line 105
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0
.end method

.method public getMusicById(I)Lcom/arist/entity/Music;
    .locals 11
    .param p1, "id"    # I

    .prologue
    const/4 v6, 0x1

    const/4 v10, 0x0

    const/4 v5, 0x0

    .line 120
    const/4 v9, 0x0

    .line 122
    .local v9, "music":Lcom/arist/entity/Music;
    iget-object v1, p0, Lcom/arist/dao/MusicDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v1}, Lcom/arist/dao/DBOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 123
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "musictbl"

    const/16 v2, 0x8

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "duration"

    aput-object v3, v2, v10

    const-string v3, "album_id"

    aput-object v3, v2, v6

    const/4 v3, 0x2

    .line 124
    const-string v4, "size"

    aput-object v4, v2, v3

    const/4 v3, 0x3

    const-string v4, "title"

    aput-object v4, v2, v3

    const/4 v3, 0x4

    const-string v4, "data"

    aput-object v4, v2, v3

    const/4 v3, 0x5

    const-string v4, "album"

    aput-object v4, v2, v3

    const/4 v3, 0x6

    const-string v4, "artist"

    aput-object v4, v2, v3

    const/4 v3, 0x7

    const-string v4, "folder_path"

    aput-object v4, v2, v3

    .line 125
    const-string v3, "id=?"

    new-array v4, v6, [Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v10

    move-object v6, v5

    move-object v7, v5

    .line 123
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 127
    .local v8, "c":Landroid/database/Cursor;
    if-eqz v8, :cond_0

    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 128
    new-instance v9, Lcom/arist/entity/Music;

    .end local v9    # "music":Lcom/arist/entity/Music;
    invoke-direct {v9}, Lcom/arist/entity/Music;-><init>()V

    .line 129
    .restart local v9    # "music":Lcom/arist/entity/Music;
    invoke-virtual {v9, p1}, Lcom/arist/entity/Music;->setId(I)V

    .line 130
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 143
    :cond_0
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 144
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 145
    return-object v9

    .line 131
    :cond_1
    const-string v1, "duration"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setDuration(I)V

    .line 132
    const-string v1, "album_id"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setAlbumId(I)V

    .line 134
    const-string v1, "size"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v9, v2, v3}, Lcom/arist/entity/Music;->setSize(J)V

    .line 136
    const-string v1, "title"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setTitle(Ljava/lang/String;)V

    .line 137
    const-string v1, "data"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setData(Ljava/lang/String;)V

    .line 138
    const-string v1, "album"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setAlbum(Ljava/lang/String;)V

    .line 139
    const-string v1, "artist"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setArtist(Ljava/lang/String;)V

    .line 140
    const-string v1, "folder_path"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setFolderPath(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public getMusicByPath(Ljava/lang/String;)Lcom/arist/entity/Music;
    .locals 10
    .param p1, "path"    # Ljava/lang/String;

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 150
    const/4 v9, 0x0

    .line 152
    .local v9, "music":Lcom/arist/entity/Music;
    iget-object v1, p0, Lcom/arist/dao/MusicDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v1}, Lcom/arist/dao/DBOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 153
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "musictbl"

    const/16 v2, 0x9

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "id"

    aput-object v3, v2, v6

    const-string v3, "duration"

    aput-object v3, v2, v7

    const/4 v3, 0x2

    .line 154
    const-string v4, "album_id"

    aput-object v4, v2, v3

    const/4 v3, 0x3

    const-string v4, "size"

    aput-object v4, v2, v3

    const/4 v3, 0x4

    const-string v4, "title"

    aput-object v4, v2, v3

    const/4 v3, 0x5

    const-string v4, "data"

    aput-object v4, v2, v3

    const/4 v3, 0x6

    const-string v4, "album"

    aput-object v4, v2, v3

    const/4 v3, 0x7

    const-string v4, "artist"

    aput-object v4, v2, v3

    const/16 v3, 0x8

    .line 155
    const-string v4, "folder_path"

    aput-object v4, v2, v3

    const-string v3, "data=?"

    new-array v4, v7, [Ljava/lang/String;

    aput-object p1, v4, v6

    move-object v6, v5

    move-object v7, v5

    .line 153
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 158
    .local v8, "c":Landroid/database/Cursor;
    if-eqz v8, :cond_0

    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 159
    new-instance v9, Lcom/arist/entity/Music;

    .end local v9    # "music":Lcom/arist/entity/Music;
    invoke-direct {v9}, Lcom/arist/entity/Music;-><init>()V

    .line 160
    .restart local v9    # "music":Lcom/arist/entity/Music;
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 174
    :cond_0
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 175
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 176
    return-object v9

    .line 161
    :cond_1
    const-string v1, "id"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setId(I)V

    .line 162
    const-string v1, "duration"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setDuration(I)V

    .line 163
    const-string v1, "album_id"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setAlbumId(I)V

    .line 165
    const-string v1, "size"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v9, v2, v3}, Lcom/arist/entity/Music;->setSize(J)V

    .line 167
    const-string v1, "title"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setTitle(Ljava/lang/String;)V

    .line 168
    const-string v1, "data"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setData(Ljava/lang/String;)V

    .line 169
    const-string v1, "album"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setAlbum(Ljava/lang/String;)V

    .line 170
    const-string v1, "artist"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setArtist(Ljava/lang/String;)V

    .line 171
    const-string v1, "folder_path"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setFolderPath(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public getMusicNumByAlbumId(I)I
    .locals 2
    .param p1, "albumId"    # I

    .prologue
    .line 358
    invoke-virtual {p0, p1}, Lcom/arist/dao/MusicDao;->getMusicsByAlbumId(I)Ljava/util/ArrayList;

    move-result-object v0

    .line 359
    .local v0, "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    if-eqz v0, :cond_0

    .line 360
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 361
    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public getMusicNumbyArtist(Ljava/lang/String;)I
    .locals 2
    .param p1, "Artist"    # Ljava/lang/String;

    .prologue
    .line 468
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 469
    .local v0, "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    invoke-virtual {p0, p1}, Lcom/arist/dao/MusicDao;->getMusicsByArtist(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 470
    if-eqz v0, :cond_0

    .line 471
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 472
    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public getMusicsByAlbumId(I)Ljava/util/ArrayList;
    .locals 11
    .param p1, "albumId"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v5, 0x0

    .line 323
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 325
    .local v10, "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    iget-object v1, p0, Lcom/arist/dao/MusicDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v1}, Lcom/arist/dao/DBOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 326
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "musictbl"

    const/16 v2, 0x9

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "id"

    aput-object v3, v2, v7

    const-string v3, "duration"

    aput-object v3, v2, v6

    const/4 v3, 0x2

    .line 327
    const-string v4, "album_id"

    aput-object v4, v2, v3

    const/4 v3, 0x3

    const-string v4, "size"

    aput-object v4, v2, v3

    const/4 v3, 0x4

    const-string v4, "title"

    aput-object v4, v2, v3

    const/4 v3, 0x5

    const-string v4, "data"

    aput-object v4, v2, v3

    const/4 v3, 0x6

    const-string v4, "album"

    aput-object v4, v2, v3

    const/4 v3, 0x7

    const-string v4, "artist"

    aput-object v4, v2, v3

    const/16 v3, 0x8

    .line 328
    const-string v4, "folder_path"

    aput-object v4, v2, v3

    const-string v3, "album_id=?"

    new-array v4, v6, [Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v7

    move-object v6, v5

    move-object v7, v5

    .line 326
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 330
    .local v8, "c":Landroid/database/Cursor;
    if-eqz v8, :cond_0

    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 331
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 349
    :cond_0
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 350
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 351
    return-object v10

    .line 332
    :cond_1
    new-instance v9, Lcom/arist/entity/Music;

    invoke-direct {v9}, Lcom/arist/entity/Music;-><init>()V

    .line 334
    .local v9, "music":Lcom/arist/entity/Music;
    const-string v1, "id"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setId(I)V

    .line 335
    const-string v1, "duration"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setDuration(I)V

    .line 336
    const-string v1, "album_id"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setAlbumId(I)V

    .line 338
    const-string v1, "size"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v9, v2, v3}, Lcom/arist/entity/Music;->setSize(J)V

    .line 340
    const-string v1, "title"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setTitle(Ljava/lang/String;)V

    .line 341
    const-string v1, "data"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setData(Ljava/lang/String;)V

    .line 342
    const-string v1, "album"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setAlbum(Ljava/lang/String;)V

    .line 343
    const-string v1, "artist"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setArtist(Ljava/lang/String;)V

    .line 344
    const-string v1, "folder_path"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setFolderPath(Ljava/lang/String;)V

    .line 346
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0
.end method

.method public getMusicsByArtist(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 11
    .param p1, "artist"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 433
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 435
    .local v10, "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    iget-object v1, p0, Lcom/arist/dao/MusicDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v1}, Lcom/arist/dao/DBOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 436
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "musictbl"

    const/16 v2, 0x9

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "id"

    aput-object v3, v2, v6

    const-string v3, "duration"

    aput-object v3, v2, v7

    const/4 v3, 0x2

    .line 437
    const-string v4, "album_id"

    aput-object v4, v2, v3

    const/4 v3, 0x3

    const-string v4, "size"

    aput-object v4, v2, v3

    const/4 v3, 0x4

    const-string v4, "title"

    aput-object v4, v2, v3

    const/4 v3, 0x5

    const-string v4, "data"

    aput-object v4, v2, v3

    const/4 v3, 0x6

    const-string v4, "album"

    aput-object v4, v2, v3

    const/4 v3, 0x7

    const-string v4, "artist"

    aput-object v4, v2, v3

    const/16 v3, 0x8

    .line 438
    const-string v4, "folder_path"

    aput-object v4, v2, v3

    const-string v3, "artist=?"

    new-array v4, v7, [Ljava/lang/String;

    aput-object p1, v4, v6

    move-object v6, v5

    move-object v7, v5

    .line 436
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 440
    .local v8, "c":Landroid/database/Cursor;
    if-eqz v8, :cond_0

    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 441
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 459
    :cond_0
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 460
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 461
    return-object v10

    .line 442
    :cond_1
    new-instance v9, Lcom/arist/entity/Music;

    invoke-direct {v9}, Lcom/arist/entity/Music;-><init>()V

    .line 444
    .local v9, "music":Lcom/arist/entity/Music;
    const-string v1, "id"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setId(I)V

    .line 445
    const-string v1, "duration"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setDuration(I)V

    .line 446
    const-string v1, "album_id"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setAlbumId(I)V

    .line 448
    const-string v1, "size"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v9, v2, v3}, Lcom/arist/entity/Music;->setSize(J)V

    .line 450
    const-string v1, "title"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setTitle(Ljava/lang/String;)V

    .line 451
    const-string v1, "data"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setData(Ljava/lang/String;)V

    .line 452
    const-string v1, "album"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setAlbum(Ljava/lang/String;)V

    .line 453
    const-string v1, "artist"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setArtist(Ljava/lang/String;)V

    .line 454
    const-string v1, "folder_path"

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/arist/entity/Music;->setFolderPath(Ljava/lang/String;)V

    .line 456
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0
.end method

.method public getTempAlbums()Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/MusicFolder;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 286
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 288
    .local v9, "albums":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/MusicFolder;>;"
    iget-object v1, p0, Lcom/arist/dao/MusicDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v1}, Lcom/arist/dao/DBOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 289
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "musictbl"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "album_id"

    aput-object v5, v2, v4

    const/4 v4, 0x1

    const-string v5, "album"

    aput-object v5, v2, v4

    .line 290
    const-string v5, "album_id"

    move-object v4, v3

    move-object v6, v3

    move-object v7, v3

    .line 289
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 291
    .local v10, "c":Landroid/database/Cursor;
    if-eqz v10, :cond_1

    invoke-interface {v10}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_1

    .line 292
    :cond_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_2

    .line 307
    :cond_1
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 308
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 309
    :goto_0
    return-object v9

    .line 293
    :cond_2
    new-instance v8, Lcom/arist/entity/MusicFolder;

    invoke-direct {v8}, Lcom/arist/entity/MusicFolder;-><init>()V

    .line 294
    .local v8, "album":Lcom/arist/entity/MusicFolder;
    const-string v1, "album_id"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v8, v1}, Lcom/arist/entity/MusicFolder;->setId(I)V

    .line 295
    const-string v1, "album"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Lcom/arist/entity/MusicFolder;->setName(Ljava/lang/String;)V

    .line 297
    const-string v1, "album_id"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    .line 296
    invoke-interface {v10, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/arist/dao/MusicDao;->getMusicNumByAlbumId(I)I

    move-result v1

    invoke-virtual {v8, v1}, Lcom/arist/entity/MusicFolder;->setNum(I)V

    .line 298
    const-string v1, "album"

    invoke-virtual {v8, v1}, Lcom/arist/entity/MusicFolder;->setPath(Ljava/lang/String;)V

    .line 299
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 300
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/16 v2, 0x9

    if-le v1, v2, :cond_0

    .line 301
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 302
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0
.end method

.method public getTempArtists()Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/MusicFolder;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 394
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 396
    .local v9, "artists":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/MusicFolder;>;"
    iget-object v1, p0, Lcom/arist/dao/MusicDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v1}, Lcom/arist/dao/DBOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 397
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "musictbl"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "artist"

    aput-object v5, v2, v4

    .line 398
    const-string v5, "artist"

    move-object v4, v3

    move-object v6, v3

    move-object v7, v3

    .line 397
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 399
    .local v10, "c":Landroid/database/Cursor;
    if-eqz v10, :cond_1

    invoke-interface {v10}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_1

    .line 400
    const/4 v11, 0x0

    .line 401
    .local v11, "id":I
    :cond_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_2

    .line 416
    .end local v11    # "id":I
    :cond_1
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 417
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 418
    :goto_0
    return-object v9

    .line 402
    .restart local v11    # "id":I
    :cond_2
    new-instance v8, Lcom/arist/entity/MusicFolder;

    invoke-direct {v8}, Lcom/arist/entity/MusicFolder;-><init>()V

    .line 403
    .local v8, "artist":Lcom/arist/entity/MusicFolder;
    add-int/lit8 v11, v11, 0x1

    invoke-virtual {v8, v11}, Lcom/arist/entity/MusicFolder;->setId(I)V

    .line 404
    const-string v1, "artist"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Lcom/arist/entity/MusicFolder;->setName(Ljava/lang/String;)V

    .line 406
    const-string v1, "artist"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    .line 405
    invoke-interface {v10, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/arist/dao/MusicDao;->getMusicNumbyArtist(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v8, v1}, Lcom/arist/entity/MusicFolder;->setNum(I)V

    .line 407
    const-string v1, "artist"

    invoke-virtual {v8, v1}, Lcom/arist/entity/MusicFolder;->setPath(Ljava/lang/String;)V

    .line 408
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 409
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/16 v2, 0x9

    if-le v1, v2, :cond_0

    .line 410
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 411
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0
.end method

.method public insertMusic(Lcom/arist/entity/Music;)J
    .locals 8
    .param p1, "music"    # Lcom/arist/entity/Music;

    .prologue
    .line 186
    const-wide/16 v2, -0x1

    .line 187
    .local v2, "rowId":J
    iget-object v4, p0, Lcom/arist/dao/MusicDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v4}, Lcom/arist/dao/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 189
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 190
    .local v1, "values":Landroid/content/ContentValues;
    const-string v4, "id"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getId()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    const-string v4, "title"

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    const-string v4, "data"

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getData()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    const-string v4, "size"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getSize()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    const-string v4, "duration"

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getDuration()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 195
    const-string v4, "album"

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getAlbum()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    const-string v4, "album_id"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getAlbumId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    const-string v4, "artist"

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getArtist()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    const-string v4, "folder_path"

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getFolderPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    const-string v4, "musictbl"

    const/4 v5, 0x0

    invoke-virtual {v0, v4, v5, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v2

    .line 201
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 202
    return-wide v2
.end method

.method public updateMusic(Lcom/arist/entity/Music;)I
    .locals 9
    .param p1, "music"    # Lcom/arist/entity/Music;

    .prologue
    .line 212
    const/4 v0, -0x1

    .line 213
    .local v0, "count":I
    iget-object v3, p0, Lcom/arist/dao/MusicDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v3}, Lcom/arist/dao/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 215
    .local v1, "db":Landroid/database/sqlite/SQLiteDatabase;
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 216
    .local v2, "values":Landroid/content/ContentValues;
    const-string v3, "title"

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    const-string v3, "data"

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getData()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    const-string v3, "size"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getSize()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    const-string v3, "duration"

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getDuration()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 220
    const-string v3, "album"

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getAlbum()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    const-string v3, "album_id"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getAlbumId()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    const-string v3, "artist"

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getArtist()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    const-string v3, "folder_path"

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getFolderPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    const-string v3, "musictbl"

    const-string v4, "id=?"

    .line 228
    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/arist/entity/Music;->getId()I

    move-result v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    .line 227
    invoke-virtual {v1, v3, v2, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 229
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 230
    return v0
.end method
