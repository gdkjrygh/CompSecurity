.class public final Lkik/android/h/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/h/h$a;
    }
.end annotation


# instance fields
.field private final a:Lkik/android/h/h$a;

.field private b:Lkik/a/d/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Lkik/android/h/h$a;

    invoke-direct {v0, p1}, Lkik/android/h/h$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lkik/android/h/h;->a:Lkik/android/h/h$a;

    .line 26
    return-void
.end method

.method private b(Lkik/a/d/h;)Z
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 57
    if-nez p1, :cond_0

    .line 79
    :goto_0
    return v0

    .line 60
    :cond_0
    iget-object v2, p0, Lkik/android/h/h;->a:Lkik/android/h/h$a;

    monitor-enter v2

    .line 61
    :try_start_0
    iget-object v1, p0, Lkik/android/h/h;->a:Lkik/android/h/h$a;

    invoke-virtual {v1}, Lkik/android/h/h$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 62
    const/4 v1, 0x1

    .line 64
    :try_start_1
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 65
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    const-string v5, "core_id"

    invoke-virtual {p1}, Lkik/a/d/h;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "is_active"

    invoke-virtual {p1}, Lkik/a/d/h;->c()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v5, "username"

    invoke-virtual {p1}, Lkik/a/d/h;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const-string v5, "CoreTable"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "core_id =\'"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lkik/a/d/h;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\'"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v3, v5, v4, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    if-nez v5, :cond_1

    .line 68
    const-string v5, "CoreTable"

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6, v4}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 70
    :cond_1
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    :try_start_2
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    move v0, v1

    .line 79
    :goto_1
    monitor-exit v2

    goto :goto_0

    .line 80
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 73
    :catch_0
    move-exception v1

    .line 76
    :try_start_3
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 10

    .prologue
    .line 96
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 97
    iget-object v9, p0, Lkik/android/h/h;->a:Lkik/android/h/h$a;

    monitor-enter v9

    .line 98
    :try_start_0
    iget-object v0, p0, Lkik/android/h/h;->a:Lkik/android/h/h$a;

    invoke-virtual {v0}, Lkik/android/h/h$a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "CoreTable"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 99
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 101
    :cond_0
    const-string v0, "core_id"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v0, "is_active"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    const-string v3, "username"

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lkik/a/d/h;

    invoke-direct {v4, v2, v0, v3}, Lkik/a/d/h;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 102
    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 105
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 107
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 108
    monitor-exit v9

    .line 110
    return-object v8

    .line 101
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 108
    :catchall_0
    move-exception v0

    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lkik/android/h/h;->b:Lkik/a/d/h;

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lkik/android/h/h;->b:Lkik/a/d/h;

    invoke-virtual {v0, p1}, Lkik/a/d/h;->a(Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lkik/android/h/h;->b:Lkik/a/d/h;

    invoke-direct {p0, v0}, Lkik/android/h/h;->b(Lkik/a/d/h;)Z

    .line 53
    :cond_0
    return-void
.end method

.method public final a(Lkik/a/d/h;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 31
    if-nez p1, :cond_0

    .line 42
    :goto_0
    return v0

    .line 34
    :cond_0
    iget-object v1, p0, Lkik/android/h/h;->a:Lkik/android/h/h$a;

    monitor-enter v1

    .line 35
    :try_start_0
    iget-object v0, p0, Lkik/android/h/h;->b:Lkik/a/d/h;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/h/h;->b:Lkik/a/d/h;

    invoke-virtual {v0}, Lkik/a/d/h;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/h/h;->b:Lkik/a/d/h;

    invoke-virtual {v0}, Lkik/a/d/h;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lkik/a/d/h;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 36
    iget-object v0, p0, Lkik/android/h/h;->b:Lkik/a/d/h;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lkik/a/d/h;->a(Z)V

    .line 37
    iget-object v0, p0, Lkik/android/h/h;->b:Lkik/a/d/h;

    invoke-direct {p0, v0}, Lkik/android/h/h;->b(Lkik/a/d/h;)Z

    .line 40
    :cond_1
    iput-object p1, p0, Lkik/android/h/h;->b:Lkik/a/d/h;

    .line 41
    iget-object v0, p0, Lkik/android/h/h;->b:Lkik/a/d/h;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lkik/a/d/h;->a(Z)V

    .line 42
    iget-object v0, p0, Lkik/android/h/h;->b:Lkik/a/d/h;

    invoke-direct {p0, v0}, Lkik/android/h/h;->b(Lkik/a/d/h;)Z

    move-result v0

    monitor-exit v1

    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 116
    if-nez p1, :cond_0

    .line 140
    :goto_0
    return v0

    .line 119
    :cond_0
    iget-object v2, p0, Lkik/android/h/h;->a:Lkik/android/h/h$a;

    monitor-enter v2

    .line 120
    :try_start_0
    iget-object v3, p0, Lkik/android/h/h;->a:Lkik/android/h/h$a;

    invoke-virtual {v3}, Lkik/android/h/h$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 121
    :try_start_1
    iget-object v4, p0, Lkik/android/h/h;->b:Lkik/a/d/h;

    if-eqz v4, :cond_1

    iget-object v4, p0, Lkik/android/h/h;->b:Lkik/a/d/h;

    invoke-virtual {v4}, Lkik/a/d/h;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 125
    const/4 v4, 0x0

    iput-object v4, p0, Lkik/android/h/h;->b:Lkik/a/d/h;

    .line 127
    :cond_1
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 129
    const-string v4, "CoreTable"

    const-string v5, "core_id=?"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/String;

    const/4 v7, 0x0

    aput-object p1, v6, v7

    invoke-virtual {v3, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    .line 130
    if-lez v4, :cond_2

    .line 131
    :goto_1
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 137
    :try_start_2
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    move v0, v1

    .line 140
    :goto_2
    monitor-exit v2

    goto :goto_0

    .line 141
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_2
    move v1, v0

    .line 130
    goto :goto_1

    .line 134
    :catch_0
    move-exception v1

    .line 137
    :try_start_3
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
.end method
