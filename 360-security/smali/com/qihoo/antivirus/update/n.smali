.class public Lcom/qihoo/antivirus/update/n;
.super Lcom/qihoo/antivirus/update/ag;
.source "360Security"


# instance fields
.field private d:Lcom/qihoo/antivirus/update/d;


# direct methods
.method public constructor <init>(Lcom/qihoo/antivirus/update/d;I)V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0, p1, p2}, Lcom/qihoo/antivirus/update/ag;-><init>(Lcom/qihoo/antivirus/update/d;I)V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    .line 25
    iput-object p1, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    .line 26
    return-void
.end method

.method private a(Lcom/qihoo/antivirus/update/h;)I
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v2, -0x1

    .line 201
    invoke-virtual {p1}, Lcom/qihoo/antivirus/update/h;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 202
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_1

    .line 203
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    .line 240
    :cond_1
    invoke-virtual {p1}, Lcom/qihoo/antivirus/update/h;->b()Ljava/util/ArrayList;

    move-result-object v0

    .line 241
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_3

    .line 242
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_8

    .line 297
    :cond_3
    :goto_0
    return v1

    .line 203
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/antivirus/update/u;

    .line 204
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->g()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_5

    move v1, v2

    .line 208
    goto :goto_0

    .line 211
    :cond_5
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->d()Ljava/lang/String;

    move-result-object v4

    .line 212
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->e()Ljava/lang/String;

    move-result-object v5

    .line 213
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->f()J

    move-result-wide v6

    .line 214
    invoke-direct {p0, v4, v5, v6, v7}, Lcom/qihoo/antivirus/update/n;->a(Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v4

    if-nez v4, :cond_6

    move v1, v2

    .line 218
    goto :goto_0

    .line 221
    :cond_6
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->a()Ljava/lang/String;

    move-result-object v4

    .line 222
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->b()Ljava/lang/String;

    move-result-object v5

    .line 223
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->c()J

    move-result-wide v6

    .line 224
    invoke-direct {p0, v4, v5, v6, v7}, Lcom/qihoo/antivirus/update/n;->a(Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v5

    if-nez v5, :cond_7

    move v1, v2

    .line 228
    goto :goto_0

    .line 230
    :cond_7
    if-eqz v4, :cond_0

    .line 231
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->k()I

    move-result v0

    if-ne v0, v2, :cond_0

    move v1, v2

    .line 235
    goto :goto_0

    .line 242
    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/antivirus/update/s;

    .line 243
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->b()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_9

    move v1, v2

    .line 247
    goto :goto_0

    .line 250
    :cond_9
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->f()Ljava/lang/String;

    move-result-object v4

    .line 251
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->g()Ljava/lang/String;

    move-result-object v5

    .line 252
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->h()J

    move-result-wide v6

    .line 253
    invoke-direct {p0, v4, v5, v6, v7}, Lcom/qihoo/antivirus/update/n;->a(Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v4

    if-nez v4, :cond_a

    move v1, v2

    .line 257
    goto :goto_0

    .line 260
    :cond_a
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->c()Ljava/lang/String;

    move-result-object v4

    .line 261
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->d()Ljava/lang/String;

    move-result-object v5

    .line 262
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->e()J

    move-result-wide v6

    .line 263
    invoke-direct {p0, v4, v5, v6, v7}, Lcom/qihoo/antivirus/update/n;->a(Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v5

    if-nez v5, :cond_b

    move v1, v2

    .line 267
    goto :goto_0

    .line 269
    :cond_b
    if-eqz v4, :cond_2

    .line 270
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->i()I

    move-result v4

    if-ne v4, v2, :cond_c

    move v1, v2

    .line 274
    goto :goto_0

    .line 277
    :cond_c
    iget-object v4, v0, Lcom/qihoo/antivirus/update/s;->a:Ljava/lang/String;

    .line 278
    if-nez v4, :cond_d

    move v1, v2

    .line 282
    goto/16 :goto_0

    :cond_d
    move v0, v1

    .line 284
    :goto_1
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v0, v5, :cond_2

    .line 285
    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 286
    const/16 v6, 0x30

    if-lt v5, v6, :cond_e

    const/16 v6, 0x39

    if-le v5, v6, :cond_f

    :cond_e
    move v1, v2

    .line 290
    goto/16 :goto_0

    .line 284
    :cond_f
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method private a(Ljava/util/ArrayList;)Lcom/qihoo/antivirus/update/u;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/antivirus/update/u;",
            ">;)",
            "Lcom/qihoo/antivirus/update/u;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 317
    const/4 v3, 0x0

    .line 318
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 320
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    move-object v0, v3

    .line 327
    :goto_0
    if-nez v0, :cond_1

    .line 329
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/antivirus/update/u;

    .line 334
    :cond_1
    return-object v0

    .line 320
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/antivirus/update/u;

    .line 321
    add-int/lit8 v1, v1, 0x1

    .line 322
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->a()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    goto :goto_0
.end method

.method private a(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/antivirus/update/s;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/antivirus/update/q;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 386
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 387
    iget-object v0, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/antivirus/update/d;->a(Ljava/util/ArrayList;)V

    .line 391
    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 392
    iget-object v0, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0, p2}, Lcom/qihoo/antivirus/update/d;->b(Ljava/util/ArrayList;)V

    .line 393
    iget-object v0, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/d;->f()V

    .line 395
    :cond_1
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 5

    .prologue
    const-wide/16 v2, 0x0

    const/4 v0, 0x1

    .line 188
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    cmp-long v1, p3, v2

    if-eqz v1, :cond_1

    .line 194
    :cond_0
    :goto_0
    return v0

    .line 191
    :cond_1
    if-nez p1, :cond_2

    if-nez p2, :cond_2

    cmp-long v1, p3, v2

    if-eqz v1, :cond_0

    .line 194
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/antivirus/update/u;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 338
    if-eqz p1, :cond_1

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 339
    invoke-direct/range {p0 .. p1}, Lcom/qihoo/antivirus/update/n;->a(Ljava/util/ArrayList;)Lcom/qihoo/antivirus/update/u;

    move-result-object v0

    .line 341
    iget-object v1, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v1, v0}, Lcom/qihoo/antivirus/update/d;->a(Lcom/qihoo/antivirus/update/u;)V

    .line 343
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->a()Ljava/lang/String;

    move-result-object v1

    .line 344
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->b()Ljava/lang/String;

    move-result-object v2

    .line 345
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->c()J

    move-result-wide v4

    .line 346
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->d()Ljava/lang/String;

    move-result-object v3

    .line 347
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->e()Ljava/lang/String;

    move-result-object v6

    .line 348
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->f()J

    move-result-wide v8

    .line 349
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->g()Ljava/lang/String;

    move-result-object v7

    .line 350
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->h()Ljava/lang/String;

    move-result-object v10

    .line 351
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->i()Ljava/lang/String;

    move-result-object v11

    .line 352
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/u;->j()I

    move-result v0

    .line 354
    iget-object v12, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v13, "Update"

    const-string/jumbo v14, "url"

    invoke-virtual {v12, v13, v14, v3}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    iget-object v3, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v12, "Update"

    const-string/jumbo v13, "size"

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v12, v13, v8}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 356
    iget-object v3, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v8, "Update"

    const-string/jumbo v9, "md5"

    invoke-virtual {v3, v8, v9, v6}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    iget-object v3, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v6, "Update"

    const-string/jumbo v8, "patchurl"

    invoke-virtual {v3, v6, v8, v1}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    iget-object v1, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v3, "Update"

    const-string/jumbo v6, "patchsize"

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v6, v4}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    iget-object v1, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v3, "Update"

    const-string/jumbo v4, "patchmd5"

    invoke-virtual {v1, v3, v4, v2}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    iget-object v1, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v2, "Update"

    const-string/jumbo v3, "version"

    invoke-virtual {v1, v2, v3, v7}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    iget-object v1, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v2, "Update"

    const-string/jumbo v3, "versioncode"

    invoke-virtual {v1, v2, v3, v10}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    iget-object v1, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v2, "Update"

    const-string/jumbo v3, "force"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v3, v0}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 367
    const-string/jumbo v0, "\\\\n"

    const-string/jumbo v1, "\n"

    invoke-virtual {v11, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 368
    iget-object v1, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v2, "Update"

    const-string/jumbo v3, "description"

    invoke-virtual {v1, v2, v3, v0}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    :cond_0
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 371
    iget-object v0, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/d;->j()V

    .line 381
    :cond_1
    return-void
.end method

.method private e()Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 157
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    new-instance v4, Ljava/io/FileInputStream;

    sget-object v5, Lcom/qihoo/antivirus/update/ah;->b:Ljava/lang/String;

    invoke-direct {v4, v5}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    :goto_0
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v3

    if-nez v3, :cond_1

    .line 171
    if-eqz v1, :cond_0

    .line 173
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 179
    :cond_0
    :goto_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 180
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 184
    :goto_2
    return-object v0

    .line 163
    :cond_1
    :try_start_3
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    const-string/jumbo v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    .line 166
    :catch_0
    move-exception v3

    .line 171
    :goto_3
    if-eqz v1, :cond_0

    .line 173
    :try_start_4
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    .line 174
    :catch_1
    move-exception v1

    goto :goto_1

    .line 170
    :catchall_0
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    .line 171
    :goto_4
    if-eqz v1, :cond_2

    .line 173
    :try_start_5
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 177
    :cond_2
    :goto_5
    throw v0

    :cond_3
    move-object v0, v1

    .line 184
    goto :goto_2

    .line 174
    :catch_2
    move-exception v1

    goto :goto_5

    :catch_3
    move-exception v1

    goto :goto_1

    .line 170
    :catchall_1
    move-exception v0

    goto :goto_4

    .line 166
    :catch_4
    move-exception v1

    move-object v1, v0

    goto :goto_3
.end method


# virtual methods
.method protected a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;)I
    .locals 10

    .prologue
    const/16 v4, 0x19

    const/4 v1, -0x8

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/16 v2, -0x63

    .line 38
    iget-object v0, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v6, "update-1.0.0"

    invoke-static {v0, v6}, Lcom/qihoo/antivirus/update/ae;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 44
    const/16 v0, 0x18

    const-string/jumbo v1, "load so failed."

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/antivirus/update/n;->a(ILjava/lang/String;)V

    move v0, v2

    .line 153
    :goto_0
    return v0

    .line 48
    :cond_0
    iget-object v0, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/antivirus/update/ah;->a(Landroid/content/Context;)V

    .line 50
    new-instance v6, Lcom/qihoo/antivirus/update/NetQuery;

    iget-object v0, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v6, v0}, Lcom/qihoo/antivirus/update/NetQuery;-><init>(Landroid/content/Context;)V

    .line 52
    iget-object v0, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/antivirus/update/af;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 53
    const-string/jumbo v7, "1"

    invoke-virtual {v6, v7, v0}, Lcom/qihoo/antivirus/update/NetQuery;->a(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 54
    const-string/jumbo v0, "5"

    sget-object v7, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v6, v0, v7}, Lcom/qihoo/antivirus/update/NetQuery;->a(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 55
    const-string/jumbo v0, "6"

    sget-object v7, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v6, v0, v7}, Lcom/qihoo/antivirus/update/NetQuery;->a(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 56
    const-string/jumbo v0, "7"

    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v0, v7}, Lcom/qihoo/antivirus/update/NetQuery;->a(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 57
    const-string/jumbo v0, "8"

    sget-object v7, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v6, v0, v7}, Lcom/qihoo/antivirus/update/NetQuery;->a(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 58
    const-string/jumbo v0, "10"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v0, v7}, Lcom/qihoo/antivirus/update/NetQuery;->a(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 60
    sget-object v0, Lcom/qihoo/antivirus/update/ah;->a:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 61
    const-string/jumbo v0, "200"

    sget-object v7, Lcom/qihoo/antivirus/update/ah;->a:Ljava/lang/String;

    invoke-virtual {v6, v0, v7}, Lcom/qihoo/antivirus/update/NetQuery;->a(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 76
    :cond_1
    :goto_1
    new-array v7, v3, [Ljava/lang/String;

    .line 77
    iget-object v0, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/antivirus/update/x;->c(Landroid/content/Context;)I

    move-result v8

    .line 78
    const/16 v0, 0x7530

    .line 79
    if-eq v8, v3, :cond_2

    const/4 v9, 0x3

    if-lt v8, v9, :cond_3

    .line 80
    :cond_2
    const/16 v0, 0x3a98

    .line 82
    :cond_3
    iget-object v9, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v9, v8}, Lcom/qihoo/antivirus/update/d;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8, v0, v7}, Lcom/qihoo/antivirus/update/NetQuery;->a(Ljava/lang/String;I[Ljava/lang/String;)I

    move-result v0

    .line 83
    invoke-virtual {v6}, Lcom/qihoo/antivirus/update/NetQuery;->a()Z

    .line 85
    sget-boolean v6, Lcom/qihoo/antivirus/update/UpdateService;->f:Z

    if-eqz v6, :cond_5

    move v0, v3

    .line 89
    goto/16 :goto_0

    .line 65
    :cond_4
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 66
    const-string/jumbo v0, "200"

    sget-object v7, Lcom/qihoo/antivirus/update/UpdateService;->d:Ljava/lang/String;

    invoke-virtual {v6, v0, v7}, Lcom/qihoo/antivirus/update/NetQuery;->a(Ljava/lang/String;Ljava/lang/Object;)Z

    goto :goto_1

    .line 92
    :cond_5
    sget-boolean v6, Lcom/qihoo/antivirus/update/ah;->c:Z

    if-eqz v6, :cond_6

    sget-object v6, Lcom/qihoo/antivirus/update/ah;->b:Ljava/lang/String;

    if-eqz v6, :cond_6

    .line 97
    invoke-direct {p0}, Lcom/qihoo/antivirus/update/n;->e()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v7, v5

    .line 98
    aget-object v0, v7, v5

    if-nez v0, :cond_e

    move v0, v1

    .line 102
    :cond_6
    :goto_2
    if-nez v0, :cond_7

    .line 103
    aget-object v0, v7, v5

    if-nez v0, :cond_b

    .line 106
    neg-int v0, v1

    .line 108
    const-string/jumbo v1, "info null."

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/antivirus/update/n;->a(ILjava/lang/String;)V

    move v0, v2

    .line 109
    goto/16 :goto_0

    .line 111
    :cond_7
    if-ne v0, v1, :cond_8

    .line 117
    iget-object v0, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "version"

    const-string/jumbo v2, "0"

    invoke-static {v0, v1, v2}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    move v0, v3

    .line 118
    goto/16 :goto_0

    .line 124
    :cond_8
    const/4 v1, -0x3

    if-eq v0, v1, :cond_9

    move v0, v4

    .line 127
    :cond_9
    if-gez v0, :cond_a

    .line 128
    neg-int v0, v0

    .line 130
    :cond_a
    const-string/jumbo v1, "v5 error."

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/antivirus/update/n;->a(ILjava/lang/String;)V

    move v0, v2

    .line 131
    goto/16 :goto_0

    .line 137
    :cond_b
    new-instance v0, Lcom/qihoo/antivirus/update/j;

    invoke-direct {v0}, Lcom/qihoo/antivirus/update/j;-><init>()V

    .line 138
    iget-object v1, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v1}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v1

    aget-object v5, v7, v5

    invoke-virtual {v0, v1, v5}, Lcom/qihoo/antivirus/update/j;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/qihoo/antivirus/update/h;

    move-result-object v0

    .line 139
    if-nez v0, :cond_c

    .line 141
    const-string/jumbo v0, "ini config error #1."

    invoke-virtual {p0, v4, v0}, Lcom/qihoo/antivirus/update/n;->a(ILjava/lang/String;)V

    move v0, v2

    .line 142
    goto/16 :goto_0

    .line 144
    :cond_c
    invoke-direct {p0, v0}, Lcom/qihoo/antivirus/update/n;->a(Lcom/qihoo/antivirus/update/h;)I

    move-result v1

    .line 145
    if-gez v1, :cond_d

    .line 147
    const/16 v0, 0x1a

    const-string/jumbo v1, "ini config error #2."

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/antivirus/update/n;->a(ILjava/lang/String;)V

    move v0, v2

    .line 148
    goto/16 :goto_0

    .line 150
    :cond_d
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/h;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/qihoo/antivirus/update/n;->b(Ljava/util/ArrayList;)V

    .line 151
    iget-object v1, p0, Lcom/qihoo/antivirus/update/n;->d:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/h;->b()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/qihoo/antivirus/update/d;->c(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v1

    .line 152
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/h;->c()Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/qihoo/antivirus/update/n;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    move v0, v3

    .line 153
    goto/16 :goto_0

    :cond_e
    move v0, v5

    goto :goto_2
.end method

.method public a(JJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 313
    return-void
.end method
