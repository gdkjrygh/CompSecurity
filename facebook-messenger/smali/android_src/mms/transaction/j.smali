.class public Landroid_src/mms/transaction/j;
.super Landroid_src/mms/transaction/r;
.source "NotificationTransaction.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Landroid/net/Uri;

.field private f:Landroid_src/mms/e/h;

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILandroid_src/mms/transaction/w;Landroid_src/mms/e/h;)V
    .locals 3

    .prologue
    .line 103
    invoke-direct {p0, p1, p2, p3}, Landroid_src/mms/transaction/r;-><init>(Landroid/content/Context;ILandroid_src/mms/transaction/w;)V

    .line 106
    :try_start_0
    invoke-static {p1}, Landroid_src/mms/e/t;->a(Landroid/content/Context;)Landroid_src/mms/e/t;

    move-result-object v0

    sget-object v1, Landroid_src/c/f;->a:Landroid/net/Uri;

    invoke-virtual {v0, p4, v1}, Landroid_src/mms/e/t;->a(Landroid_src/mms/e/f;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Landroid_src/mms/transaction/j;->a:Landroid/net/Uri;
    :try_end_0
    .catch Landroid_src/mms/d; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    iput-object p4, p0, Landroid_src/mms/transaction/j;->f:Landroid_src/mms/e/h;

    .line 114
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p4}, Landroid_src/mms/e/h;->k()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    iput-object v0, p0, Landroid_src/mms/transaction/j;->c:Ljava/lang/String;

    .line 115
    return-void

    .line 108
    :catch_0
    move-exception v0

    .line 109
    const-string v1, "fb-mms:NotificationTransaction"

    const-string v2, "Failed to save NotificationInd in constructor."

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 110
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method

