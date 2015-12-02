.class public Landroid_src/mms/transaction/q;
.super Landroid_src/mms/transaction/r;
.source "SendTransaction.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Ljava/lang/Thread;

.field private final f:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILandroid_src/mms/transaction/w;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 65
    invoke-direct {p0, p1, p2, p3}, Landroid_src/mms/transaction/r;-><init>(Landroid/content/Context;ILandroid_src/mms/transaction/w;)V

    .line 66
    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Landroid_src/mms/transaction/q;->f:Landroid/net/Uri;

    .line 67
    iput-object p4, p0, Landroid_src/mms/transaction/q;->c:Ljava/lang/String;

    .line 70
    invoke-static {p1}, Landroid_src/mms/transaction/p;->a(Landroid/content/Context;)Landroid_src/mms/transaction/p;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid_src/mms/transaction/q;->a(Landroid_src/mms/transaction/l;)V

    .line 71
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 79
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Landroid_src/mms/transaction/q;->a:Ljava/lang/Thread;

    .line 80
    iget-object v0, p0, Landroid_src/mms/transaction/q;->a:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 81
    return-void
.end method

.method public b()I
    .locals 1

    .prologue
    .line 176
    const/4 v0, 0x2

    return v0
.end method

.method public run()V
    .locals 11

    .prologue
    const/4 v10, 0x2

    const/4 v9, 0x1

    .line 86
    :try_start_0
    invoke-static {}, Landroid_src/mms/g/l;->a()Landroid_src/mms/g/l;

    move-result-object v1

    .line 87
    invoke-virtual {v1}, Landroid_src/mms/g/l;->c()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Landroid_src/mms/g/l;->d()Z

    move-result v1

    if-nez v1, :cond_1

    .line 88
    const-string v1, "fb-mms:SendTransaction"

    const-string v2, "Sending rate limit surpassed."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    iget-object v1, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1}, Landroid_src/mms/transaction/x;->a()I

    move-result v1

    if-eq v1, v9, :cond_0

    .line 166
    iget-object v1, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1, v10}, Landroid_src/mms/transaction/x;->a(I)V

    .line 167
    iget-object v1, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    iget-object v2, p0, Landroid_src/mms/transaction/q;->f:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Landroid_src/mms/transaction/x;->a(Landroid/net/Uri;)V

    .line 168
    const-string v1, "fb-mms:SendTransaction"

    const-string v2, "Delivery failed."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    :cond_0
    invoke-virtual {p0}, Landroid_src/mms/transaction/q;->c()V

    .line 172
    :goto_0
    return-void

    .line 93
    :cond_1
    :try_start_1
    iget-object v1, p0, Landroid_src/mms/transaction/q;->b:Landroid/content/Context;

    invoke-static {v1}, Landroid_src/mms/e/t;->a(Landroid/content/Context;)Landroid_src/mms/e/t;

    move-result-object v8

    .line 94
    iget-object v1, p0, Landroid_src/mms/transaction/q;->f:Landroid/net/Uri;

    invoke-virtual {v8, v1}, Landroid_src/mms/e/t;->a(Landroid/net/Uri;)Landroid_src/mms/e/f;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Landroid_src/mms/e/z;

    move-object v7, v0

    .line 97
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    .line 98
    invoke-virtual {v7, v1, v2}, Landroid_src/mms/e/z;->a(J)V

    .line 101
    new-instance v4, Landroid/content/ContentValues;

    const/4 v3, 0x1

    invoke-direct {v4, v3}, Landroid/content/ContentValues;-><init>(I)V

    .line 102
    const-string v3, "date"

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 103
    iget-object v1, p0, Landroid_src/mms/transaction/q;->b:Landroid/content/Context;

    iget-object v2, p0, Landroid_src/mms/transaction/q;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    iget-object v3, p0, Landroid_src/mms/transaction/q;->f:Landroid/net/Uri;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 107
    iget-object v1, p0, Landroid_src/mms/transaction/q;->b:Landroid/content/Context;

    invoke-static {v1}, Landroid_src/mms/f/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 108
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 109
    new-instance v2, Landroid_src/mms/e/e;

    invoke-direct {v2, v1}, Landroid_src/mms/e/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Landroid_src/mms/e/z;->a(Landroid_src/mms/e/e;)V

    .line 113
    :cond_2
    iget-object v1, p0, Landroid_src/mms/transaction/q;->f:Landroid/net/Uri;

    invoke-static {v1}, Landroid/content/ContentUris;->parseId(Landroid/net/Uri;)J

    move-result-wide v1

    .line 114
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v3}, Landroid_src/mms/g/n;->a(Ljava/lang/Object;)J

    move-result-wide v3

    new-instance v5, Landroid_src/mms/e/k;

    iget-object v6, p0, Landroid_src/mms/transaction/q;->b:Landroid/content/Context;

    invoke-direct {v5, v6, v7}, Landroid_src/mms/e/k;-><init>(Landroid/content/Context;Landroid_src/mms/e/f;)V

    invoke-virtual {v5}, Landroid_src/mms/e/k;->a()[B

    move-result-object v5

    invoke-virtual {p0, v3, v4, v5}, Landroid_src/mms/transaction/q;->a(J[B)[B

    move-result-object v3

    .line 116
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Landroid_src/mms/g/n;->b(Ljava/lang/Object;)V

    .line 118
    const/4 v1, 0x2

    invoke-static {v1}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 119
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v3}, Ljava/lang/String;-><init>([B)V

    .line 120
    const-string v2, "fb-mms:SendTransaction"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "[SendTransaction] run: send mms msg ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Landroid_src/mms/transaction/q;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "), resp="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    :cond_3
    new-instance v1, Landroid_src/mms/e/r;

    invoke-direct {v1, v3}, Landroid_src/mms/e/r;-><init>([B)V

    invoke-virtual {v1}, Landroid_src/mms/e/r;->a()Landroid_src/mms/e/f;

    move-result-object v1

    check-cast v1, Landroid_src/mms/e/y;

    .line 124
    if-nez v1, :cond_4

    .line 125
    const-string v2, "fb-mms:SendTransaction"

    const-string v3, "No M-Send.conf received."

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    :cond_4
    invoke-virtual {v7}, Landroid_src/mms/e/z;->b()[B

    move-result-object v2

    .line 131
    invoke-virtual {v1}, Landroid_src/mms/e/y;->c()[B

    move-result-object v3

    .line 132
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v4

    if-nez v4, :cond_6

    .line 133
    const-string v1, "fb-mms:SendTransaction"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Inconsistent Transaction-ID: req="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ", conf="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v3}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    iget-object v1, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1}, Landroid_src/mms/transaction/x;->a()I

    move-result v1

    if-eq v1, v9, :cond_5

    .line 166
    iget-object v1, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1, v10}, Landroid_src/mms/transaction/x;->a(I)V

    .line 167
    iget-object v1, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    iget-object v2, p0, Landroid_src/mms/transaction/q;->f:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Landroid_src/mms/transaction/x;->a(Landroid/net/Uri;)V

    .line 168
    const-string v1, "fb-mms:SendTransaction"

    const-string v2, "Delivery failed."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    :cond_5
    invoke-virtual {p0}, Landroid_src/mms/transaction/q;->c()V

    goto/16 :goto_0

    .line 141
    :cond_6
    :try_start_2
    new-instance v4, Landroid/content/ContentValues;

    const/4 v2, 0x2

    invoke-direct {v4, v2}, Landroid/content/ContentValues;-><init>(I)V

    .line 142
    invoke-virtual {v1}, Landroid_src/mms/e/y;->b()I

    move-result v7

    .line 143
    const-string v2, "resp_st"

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v4, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 145
    const/16 v2, 0x80

    if-eq v7, v2, :cond_8

    .line 146
    iget-object v1, p0, Landroid_src/mms/transaction/q;->b:Landroid/content/Context;

    iget-object v2, p0, Landroid_src/mms/transaction/q;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    iget-object v3, p0, Landroid_src/mms/transaction/q;->f:Landroid/net/Uri;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 148
    const-string v1, "fb-mms:SendTransaction"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Server returned an error code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 165
    iget-object v1, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1}, Landroid_src/mms/transaction/x;->a()I

    move-result v1

    if-eq v1, v9, :cond_7

    .line 166
    iget-object v1, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1, v10}, Landroid_src/mms/transaction/x;->a(I)V

    .line 167
    iget-object v1, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    iget-object v2, p0, Landroid_src/mms/transaction/q;->f:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Landroid_src/mms/transaction/x;->a(Landroid/net/Uri;)V

    .line 168
    const-string v1, "fb-mms:SendTransaction"

    const-string v2, "Delivery failed."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    :cond_7
    invoke-virtual {p0}, Landroid_src/mms/transaction/q;->c()V

    goto/16 :goto_0

    .line 152
    :cond_8
    :try_start_3
    invoke-virtual {v1}, Landroid_src/mms/e/y;->a()[B

    move-result-object v1

    invoke-static {v1}, Landroid_src/mms/e/t;->a([B)Ljava/lang/String;

    move-result-object v1

    .line 153
    const-string v2, "m_id"

    invoke-virtual {v4, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    iget-object v1, p0, Landroid_src/mms/transaction/q;->b:Landroid/content/Context;

    iget-object v2, p0, Landroid_src/mms/transaction/q;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    iget-object v3, p0, Landroid_src/mms/transaction/q;->f:Landroid/net/Uri;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 158
    iget-object v1, p0, Landroid_src/mms/transaction/q;->f:Landroid/net/Uri;

    sget-object v2, Landroid_src/c/i;->a:Landroid/net/Uri;

    invoke-virtual {v8, v1, v2}, Landroid_src/mms/e/t;->a(Landroid/net/Uri;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v1

    .line 160
    iget-object v2, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid_src/mms/transaction/x;->a(I)V

    .line 161
    iget-object v2, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v2, v1}, Landroid_src/mms/transaction/x;->a(Landroid/net/Uri;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 165
    iget-object v1, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1}, Landroid_src/mms/transaction/x;->a()I

    move-result v1

    if-eq v1, v9, :cond_9

    .line 166
    iget-object v1, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1, v10}, Landroid_src/mms/transaction/x;->a(I)V

    .line 167
    iget-object v1, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    iget-object v2, p0, Landroid_src/mms/transaction/q;->f:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Landroid_src/mms/transaction/x;->a(Landroid/net/Uri;)V

    .line 168
    const-string v1, "fb-mms:SendTransaction"

    const-string v2, "Delivery failed."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    :cond_9
    invoke-virtual {p0}, Landroid_src/mms/transaction/q;->c()V

    goto/16 :goto_0

    .line 162
    :catch_0
    move-exception v1

    .line 163
    :try_start_4
    const-string v2, "fb-mms:SendTransaction"

    const-string v3, "Throwable caught in SendTransaction"

    invoke-static {v2, v3, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 165
    iget-object v1, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1}, Landroid_src/mms/transaction/x;->a()I

    move-result v1

    if-eq v1, v9, :cond_a

    .line 166
    iget-object v1, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1, v10}, Landroid_src/mms/transaction/x;->a(I)V

    .line 167
    iget-object v1, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    iget-object v2, p0, Landroid_src/mms/transaction/q;->f:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Landroid_src/mms/transaction/x;->a(Landroid/net/Uri;)V

    .line 168
    const-string v1, "fb-mms:SendTransaction"

    const-string v2, "Delivery failed."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    :cond_a
    invoke-virtual {p0}, Landroid_src/mms/transaction/q;->c()V

    goto/16 :goto_0

    .line 165
    :catchall_0
    move-exception v1

    iget-object v2, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v2}, Landroid_src/mms/transaction/x;->a()I

    move-result v2

    if-eq v2, v9, :cond_b

    .line 166
    iget-object v2, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v2, v10}, Landroid_src/mms/transaction/x;->a(I)V

    .line 167
    iget-object v2, p0, Landroid_src/mms/transaction/q;->d:Landroid_src/mms/transaction/x;

    iget-object v3, p0, Landroid_src/mms/transaction/q;->f:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Landroid_src/mms/transaction/x;->a(Landroid/net/Uri;)V

    .line 168
    const-string v2, "fb-mms:SendTransaction"

    const-string v3, "Delivery failed."

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    :cond_b
    invoke-virtual {p0}, Landroid_src/mms/transaction/q;->c()V

    throw v1
.end method
