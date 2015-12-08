.class public final Lcom/kik/l/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/l/a$a;,
        Lcom/kik/l/a$b;
    }
.end annotation


# instance fields
.field private a:Lkik/a/e/v;

.field private b:Lkik/android/d/c;

.field private final c:Lcom/kik/l/a$b;


# direct methods
.method public constructor <init>(Lkik/a/e/v;Landroid/content/Context;Lkik/android/util/ce;)V
    .locals 10

    .prologue
    const-wide/32 v8, 0x5265c00

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/kik/l/a;->a:Lkik/a/e/v;

    .line 46
    invoke-static {p2}, Lkik/android/d/d;->a(Landroid/content/Context;)Lkik/android/d/c;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/l/a;->b:Lkik/android/d/c;

    .line 47
    new-instance v0, Lcom/kik/l/a$b;

    invoke-interface {p1}, Lkik/a/e/v;->m()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, p2, v1}, Lcom/kik/l/a$b;-><init>(Lcom/kik/l/a;Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/kik/l/a;->c:Lcom/kik/l/a$b;

    .line 49
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    iget-object v7, p0, Lcom/kik/l/a;->b:Lkik/android/d/c;

    new-instance v0, Lkik/android/d/k;

    const-string v2, "ab-service-refetch-interval"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v1, 0x4

    new-array v4, v1, [Ljava/lang/Long;

    const/4 v1, 0x0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v1

    const/4 v1, 0x1

    const-wide/32 v8, 0x36ee80

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v1

    const/4 v1, 0x2

    const-wide/32 v8, 0x493e0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v1

    const/4 v1, 0x3

    const-wide/32 v8, 0xea60

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v1

    const/4 v5, 0x0

    move-object v1, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lkik/android/d/k;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Long;[Ljava/lang/Long;Ljava/lang/Runnable;Lkik/android/util/ar;)V

    invoke-interface {v7, v0}, Lkik/android/d/c;->a(Lkik/android/d/b;)Z

    .line 63
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 5

    .prologue
    .line 68
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 69
    iget-object v2, p0, Lcom/kik/l/a;->c:Lcom/kik/l/a$b;

    monitor-enter v2

    .line 70
    :try_start_0
    iget-object v0, p0, Lcom/kik/l/a;->c:Lcom/kik/l/a$b;

    invoke-virtual {v0}, Lcom/kik/l/a$b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 72
    const-class v3, Lcom/kik/l/a$a;

    const-string v4, "abTestingTable"

    invoke-static {v0, v3, v4}, Lcom/kik/l/a$a;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/Class;Ljava/lang/String;)Lcom/kik/l/y;

    move-result-object v0

    check-cast v0, Lcom/kik/l/a$a;

    .line 74
    new-instance v3, Lcom/kik/l/b;

    invoke-direct {v3, p0, v1}, Lcom/kik/l/b;-><init>(Lcom/kik/l/a;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v3}, Lcom/kik/l/a$a;->a(Lcom/kik/l/y$a;)V

    .line 83
    monitor-exit v2

    .line 85
    return-object v1

    .line 83
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(J)V
    .locals 3

    .prologue
    .line 201
    iget-object v0, p0, Lcom/kik/l/a;->a:Lkik/a/e/v;

    const-string v1, "abLastFetched"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Long;)Z

    .line 202
    return-void
.end method

.method public final a(Ljava/util/List;)Z
    .locals 5

    .prologue
    .line 91
    iget-object v0, p0, Lcom/kik/l/a;->c:Lcom/kik/l/a$b;

    invoke-virtual {v0}, Lcom/kik/l/a$b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 92
    :try_start_0
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 98
    const-string v0, "abTestingTable"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 100
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/a/a;

    .line 101
    invoke-static {v0}, Lcom/kik/l/a$a;->a(Lkik/a/a/a;)Landroid/content/ContentValues;

    move-result-object v0

    .line 102
    const-string v3, "abTestingTable"

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 110
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    .line 113
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 116
    :goto_1
    return v0

    .line 105
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    const/4 v0, 0x1

    .line 113
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method public final b(J)J
    .locals 3

    .prologue
    .line 212
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 215
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v1

    if-nez v1, :cond_0

    .line 216
    const v1, 0x6ddd00

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v0, p1

    .line 219
    :goto_0
    return-wide v0

    :cond_0
    const v1, 0x493e0

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v0, p1

    goto :goto_0
