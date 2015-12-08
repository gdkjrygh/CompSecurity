.class public Lcom/cleanmaster/ui/app/market/storage/MarketStorage;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z

.field private static b:Lcom/cleanmaster/ui/app/market/storage/MarketStorage;


# instance fields
.field private c:Lcom/cleanmaster/ui/app/market/storage/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    sput-boolean v0, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a:Z

    .line 31
    new-instance v0, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;-><init>()V

    sput-object v0, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->b:Lcom/cleanmaster/ui/app/market/storage/MarketStorage;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 51
    new-instance v1, Lcom/cleanmaster/ui/app/market/storage/a;

    invoke-direct {v1, v0}, Lcom/cleanmaster/ui/app/market/storage/a;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->c:Lcom/cleanmaster/ui/app/market/storage/a;

    .line 53
    return-void
.end method

.method public static a()Lcom/cleanmaster/ui/app/market/storage/MarketStorage;
    .locals 1

    .prologue
    .line 56
    sget-object v0, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->b:Lcom/cleanmaster/ui/app/market/storage/MarketStorage;

    return-object v0
.end method

.method public static a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 117
    .line 119
    :try_start_0
    const-string v3, "SELECT * FROM sqlite_master WHERE type=\'table\' AND name=\'%s\';"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {p0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 120
    if-eqz v2, :cond_1

    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v3

    if-lez v3, :cond_1

    .line 124
    :goto_0
    if-eqz v2, :cond_0

    .line 125
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 128
    :cond_0
    :goto_1
    return v0

    :cond_1
    move v0, v1

    .line 120
    goto :goto_0

    .line 124
    :catch_0
    move-exception v0

    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_2

    .line 125
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_2
    move v0, v1

    goto :goto_1

    .line 124
    :catchall_0
    move-exception v0

    if-eqz v2, :cond_3

    .line 125
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v0

    .line 124
    :catch_1
    move-exception v0

    move-object v0, v2

    goto :goto_2
.end method

.method private c()Landroid/database/sqlite/SQLiteDatabase;
    .locals 2

    .prologue
    .line 563
    const/4 v0, 0x0

    .line 565
    :try_start_0
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->c:Lcom/cleanmaster/ui/app/market/storage/a;

    invoke-virtual {v1}, Lcom/cleanmaster/ui/app/market/storage/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 569
    :goto_0
    return-object v0

    .line 566
    :catch_0
    move-exception v1

    .line 567
    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;Ljava/util/List;)I
    .locals 10

    .prologue
    .line 372
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->c()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 373
    if-nez v2, :cond_0

    .line 374
    const/4 v1, -0x1

    .line 399
    :goto_0
    monitor-exit p0

    return v1

    .line 376
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "tbl_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v3

    .line 380
    const/4 v1, 0x0

    .line 382
    :try_start_2
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 383
    invoke-static {v2, v3}, Lcom/cleanmaster/ui/app/market/Ad;->createTable(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 384
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/Ad;

    .line 385
    const-string v5, ""

    invoke-virtual {v0, p1}, Lcom/cleanmaster/ui/app/market/Ad;->toContentValues(Ljava/lang/String;)Landroid/content/ContentValues;

    move-result-object v0

    invoke-virtual {v2, v3, v5, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v0, v6, v8

    if-lez v0, :cond_2

    .line 386
    add-int/lit8 v0, v1, 0x1

    :goto_2
    move v1, v0

    .line 388
    goto :goto_1

    .line 389
    :cond_1
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 394
    :try_start_3
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 395
    :catch_0
    move-exception v0

    .line 396
    :try_start_4
    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(Ljava/lang/Exception;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 372
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 390
    :catch_1
    move-exception v0

    .line 391
    :try_start_5
    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(Ljava/lang/Exception;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 394
    :try_start_6
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_0

    .line 395
    :catch_2
    move-exception v0

    .line 396
    :try_start_7
    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(Ljava/lang/Exception;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_0

    .line 393
    :catchall_1
    move-exception v0

    .line 394
    :try_start_8
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 397
    :goto_3
    :try_start_9
    throw v0

    .line 395
    :catch_3
    move-exception v1

    .line 396
    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(Ljava/lang/Exception;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_3

    :cond_2
    move v0, v1

    goto :goto_2
.end method

.method public declared-synchronized a(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/data/MarketResponse;)J
    .locals 8

    .prologue
    const-wide/16 v0, -0x1

    .line 219
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->c()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 220
    if-nez v2, :cond_1

    .line 235
    :cond_0
    :goto_0
    monitor-exit p0

    return-wide v0

    .line 225
    :cond_1
    :try_start_1
    invoke-virtual {p2}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->getHeader()Lcom/cleanmaster/ui/app/market/data/a;

    move-result-object v3

    iput-object p1, v3, Lcom/cleanmaster/ui/app/market/data/a;->h:Ljava/lang/String;

    .line 226
    invoke-virtual {p2}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->getHeader()Lcom/cleanmaster/ui/app/market/data/a;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/cleanmaster/ui/app/market/data/a;->a(Ljava/lang/String;)Landroid/content/ContentValues;

    move-result-object v3

    .line 227
    const-string v4, "tbl_market_globel_property"

    const-string v5, "pos_id = ?"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/String;

    const/4 v7, 0x0

    aput-object p1, v6, v7

    invoke-virtual {v2, v4, v3, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    .line 228
    const-wide/16 v4, 0x0

    cmp-long v4, v0, v4

    if-nez v4, :cond_0

    .line 230
    const-string v4, "tbl_market_globel_property"

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5, v3}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-wide v0

    goto :goto_0

    .line 232
    :catch_0
    move-exception v2

    .line 233
    :try_start_2
    invoke-virtual {p0, v2}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(Ljava/lang/Exception;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 219
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 10

    .prologue
    const/4 v9, 0x0

    .line 482
    monitor-enter p0

    :try_start_0
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 483
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->c()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 484
    if-nez v0, :cond_0

    move-object v0, v8

    .line 514
    :goto_0
    monitor-exit p0

    return-object v0

    .line 488
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "tbl_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 489
    invoke-static {v0, v1}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v2

    if-nez v2, :cond_1

    move-object v0, v8

    .line 490
    goto :goto_0

    .line 494
    :cond_1
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    :try_start_2
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v1

    .line 495
    if-eqz v1, :cond_3

    :try_start_3
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 496
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 498
    :cond_2
    new-instance v0, Lcom/cleanmaster/ui/app/market/Ad;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/Ad;-><init>()V

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->fromCursor(Landroid/database/Cursor;)Lcom/cleanmaster/ui/app/market/Ad;

    move-result-object v0

    .line 499
    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 500
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-result v0

    if-nez v0, :cond_2

    .line 505
    :cond_3
    if-eqz v1, :cond_4

    .line 506
    :try_start_4
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 510
    :cond_4
    :goto_1
    invoke-static {p1}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->isAppRequest(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 511
    invoke-static {v8}, Lcom/cleanmaster/ui/app/market/d;->a(Ljava/util/List;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_5
    move-object v0, v8

    .line 514
    goto :goto_0

    .line 502
    :catch_0
    move-exception v0

    move-object v1, v9

    .line 503
    :goto_2
    :try_start_5
    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(Ljava/lang/Exception;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 505
    if-eqz v1, :cond_4

    .line 506
    :try_start_6
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_1

    .line 482
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 505
    :catchall_1
    move-exception v0

    move-object v1, v9

    :goto_3
    if-eqz v1, :cond_6

    .line 506
    :try_start_7
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_6
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 505
    :catchall_2
    move-exception v0

    goto :goto_3

    .line 502
    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method public a(Ljava/lang/Exception;)V
    .locals 1

    .prologue
    .line 676
    sget-boolean v0, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a:Z

    if-eqz v0, :cond_0

    .line 677
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 679
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 681
    return-void
.end method

.method public declared-synchronized a(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 239
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->c()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 240
    if-nez v0, :cond_0

    .line 248
    :goto_0
    monitor-exit p0

    return-void

    .line 244
    :cond_0
    :try_start_1
    const-string v1, "tbl_market_globel_property"

    const-string v2, "pos_id = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 246
    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 239
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(J)Z
    .locals 13

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 651
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->b()Ljava/util/ArrayList;

    move-result-object v2

    .line 652
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->c()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 653
    if-nez v3, :cond_0

    .line 672
    :goto_0
    monitor-exit p0

    return v0

    .line 656
    :cond_0
    :try_start_1
    new-instance v4, Lclient/core/model/a;

    invoke-direct {v4}, Lclient/core/model/a;-><init>()V

    .line 658
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 660
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/data/a;

    .line 661
    iget-wide v8, v0, Lcom/cleanmaster/ui/app/market/data/a;->g:J

    sub-long v8, v6, v8

    cmp-long v5, v8, p1

    if-lez v5, :cond_1

    .line 662
    invoke-virtual {v4}, Lclient/core/model/a;->a()Lclient/core/model/a;

    move-result-object v5

    const-string v8, "removeRecentCache"

    invoke-virtual {v5, v8}, Lclient/core/model/a;->a(Ljava/lang/String;)Lclient/core/model/a;

    .line 663
    iget-object v5, v0, Lcom/cleanmaster/ui/app/market/data/a;->h:Ljava/lang/String;

    .line 1111
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "tbl_"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/cleanmaster/ui/app/market/storage/a;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 664
    const-string v5, "START DROP \'%s\' (EXPIRED=%d)"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    iget-object v10, v0, Lcom/cleanmaster/ui/app/market/data/a;->h:Ljava/lang/String;

    aput-object v10, v8, v9

    const/4 v9, 0x1

    iget-wide v10, v0, Lcom/cleanmaster/ui/app/market/data/a;->g:J

    sub-long v10, v6, v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v5, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lclient/core/model/a;->a(Ljava/lang/String;)Lclient/core/model/a;

    .line 665
    iget-object v5, v0, Lcom/cleanmaster/ui/app/market/data/a;->h:Ljava/lang/String;

    invoke-virtual {p0, v5}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(Ljava/lang/String;)V

    .line 666
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, "deleteMarketResponseHeader("

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lcom/cleanmaster/ui/app/market/data/a;->h:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ")"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lclient/core/model/a;->a(Ljava/lang/String;)Lclient/core/model/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 651
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_2
    move v0, v1

    .line 672
    goto :goto_0
.end method

.method public declared-synchronized b()Ljava/util/ArrayList;
    .locals 10

    .prologue
    const/4 v9, 0x0

    .line 620
    monitor-enter p0

    :try_start_0
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 621
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->c()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 622
    if-nez v0, :cond_0

    move-object v0, v8

    .line 642
    :goto_0
    monitor-exit p0

    return-object v0

    .line 628
    :cond_0
    :try_start_1
    const-string v1, "tbl_market_globel_property"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v1

    .line 629
    if-eqz v1, :cond_2

    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 630
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 632
    :cond_1
    new-instance v0, Lcom/cleanmaster/ui/app/market/data/a;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/data/a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/data/a;->a(Landroid/database/Cursor;)Lcom/cleanmaster/ui/app/market/data/a;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 633
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result v0

    if-nez v0, :cond_1

    .line 638
    :cond_2
    if-eqz v1, :cond_3

    .line 639
    :try_start_3
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_3
    :goto_1
    move-object v0, v8

    .line 642
    goto :goto_0

    .line 635
    :catch_0
    move-exception v0

    move-object v1, v9

    .line 636
    :goto_2
    :try_start_4
    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(Ljava/lang/Exception;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 638
    if-eqz v1, :cond_3

    .line 639
    :try_start_5
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1

    .line 620
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 638
    :catchall_1
    move-exception v0

    move-object v1, v9

    :goto_3
    if-eqz v1, :cond_4

    .line 639
    :try_start_6
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_4
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 638
    :catchall_2
    move-exception v0

    goto :goto_3

    .line 635
    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method public declared-synchronized b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 431
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "tbl_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 433
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->c()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 434
    if-nez v1, :cond_0

    .line 439
    :goto_0
    monitor-exit p0

    return-void

    .line 438
    :cond_0
    :try_start_1
    invoke-static {v1, v0}, Lcom/cleanmaster/ui/app/market/storage/a;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 431
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c(Ljava/lang/String;)I
    .locals 10

    .prologue
    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 454
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->c()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 455
    if-nez v0, :cond_1

    move v0, v8

    .line 478
    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    .line 458
    :cond_1
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "tbl_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 459
    invoke-static {v0, v1}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    move v0, v8

    .line 460
    goto :goto_0

    .line 464
    :cond_2
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "_id"

    aput-object v4, v2, v3

    .line 465
    const-string v3, "_id"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 467
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :try_start_2
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v1

    .line 468
    if-eqz v1, :cond_3

    :try_start_3
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 469
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-result v0

    .line 474
    if-eqz v1, :cond_0

    .line 475
    :try_start_4
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 454
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 474
    :cond_3
    if-eqz v1, :cond_4

    .line 475
    :try_start_5
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_4
    :goto_1
    move v0, v8

    .line 478
    goto :goto_0

    .line 471
    :catch_0
    move-exception v0

    move-object v1, v9

    .line 472
    :goto_2
    :try_start_6
    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(Ljava/lang/Exception;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 474
    if-eqz v1, :cond_4

    .line 475
    :try_start_7
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 474
    :catchall_1
    move-exception v0

    move-object v1, v9

    :goto_3
    if-eqz v1, :cond_5

    .line 475
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_5
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 474
    :catchall_2
    move-exception v0

    goto :goto_3

    .line 471
    :catch_1
    move-exception v0

    goto :goto_2
.end method
