.class final Lcom/kik/m/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/m/j;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([BLandroid/graphics/Bitmap$CompressFormat;J)[B
    .locals 11

    .prologue
    const-wide/16 v8, -0x1

    const/4 v6, 0x0

    .line 80
    if-eqz p1, :cond_0

    array-length v0, p1

    int-to-long v0, v0

    cmp-long v0, v0, p3

    if-gtz v0, :cond_1

    :cond_0
    move-object v1, p1

    .line 136
    :goto_0
    return-object v1

    .line 84
    :cond_1
    const/4 v2, 0x0

    .line 88
    array-length v0, p1

    int-to-long v0, v0

    invoke-static {v0, v1, p3, p4}, Lcom/kik/m/k;->a(JJ)I

    move-result v0

    .line 90
    array-length v1, p1

    invoke-static {p1, v6, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 92
    if-eqz v1, :cond_7

    .line 101
    :cond_2
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 102
    invoke-virtual {v1, p2, v0, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 106
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    .line 107
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 108
    add-int/lit8 v0, v0, -0xa

    .line 110
    const/16 v4, 0x14

    if-le v0, v4, :cond_3

    array-length v4, v3

    int-to-long v4, v4

    cmp-long v4, v4, p3

    if-lez v4, :cond_3

    cmp-long v4, p3, v8

    if-nez v4, :cond_2

    .line 114
    :cond_3
    array-length v0, v3

    int-to-long v4, v0

    cmp-long v0, v4, p3

    if-lez v0, :cond_4

    cmp-long v0, p3, v8

    if-nez v0, :cond_6

    .line 118
    :cond_4
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    if-eq p2, v0, :cond_5

    .line 123
    array-length v0, v3

    invoke-static {v3, v6, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 124
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 125
    const/16 v1, 0x64

    invoke-virtual {v0, p2, v1, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 126
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 127
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 134
    :goto_1
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0

    :cond_5
    move-object v0, v1

    move-object v1, v3

    .line 130
    goto :goto_1

    :cond_6
    move-object v0, v1

    move-object v1, v2

    goto :goto_1

    :cond_7
    move-object v1, v2

    goto :goto_0
.end method
