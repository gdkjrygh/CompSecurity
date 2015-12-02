.class public final Lcom/mobvista/sdk/m/core/c/d;
.super Lcom/mobvista/sdk/m/a/a/a/c;
.source "360Security"


# static fields
.field private static b:Lcom/mobvista/sdk/m/core/c/d;


# instance fields
.field private c:Lcom/mobvista/sdk/m/core/c/g;


# direct methods
.method private constructor <init>(Lcom/mobvista/sdk/m/a/a/a/a;)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lcom/mobvista/sdk/m/a/a/a/c;-><init>(Lcom/mobvista/sdk/m/a/a/a/a;)V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/c/d;->c:Lcom/mobvista/sdk/m/core/c/g;

    .line 27
    new-instance v0, Lcom/mobvista/sdk/m/core/c/g;

    invoke-direct {v0, p1}, Lcom/mobvista/sdk/m/core/c/g;-><init>(Lcom/mobvista/sdk/m/a/a/a/a;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/c/d;->c:Lcom/mobvista/sdk/m/core/c/g;

    .line 28
    return-void
.end method

.method public static declared-synchronized a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/d;
    .locals 2

    .prologue
    .line 31
    const-class v1, Lcom/mobvista/sdk/m/core/c/d;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/mobvista/sdk/m/core/c/d;->b:Lcom/mobvista/sdk/m/core/c/d;

    if-nez v0, :cond_0

    .line 32
    new-instance v0, Lcom/mobvista/sdk/m/core/c/d;

    invoke-direct {v0, p0}, Lcom/mobvista/sdk/m/core/c/d;-><init>(Lcom/mobvista/sdk/m/a/a/a/a;)V

    sput-object v0, Lcom/mobvista/sdk/m/core/c/d;->b:Lcom/mobvista/sdk/m/core/c/d;

    .line 34
    :cond_0
    sget-object v0, Lcom/mobvista/sdk/m/core/c/d;->b:Lcom/mobvista/sdk/m/core/c/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 31
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private declared-synchronized a(Landroid/database/Cursor;Ljava/lang/String;)Lcom/mobvista/sdk/m/core/entity/b;
    .locals 2

    .prologue
    .line 64
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/mobvista/sdk/m/core/entity/b;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/entity/b;-><init>()V

    .line 65
    const-string/jumbo v1, "name"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/b;->a(Ljava/lang/String;)V

    .line 66
    const-string/jumbo v1, "ver"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/b;->a(I)V

    .line 67
    const-string/jumbo v1, "check_md5"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/b;->c(Ljava/lang/String;)V

    .line 68
    const-string/jumbo v1, "url"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/b;->b(Ljava/lang/String;)V

    .line 69
    const-string/jumbo v1, "appid"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/b;->d(Ljava/lang/String;)V

    .line 70
    const-string/jumbo v1, "appkey"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/b;->g(Ljava/lang/String;)V

    .line 71
    const-string/jumbo v1, "entryClass"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/b;->e(Ljava/lang/String;)V

    .line 72
    const-string/jumbo v1, "modPkgName"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/b;->f(Ljava/lang/String;)V

    .line 73
    const-string/jumbo v1, "state"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/b;->b(I)V

    .line 74
    const-string/jumbo v1, "downloadState"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/b;->c(I)V

    .line 75
    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/entity/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Lcom/mobvista/sdk/m/core/c/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/b;->a(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    monitor-exit p0

    return-object v0

    .line 64
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 144
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/c/d;->c:Lcom/mobvista/sdk/m/core/c/g;

    invoke-virtual {v0, p1, p2}, Lcom/mobvista/sdk/m/core/c/g;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 148
    :goto_0
    monitor-exit p0

    return-object v0

    .line 145
    :catch_0
    move-exception v0

    .line 146
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    const/4 v0, 0x0

    goto :goto_0

    .line 144
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized a(Lcom/mobvista/sdk/m/core/entity/b;Ljava/lang/String;)Z
    .locals 9

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 96
    monitor-enter p0

    :try_start_0
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 97
    const-string/jumbo v3, "time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 98
    const-string/jumbo v3, "name"

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    const-string/jumbo v3, "ver"

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->b()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 100
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 101
    const-string/jumbo v3, "check_md5"

    const-string/jumbo v4, "null"

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    :goto_0
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 106
    const-string/jumbo v3, "url"

    const-string/jumbo v4, "null"

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    :goto_1
    const-string/jumbo v3, "appid"

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string/jumbo v3, "appkey"

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->k()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    const-string/jumbo v3, "unitid"

    invoke-virtual {v2, v3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    const-string/jumbo v3, "entryClass"

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->j()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 115
    const-string/jumbo v3, "modPkgName"

    const-string/jumbo v4, ""

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    :goto_2
    const-string/jumbo v3, "state"

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->e()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 120
    const-string/jumbo v3, "downloadState"

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->f()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 123
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3, p2}, Lcom/mobvista/sdk/m/core/c/d;->b(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    if-lez v3, :cond_4

    .line 124
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/core/c/d;->d()Lcom/mobvista/sdk/m/a/a/a/c;

    move-result-object v3

    const-string/jumbo v4, "Profile"

    const-string/jumbo v5, "name=? AND unitid=?"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/String;

    const/4 v7, 0x0

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->a()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v6, v7

    const/4 v7, 0x1

    aput-object p2, v6, v7

    invoke-virtual {v3, v4, v2, v5, v6}, Lcom/mobvista/sdk/m/a/a/a/c;->a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 129
    :goto_3
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->h()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->h()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 130
    iget-object v2, p0, Lcom/mobvista/sdk/m/core/c/d;->c:Lcom/mobvista/sdk/m/core/c/g;

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->h()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v2, v3, v4, p2}, Lcom/mobvista/sdk/m/core/c/g;->a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    :cond_0
    :goto_4
    monitor-exit p0

    return v0

    .line 103
    :cond_1
    :try_start_1
    const-string/jumbo v3, "check_md5"

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    .line 133
    :catch_0
    move-exception v0

    .line 134
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v0, v1

    .line 135
    goto :goto_4

    .line 108
    :cond_2
    :try_start_3
    const-string/jumbo v3, "url"

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_1

    .line 96
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 117
    :cond_3
    :try_start_4
    const-string/jumbo v3, "modPkgName"

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/b;->j()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 126
    :cond_4
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/core/c/d;->d()Lcom/mobvista/sdk/m/a/a/a/c;

    move-result-object v3

    const-string/jumbo v4, "Profile"

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5, v2}, Lcom/mobvista/sdk/m/a/a/a/c;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_3
.end method

.method private declared-synchronized b(Ljava/lang/String;Ljava/lang/String;)I
    .locals 10

    .prologue
    const/4 v9, 0x0

    const/4 v8, 0x0

    .line 153
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string/jumbo v1, " count(name) "

    aput-object v1, v2, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 157
    :try_start_1
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/core/c/d;->c()Lcom/mobvista/sdk/m/a/a/a/c;

    move-result-object v0

    const-string/jumbo v1, "Profile"

    const-string/jumbo v3, "name=? AND unitid=?"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x1

    aput-object p2, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Lcom/mobvista/sdk/m/a/a/a/c;->a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    .line 158
    if-eqz v1, :cond_3

    .line 159
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 160
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result v8

    move v0, v8

    .line 166
    :goto_0
    if-eqz v1, :cond_0

    .line 167
    :try_start_3
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 171
    :cond_0
    :goto_1
    monitor-exit p0

    return v0

    .line 163
    :catch_0
    move-exception v0

    move-object v1, v9

    .line 164
    :goto_2
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 166
    if-eqz v1, :cond_2

    .line 167
    :try_start_5
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    move v0, v8

    goto :goto_1

    .line 166
    :catchall_0
    move-exception v0

    :goto_3
    if-eqz v9, :cond_1

    .line 167
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_1
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 153
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 166
    :catchall_2
    move-exception v0

    move-object v9, v1

    goto :goto_3

    .line 163
    :catch_1
    move-exception v0

    goto :goto_2

    :cond_2
    move v0, v8

    goto :goto_1

    :cond_3
    move v0, v8

    goto :goto_0
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/String;)Ljava/util/List;
    .locals 11

    .prologue
    const/4 v9, 0x0

    .line 39
    monitor-enter p0

    .line 42
    :try_start_0
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/core/c/d;->c()Lcom/mobvista/sdk/m/a/a/a/c;

    move-result-object v0

    const-string/jumbo v1, "Profile"

    const/4 v2, 0x0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "unitid="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v8}, Lcom/mobvista/sdk/m/a/a/a/c;->a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v1

    .line 44
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 45
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 46
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v0

    if-nez v0, :cond_1

    .line 47
    invoke-direct {p0, v1, p1}, Lcom/mobvista/sdk/m/core/c/d;->a(Landroid/database/Cursor;Ljava/lang/String;)Lcom/mobvista/sdk/m/core/entity/b;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    .line 51
    :catch_0
    move-exception v0

    move-object v10, v0

    move-object v0, v2

    move-object v2, v1

    move-object v1, v10

    .line 52
    :goto_1
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 54
    if-eqz v2, :cond_0

    .line 55
    :try_start_4
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 59
    :cond_0
    :goto_2
    monitor-exit p0

    return-object v0

    :cond_1
    move-object v0, v2

    .line 54
    :goto_3
    if-eqz v1, :cond_0

    .line 55
    :try_start_5
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_2

    .line 39
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 54
    :catchall_1
    move-exception v0

    move-object v1, v9

    :goto_4
    if-eqz v1, :cond_2

    .line 55
    :try_start_6
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_2
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 54
    :catchall_2
    move-exception v0

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object v1, v2

    goto :goto_4

    .line 51
    :catch_1
    move-exception v0

    move-object v1, v0

    move-object v2, v9

    move-object v0, v9

    goto :goto_1

    :catch_2
    move-exception v0

    move-object v2, v1

    move-object v1, v0

    move-object v0, v9

    goto :goto_1

    :cond_3
    move-object v0, v9

    goto :goto_3
.end method

.method public final declared-synchronized a(Ljava/util/List;Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 82
    monitor-enter p0

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/entity/b;

    .line 83
    invoke-direct {p0, v0, p2}, Lcom/mobvista/sdk/m/core/c/d;->a(Lcom/mobvista/sdk/m/core/entity/b;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 85
    :catch_0
    move-exception v0

    .line 86
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    const/4 v0, 0x0

    .line 90
    :goto_1
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_1

    .line 82
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
