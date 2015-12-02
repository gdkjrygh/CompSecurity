.class public Lcom/facebook/orca/stickers/e;
.super Ljava/lang/Object;
.source "StickerDbStorage.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final a:[Ljava/lang/String;

.field private static final b:[Ljava/lang/String;


# instance fields
.field private final c:Lcom/facebook/common/time/a;

.field private final d:Lcom/facebook/orca/stickers/ak;

.field private final e:Lcom/facebook/orca/stickers/k;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 31
    new-array v0, v3, [Ljava/lang/String;

    const-string v1, "list"

    aput-object v1, v0, v2

    sput-object v0, Lcom/facebook/orca/stickers/e;->a:[Ljava/lang/String;

    .line 35
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "serialized_list"

    aput-object v1, v0, v2

    const-string v1, "last_fetch_time_ms"

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/stickers/e;->b:[Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/facebook/common/time/a;Lcom/facebook/orca/stickers/ak;Lcom/facebook/orca/stickers/k;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/facebook/orca/stickers/e;->c:Lcom/facebook/common/time/a;

    .line 49
    iput-object p2, p0, Lcom/facebook/orca/stickers/e;->d:Lcom/facebook/orca/stickers/ak;

    .line 50
    iput-object p3, p0, Lcom/facebook/orca/stickers/e;->e:Lcom/facebook/orca/stickers/k;

    .line 51
    return-void
.end method

.method private b(Lcom/facebook/orca/server/v;)I
    .locals 3

    .prologue
    .line 124
    sget-object v0, Lcom/facebook/orca/stickers/f;->a:[I

    invoke-virtual {p1}, Lcom/facebook/orca/server/v;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 132
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown sticker pack type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 126
    :pswitch_0
    const/4 v0, 0x0

    .line 129
    :goto_0
    return v0

    :pswitch_1
    const/4 v0, 0x1

    goto :goto_0

    .line 124
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method declared-synchronized a(Lcom/facebook/orca/server/v;)Lcom/facebook/orca/server/FetchStickerPacksResult;
    .locals 8

    .prologue
    .line 55
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/e;->b(Lcom/facebook/orca/server/v;)I

    move-result v5

    .line 58
    iget-object v0, p0, Lcom/facebook/orca/stickers/e;->d:Lcom/facebook/orca/stickers/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/ak;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 59
    const-string v1, "pack_lists"

    sget-object v2, Lcom/facebook/orca/stickers/e;->b:[Ljava/lang/String;

    const-string v3, "type = ? "

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v6, 0x0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, ""

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 69
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 70
    const-string v0, "serialized_list"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 72
    iget-object v1, p0, Lcom/facebook/orca/stickers/e;->e:Lcom/facebook/orca/stickers/k;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/stickers/k;->a(Ljava/lang/String;)Lcom/google/common/a/es;

    move-result-object v3

    .line 74
    const-string v0, "last_fetch_time_ms"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    .line 76
    iget-object v0, p0, Lcom/facebook/orca/stickers/e;->c:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    sub-long/2addr v0, v4

    const-wide/32 v6, 0x5265c00

    cmp-long v0, v0, v6

    if-gtz v0, :cond_0

    sget-object v0, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    move-object v1, v0

    .line 80
    :goto_0
    new-instance v0, Lcom/facebook/orca/server/FetchStickerPacksResult;

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/facebook/orca/server/FetchStickerPacksResult;-><init>(Lcom/facebook/fbservice/c/b;Ljava/util/List;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    monitor-exit p0

    return-object v0

    .line 76
    :cond_0
    :try_start_3
    sget-object v0, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    move-object v1, v0

    goto :goto_0

    .line 86
    :cond_1
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v1

    .line 87
    new-instance v0, Lcom/facebook/orca/server/FetchStickerPacksResult;

    sget-object v3, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    const-wide/16 v4, -0x1

    invoke-direct {v0, v3, v1, v4, v5}, Lcom/facebook/orca/server/FetchStickerPacksResult;-><init>(Lcom/facebook/fbservice/c/b;Ljava/util/List;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 90
    :try_start_4
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1

    .line 55
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 90
    :catchall_1
    move-exception v0

    :try_start_5
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
.end method

.method declared-synchronized a()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/stickers/Sticker;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v8, 0x0

    .line 138
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/stickers/e;->d:Lcom/facebook/orca/stickers/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/ak;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 139
    const-string v1, "recent_stickers"

    sget-object v2, Lcom/facebook/orca/stickers/e;->a:[Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v1

    .line 149
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    const-string v0, "list"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 152
    iget-object v2, p0, Lcom/facebook/orca/stickers/e;->e:Lcom/facebook/orca/stickers/k;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/stickers/k;->b(Ljava/lang/String;)Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 155
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 158
    :goto_0
    monitor-exit p0

    return-object v0

    .line 155
    :cond_0
    :try_start_3
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    move-object v0, v8

    .line 158
    goto :goto_0

    .line 155
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 138
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Lcom/facebook/orca/server/v;Lcom/facebook/orca/server/FetchStickerPacksResult;)V
    .locals 8

    .prologue
    .line 97
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/e;->b(Lcom/facebook/orca/server/v;)I

    move-result v0

    .line 98
    iget-object v1, p0, Lcom/facebook/orca/stickers/e;->e:Lcom/facebook/orca/stickers/k;

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchStickerPacksResult;->a()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/stickers/k;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    .line 101
    iget-object v2, p0, Lcom/facebook/orca/stickers/e;->d:Lcom/facebook/orca/stickers/ak;

    invoke-virtual {v2}, Lcom/facebook/orca/stickers/ak;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 102
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 103
    const-string v4, "type"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 104
    const-string v4, "serialized_list"

    invoke-virtual {v3, v4, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    const-string v1, "last_fetch_time_ms"

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchStickerPacksResult;->f()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 108
    const-string v1, "pack_lists"

    const-string v4, "type = ? "

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v7, ""

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v6

    invoke-virtual {v2, v1, v3, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 115
    if-nez v0, :cond_0

    .line 116
    const-string v0, "pack_lists"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    :cond_0
    monitor-exit p0

    return-void

    .line 97
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/stickers/Sticker;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 162
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/stickers/e;->e:Lcom/facebook/orca/stickers/k;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/stickers/k;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    .line 165
    iget-object v1, p0, Lcom/facebook/orca/stickers/e;->d:Lcom/facebook/orca/stickers/ak;

    invoke-virtual {v1}, Lcom/facebook/orca/stickers/ak;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 166
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 167
    const-string v3, "list"

    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    const-string v0, "recent_stickers"

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {v1, v0, v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 175
    if-eqz v0, :cond_0

    .line 181
    :goto_0
    monitor-exit p0

    return-void

    .line 180
    :cond_0
    :try_start_1
    const-string v0, "recent_stickers"

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3, v2}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 162
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 1

    .prologue
    .line 184
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/stickers/e;->d:Lcom/facebook/orca/stickers/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/ak;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    monitor-exit p0

    return-void

    .line 184
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
