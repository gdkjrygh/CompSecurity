.class public final Lcom/roidapp/photogrid/video/bm;
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
        "Landroid/graphics/Bitmap;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/load/b/a/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-static {p1}, Lcom/bumptech/glide/h;->a(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/h;->a()Lcom/bumptech/glide/load/b/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/bm;->a:Lcom/bumptech/glide/load/b/a/e;

    .line 23
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/b/x;
    .locals 1

    .prologue
    .line 17
    check-cast p1, Landroid/graphics/Bitmap;

    .line 1027
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bm;->a:Lcom/bumptech/glide/load/b/a/e;

    invoke-static {p1, v0}, Lcom/bumptech/glide/load/resource/bitmap/c;->a(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/b/a/e;)Lcom/bumptech/glide/load/resource/bitmap/c;

    move-result-object v0

    .line 17
    return-object v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    const-string v0, "VideoPictureDecoder.com.roidapp.photogrid.video"

    return-object v0
.end method
