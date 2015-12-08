.class public final Lcom/cmcm/adsdk/b/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lcom/cmcm/adsdk/b/b/a;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Z


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/cmcm/adsdk/b/b/a;->c:Z

    .line 27
    iput-object p1, p0, Lcom/cmcm/adsdk/b/b/a;->b:Landroid/content/Context;

    .line 28
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/cmcm/adsdk/b/b/a;
    .locals 1

    .prologue
    .line 31
    sget-object v0, Lcom/cmcm/adsdk/b/b/a;->a:Lcom/cmcm/adsdk/b/b/a;

    if-nez v0, :cond_0

    .line 32
    new-instance v0, Lcom/cmcm/adsdk/b/b/a;

    invoke-direct {v0, p0}, Lcom/cmcm/adsdk/b/b/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/cmcm/adsdk/b/b/a;->a:Lcom/cmcm/adsdk/b/b/a;

    .line 34
    :cond_0
    sget-object v0, Lcom/cmcm/adsdk/b/b/a;->a:Lcom/cmcm/adsdk/b/b/a;

    return-object v0
.end method

.method private static a(Landroid/database/sqlite/SQLiteDatabase;Lcom/cmcm/adsdk/b/a/c;)Z
    .locals 9

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 195
    if-eqz p1, :cond_0

    if-nez p0, :cond_2

    :cond_0
    move v0, v1

    .line 205
    :cond_1
    :goto_0
    return v0

    .line 199
    :cond_2
    :try_start_0
    const-string v2, "posinfo"

    invoke-virtual {p1}, Lcom/cmcm/adsdk/b/a/c;->a()Landroid/content/ContentValues;

    move-result-object v3

    const-string v4, "placeid=? and name=?"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget v8, p1, Lcom/cmcm/adsdk/b/a/c;->b:I

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x1

    iget-object v7, p1, Lcom/cmcm/adsdk/b/a/c;->d:Ljava/lang/String;

    aput-object v7, v5, v6

    invoke-virtual {p0, v2, v3, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 201
    if-gtz v2, :cond_1

    move v0, v1

    goto :goto_0

    .line 202
    :catch_0
    move-exception v0

    .line 203
    const-string v2, "PosInfoStorage"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "operate db is error..."

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/cmcm/adsdk/b/c/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v1

    .line 205
    goto :goto_0
.end method

.method private static b(Landroid/database/sqlite/SQLiteDatabase;Lcom/cmcm/adsdk/b/a/c;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 209
    if-eqz p1, :cond_0

    if-nez p0, :cond_1

    .line 219
    :cond_0
    :goto_0
    return v0

    .line 213
    :cond_1
    :try_start_0
    const-string v1, "PosInfoStorage"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "data:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    const-string v1, "posinfo"

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/cmcm/adsdk/b/a/c;->a()Landroid/content/ContentValues;

    move-result-object v3

    invoke-virtual {p0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    .line 215
    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 216
    :catch_0
    move-exception v1

    .line 217
    const-string v2, "PosInfoStorage"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "operate db is error..."

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/cmcm/adsdk/b/c/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private c()Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    .prologue
    .line 39
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/b/b/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/cmcm/adsdk/a/b;->a(Landroid/content/Context;)Lcom/cmcm/adsdk/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cmcm/adsdk/a/b;->a()Lcom/cmcm/adsdk/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cmcm/adsdk/a/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 44
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/adsdk/b/a/c;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v9, 0x0

    .line 82
    invoke-direct {p0}, Lcom/cmcm/adsdk/b/b/a;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 84
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 85
    if-nez v0, :cond_1

    move-object v0, v1

    .line 103
    :cond_0
    :goto_0
    return-object v0

    .line 89
    :cond_1
    :try_start_0
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    :try_start_1
    const-string v1, "posinfo"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    .line 91
    :goto_1
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 92
    new-instance v0, Lcom/cmcm/adsdk/b/a/c;

    invoke-direct {v0}, Lcom/cmcm/adsdk/b/a/c;-><init>()V

    .line 93
    invoke-static {v1}, Lcom/cmcm/adsdk/b/a/c;->a(Landroid/database/Cursor;)Lcom/cmcm/adsdk/b/a/c;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    .line 95
    :catch_0
    move-exception v0

    move-object v2, v1

    move-object v1, v0

    move-object v0, v8

    .line 96
    :goto_2
    :try_start_3
    const-string v3, "PosInfoStorage"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "operate db is error..."

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/cmcm/adsdk/b/c/b;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 98
    if-eqz v2, :cond_0

    .line 99
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 98
    :cond_2
    if-eqz v1, :cond_4

    .line 99
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    move-object v0, v8

    goto :goto_0

    .line 98
    :catchall_0
    move-exception v0

    move-object v2, v9

    :goto_3
    if-eqz v2, :cond_3

    .line 99
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v0

    .line 98
    :catchall_1
    move-exception v0

    move-object v2, v1

    goto :goto_3

    :catchall_2
    move-exception v0

    goto :goto_3

    .line 95
    :catch_1
    move-exception v0

    move-object v2, v9

    move-object v10, v1

    move-object v1, v0

    move-object v0, v10

    goto :goto_2

    :catch_2
    move-exception v0

    move-object v1, v0

    move-object v2, v9

    move-object v0, v8

    goto :goto_2

    :cond_4
    move-object v0, v8

    goto :goto_0
.end method

.method public final a(I)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/adsdk/b/a/c;",
            ">;"
        }
    .end annotation

    .prologue
    const/16 v12, 0x9

    const/4 v11, 0x1

    const/4 v10, 0x0

    const/4 v9, 0x0

    .line 107
    const-string v0, "CMCMADSDK"

    const-string v1, "getPosBeanByPosid..."

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 109
    invoke-direct {p0}, Lcom/cmcm/adsdk/b/b/a;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 111
    if-nez v0, :cond_0

    move-object v0, v8

    .line 141
    :goto_0
    return-object v0

    .line 115
    :cond_0
    :try_start_0
    const-string v1, "posinfo"

    const/4 v2, 0x0

    const-string v3, "placeid=?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 117
    :try_start_1
    const-string v1, "PosInfoStorage"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "cursor size:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    new-instance v1, Lcom/cmcm/adsdk/b/a/c;

    invoke-direct {v1}, Lcom/cmcm/adsdk/b/a/c;-><init>()V

    .line 119
    :cond_1
    :goto_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 120
    invoke-static {v0}, Lcom/cmcm/adsdk/b/a/c;->a(Landroid/database/Cursor;)Lcom/cmcm/adsdk/b/a/c;

    move-result-object v2

    .line 2049
    const-string v1, "fb"

    iget-object v3, v2, Lcom/cmcm/adsdk/b/a/c;->d:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 121
    if-eqz v1, :cond_2

    .line 3008
    invoke-static {}, Lcom/cmcm/adsdk/c/d;->a()I

    move-result v1

    if-ge v1, v12, :cond_5

    move v1, v10

    .line 121
    :goto_2
    if-eqz v1, :cond_1

    .line 124
    :cond_2
    iget-object v1, v2, Lcom/cmcm/adsdk/b/a/c;->d:Ljava/lang/String;

    const-string v3, "cb"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 3015
    invoke-static {}, Lcom/cmcm/adsdk/c/d;->a()I

    move-result v1

    if-ge v1, v12, :cond_6

    move v1, v10

    .line 124
    :goto_3
    if-eqz v1, :cond_1

    .line 127
    :cond_3
    iget-object v1, v2, Lcom/cmcm/adsdk/b/a/c;->e:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lez v1, :cond_1

    .line 128
    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    .line 131
    :catch_0
    move-exception v1

    .line 132
    :goto_4
    :try_start_2
    const-string v2, "PosInfoStorage"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "operate db is error..."

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/cmcm/adsdk/b/c/b;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 134
    if-eqz v0, :cond_4

    .line 135
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 138
    :cond_4
    :goto_5
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 139
    const-string v0, "PosInfoStorage"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "list:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    invoke-static {v8}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    move-object v0, v8

    .line 141
    goto/16 :goto_0

    :cond_5
    move v1, v11

    .line 3011
    goto :goto_2

    :cond_6
    move v1, v11

    .line 3018
    goto :goto_3

    .line 134
    :cond_7
    if-eqz v0, :cond_4

    .line 135
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    goto :goto_5

    .line 134
    :catchall_0
    move-exception v0

    :goto_6
    if-eqz v9, :cond_8

    .line 135
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_8
    throw v0

    .line 134
    :catchall_1
    move-exception v1

    move-object v9, v0

    move-object v0, v1

    goto :goto_6

    .line 131
    :catch_1
    move-exception v0

    move-object v1, v0

    move-object v0, v9

    goto :goto_4
.end method

.method public final a(Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/adsdk/b/a/c;",
            ">;)Z"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 48
    invoke-direct {p0}, Lcom/cmcm/adsdk/b/b/a;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 49
    if-nez v2, :cond_1

    .line 78
    :cond_0
    :goto_0
    return v1

    .line 53
    :cond_1
    invoke-static {p1}, Lcom/cmcm/adsdk/b/e/a;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    iget-boolean v0, p0, Lcom/cmcm/adsdk/b/b/a;->c:Z

    if-eqz v0, :cond_2

    .line 59
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 63
    :cond_2
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/b/a/c;

    .line 1185
    if-eqz v0, :cond_3

    if-eqz v2, :cond_3

    .line 1189
    invoke-static {v2, v0}, Lcom/cmcm/adsdk/b/b/a;->a(Landroid/database/sqlite/SQLiteDatabase;Lcom/cmcm/adsdk/b/a/c;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 1190
    invoke-static {v2, v0}, Lcom/cmcm/adsdk/b/b/a;->b(Landroid/database/sqlite/SQLiteDatabase;Lcom/cmcm/adsdk/b/a/c;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 70
    :catch_0
    move-exception v0

    .line 71
    :try_start_1
    const-string v3, "PosInfoStorage"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "operate db is error..."

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/cmcm/adsdk/b/c/b;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    iget-boolean v0, p0, Lcom/cmcm/adsdk/b/b/a;->c:Z

    if-eqz v0, :cond_8

    .line 75
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    move v0, v1

    :cond_4
    :goto_2
    move v1, v0

    .line 78
    goto :goto_0

    .line 66
    :cond_5
    :try_start_2
    iget-boolean v0, p0, Lcom/cmcm/adsdk/b/b/a;->c:Z

    if-eqz v0, :cond_6

    .line 67
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    :cond_6
    const/4 v0, 0x1

    .line 74
    iget-boolean v1, p0, Lcom/cmcm/adsdk/b/b/a;->c:Z

    if-eqz v1, :cond_4

    .line 75
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    goto :goto_2

    .line 74
    :catchall_0
    move-exception v0

    iget-boolean v1, p0, Lcom/cmcm/adsdk/b/b/a;->c:Z

    if-eqz v1, :cond_7

    .line 75
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    :cond_7
    throw v0

    :cond_8
    move v0, v1

    goto :goto_2
.end method

.method public final b()Z
    .locals 10

    .prologue
    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 145
    invoke-direct {p0}, Lcom/cmcm/adsdk/b/b/a;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 147
    if-nez v0, :cond_0

    move v0, v8

    .line 162
    :goto_0
    return v0

    .line 151
    :cond_0
    :try_start_0
    const-string v1, "posinfo"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 152
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    if-eqz v0, :cond_2

    .line 158
    if-eqz v1, :cond_1

    .line 159
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    .line 158
    :cond_2
    if-eqz v1, :cond_3

    .line 159
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_3
    :goto_1
    move v0, v8

    .line 162
    goto :goto_0

    .line 155
    :catch_0
    move-exception v0

    move-object v1, v9

    .line 156
    :goto_2
    :try_start_2
    const-string v2, "PosInfoStorage"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "operate db is error..."

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/cmcm/adsdk/b/c/b;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 158
    if-eqz v1, :cond_3

    .line 159
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 158
    :catchall_0
    move-exception v0

    move-object v1, v9

    :goto_3
    if-eqz v1, :cond_4

    .line 159
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_4
    throw v0

    .line 158
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 155
    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method public final b(Ljava/util/List;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;)Z"
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 166
    invoke-direct {p0}, Lcom/cmcm/adsdk/b/b/a;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 167
    if-nez v3, :cond_0

    move v0, v1

    .line 181
    :goto_0
    return v0

    .line 170
    :cond_0
    invoke-static {p1}, Lcom/cmcm/adsdk/b/e/a;->a(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    .line 171
    goto :goto_0

    .line 174
    :cond_1
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 175
    const-string v5, "posinfo"

    const-string v6, "placeid!=?"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/String;

    const/4 v8, 0x0

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v7, v8

    invoke-virtual {v3, v5, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 178
    :catch_0
    move-exception v0

    .line 179
    const-string v2, "PosInfoStorage"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "operate db is error..."

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/cmcm/adsdk/b/c/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v1

    .line 181
    goto :goto_0

    :cond_2
    move v0, v2

    .line 177
    goto :goto_0
.end method
