.class public final Lcom/bumptech/glide/load/resource/bitmap/l;
.super Lcom/bumptech/glide/load/resource/bitmap/d;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/b/a/e;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/bumptech/glide/load/resource/bitmap/d;-><init>(Lcom/bumptech/glide/load/b/a/e;)V

    .line 20
    return-void
.end method


# virtual methods
.method protected final a(Lcom/bumptech/glide/load/b/a/e;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 24
    invoke-static {p2, p1, p3, p4}, Lcom/bumptech/glide/load/resource/bitmap/x;->a(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/b/a/e;II)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    const-string v0, "FitCenter.com.bumptech.glide.load.resource.bitmap"

    return-object v0
.end method
