.class public Lcom/arist/biz/MusicBiz;
.super Ljava/lang/Object;
.source "MusicBiz.java"


# instance fields
.field private context:Landroid/content/Context;

.field private count:I

.field private folderDao:Lcom/arist/dao/MusicFolderDao;

.field private musicDao:Lcom/arist/dao/MusicDao;

.field private totalMusic:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v0, 0x0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput v0, p0, Lcom/arist/biz/MusicBiz;->count:I

    .line 22
    iput v0, p0, Lcom/arist/biz/MusicBiz;->totalMusic:I

    .line 55
    iput-object p1, p0, Lcom/arist/biz/MusicBiz;->context:Landroid/content/Context;

    .line 56
    return-void
.end method


# virtual methods
.method public addAllMusicToDB()I
    .locals 11

    .prologue
    .line 60
    const/16 v0, 0x8

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "_id"

    aput-object v1, v2, v0

    const/4 v0, 0x1

    const-string v1, "title"

    aput-object v1, v2, v0

    const/4 v0, 0x2

    const-string v1, "_data"

    aput-object v1, v2, v0

    const/4 v0, 0x3

    const-string v1, "_size"

    aput-object v1, v2, v0

    const/4 v0, 0x4

    .line 61
    const-string v1, "duration"

    aput-object v1, v2, v0

    const/4 v0, 0x5

    const-string v1, "album"

    aput-object v1, v2, v0

    const/4 v0, 0x6

    const-string v1, "album_id"

    aput-object v1, v2, v0

    const/4 v0, 0x7

    const-string v1, "artist"

    aput-object v1, v2, v0

    .line 65
    .local v2, "projection":[Ljava/lang/String;
    iget-object v0, p0, Lcom/arist/biz/MusicBiz;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 66
    sget-object v1, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v3, "duration > 30000"

    .line 67
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 65
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 68
    .local v6, "c":Landroid/database/Cursor;
    if-eqz v6, :cond_1

    invoke-interface {v6}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 69
    const/16 v0, 0x8

    new-array v8, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "_id"

    aput-object v1, v8, v0

    const/4 v0, 0x1

    const-string v1, "title"

    aput-object v1, v8, v0

    const/4 v0, 0x2

    const-string v1, "_data"

    aput-object v1, v8, v0

    const/4 v0, 0x3

    const-string v1, "_size"

    aput-object v1, v8, v0

    const/4 v0, 0x4

    .line 70
    const-string v1, "duration"

    aput-object v1, v8, v0

    const/4 v0, 0x5

    const-string v1, "album"

    aput-object v1, v8, v0

    const/4 v0, 0x6

    const-string v1, "album_id"

    aput-object v1, v8, v0

    const/4 v0, 0x7

    const-string v1, "artist"

    aput-object v1, v8, v0

    .line 71
    .local v8, "itemNames":[Ljava/lang/String;
    :cond_0
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 92
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 94
    .end local v8    # "itemNames":[Ljava/lang/String;
    :cond_1
    iget v0, p0, Lcom/arist/biz/MusicBiz;->count:I

    return v0

    .line 72
    .restart local v8    # "itemNames":[Ljava/lang/String;
    :cond_2
    new-instance v10, Lcom/arist/entity/Music;

    invoke-direct {v10}, Lcom/arist/entity/Music;-><init>()V

    .line 73
    .local v10, "music":Lcom/arist/entity/Music;
    const/4 v0, 0x0

    aget-object v0, v8, v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/arist/entity/Music;->setId(I)V

    .line 74
    const/4 v0, 0x1

    aget-object v0, v8, v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/arist/entity/Music;->setTitle(Ljava/lang/String;)V

    .line 75
    const/4 v0, 0x2

    aget-object v0, v8, v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/arist/entity/Music;->setData(Ljava/lang/String;)V

    .line 76
    const/4 v0, 0x3

    aget-object v0, v8, v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/arist/entity/Music;->setSize(J)V

    .line 78
    const/4 v0, 0x4

    aget-object v0, v8, v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/arist/entity/Music;->setDuration(I)V

    .line 79
    const/4 v0, 0x5

    aget-object v0, v8, v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/arist/entity/Music;->setAlbum(Ljava/lang/String;)V

    .line 80
    const/4 v0, 0x6

    aget-object v0, v8, v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/arist/entity/Music;->setAlbumId(I)V

    .line 81
    const/4 v0, 0x7

    aget-object v0, v8, v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/arist/entity/Music;->setArtist(Ljava/lang/String;)V

    .line 83
    new-instance v9, Ljava/io/File;

    invoke-virtual {v10}, Lcom/arist/entity/Music;->getData()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 84
    .local v9, "m":Ljava/io/File;
    invoke-virtual {v9}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v7

    .line 85
    .local v7, "folder":Ljava/io/File;
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/arist/entity/Music;->setFolderPath(Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lcom/arist/biz/MusicBiz;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v0, v10}, Lcom/arist/dao/MusicDao;->insertMusic(Lcom/arist/entity/Music;)J

    move-result-wide v0

    const-wide/16 v4, -0x1

    cmp-long v0, v0, v4

    if-lez v0, :cond_0

    .line 89
    iget v0, p0, Lcom/arist/biz/MusicBiz;->count:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/arist/biz/MusicBiz;->count:I

    goto/16 :goto_0
.end method

.method public addMusicFolderToDB()I
    .locals 7

    .prologue
    .line 169
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 170
    .local v2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    iget-object v5, p0, Lcom/arist/biz/MusicBiz;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v5}, Lcom/arist/dao/MusicDao;->getFolder()Ljava/util/ArrayList;

    move-result-object v2

    .line 172
    const/4 v0, 0x0

    .line 173
    .local v0, "f":Ljava/io/File;
    const/4 v4, 0x0

    .line 174
    .local v4, "name":Ljava/lang/String;
    const/4 v3, 0x0

    .line 175
    .local v3, "musicFolder":Lcom/arist/entity/MusicFolder;
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_0

    .line 185
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    return v5

    .line 175
    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 176
    .local v1, "folderPath":Ljava/lang/String;
    new-instance v0, Ljava/io/File;

    .end local v0    # "f":Ljava/io/File;
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 177
    .restart local v0    # "f":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    .line 178
    new-instance v3, Lcom/arist/entity/MusicFolder;

    .end local v3    # "musicFolder":Lcom/arist/entity/MusicFolder;
    invoke-direct {v3}, Lcom/arist/entity/MusicFolder;-><init>()V

    .line 179
    .restart local v3    # "musicFolder":Lcom/arist/entity/MusicFolder;
    iget-object v6, p0, Lcom/arist/biz/MusicBiz;->folderDao:Lcom/arist/dao/MusicFolderDao;

    invoke-virtual {v6, v1}, Lcom/arist/dao/MusicFolderDao;->getMusicCount(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v3, v6}, Lcom/arist/entity/MusicFolder;->setNum(I)V

    .line 180
    invoke-virtual {v3, v4}, Lcom/arist/entity/MusicFolder;->setName(Ljava/lang/String;)V

    .line 181
    invoke-virtual {v3, v1}, Lcom/arist/entity/MusicFolder;->setPath(Ljava/lang/String;)V

    .line 183
    iget-object v6, p0, Lcom/arist/biz/MusicBiz;->folderDao:Lcom/arist/dao/MusicFolderDao;

    invoke-virtual {v6, v3}, Lcom/arist/dao/MusicFolderDao;->insertFolder(Lcom/arist/entity/MusicFolder;)J

    goto :goto_0
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 43
    iget v0, p0, Lcom/arist/biz/MusicBiz;->count:I

    return v0
.end method

.method public getMusicByData(Ljava/lang/String;)Lcom/arist/entity/Music;
    .locals 11
    .param p1, "data"    # Ljava/lang/String;

    .prologue
    .line 138
    const/4 v10, 0x0

    .line 139
    .local v10, "music":Lcom/arist/entity/Music;
    const/16 v0, 0x8

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "_id"

    aput-object v1, v2, v0

    const/4 v0, 0x1

    const-string v1, "title"

    aput-object v1, v2, v0

    const/4 v0, 0x2

    const-string v1, "_data"

    aput-object v1, v2, v0

    const/4 v0, 0x3

    const-string v1, "_size"

    aput-object v1, v2, v0

    const/4 v0, 0x4

    .line 140
    const-string v1, "duration"

    aput-object v1, v2, v0

    const/4 v0, 0x5

    const-string v1, "album"

    aput-object v1, v2, v0

    const/4 v0, 0x6

    const-string v1, "album_id"

    aput-object v1, v2, v0

    const/4 v0, 0x7

    const-string v1, "artist"

    aput-object v1, v2, v0

    .line 141
    .local v2, "projection":[Ljava/lang/String;
    iget-object v0, p0, Lcom/arist/biz/MusicBiz;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 142
    sget-object v1, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v3, "_data=?"

    .line 143
    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x0

    .line 141
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 144
    .local v6, "c":Landroid/database/Cursor;
    const/16 v0, 0x8

    new-array v8, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "_id"

    aput-object v1, v8, v0

    const/4 v0, 0x1

    const-string v1, "title"

    aput-object v1, v8, v0

    const/4 v0, 0x2

    const-string v1, "_data"

    aput-object v1, v8, v0

    const/4 v0, 0x3

    const-string v1, "_size"

    aput-object v1, v8, v0

    const/4 v0, 0x4

    const-string v1, "duration"

    aput-object v1, v8, v0

    const/4 v0, 0x5

    .line 145
    const-string v1, "album"

    aput-object v1, v8, v0

    const/4 v0, 0x6

    const-string v1, "album_id"

    aput-object v1, v8, v0

    const/4 v0, 0x7

    const-string v1, "artist"

    aput-object v1, v8, v0

    .line 146
    .local v8, "itemNames":[Ljava/lang/String;
    if-eqz v6, :cond_0

    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    new-instance v10, Lcom/arist/entity/Music;

    .end local v10    # "music":Lcom/arist/entity/Music;
    invoke-direct {v10}, Lcom/arist/entity/Music;-><init>()V

    .line 148
    .restart local v10    # "music":Lcom/arist/entity/Music;
    const/4 v0, 0x0

    aget-object v0, v8, v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/arist/entity/Music;->setId(I)V

    .line 149
    const/4 v0, 0x1

    aget-object v0, v8, v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/arist/entity/Music;->setTitle(Ljava/lang/String;)V

    .line 150
    const/4 v0, 0x2

    aget-object v0, v8, v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/arist/entity/Music;->setData(Ljava/lang/String;)V

    .line 151
    const/4 v0, 0x3

    aget-object v0, v8, v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/arist/entity/Music;->setSize(J)V

    .line 153
    const/4 v0, 0x4

    aget-object v0, v8, v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/arist/entity/Music;->setDuration(I)V

    .line 154
    const/4 v0, 0x5

    aget-object v0, v8, v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/arist/entity/Music;->setAlbum(Ljava/lang/String;)V

    .line 155
    const/4 v0, 0x6

    aget-object v0, v8, v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/arist/entity/Music;->setAlbumId(I)V

    .line 156
    const/4 v0, 0x7

    aget-object v0, v8, v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/arist/entity/Music;->setArtist(Ljava/lang/String;)V

    .line 158
    new-instance v9, Ljava/io/File;

    invoke-virtual {v10}, Lcom/arist/entity/Music;->getData()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 159
    .local v9, "m":Ljava/io/File;
    invoke-virtual {v9}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v7

    .line 160
    .local v7, "folder":Ljava/io/File;
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/arist/entity/Music;->setFolderPath(Ljava/lang/String;)V

    .line 162
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 164
    .end local v7    # "folder":Ljava/io/File;
    .end local v9    # "m":Ljava/io/File;
    :cond_0
    return-object v10
.end method

.method public getRecentAddMusic()Ljava/util/ArrayList;
    .locals 19
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
    .line 98
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .local v15, "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    .line 100
    .local v16, "t":J
    const-wide/16 v2, 0x3e8

    div-long v2, v16, v2

    const-wide/32 v6, 0x15180

    sub-long v10, v2, v6

    .line 101
    .local v10, "dateAdded":J
    const/16 v2, 0x8

    new-array v12, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "_id"

    aput-object v3, v12, v2

    const/4 v2, 0x1

    const-string v3, "title"

    aput-object v3, v12, v2

    const/4 v2, 0x2

    const-string v3, "_data"

    aput-object v3, v12, v2

    const/4 v2, 0x3

    const-string v3, "_size"

    aput-object v3, v12, v2

    const/4 v2, 0x4

    const-string v3, "duration"

    aput-object v3, v12, v2

    const/4 v2, 0x5

    .line 102
    const-string v3, "album"

    aput-object v3, v12, v2

    const/4 v2, 0x6

    const-string v3, "album_id"

    aput-object v3, v12, v2

    const/4 v2, 0x7

    const-string v3, "artist"

    aput-object v3, v12, v2

    .line 103
    .local v12, "itemNames":[Ljava/lang/String;
    const/16 v2, 0x9

    new-array v4, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "_id"

    aput-object v3, v4, v2

    const/4 v2, 0x1

    const-string v3, "title"

    aput-object v3, v4, v2

    const/4 v2, 0x2

    const-string v3, "_data"

    aput-object v3, v4, v2

    const/4 v2, 0x3

    const-string v3, "_size"

    aput-object v3, v4, v2

    const/4 v2, 0x4

    .line 104
    const-string v3, "duration"

    aput-object v3, v4, v2

    const/4 v2, 0x5

    const-string v3, "album"

    aput-object v3, v4, v2

    const/4 v2, 0x6

    const-string v3, "album_id"

    aput-object v3, v4, v2

    const/4 v2, 0x7

    const-string v3, "artist"

    aput-object v3, v4, v2

    const/16 v2, 0x8

    const-string v3, "date_added"

    aput-object v3, v4, v2

    .line 105
    .local v4, "projection":[Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/arist/biz/MusicBiz;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    .line 106
    sget-object v3, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v5, "mime_type!=?"

    .line 107
    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/String;

    const/4 v7, 0x0

    const-string v18, "audio/amr"

    aput-object v18, v6, v7

    const/4 v7, 0x0

    .line 105
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 110
    .local v8, "c":Landroid/database/Cursor;
    if-eqz v8, :cond_1

    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v2

    if-lez v2, :cond_1

    .line 111
    :cond_0
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_2

    .line 131
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 133
    :cond_1
    return-object v15

    .line 112
    :cond_2
    const-string v2, "date_added"

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    int-to-long v2, v2

    cmp-long v2, v2, v10

    if-lez v2, :cond_0

    .line 113
    new-instance v14, Lcom/arist/entity/Music;

    invoke-direct {v14}, Lcom/arist/entity/Music;-><init>()V

    .line 114
    .local v14, "music":Lcom/arist/entity/Music;
    const/4 v2, 0x0

    aget-object v2, v12, v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-virtual {v14, v2}, Lcom/arist/entity/Music;->setId(I)V

    .line 115
    const/4 v2, 0x1

    aget-object v2, v12, v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Lcom/arist/entity/Music;->setTitle(Ljava/lang/String;)V

    .line 116
    const/4 v2, 0x2

    aget-object v2, v12, v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Lcom/arist/entity/Music;->setData(Ljava/lang/String;)V

    .line 117
    const/4 v2, 0x3

    aget-object v2, v12, v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v14, v2, v3}, Lcom/arist/entity/Music;->setSize(J)V

    .line 119
    const/4 v2, 0x4

    aget-object v2, v12, v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-virtual {v14, v2}, Lcom/arist/entity/Music;->setDuration(I)V

    .line 120
    const/4 v2, 0x5

    aget-object v2, v12, v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Lcom/arist/entity/Music;->setAlbum(Ljava/lang/String;)V

    .line 121
    const/4 v2, 0x6

    aget-object v2, v12, v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-virtual {v14, v2}, Lcom/arist/entity/Music;->setAlbumId(I)V

    .line 122
    const/4 v2, 0x7

    aget-object v2, v12, v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Lcom/arist/entity/Music;->setArtist(Ljava/lang/String;)V

    .line 124
    new-instance v13, Ljava/io/File;

    invoke-virtual {v14}, Lcom/arist/entity/Music;->getData()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v13, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 125
    .local v13, "m":Ljava/io/File;
    invoke-virtual {v13}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v9

    .line 126
    .local v9, "folder":Ljava/io/File;
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Lcom/arist/entity/Music;->setFolderPath(Ljava/lang/String;)V

    .line 128
    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0
.end method

.method public getTotalMusic()I
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 31
    iget-object v0, p0, Lcom/arist/biz/MusicBiz;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 32
    sget-object v1, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v5, "_id"

    aput-object v5, v2, v3

    .line 33
    const-string v3, "duration > 30000"

    move-object v5, v4

    .line 31
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 34
    .local v6, "c":Landroid/database/Cursor;
    if-eqz v6, :cond_0

    invoke-interface {v6}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 35
    invoke-interface {v6}, Landroid/database/Cursor;->getCount()I

    move-result v0

    iput v0, p0, Lcom/arist/biz/MusicBiz;->totalMusic:I

    .line 36
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 39
    :cond_0
    iget v0, p0, Lcom/arist/biz/MusicBiz;->totalMusic:I

    return v0
.end method

.method public setFolderDao(Lcom/arist/dao/MusicFolderDao;)V
    .locals 0
    .param p1, "folderDao"    # Lcom/arist/dao/MusicFolderDao;

    .prologue
    .line 51
    iput-object p1, p0, Lcom/arist/biz/MusicBiz;->folderDao:Lcom/arist/dao/MusicFolderDao;

    .line 52
    return-void
.end method

.method public setMusicDao(Lcom/arist/dao/MusicDao;)V
    .locals 0
    .param p1, "musicDao"    # Lcom/arist/dao/MusicDao;

    .prologue
    .line 47
    iput-object p1, p0, Lcom/arist/biz/MusicBiz;->musicDao:Lcom/arist/dao/MusicDao;

    .line 48
    return-void
.end method
