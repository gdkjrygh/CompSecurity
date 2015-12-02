.class public Landroid_src/mms/transaction/p;
.super Ljava/lang/Object;
.source "RetryScheduler.java"

# interfaces
.implements Landroid_src/mms/transaction/l;


# static fields
.field private static c:Landroid_src/mms/transaction/p;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/content/ContentResolver;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    .line 53
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Landroid_src/mms/transaction/p;->b:Landroid/content/ContentResolver;

    .line 54
    return-void
.end method

.method private a(J)I
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 241
    const/4 v7, 0x0

    .line 242
    iget-object v0, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    iget-object v1, p0, Landroid_src/mms/transaction/p;->b:Landroid/content/ContentResolver;

    sget-object v2, Landroid_src/c/g;->a:Landroid/net/Uri;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "_id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v5, v3

    move-object v6, v3

    invoke-static/range {v0 .. v6}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 245
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 246
    const-string v0, "resp_st"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 249
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 251
    if-eqz v0, :cond_0

    .line 252
    const-string v1, "fb-mms:RetryScheduler"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Response status is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    :cond_0
    return v0

    .line 249
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_1
    move v0, v7

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Landroid_src/mms/transaction/p;
    .locals 1

    .prologue
    .line 58
    sget-object v0, Landroid_src/mms/transaction/p;->c:Landroid_src/mms/transaction/p;

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Landroid_src/mms/transaction/p;

    invoke-direct {v0, p0}, Landroid_src/mms/transaction/p;-><init>(Landroid/content/Context;)V

    sput-object v0, Landroid_src/mms/transaction/p;->c:Landroid_src/mms/transaction/p;

    .line 61
    :cond_0
    sget-object v0, Landroid_src/mms/transaction/p;->c:Landroid_src/mms/transaction/p;

    return-object v0
.end method

