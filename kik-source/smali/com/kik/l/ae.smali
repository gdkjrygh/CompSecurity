.class public final Lcom/kik/l/ae;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;

.field private static c:Ljava/io/File;

.field private static d:Ljava/io/File;


# instance fields
.field private final b:Landroid/database/sqlite/SQLiteOpenHelper;

.field private e:Ljava/io/File;

.field private f:Lkik/a/e/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-string v0, "MessageStorage"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/l/ae;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Landroid/database/sqlite/SQLiteOpenHelper;Ljava/io/File;Ljava/io/File;Ljava/io/File;Lkik/a/e/v;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    .line 46
    sput-object p2, Lcom/kik/l/ae;->c:Ljava/io/File;

    .line 47
    sput-object p3, Lcom/kik/l/ae;->d:Ljava/io/File;

    .line 48
    iput-object p4, p0, Lcom/kik/l/ae;->e:Ljava/io/File;

    .line 49
    iput-object p5, p0, Lcom/kik/l/ae;->f:Lkik/a/e/v;

    .line 50
    return-void
.end method

.method private a(Ljava/lang/String;IZ)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v2, 0x2

    .line 506
    iget-object v0, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 507
    if-eqz p3, :cond_0

    .line 508
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1, v2}, Landroid/content/ContentValues;-><init>(I)V

    .line 509
    const-string v2, "content_id"

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    const-string v2, "retain_count"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 511
    const-string v2, "KIKContentRetainCountTable"

    invoke-virtual {v0, v2, v5, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 518
    :goto_0
    return-void

    .line 514
    :cond_0
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1, v2}, Landroid/content/ContentValues;-><init>(I)V

    .line 515
    const-string v2, "retain_count"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 516
    const-string v2, "KIKContentRetainCountTable"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "content_id=\""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v1, v3, v5}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0
.end method

.method private c(Ljava/lang/String;)I
    .locals 6

    .prologue
    .line 466
    const/16 v0, -0x1f4

    .line 467
    iget-object v1, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 468
    const-string v2, "SELECT `retain_count` FROM %s WHERE `content_id`=\"%s\""

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "KIKContentRetainCountTable"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object p1, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 469
    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 470
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 471
    const-string v0, "retain_count"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    .line 473
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 474
    return v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 482
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/kik/l/ae;->e:Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".jpg"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 484
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 485
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 487
    :cond_0
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/kik/l/ae;->c:Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".jpg"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 488
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 489
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 491
    :cond_1
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/kik/l/ae;->d:Ljava/io/File;

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 492
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 493
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 495
    :cond_2
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/16 v3, -0x1f4

    .line 499
    invoke-direct {p0, p1}, Lcom/kik/l/ae;->c(Ljava/lang/String;)I

    move-result v2

    .line 500
    if-ne v2, v3, :cond_1

    move v1, v0

    :goto_0
    add-int/lit8 v1, v1, 0x1

    .line 501
    if-ne v2, v3, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-direct {p0, p1, v1, v0}, Lcom/kik/l/ae;->a(Ljava/lang/String;IZ)V

    .line 502
    return-void

    :cond_1
    move v1, v2

    .line 500
    goto :goto_0
.end method

.method private f(Ljava/lang/String;)I
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/16 v4, -0x1f4

    .line 523
    invoke-direct {p0, p1}, Lcom/kik/l/ae;->c(Ljava/lang/String;)I

    move-result v3

    .line 524
    if-ne v3, v4, :cond_1

    move v2, v0

    :goto_0
    add-int/lit8 v2, v2, -0x1

    .line 525
    if-gez v2, :cond_0

    move v2, v1

    .line 528
    :cond_0
    if-ne v3, v4, :cond_2

    :goto_1
    invoke-direct {p0, p1, v2, v0}, Lcom/kik/l/ae;->a(Ljava/lang/String;IZ)V

    .line 529
    return v2

    :cond_1
    move v2, v3

    .line 524
    goto :goto_0

    :cond_2
    move v0, v1

    .line 528
    goto :goto_1
.end method


