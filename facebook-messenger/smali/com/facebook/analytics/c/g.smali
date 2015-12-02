.class public Lcom/facebook/analytics/c/g;
.super Ljava/lang/Object;
.source "AnalyticsStorage.java"


# static fields
.field private static final a:[Ljava/lang/String;

.field private static final b:[Ljava/lang/String;

.field private static final c:[Ljava/lang/String;


# instance fields
.field private final d:Lcom/facebook/analytics/c/a;

.field private final e:Lcom/facebook/analytics/c/e;

.field private final f:Landroid/content/Context;

.field private final g:Lcom/facebook/common/time/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 37
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "id"

    aput-object v1, v0, v3

    const-string v1, "sid"

    aput-object v1, v0, v4

    const-string v1, "uid"

    aput-object v1, v0, v5

    const/4 v1, 0x3

    const-string v2, "seq"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "timestamp"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "active"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "meta"

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/analytics/c/g;->a:[Ljava/lang/String;

    .line 47
    new-array v0, v5, [Ljava/lang/String;

    const-string v1, "data"

    aput-object v1, v0, v3

    const-string v1, "timestamp"

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/analytics/c/g;->b:[Ljava/lang/String;

    .line 52
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "timestamp"

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/analytics/c/g;->c:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/analytics/c/a;Lcom/facebook/analytics/c/e;Lcom/facebook/common/time/a;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, Lcom/facebook/analytics/c/g;->f:Landroid/content/Context;

    .line 84
    iput-object p2, p0, Lcom/facebook/analytics/c/g;->d:Lcom/facebook/analytics/c/a;

    .line 85
    iput-object p3, p0, Lcom/facebook/analytics/c/g;->e:Lcom/facebook/analytics/c/e;

    .line 86
    iput-object p4, p0, Lcom/facebook/analytics/c/g;->g:Lcom/facebook/common/time/a;

    .line 87
    return-void
.end method

.method private a(Lcom/facebook/analytics/c/f;J)V
    .locals 5

    .prologue
    .line 103
    iget-object v0, p0, Lcom/facebook/analytics/c/g;->d:Lcom/facebook/analytics/c/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/c/a;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 104
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 107
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/analytics/c/g;->e()V

    .line 110
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 111
    const-string v2, "id"

    invoke-virtual {p1}, Lcom/facebook/analytics/c/f;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    const-string v2, "sid"

    invoke-virtual {p1}, Lcom/facebook/analytics/c/f;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    const-string v2, "uid"

    invoke-virtual {p1}, Lcom/facebook/analytics/c/f;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    const-string v2, "seq"

    invoke-virtual {p1}, Lcom/facebook/analytics/c/f;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 115
    const-string v2, "timestamp"

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 116
    const-string v2, "active"

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 117
    const-string v2, "batches"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 118
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 122
    return-void

    .line 120
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 399
    iget-object v0, p0, Lcom/facebook/analytics/c/g;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/common/e/h;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    .line 400
    if-eqz v0, :cond_0

    .line 401
    const-string v1, "AnalyticsStorage"

    invoke-interface {v0, v1, p1, p2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 403
    :cond_0
    return-void
.end method

.method private declared-synchronized d(Lcom/facebook/analytics/c/f;)V
    .locals 4

    .prologue
    .line 406
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lorg/acra/ErrorReporter;->getInstance()Lorg/acra/ErrorReporter;

    move-result-object v0

    .line 407
    invoke-virtual {p1}, Lcom/facebook/analytics/c/f;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 408
    const-string v1, "marauder_session_id"

    invoke-virtual {p1}, Lcom/facebook/analytics/c/f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/acra/ErrorReporter;->putCustomData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 409
    const-string v1, "marauder_batch_id"

    invoke-virtual {p1}, Lcom/facebook/analytics/c/f;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/acra/ErrorReporter;->putCustomData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 414
    :goto_0
    monitor-exit p0

    return-void

    .line 411
    :cond_0
    :try_start_1
    const-string v1, "marauder_session_id"

    invoke-virtual {v0, v1}, Lorg/acra/ErrorReporter;->removeCustomData(Ljava/lang/String;)Ljava/lang/String;

    .line 412
    const-string v1, "marauder_batch_id"

    invoke-virtual {v0, v1}, Lorg/acra/ErrorReporter;->removeCustomData(Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 406
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private e()V
    .locals 5

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/analytics/c/g;->d:Lcom/facebook/analytics/c/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/c/a;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 91
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 93
    :try_start_0
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 94
    const-string v2, "active"

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 95
    const-string v2, "batches"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 96
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 100
    return-void

    .line 98
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method private f()Lcom/facebook/analytics/c/f;
    .locals 9

    .prologue
    const/4 v1, 0x0

    const-wide/16 v3, 0x0

    .line 395
    new-instance v0, Lcom/facebook/analytics/c/f;

    move-object v2, v1

    move-wide v5, v3

    move-wide v7, v3

    invoke-direct/range {v0 .. v8}, Lcom/facebook/analytics/c/f;-><init>(Ljava/lang/String;Ljava/lang/String;JJJ)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 161
    iget-object v0, p0, Lcom/facebook/analytics/c/g;->d:Lcom/facebook/analytics/c/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/c/a;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 162
    const-string v1, "events"

    sget-object v2, Lcom/facebook/analytics/c/g;->c:[Ljava/lang/String;

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    move-object v7, v3

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 165
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    .line 167
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return v1

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    throw v1
.end method

.method public a(Lcom/facebook/analytics/c/f;Lcom/facebook/analytics/c/f;)Lcom/facebook/analytics/c/f;
    .locals 0

    .prologue
    .line 358
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    invoke-virtual {p0, p1}, Lcom/facebook/analytics/c/g;->b(Lcom/facebook/analytics/c/f;)V

    .line 360
    if-nez p2, :cond_0

    .line 361
    invoke-direct {p0}, Lcom/facebook/analytics/c/g;->f()Lcom/facebook/analytics/c/f;

    move-result-object p2

    .line 363
    :cond_0
    invoke-direct {p0, p2}, Lcom/facebook/analytics/c/g;->d(Lcom/facebook/analytics/c/f;)V

    .line 364
    invoke-virtual {p0, p2}, Lcom/facebook/analytics/c/g;->a(Lcom/facebook/analytics/c/f;)V

    .line 365
    return-object p2
.end method

.method public a(Lcom/facebook/analytics/c/f;Ljava/lang/String;)Lcom/facebook/analytics/c/f;
    .locals 9

    .prologue
    const-wide/16 v3, 0x0

    .line 333
    new-instance v0, Lcom/facebook/analytics/c/f;

    invoke-static {}, Lcom/facebook/common/h/a;->a()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, p2

    move-wide v5, v3

    move-wide v7, v3

    invoke-direct/range {v0 .. v8}, Lcom/facebook/analytics/c/f;-><init>(Ljava/lang/String;Ljava/lang/String;JJJ)V

    .line 341
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/analytics/c/f;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 342
    invoke-virtual {p0, p1, v0}, Lcom/facebook/analytics/c/g;->a(Lcom/facebook/analytics/c/f;Lcom/facebook/analytics/c/f;)Lcom/facebook/analytics/c/f;

    .line 348
    :goto_0
    return-object v0

    .line 344
    :cond_0
    invoke-direct {p0, v0}, Lcom/facebook/analytics/c/g;->d(Lcom/facebook/analytics/c/f;)V

    .line 345
    invoke-virtual {p0, v0}, Lcom/facebook/analytics/c/g;->a(Lcom/facebook/analytics/c/f;)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/analytics/am;Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 147
    iget-object v0, p0, Lcom/facebook/analytics/c/g;->d:Lcom/facebook/analytics/c/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/c/a;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 148
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 149
    const-string v2, "bid"

    invoke-virtual {v1, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    const-string v2, "type"

    invoke-interface {p1}, Lcom/facebook/analytics/am;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    const-string v2, "data"

    invoke-interface {p1}, Lcom/facebook/analytics/am;->e()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    const-string v2, "timestamp"

    invoke-interface {p1}, Lcom/facebook/analytics/am;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 153
    const-string v2, "events"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 154
    return-void
.end method

.method public a(Lcom/facebook/analytics/c/f;)V
    .locals 5

    .prologue
    .line 298
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/c/g;->d:Lcom/facebook/analytics/c/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/c/a;->e()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 307
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 310
    :try_start_1
    iget-object v0, p0, Lcom/facebook/analytics/c/g;->e:Lcom/facebook/analytics/c/e;

    sget-object v2, Lcom/facebook/analytics/c/b;->d:Lcom/facebook/analytics/c/c;

    invoke-virtual {p1}, Lcom/facebook/analytics/c/f;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/facebook/analytics/c/e;->b(Lcom/facebook/common/s/a;Ljava/lang/String;)V

    .line 312
    iget-object v0, p0, Lcom/facebook/analytics/c/g;->e:Lcom/facebook/analytics/c/e;

    sget-object v2, Lcom/facebook/analytics/c/b;->e:Lcom/facebook/analytics/c/c;

    invoke-virtual {p1}, Lcom/facebook/analytics/c/f;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/facebook/analytics/c/e;->b(Lcom/facebook/common/s/a;Ljava/lang/String;)V

    .line 314
    iget-object v0, p0, Lcom/facebook/analytics/c/g;->e:Lcom/facebook/analytics/c/e;

    sget-object v2, Lcom/facebook/analytics/c/b;->c:Lcom/facebook/analytics/c/c;

    invoke-virtual {p1}, Lcom/facebook/analytics/c/f;->g()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Lcom/facebook/analytics/c/e;->b(Lcom/facebook/common/s/a;J)V

    .line 316
    iget-object v0, p0, Lcom/facebook/analytics/c/g;->e:Lcom/facebook/analytics/c/e;

    sget-object v2, Lcom/facebook/analytics/c/b;->b:Lcom/facebook/analytics/c/c;

    invoke-virtual {p1}, Lcom/facebook/analytics/c/f;->f()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Lcom/facebook/analytics/c/e;->b(Lcom/facebook/common/s/a;J)V

    .line 318
    iget-object v0, p0, Lcom/facebook/analytics/c/g;->e:Lcom/facebook/analytics/c/e;

    sget-object v2, Lcom/facebook/analytics/c/b;->f:Lcom/facebook/analytics/c/c;

    invoke-virtual {p1}, Lcom/facebook/analytics/c/f;->b()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Lcom/facebook/analytics/c/e;->b(Lcom/facebook/common/s/a;J)V

    .line 320
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 322
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 324
    :goto_0
    return-void

    .line 303
    :catch_0
    move-exception v0

    .line 304
    const-string v1, "Cannot save AnalyticsSession to database"

    invoke-direct {p0, v1, v0}, Lcom/facebook/analytics/c/g;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 322
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 129
    iget-object v0, p0, Lcom/facebook/analytics/c/g;->d:Lcom/facebook/analytics/c/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/c/a;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 130
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 131
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    .line 133
    :try_start_0
    const-string v2, "events"

    const-string v3, "bid=?"

    invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 134
    const-string v2, "batches"

    const-string v3, "id=?"

    invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 135
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 139
    return-void

    .line 137
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .prologue
    .line 229
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 230
    iget-object v0, p0, Lcom/facebook/analytics/c/g;->d:Lcom/facebook/analytics/c/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/c/a;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 232
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 234
    :try_start_0
    const-string v1, "events"

    sget-object v2, Lcom/facebook/analytics/c/g;->b:[Ljava/lang/String;

    const-string v3, "bid=?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "timestamp"

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v2

    .line 243
    :goto_0
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 244
    const/4 v1, 0x0

    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 245
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_0

    .line 246
    const-string v3, ","

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    :cond_0
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 251
    :catchall_0
    move-exception v1

    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 254
    :catchall_1
    move-exception v1

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v1

    .line 251
    :cond_1
    :try_start_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 254
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 256
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/analytics/c/h;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v11, 0x1

    const/4 v12, 0x0

    .line 176
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 177
    iget-object v0, p0, Lcom/facebook/analytics/c/g;->d:Lcom/facebook/analytics/c/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/c/a;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 178
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 180
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/analytics/c/g;->c()V

    .line 181
    const-string v1, "batches"

    sget-object v2, Lcom/facebook/analytics/c/g;->a:[Ljava/lang/String;

    const-string v3, "active=0"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "timestamp"

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v14

    .line 184
    :goto_0
    :try_start_1
    invoke-interface {v14}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 185
    const/4 v1, 0x0

    invoke-interface {v14, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 186
    const/4 v1, 0x1

    invoke-interface {v14, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 187
    const/4 v1, 0x2

    invoke-interface {v14, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 188
    const/4 v1, 0x3

    invoke-interface {v14, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    .line 189
    const/4 v1, 0x4

    invoke-interface {v14, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    .line 190
    const/4 v1, 0x5

    invoke-interface {v14, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    if-lez v1, :cond_0

    move v10, v11

    .line 191
    :goto_1
    new-instance v1, Lcom/facebook/analytics/c/h;

    move-object v2, p0

    invoke-direct/range {v1 .. v10}, Lcom/facebook/analytics/c/h;-><init>(Lcom/facebook/analytics/c/g;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JZ)V

    .line 192
    invoke-interface {v13, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 195
    :catchall_0
    move-exception v1

    :try_start_2
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 196
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 199
    :catchall_1
    move-exception v1

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v1

    :cond_0
    move v10, v12

    .line 190
    goto :goto_1

    .line 195
    :cond_1
    :try_start_3
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 196
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 199
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 202
    return-object v13
.end method

.method public b(Lcom/facebook/analytics/c/f;)V
    .locals 2

    .prologue
    .line 373
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    invoke-direct {p0}, Lcom/facebook/analytics/c/g;->e()V

    .line 375
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/facebook/analytics/c/f;->a(Z)V

    .line 376
    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/c/f;->c(J)V

    .line 377
    return-void
.end method

.method public c()V
    .locals 8

    .prologue
    .line 209
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x7b98a00

    sub-long/2addr v0, v2

    .line 210
    iget-object v2, p0, Lcom/facebook/analytics/c/g;->d:Lcom/facebook/analytics/c/a;

    invoke-virtual {v2}, Lcom/facebook/analytics/c/a;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 211
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 213
    :try_start_0
    const-string v3, "events"

    const-string v4, "timestamp<?"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-virtual {v2, v3, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 215
    const-string v3, "batches"

    const-string v4, "timestamp<?"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v6

    invoke-virtual {v2, v3, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 217
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 219
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 221
    return-void

    .line 219
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method public c(Lcom/facebook/analytics/c/f;)V
    .locals 2

    .prologue
    .line 384
    invoke-virtual {p1}, Lcom/facebook/analytics/c/f;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 385
    invoke-virtual {p1}, Lcom/facebook/analytics/c/f;->k()V

    .line 386
    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/c/f;->c(J)V

    .line 387
    iget-object v0, p0, Lcom/facebook/analytics/c/g;->g:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/analytics/c/g;->a(Lcom/facebook/analytics/c/f;J)V

    .line 388
    invoke-virtual {p0, p1}, Lcom/facebook/analytics/c/g;->a(Lcom/facebook/analytics/c/f;)V

    .line 389
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/facebook/analytics/c/f;->a(Z)V

    .line 390
    invoke-direct {p0, p1}, Lcom/facebook/analytics/c/g;->d(Lcom/facebook/analytics/c/f;)V

    .line 392
    :cond_0
    return-void
.end method

.method public d()Lcom/facebook/analytics/c/f;
    .locals 12

    .prologue
    .line 267
    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/c/g;->d:Lcom/facebook/analytics/c/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/c/a;->e()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v9

    .line 275
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 277
    :try_start_1
    new-instance v0, Lcom/facebook/analytics/c/f;

    iget-object v1, p0, Lcom/facebook/analytics/c/g;->e:Lcom/facebook/analytics/c/e;

    sget-object v2, Lcom/facebook/analytics/c/b;->d:Lcom/facebook/analytics/c/c;

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/c/e;->a(Lcom/facebook/common/s/a;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/analytics/c/g;->e:Lcom/facebook/analytics/c/e;

    sget-object v3, Lcom/facebook/analytics/c/b;->e:Lcom/facebook/analytics/c/c;

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/c/e;->a(Lcom/facebook/common/s/a;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/analytics/c/g;->e:Lcom/facebook/analytics/c/e;

    sget-object v4, Lcom/facebook/analytics/c/b;->c:Lcom/facebook/analytics/c/c;

    const-wide/16 v5, 0x0

    invoke-virtual {v3, v4, v5, v6}, Lcom/facebook/analytics/c/e;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v3

    iget-object v5, p0, Lcom/facebook/analytics/c/g;->e:Lcom/facebook/analytics/c/e;

    sget-object v6, Lcom/facebook/analytics/c/b;->b:Lcom/facebook/analytics/c/c;

    const-wide/16 v7, 0x0

    invoke-virtual {v5, v6, v7, v8}, Lcom/facebook/analytics/c/e;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v5

    iget-object v7, p0, Lcom/facebook/analytics/c/g;->e:Lcom/facebook/analytics/c/e;

    sget-object v8, Lcom/facebook/analytics/c/b;->f:Lcom/facebook/analytics/c/c;

    const-wide/16 v10, 0x0

    invoke-virtual {v7, v8, v10, v11}, Lcom/facebook/analytics/c/e;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v7

    invoke-direct/range {v0 .. v8}, Lcom/facebook/analytics/c/f;-><init>(Ljava/lang/String;Ljava/lang/String;JJJ)V

    .line 286
    invoke-direct {p0, v0}, Lcom/facebook/analytics/c/g;->d(Lcom/facebook/analytics/c/f;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 289
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    :goto_0
    return-object v0

    .line 268
    :catch_0
    move-exception v0

    .line 269
    const-string v1, "Cannot load AnalyticsSession from database"

    invoke-direct {p0, v1, v0}, Lcom/facebook/analytics/c/g;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 270
    invoke-direct {p0}, Lcom/facebook/analytics/c/g;->f()Lcom/facebook/analytics/c/f;

    move-result-object v0

    .line 271
    invoke-direct {p0, v0}, Lcom/facebook/analytics/c/g;->d(Lcom/facebook/analytics/c/f;)V

    goto :goto_0

    .line 289
    :catchall_0
    move-exception v0

    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method
