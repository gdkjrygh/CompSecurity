.class Lcom/facebook/orca/g/k;
.super Ljava/lang/Object;
.source "DbFetchThreadsHandler.java"


# static fields
.field private static final h:[Ljava/lang/String;


# instance fields
.field private final a:Lcom/facebook/orca/g/aa;

.field private final b:Lcom/facebook/orca/g/j;

.field private final c:Lcom/facebook/orca/g/y;

.field private final d:Lcom/facebook/orca/g/r;

.field private final e:Lcom/facebook/orca/g/g;

.field private final f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/g/z;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/facebook/orca/g/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 380
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "unread_count"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "unseen_count"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "last_seen_time"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "last_action_id"

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/orca/g/k;->h:[Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/facebook/orca/g/aa;Lcom/facebook/orca/g/j;Lcom/facebook/orca/g/y;Lcom/facebook/orca/g/r;Lcom/facebook/orca/g/g;Ljavax/inject/a;Lcom/facebook/orca/g/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/g/aa;",
            "Lcom/facebook/orca/g/j;",
            "Lcom/facebook/orca/g/y;",
            "Lcom/facebook/orca/g/r;",
            "Lcom/facebook/orca/g/g;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/g/z;",
            ">;",
            "Lcom/facebook/orca/g/e;",
            ")V"
        }
    .end annotation

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lcom/facebook/orca/g/k;->a:Lcom/facebook/orca/g/aa;

    .line 61
    iput-object p2, p0, Lcom/facebook/orca/g/k;->b:Lcom/facebook/orca/g/j;

    .line 62
    iput-object p3, p0, Lcom/facebook/orca/g/k;->c:Lcom/facebook/orca/g/y;

    .line 63
    iput-object p4, p0, Lcom/facebook/orca/g/k;->d:Lcom/facebook/orca/g/r;

    .line 64
    iput-object p5, p0, Lcom/facebook/orca/g/k;->e:Lcom/facebook/orca/g/g;

    .line 65
    iput-object p6, p0, Lcom/facebook/orca/g/k;->f:Ljavax/inject/a;

    .line 66
    iput-object p7, p0, Lcom/facebook/orca/g/k;->g:Lcom/facebook/orca/g/e;

    .line 67
    return-void
.end method

.method private a(Ljava/util/Collection;I)Lcom/google/common/a/es;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;I)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 370
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 371
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 372
    const/4 v0, 0x0

    .line 373
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    if-ge v0, p2, :cond_0

    .line 374
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 375
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 377
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/orca/threads/FolderName;JI)Ljava/util/LinkedHashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/FolderName;",
            "JI)",
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 219
    const-string v0, "DbFetchThreadsHandler.doThreadListQuery"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 222
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/orca/g/k;->b(Lcom/facebook/orca/threads/FolderName;JI)Ljava/util/LinkedHashMap;

    move-result-object v0

    .line 226
    invoke-direct {p0, v0}, Lcom/facebook/orca/g/k;->b(Ljava/util/LinkedHashMap;)V

    .line 229
    invoke-direct {p0, v0}, Lcom/facebook/orca/g/k;->c(Ljava/util/LinkedHashMap;)V

    .line 232
    invoke-static {}, Lcom/google/common/a/ik;->b()Ljava/util/LinkedHashMap;

    move-result-object v2

    .line 233
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/v;

    .line 234
    invoke-virtual {v0}, Lcom/facebook/orca/threads/v;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/facebook/orca/threads/v;->z()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    invoke-virtual {v2, v4, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 237
    :cond_0
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 238
    return-object v2
.end method

.method private a()Ljava/util/Set;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 242
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v10

    .line 244
    iget-object v0, p0, Lcom/facebook/orca/g/k;->a:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 245
    const-string v2, "archived_sms_mms_threads"

    new-array v3, v1, [Ljava/lang/String;

    const-string v5, "thread_id"

    aput-object v5, v3, v6

    move-object v5, v4

    move-object v6, v4

    move-object v7, v4

    move-object v8, v4

    move-object v9, v4

    invoke-virtual/range {v0 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 256
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 257
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 258
    invoke-interface {v10, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 261
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 263
    return-object v10
.end method

.method private a(Ljava/util/LinkedHashMap;)Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;)",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;"
        }
    .end annotation

    .prologue
    .line 159
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v2

    .line 160
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 161
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 162
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 163
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 166
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->B()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 167
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 168
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 172
    :cond_4
    return-object v2
.end method

.method private b(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/FolderCounts;
    .locals 9

    .prologue
    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 388
    const-string v0, "DbFetchThreadsHandler.getFolderCounts"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v8

    .line 389
    const-string v0, "folder=\'%1$s\'"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 390
    iget-object v0, p0, Lcom/facebook/orca/g/k;->a:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 391
    const-string v1, "folder_counts"

    sget-object v2, Lcom/facebook/orca/g/k;->h:[Ljava/lang/String;

    move-object v5, v4

    move-object v6, v4

    move-object v7, v4

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 394
    :try_start_0
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 395
    new-instance v0, Lcom/facebook/orca/threads/FolderCounts;

    const/4 v1, 0x0

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    const/4 v2, 0x1

    invoke-interface {v7, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    const/4 v3, 0x2

    invoke-interface {v7, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    const/4 v5, 0x3

    invoke-interface {v7, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/threads/FolderCounts;-><init>(IIJJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 403
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 404
    invoke-virtual {v8}, Lcom/facebook/debug/d/e;->a()J

    :goto_0
    return-object v0

    .line 403
    :cond_0
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 404
    invoke-virtual {v8}, Lcom/facebook/debug/d/e;->a()J

    move-object v0, v4

    goto :goto_0

    .line 403
    :catchall_0
    move-exception v0

    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 404
    invoke-virtual {v8}, Lcom/facebook/debug/d/e;->a()J

    throw v0
.end method

.method private b(Lcom/facebook/orca/threads/FolderName;JI)Ljava/util/LinkedHashMap;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/FolderName;",
            "JI)",
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/threads/v;",
            ">;"
        }
    .end annotation

    .prologue
    .line 281
    const/4 v4, 0x0

    .line 282
    sget-object v0, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {p1, v0}, Lcom/facebook/orca/threads/FolderName;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 283
    invoke-direct {p0}, Lcom/facebook/orca/g/k;->a()Ljava/util/Set;

    move-result-object v4

    .line 286
    :cond_0
    invoke-static {}, Lcom/google/common/a/ik;->b()Ljava/util/LinkedHashMap;

    move-result-object v6

    .line 287
    iget-object v0, p0, Lcom/facebook/orca/g/k;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/z;

    .line 288
    invoke-static {p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    move-object v1, p1

    move-wide v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/g/z;->a(Lcom/facebook/orca/threads/FolderName;JLjava/util/Set;Ljava/lang/String;)V

    .line 291
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Lcom/facebook/orca/g/z;->a()Lcom/facebook/orca/threads/v;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 292
    invoke-virtual {v1}, Lcom/facebook/orca/threads/v;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 295
    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lcom/facebook/orca/g/z;->b()V

    throw v1

    :cond_1
    invoke-virtual {v0}, Lcom/facebook/orca/g/z;->b()V

    .line 297
    return-object v6
.end method

.method private b(Ljava/util/LinkedHashMap;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/threads/v;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v1, 0x1

    .line 308
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 309
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/d/d/j;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "thread_id IN "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-static {v5}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v4

    aput-object v4, v0, v6

    const-string v4, "msg_type"

    const/16 v5, 0x385

    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v4

    aput-object v4, v0, v1

    const/4 v4, 0x2

    const-string v5, "timestamp_ms"

    const-wide/32 v8, 0x5265c00

    sub-long/2addr v2, v8

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/facebook/d/d/e;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v2

    aput-object v2, v0, v4

    invoke-static {v0}, Lcom/facebook/d/d/e;->a([Lcom/facebook/d/d/j;)Lcom/facebook/d/d/f;

    move-result-object v5

    .line 315
    iget-object v0, p0, Lcom/facebook/orca/g/k;->a:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 316
    const-string v2, "messages"

    new-array v3, v1, [Ljava/lang/String;

    const-string v4, "thread_id"

    aput-object v4, v3, v6

    invoke-virtual {v5}, Lcom/facebook/d/d/f;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5}, Lcom/facebook/d/d/f;->b()[Ljava/lang/String;

    move-result-object v5

    const-string v6, "thread_id"

    move-object v8, v7

    move-object v9, v7

    invoke-virtual/range {v0 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 327
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 328
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 329
    invoke-virtual {p1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/v;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threads/v;->e(Z)Lcom/facebook/orca/threads/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 332
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 334
    return-void
.end method

.method private c(Ljava/util/LinkedHashMap;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/threads/v;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v1, 0x1

    .line 344
    new-array v0, v1, [Lcom/facebook/d/d/j;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "thread_id IN "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v2

    aput-object v2, v0, v6

    invoke-static {v0}, Lcom/facebook/d/d/e;->a([Lcom/facebook/d/d/j;)Lcom/facebook/d/d/f;

    move-result-object v5

    .line 348
    iget-object v0, p0, Lcom/facebook/orca/g/k;->a:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 349
    const-string v2, "unread_mms_sms_threads"

    new-array v3, v1, [Ljava/lang/String;

    const-string v4, "thread_id"

    aput-object v4, v3, v6

    invoke-virtual {v5}, Lcom/facebook/d/d/f;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5}, Lcom/facebook/d/d/f;->b()[Ljava/lang/String;

    move-result-object v5

    const-string v6, "thread_id"

    move-object v8, v7

    move-object v9, v7

    invoke-virtual/range {v0 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 360
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 361
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 362
    invoke-virtual {p1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/v;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threads/v;->b(Z)Lcom/facebook/orca/threads/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 365
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 367
    return-void
.end method


# virtual methods
.method a(Lcom/facebook/orca/threads/FolderName;)J
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 143
    iget-object v0, p0, Lcom/facebook/orca/g/k;->a:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 144
    const-string v1, "SELECT MIN(timestamp_ms) FROM folders WHERE folder=?"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    .line 149
    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    .line 153
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 155
    :goto_0
    return-wide v0

    .line 153
    :cond_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 155
    const-wide/16 v0, -0x1

    goto :goto_0

    .line 153
    :catchall_0
    move-exception v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method a(Lcom/facebook/orca/server/FetchMoreThreadsParams;)Lcom/facebook/orca/server/FetchMoreThreadsResult;
    .locals 7

    .prologue
    .line 178
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->a()Lcom/facebook/orca/threads/FolderName;

    move-result-object v2

    .line 179
    iget-object v0, p0, Lcom/facebook/orca/g/k;->c:Lcom/facebook/orca/g/y;

    invoke-static {v2}, Lcom/facebook/orca/g/s;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/g/x;

    move-result-object v1

    const-wide/16 v3, -0x1

    invoke-virtual {v0, v1, v3, v4}, Lcom/facebook/orca/g/y;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v5

    .line 181
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->b()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->c()I

    move-result v3

    invoke-direct {p0, v2, v0, v1, v3}, Lcom/facebook/orca/g/k;->a(Lcom/facebook/orca/threads/FolderName;JI)Ljava/util/LinkedHashMap;

    move-result-object v1

    .line 187
    const/4 v0, 0x0

    .line 188
    invoke-static {v2}, Lcom/facebook/orca/g/l;->a(Lcom/facebook/orca/threads/FolderName;)Ljava/lang/String;

    move-result-object v3

    .line 189
    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 190
    const/4 v0, 0x1

    .line 191
    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    :cond_0
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->c()I

    move-result v4

    invoke-direct {p0, v3, v4}, Lcom/facebook/orca/g/k;->a(Ljava/util/Collection;I)Lcom/google/common/a/es;

    move-result-object v4

    .line 196
    new-instance v3, Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-direct {v3, v4, v0}, Lcom/facebook/orca/threads/ThreadsCollection;-><init>(Lcom/google/common/a/es;Z)V

    .line 197
    invoke-direct {p0, v1}, Lcom/facebook/orca/g/k;->a(Ljava/util/LinkedHashMap;)Ljava/util/Set;

    move-result-object v0

    .line 198
    iget-object v1, p0, Lcom/facebook/orca/g/k;->b:Lcom/facebook/orca/g/j;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/g/j;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v4

    .line 200
    new-instance v0, Lcom/facebook/orca/server/FetchMoreThreadsResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/server/FetchMoreThreadsResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadsCollection;Lcom/google/common/a/es;J)V

    return-object v0
.end method

.method a(Lcom/facebook/orca/server/FetchThreadListParams;)Lcom/facebook/orca/server/FetchThreadListResult;
    .locals 13

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v11, -0x1

    .line 71
    const-string v2, "DbFetchThreadsHandler.fetchThreadListFromDb"

    invoke-static {v2}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v3

    .line 73
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->b()Lcom/facebook/orca/threads/FolderName;

    move-result-object v4

    .line 74
    iget-object v2, p0, Lcom/facebook/orca/g/k;->c:Lcom/facebook/orca/g/y;

    invoke-static {v4}, Lcom/facebook/orca/g/s;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/g/x;

    move-result-object v5

    const-wide/16 v6, -0x1

    invoke-virtual {v2, v5, v6, v7}, Lcom/facebook/orca/g/y;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v5

    .line 76
    iget-object v2, p0, Lcom/facebook/orca/g/k;->c:Lcom/facebook/orca/g/y;

    invoke-static {v4}, Lcom/facebook/orca/g/s;->c(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/g/x;

    move-result-object v7

    const/4 v8, 0x1

    invoke-virtual {v2, v7, v8}, Lcom/facebook/orca/g/y;->a(Lcom/facebook/common/s/a;Z)Z

    move-result v2

    .line 78
    iget-object v7, p0, Lcom/facebook/orca/g/k;->c:Lcom/facebook/orca/g/y;

    invoke-static {v4}, Lcom/facebook/orca/g/s;->b(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/g/x;

    move-result-object v8

    const-wide/16 v9, -0x1

    invoke-virtual {v7, v8, v9, v10}, Lcom/facebook/orca/g/y;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v7

    .line 81
    cmp-long v9, v5, v11

    if-nez v9, :cond_0

    .line 83
    invoke-static {v4}, Lcom/facebook/orca/server/FetchThreadListResult;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/FetchThreadListResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 132
    invoke-virtual {v3}, Lcom/facebook/debug/d/e;->a()J

    :goto_0
    return-object v0

    .line 87
    :cond_0
    if-eqz v2, :cond_2

    .line 88
    :try_start_1
    sget-object v2, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    .line 94
    :goto_1
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->b()Lcom/facebook/orca/threads/FolderName;

    move-result-object v9

    const-wide/16 v10, -0x1

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->d()I

    move-result v12

    add-int/lit8 v12, v12, 0x1

    invoke-direct {p0, v9, v10, v11, v12}, Lcom/facebook/orca/g/k;->a(Lcom/facebook/orca/threads/FolderName;JI)Ljava/util/LinkedHashMap;

    move-result-object v9

    .line 101
    invoke-direct {p0, v9}, Lcom/facebook/orca/g/k;->a(Ljava/util/LinkedHashMap;)Ljava/util/Set;

    move-result-object v10

    .line 102
    iget-object v11, p0, Lcom/facebook/orca/g/k;->b:Lcom/facebook/orca/g/j;

    invoke-virtual {v11, v10}, Lcom/facebook/orca/g/j;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v10

    .line 105
    invoke-static {v4}, Lcom/facebook/orca/g/l;->a(Lcom/facebook/orca/threads/FolderName;)Ljava/lang/String;

    move-result-object v11

    .line 106
    invoke-virtual {v9, v11}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    .line 108
    invoke-virtual {v9, v11}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    :goto_2
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->d()I

    move-result v9

    invoke-direct {p0, v1, v9}, Lcom/facebook/orca/g/k;->a(Ljava/util/Collection;I)Lcom/google/common/a/es;

    move-result-object v1

    .line 113
    new-instance v9, Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-direct {v9, v1, v0}, Lcom/facebook/orca/threads/ThreadsCollection;-><init>(Lcom/google/common/a/es;Z)V

    .line 115
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->b()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/g/k;->b(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v11

    .line 118
    invoke-virtual {v1}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 119
    iget-object v12, p0, Lcom/facebook/orca/g/k;->g:Lcom/facebook/orca/g/e;

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v0

    invoke-virtual {v12, v0, v1}, Lcom/facebook/orca/g/e;->a(J)V

    .line 122
    :cond_1
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadListResult;->newBuilder()Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/fbservice/c/b;)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0, v9}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/threads/ThreadsCollection;)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0, v10}, Lcom/facebook/orca/server/aa;->a(Lcom/google/common/a/es;)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0, v11}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/threads/FolderCounts;)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Lcom/facebook/orca/server/aa;->a(J)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0, v7, v8}, Lcom/facebook/orca/server/aa;->b(J)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/aa;->o()Lcom/facebook/orca/server/FetchThreadListResult;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 132
    invoke-virtual {v3}, Lcom/facebook/debug/d/e;->a()J

    goto/16 :goto_0

    .line 90
    :cond_2
    :try_start_2
    sget-object v2, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_1

    .line 132
    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Lcom/facebook/debug/d/e;->a()J

    throw v0

    :cond_3
    move v0, v1

    goto :goto_2
.end method
