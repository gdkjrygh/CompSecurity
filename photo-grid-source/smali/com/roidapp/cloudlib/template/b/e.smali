.class public final Lcom/roidapp/cloudlib/template/b/e;
.super Lcom/roidapp/cloudlib/template/b/j;
.source "SourceFile"


# instance fields
.field private b:Ljava/net/HttpURLConnection;

.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/template/b/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/template/b/c;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 51
    invoke-direct {p0}, Lcom/roidapp/cloudlib/template/b/j;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/roidapp/cloudlib/template/b/e;->c:Ljava/lang/ref/WeakReference;

    .line 53
    iput-object p2, p0, Lcom/roidapp/cloudlib/template/b/e;->d:Ljava/lang/ref/WeakReference;

    .line 54
    return-void
.end method

.method private varargs a([Lcom/roidapp/cloudlib/template/b/l;)Ljava/lang/Object;
    .locals 15

    .prologue
    .line 317
    const/4 v0, 0x0

    aget-object v0, p1, v0

    check-cast v0, Lcom/roidapp/cloudlib/template/b/d;

    .line 319
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/e;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/content/Context;

    .line 320
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/e;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/os/Handler;

    .line 321
    if-eqz v7, :cond_0

    if-eqz v8, :cond_0

    if-nez v0, :cond_1

    .line 322
    :cond_0
    const/4 v0, 0x0

    .line 347
    :goto_0
    return-object v0

    .line 325
    :cond_1
    monitor-enter v7

    .line 1030
    :try_start_0
    invoke-static {}, Lcom/roidapp/cloudlib/common/c;->a()Z

    move-result v1

    .line 327
    if-nez v1, :cond_2

    .line 328
    const/16 v0, 0x1102

    const/4 v1, 0x0

    invoke-static {v8, v0, v1}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    .line 329
    const/4 v0, 0x0

    monitor-exit v7

    goto :goto_0

    .line 336
    :catchall_0
    move-exception v0

    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 332
    :cond_2
    :try_start_1
    invoke-static {}, Lcom/roidapp/cloudlib/template/b/e;->b()Z

    move-result v1

    if-nez v1, :cond_3

    .line 333
    const/16 v0, 0x1101

    const/4 v1, 0x0

    invoke-static {v8, v0, v1}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    .line 334
    const/4 v0, 0x0

    monitor-exit v7

    goto :goto_0

    .line 336
    :cond_3
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 337
    iget-boolean v1, v0, Lcom/roidapp/cloudlib/template/b/d;->a:Z

    if-eqz v1, :cond_5

    .line 338
    invoke-static {v7, v8}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/content/Context;Landroid/os/Handler;)V

    .line 347
    :cond_4
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    .line 339
    :cond_5
    iget-boolean v1, v0, Lcom/roidapp/cloudlib/template/b/d;->b:Z

    if-eqz v1, :cond_e

    .line 340
    iget-boolean v2, v0, Lcom/roidapp/cloudlib/template/b/d;->e:Z

    .line 1172
    const/4 v1, 0x0

    .line 1173
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/roidapp/cloudlib/template/b/e;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/info"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1174
    invoke-static {v7}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v4, "template_new"

    const/4 v5, 0x0

    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 1175
    const/4 v0, 0x0

    invoke-static {v3, v0}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Z)Z

    move-result v5

    move-object v0, v7

    .line 1176
    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    .line 1178
    if-eqz v4, :cond_6

    .line 1179
    invoke-static {v7}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v6

    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    const-string v9, "template_new"

    const/4 v10, 0x0

    invoke-interface {v6, v9, v10}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1182
    :cond_6
    if-nez v0, :cond_c

    .line 1183
    if-eqz v4, :cond_7

    .line 1184
    const/16 v0, 0x2316

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->b:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v0, v1}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    .line 1186
    :cond_7
    invoke-static {v7, v5, v3}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/content/Context;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1194
    :cond_8
    :goto_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 1195
    invoke-static {v7, v5, v3}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/content/Context;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1198
    :cond_9
    invoke-static {v0}, Lcom/roidapp/cloudlib/template/j;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 1199
    if-eqz v0, :cond_a

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 1200
    :cond_a
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v7, v0, v1}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/content/Context;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/template/j;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 1201
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 1203
    :cond_b
    const/16 v1, 0x2313

    invoke-static {v8, v1, v0}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 1188
    :cond_c
    if-eqz v5, :cond_d

    if-nez v4, :cond_d

    if-eqz v2, :cond_16

    .line 1189
    :cond_d
    const-string v0, "http://dl.pg.ksmobile.com/templates/info"

    invoke-direct {p0, v0, v3}, Lcom/roidapp/cloudlib/template/b/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1190
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 1191
    invoke-static {v0}, Lcom/roidapp/cloudlib/template/j;->a(Ljava/lang/String;)I

    move-result v1

    invoke-static {v7, v1}, Lcom/roidapp/cloudlib/template/g;->a(Landroid/content/Context;I)Z

    goto :goto_2

    .line 341
    :cond_e
    iget-boolean v1, v0, Lcom/roidapp/cloudlib/template/b/d;->c:Z

    if-eqz v1, :cond_14

    .line 342
    iget-boolean v10, v0, Lcom/roidapp/cloudlib/template/b/d;->d:Z

    .line 1278
    const/4 v9, 0x0

    .line 1279
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/template/b/e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/hotest"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 1280
    const/4 v0, 0x0

    invoke-static {v11, v0}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Z)Z

    move-result v12

    move-object v0, v7

    .line 1281
    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v13

    .line 1283
    invoke-static {v7}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v14

    .line 1284
    const-string v0, "cloudlib_template_update_time"

    const-wide/16 v2, 0x0

    invoke-interface {v14, v0, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    .line 1285
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 1286
    const-wide/32 v4, 0x5265c00

    add-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 1287
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/4 v3, 0x5

    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    .line 1289
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    .line 1290
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 1292
    if-nez v13, :cond_f

    if-nez v12, :cond_f

    .line 1293
    const/16 v0, 0x2329

    sget v1, Lcom/roidapp/cloudlib/at;->b:I

    invoke-virtual {v7, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v0, v1}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 1296
    :cond_f
    if-eqz v12, :cond_10

    if-nez v10, :cond_10

    cmp-long v0, v2, v0

    if-ltz v0, :cond_15

    .line 1297
    :cond_10
    sget-object v0, Lcom/roidapp/cloudlib/al;->b:Ljava/lang/String;

    invoke-direct {p0, v0, v11}, Lcom/roidapp/cloudlib/template/b/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1298
    invoke-interface {v14}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v4, "cloudlib_template_update_time"

    invoke-interface {v1, v4, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1300
    :goto_3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_11

    if-eqz v12, :cond_11

    .line 1301
    const/4 v0, 0x1

    invoke-static {v7, v0, v11}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/content/Context;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1304
    :cond_11
    invoke-static {v0}, Lcom/roidapp/cloudlib/template/j;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 1305
    if-eqz v0, :cond_12

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_13

    .line 1306
    :cond_12
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 1307
    const/16 v0, 0x2329

    sget v1, Lcom/roidapp/cloudlib/at;->b:I

    invoke-virtual {v7, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v0, v1}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 1310
    :cond_13
    const/16 v1, 0x2315

    invoke-static {v8, v1, v0}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 343
    :cond_14
    iget-boolean v1, v0, Lcom/roidapp/cloudlib/template/b/d;->f:Z

    if-eqz v1, :cond_4

    .line 344
    invoke-static {v7, v8}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/content/Context;Landroid/os/Handler;)V

    .line 345
    iget v0, v0, Lcom/roidapp/cloudlib/template/b/d;->h:I

    invoke-direct {p0, v7, v8, v0}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/content/Context;Landroid/os/Handler;I)V

    goto/16 :goto_1

    :cond_15
    move-object v0, v9

    goto :goto_3

    :cond_16
    move-object v0, v1

    goto/16 :goto_2
