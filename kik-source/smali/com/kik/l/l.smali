.class public final Lcom/kik/l/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private final b:Landroid/database/sqlite/SQLiteOpenHelper;

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const-string v0, "ContactsStorage"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/l/l;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Landroid/database/sqlite/SQLiteOpenHelper;)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    .line 38
    const/16 v0, 0x13

    iput v0, p0, Lcom/kik/l/l;->c:I

    .line 39
    return-void
.end method

.method private a(Z)Ljava/util/Hashtable;
    .locals 17

    .prologue
    .line 160
    new-instance v14, Ljava/util/Hashtable;

    invoke-direct {v14}, Ljava/util/Hashtable;-><init>()V

    .line 162
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v15

    .line 163
    :try_start_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 165
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 166
    const-class v2, Lcom/kik/l/e;

    const-string v5, "KIKcontactsTable"

    invoke-static {v3, v2, v5}, Lcom/kik/l/e;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/Class;Ljava/lang/String;)Lcom/kik/l/y;

    move-result-object v2

    check-cast v2, Lcom/kik/l/e;

    .line 177
    move-object/from16 v0, p0

    iget v5, v0, Lcom/kik/l/l;->c:I

    move-object/from16 v0, p0

    iget v6, v0, Lcom/kik/l/l;->c:I

    if-lt v5, v6, :cond_0

    invoke-virtual {v2}, Lcom/kik/l/e;->getColumnCount()I

    move-result v5

    const/16 v6, 0xc

    if-ge v5, v6, :cond_0

    .line 178
    invoke-virtual {v2}, Lcom/kik/l/e;->close()V

    .line 179
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 181
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 182
    const-class v2, Lcom/kik/l/e;

    const-string v5, "KIKcontactsTable"

    invoke-static {v3, v2, v5}, Lcom/kik/l/e;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/Class;Ljava/lang/String;)Lcom/kik/l/y;

    move-result-object v2

    check-cast v2, Lcom/kik/l/e;

    .line 185
    :cond_0
    new-instance v5, Lcom/kik/l/m;

    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-direct {v5, v0, v1, v14}, Lcom/kik/l/m;-><init>(Lcom/kik/l/l;ZLjava/util/Hashtable;)V

    invoke-virtual {v2, v5}, Lcom/kik/l/e;->a(Lcom/kik/l/y$a;)V

    .line 198
    const-class v2, Lcom/kik/l/aa;

    const-string v5, "memberTable"

    invoke-static {v3, v2, v5}, Lcom/kik/l/aa;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/Class;Ljava/lang/String;)Lcom/kik/l/y;

    move-result-object v2

    check-cast v2, Lcom/kik/l/aa;

    .line 200
    new-instance v3, Lcom/kik/l/n;

    move-object/from16 v0, p0

    invoke-direct {v3, v0, v4}, Lcom/kik/l/n;-><init>(Lcom/kik/l/l;Ljava/util/Map;)V

    invoke-virtual {v2, v3}, Lcom/kik/l/aa;->a(Lcom/kik/l/y$a;)V

    .line 228
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :cond_1
    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 229
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    move-object v0, v3

    check-cast v0, Ljava/lang/String;

    move-object v12, v0

    .line 230
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkik/a/d/n$a;

    .line 232
    if-eqz v12, :cond_1

    .line 233
    invoke-virtual {v14, v12}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkik/a/d/k;

    .line 234
    const/4 v7, 0x1

    .line 235
    const/4 v8, 0x0

    .line 236
    const/4 v2, 0x0

    .line 237
    const/4 v11, 0x0

    .line 238
    const/4 v4, 0x0

    .line 239
    const/4 v10, 0x0

    .line 240
    const/4 v9, 0x0

    .line 241
    if-eqz v3, :cond_3

    .line 242
    invoke-virtual {v3}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v4

    .line 243
    invoke-virtual {v3}, Lkik/a/d/k;->p()Z

    move-result v7

    .line 244
    instance-of v6, v3, Lkik/a/d/n;

    if-eqz v6, :cond_3

    .line 245
    move-object v0, v3

    check-cast v0, Lkik/a/d/n;

    move-object v2, v0

    invoke-virtual {v2}, Lkik/a/d/n;->A()Z

    move-result v8

    .line 246
    move-object v0, v3

    check-cast v0, Lkik/a/d/n;

    move-object v2, v0

    invoke-virtual {v2}, Lkik/a/d/n;->B()Z

    move-result v6

    .line 247
    move-object v0, v3

    check-cast v0, Lkik/a/d/n;

    move-object v2, v0

    invoke-virtual {v2}, Lkik/a/d/n;->J()Ljava/lang/String;

    move-result-object v11

    .line 248
    move-object v0, v3

    check-cast v0, Lkik/a/d/n;

    move-object v2, v0

    invoke-virtual {v2}, Lkik/a/d/n;->r()Ljava/lang/String;

    move-result-object v10

    .line 249
    check-cast v3, Lkik/a/d/n;

    invoke-virtual {v3}, Lkik/a/d/n;->s()Ljava/lang/String;

    move-result-object v9

    move v13, v6

    .line 252
    :goto_1
    new-instance v2, Lkik/a/d/n;

    invoke-static {v12}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v3

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v11}, Lkik/a/d/n;-><init>(Lkik/a/d/j;Ljava/lang/String;Lkik/a/d/n$a;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    invoke-virtual {v2, v13}, Lkik/a/d/n;->i(Z)V

    .line 266
    invoke-virtual {v14, v12, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 270
    :catchall_0
    move-exception v2

    monitor-exit v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2

    .line 269
    :cond_2
    :try_start_1
    monitor-exit v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v14

    :cond_3
    move v13, v2

    goto :goto_1
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 6

    .prologue
    .line 288
    iget-object v1, p0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v1

    .line 291
    :try_start_0
    iget-object v0, p0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 292
    const-string v2, "SELECT %4$s._id, display_name as %1$s, user_name as %2$s, jid as %3$s FROM %4$s join %5$s ON jid = bin_id WHERE %6$s GROUP BY jid ORDER BY timestamp DESC, display_name COLLATE NOCASE COLLATE LOCALIZED ASC LIMIT %7$s"

    const/4 v3, 0x7

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "suggest_text_1"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-string v5, "suggest_text_2"

    aput-object v5, v3, v4

    const/4 v4, 0x2

    const-string v5, "suggest_intent_data_id"

    aput-object v5, v3, v4

    const/4 v4, 0x3

    const-string v5, "KIKcontactsTable"

    aput-object v5, v3, v4

    const/4 v4, 0x4

    const-string v5, "messagesTable"

    aput-object v5, v3, v4

    const/4 v4, 0x5

    aput-object p1, v3, v4

    const/4 v4, 0x6

    const/4 v5, 0x7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 296
    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 297
    monitor-exit v1

    return-object v0

    .line 298
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 6

    .prologue
    .line 275
    iget-object v1, p0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v1

    .line 278
    :try_start_0
    iget-object v0, p0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 279
    const-string v2, "SELECT _id, display_name as %s, user_name as %s, jid as %s FROM %s WHERE %s ORDER BY display_name COLLATE NOCASE COLLATE LOCALIZED ASC"

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "suggest_text_1"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-string v5, "suggest_text_2"

    aput-object v5, v3, v4

    const/4 v4, 0x2

    const-string v5, "suggest_intent_data_id"

    aput-object v5, v3, v4

    const/4 v4, 0x3

    const-string v5, "KIKcontactsTable"

    aput-object v5, v3, v4

    const/4 v4, 0x4

    aput-object p1, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 281
    invoke-virtual {v0, v2, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 282
    monitor-exit v1

    return-object v0

    .line 283
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a()Ljava/util/Hashtable;
    .locals 1

    .prologue
    .line 150
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/kik/l/l;->a(Z)Ljava/util/Hashtable;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/util/List;)Z
    .locals 9

    .prologue
    .line 59
    iget-object v2, p0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v2

    .line 60
    :try_start_0
    iget-object v0, p0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v3

    .line 62
    const/4 v1, 0x1

    .line 64
    :try_start_1
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 65
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 66
    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v5

    .line 67
    if-eqz v5, :cond_0

    .line 69
    invoke-static {v0}, Lcom/kik/l/e;->a(Lkik/a/d/k;)Landroid/content/ContentValues;

    move-result-object v0

    .line 70
    const-string v6, "KIKcontactsTable"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "jid =\'"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, "\'"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    invoke-virtual {v3, v6, v0, v5, v7}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    if-nez v5, :cond_0

    .line 71
    const-string v5, "KIKcontactsTable"

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 77
    :catch_0
    move-exception v0

    .line 78
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Kikcontact update failed:"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    const/4 v0, 0x0

    .line 82
    :try_start_3
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 85
    :goto_1
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return v0

    .line 75
    :cond_1
    :try_start_4
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 82
    :try_start_5
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    move v0, v1

    .line 84
    goto :goto_1

    .line 82
    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 87
    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0
.end method

.method public final a(Lkik/a/d/k;)Z
    .locals 2

    .prologue
    .line 43
    iget-object v1, p0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v1

    .line 44
    :try_start_0
    instance-of v0, p1, Lkik/a/d/n;

    if-eqz v0, :cond_0

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    check-cast p1, Lkik/a/d/n;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    invoke-virtual {p0, v0}, Lcom/kik/l/l;->b(Ljava/util/List;)Z

    move-result v0

    monitor-exit v1

    .line 52
    :goto_0
    return v0

    .line 50
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    invoke-virtual {p0, v0}, Lcom/kik/l/l;->a(Ljava/util/List;)Z

    move-result v0

    monitor-exit v1

    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b()Ljava/util/Hashtable;
    .locals 1

    .prologue
    .line 155
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/kik/l/l;->a(Z)Ljava/util/Hashtable;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lkik/a/d/k;
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 333
    iget-object v2, p0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v2

    .line 334
    :try_start_0
    iget-object v0, p0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v0

    .line 338
    :try_start_1
    const-class v3, Lcom/kik/l/e;

    const-string v4, "KIKcontactsTable"

    const-string v5, "user_name=? COLLATE NOCASE"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/String;

    const/4 v7, 0x0

    aput-object p1, v6, v7

    invoke-static {v0, v3, v4, v5, v6}, Lcom/kik/l/e;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/kik/l/y;

    move-result-object v0

    check-cast v0, Lcom/kik/l/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 339
    :try_start_2
    invoke-virtual {v0}, Lcom/kik/l/e;->moveToFirst()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result v3

    if-nez v3, :cond_0

    .line 340
    :try_start_3
    invoke-virtual {v0}, Lcom/kik/l/e;->close()V

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v0, v1

    .line 345
    :goto_0
    return-object v0

    .line 342
    :cond_0
    :try_start_4
    invoke-virtual {v0}, Lcom/kik/l/e;->a()Lkik/a/d/k;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-result-object v1

    .line 345
    :try_start_5
    invoke-virtual {v0}, Lcom/kik/l/e;->close()V

    monitor-exit v2

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_1
    invoke-virtual {v1}, Lcom/kik/l/e;->close()V

    throw v0

    .line 347
    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    .line 345
    :catchall_2
    move-exception v1

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    goto :goto_1
.end method

.method public final b(Ljava/util/List;)Z
    .locals 14

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 92
    iget-object v4, p0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v4

    .line 93
    :try_start_0
    iget-object v0, p0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v5

    .line 97
    :try_start_1
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 98
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/n;

    .line 99
    invoke-virtual {v0}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v7

    .line 100
    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v1

    .line 101
    invoke-virtual {v0}, Lkik/a/d/n;->y()Ljava/util/List;

    move-result-object v8

    .line 102
    if-eqz v7, :cond_0

    .line 103
    const-string v9, "memberTable"

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "group_id =\'"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\'"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v5, v9, v10, v11}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 105
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_1
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 107
    new-instance v10, Landroid/content/ContentValues;

    invoke-direct {v10}, Landroid/content/ContentValues;-><init>()V

    .line 109
    const-string v11, "group_id"

    invoke-virtual {v10, v11, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    const-string v11, "member_jid"

    invoke-virtual {v10, v11, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string v11, "is_admin"

    invoke-virtual {v0, v1}, Lkik/a/d/n;->g(Ljava/lang/String;)Z

    move-result v12

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 112
    const-string v11, "is_banned"

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 113
    const-string v11, "memberTable"

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "group_id =\'"

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "\' AND member_jid = \'"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v12, "\'"

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v12, 0x0

    invoke-virtual {v5, v11, v10, v1, v12}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_1

    .line 114
    const-string v1, "memberTable"

    const/4 v11, 0x0

    invoke-virtual {v5, v1, v11, v10}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 133
    :catch_0
    move-exception v0

    .line 134
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "KikGroup update failed:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 138
    :try_start_3
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    move v0, v3

    .line 141
    :goto_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v1}, Lcom/kik/l/l;->a(Ljava/util/List;)Z

    .line 144
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return v0

    .line 117
    :cond_2
    :try_start_4
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 119
    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 121
    const-string v9, "group_id"

    invoke-virtual {v8, v9, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    const-string v9, "member_jid"

    invoke-virtual {v8, v9, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    const-string v9, "is_admin"

    const/4 v10, 0x0

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 124
    const-string v9, "is_banned"

    const/4 v10, 0x1

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 125
    const-string v9, "memberTable"

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "group_id =\'"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\' AND member_jid = \'"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v10, "\'"

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    invoke-virtual {v5, v9, v8, v0, v10}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_3

    .line 126
    const-string v0, "memberTable"

    const/4 v9, 0x0

    invoke-virtual {v5, v0, v9, v8}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    .line 138
    :catchall_0
    move-exception v0

    :try_start_5
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 145
    :catchall_1
    move-exception v0

    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    .line 131
    :cond_4
    :try_start_6
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 138
    :try_start_7
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    move v0, v2

    .line 140
    goto :goto_1
.end method

.method public final c(Ljava/lang/String;)Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 369
    iget-object v2, p0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    monitor-enter v2

    .line 370
    :try_start_0
    iget-object v3, p0, Lcom/kik/l/l;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v3

    .line 373
    if-eqz p1, :cond_0

    .line 375
    :try_start_1
    const-string v4, "KIKcontactsTable"

    const-string v5, "jid = ?"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/String;

    const/4 v7, 0x0

    aput-object p1, v6, v7

    invoke-virtual {v3, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 385
    :cond_0
    :goto_0
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return v0

    .line 378
    :catch_0
    move-exception v0

    .line 379
    :try_start_3
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "deleteKIKContact failed: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move v0, v1

    .line 384
    goto :goto_0

    .line 382
    :catchall_0
    move-exception v0

    :try_start_4
    throw v0

    .line 386
    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method
