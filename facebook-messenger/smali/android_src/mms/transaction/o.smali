.class public Landroid_src/mms/transaction/o;
.super Landroid_src/mms/transaction/r;
.source "RetrieveTransaction.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field static final a:[Ljava/lang/String;


# instance fields
.field private final f:Landroid/net/Uri;

.field private final g:Ljava/lang/String;

.field private h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 66
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "ct_l"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "locked"

    aput-object v2, v0, v1

    sput-object v0, Landroid_src/mms/transaction/o;->a:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILandroid_src/mms/transaction/w;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 78
    invoke-direct {p0, p1, p2, p3}, Landroid_src/mms/transaction/r;-><init>(Landroid/content/Context;ILandroid_src/mms/transaction/w;)V

    .line 80
    const-string v0, "content://"

    invoke-virtual {p4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Landroid_src/mms/transaction/o;->f:Landroid/net/Uri;

    .line 82
    iget-object v0, p0, Landroid_src/mms/transaction/o;->f:Landroid/net/Uri;

    invoke-direct {p0, p1, v0}, Landroid_src/mms/transaction/o;->a(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid_src/mms/transaction/o;->g:Ljava/lang/String;

    iput-object v0, p0, Landroid_src/mms/transaction/o;->c:Ljava/lang/String;

    .line 92
    invoke-static {p1}, Landroid_src/mms/transaction/p;->a(Landroid/content/Context;)Landroid_src/mms/transaction/p;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid_src/mms/transaction/o;->a(Landroid_src/mms/transaction/l;)V

    .line 93
    return-void

    .line 87
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Initializing from X-Mms-Content-Location is abandoned!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x1

    .line 97
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v3, Landroid_src/mms/transaction/o;->a:[Ljava/lang/String;

    move-object v0, p1

    move-object v2, p2

    move-object v5, v4

    move-object v6, v4

    invoke-static/range {v0 .. v6}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 99
    iput-boolean v8, p0, Landroid_src/mms/transaction/o;->h:Z

    .line 101
    if-eqz v1, :cond_2

    .line 103
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-ne v0, v7, :cond_1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 106
    const/4 v0, 0x1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-ne v0, v7, :cond_0

    move v0, v7

    :goto_0
    iput-boolean v0, p0, Landroid_src/mms/transaction/o;->h:Z

    .line 107
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 110
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0

    :cond_0
    move v0, v8

    .line 106
    goto :goto_0

    .line 110
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 114
    :cond_2
    new-instance v0, Landroid_src/mms/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot get X-Mms-Content-Location from: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid_src/mms/d;-><init>(Ljava/lang/String;)V

    throw v0

    .line 110
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method private static a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Z)V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 247
    new-instance v3, Landroid/content/ContentValues;

    const/4 v0, 0x2

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 248
    const-string v0, "ct_l"

    invoke-virtual {v3, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    const-string v0, "locked"

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 250
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    move-object v0, p0

    move-object v2, p1

    move-object v5, v4

    invoke-static/range {v0 .. v5}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 252
    return-void
.end method

.method private a(Landroid_src/mms/e/x;)V
    .locals 3

    .prologue
    .line 225
    invoke-virtual {p1}, Landroid_src/mms/e/x;->d()[B

    move-result-object v0

    .line 226
    if-eqz v0, :cond_0

    .line 228
    new-instance v1, Landroid_src/mms/e/a;

    const/16 v2, 0x12

    invoke-direct {v1, v2, v0}, Landroid_src/mms/e/a;-><init>(I[B)V

    .line 232
    iget-object v0, p0, Landroid_src/mms/transaction/o;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid_src/mms/f/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 233
    new-instance v2, Landroid_src/mms/e/e;

    invoke-direct {v2, v0}, Landroid_src/mms/e/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid_src/mms/e/a;->a(Landroid_src/mms/e/e;)V

    .line 236
    invoke-static {}, Landroid_src/mms/c;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 237
    new-instance v0, Landroid_src/mms/e/k;

    iget-object v2, p0, Landroid_src/mms/transaction/o;->b:Landroid/content/Context;

    invoke-direct {v0, v2, v1}, Landroid_src/mms/e/k;-><init>(Landroid/content/Context;Landroid_src/mms/e/f;)V

    invoke-virtual {v0}, Landroid_src/mms/e/k;->a()[B

    move-result-object v0

    iget-object v1, p0, Landroid_src/mms/transaction/o;->g:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Landroid_src/mms/transaction/o;->a([BLjava/lang/String;)[B

    .line 242
    :cond_0
    :goto_0
    return-void

    .line 239
    :cond_1
    new-instance v0, Landroid_src/mms/e/k;

    iget-object v2, p0, Landroid_src/mms/transaction/o;->b:Landroid/content/Context;

    invoke-direct {v0, v2, v1}, Landroid_src/mms/e/k;-><init>(Landroid/content/Context;Landroid_src/mms/e/f;)V

    invoke-virtual {v0}, Landroid_src/mms/e/k;->a()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid_src/mms/transaction/o;->a([B)[B

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;Landroid_src/mms/e/x;)Z
    .locals 9

    .prologue
    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 196
    invoke-virtual {p1}, Landroid_src/mms/e/x;->c()[B

    move-result-object v0

    .line 197
    if-eqz v0, :cond_1

    .line 198
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    .line 199
    const-string v4, "(m_id = ? AND m_type = ?)"

    .line 201
    const/4 v0, 0x2

    new-array v5, v0, [Ljava/lang/String;

    aput-object v1, v5, v8

    const/16 v0, 0x84

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v7

    .line 203
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Landroid_src/c/d;->a:Landroid/net/Uri;

    new-array v3, v7, [Ljava/lang/String;

    const-string v0, "_id"

    aput-object v0, v3, v8

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 207
    if-eqz v0, :cond_1

    .line 209
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-lez v1, :cond_0

    .line 214
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    move v0, v7

    .line 218
    :goto_0
    return v0

    .line 214
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_1
    move v0, v8

    .line 218
    goto :goto_0

    .line 214
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    throw v1
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
    .line 256
    const/4 v0, 0x1

    return v0
.end method

.method public run()V
    .locals 12

    .prologue
    const/4 v11, 0x2

    const/4 v3, 0x0

    const/4 v10, 0x1

    .line 130
    :try_start_0
    invoke-static {}, Landroid_src/mms/g/d;->b()Landroid_src/mms/g/d;

    move-result-object v1

    iget-object v2, p0, Landroid_src/mms/transaction/o;->f:Landroid/net/Uri;

    const/16 v4, 0x81

    invoke-virtual {v1, v2, v4}, Landroid_src/mms/g/d;->a(Landroid/net/Uri;I)V

    .line 134
    iget-object v1, p0, Landroid_src/mms/transaction/o;->g:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid_src/mms/transaction/o;->a(Ljava/lang/String;)[B

    move-result-object v1

    .line 137
    new-instance v2, Landroid_src/mms/e/r;

    invoke-direct {v2, v1}, Landroid_src/mms/e/r;-><init>([B)V

    invoke-virtual {v2}, Landroid_src/mms/e/r;->a()Landroid_src/mms/e/f;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Landroid_src/mms/e/x;

    move-object v7, v0

    .line 138
    if-nez v7, :cond_1

    .line 139
    new-instance v1, Landroid_src/mms/d;

    const-string v2, "Invalid M-Retrieve.conf PDU."

    invoke-direct {v1, v2}, Landroid_src/mms/d;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    :catch_0
    move-exception v1

    .line 184
    :try_start_1
    const-string v2, "fb-mms:RetrieveTransaction"

    const-string v3, "Throwable caught in RetreiveTransaction"

    invoke-static {v2, v3, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    iget-object v1, p0, Landroid_src/mms/transaction/o;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1}, Landroid_src/mms/transaction/x;->a()I

    move-result v1

    if-eq v1, v10, :cond_0

    .line 187
    iget-object v1, p0, Landroid_src/mms/transaction/o;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1, v11}, Landroid_src/mms/transaction/x;->a(I)V

    .line 188
    iget-object v1, p0, Landroid_src/mms/transaction/o;->d:Landroid_src/mms/transaction/x;

    iget-object v2, p0, Landroid_src/mms/transaction/o;->f:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Landroid_src/mms/transaction/x;->a(Landroid/net/Uri;)V

    .line 189
    const-string v1, "fb-mms:RetrieveTransaction"

    const-string v2, "Retrieval failed."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    :cond_0
    invoke-virtual {p0}, Landroid_src/mms/transaction/o;->c()V

    .line 193
    :goto_0
    return-void

    .line 143
    :cond_1
    :try_start_2
    iget-object v1, p0, Landroid_src/mms/transaction/o;->b:Landroid/content/Context;

    invoke-static {v1, v7}, Landroid_src/mms/transaction/o;->a(Landroid/content/Context;Landroid_src/mms/e/x;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 146
    iget-object v1, p0, Landroid_src/mms/transaction/o;->d:Landroid_src/mms/transaction/x;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid_src/mms/transaction/x;->a(I)V

    .line 147
    iget-object v1, p0, Landroid_src/mms/transaction/o;->d:Landroid_src/mms/transaction/x;

    iget-object v2, p0, Landroid_src/mms/transaction/o;->f:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Landroid_src/mms/transaction/x;->a(Landroid/net/Uri;)V

    .line 170
    :goto_1
    iget-object v1, p0, Landroid_src/mms/transaction/o;->b:Landroid/content/Context;

    iget-object v2, p0, Landroid_src/mms/transaction/o;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    iget-object v4, p0, Landroid_src/mms/transaction/o;->f:Landroid/net/Uri;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v1, v2, v4, v5, v6}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 173
    if-eqz v3, :cond_2

    .line 182
    :cond_2
    invoke-direct {p0, v7}, Landroid_src/mms/transaction/o;->a(Landroid_src/mms/e/x;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 186
    iget-object v1, p0, Landroid_src/mms/transaction/o;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1}, Landroid_src/mms/transaction/x;->a()I

    move-result v1

    if-eq v1, v10, :cond_3

    .line 187
    iget-object v1, p0, Landroid_src/mms/transaction/o;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1, v11}, Landroid_src/mms/transaction/x;->a(I)V

    .line 188
    iget-object v1, p0, Landroid_src/mms/transaction/o;->d:Landroid_src/mms/transaction/x;

    iget-object v2, p0, Landroid_src/mms/transaction/o;->f:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Landroid_src/mms/transaction/x;->a(Landroid/net/Uri;)V

    .line 189
    const-string v1, "fb-mms:RetrieveTransaction"

    const-string v2, "Retrieval failed."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    :cond_3
    invoke-virtual {p0}, Landroid_src/mms/transaction/o;->c()V

    goto :goto_0

    .line 150
    :cond_4
    :try_start_3
    iget-object v1, p0, Landroid_src/mms/transaction/o;->b:Landroid/content/Context;

    invoke-static {v1}, Landroid_src/mms/e/t;->a(Landroid/content/Context;)Landroid_src/mms/e/t;

    move-result-object v1

    .line 151
    sget-object v2, Landroid_src/c/f;->a:Landroid/net/Uri;

    invoke-virtual {v1, v7, v2}, Landroid_src/mms/e/t;->a(Landroid_src/mms/e/f;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v3

    .line 154
    new-instance v4, Landroid/content/ContentValues;

    const/4 v1, 0x1

    invoke-direct {v4, v1}, Landroid/content/ContentValues;-><init>(I)V

    .line 155
    const-string v1, "date"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide/16 v8, 0x3e8

    div-long/2addr v5, v8

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 156
    iget-object v1, p0, Landroid_src/mms/transaction/o;->b:Landroid/content/Context;

    iget-object v2, p0, Landroid_src/mms/transaction/o;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 160
    iget-object v1, p0, Landroid_src/mms/transaction/o;->d:Landroid_src/mms/transaction/x;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid_src/mms/transaction/x;->a(I)V

    .line 161
    iget-object v1, p0, Landroid_src/mms/transaction/o;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v1, v3}, Landroid_src/mms/transaction/x;->a(Landroid/net/Uri;)V

    .line 166
    iget-object v1, p0, Landroid_src/mms/transaction/o;->b:Landroid/content/Context;

    iget-object v2, p0, Landroid_src/mms/transaction/o;->g:Ljava/lang/String;

    iget-boolean v4, p0, Landroid_src/mms/transaction/o;->h:Z

    invoke-static {v1, v3, v2, v4}, Landroid_src/mms/transaction/o;->a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Z)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 186
    :catchall_0
    move-exception v1

    iget-object v2, p0, Landroid_src/mms/transaction/o;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v2}, Landroid_src/mms/transaction/x;->a()I

    move-result v2

    if-eq v2, v10, :cond_5

    .line 187
    iget-object v2, p0, Landroid_src/mms/transaction/o;->d:Landroid_src/mms/transaction/x;

    invoke-virtual {v2, v11}, Landroid_src/mms/transaction/x;->a(I)V

    .line 188
    iget-object v2, p0, Landroid_src/mms/transaction/o;->d:Landroid_src/mms/transaction/x;

    iget-object v3, p0, Landroid_src/mms/transaction/o;->f:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Landroid_src/mms/transaction/x;->a(Landroid/net/Uri;)V

    .line 189
    const-string v2, "fb-mms:RetrieveTransaction"

    const-string v3, "Retrieval failed."

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    :cond_5
    invoke-virtual {p0}, Landroid_src/mms/transaction/o;->c()V

    throw v1
.end method