.end method

.method private static a(Landroid/content/Context;ZLjava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 64
    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    if-eqz p1, :cond_1

    .line 69
    :try_start_0
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/FileReader;

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    :goto_0
    :try_start_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 75
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 79
    :catch_0
    move-exception v1

    :goto_1
    :try_start_2
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 81
    if-eqz v2, :cond_0

    .line 83
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 87
    :cond_0
    :goto_2
    return-object v0

    .line 72
    :cond_1
    :try_start_4
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/roidapp/cloudlib/al;->b(Landroid/content/Context;)Ljava/io/InputStream;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 79
    :catch_1
    move-exception v1

    move-object v2, v0

    goto :goto_1

    .line 77
    :cond_2
    :try_start_5
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result-object v0

    .line 83
    :try_start_6
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_2

    :catch_2
    move-exception v1

    goto :goto_2

    .line 81
    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    :goto_3
    if-eqz v2, :cond_3

    .line 83
    :try_start_7
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    .line 84
    :cond_3
    :goto_4
    throw v0

    :catch_3
    move-exception v1

    goto :goto_2

    :catch_4
    move-exception v1

    goto :goto_4

    .line 81
    :catchall_1
    move-exception v0

    goto :goto_3
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 98
    invoke-static {}, Lcom/roidapp/baselib/e/l;->a()V

    .line 102
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    .line 104
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    const/16 v2, 0x7530

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 105
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    const/16 v2, 0x7530

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 106
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 107
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V

    .line 109
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v3, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    :goto_0
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/b/e;->isCancelled()Z

    move-result v4

    if-nez v4, :cond_1

    .line 113
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 126
    :catch_0
    move-exception v0

    move-object v2, v1

    :goto_1
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 128
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 129
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 130
    iput-object v1, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    .line 132
    :cond_0
    invoke-static {v3}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/Closeable;)V

    .line 133
    invoke-static {v2}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/Closeable;)V

    .line 135
    :goto_2
    return-object v1

    .line 115
    :cond_1
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 116
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 117
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 118
    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 119
    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 121
    :cond_2
    new-instance v0, Ljava/io/FileWriter;

    invoke-direct {v0, v4}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 122
    :try_start_4
    invoke-virtual {v0, v2}, Ljava/io/FileWriter;->write(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 128
    :goto_3
    iget-object v4, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    if-eqz v4, :cond_3

    .line 129
    iget-object v4, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 130
    iput-object v1, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    .line 132
    :cond_3
    invoke-static {v3}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/Closeable;)V

    .line 133
    invoke-static {v0}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/Closeable;)V

    move-object v1, v2

    goto :goto_2

    .line 128
    :catchall_0
    move-exception v0

    move-object v2, v1

    move-object v3, v1

    :goto_4
    iget-object v4, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    if-eqz v4, :cond_4

    .line 129
    iget-object v4, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 130
    iput-object v1, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    .line 132
    :cond_4
    invoke-static {v3}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/Closeable;)V

    .line 133
    invoke-static {v2}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/Closeable;)V

    throw v0

    .line 128
    :catchall_1
    move-exception v0

    move-object v2, v1

    goto :goto_4

    :catchall_2
    move-exception v2

    move-object v5, v2

    move-object v2, v0

    move-object v0, v5

    goto :goto_4

    :catchall_3
    move-exception v0

    goto :goto_4

    .line 126
    :catch_1
    move-exception v0

    move-object v2, v1

    move-object v3, v1

    goto :goto_1

    :catch_2
    move-exception v2

    move-object v5, v2

    move-object v2, v0

    move-object v0, v5

    goto :goto_1

    :cond_5
    move-object v0, v1

    goto :goto_3