.method private a(Landroid/net/Uri;)V
    .locals 14

    .prologue
    .line 106
    invoke-static {p1}, Landroid/content/ContentUris;->parseId(Landroid/net/Uri;)J

    move-result-wide v7

    .line 108
    sget-object v0, Landroid_src/c/k;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v2

    .line 109
    const-string v0, "protocol"

    const-string v1, "mms"

    invoke-virtual {v2, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 110
    const-string v0, "message"

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 112
    iget-object v0, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    iget-object v1, p0, Landroid_src/mms/transaction/p;->b:Landroid/content/ContentResolver;

    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 115
    if-eqz v9, :cond_4

    .line 117
    :try_start_0
    invoke-interface {v9}, Landroid/database/Cursor;->getCount()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 118
    const-string v0, "msg_type"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    .line 121
    const-string v0, "retry_index"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    add-int/lit8 v10, v0, 0x1

    .line 125
    const/4 v0, 0x1

    .line 127
    new-instance v4, Landroid_src/mms/transaction/b;

    iget-object v2, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    invoke-direct {v4, v2, v10}, Landroid_src/mms/transaction/b;-><init>(Landroid/content/Context;I)V

    .line 129
    new-instance v11, Landroid/content/ContentValues;

    const/4 v2, 0x4

    invoke-direct {v11, v2}, Landroid/content/ContentValues;-><init>(I)V

    .line 130
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 131
    const/16 v2, 0x82

    if-ne v1, v2, :cond_5

    const/4 v1, 0x1

    move v3, v1

    .line 133
    :goto_0
    const/4 v1, 0x1

    .line 134
    invoke-direct {p0, v7, v8}, Landroid_src/mms/transaction/p;->a(J)I

    move-result v5

    .line 135
    const/4 v2, 0x0

    .line 136
    if-nez v3, :cond_6

    .line 138
    sparse-switch v5, :sswitch_data_0

    .line 154
    :goto_1
    if-eqz v2, :cond_0

    .line 155
    invoke-static {}, Landroid_src/mms/g/d;->b()Landroid_src/mms/g/d;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid_src/mms/g/d;->a(I)V

    .line 156
    const/4 v1, 0x0

    .line 172
    :cond_0
    invoke-virtual {v4}, Landroid_src/mms/transaction/b;->a()I

    move-result v2

    if-ge v10, v2, :cond_7

    if-eqz v1, :cond_7

    .line 173
    invoke-virtual {v4}, Landroid_src/mms/transaction/b;->b()J

    move-result-wide v1

    add-long/2addr v1, v12

    .line 175
    const/4 v4, 0x2

    invoke-static {v4}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 176
    const-string v4, "fb-mms:RetryScheduler"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "scheduleRetry: retry for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " is scheduled at "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long v6, v1, v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "ms from now"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    :cond_1
    const-string v4, "due_time"

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v11, v4, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 182
    if-eqz v3, :cond_2

    .line 184
    invoke-static {}, Landroid_src/mms/g/d;->b()Landroid_src/mms/g/d;

    move-result-object v1

    const/16 v2, 0x82

    invoke-virtual {v1, p1, v2}, Landroid_src/mms/g/d;->a(Landroid/net/Uri;I)V

    .line 221
    :cond_2
    :goto_2
    const-string v1, "err_type"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 222
    const-string v0, "retry_index"

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 223
    const-string v0, "last_try"

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 225
    const-string v0, "_id"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 227
    invoke-interface {v9, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    .line 228
    iget-object v0, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    iget-object v1, p0, Landroid_src/mms/transaction/p;->b:Landroid/content/ContentResolver;

    sget-object v2, Landroid_src/c/k;->a:Landroid/net/Uri;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "_id="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move-object v3, v11

    invoke-static/range {v0 .. v5}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 235
    :cond_3
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 238
    :cond_4
    :goto_3
    return-void

    .line 131
    :cond_5
    const/4 v1, 0x0

    move v3, v1

    goto/16 :goto_0

    .line 140
    :sswitch_0
    :try_start_1
    sget v2, Lcom/facebook/o;->invalid_destination:I

    goto/16 :goto_1

    .line 144
    :sswitch_1
    sget v2, Lcom/facebook/o;->service_not_activated:I

    goto/16 :goto_1

    .line 147
    :sswitch_2
    sget v2, Lcom/facebook/o;->service_network_problem:I

    goto/16 :goto_1

    .line 151
    :sswitch_3
    sget v2, Lcom/facebook/o;->service_message_not_found:I

    goto/16 :goto_1

    .line 161
    :cond_6
    invoke-direct {p0, v7, v8}, Landroid_src/mms/transaction/p;->b(J)I

    move-result v2

    .line 162
    const/16 v5, 0xe4

    if-ne v2, v5, :cond_0

    .line 164
    invoke-static {}, Landroid_src/mms/g/d;->b()Landroid_src/mms/g/d;

    move-result-object v0

    sget v1, Lcom/facebook/o;->service_message_not_found:I

    invoke-virtual {v0, v1}, Landroid_src/mms/g/d;->a(I)V

    .line 166
    iget-object v0, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    iget-object v1, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, p1, v2, v3}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 235
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_3

    .line 188
    :cond_7
    const/16 v7, 0xa

    .line 189
    if-eqz v3, :cond_b

    .line 190
    :try_start_2
    iget-object v0, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    iget-object v1, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v4, "thread_id"

    aput-object v4, v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v0 .. v6}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v2

    .line 193
    const-wide/16 v0, -0x1

    .line 194
    if-eqz v2, :cond_9

    .line 196
    :try_start_3
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 197
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-wide v0

    .line 200
    :cond_8
    :try_start_4
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 204
    :cond_9
    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_a

    .line 206
    iget-object v2, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    invoke-static {v2, v0, v1}, Landroid_src/mms/transaction/d;->a(Landroid/content/Context;J)V

    .line 209
    :cond_a
    invoke-static {}, Landroid_src/mms/g/d;->b()Landroid_src/mms/g/d;

    move-result-object v0

    const/16 v1, 0x87

    invoke-virtual {v0, p1, v1}, Landroid_src/mms/g/d;->a(Landroid/net/Uri;I)V

    move v0, v7

    .line 211
    goto/16 :goto_2

    .line 200
    :catchall_0
    move-exception v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 235
    :catchall_1
    move-exception v0

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    throw v0

    .line 213
    :cond_b
    :try_start_5
    new-instance v3, Landroid/content/ContentValues;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 214
    const-string v0, "read"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 215
    iget-object v0, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    iget-object v1, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v0 .. v5}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 217
    iget-object v0, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid_src/mms/transaction/d;->a(Landroid/content/Context;Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move v0, v7

    goto/16 :goto_2

    .line 138
    nop

    :sswitch_data_0
    .sparse-switch
        0x82 -> :sswitch_1
        0x84 -> :sswitch_0
        0x86 -> :sswitch_2
        0xc2 -> :sswitch_3
        0xe1 -> :sswitch_1
        0xe4 -> :sswitch_3
    .end sparse-switch
.end method

.method private a()Z
    .locals 2

    .prologue
    .line 65
    iget-object v0, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 67
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v0

    .line 68
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    goto :goto_0
.end method

.method private b(J)I
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 259
    const/4 v7, 0x0

    .line 260
    iget-object v0, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    iget-object v1, p0, Landroid_src/mms/transaction/p;->b:Landroid/content/ContentResolver;

    sget-object v2, Landroid_src/c/f;->a:Landroid/net/Uri;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "_id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v5, v3

    move-object v6, v3

    invoke-static/range {v0 .. v6}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 263
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 264
    const-string v0, "resp_st"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 268
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 270
    if-eqz v0, :cond_0

    .line 271
    const/4 v1, 0x2

    invoke-static {v1}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 272
    const-string v1, "fb-mms:RetryScheduler"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Retrieve status is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    :cond_0
    return v0

    .line 268
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_1
    move v0, v7

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 7

    .prologue
    .line 279
    invoke-static {p0}, Landroid_src/mms/e/t;->a(Landroid/content/Context;)Landroid_src/mms/e/t;

    move-result-object v0

    const-wide v1, 0x7fffffffffffffffL

    invoke-virtual {v0, v1, v2}, Landroid_src/mms/e/t;->a(J)Landroid/database/Cursor;

    move-result-object v1

    .line 281
    if-eqz v1, :cond_1

    .line 283
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 285
    const-string v0, "due_time"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    .line 288
    new-instance v0, Landroid/content/Intent;

    const-string v4, "android.intent.action.ACTION_ONALARM"

    const/4 v5, 0x0

    const-class v6, Landroid_src/mms/transaction/TransactionService;

    invoke-direct {v0, v4, v5, p0, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V

    .line 290
    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    invoke-static {p0, v4, v0, v5}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    .line 292
    const-string v0, "alarm"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    .line 294
    const/4 v5, 0x1

    invoke-virtual {v0, v5, v2, v3, v4}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 296
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 297
    const-string v0, "fb-mms:RetryScheduler"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Next retry is scheduled at"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v2, v5

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "ms from now"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 305
    :cond_1
    return-void

    .line 302
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0
.end method


# virtual methods
.method public a(Landroid_src/mms/transaction/k;)V
    .locals 6

    .prologue
    const/4 v5, 0x2

    .line 74
    :try_start_0
    move-object v0, p1

    check-cast v0, Landroid_src/mms/transaction/r;

    move-object v1, v0

    .line 76
    const/4 v2, 0x2

    invoke-static {v2}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 77
    const-string v2, "fb-mms:RetryScheduler"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "[RetryScheduler] update "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    :cond_0
    instance-of v2, v1, Landroid_src/mms/transaction/j;

    if-nez v2, :cond_1

    instance-of v2, v1, Landroid_src/mms/transaction/o;

    if-nez v2, :cond_1

    instance-of v2, v1, Landroid_src/mms/transaction/n;

    if-nez v2, :cond_1

    instance-of v2, v1, Landroid_src/mms/transaction/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_3

    .line 87
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Landroid_src/mms/transaction/r;->d()Landroid_src/mms/transaction/x;

    move-result-object v2

    .line 88
    invoke-virtual {v2}, Landroid_src/mms/transaction/x;->a()I

    move-result v3

    if-ne v3, v5, :cond_2

    .line 89
    invoke-virtual {v2}, Landroid_src/mms/transaction/x;->b()Landroid/net/Uri;

    move-result-object v2

    .line 90
    if-eqz v2, :cond_2

    .line 91
    invoke-direct {p0, v2}, Landroid_src/mms/transaction/p;->a(Landroid/net/Uri;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    :cond_2
    :try_start_2
    invoke-virtual {v1, p0}, Landroid_src/mms/transaction/r;->b(Landroid_src/mms/transaction/l;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 99
    :cond_3
    invoke-direct {p0}, Landroid_src/mms/transaction/p;->a()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 100
    iget-object v1, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    invoke-static {v1}, Landroid_src/mms/transaction/p;->b(Landroid/content/Context;)V

    .line 103
    :cond_4
    return-void

    .line 95
    :catchall_0
    move-exception v2

    :try_start_3
    invoke-virtual {v1, p0}, Landroid_src/mms/transaction/r;->b(Landroid_src/mms/transaction/l;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 99
    :catchall_1
    move-exception v1

    invoke-direct {p0}, Landroid_src/mms/transaction/p;->a()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 100
    iget-object v2, p0, Landroid_src/mms/transaction/p;->a:Landroid/content/Context;

    invoke-static {v2}, Landroid_src/mms/transaction/p;->b(Landroid/content/Context;)V

    :cond_5
    throw v1
.end method
