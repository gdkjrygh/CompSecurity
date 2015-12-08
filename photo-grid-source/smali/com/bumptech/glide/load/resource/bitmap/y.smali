.class public final Lcom/bumptech/glide/load/resource/bitmap/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/resource/bitmap/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/resource/bitmap/a",
        "<",
        "Landroid/os/ParcelFileDescriptor;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Lcom/bumptech/glide/load/resource/bitmap/z;


# instance fields
.field private b:Lcom/bumptech/glide/load/resource/bitmap/z;

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/z;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/z;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/y;->a:Lcom/bumptech/glide/load/resource/bitmap/z;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/y;->a:Lcom/bumptech/glide/load/resource/bitmap/z;

    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/resource/bitmap/y;-><init>(Lcom/bumptech/glide/load/resource/bitmap/z;)V

    .line 26
    return-void
.end method

.method private constructor <init>(Lcom/bumptech/glide/load/resource/bitmap/z;)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/y;->b:Lcom/bumptech/glide/load/resource/bitmap/z;

    .line 38
    const/4 v0, -0x1

    iput v0, p0, Lcom/bumptech/glide/load/resource/bitmap/y;->c:I

    .line 39
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/ParcelFileDescriptor;)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    .line 1066
    new-instance v1, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 46
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;)V

    .line 48
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/y;->c:I

    if-ltz v0, :cond_0

    .line 49
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/y;->c:I

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(J)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 53
    :goto_0
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 54
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V

    .line 55
    return-object v0

    .line 51
    :cond_0
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 60
    const-string v0, "VideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap"

    return-object v0
.end method
