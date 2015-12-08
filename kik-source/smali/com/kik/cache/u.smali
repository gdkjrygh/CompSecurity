.class public final Lcom/kik/cache/u;
.super Lcom/kik/cache/ac;
.source "SourceFile"


# instance fields
.field private final f:Ljava/lang/Object;

.field private g:Landroid/content/Context;

.field private h:Z

.field private i:Landroid/graphics/BitmapFactory$Options;

.field private j:I


# direct methods
.method private constructor <init>(JLjava/lang/String;ZLandroid/content/Context;ILandroid/graphics/BitmapFactory$Options;)V
    .locals 11

    .prologue
    const/4 v4, 0x0

    .line 40
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sget-object v7, Lcom/kik/cache/u;->a:Landroid/graphics/Bitmap$Config;

    move-object v1, p0

    move-object v3, p3

    move/from16 v5, p6

    move/from16 v6, p6

    move-object v8, v4

    invoke-direct/range {v1 .. v8}, Lcom/kik/cache/ac;-><init>(Ljava/lang/Object;Ljava/lang/String;Lcom/android/volley/r$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V

    .line 25
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/kik/cache/u;->f:Ljava/lang/Object;

    .line 41
    move-object/from16 v0, p5

    iput-object v0, p0, Lcom/kik/cache/u;->g:Landroid/content/Context;

    .line 42
    iput-boolean p4, p0, Lcom/kik/cache/u;->h:Z

    .line 43
    move-object/from16 v0, p7

    iput-object v0, p0, Lcom/kik/cache/u;->i:Landroid/graphics/BitmapFactory$Options;

    .line 44
    move/from16 v0, p6

    iput v0, p0, Lcom/kik/cache/u;->j:I

    .line 45
    return-void
.end method

.method public static a(JLjava/lang/String;ZLandroid/content/Context;ILandroid/graphics/BitmapFactory$Options;)Lcom/kik/cache/u;
    .locals 10

    .prologue
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "http://127.0.0.1/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 35
    new-instance v1, Lcom/kik/cache/u;

    move-wide v2, p0

    move v5, p3

    move-object v6, p4

    move v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v8}, Lcom/kik/cache/u;-><init>(JLjava/lang/String;ZLandroid/content/Context;ILandroid/graphics/BitmapFactory$Options;)V

    return-object v1
.end method

.method private c(Lcom/android/volley/k;)Lcom/android/volley/r;
    .locals 10

    .prologue
    const/4 v7, 0x0

    .line 57
    if-nez p1, :cond_0

    .line 58
    new-instance v0, Lcom/android/volley/w;

    const-string v1, "Null response"

    invoke-direct {v0, v1}, Lcom/android/volley/w;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/android/volley/r;->a(Lcom/android/volley/w;)Lcom/android/volley/r;

    move-result-object v0

    .line 104
    :goto_0
    return-object v0

    .line 65
    :cond_0
    :try_start_0
    iget-boolean v0, p0, Lcom/kik/cache/u;->h:Z

    if-eqz v0, :cond_1

    .line 66
    iget-object v0, p0, Lcom/kik/cache/u;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {p0}, Lcom/kik/cache/u;->x()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget v0, p0, Lcom/kik/cache/u;->j:I

    iget-object v4, p0, Lcom/kik/cache/u;->i:Landroid/graphics/BitmapFactory$Options;

    invoke-static {v1, v2, v3, v0, v4}, Landroid/provider/MediaStore$Video$Thumbnails;->getThumbnail(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v6

    .line 72
    :goto_1
    if-nez v6, :cond_2

    .line 73
    :try_start_1
    new-instance v0, Lcom/android/volley/w;

    const-string v1, "thumb is null"

    invoke-direct {v0, v1}, Lcom/android/volley/w;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/android/volley/r;->a(Lcom/android/volley/w;)Lcom/android/volley/r;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    goto :goto_0

    .line 69
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/kik/cache/u;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {p0}, Lcom/kik/cache/u;->x()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget v0, p0, Lcom/kik/cache/u;->j:I

    iget-object v4, p0, Lcom/kik/cache/u;->i:Landroid/graphics/BitmapFactory$Options;

    invoke-static {v1, v2, v3, v0, v4}, Landroid/provider/MediaStore$Images$Thumbnails;->getThumbnail(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v6

    goto :goto_1

    .line 77
    :cond_2
    :try_start_3
    iget-object v0, p0, Lcom/kik/cache/u;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "_data"

    aput-object v4, v2, v3

    const-string v3, "_id=?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/kik/cache/u;->x()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v4, v5

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 80
    if-eqz v1, :cond_5

    .line 81
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 82
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 83
    invoke-static {v0}, Lkik/android/util/r;->a(Ljava/lang/String;)I

    move-result v0

    .line 84
    if-ltz v0, :cond_4

    .line 85
    invoke-static {v6, v0}, Lkik/android/util/r;->b(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    move-result-object v6

    move-object v0, v6

    .line 88
    :goto_2
    :try_start_4
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3

    :goto_3
    move-object v6, v0

    .line 98
    :goto_4
    if-nez v6, :cond_3

    .line 100
    new-instance v0, Lcom/android/volley/w;

    const-string v1, "Null bitmap from composite"

    invoke-direct {v0, v1}, Lcom/android/volley/w;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/android/volley/r;->a(Lcom/android/volley/w;)Lcom/android/volley/r;

    move-result-object v0

    goto/16 :goto_0

    .line 91
    :catch_0
    move-exception v0

    move-object v6, v7

    :goto_5
    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;I)V

    goto :goto_4

    .line 94
    :catch_1
    move-exception v0

    move-object v6, v7

    :goto_6
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_4

    .line 103
    :cond_3
    invoke-static {v6, v7}, Lcom/android/volley/r;->a(Ljava/lang/Object;Lcom/android/volley/b$a;)Lcom/android/volley/r;

    move-result-object v0

    goto/16 :goto_0

    .line 94
    :catch_2
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v1

    move-object v6, v0

    move-object v0, v1

    goto :goto_6

    .line 91
    :catch_4
    move-exception v0

    goto :goto_5

    :catch_5
    move-exception v1

    move-object v6, v0

    move-object v0, v1

    goto :goto_5

    :cond_4
    move-object v0, v6

    goto :goto_2

    :cond_5
    move-object v0, v6

    goto :goto_3
.end method


# virtual methods
.method public final b(Lcom/android/volley/b$a;)Lcom/android/volley/b$a;
    .locals 1

    .prologue
    .line 117
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final b(Lcom/android/volley/k;)Lcom/android/volley/r;
    .locals 2

    .prologue
    .line 50
    iget-object v1, p0, Lcom/kik/cache/u;->f:Ljava/lang/Object;

    monitor-enter v1

    .line 51
    :try_start_0
    invoke-direct {p0, p1}, Lcom/kik/cache/u;->c(Lcom/android/volley/k;)Lcom/android/volley/r;

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 52
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final e_()Z
    .locals 1

    .prologue
    .line 111
    const/4 v0, 0x0

    return v0
.end method
