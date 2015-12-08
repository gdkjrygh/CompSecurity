.class public Lcom/roidapp/imagelib/e/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/roidapp/imagelib/e/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/imagelib/e/a;)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const-class v0, Lcom/roidapp/imagelib/e/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/e/b;->a:Ljava/lang/String;

    .line 20
    iput-object p2, p0, Lcom/roidapp/imagelib/e/b;->c:Lcom/roidapp/imagelib/e/a;

    .line 21
    iput-object p1, p0, Lcom/roidapp/imagelib/e/b;->b:Landroid/content/Context;

    .line 22
    return-void
.end method

.method private b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    .line 89
    iget-object v0, p0, Lcom/roidapp/imagelib/e/b;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "load bitmap size width="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",height="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    iget-object v0, p0, Lcom/roidapp/imagelib/e/b;->c:Lcom/roidapp/imagelib/e/a;

    invoke-interface {v0, p1}, Lcom/roidapp/imagelib/e/a;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 94
    if-eqz v0, :cond_1

    if-eq v0, p1, :cond_1

    .line 95
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_0

    .line 96
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_0
    move-object p1, v0

    .line 100
    :cond_1
    return-object p1
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 105
    :try_start_0
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/e/b;->b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object p1

    .line 113
    :goto_0
    return-object p1

    .line 107
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0

    .line 109
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto :goto_0

    .line 111
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)Landroid/net/Uri;
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 25
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/e/b;->b:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/Integer;

    move-result-object v4

    .line 47
    if-eqz v4, :cond_0

    array-length v0, v4

    if-eqz v0, :cond_0

    .line 48
    const/4 v0, 0x0

    move-object v1, v2

    .line 50
    :goto_0
    array-length v3, v4

    if-ge v0, v3, :cond_0

    .line 57
    :try_start_0
    aget-object v3, v4, v0

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aget-object v5, v4, v0

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    aget-object v6, v4, v0

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    mul-int/2addr v5, v6

    invoke-static {p1, v3, v5}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v3

    .line 1079
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "PhotoGrid_"

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, ".jpg"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1080
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v5

    .line 1081
    iget-object v6, p0, Lcom/roidapp/imagelib/e/b;->b:Landroid/content/Context;

    invoke-virtual {v5, v6}, Lcom/roidapp/imagelib/ImageLibrary;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 1082
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->b()Ljava/lang/String;

    move-result-object v6

    .line 1083
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1084
    iget-object v6, p0, Lcom/roidapp/imagelib/e/b;->a:Ljava/lang/String;

    const-string v7, "process end, start to save."

    invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1085
    invoke-direct {p0, v3}, Lcom/roidapp/imagelib/e/b;->b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v6

    sget-object v7, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v6, v5, v1, v7}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v2

    .line 70
    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 71
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 75
    :cond_0
    :goto_1
    return-object v2

    .line 60
    :catch_0
    move-exception v1

    move-object v8, v1

    move-object v1, v3

    move-object v3, v8

    .line 61
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 62
    :try_start_2
    iget-object v5, p0, Lcom/roidapp/imagelib/e/b;->a:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "OutOfMemoryError:"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 70
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 71
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 63
    :catch_1
    move-exception v1

    move-object v8, v1

    move-object v1, v3

    move-object v3, v8

    .line 64
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 65
    :try_start_3
    invoke-virtual {v3}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 70
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 71
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 67
    :catch_2
    move-exception v0

    :goto_4
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 70
    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 71
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_1

    .line 70
    :catchall_0
    move-exception v0

    :goto_5
    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 71
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0

    .line 70
    :catchall_1
    move-exception v0

    move-object v3, v1

    goto :goto_5

    .line 67
    :catch_3
    move-exception v0

    move-object v3, v1

    goto :goto_4

    .line 63
    :catch_4
    move-exception v3

    goto :goto_3

    .line 60
    :catch_5
    move-exception v3

    goto :goto_2
.end method
