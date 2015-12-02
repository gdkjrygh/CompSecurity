.class public Lcom/facebook/ui/media/b/a;
.super Ljava/lang/Object;
.source "MediaAttachmentUtil.java"


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/ui/images/a/a;

.field private final d:Lcom/facebook/a/a;

.field private final e:Lcom/facebook/common/executors/a;

.field private final f:Lcom/facebook/ui/media/attachments/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/ui/images/a/a;Lcom/facebook/a/a;Lcom/facebook/common/executors/a;Lcom/facebook/ui/media/attachments/d;)V
    .locals 1

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const-class v0, Lcom/facebook/ui/media/b/a;

    iput-object v0, p0, Lcom/facebook/ui/media/b/a;->a:Ljava/lang/Class;

    .line 61
    iput-object p1, p0, Lcom/facebook/ui/media/b/a;->b:Landroid/content/Context;

    .line 62
    iput-object p2, p0, Lcom/facebook/ui/media/b/a;->c:Lcom/facebook/ui/images/a/a;

    .line 63
    iput-object p3, p0, Lcom/facebook/ui/media/b/a;->d:Lcom/facebook/a/a;

    .line 64
    iput-object p4, p0, Lcom/facebook/ui/media/b/a;->e:Lcom/facebook/common/executors/a;

    .line 65
    iput-object p5, p0, Lcom/facebook/ui/media/b/a;->f:Lcom/facebook/ui/media/attachments/d;

    .line 66
    return-void
.end method

.method private a(Lcom/facebook/ui/media/attachments/a;I)Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    .line 249
    iget-object v0, p0, Lcom/facebook/ui/media/b/a;->c:Lcom/facebook/ui/images/a/a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/ui/images/a/a;->a(Lcom/facebook/ui/media/attachments/a;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 251
    if-nez v0, :cond_0

    .line 252
    iget-object v1, p0, Lcom/facebook/ui/media/b/a;->a:Ljava/lang/Class;

    const-string v2, "Unable to read the original bitmap"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 255
    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/ui/media/attachments/a;)Lcom/facebook/http/protocol/ab;
    .locals 6

    .prologue
    .line 115
    sget-object v0, Lcom/facebook/ui/media/b/b;->a:[I

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ui/media/attachments/g;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 132
    iget-object v0, p0, Lcom/facebook/ui/media/b/a;->a:Ljava/lang/Class;

    const-string v1, "Unexpected attachment type"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 133
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 117
    :pswitch_0
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->f()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 118
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->j()Ljava/lang/String;

    move-result-object v2

    .line 119
    new-instance v0, Lcom/facebook/http/protocol/ad;

    const-string v3, "image/jpeg"

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/http/protocol/ad;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 122
    :pswitch_1
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 123
    new-instance v0, Lcom/facebook/http/protocol/ad;

    const-string v2, "video/3gpp"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ".3gp"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/http/protocol/ad;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 126
    :pswitch_2
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/ui/media/attachments/MediaResource;->g()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 129
    new-instance v0, Lcom/facebook/http/protocol/ad;

    const-string v3, "audio/MPEG"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "audioclip-"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ".mp4"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/http/protocol/ad;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 115
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public a(Lcom/facebook/ui/media/attachments/MediaResource;Ljava/io/File;)V
    .locals 7

    .prologue
    .line 139
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v0

    sget-object v1, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v1, "The mediaResource is not of type photo"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 143
    iget-object v0, p0, Lcom/facebook/ui/media/b/a;->f:Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {v0, p1}, Lcom/facebook/ui/media/attachments/d;->b(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;

    move-result-object v1

    .line 144
    if-nez v1, :cond_2

    .line 169
    :cond_0
    :goto_1
    return-void

    .line 139
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 148
    :cond_2
    iget-object v0, p0, Lcom/facebook/ui/media/b/a;->b:Landroid/content/Context;

    const-string v2, "window"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 150
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Display;->getWidth()I

    move-result v2

    .line 151
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    .line 156
    const-wide v3, 0x3ff199999999999aL    # 1.1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-double v5, v0

    mul-double v2, v3, v5

    double-to-int v0, v2

    .line 157
    invoke-direct {p0, v1, v0}, Lcom/facebook/ui/media/b/a;->a(Lcom/facebook/ui/media/attachments/a;I)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 159
    if-eqz v1, :cond_0

    .line 163
    iget-object v2, p0, Lcom/facebook/ui/media/b/a;->d:Lcom/facebook/a/a;

    invoke-virtual {v2, v1, v0}, Lcom/facebook/a/a;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 165
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 166
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x64

    invoke-virtual {v0, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 167
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V

    .line 168
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    goto :goto_1
.end method

.method public a(Lcom/facebook/ui/media/attachments/a;III)[B
    .locals 9

    .prologue
    .line 189
    iget-object v0, p0, Lcom/facebook/ui/media/b/a;->c:Lcom/facebook/ui/images/a/a;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/ui/images/a/a;->a(Lcom/facebook/ui/media/attachments/a;II)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 195
    const/4 v0, 0x0

    .line 196
    const/4 v2, 0x0

    move v3, v0

    .line 197
    :goto_0
    const/4 v0, 0x4

    if-ge v3, v0, :cond_7

    .line 200
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-gt v0, p3, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-le v0, p2, :cond_6

    .line 201
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/media/b/a;->d:Lcom/facebook/a/a;

    invoke-virtual {v0, v1, p2, p3}, Lcom/facebook/a/a;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 208
    :goto_1
    const/4 v6, -0x1

    .line 209
    const/16 v5, 0x5f

    .line 210
    const v4, 0x7fffffff

    move v8, v4

    move-object v4, v2

    move v2, v8

    .line 211
    :goto_2
    if-eq v5, v6, :cond_8

    .line 212
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 213
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v0, v2, v5, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    move-result v6

    .line 214
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v2

    .line 215
    if-eqz v2, :cond_1

    if-nez v6, :cond_2

    .line 216
    :cond_1
    const/4 v0, 0x0

    .line 238
    :goto_3
    return-object v0

    .line 218
    :cond_2
    if-gt v2, p4, :cond_3

    move v8, v2

    move-object v2, v4

    move v4, v8

    .line 225
    :goto_4
    if-gt v4, p4, :cond_4

    move-object v0, v2

    .line 235
    :goto_5
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    if-gt v1, p4, :cond_5

    .line 236
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    goto :goto_3

    .line 222
    :cond_3
    add-int/lit8 v6, v5, -0xa

    const/16 v7, 0x32

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    move v8, v6

    move v6, v5

    move v5, v8

    .line 223
    goto :goto_2

    .line 230
    :cond_4
    const-wide/high16 v4, 0x3fe8000000000000L    # 0.75

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    int-to-double v6, v6

    mul-double/2addr v4, v6

    double-to-int p2, v4

    .line 231
    const-wide/high16 v4, 0x3fe8000000000000L    # 0.75

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-double v6, v0

    mul-double/2addr v4, v6

    double-to-int p3, v4

    .line 232
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    .line 233
    goto :goto_0

    .line 238
    :cond_5
    const/4 v0, 0x0

    goto :goto_3

    :cond_6
    move-object v0, v1

    goto :goto_1

    :cond_7
    move-object v0, v2

    goto :goto_5

    :cond_8
    move v8, v2

    move-object v2, v4

    move v4, v8

    goto :goto_4
.end method
