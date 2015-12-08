.class public final Lcom/kik/l/aq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/database/sqlite/SQLiteOpenHelper;


# direct methods
.method public constructor <init>(Landroid/database/sqlite/SQLiteOpenHelper;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/kik/l/aq;->a:Landroid/database/sqlite/SQLiteOpenHelper;

    .line 22
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/HashMap;
    .locals 5

    .prologue
    .line 50
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 51
    iget-object v2, p0, Lcom/kik/l/aq;->a:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v2

    .line 52
    :try_start_0
    iget-object v0, p0, Lcom/kik/l/aq;->a:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 53
    const-class v3, Lcom/kik/l/ap;

    const-string v4, "suggestedResponseTable"

    invoke-static {v0, v3, v4}, Lcom/kik/l/ap;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/Class;Ljava/lang/String;)Lcom/kik/l/y;

    move-result-object v0

    check-cast v0, Lcom/kik/l/ap;

    .line 55
    new-instance v3, Lcom/kik/l/ar;

    invoke-direct {v3, p0, v1}, Lcom/kik/l/ar;-><init>(Lcom/kik/l/aq;Ljava/util/HashMap;)V

    invoke-virtual {v0, v3}, Lcom/kik/l/ap;->a(Lcom/kik/l/y$a;)V

    .line 67
    monitor-exit v2

    return-object v1

    .line 68
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Ljava/util/List;Ljava/lang/String;)Z
    .locals 9

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 26
    iget-object v2, p0, Lcom/kik/l/aq;->a:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v2

    .line 27
    :try_start_0
    iget-object v3, p0, Lcom/kik/l/aq;->a:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v3

    .line 30
    :try_start_1
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 31
    invoke-static {p1, p2}, Lcom/kik/l/ap;->a(Ljava/util/List;Ljava/lang/String;)Landroid/content/ContentValues;

    move-result-object v4

    .line 32
    const-string v5, "suggestedResponseTable"

    const-string v6, "bin_id = ?"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/String;

    const/4 v8, 0x0

    aput-object p2, v7, v8

    invoke-virtual {v3, v5, v4, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    if-nez v5, :cond_0

    .line 33
    const-string v5, "suggestedResponseTable"

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6, v4}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 35
    :cond_0
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    :try_start_2
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 44
    monitor-exit v2

    :goto_0
    return v0

    .line 38
    :catch_0
    move-exception v0

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    monitor-exit v2

    move v0, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 45
    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method
