.class public final Lcom/kik/cache/v;
.super Lcom/kik/cache/ac;
.source "SourceFile"


# instance fields
.field private f:Ljava/lang/Object;

.field private final g:Lkik/a/e/r;

.field private final h:Lcom/kik/cache/ad;

.field private final i:Lcom/kik/android/a;

.field private j:Z


# direct methods
.method private constructor <init>(Lkik/a/d/n;Ljava/lang/String;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;Lkik/a/e/r;ZLcom/kik/cache/ad;Lcom/kik/android/a;)V
    .locals 9

    .prologue
    .line 45
    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, Lcom/kik/cache/ac;-><init>(Ljava/lang/Object;Ljava/lang/String;Lcom/android/volley/r$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V

    .line 31
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/kik/cache/v;->f:Ljava/lang/Object;

    .line 46
    iput-object p6, p0, Lcom/kik/cache/v;->g:Lkik/a/e/r;

    .line 47
    move/from16 v0, p7

    iput-boolean v0, p0, Lcom/kik/cache/v;->j:Z

    .line 48
    move-object/from16 v0, p9

    iput-object v0, p0, Lcom/kik/cache/v;->i:Lcom/kik/android/a;

    .line 49
    move-object/from16 v0, p8

    iput-object v0, p0, Lcom/kik/cache/v;->h:Lcom/kik/cache/ad;

    .line 50
    return-void
.end method

.method public static a(Lkik/a/d/n;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;Lkik/a/e/r;ZLcom/kik/cache/ad;Lcom/kik/android/a;)Lcom/kik/cache/v;
    .locals 10

    .prologue
    .line 39
    invoke-static {p0}, Lcom/kik/cache/v;->c(Lkik/a/d/n;)Ljava/lang/String;

    move-result-object v2

    .line 40
    new-instance v0, Lcom/kik/cache/v;

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v0 .. v9}, Lcom/kik/cache/v;-><init>(Lkik/a/d/n;Ljava/lang/String;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;Lkik/a/e/r;ZLcom/kik/cache/ad;Lcom/kik/android/a;)V

    return-object v0
.end method

