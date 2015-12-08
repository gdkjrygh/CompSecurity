.class public final Lcom/bumptech/glide/load/resource/bitmap/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/e",
        "<",
        "Lcom/bumptech/glide/load/c/j;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/load/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/e",
            "<",
            "Ljava/io/InputStream;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/bumptech/glide/load/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/e",
            "<",
            "Landroid/os/ParcelFileDescriptor;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/e;Lcom/bumptech/glide/load/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/e",
            "<",
            "Ljava/io/InputStream;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/bumptech/glide/load/e",
            "<",
            "Landroid/os/ParcelFileDescriptor;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/r;->a:Lcom/bumptech/glide/load/e;

    .line 28
    iput-object p2, p0, Lcom/bumptech/glide/load/resource/bitmap/r;->b:Lcom/bumptech/glide/load/e;

    .line 29
    return-void
.end method

.method private a(Lcom/bumptech/glide/load/c/j;II)Lcom/bumptech/glide/load/b/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/c/j;",
            "II)",
            "Lcom/bumptech/glide/load/b/x",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .prologue
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1}, Lcom/bumptech/glide/load/c/j;->a()Ljava/io/InputStream;

    move-result-object v1

    .line 37
    if-eqz v1, :cond_0

    .line 39
    :try_start_0
    iget-object v2, p0, Lcom/bumptech/glide/load/resource/bitmap/r;->a:Lcom/bumptech/glide/load/e;

    invoke-interface {v2, v1, p2, p3}, Lcom/bumptech/glide/load/e;->a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/b/x;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 47
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 48
    invoke-virtual {p1}, Lcom/bumptech/glide/load/c/j;->b()Landroid/os/ParcelFileDescriptor;

    move-result-object v1

    .line 49
    if-eqz v1, :cond_1

    .line 50
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/r;->b:Lcom/bumptech/glide/load/e;

    invoke-interface {v0, v1, p2, p3}, Lcom/bumptech/glide/load/e;->a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    .line 53
    :cond_1
    return-object v0

    .line 41
    :catch_0
    move-exception v1

    const-string v1, "ImageVideoDecoder"

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    goto :goto_0
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/b/x;
    .locals 1

    .prologue
    .line 20
    check-cast p1, Lcom/bumptech/glide/load/c/j;

    invoke-direct {p0, p1, p2, p3}, Lcom/bumptech/glide/load/resource/bitmap/r;->a(Lcom/bumptech/glide/load/c/j;II)Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 58
    const-string v0, "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap"

    return-object v0
.end method
