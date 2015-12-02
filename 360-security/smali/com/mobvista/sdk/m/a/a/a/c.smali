.class public Lcom/mobvista/sdk/m/a/a/a/c;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field protected a:Lcom/mobvista/sdk/m/a/a/a/a;


# direct methods
.method public constructor <init>(Lcom/mobvista/sdk/m/a/a/a/a;)V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/a/a/c;->a:Lcom/mobvista/sdk/m/a/a/a/a;

    .line 16
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/a/a/c;->a:Lcom/mobvista/sdk/m/a/a/a/a;

    .line 17
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 47
    const-class v1, Lcom/mobvista/sdk/m/a/a/a/c;

    monitor-enter v1

    .line 48
    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/a/c;->a:Lcom/mobvista/sdk/m/a/a/a/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/a/a/a;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    .line 49
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 41
    const-class v1, Lcom/mobvista/sdk/m/a/a/a/c;

    monitor-enter v1

    .line 42
    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/a/c;->a:Lcom/mobvista/sdk/m/a/a/a/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/a/a/a;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    .line 43
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    .locals 4

    .prologue
    .line 35
    const-class v1, Lcom/mobvista/sdk/m/a/a/a/c;

    monitor-enter v1

    .line 36
    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/a/c;->a:Lcom/mobvista/sdk/m/a/a/a/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/a/a/a;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, p3}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v2

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-wide v2

    .line 37
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 3

    .prologue
    .line 70
    const-class v1, Lcom/mobvista/sdk/m/a/a/a/c;

    monitor-enter v1

    .line 71
    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/a/c;->a:Lcom/mobvista/sdk/m/a/a/a/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/a/a/a;->b()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 72
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 9

    .prologue
    .line 64
    const-class v8, Lcom/mobvista/sdk/m/a/a/a/c;

    monitor-enter v8

    .line 65
    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/a/c;->a:Lcom/mobvista/sdk/m/a/a/a/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/a/a/a;->b()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 66
    :catchall_0
    move-exception v0

    monitor-exit v8

    throw v0
.end method

.method public final a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 10

    .prologue
    .line 56
    const-class v9, Lcom/mobvista/sdk/m/a/a/a/c;

    monitor-enter v9

    .line 57
    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/a/c;->a:Lcom/mobvista/sdk/m/a/a/a/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/a/a/a;->b()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 58
    :catchall_0
    move-exception v0

    monitor-exit v9

    throw v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 29
    const-class v1, Lcom/mobvista/sdk/m/a/a/a/c;

    monitor-enter v1

    .line 30
    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/a/c;->a:Lcom/mobvista/sdk/m/a/a/a/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/a/a/a;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 31
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method protected final c()Lcom/mobvista/sdk/m/a/a/a/c;
    .locals 0

    .prologue
    .line 20
    return-object p0
.end method

.method protected final d()Lcom/mobvista/sdk/m/a/a/a/c;
    .locals 0

    .prologue
    .line 24
    return-object p0
.end method
