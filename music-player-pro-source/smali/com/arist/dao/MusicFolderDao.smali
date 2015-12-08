.class public Lcom/arist/dao/MusicFolderDao;
.super Ljava/lang/Object;
.source "MusicFolderDao.java"


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

    iput-object v0, p0, Lcom/arist/dao/MusicFolderDao;->helper:Lcom/arist/dao/DBOpenHelper;

    .line 19
    return-void
.end method


# virtual methods
.method public deleteAllFolder()V
    .locals 2

    .prologue
    .line 115
    iget-object v1, p0, Lcom/arist/dao/MusicFolderDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v1}, Lcom/arist/dao/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 116
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "delete from foldertbl"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 117
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 118
    return-void
.end method

.method public deleteFolder(I)I
    .locals 5
    .param p1, "id"    # I

    .prologue
    .line 89
    const/4 v0, -0x1

    .line 90
    .local v0, "count":I
    iget-object v2, p0, Lcom/arist/dao/MusicFolderDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v2}, Lcom/arist/dao/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 91
    .local v1, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v2, "foldertbl"

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

    .line 92
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 93
    return v0
.end method

.method public getAllFolder()Ljava/util/ArrayList;
    .locals 6
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
    .line 26
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .local v3, "folders":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/MusicFolder;>;"
    iget-object v4, p0, Lcom/arist/dao/MusicFolderDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v4}, Lcom/arist/dao/DBOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 28
    .local v1, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v4, "select id,num,name,path from foldertbl"

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 29
    .local v0, "c":Landroid/database/Cursor;
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v4

    if-lez v4, :cond_0

    .line 30
    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-nez v4, :cond_1

    .line 40
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 42
    :cond_0
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 43
    return-object v3

    .line 31
    :cond_1
    new-instance v2, Lcom/arist/entity/MusicFolder;

    invoke-direct {v2}, Lcom/arist/entity/MusicFolder;-><init>()V

    .line 33
    .local v2, "folder":Lcom/arist/entity/MusicFolder;
    const-string v4, "id"

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/arist/entity/MusicFolder;->setId(I)V

    .line 34
    const-string v4, "num"

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/arist/entity/MusicFolder;->setNum(I)V

    .line 35
    const-string v4, "name"

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/arist/entity/MusicFolder;->setName(Ljava/lang/String;)V

    .line 36
    const-string v4, "path"

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/arist/entity/MusicFolder;->setPath(Ljava/lang/String;)V

    .line 38
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public getMusicCount(Ljava/lang/String;)I
    .locals 10
    .param p1, "folderPath"    # Ljava/lang/String;

    .prologue
    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 100
    const/4 v9, -0x1

    .line 101
    .local v9, "count":I
    iget-object v1, p0, Lcom/arist/dao/MusicFolderDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v1}, Lcom/arist/dao/DBOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 102
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v1, "musictbl"

    new-array v2, v4, [Ljava/lang/String;

    const-string v3, "id"

    aput-object v3, v2, v6

    const-string v3, "folder_path=?"

    new-array v4, v4, [Ljava/lang/String;

    aput-object p1, v4, v6

    move-object v6, v5

    move-object v7, v5

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 103
    .local v8, "c":Landroid/database/Cursor;
    if-eqz v8, :cond_0

    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 104
    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v9

    .line 105
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 107
    :cond_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 108
    return v9
.end method

.method public insertFolder(Lcom/arist/entity/MusicFolder;)J
    .locals 6
    .param p1, "folder"    # Lcom/arist/entity/MusicFolder;

    .prologue
    .line 52
    const-wide/16 v2, -0x1

    .line 53
    .local v2, "rowId":J
    iget-object v4, p0, Lcom/arist/dao/MusicFolderDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v4}, Lcom/arist/dao/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 55
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 56
    .local v1, "values":Landroid/content/ContentValues;
    const-string v4, "num"

    invoke-virtual {p1}, Lcom/arist/entity/MusicFolder;->getNum()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 57
    const-string v4, "name"

    invoke-virtual {p1}, Lcom/arist/entity/MusicFolder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    const-string v4, "path"

    invoke-virtual {p1}, Lcom/arist/entity/MusicFolder;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    const-string v4, "foldertbl"

    const/4 v5, 0x0

    invoke-virtual {v0, v4, v5, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v2

    .line 60
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 61
    return-wide v2
.end method

.method public updateFolder(Lcom/arist/entity/MusicFolder;)I
    .locals 9
    .param p1, "folder"    # Lcom/arist/entity/MusicFolder;

    .prologue
    .line 70
    const/4 v0, -0x1

    .line 71
    .local v0, "count":I
    iget-object v3, p0, Lcom/arist/dao/MusicFolderDao;->helper:Lcom/arist/dao/DBOpenHelper;

    invoke-virtual {v3}, Lcom/arist/dao/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 73
    .local v1, "db":Landroid/database/sqlite/SQLiteDatabase;
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 74
    .local v2, "values":Landroid/content/ContentValues;
    const-string v3, "num"

    invoke-virtual {p1}, Lcom/arist/entity/MusicFolder;->getNum()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 75
    const-string v3, "name"

    invoke-virtual {p1}, Lcom/arist/entity/MusicFolder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    const-string v3, "path"

    invoke-virtual {p1}, Lcom/arist/entity/MusicFolder;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    const-string v3, "foldertbl"

    const-string v4, "id=?"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/arist/entity/MusicFolder;->getId()I

    move-result v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-virtual {v1, v3, v2, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 79
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 80
    return v0
.end method
