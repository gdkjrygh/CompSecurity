.class public Lcom/jirbo/adcolony/ADCImage;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static k:I

.field static l:I


# instance fields
.field a:Landroid/graphics/Bitmap;

.field b:Landroid/graphics/Bitmap;

.field c:Landroid/graphics/Paint;

.field d:Landroid/graphics/Rect;

.field e:Landroid/graphics/Rect;

.field f:I

.field g:I

.field h:Z

.field i:I

.field j:I

.field m:Z

.field n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 40
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-direct {p0, p1, v0, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;D)V

    .line 41
    return-void
.end method

.method constructor <init>(Ljava/lang/String;D)V
    .locals 2

    .prologue
    .line 61
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;DZ)V

    .line 62
    return-void
.end method

.method constructor <init>(Ljava/lang/String;DZ)V
    .locals 6

    .prologue
    .line 66
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;DZZ)V

    .line 67
    return-void
.end method

.method constructor <init>(Ljava/lang/String;DZZ)V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->c:Landroid/graphics/Paint;

    .line 29
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->d:Landroid/graphics/Rect;

    .line 30
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->e:Landroid/graphics/Rect;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->n:Ljava/util/ArrayList;

    .line 73
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 75
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    .line 76
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 77
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->b:Landroid/graphics/Bitmap;

    .line 79
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/ADCImage;->f:I

    .line 80
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/ADCImage;->g:I

    .line 81
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/ADCImage;->i:I

    .line 82
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/ADCImage;->j:I

    .line 83
    iget v0, p0, Lcom/jirbo/adcolony/ADCImage;->i:I

    sput v0, Lcom/jirbo/adcolony/ADCImage;->k:I

    .line 84
    iget v0, p0, Lcom/jirbo/adcolony/ADCImage;->j:I

    sput v0, Lcom/jirbo/adcolony/ADCImage;->l:I

    .line 86
    invoke-virtual {p0, p2, p3}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 89
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ADCImage;->h:Z

    .line 90
    if-eqz p4, :cond_2

    .line 93
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/jirbo/adcolony/ADCImage;->convertToMutable(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    .line 96
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    mul-int/2addr v0, v1

    new-array v1, v0, [I

    .line 97
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    iget-object v7, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    move v0, v8

    .line 100
    :goto_0
    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 102
    aget v2, v1, v0

    const/16 v3, 0xff

    if-ge v2, v3, :cond_0

    aget v2, v1, v0

    if-eqz v2, :cond_0

    aget v2, v1, v0

    shr-int/lit8 v2, v2, 0x1

    const v3, 0x7f7f7f

    and-int/2addr v2, v3

    const/high16 v3, -0x1000000

    or-int/2addr v2, v3

    aput v2, v1, v0

    .line 100
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 106
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    iget-object v7, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 107
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->b:Landroid/graphics/Bitmap;

    .line 109
    :cond_2
    if-nez p5, :cond_3

    .line 111
    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    :cond_3
    :goto_1
    return-void

    .line 117
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to load image "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->e(Ljava/lang/String;)V

    .line 119
    iput-boolean v9, p0, Lcom/jirbo/adcolony/ADCImage;->m:Z

    goto :goto_1
.end method

.method constructor <init>(Ljava/lang/String;II)V
    .locals 2

    .prologue
    .line 45
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-direct {p0, p1, v0, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;D)V

    .line 46
    invoke-virtual {p0, p2, p3}, Lcom/jirbo/adcolony/ADCImage;->b(II)V

    .line 47
    return-void
.end method

.method constructor <init>(Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 56
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;DZ)V

    .line 57
    return-void
.end method

.method constructor <init>(Ljava/lang/String;ZZ)V
    .locals 6

    .prologue
    .line 51
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    move-object v0, p0

    move-object v1, p1

    move v4, p3

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;DZZ)V

    .line 52
    return-void
.end method

.method public static convertToMutable(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 12

    .prologue
    .line 282
    :try_start_0
    new-instance v6, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "temp.tmp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 283
    new-instance v7, Ljava/io/RandomAccessFile;

    const-string v0, "rw"

    invoke-direct {v7, v6, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 285
    sget v8, Lcom/jirbo/adcolony/ADCImage;->k:I

    .line 286
    sget v9, Lcom/jirbo/adcolony/ADCImage;->l:I

    .line 287
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v10

    .line 289
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    .line 290
    sget-object v1, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    const-wide/16 v2, 0x0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getRowBytes()I

    move-result v4

    mul-int/2addr v4, v9

    int-to-long v4, v4

    invoke-virtual/range {v0 .. v5}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    move-result-object v2

    .line 291
    invoke-virtual {p0, v2}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    .line 296
    invoke-static {v8, v9, v10}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 297
    const/4 v3, 0x0

    :try_start_1
    invoke-virtual {v2, v3}, Ljava/nio/MappedByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 299
    invoke-virtual {v1, v2}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 301
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->close()V

    .line 302
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->close()V

    .line 304
    invoke-virtual {v6}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, v1

    .line 310
    :goto_0
    return-object v0

    .line 308
    :catch_0
    move-exception v0

    move-object v1, v0

    move-object v0, p0

    :goto_1
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v11, v0

    move-object v0, v1

    move-object v1, v11

    goto :goto_1
.end method


# virtual methods
.method a()V
    .locals 2

    .prologue
    .line 236
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 238
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0

    .line 240
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 241
    return-void
.end method

.method a(D)V
    .locals 1

    .prologue
    .line 203
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/jirbo/adcolony/ADCImage;->a(DZ)V

    .line 204
    return-void
.end method

.method a(DZ)V
    .locals 5

    .prologue
    .line 207
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    .line 233
    :cond_0
    :goto_0
    return-void

    .line 208
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 210
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, p1, v0

    if-eqz v0, :cond_4

    .line 212
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-double v0, v0

    mul-double/2addr v0, p1

    double-to-int v0, v0

    .line 213
    iget-object v1, p0, Lcom/jirbo/adcolony/ADCImage;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-double v2, v1

    mul-double/2addr v2, p1

    double-to-int v1, v2

    .line 214
    iget v2, p0, Lcom/jirbo/adcolony/ADCImage;->f:I

    if-ne v0, v2, :cond_2

    iget v2, p0, Lcom/jirbo/adcolony/ADCImage;->g:I

    if-eq v1, v2, :cond_3

    .line 216
    :cond_2
    iput v0, p0, Lcom/jirbo/adcolony/ADCImage;->f:I

    .line 217
    iput v1, p0, Lcom/jirbo/adcolony/ADCImage;->g:I

    .line 218
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->b:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/jirbo/adcolony/ADCImage;->f:I

    iget v2, p0, Lcom/jirbo/adcolony/ADCImage;->g:I

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    .line 219
    if-nez p3, :cond_3

    .line 221
    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    :cond_3
    if-eqz p3, :cond_4

    .line 227
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 228
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->b:Landroid/graphics/Bitmap;

    .line 231
    :cond_4
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->d:Landroid/graphics/Rect;

    iget v1, p0, Lcom/jirbo/adcolony/ADCImage;->f:I

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 232
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->d:Landroid/graphics/Rect;

    iget v1, p0, Lcom/jirbo/adcolony/ADCImage;->g:I

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    goto :goto_0
.end method

.method a(II)V
    .locals 13

    .prologue
    const/4 v2, 0x0

    .line 125
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 182
    :goto_0
    return-void

    .line 128
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->b:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/jirbo/adcolony/ADCImage;->i:I

    div-int/lit8 v1, v1, 0x3

    iget v3, p0, Lcom/jirbo/adcolony/ADCImage;->j:I

    invoke-static {v0, v2, v2, v1, v3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 129
    iget-object v1, p0, Lcom/jirbo/adcolony/ADCImage;->b:Landroid/graphics/Bitmap;

    iget v3, p0, Lcom/jirbo/adcolony/ADCImage;->i:I

    mul-int/lit8 v3, v3, 0x2

    div-int/lit8 v3, v3, 0x3

    iget v4, p0, Lcom/jirbo/adcolony/ADCImage;->i:I

    div-int/lit8 v4, v4, 0x3

    iget v5, p0, Lcom/jirbo/adcolony/ADCImage;->j:I

    invoke-static {v1, v3, v2, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 132
    iget-object v1, p0, Lcom/jirbo/adcolony/ADCImage;->b:Landroid/graphics/Bitmap;

    iget v3, p0, Lcom/jirbo/adcolony/ADCImage;->i:I

    div-int/lit8 v3, v3, 0x3

    iget v4, p0, Lcom/jirbo/adcolony/ADCImage;->i:I

    div-int/lit8 v4, v4, 0x3

    iget v5, p0, Lcom/jirbo/adcolony/ADCImage;->j:I

    invoke-static {v1, v3, v2, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 135
    iget v3, p0, Lcom/jirbo/adcolony/ADCImage;->j:I

    invoke-static {v1, p1, v3, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v11

    .line 138
    iget v1, p0, Lcom/jirbo/adcolony/ADCImage;->i:I

    div-int/lit8 v1, v1, 0x3

    iget v3, p0, Lcom/jirbo/adcolony/ADCImage;->j:I

    mul-int/2addr v1, v3

    new-array v1, v1, [I

    .line 139
    iget v3, p0, Lcom/jirbo/adcolony/ADCImage;->i:I

    div-int/lit8 v3, v3, 0x3

    iget v4, p0, Lcom/jirbo/adcolony/ADCImage;->j:I

    mul-int/2addr v3, v4

    new-array v12, v3, [I

    .line 142
    iget v3, p0, Lcom/jirbo/adcolony/ADCImage;->i:I

    div-int/lit8 v3, v3, 0x3

    iget v4, p0, Lcom/jirbo/adcolony/ADCImage;->i:I

    div-int/lit8 v6, v4, 0x3

    iget v7, p0, Lcom/jirbo/adcolony/ADCImage;->j:I

    move v4, v2

    move v5, v2

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 143
    iget v0, p0, Lcom/jirbo/adcolony/ADCImage;->i:I

    div-int/lit8 v6, v0, 0x3

    iget v0, p0, Lcom/jirbo/adcolony/ADCImage;->i:I

    div-int/lit8 v9, v0, 0x3

    iget v10, p0, Lcom/jirbo/adcolony/ADCImage;->j:I

    move-object v3, v8

    move-object v4, v12

    move v5, v2

    move v7, v2

    move v8, v2

    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 146
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    mul-int/2addr v0, v3

    new-array v4, v0, [I

    .line 149
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    move-object v3, v11

    move v5, v2

    move v7, v2

    move v8, v2

    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    move v0, v2

    move v3, v2

    move v4, v2

    move v5, v2

    .line 155
    :cond_1
    :goto_1
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    if-ge v5, v6, :cond_6

    .line 157
    iget v6, p0, Lcom/jirbo/adcolony/ADCImage;->i:I

    div-int/lit8 v6, v6, 0x3

    if-ge v4, v6, :cond_4

    .line 158
    array-length v6, v1

    if-ge v3, v6, :cond_2

    aget v6, v1, v3

    invoke-virtual {v11, v4, v5, v6}, Landroid/graphics/Bitmap;->setPixel(III)V

    .line 159
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 166
    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 167
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    if-ne v4, v6, :cond_1

    .line 169
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    move v4, v2

    .line 170
    goto :goto_1

    .line 161
    :cond_4
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    iget v7, p0, Lcom/jirbo/adcolony/ADCImage;->i:I

    div-int/lit8 v7, v7, 0x3

    sub-int/2addr v6, v7

    if-lt v4, v6, :cond_3

    .line 163
    array-length v6, v12

    if-ge v0, v6, :cond_5

    aget v6, v12, v0

    invoke-virtual {v11, v4, v5, v6}, Landroid/graphics/Bitmap;->setPixel(III)V

    .line 164
    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 174
    :cond_6
    iput-object v11, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    .line 175
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->b:Landroid/graphics/Bitmap;

    .line 176
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/ADCImage;->f:I

    .line 177
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/ADCImage;->g:I

    .line 178
    iget v0, p0, Lcom/jirbo/adcolony/ADCImage;->f:I

    iput v0, p0, Lcom/jirbo/adcolony/ADCImage;->i:I

    .line 179
    iget v0, p0, Lcom/jirbo/adcolony/ADCImage;->g:I

    iput v0, p0, Lcom/jirbo/adcolony/ADCImage;->j:I

    .line 180
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->d:Landroid/graphics/Rect;

    iget v1, p0, Lcom/jirbo/adcolony/ADCImage;->f:I

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 181
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->d:Landroid/graphics/Rect;

    iget v1, p0, Lcom/jirbo/adcolony/ADCImage;->g:I

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    goto/16 :goto_0
.end method

.method a(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 273
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    .line 276
    :cond_0
    :goto_0
    return-void

    .line 274
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 275
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCImage;->d:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/jirbo/adcolony/ADCImage;->e:Landroid/graphics/Rect;

    iget-object v3, p0, Lcom/jirbo/adcolony/ADCImage;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_0
.end method

.method a(Landroid/graphics/Canvas;II)V
    .locals 0

    .prologue
    .line 267
    invoke-virtual {p0, p2, p3}, Lcom/jirbo/adcolony/ADCImage;->c(II)V

    .line 268
    invoke-virtual {p0, p1}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;)V

    .line 269
    return-void
.end method

.method b(II)V
    .locals 2

    .prologue
    .line 187
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    .line 199
    :cond_0
    :goto_0
    return-void

    .line 188
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 189
    iget v0, p0, Lcom/jirbo/adcolony/ADCImage;->f:I

    if-ne p1, v0, :cond_2

    iget v0, p0, Lcom/jirbo/adcolony/ADCImage;->g:I

    if-eq p2, v0, :cond_0

    .line 191
    :cond_2
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->b:Landroid/graphics/Bitmap;

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    .line 192
    iput p1, p0, Lcom/jirbo/adcolony/ADCImage;->f:I

    .line 193
    iput p2, p0, Lcom/jirbo/adcolony/ADCImage;->g:I

    .line 194
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->d:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->right:I

    .line 195
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->d:Landroid/graphics/Rect;

    iput p2, v0, Landroid/graphics/Rect;->bottom:I

    .line 197
    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method b()[I
    .locals 3

    .prologue
    .line 253
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/jirbo/adcolony/ADCImage;->e:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    aput v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/jirbo/adcolony/ADCImage;->e:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    aput v2, v0, v1

    .line 254
    return-object v0
.end method

.method c()I
    .locals 1

    .prologue
    .line 257
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->e:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    return v0
.end method

.method c(II)V
    .locals 2

    .prologue
    .line 245
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->e:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->left:I

    .line 246
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->e:Landroid/graphics/Rect;

    iput p2, v0, Landroid/graphics/Rect;->top:I

    .line 247
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->e:Landroid/graphics/Rect;

    iget v1, p0, Lcom/jirbo/adcolony/ADCImage;->f:I

    add-int/2addr v1, p1

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 248
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->e:Landroid/graphics/Rect;

    iget v1, p0, Lcom/jirbo/adcolony/ADCImage;->g:I

    add-int/2addr v1, p2

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 249
    return-void
.end method

.method d()I
    .locals 1

    .prologue
    .line 258
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCImage;->e:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    return v0
.end method

.method d(II)V
    .locals 2

    .prologue
    .line 262
    iget v0, p0, Lcom/jirbo/adcolony/ADCImage;->f:I

    sub-int v0, p1, v0

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/jirbo/adcolony/ADCImage;->g:I

    sub-int v1, p2, v1

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p0, v0, v1}, Lcom/jirbo/adcolony/ADCImage;->c(II)V

    .line 263
    return-void
.end method
