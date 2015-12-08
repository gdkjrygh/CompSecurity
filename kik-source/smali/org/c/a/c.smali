.class public final Lorg/c/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lorg/c/a/a;
    .locals 12

    .prologue
    const/16 v11, 0x5c

    const/4 v6, 0x0

    const/4 v10, 0x2

    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 152
    new-array v7, v10, [Ljava/lang/Object;

    aput-object p1, v7, v2

    aput-object p2, v7, v4

    aget-object v0, v7, v4

    instance-of v1, v0, Ljava/lang/Throwable;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Throwable;

    move-object v5, v0

    :goto_0
    if-nez p0, :cond_1

    new-instance v0, Lorg/c/a/a;

    invoke-direct {v0, v6, v7, v5}, Lorg/c/a/a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    :goto_1
    return-object v0

    :cond_0
    move-object v5, v6

    goto :goto_0

    :cond_1
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x32

    invoke-direct {v8, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    move v0, v2

    move v1, v2

    :goto_2
    if-ge v0, v10, :cond_8

    const-string v3, "{}"

    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v9

    const/4 v3, -0x1

    if-ne v9, v3, :cond_3

    if-nez v1, :cond_2

    new-instance v0, Lorg/c/a/a;

    invoke-direct {v0, p0, v7, v5}, Lorg/c/a/a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance v0, Lorg/c/a/a;

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v7, v5}, Lorg/c/a/a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_3
    if-eqz v9, :cond_4

    add-int/lit8 v3, v9, -0x1

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v11, :cond_4

    move v3, v4

    :goto_3
    if-eqz v3, :cond_7

    if-lt v9, v10, :cond_5

    add-int/lit8 v3, v9, -0x2

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v11, :cond_5

    move v3, v4

    :goto_4
    if-nez v3, :cond_6

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v3, v9, -0x1

    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v1, 0x7b

    invoke-virtual {v8, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v9, 0x1

    :goto_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    move v3, v2

    goto :goto_3

    :cond_5
    move v3, v2

    goto :goto_4

    :cond_6
    add-int/lit8 v3, v9, -0x1

    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    aget-object v1, v7, v0

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-static {v8, v1, v3}, Lorg/c/a/c;->a(Ljava/lang/StringBuffer;Ljava/lang/Object;Ljava/util/Map;)V

    add-int/lit8 v1, v9, 0x2

    goto :goto_5

    :cond_7
    invoke-virtual {p0, v1, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    aget-object v1, v7, v0

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-static {v8, v1, v3}, Lorg/c/a/c;->a(Ljava/lang/StringBuffer;Ljava/lang/Object;Ljava/util/Map;)V

    add-int/lit8 v1, v9, 0x2

    goto :goto_5

    :cond_8
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-gtz v0, :cond_9

    new-instance v0, Lorg/c/a/a;

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v7, v5}, Lorg/c/a/a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto/16 :goto_1

    :cond_9
    new-instance v0, Lorg/c/a/a;

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v7, v6}, Lorg/c/a/a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto/16 :goto_1
.end method

.method private static a(Ljava/lang/StringBuffer;Ljava/lang/Object;Ljava/util/Map;)V
    .locals 4

    .prologue
    .line 271
    if-nez p1, :cond_0

    .line 272
    const-string v0, "null"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 300
    :goto_0
    return-void

    .line 275
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-nez v0, :cond_1

    .line 276
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SLF4J: Failed toString() invocation on an object of type ["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const-string v0, "[FAILED toString()]"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 280
    :cond_1
    instance-of v0, p1, [Z

    if-eqz v0, :cond_2

    .line 281
    check-cast p1, [Z

    invoke-static {p0, p1}, Lorg/c/a/c;->a(Ljava/lang/StringBuffer;[Z)V

    goto :goto_0

    .line 282
    :cond_2
    instance-of v0, p1, [B

    if-eqz v0, :cond_3

    .line 283
    check-cast p1, [B

    invoke-static {p0, p1}, Lorg/c/a/c;->a(Ljava/lang/StringBuffer;[B)V

    goto :goto_0

    .line 284
    :cond_3
    instance-of v0, p1, [C

    if-eqz v0, :cond_4

    .line 285
    check-cast p1, [C

    invoke-static {p0, p1}, Lorg/c/a/c;->a(Ljava/lang/StringBuffer;[C)V

    goto :goto_0

    .line 286
    :cond_4
    instance-of v0, p1, [S

    if-eqz v0, :cond_5

    .line 287
    check-cast p1, [S

    invoke-static {p0, p1}, Lorg/c/a/c;->a(Ljava/lang/StringBuffer;[S)V

    goto :goto_0

    .line 288
    :cond_5
    instance-of v0, p1, [I

    if-eqz v0, :cond_6

    .line 289
    check-cast p1, [I

    invoke-static {p0, p1}, Lorg/c/a/c;->a(Ljava/lang/StringBuffer;[I)V

    goto :goto_0

    .line 290
    :cond_6
    instance-of v0, p1, [J

    if-eqz v0, :cond_7

    .line 291
    check-cast p1, [J

    invoke-static {p0, p1}, Lorg/c/a/c;->a(Ljava/lang/StringBuffer;[J)V

    goto :goto_0

    .line 292
    :cond_7
    instance-of v0, p1, [F

    if-eqz v0, :cond_8

    .line 293
    check-cast p1, [F

    invoke-static {p0, p1}, Lorg/c/a/c;->a(Ljava/lang/StringBuffer;[F)V

    goto/16 :goto_0

    .line 294
    :cond_8
    instance-of v0, p1, [D

    if-eqz v0, :cond_9

    .line 295
    check-cast p1, [D

    invoke-static {p0, p1}, Lorg/c/a/c;->a(Ljava/lang/StringBuffer;[D)V

    goto/16 :goto_0

    .line 297
    :cond_9
    check-cast p1, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lorg/c/a/c;->a(Ljava/lang/StringBuffer;[Ljava/lang/Object;Ljava/util/Map;)V

    goto/16 :goto_0
.end method

.method private static a(Ljava/lang/StringBuffer;[B)V
    .locals 3

    .prologue
    .line 347
    const/16 v0, 0x5b

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 348
    array-length v1, p1

    .line 349
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 350
    aget-byte v2, p1, v0

    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 351
    add-int/lit8 v2, v1, -0x1

    if-eq v0, v2, :cond_0

    .line 352
    const-string v2, ", "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 349
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 354
    :cond_1
    const/16 v0, 0x5d

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 355
    return-void
.end method

.method private static a(Ljava/lang/StringBuffer;[C)V
    .locals 3

    .prologue
    .line 358
    const/16 v0, 0x5b

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 359
    array-length v1, p1

    .line 360
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 361
    aget-char v2, p1, v0

    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 362
    add-int/lit8 v2, v1, -0x1

    if-eq v0, v2, :cond_0

    .line 363
    const-string v2, ", "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 360
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 365
    :cond_1
    const/16 v0, 0x5d

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 366
    return-void
.end method

.method private static a(Ljava/lang/StringBuffer;[D)V
    .locals 4

    .prologue
    .line 413
    const/16 v0, 0x5b

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 414
    array-length v1, p1

    .line 415
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 416
    aget-wide v2, p1, v0

    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    .line 417
    add-int/lit8 v2, v1, -0x1

    if-eq v0, v2, :cond_0

    .line 418
    const-string v2, ", "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 415
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 420
    :cond_1
    const/16 v0, 0x5d

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 421
    return-void
.end method

.method private static a(Ljava/lang/StringBuffer;[F)V
    .locals 3

    .prologue
    .line 402
    const/16 v0, 0x5b

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 403
    array-length v1, p1

    .line 404
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 405
    aget v2, p1, v0

    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    .line 406
    add-int/lit8 v2, v1, -0x1

    if-eq v0, v2, :cond_0

    .line 407
    const-string v2, ", "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 404
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 409
    :cond_1
    const/16 v0, 0x5d

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 410
    return-void
.end method

.method private static a(Ljava/lang/StringBuffer;[I)V
    .locals 3

    .prologue
    .line 380
    const/16 v0, 0x5b

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 381
    array-length v1, p1

    .line 382
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 383
    aget v2, p1, v0

    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 384
    add-int/lit8 v2, v1, -0x1

    if-eq v0, v2, :cond_0

    .line 385
    const-string v2, ", "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 382
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 387
    :cond_1
    const/16 v0, 0x5d

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 388
    return-void
.end method

.method private static a(Ljava/lang/StringBuffer;[J)V
    .locals 4

    .prologue
    .line 391
    const/16 v0, 0x5b

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 392
    array-length v1, p1

    .line 393
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 394
    aget-wide v2, p1, v0

    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 395
    add-int/lit8 v2, v1, -0x1

    if-eq v0, v2, :cond_0

    .line 396
    const-string v2, ", "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 393
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 398
    :cond_1
    const/16 v0, 0x5d

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 399
    return-void
.end method

.method private static a(Ljava/lang/StringBuffer;[Ljava/lang/Object;Ljava/util/Map;)V
    .locals 3

    .prologue
    .line 318
    const/16 v0, 0x5b

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 319
    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 320
    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    array-length v1, p1

    .line 322
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 323
    aget-object v2, p1, v0

    invoke-static {p0, v2, p2}, Lorg/c/a/c;->a(Ljava/lang/StringBuffer;Ljava/lang/Object;Ljava/util/Map;)V

    .line 324
    add-int/lit8 v2, v1, -0x1

    if-eq v0, v2, :cond_0

    .line 325
    const-string v2, ", "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 322
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 328
    :cond_1
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    :goto_1
    const/16 v0, 0x5d

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 333
    return-void

    .line 330
    :cond_2
    const-string v0, "..."

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1
.end method

.method private static a(Ljava/lang/StringBuffer;[S)V
    .locals 3

    .prologue
    .line 369
    const/16 v0, 0x5b

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 370
    array-length v1, p1

    .line 371
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 372
    aget-short v2, p1, v0

    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 373
    add-int/lit8 v2, v1, -0x1

    if-eq v0, v2, :cond_0

    .line 374
    const-string v2, ", "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 371
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 376
    :cond_1
    const/16 v0, 0x5d

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 377
    return-void
.end method

.method private static a(Ljava/lang/StringBuffer;[Z)V
    .locals 3

    .prologue
    .line 336
    const/16 v0, 0x5b

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 337
    array-length v1, p1

    .line 338
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 339
    aget-boolean v2, p1, v0

    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    .line 340
    add-int/lit8 v2, v1, -0x1

    if-eq v0, v2, :cond_0

    .line 341
    const-string v2, ", "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 338
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 343
    :cond_1
    const/16 v0, 0x5d

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 344
    return-void
.end method