# virtual methods
.method public final a()Ljava/util/Hashtable;
    .locals 13

    .prologue
    const/4 v8, 0x0

    .line 255
    new-instance v9, Ljava/util/Hashtable;

    invoke-direct {v9}, Ljava/util/Hashtable;-><init>()V

    .line 256
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 257
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 259
    iget-object v12, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v12

    .line 260
    :try_start_0
    iget-object v0, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 264
    :try_start_1
    const-string v1, "messagesTable"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "bin_id,_id"

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v8

    .line 266
    :try_start_2
    new-instance v1, Lcom/kik/l/ad;

    invoke-direct {v1, v8}, Lcom/kik/l/ad;-><init>(Landroid/database/Cursor;)V

    .line 268
    new-instance v2, Lcom/kik/l/af;

    invoke-direct {v2, p0, v9, v10, v11}, Lcom/kik/l/af;-><init>(Lcom/kik/l/ae;Ljava/util/Hashtable;Ljava/util/Map;Ljava/util/Map;)V

    invoke-virtual {v1, v2}, Lcom/kik/l/ad;->a(Lcom/kik/l/y$a;)V

    .line 317
    const-string v1, "KIKContentTable"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "content_id"

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 319
    new-instance v1, Lcom/kik/l/o;

    invoke-direct {v1, v8}, Lcom/kik/l/o;-><init>(Landroid/database/Cursor;)V

    .line 321
    new-instance v2, Lcom/kik/l/ag;

    invoke-direct {v2, p0, v10}, Lcom/kik/l/ag;-><init>(Lcom/kik/l/ae;Ljava/util/Map;)V

    invoke-virtual {v1, v2}, Lcom/kik/l/o;->a(Lcom/kik/l/y$a;)V

    .line 343
    const-string v1, "KIKContentURITable"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "content_id"

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 345
    new-instance v1, Lcom/kik/l/as;

    invoke-direct {v1, v8}, Lcom/kik/l/as;-><init>(Landroid/database/Cursor;)V

    .line 347
    new-instance v2, Lcom/kik/l/ah;

    invoke-direct {v2, p0, v10}, Lcom/kik/l/ah;-><init>(Lcom/kik/l/ae;Ljava/util/Map;)V

    invoke-virtual {v1, v2}, Lcom/kik/l/as;->a(Lcom/kik/l/y$a;)V

    .line 369
    const-string v1, "KikFriendAttributionTableName"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "timestamp"

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v1

    .line 371
    :try_start_3
    new-instance v0, Lcom/kik/l/z;

    invoke-direct {v0, v1}, Lcom/kik/l/z;-><init>(Landroid/database/Cursor;)V

    .line 373
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 374
    new-instance v3, Lcom/kik/l/ai;

    invoke-direct {v3, p0, v11, v2}, Lcom/kik/l/ai;-><init>(Lcom/kik/l/ae;Ljava/util/Map;Ljava/util/Set;)V

    invoke-virtual {v0, v3}, Lcom/kik/l/z;->a(Lcom/kik/l/y$a;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 400
    if-eqz v1, :cond_0

    :try_start_4
    invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 401
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 405
    :cond_0
    :goto_0
    monitor-exit v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-object v9

    .line 394
    :catch_0
    move-exception v0

    move-object v1, v8

    .line 395
    :goto_1
    :try_start_5
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error in getting conversations: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 400
    if-eqz v1, :cond_0

    :try_start_6
    invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 401
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 406
    :catchall_0
    move-exception v0

    monitor-exit v12
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v0

    .line 400
    :catchall_1
    move-exception v0

    :goto_2
    if-eqz v8, :cond_1

    :try_start_7
    invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z

    move-result v1

    if-nez v1, :cond_1

    .line 401
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    :cond_1
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 400
    :catchall_2
    move-exception v0

    move-object v8, v1

    goto :goto_2

    .line 394
    :catch_1
    move-exception v0

    move-object v1, v8

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 14

    .prologue
    const/4 v8, 0x1

    const/4 v9, 0x0

    .line 203
    iget-object v10, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v10

    .line 204
    :try_start_0
    iget-object v0, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v0

    .line 207
    :try_start_1
    const-string v1, "messagesTable"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "uid"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-string v4, "content_id"

    aput-object v4, v2, v3

    const-string v3, "bin_id = ? AND content_id IS NOT NULL"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 208
    invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 210
    :cond_0
    const-string v1, "content_id"

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 211
    const-string v1, "uid"

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 212
    if-eqz v12, :cond_4

    .line 213
    invoke-direct {p0, v12}, Lcom/kik/l/ae;->f(Ljava/lang/String;)I

    move-result v1

    .line 214
    if-gtz v1, :cond_4

    .line 215
    invoke-direct {p0, v12}, Lcom/kik/l/ae;->d(Ljava/lang/String;)V

    .line 216
    const-string v1, "KIKContentTable"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "content_string"

    aput-object v4, v2, v3

    const-string v3, "content_id = ? AND content_name = \'preview\' AND content_type = ?"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v12, v4, v5

    const/4 v5, 0x1

    const-string v6, "3"

    aput-object v6, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 217
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 219
    :cond_1
    const-string v2, "content_string"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 220
    if-eqz v2, :cond_2

    .line 221
    invoke-direct {p0, v2}, Lcom/kik/l/ae;->f(Ljava/lang/String;)I

    move-result v3

    .line 222
    if-gtz v3, :cond_2

    .line 223
    invoke-direct {p0, v2}, Lcom/kik/l/ae;->d(Ljava/lang/String;)V

    .line 226
    :cond_2
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 228
    :cond_3
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 229
    const-string v1, "KIKContentTable"

    const-string v2, "content_id = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v12, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 233
    :cond_4
    if-eqz v13, :cond_5

    .line 234
    iget-object v1, p0, Lcom/kik/l/ae;->f:Lkik/a/e/v;

    invoke-interface {v1, v13}, Lkik/a/e/v;->h(Ljava/lang/String;)V

    .line 237
    :cond_5
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_0

    .line 239
    :cond_6
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 240
    const-string v1, "messagesTable"

    const-string v2, "bin_id = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v0, v8

    .line 249
    :goto_0
    :try_start_2
    monitor-exit v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return v0

    .line 242
    :catch_0
    move-exception v0

    .line 243
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error deleting conversation: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move v0, v9

    .line 248
    goto :goto_0

    .line 246
    :catchall_0
    move-exception v0

    :try_start_4
    throw v0

    .line 250
    :catchall_1
    move-exception v0

    monitor-exit v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method public final a(Ljava/util/List;)Z
    .locals 11

    .prologue
    const/4 v3, 0x0

    .line 538
    iget-object v6, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v6

    .line 539
    :try_start_0
    iget-object v0, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v7

    .line 540
    const/4 v2, 0x1

    .line 544
    :try_start_1
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 546
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v9, v0, [Ljava/lang/String;

    .line 548
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move v4, v3

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 549
    const-class v1, Lkik/a/d/a/a;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/a;

    .line 550
    add-int/lit8 v5, v4, 0x1

    invoke-virtual {v0}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v4

    .line 551
    if-eqz v1, :cond_1

    .line 552
    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/kik/l/ae;->f(Ljava/lang/String;)I

    move-result v0

    .line 553
    if-gtz v0, :cond_1

    .line 554
    const-string v0, "preview"

    invoke-virtual {v1, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    check-cast v0, Lkik/a/d/d;

    .line 555
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 556
    invoke-virtual {v0}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/kik/l/ae;->f(Ljava/lang/String;)I

    move-result v4

    .line 557
    if-gtz v4, :cond_0

    .line 558
    invoke-virtual {v0}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/kik/l/ae;->d(Ljava/lang/String;)V

    .line 561
    :cond_0
    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 562
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    invoke-static {v1}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/kik/l/ae;->d(Ljava/lang/String;)V

    :cond_1
    move v4, v5

    .line 565
    goto :goto_0

    .line 567
    :cond_2
    const-string v0, "messagesTable"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "uid in ("

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Lcom/kik/l/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ")"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1, v9}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 570
    const-string v1, "KIKContentTable"

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "content_id IN ("

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Lcom/kik/l/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ")"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v8, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {v7, v1, v4, v0}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 580
    :try_start_2
    iget-object v0, p0, Lcom/kik/l/ae;->f:Lkik/a/e/v;

    invoke-interface {v0, p1}, Lkik/a/e/v;->a(Ljava/util/List;)V

    move v0, v2

    .line 582
    :goto_1
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return v0

    .line 572
    :catch_0
    move-exception v0

    .line 573
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "deleteKIKContact failed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    const-string v0, "NPE!"

    :goto_2
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 580
    :try_start_4
    iget-object v0, p0, Lcom/kik/l/ae;->f:Lkik/a/e/v;

    invoke-interface {v0, p1}, Lkik/a/e/v;->a(Ljava/util/List;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move v0, v3

    .line 581
    goto :goto_1

    .line 573
    :cond_3
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result-object v0

    goto :goto_2

    .line 580
    :catchall_0
    move-exception v0

    :try_start_6
    iget-object v1, p0, Lcom/kik/l/ae;->f:Lkik/a/e/v;

    invoke-interface {v1, p1}, Lkik/a/e/v;->a(Ljava/util/List;)V

    throw v0

    .line 583
    :catchall_1
    move-exception v0

    monitor-exit v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v0
.end method

.method public final a(Lkik/a/d/s;)Z
    .locals 10

    .prologue
    const/16 v9, -0x1f4

    .line 54
    iget-object v3, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v3

    .line 55
    const/4 v2, 0x1

    .line 57
    :try_start_0
    iget-object v0, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    .line 58
    const-class v0, Lkik/a/d/a/a;

    invoke-static {p1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 59
    if-eqz v0, :cond_6

    .line 60
    invoke-static {v0}, Lcom/kik/l/o;->a(Lkik/a/d/a/a;)Ljava/util/ArrayList;

    move-result-object v1

    .line 61
    invoke-static {v0}, Lcom/kik/l/as;->a(Lkik/a/d/a/a;)Ljava/util/ArrayList;

    move-result-object v5

    .line 62
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 64
    :try_start_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ContentValues;

    .line 65
    const-string v7, "KIKContentTable"

    const/4 v8, 0x0

    invoke-virtual {v4, v7, v8, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 78
    :catchall_0
    move-exception v1

    move-object v2, v1

    :try_start_2
    invoke-virtual {v0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/kik/l/ae;->c(Ljava/lang/String;)I

    move-result v1

    .line 79
    if-eq v1, v9, :cond_0

    if-nez v1, :cond_1

    .line 80
    :cond_0
    const-string v1, "preview"

    invoke-virtual {v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v1

    .line 81
    if-eqz v1, :cond_1

    .line 82
    invoke-virtual {v1}, Lkik/a/d/o;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/kik/l/ae;->e(Ljava/lang/String;)V

    .line 85
    :cond_1
    invoke-virtual {v0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/kik/l/ae;->e(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 88
    throw v2

    .line 115
    :catchall_1
    move-exception v0

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 67
    :cond_2
    :try_start_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ContentValues;

    .line 68
    const-string v6, "KIKContentURITable"

    const/4 v7, 0x0

    invoke-virtual {v4, v6, v7, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    goto :goto_1

    .line 70
    :cond_3
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 78
    :try_start_4
    invoke-virtual {v0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/kik/l/ae;->c(Ljava/lang/String;)I

    move-result v1

    .line 79
    if-eq v1, v9, :cond_4

    if-nez v1, :cond_5

    .line 80
    :cond_4
    const-string v1, "preview"

    invoke-virtual {v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v1

    .line 81
    if-eqz v1, :cond_5

    .line 82
    invoke-virtual {v1}, Lkik/a/d/o;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/kik/l/ae;->e(Ljava/lang/String;)V

    .line 85
    :cond_5
    invoke-virtual {v0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/kik/l/ae;->e(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 91
    :cond_6
    const-class v0, Lkik/a/d/a/d;

    invoke-static {p1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/d;

    .line 92
    if-eqz v0, :cond_8

    .line 93
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 94
    const-string v1, "KikFriendAttributionTableName"

    const/4 v5, 0x0

    invoke-static {v0}, Lcom/kik/l/z;->a(Lkik/a/d/a/d;)Landroid/content/ContentValues;

    move-result-object v6

    invoke-virtual {v4, v1, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v6

    long-to-int v1, v6

    .line 95
    const/4 v5, -0x1

    if-eq v1, v5, :cond_7

    .line 96
    invoke-virtual {v0, v1}, Lkik/a/d/a/d;->a(I)V

    .line 97
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 99
    :cond_7
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 103
    :cond_8
    :try_start_5
    invoke-static {p1}, Lcom/kik/l/ad;->a(Lkik/a/d/s;)Landroid/content/ContentValues;

    move-result-object v0

    .line 104
    const-string v1, "messagesTable"

    const/4 v5, 0x0

    invoke-virtual {v4, v1, v5, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move v0, v2

    .line 114
    :goto_2
    :try_start_6
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    return v0

    .line 106
    :catch_0
    move-exception v0

    .line 107
    :try_start_7
    invoke-static {v0}, Lkik/android/util/bx;->d(Ljava/lang/Throwable;)V

    .line 108
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Storage Failure: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 109
    const/4 v0, 0x0

    goto :goto_2

    .line 111
    :catchall_2
    move-exception v0

    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1
.end method

.method protected final b(Ljava/lang/String;)Lkik/a/d/a/a;
    .locals 11

    .prologue
    .line 411
    iget-object v10, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v10

    .line 412
    :try_start_0
    iget-object v0, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 413
    const-string v1, "KIKContentTable"

    const/4 v2, 0x0

    const-string v3, "content_id = ?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 415
    new-instance v1, Lkik/a/d/a/a;

    const/4 v3, 0x0

    const-string v4, "2"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Lkik/a/d/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Hashtable;Ljava/util/Hashtable;Ljava/util/Hashtable;)V

    .line 416
    new-instance v2, Lcom/kik/l/o;

    invoke-direct {v2, v9}, Lcom/kik/l/o;-><init>(Landroid/database/Cursor;)V

    .line 418
    new-instance v3, Lcom/kik/l/aj;

    invoke-direct {v3, p0, v1}, Lcom/kik/l/aj;-><init>(Lcom/kik/l/ae;Lkik/a/d/a/a;)V

    invoke-virtual {v2, v3}, Lcom/kik/l/o;->a(Lcom/kik/l/y$a;)V

    .line 426
    const-string v3, "KIKContentURITable"

    const/4 v4, 0x0

    const-string v5, "content_id = ?"

    const/4 v2, 0x1

    new-array v6, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v6, v2

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, v0

    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 427
    new-instance v2, Lcom/kik/l/as;

    invoke-direct {v2, v0}, Lcom/kik/l/as;-><init>(Landroid/database/Cursor;)V

    .line 429
    new-instance v0, Lcom/kik/l/ak;

    invoke-direct {v0, p0, v1}, Lcom/kik/l/ak;-><init>(Lcom/kik/l/ae;Lkik/a/d/a/a;)V

    invoke-virtual {v2, v0}, Lcom/kik/l/as;->a(Lcom/kik/l/y$a;)V

    .line 437
    monitor-exit v10

    return-object v1

    .line 438
    :catchall_0
    move-exception v0

    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b(Lkik/a/d/s;)Z
    .locals 7

    .prologue
    .line 120
    iget-object v3, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v3

    .line 121
    :try_start_0
    iget-object v0, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 122
    const/4 v2, 0x1

    .line 124
    :try_start_1
    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v0

    .line 125
    if-eqz v0, :cond_0

    .line 128
    const-string v1, "messagesTable"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "uid =\'"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "\'"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    invoke-virtual {v4, v1, v0, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 130
    :cond_0
    const-class v0, Lkik/a/d/a/a;

    invoke-static {p1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 132
    if-eqz v0, :cond_2

    .line 133
    invoke-virtual {v0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/kik/l/ae;->f(Ljava/lang/String;)I

    move-result v1

    .line 134
    if-gtz v1, :cond_2

    .line 135
    const-string v1, "preview"

    invoke-virtual {v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v1

    check-cast v1, Lkik/a/d/d;

    .line 136
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 137
    invoke-virtual {v1}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v5}, Lcom/kik/l/ae;->f(Ljava/lang/String;)I

    move-result v5

    .line 138
    if-gtz v5, :cond_1

    .line 139
    invoke-virtual {v1}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/kik/l/ae;->d(Ljava/lang/String;)V

    .line 142
    :cond_1
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    invoke-static {v0}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/kik/l/ae;->d(Ljava/lang/String;)V

    .line 143
    const-string v1, "KIKContentTable"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "content_id = \'"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "\'"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    invoke-virtual {v4, v1, v0, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 155
    :cond_2
    :try_start_2
    iget-object v0, p0, Lcom/kik/l/ae;->f:Lkik/a/e/v;

    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/v;->h(Ljava/lang/String;)V

    move v0, v2

    .line 157
    :goto_0
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return v0

    .line 147
    :catch_0
    move-exception v0

    .line 148
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "deleteKIKContact failed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 149
    const/4 v0, 0x0

    .line 155
    :try_start_4
    iget-object v1, p0, Lcom/kik/l/ae;->f:Lkik/a/e/v;

    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lkik/a/e/v;->h(Ljava/lang/String;)V

    goto :goto_0

    .line 158
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    .line 155
    :catchall_1
    move-exception v0

    :try_start_5
    iget-object v1, p0, Lcom/kik/l/ae;->f:Lkik/a/e/v;

    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lkik/a/e/v;->h(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
.end method

.method public final c(Lkik/a/d/s;)Z
    .locals 11

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 163
    iget-object v3, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v3

    .line 164
    :try_start_0
    iget-object v0, p0, Lcom/kik/l/ae;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    .line 166
    const-class v0, Lkik/a/d/a/a;

    invoke-static {p1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 167
    if-eqz v0, :cond_1

    .line 168
    invoke-static {v0}, Lcom/kik/l/o;->a(Lkik/a/d/a/a;)Ljava/util/ArrayList;

    move-result-object v0

    .line 169
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 171
    :try_start_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ContentValues;

    .line 172
    const-string v6, "KIKContentTable"

    const-string v7, "content_id = ? AND content_type = ? AND content_name = ?"

    const/4 v8, 0x3

    new-array v8, v8, [Ljava/lang/String;

    const/4 v9, 0x0

    const-string v10, "content_id"

    invoke-virtual {v0, v10}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x1

    const-string v10, "content_type"

    invoke-virtual {v0, v10}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x2

    const-string v10, "content_name"

    invoke-virtual {v0, v10}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-virtual {v4, v6, v0, v7, v8}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 178
    :catchall_0
    move-exception v0

    :try_start_2
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 198
    :catchall_1
    move-exception v0

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 175
    :cond_0
    :try_start_3
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 178
    :try_start_4
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 183
    :cond_1
    :try_start_5
    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v5

    .line 184
    if-eqz v5, :cond_2

    .line 185
    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "1"

    .line 186
    :goto_1
    invoke-static {p1}, Lcom/kik/l/ad;->a(Lkik/a/d/s;)Landroid/content/ContentValues;

    move-result-object v6

    .line 187
    const-string v7, "messagesTable"

    const-string v8, "uid = ? AND was_me = ?"

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/String;

    const/4 v10, 0x0

    aput-object v5, v9, v10

    const/4 v5, 0x1

    aput-object v0, v9, v5

    invoke-virtual {v4, v7, v6, v8, v9}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :cond_2
    move v0, v1

    .line 197
    :goto_2
    :try_start_6
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    return v0

    .line 185
    :cond_3
    :try_start_7
    const-string v0, "0"
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_1

    .line 190
    :catch_0
    move-exception v0

    .line 191
    :try_start_8
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "KikMessage update failed: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :cond_4
    move v0, v2

    .line 196
    goto :goto_2

    .line 194
    :catchall_2
    move-exception v0

    :try_start_9
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1
.end method
