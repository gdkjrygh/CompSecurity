.class public final Lcom/bumptech/glide/load/resource/e/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/resource/e/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/resource/e/c",
        "<",
        "Lcom/bumptech/glide/load/resource/d/a;",
        "Lcom/bumptech/glide/load/resource/a/b;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/load/resource/e/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/resource/e/c",
            "<",
            "Landroid/graphics/Bitmap;",
            "Lcom/bumptech/glide/load/resource/bitmap/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/resource/e/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/resource/e/c",
            "<",
            "Landroid/graphics/Bitmap;",
            "Lcom/bumptech/glide/load/resource/bitmap/m;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/e/a;->a:Lcom/bumptech/glide/load/resource/e/c;

    .line 21
    return-void
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/load/b/x;)Lcom/bumptech/glide/load/b/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/x",
            "<",
            "Lcom/bumptech/glide/load/resource/d/a;",
            ">;)",
            "Lcom/bumptech/glide/load/b/x",
            "<",
            "Lcom/bumptech/glide/load/resource/a/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 26
    invoke-interface {p1}, Lcom/bumptech/glide/load/b/x;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/resource/d/a;

    .line 27
    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/d/a;->b()Lcom/bumptech/glide/load/b/x;

    move-result-object v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/e/a;->a:Lcom/bumptech/glide/load/resource/e/c;

    invoke-interface {v0, v1}, Lcom/bumptech/glide/load/resource/e/c;->a(Lcom/bumptech/glide/load/b/x;)Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    .line 36
    :goto_0
    return-object v0

    .line 33
    :cond_0
    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/d/a;->c()Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    goto :goto_0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 41
    const-string v0, "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode"

    return-object v0
.end method
