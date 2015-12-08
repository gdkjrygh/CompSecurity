.class public final Lcom/bumptech/glide/load/resource/bitmap/k;
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
        "Landroid/os/ParcelFileDescriptor;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/load/resource/bitmap/y;

.field private final b:Lcom/bumptech/glide/load/b/a/e;

.field private c:Lcom/bumptech/glide/load/a;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/a;)V
    .locals 1

    .prologue
    .line 33
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/y;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/y;-><init>()V

    invoke-direct {p0, v0, p1, p2}, Lcom/bumptech/glide/load/resource/bitmap/k;-><init>(Lcom/bumptech/glide/load/resource/bitmap/y;Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/a;)V

    .line 34
    return-void
.end method

.method private constructor <init>(Lcom/bumptech/glide/load/resource/bitmap/y;Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/a;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/k;->a:Lcom/bumptech/glide/load/resource/bitmap/y;

    .line 39
    iput-object p2, p0, Lcom/bumptech/glide/load/resource/bitmap/k;->b:Lcom/bumptech/glide/load/b/a/e;

    .line 40
    iput-object p3, p0, Lcom/bumptech/glide/load/resource/bitmap/k;->c:Lcom/bumptech/glide/load/a;

    .line 41
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/b/x;
    .locals 2

    .prologue
    .line 19
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    .line 1045
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/k;->a:Lcom/bumptech/glide/load/resource/bitmap/y;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/resource/bitmap/y;->a(Landroid/os/ParcelFileDescriptor;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1046
    iget-object v1, p0, Lcom/bumptech/glide/load/resource/bitmap/k;->b:Lcom/bumptech/glide/load/b/a/e;

    invoke-static {v0, v1}, Lcom/bumptech/glide/load/resource/bitmap/c;->a(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/b/a/e;)Lcom/bumptech/glide/load/resource/bitmap/c;

    move-result-object v0

    .line 19
    return-object v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    const-string v0, "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap"

    return-object v0
.end method