.method public constructor <init>(Landroid/content/Context;ILandroid_src/mms/transaction/w;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 78
    invoke-direct {p0, p1, p2, p3}, Landroid_src/mms/transaction/r;-><init>(Landroid/content/Context;ILandroid_src/mms/transaction/w;)V

    .line 80
    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Landroid_src/mms/transaction/j;->a:Landroid/net/Uri;

    .line 83
    :try_start_0
    invoke-static {p1}, Landroid_src/mms/e/t;->a(Landroid/content/Context;)Landroid_src/mms/e/t;

    move-result-object v0

    iget-object v1, p0, Landroid_src/mms/transaction/j;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid_src/mms/e/t;->a(Landroid/net/Uri;)Landroid_src/mms/e/f;

    move-result-object v0

    check-cast v0, Landroid_src/mms/e/h;

    iput-object v0, p0, Landroid_src/mms/transaction/j;->f:Landroid_src/mms/e/h;
    :try_end_0
    .catch Landroid_src/mms/d; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Landroid_src/mms/transaction/j;->f:Landroid_src/mms/e/h;

    invoke-virtual {v1}, Landroid_src/mms/e/h;->k()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    iput-object v0, p0, Landroid_src/mms/transaction/j;->c:Ljava/lang/String;

    .line 91
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Landroid_src/mms/transaction/j;->f:Landroid_src/mms/e/h;

    invoke-virtual {v1}, Landroid_src/mms/e/h;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    iput-object v0, p0, Landroid_src/mms/transaction/j;->g:Ljava/lang/String;

    .line 94
    invoke-static {p1}, Landroid_src/mms/transaction/p;->a(Landroid/content/Context;)Landroid_src/mms/transaction/p;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid_src/mms/transaction/j;->a(Landroid_src/mms/transaction/l;)V

    .line 95
    return-void

    .line 85
    :catch_0
    move-exception v0

    .line 86
    const-string v1, "fb-mms:NotificationTransaction"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to load NotificationInd from: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method

.method private a(I)V
    .locals 3

    .prologue
    .line 232
    new-instance v0, Landroid_src/mms/e/i;

    const/16 v1, 0x12

    iget-object v2, p0, Landroid_src/mms/transaction/j;->f:Landroid_src/mms/e/h;

    invoke-virtual {v2}, Landroid_src/mms/e/h;->k()[B

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Landroid_src/mms/e/i;-><init>(I[BI)V

    .line 238
    invoke-static {}, Landroid_src/mms/c;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 239
    new-instance v1, Landroid_src/mms/e/k;

    iget-object v2, p0, Landroid_src/mms/transaction/j;->b:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Landroid_src/mms/e/k;-><init>(Landroid/content/Context;Landroid_src/mms/e/f;)V

    invoke-virtual {v1}, Landroid_src/mms/e/k;->a()[B

    move-result-object v0

    iget-object v1, p0, Landroid_src/mms/transaction/j;->g:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Landroid_src/mms/transaction/j;->a([BLjava/lang/String;)[B

    .line 243
    :goto_0
    return-void

    .line 241
    :cond_0
    new-instance v1, Landroid_src/mms/e/k;

    iget-object v2, p0, Landroid_src/mms/transaction/j;->b:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Landroid_src/mms/e/k;-><init>(Landroid/content/Context;Landroid_src/mms/e/f;)V

    invoke-virtual {v1}, Landroid_src/mms/e/k;->a()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid_src/mms/transaction/j;->a([B)[B

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 123
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 124
    return-void
.end method

.method public b()I
    .locals 1

    .prologue
    .line 247
    const/4 v0, 0x0

    return v0
.end method

.method public run()V
    .locals 12

    .prologue
    const/16 v0, 0x84

    const/16 v6, 0x81

    const/4 v2, 0x0

    const/4 v11, 0x2

    const/4 v10, 0x1

    .line 128
    invoke-static {}, Landroid_src/mms/g/d;->b()Landroid_src/mms/g/d;

    move-result-object v3

    .line 129
    invoke-virtual {v3}, Landroid_src/mms/g/d;->a()Z

    move-result v7

    .line 141
    const/16 v1, 0x83

    .line 143
    if-eqz v7, :cond_3

    .line 149
    :try_start_0
    iget-object v4, p0, Landroid_src/mms/transaction/j;->a:Landroid/net/Uri;

    const/16 v5, 0x81

    invoke-virtual {v3, v4, v5}, Landroid_src/mms/g/d;->a(Landroid/net/Uri;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    :try_start_1
    iget-object v3, p0, Landroid_src/mms/transaction/j;->g:Ljava/lang/String;

    invoke-virtual {p0, v3}, Landroid_src/mms/transaction/j;->a(Ljava/lang/String;)[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v2

    .line 164
    :goto_0
    if-eqz v2, :cond_d

    .line 165
    :try_start_2
    new-instance v1, Landroid_src/mms/e/r;

    invoke-direct {v1, v2}, Landroid_src/mms/e/r;-><init>([B)V

    invoke-virtual {v1}, Landroid_src/mms/e/r;->a()Landroid_src/mms/e/f;

    move-result-object v1

    .line 166
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid_src/mms/e/f;->f()I

    move-result v2

    if-eq v2, v0, :cond_8

    .line 167
    :cond_0
    const-string v2, "fb-mms:NotificationTransaction"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid M-RETRIEVE.CONF PDU. "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    if-eqz v1, :cond_7

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "message type: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Landroid_src/mms/e/f;->f()I

    move-result v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    iget-object v1, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid_src/mms/transaction/x;->a(I)V

    .line 197
    :goto_2
    packed-switch v0, :pswitch_data_0

    .line 209
    :cond_1
    :goto_3
    :pswitch_0
    invoke-direct {p0, v0}, Landroid_src/mms/transaction/j;->a(I)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 216
    iget-object v0, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    iget-object v1, p0, Landroid_src/mms/transaction/j;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid_src/mms/transaction/x;->a(Landroid/net/Uri;)V

    .line 217
    if-eqz v7, :cond_a

    .line 222
    :goto_4
    iget-object v0, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v0}, Landroid_src/mms/transaction/x;->a()I

    move-result v0

    if-eq v0, v10, :cond_2

    .line 223
    iget-object v0, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v0, v11}, Landroid_src/mms/transaction/x;->a(I)V

    .line 224
    const-string v0, "fb-mms:NotificationTransaction"

    const-string v1, "NotificationTransaction failed."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    :cond_2
    invoke-virtual {p0}, Landroid_src/mms/transaction/j;->c()V

    .line 228
    :goto_5
    return-void

    .line 144
    :cond_3
    :try_start_3
    iget-object v0, p0, Landroid_src/mms/transaction/j;->a:Landroid/net/Uri;

    const/16 v2, 0x80

    invoke-virtual {v3, v0, v2}, Landroid_src/mms/g/d;->a(Landroid/net/Uri;I)V

    .line 145
    invoke-direct {p0, v1}, Landroid_src/mms/transaction/j;->a(I)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 216
    iget-object v0, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    iget-object v1, p0, Landroid_src/mms/transaction/j;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid_src/mms/transaction/x;->a(Landroid/net/Uri;)V

    .line 217
    if-eqz v7, :cond_5

    .line 222
    :goto_6
    iget-object v0, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v0}, Landroid_src/mms/transaction/x;->a()I

    move-result v0

    if-eq v0, v10, :cond_4

    .line 223
    iget-object v0, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v0, v11}, Landroid_src/mms/transaction/x;->a(I)V

    .line 224
    const-string v0, "fb-mms:NotificationTransaction"

    const-string v1, "NotificationTransaction failed."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    :cond_4
    invoke-virtual {p0}, Landroid_src/mms/transaction/j;->c()V

    goto :goto_5

    .line 220
    :cond_5
    iget-object v0, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v0, v10}, Landroid_src/mms/transaction/x;->a(I)V

    goto :goto_6

    .line 160
    :catch_0
    move-exception v3

    .line 161
    :try_start_4
    iget-object v3, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Landroid_src/mms/transaction/x;->a(I)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    .line 213
    :catch_1
    move-exception v0

    .line 214
    :try_start_5
    const-string v1, "fb-mms:NotificationTransaction"

    const-string v2, "Throwable caught in NotificationTransaction"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 216
    iget-object v0, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    iget-object v1, p0, Landroid_src/mms/transaction/j;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid_src/mms/transaction/x;->a(Landroid/net/Uri;)V

    .line 217
    if-eqz v7, :cond_b

    .line 222
    :goto_7
    iget-object v0, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v0}, Landroid_src/mms/transaction/x;->a()I

    move-result v0

    if-eq v0, v10, :cond_6

    .line 223
    iget-object v0, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v0, v11}, Landroid_src/mms/transaction/x;->a(I)V

    .line 224
    const-string v0, "fb-mms:NotificationTransaction"

    const-string v1, "NotificationTransaction failed."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    :cond_6
    invoke-virtual {p0}, Landroid_src/mms/transaction/j;->c()V

    goto :goto_5

    .line 167
    :cond_7
    :try_start_6
    const-string v1, "null pdu"

    goto/16 :goto_1

    .line 173
    :cond_8
    iget-object v0, p0, Landroid_src/mms/transaction/j;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid_src/mms/e/t;->a(Landroid/content/Context;)Landroid_src/mms/e/t;

    move-result-object v0

    .line 174
    sget-object v2, Landroid_src/c/f;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1, v2}, Landroid_src/mms/e/t;->a(Landroid_src/mms/e/f;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v2

    .line 177
    new-instance v3, Landroid/content/ContentValues;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 178
    const-string v0, "date"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v8, 0x3e8

    div-long/2addr v4, v8

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 179
    iget-object v0, p0, Landroid_src/mms/transaction/j;->b:Landroid/content/Context;

    iget-object v1, p0, Landroid_src/mms/transaction/j;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 184
    iget-object v0, p0, Landroid_src/mms/transaction/j;->b:Landroid/content/Context;

    iget-object v1, p0, Landroid_src/mms/transaction/j;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    iget-object v3, p0, Landroid_src/mms/transaction/j;->a:Landroid/net/Uri;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v0, v1, v3, v4, v5}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 187
    iput-object v2, p0, Landroid_src/mms/transaction/j;->a:Landroid/net/Uri;

    move v0, v6

    .line 188
    goto/16 :goto_2

    .line 199
    :pswitch_1
    iget-object v1, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid_src/mms/transaction/x;->a(I)V
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto/16 :goto_3

    .line 216
    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    iget-object v2, p0, Landroid_src/mms/transaction/j;->a:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Landroid_src/mms/transaction/x;->a(Landroid/net/Uri;)V

    .line 217
    if-eqz v7, :cond_c

    .line 222
    :goto_8
    iget-object v1, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1}, Landroid_src/mms/transaction/x;->a()I

    move-result v1

    if-eq v1, v10, :cond_9

    .line 223
    iget-object v1, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1, v11}, Landroid_src/mms/transaction/x;->a(I)V

    .line 224
    const-string v1, "fb-mms:NotificationTransaction"

    const-string v2, "NotificationTransaction failed."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    :cond_9
    invoke-virtual {p0}, Landroid_src/mms/transaction/j;->c()V

    throw v0

    .line 203
    :pswitch_2
    :try_start_7
    iget-object v1, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1}, Landroid_src/mms/transaction/x;->a()I

    move-result v1

    if-nez v1, :cond_1

    .line 204
    iget-object v1, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid_src/mms/transaction/x;->a(I)V
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_3

    .line 220
    :cond_a
    iget-object v0, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v0, v10}, Landroid_src/mms/transaction/x;->a(I)V

    goto/16 :goto_4

    :cond_b
    iget-object v0, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v0, v10}, Landroid_src/mms/transaction/x;->a(I)V

    goto/16 :goto_7

    :cond_c
    iget-object v1, p0, Landroid_src/mms/transaction/j;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1, v10}, Landroid_src/mms/transaction/x;->a(I)V

    goto :goto_8

    :cond_d
    move v0, v1

    goto/16 :goto_2

    .line 197
    :pswitch_data_0
    .packed-switch 0x81
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