.method public static a(Lkik/a/d/n;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    invoke-static {p0}, Lcom/kik/cache/v;->c(Lkik/a/d/n;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lkik/a/d/n;)Lcom/kik/cache/SimpleLruBitmapCache$a;
    .locals 2

    .prologue
    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lcom/kik/cache/v;->c(Lkik/a/d/n;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#!#GroupImageRequest"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 162
    new-instance v1, Lcom/kik/cache/w;

    invoke-direct {v1, v0}, Lcom/kik/cache/w;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method private static c(Lkik/a/d/n;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 61
    const-string v0, "http://127.0.0.1/groupPic/"

    .line 62
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 64
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "UTF-8"

    invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 70
    :cond_0
    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public final a(II)Ljava/lang/String;
    .locals 4

    .prologue
    .line 144
    invoke-virtual {p0}, Lcom/kik/cache/v;->x()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/n;

    invoke-static {v0}, Lcom/kik/cache/v;->c(Lkik/a/d/n;)Ljava/lang/String;

    move-result-object v0

    .line 145
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    const-string v2, "#W"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "#H"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 147
    iget-boolean v2, p0, Lcom/kik/cache/v;->j:Z

    if-eqz v2, :cond_0

    .line 148
    const-string v2, "#LARGE"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "#!#GroupImageRequest"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lcom/android/volley/b$a;)Lcom/android/volley/b$a;
    .locals 1

    .prologue
    .line 188
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final b(Lcom/android/volley/k;)Lcom/android/volley/r;
    .locals 12

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    const-wide/32 v10, 0x41353000

    .line 76
    iget-object v4, p0, Lcom/kik/cache/v;->f:Ljava/lang/Object;

    monitor-enter v4

    .line 77
    if-nez p1, :cond_0

    :try_start_0
    new-instance v0, Lcom/android/volley/w;

    const-string v1, "Null response"

    invoke-direct {v0, v1}, Lcom/android/volley/w;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/android/volley/r;->a(Lcom/android/volley/w;)Lcom/android/volley/r;

    move-result-object v0

    :goto_0
    monitor-exit v4

    return-object v0

    :cond_0
    iget-object v0, p1, Lcom/android/volley/k;->b:[B

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/android/volley/k;->b:[B

    array-length v0, v0

    const/16 v1, 0xa

    if-le v0, v1, :cond_1

    iget-object v0, p1, Lcom/android/volley/k;->b:[B

    const/4 v1, 0x0

    iget-object v5, p1, Lcom/android/volley/k;->b:[B

    array-length v5, v5

    invoke-static {v0, v1, v5}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/android/volley/toolbox/f;->a(Lcom/android/volley/k;)Lcom/android/volley/b$a;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/android/volley/r;->a(Ljava/lang/Object;Lcom/android/volley/b$a;)Lcom/android/volley/r;

    move-result-object v0

    iget-object v1, v0, Lcom/android/volley/r;->b:Lcom/android/volley/b$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long/2addr v2, v10

    iput-wide v2, v1, Lcom/android/volley/b$a;->e:J

    iget-object v1, v0, Lcom/android/volley/r;->b:Lcom/android/volley/b$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long/2addr v2, v10

    iput-wide v2, v1, Lcom/android/volley/b$a;->d:J

    goto :goto_0

    .line 78
    :catchall_0
    move-exception v0

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 77
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lcom/kik/cache/v;->x()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/n;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v7, p0, Lcom/kik/cache/v;->g:Lkik/a/e/r;

    const/4 v8, 0x1

    invoke-interface {v7, v1, v8}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget-boolean v1, p0, Lcom/kik/cache/v;->j:Z

    if-eqz v1, :cond_4

    const/4 v1, 0x2

    invoke-virtual {v0}, Lkik/a/d/n;->I()Z

    move-result v0

    if-nez v0, :cond_3

    :goto_2
    iget-object v0, p0, Lcom/kik/cache/v;->h:Lcom/kik/cache/ad;

    invoke-static {v5, v1, v2, v0}, Lkik/android/util/e;->a(Ljava/util/ArrayList;IZLcom/kik/cache/ad;)Lkik/android/util/e$a;

    move-result-object v0

    move-object v1, v0

    :goto_3
    iget-object v0, v1, Lkik/android/util/e$a;->a:Landroid/graphics/Bitmap;

    invoke-static {p1}, Lcom/android/volley/toolbox/f;->a(Lcom/android/volley/k;)Lcom/android/volley/b$a;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/android/volley/r;->a(Ljava/lang/Object;Lcom/android/volley/b$a;)Lcom/android/volley/r;

    move-result-object v0

    iget-boolean v2, v1, Lkik/android/util/e$a;->b:Z

    if-eqz v2, :cond_6

    iget-object v2, v0, Lcom/android/volley/r;->b:Lcom/android/volley/b$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    add-long/2addr v6, v10

    iput-wide v6, v2, Lcom/android/volley/b$a;->e:J

    iget-object v2, v0, Lcom/android/volley/r;->b:Lcom/android/volley/b$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    add-long/2addr v6, v10

    iput-wide v6, v2, Lcom/android/volley/b$a;->d:J

    :goto_4
    iget-object v2, v1, Lkik/android/util/e$a;->a:Landroid/graphics/Bitmap;

    if-nez v2, :cond_7

    new-instance v0, Lcom/android/volley/w;

    const-string v1, "Null bitmap from composite"

    invoke-direct {v0, v1}, Lcom/android/volley/w;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/android/volley/r;->a(Lcom/android/volley/w;)Lcom/android/volley/r;

    move-result-object v0

    goto/16 :goto_0

    :cond_3
    move v2, v3

    goto :goto_2

    :cond_4
    const/4 v1, 0x1

    invoke-virtual {v0}, Lkik/a/d/n;->I()Z

    move-result v0

    if-nez v0, :cond_5

    move v0, v2

    :goto_5
    iget-object v2, p0, Lcom/kik/cache/v;->h:Lcom/kik/cache/ad;

    invoke-static {v5, v1, v0, v2}, Lkik/android/util/e;->a(Ljava/util/ArrayList;IZLcom/kik/cache/ad;)Lkik/android/util/e$a;

    move-result-object v0

    move-object v1, v0

    goto :goto_3

    :cond_5
    move v0, v3

    goto :goto_5

    :cond_6
    iget-object v2, v0, Lcom/android/volley/r;->b:Lcom/android/volley/b$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iput-wide v6, v2, Lcom/android/volley/b$a;->e:J

    iget-object v2, v0, Lcom/android/volley/r;->b:Lcom/android/volley/b$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    add-long/2addr v6, v10

    iput-wide v6, v2, Lcom/android/volley/b$a;->d:J

    goto :goto_4

    :cond_7
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-object v1, v1, Lkik/android/util/e$a;->a:Landroid/graphics/Bitmap;

    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v5, 0x64

    invoke-virtual {v1, v3, v5, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    iget-object v1, v0, Lcom/android/volley/r;->b:Lcom/android/volley/b$a;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    iput-object v2, v1, Lcom/android/volley/b$a;->a:[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0
.end method

.method public final e_()Z
    .locals 1

    .prologue
    .line 181
    const/4 v0, 0x0

    return v0
.end method

.method public final u()Lkik/a/d/n;
    .locals 1

    .prologue
    .line 156
    invoke-virtual {p0}, Lcom/kik/cache/v;->x()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/n;

    return-object v0
.end method
