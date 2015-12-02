.class public final Lcom/mobvista/sdk/m/core/c/a;
.super Lcom/mobvista/sdk/m/a/a/a/c;
.source "360Security"


# static fields
.field private static b:Lcom/mobvista/sdk/m/core/c/a;


# direct methods
.method private constructor <init>(Lcom/mobvista/sdk/m/a/a/a/a;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lcom/mobvista/sdk/m/a/a/a/c;-><init>(Lcom/mobvista/sdk/m/a/a/a/a;)V

    .line 27
    return-void
.end method

.method public static declared-synchronized a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/a;
    .locals 2

    .prologue
    .line 30
    const-class v1, Lcom/mobvista/sdk/m/core/c/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/mobvista/sdk/m/core/c/a;->b:Lcom/mobvista/sdk/m/core/c/a;

    if-nez v0, :cond_0

    .line 31
    new-instance v0, Lcom/mobvista/sdk/m/core/c/a;

    invoke-direct {v0, p0}, Lcom/mobvista/sdk/m/core/c/a;-><init>(Lcom/mobvista/sdk/m/a/a/a/a;)V

    sput-object v0, Lcom/mobvista/sdk/m/core/c/a;->b:Lcom/mobvista/sdk/m/core/c/a;

    .line 33
    :cond_0
    sget-object v0, Lcom/mobvista/sdk/m/core/c/a;->b:Lcom/mobvista/sdk/m/core/c/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 30
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private declared-synchronized b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 118
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "SELECT id FROM campaignclick WHERE id=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "\' AND "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "unitid= \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 121
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/core/c/a;->c()Lcom/mobvista/sdk/m/a/a/a/c;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/mobvista/sdk/m/a/a/a/c;->a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 122
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 123
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    const/4 v0, 0x1

    .line 127
    :goto_0
    monitor-exit p0

    return v0

    .line 126
    :cond_0
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    const/4 v0, 0x0

    goto :goto_0

    .line 118
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;Ljava/lang/String;)J
    .locals 5

    .prologue
    const-wide/16 v0, 0x0

    .line 53
    monitor-enter p0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getJumpResult()Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    if-nez v2, :cond_1

    .line 74
    :cond_0
    :goto_0
    monitor-exit p0

    return-wide v0

    .line 57
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getJumpResult()Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v2

    invoke-static {v2}, Lcom/mobvista/sdk/m/a/f/h;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 58
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 62
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 63
    const-string/jumbo v1, "id"

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string/jumbo v1, "unitid"

    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const-string/jumbo v1, "result"

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const-string/jumbo v1, "ts"

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getTimestamp()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 68
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Lcom/mobvista/sdk/m/core/c/a;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "id = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " AND unitid"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 71
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/core/c/a;->d()Lcom/mobvista/sdk/m/a/a/a/c;

    move-result-object v2

    const-string/jumbo v3, "campaignclick"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v0, v1, v4}, Lcom/mobvista/sdk/m/a/a/a/c;->a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    goto :goto_0

    .line 74
    :cond_2
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/core/c/a;->d()Lcom/mobvista/sdk/m/a/a/a/c;

    move-result-object v1

    const-string/jumbo v2, "campaignclick"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Lcom/mobvista/sdk/m/a/a/a/c;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-wide v0

    goto/16 :goto_0

    .line 53
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Ljava/lang/String;Ljava/lang/String;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;
    .locals 10

    .prologue
    const/4 v9, 0x0

    .line 92
    monitor-enter p0

    .line 94
    :try_start_0
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/core/c/a;->c()Lcom/mobvista/sdk/m/a/a/a/c;

    move-result-object v0

    const-string/jumbo v1, "campaignclick"

    const/4 v2, 0x0

    const-string/jumbo v3, "id=? AND unitid=?"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x1

    aput-object p2, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v8}, Lcom/mobvista/sdk/m/a/a/a/c;->a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v1

    .line 99
    if-eqz v1, :cond_1

    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 100
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 101
    const-string/jumbo v0, "result"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 102
    invoke-static {v0}, Lcom/mobvista/sdk/m/a/f/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 109
    if-eqz v1, :cond_0

    .line 110
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 114
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    .line 109
    :cond_1
    if-eqz v1, :cond_2

    .line 110
    :try_start_3
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_2
    :goto_1
    move-object v0, v9

    .line 114
    goto :goto_0

    .line 106
    :catch_0
    move-exception v0

    move-object v1, v9

    .line 107
    :goto_2
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 109
    if-eqz v1, :cond_2

    .line 110
    :try_start_5
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1

    .line 92
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 109
    :catchall_1
    move-exception v0

    move-object v1, v9

    :goto_3
    if-eqz v1, :cond_3

    .line 110
    :try_start_6
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 109
    :catchall_2
    move-exception v0

    goto :goto_3

    .line 106
    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method public final declared-synchronized a()V
    .locals 4

    .prologue
    .line 46
    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    sub-long/2addr v0, v2

    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "ts<"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 48
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/core/c/a;->d()Lcom/mobvista/sdk/m/a/a/a/c;

    move-result-object v1

    const-string/jumbo v2, "campaignclick"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/mobvista/sdk/m/a/a/a/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    monitor-exit p0

    return-void

    .line 46
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
