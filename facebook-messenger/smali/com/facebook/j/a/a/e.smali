.class public Lcom/facebook/j/a/a/e;
.super Ljava/lang/Object;
.source "NativeImageResizer.java"

# interfaces
.implements Lcom/facebook/j/a/a/a;


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/j/a/a/e;->a:Landroid/content/Context;

    .line 22
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/io/File;III)V
    .locals 2

    .prologue
    .line 117
    new-instance v0, Lcom/facebook/nativejpeg/b;

    invoke-direct {v0}, Lcom/facebook/nativejpeg/b;-><init>()V

    .line 118
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    iput-object v1, v0, Lcom/facebook/nativejpeg/b;->g:Ljava/io/OutputStream;

    .line 119
    iput p5, v0, Lcom/facebook/nativejpeg/b;->h:I

    .line 120
    iput p3, v0, Lcom/facebook/nativejpeg/b;->a:I

    .line 121
    iput p4, v0, Lcom/facebook/nativejpeg/b;->b:I

    .line 122
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/facebook/nativejpeg/b;->e:Z

    .line 124
    invoke-static {p1, v0}, Lcom/facebook/nativejpeg/BitmapFactory;->a(Ljava/lang/String;Lcom/facebook/nativejpeg/b;)Landroid/graphics/Bitmap;

    .line 126
    iget-object v0, v0, Lcom/facebook/nativejpeg/b;->g:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 127
    return-void
.end method

.method private a(I)Z
    .locals 1

    .prologue
    .line 131
    add-int/lit8 v0, p1, -0x1

    and-int/2addr v0, p1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;IILcom/facebook/j/a/a/c;)Lcom/facebook/j/a/a/c;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 51
    .line 54
    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/facebook/a/d; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 60
    :try_start_1
    iget v0, p5, Lcom/facebook/j/a/a/c;->a:I

    mul-int/lit8 v0, v0, 0x2

    if-ge p3, v0, :cond_0

    iget v0, p5, Lcom/facebook/j/a/a/c;->b:I

    mul-int/lit8 v0, v0, 0x2

    if-lt p4, v0, :cond_4

    .line 62
    :cond_0
    int-to-float v0, p3

    iget v1, p5, Lcom/facebook/j/a/a/c;->a:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 63
    int-to-float v1, p4

    iget v3, p5, Lcom/facebook/j/a/a/c;->b:I

    int-to-float v3, v3

    div-float/2addr v1, v3

    .line 64
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 65
    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 67
    :goto_0
    const/4 v1, 0x2

    if-le v0, v1, :cond_1

    invoke-direct {p0, v0}, Lcom/facebook/j/a/a/e;->a(I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 68
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 71
    :cond_1
    div-int v3, p3, v0

    .line 75
    :goto_1
    iget v5, p5, Lcom/facebook/j/a/a/c;->c:I

    move-object v0, p0

    move-object v1, p1

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/j/a/a/e;->a(Ljava/lang/String;Ljava/io/File;III)V

    .line 83
    new-instance v0, Lcom/facebook/nativejpeg/b;

    invoke-direct {v0}, Lcom/facebook/nativejpeg/b;-><init>()V

    .line 84
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/facebook/nativejpeg/b;->inJustDecodeBounds:Z

    .line 85
    invoke-static {p2, v0}, Lcom/facebook/nativejpeg/BitmapFactory;->a(Ljava/lang/String;Lcom/facebook/nativejpeg/b;)Landroid/graphics/Bitmap;

    .line 87
    iget v1, v0, Lcom/facebook/nativejpeg/b;->outWidth:I

    .line 88
    iget v0, v0, Lcom/facebook/nativejpeg/b;->outHeight:I

    .line 91
    invoke-static {p1, p2, v1, v0}, Lcom/facebook/a/a;->a(Ljava/lang/String;Ljava/lang/String;II)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lcom/facebook/a/d; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    :try_start_2
    new-instance v2, Lcom/facebook/j/a/a/c;

    iget v3, p5, Lcom/facebook/j/a/a/c;->c:I

    invoke-direct {v2, v1, v0, v3}, Lcom/facebook/j/a/a/c;-><init>(III)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lcom/facebook/a/d; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 104
    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 105
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    :cond_2
    return-object v2

    .line 99
    :catch_0
    move-exception v0

    move-object v2, v6

    .line 100
    :goto_2
    :try_start_3
    new-instance v1, Lcom/facebook/j/a/a/b;

    const-string v3, "IOException while resizing"

    invoke-direct {v1, v3, v0}, Lcom/facebook/j/a/a/b;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 104
    :catchall_0
    move-exception v0

    :goto_3
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 105
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :cond_3
    throw v0

    .line 101
    :catch_1
    move-exception v0

    move-object v2, v6

    .line 102
    :goto_4
    :try_start_4
    new-instance v1, Lcom/facebook/j/a/a/b;

    const-string v3, "IOException while resizing"

    invoke-direct {v1, v3, v0}, Lcom/facebook/j/a/a/b;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 104
    :catchall_1
    move-exception v0

    move-object v2, v6

    goto :goto_3

    .line 101
    :catch_2
    move-exception v0

    goto :goto_4

    .line 99
    :catch_3
    move-exception v0

    goto :goto_2

    :cond_4
    move v3, p3

    goto :goto_1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/j/a/a/c;)Lcom/facebook/j/a/a/c;
    .locals 6

    .prologue
    .line 28
    new-instance v0, Lcom/facebook/nativejpeg/b;

    invoke-direct {v0}, Lcom/facebook/nativejpeg/b;-><init>()V

    .line 29
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/facebook/nativejpeg/b;->inJustDecodeBounds:Z

    .line 30
    invoke-static {p1, v0}, Lcom/facebook/nativejpeg/BitmapFactory;->a(Ljava/lang/String;Lcom/facebook/nativejpeg/b;)Landroid/graphics/Bitmap;

    .line 31
    iget v3, v0, Lcom/facebook/nativejpeg/b;->outWidth:I

    iget v4, v0, Lcom/facebook/nativejpeg/b;->outHeight:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/j/a/a/e;->a(Ljava/lang/String;Ljava/lang/String;IILcom/facebook/j/a/a/c;)Lcom/facebook/j/a/a/c;

    move-result-object v0

    return-object v0
.end method
