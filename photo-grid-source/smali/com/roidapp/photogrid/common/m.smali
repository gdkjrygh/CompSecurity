.class public final Lcom/roidapp/photogrid/common/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 12

    .prologue
    const/4 v11, 0x1

    const/4 v8, 0x0

    .line 14
    new-instance v10, Lorg/json/JSONArray;

    invoke-direct {v10}, Lorg/json/JSONArray;-><init>()V

    .line 19
    :try_start_0
    new-instance v9, Lcom/roidapp/photogrid/common/l;

    invoke-direct {v9, p0}, Lcom/roidapp/photogrid/common/l;-><init>(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :try_start_1
    invoke-virtual {v9}, Lcom/roidapp/photogrid/common/l;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 21
    :try_start_2
    const-string v1, "folder"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object v3

    .line 22
    if-eqz v3, :cond_a

    move-object v2, v10

    .line 23
    :goto_0
    :try_start_3
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 25
    const-string v1, "folderlist"

    invoke-interface {v3, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v3, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 26
    if-eqz v1, :cond_9

    const-string v4, "#"

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-le v4, v11, :cond_9

    .line 27
    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 28
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, v4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :goto_1
    move-object v2, v1

    .line 30
    goto :goto_0

    :cond_0
    move-object v1, v2

    .line 35
    :goto_2
    if-eqz v3, :cond_1

    .line 36
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 39
    :cond_1
    if-eqz v0, :cond_2

    .line 40
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 44
    :cond_2
    invoke-virtual {v9}, Lcom/roidapp/photogrid/common/l;->close()V

    move-object v0, v1

    .line 48
    :cond_3
    :goto_3
    return-object v0

    .line 33
    :catch_0
    move-exception v0

    move-object v1, v0

    move-object v2, v8

    move-object v3, v8

    move-object v0, v10

    :goto_4
    :try_start_4
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 35
    if-eqz v2, :cond_4

    .line 36
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 39
    :cond_4
    if-eqz v8, :cond_5

    .line 40
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 43
    :cond_5
    if-eqz v3, :cond_3

    .line 44
    invoke-virtual {v3}, Lcom/roidapp/photogrid/common/l;->close()V

    goto :goto_3

    .line 35
    :catchall_0
    move-exception v0

    move-object v3, v8

    move-object v9, v8

    :goto_5
    if-eqz v3, :cond_6

    .line 36
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 39
    :cond_6
    if-eqz v8, :cond_7

    .line 40
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 43
    :cond_7
    if-eqz v9, :cond_8

    .line 44
    invoke-virtual {v9}, Lcom/roidapp/photogrid/common/l;->close()V

    .line 46
    :cond_8
    throw v0

    .line 35
    :catchall_1
    move-exception v0

    move-object v3, v8

    goto :goto_5

    :catchall_2
    move-exception v1

    move-object v3, v8

    move-object v8, v0

    move-object v0, v1

    goto :goto_5

    :catchall_3
    move-exception v1

    move-object v8, v0

    move-object v0, v1

    goto :goto_5

    :catchall_4
    move-exception v0

    move-object v9, v3

    move-object v3, v2

    goto :goto_5

    .line 33
    :catch_1
    move-exception v0

    move-object v1, v0

    move-object v2, v8

    move-object v3, v9

    move-object v0, v10

    goto :goto_4

    :catch_2
    move-exception v1

    move-object v2, v8

    move-object v3, v9

    move-object v8, v0

    move-object v0, v10

    goto :goto_4

    :catch_3
    move-exception v1

    move-object v8, v0

    move-object v0, v2

    move-object v2, v3

    move-object v3, v9

    goto :goto_4

    :cond_9
    move-object v1, v2

    goto :goto_1

    :cond_a
    move-object v1, v10

    goto :goto_2
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 7

    .prologue
    const-wide/16 v4, -0x1

    const/4 v1, 0x0

    .line 54
    .line 58
    :try_start_0
    new-instance v6, Lcom/roidapp/photogrid/common/l;

    invoke-direct {v6, p0}, Lcom/roidapp/photogrid/common/l;-><init>(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    :try_start_1
    invoke-virtual {v6}, Lcom/roidapp/photogrid/common/l;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 60
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 61
    const-string v0, "folder"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 62
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 63
    const-string v2, "folderlist"

    invoke-virtual {v0, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string v2, "folder"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-wide v2

    .line 65
    :try_start_2
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 66
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 70
    if-eqz v1, :cond_0

    .line 71
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 75
    :cond_0
    invoke-virtual {v6}, Lcom/roidapp/photogrid/common/l;->close()V

    .line 79
    :cond_1
    :goto_0
    cmp-long v0, v2, v4

    if-nez v0, :cond_5

    .line 80
    const/4 v0, 0x0

    .line 82
    :goto_1
    return v0

    .line 68
    :catch_0
    move-exception v0

    move-wide v2, v4

    move-object v6, v1

    :goto_2
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 70
    if-eqz v1, :cond_2

    .line 71
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 74
    :cond_2
    if-eqz v6, :cond_1

    .line 75
    invoke-virtual {v6}, Lcom/roidapp/photogrid/common/l;->close()V

    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    move-object v6, v1

    :goto_3
    if-eqz v1, :cond_3

    .line 71
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 74
    :cond_3
    if-eqz v6, :cond_4

    .line 75
    invoke-virtual {v6}, Lcom/roidapp/photogrid/common/l;->close()V

    .line 77
    :cond_4
    throw v0

    .line 82
    :cond_5
    const/4 v0, 0x1

    goto :goto_1

    .line 70
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 68
    :catch_1
    move-exception v0

    move-wide v2, v4

    goto :goto_2

    :catch_2
    move-exception v0

    goto :goto_2
.end method