.end method

.method private static a(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 145
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/template/b/e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/local"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 146
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/roidapp/cloudlib/template/b/e;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/favourite"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 147
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 148
    invoke-static {v0, v4}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Z)Z

    move-result v3

    invoke-static {p0, v3, v0}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/content/Context;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/template/j;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 149
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 150
    :cond_0
    invoke-static {p0, v4, v5}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/content/Context;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/template/j;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 152
    :cond_1
    const-string v3, "local"

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    invoke-static {v1, v4}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 155
    const/4 v0, 0x1

    invoke-static {v5, v0, v1}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/content/Context;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/template/j;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 156
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 157
    const-string v1, "favourite"

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    :cond_2
    const v0, 0x23611

    invoke-static {p1, v0, v2}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    .line 161
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/os/Handler;I)V
    .locals 7

    .prologue
    const/16 v6, 0x2316

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v1, 0x0

    .line 210
    move-object v0, p1

    .line 224
    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    .line 230
    if-nez v0, :cond_2

    .line 232
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/roidapp/cloudlib/at;->b:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v6, v0}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    move-object v0, v1

    .line 249
    :goto_0
    invoke-static {v0, v5}, Lcom/roidapp/cloudlib/template/j;->a(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v0

    .line 250
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 251
    :cond_0
    invoke-static {p1, v4, v1}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/content/Context;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/template/j;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 252
    if-eqz v1, :cond_3

    .line 253
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 254
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 255
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 256
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->j()I

    move-result v3

    if-eq v3, p3, :cond_1

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->j()I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_1

    .line 257
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 236
    :cond_2
    sget-object v0, Lcom/roidapp/cloudlib/al;->d:Ljava/lang/String;

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/template/b/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    move-object v0, v1

    .line 263
    :cond_4
    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 264
    :cond_5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v6, v0}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    .line 269
    :goto_2
    return-void

    .line 267
    :cond_6
    const/16 v1, 0x2331

    invoke-static {p2, v1, v0}, Lcom/roidapp/cloudlib/template/b/e;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    goto :goto_2
.end method


# virtual methods
.method final a()V
    .locals 2

    .prologue
    .line 356
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/b/e;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 357
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/template/b/e;->cancel(Z)Z

    .line 359
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_1

    .line 360
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/e;->b:Ljava/net/HttpURLConnection;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 361
    new-instance v1, Lcom/roidapp/cloudlib/template/b/f;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/cloudlib/template/b/f;-><init>(Lcom/roidapp/cloudlib/template/b/e;Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/template/b/f;->start()V

    .line 374
    :cond_1
    return-void
.end method

.method final a(Lcom/roidapp/cloudlib/template/b/l;)V
    .locals 3

    .prologue
    .line 378
    sget-object v0, Lcom/roidapp/baselib/c/c;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/roidapp/cloudlib/template/b/l;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/template/b/e;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    .line 379
    return-void
.end method

.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 45
    check-cast p1, [Lcom/roidapp/cloudlib/template/b/l;

    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/template/b/e;->a([Lcom/roidapp/cloudlib/template/b/l;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected final onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 352
    .line 2022
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/template/b/j;->cancel(Z)Z

    .line 353
    return-void
.end method
