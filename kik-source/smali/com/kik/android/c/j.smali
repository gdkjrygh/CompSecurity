.class public final Lcom/kik/android/c/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/android/c/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/android/c/j$a;,
        Lcom/kik/android/c/j$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/kik/android/c/j$b;

.field private final b:Lcom/kik/android/c/j$a;

.field private final c:Lkik/a/e/v;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lkik/a/e/v;)V
    .locals 2

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p2, p0, Lcom/kik/android/c/j;->c:Lkik/a/e/v;

    .line 37
    new-instance v0, Lcom/kik/android/c/j$b;

    invoke-interface {p2}, Lkik/a/e/v;->m()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lcom/kik/android/c/j$b;-><init>(Lcom/kik/android/c/j;Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/kik/android/c/j;->a:Lcom/kik/android/c/j$b;

    .line 38
    new-instance v0, Lcom/kik/android/c/j$a;

    invoke-interface {p2}, Lkik/a/e/v;->m()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lcom/kik/android/c/j$a;-><init>(Lcom/kik/android/c/j;Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/kik/android/c/j;->b:Lcom/kik/android/c/j$a;

    .line 40
    iget-object v0, p0, Lcom/kik/android/c/j;->a:Lcom/kik/android/c/j$b;

    invoke-virtual {v0}, Lcom/kik/android/c/j$b;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 41
    iget-object v0, p0, Lcom/kik/android/c/j;->b:Lcom/kik/android/c/j$a;

    invoke-virtual {v0}, Lcom/kik/android/c/j$a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 42
    return-void
.end method

.method private static a(Landroid/database/Cursor;)Lcom/kik/android/c/a;
    .locals 3

    .prologue
    .line 192
    const-string v0, "smiley_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 193
    const-string v1, "smiley_category"

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 194
    new-instance v2, Lcom/kik/android/c/a;

    invoke-direct {v2, v1, v0}, Lcom/kik/android/c/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method private static a(Landroid/database/Cursor;Ljava/util/Map;)Lcom/kik/android/c/e;
    .locals 6

    .prologue
    .line 129
    const-string v0, "smiley_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 130
    const-string v0, "smiley_text"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 131
    const-string v0, "smiley_title"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 132
    const-string v1, "smiley_category"

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 133
    const-string v4, "smiley_install_date"

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    .line 134
    invoke-static/range {v0 .. v5}, Lcom/kik/android/c/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/kik/android/c/e;

    move-result-object v1

    .line 135
    if-eqz p1, :cond_0

    invoke-virtual {v1}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 136
    invoke-virtual {v1}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/a;

    .line 137
    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/kik/android/c/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    invoke-virtual {v1}, Lcom/kik/android/c/e;->c()V

    .line 141
    :cond_0
    return-object v1
.end method

.method private static c(Lcom/kik/android/c/e;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 306
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 307
    :cond_0
    const/4 v0, 0x0

    .line 309
    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "com.kik.android.smileys.category.accessed."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/kik/android/c/e;)J
    .locals 2

    .prologue
    .line 251
    invoke-static {p1}, Lcom/kik/android/c/j;->c(Lcom/kik/android/c/e;)Ljava/lang/String;

    move-result-object v0

    .line 252
    if-eqz v0, :cond_0

    .line 253
    iget-object v1, p0, Lcom/kik/android/c/j;->c:Lkik/a/e/v;

    invoke-interface {v1, v0}, Lkik/a/e/v;->o(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 255
    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/android/c/e;
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 70
    .line 71
    iget-object v0, p0, Lcom/kik/android/c/j;->a:Lcom/kik/android/c/j$b;

    invoke-virtual {v0}, Lcom/kik/android/c/j$b;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "smileyTable"

    const-string v3, "smiley_id = ?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    move-object v5, v2

    move-object v6, v2

    move-object v7, v2

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 73
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 74
    invoke-virtual {p0}, Lcom/kik/android/c/j;->d()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kik/android/c/j;->a(Landroid/database/Cursor;Ljava/util/Map;)Lcom/kik/android/c/e;

    move-result-object v2

    .line 76
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 77
    return-object v2
.end method

.method public final a()Ljava/util/List;
    .locals 11

    .prologue
    .line 47
    invoke-virtual {p0}, Lcom/kik/android/c/j;->d()Ljava/util/Map;

    move-result-object v8

    .line 48
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 49
    iget-object v10, p0, Lcom/kik/android/c/j;->a:Lcom/kik/android/c/j$b;

    monitor-enter v10

    .line 51
    :try_start_0
    iget-object v0, p0, Lcom/kik/android/c/j;->a:Lcom/kik/android/c/j$b;

    invoke-virtual {v0}, Lcom/kik/android/c/j$b;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "smileyTable"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 53
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 55
    :cond_0
    invoke-static {v0, v8}, Lcom/kik/android/c/j;->a(Landroid/database/Cursor;Ljava/util/Map;)Lcom/kik/android/c/e;

    move-result-object v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    :cond_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_0

    .line 61
    :cond_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 62
    monitor-exit v10

    .line 64
    return-object v9

    .line 62
    :catchall_0
    move-exception v0

    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Lcom/kik/android/c/a;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 163
    if-nez p1, :cond_1

    .line 177
    :cond_0
    :goto_0
    return-void

    .line 166
    :cond_1
    iget-object v0, p0, Lcom/kik/android/c/j;->b:Lcom/kik/android/c/j$a;

    invoke-virtual {v0}, Lcom/kik/android/c/j$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 167
    if-nez p1, :cond_2

    move-object v0, v1

    .line 168
    :goto_1
    if-eqz v0, :cond_0

    .line 171
    const-string v3, "alternatesTable"

    const-string v4, "smiley_category = ?"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {p1}, Lcom/kik/android/c/a;->b()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-virtual {v2, v3, v0, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    .line 174
    if-nez v3, :cond_0

    .line 175
    const-string v3, "alternatesTable"

    invoke-virtual {v2, v3, v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    goto :goto_0

    .line 167
    :cond_2
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v3, "smiley_category"

    invoke-virtual {p1}, Lcom/kik/android/c/a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "smiley_id"

    invoke-virtual {p1}, Lcom/kik/android/c/a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public final a(Ljava/util/List;)V
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 84
    iget-object v0, p0, Lcom/kik/android/c/j;->a:Lcom/kik/android/c/j$b;

    invoke-virtual {v0}, Lcom/kik/android/c/j$b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 85
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 87
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/e;

    .line 88
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_2

    :cond_1
    move-object v1, v2

    .line 89
    :goto_1
    if-eqz v1, :cond_0

    .line 91
    const-string v5, "smileyTable"

    const-string v6, "smiley_id = ?"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/String;

    const/4 v8, 0x0

    invoke-virtual {v0}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v7, v8

    invoke-virtual {v3, v5, v1, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 96
    if-nez v0, :cond_0

    .line 97
    const-string v0, "smileyTable"

    invoke-virtual {v3, v0, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    goto :goto_0

    .line 88
    :cond_2
    const-string v5, "smiley_id"

    invoke-virtual {v0}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "smiley_text"

    invoke-virtual {v0}, Lcom/kik/android/c/e;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "smiley_title"

    invoke-virtual {v0}, Lcom/kik/android/c/e;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "smiley_install_date"

    invoke-virtual {v0}, Lcom/kik/android/c/e;->i()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v5, "smiley_category"

    invoke-virtual {v0}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 100
    :cond_3
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 101
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 102
    return-void
.end method

.method public final b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 147
    iget-object v0, p0, Lcom/kik/android/c/j;->a:Lcom/kik/android/c/j$b;

    invoke-virtual {v0}, Lcom/kik/android/c/j$b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 148
    const-string v1, "smileyTable"

    invoke-virtual {v0, v1, v2, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 149
    iget-object v0, p0, Lcom/kik/android/c/j;->a:Lcom/kik/android/c/j$b;

    invoke-virtual {v0}, Lcom/kik/android/c/j$b;->a()V

    .line 150
    return-void
.end method

.method public final b(Lcom/kik/android/c/a;)V
    .locals 6

    .prologue
    .line 241
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/kik/android/c/a;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 246
    :cond_0
    :goto_0
    return-void

    .line 244
    :cond_1
    iget-object v0, p0, Lcom/kik/android/c/j;->b:Lcom/kik/android/c/j$a;

    invoke-virtual {v0}, Lcom/kik/android/c/j$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "alternatesTable"

    const-string v2, "smiley_category = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {p1}, Lcom/kik/android/c/a;->b()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0
.end method

.method public final b(Lcom/kik/android/c/e;)V
    .locals 4

    .prologue
    .line 261
    invoke-static {p1}, Lcom/kik/android/c/j;->c(Lcom/kik/android/c/e;)Ljava/lang/String;

    move-result-object v0

    .line 262
    if-eqz v0, :cond_0

    .line 263
    iget-object v1, p0, Lcom/kik/android/c/j;->c:Lkik/a/e/v;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Long;)Z

    .line 265
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 107
    if-nez p1, :cond_0

    .line 111
    :goto_0
    return-void

    .line 110
    :cond_0
    iget-object v0, p0, Lcom/kik/android/c/j;->a:Lcom/kik/android/c/j$b;

    invoke-virtual {v0}, Lcom/kik/android/c/j$b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "smileyTable"

    const-string v2, "smiley_id = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0
.end method

.method public final c(Ljava/lang/String;)Lcom/kik/android/c/a;
    .locals 11

    .prologue
    const/4 v9, 0x0

    .line 226
    .line 227
    iget-object v10, p0, Lcom/kik/android/c/j;->b:Lcom/kik/android/c/j$a;

    monitor-enter v10

    .line 228
    :try_start_0
    iget-object v0, p0, Lcom/kik/android/c/j;->b:Lcom/kik/android/c/j$a;

    invoke-virtual {v0}, Lcom/kik/android/c/j$a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "alternatesTable"

    const/4 v2, 0x0

    const-string v3, "smiley_id = ?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 230
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    invoke-static {v1}, Lcom/kik/android/c/j;->a(Landroid/database/Cursor;)Lcom/kik/android/c/a;

    move-result-object v0

    .line 233
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 234
    monitor-exit v10

    .line 235
    return-object v0

    .line 234
    :catchall_0
    move-exception v0

    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    move-object v0, v9

    goto :goto_0
.end method

.method public final c()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 155
    iget-object v0, p0, Lcom/kik/android/c/j;->b:Lcom/kik/android/c/j$a;

    invoke-virtual {v0}, Lcom/kik/android/c/j$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 156
    const-string v1, "alternatesTable"

    invoke-virtual {v0, v1, v2, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 157
    iget-object v0, p0, Lcom/kik/android/c/j;->b:Lcom/kik/android/c/j$a;

    invoke-virtual {v0}, Lcom/kik/android/c/j$a;->a()V

    .line 158
    return-void
.end method

.method public final d()Ljava/util/Map;
    .locals 10

    .prologue
    .line 200
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 201
    iget-object v9, p0, Lcom/kik/android/c/j;->b:Lcom/kik/android/c/j$a;

    monitor-enter v9

    .line 202
    :try_start_0
    iget-object v0, p0, Lcom/kik/android/c/j;->b:Lcom/kik/android/c/j$a;

    invoke-virtual {v0}, Lcom/kik/android/c/j$a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "alternatesTable"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 203
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 205
    :cond_0
    invoke-static {v0}, Lcom/kik/android/c/j;->a(Landroid/database/Cursor;)Lcom/kik/android/c/a;

    move-result-object v1

    .line 206
    invoke-virtual {v1}, Lcom/kik/android/c/a;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 207
    invoke-virtual {v1}, Lcom/kik/android/c/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v8, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    :cond_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_0

    .line 211
    :cond_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 212
    monitor-exit v9

    .line 213
    return-object v8

    .line 212
    :catchall_0
    move-exception v0

    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final e()J
    .locals 2

    .prologue
    .line 270
    iget-object v0, p0, Lcom/kik/android/c/j;->c:Lkik/a/e/v;

    const-string v1, "com.kik.android.smileys.tray.opened"

    invoke-interface {v0, v1}, Lkik/a/e/v;->o(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    .line 271
    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0
.end method

.method public final f()V
    .locals 4

    .prologue
    .line 277
    iget-object v0, p0, Lcom/kik/android/c/j;->c:Lkik/a/e/v;

    const-string v1, "com.kik.android.smileys.tray.opened"

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Long;)Z

    .line 278
    return-void
.end method

.method public final g()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 283
    iget-object v1, p0, Lcom/kik/android/c/j;->c:Lkik/a/e/v;

    const-string v2, "com.kik.android.smileys.preload.complete"

    invoke-interface {v1, v2}, Lkik/a/e/v;->p(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final h()V
    .locals 3

    .prologue
    .line 289
    iget-object v0, p0, Lcom/kik/android/c/j;->c:Lkik/a/e/v;

    const-string v1, "com.kik.android.smileys.preload.complete"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Boolean;)Z

    .line 290
    return-void
.end method

.method public final i()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 295
    iget-object v1, p0, Lcom/kik/android/c/j;->c:Lkik/a/e/v;

    const-string v2, "com.kik.android.smileys.longpress.complete"

    invoke-interface {v1, v2}, Lkik/a/e/v;->p(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final j()V
    .locals 3

    .prologue
    .line 301
    iget-object v0, p0, Lcom/kik/android/c/j;->c:Lkik/a/e/v;

    const-string v1, "com.kik.android.smileys.longpress.complete"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Boolean;)Z

    .line 302
    return-void
.end method