.end method

.method public final b()Ljava/util/List;
    .locals 5

    .prologue
    .line 122
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 123
    iget-object v2, p0, Lcom/kik/l/a;->c:Lcom/kik/l/a$b;

    monitor-enter v2

    .line 124
    :try_start_0
    iget-object v0, p0, Lcom/kik/l/a;->c:Lcom/kik/l/a$b;

    invoke-virtual {v0}, Lcom/kik/l/a$b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 126
    const-class v3, Lcom/kik/l/a$a;

    const-string v4, "abTestingOverrideTable"

    invoke-static {v0, v3, v4}, Lcom/kik/l/a$a;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/Class;Ljava/lang/String;)Lcom/kik/l/y;

    move-result-object v0

    check-cast v0, Lcom/kik/l/a$a;

    .line 128
    new-instance v3, Lcom/kik/l/c;

    invoke-direct {v3, p0, v1}, Lcom/kik/l/c;-><init>(Lcom/kik/l/a;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v3}, Lcom/kik/l/a$a;->a(Lcom/kik/l/y$a;)V

    .line 137
    monitor-exit v2

    .line 139
    return-object v1

    .line 137
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b(Ljava/util/List;)Z
    .locals 5

    .prologue
    .line 145
    iget-object v0, p0, Lcom/kik/l/a;->c:Lcom/kik/l/a$b;

    invoke-virtual {v0}, Lcom/kik/l/a$b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 146
    :try_start_0
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 152
    const-string v0, "abTestingOverrideTable"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 154
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/a/a;

    .line 155
    invoke-static {v0}, Lcom/kik/l/a$a;->a(Lkik/a/a/a;)Landroid/content/ContentValues;

    move-result-object v0

    .line 156
    const-string v3, "abTestingOverrideTable"

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 163
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    .line 166
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 169
    :goto_1
    return v0

    .line 159
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    const/4 v0, 0x1

    .line 166
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lcom/kik/l/a;->c:Lcom/kik/l/a$b;

    invoke-virtual {v0}, Lcom/kik/l/a$b;->a()V

    .line 183
    return-void
.end method

.method public final c(J)V
    .locals 3

    .prologue
    .line 226
    iget-object v0, p0, Lcom/kik/l/a;->a:Lkik/a/e/v;

    const-string v1, "abUpgradeFetchTimestamp"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Long;)Z

    .line 227
    return-void
.end method

.method public final d()J
    .locals 4

    .prologue
    .line 189
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 190
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 191
    const v1, 0x6ddd00

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    const v1, 0x36ee80

    sub-int/2addr v0, v1

    int-to-long v0, v0

    .line 192
    const-wide/32 v2, 0x5265c00

    add-long/2addr v0, v2

    .line 196
    :goto_0
    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/kik/l/a;->b:Lkik/android/d/c;

    const-string v1, "ab-service-refetch-interval"

    invoke-interface {v0, v1}, Lkik/android/d/c;->a(Ljava/lang/String;)Lkik/android/d/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/d/b;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0
.end method

.method public final e()J
    .locals 2

    .prologue
    .line 206
    iget-object v0, p0, Lcom/kik/l/a;->a:Lkik/a/e/v;

    const-string v1, "abLastFetched"

    invoke-interface {v0, v1}, Lkik/a/e/v;->o(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final f()J
    .locals 2

    .prologue
    .line 232
    iget-object v0, p0, Lcom/kik/l/a;->a:Lkik/a/e/v;

    const-string v1, "abUpgradeFetchTimestamp"

    invoke-interface {v0, v1}, Lkik/a/e/v;->o(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final g()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 238
    iget-object v0, p0, Lcom/kik/l/a;->a:Lkik/a/e/v;

    invoke-interface {v0}, Lkik/a/e/v;->d()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method
