.class final Lcom/mopub/nativeads/al;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;


# instance fields
.field final synthetic a:Landroid/widget/ImageView;

.field final synthetic b:Lcom/mopub/nativeads/NativeResponse;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/NativeResponse;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 328
    iput-object p1, p0, Lcom/mopub/nativeads/al;->b:Lcom/mopub/nativeads/NativeResponse;

    iput-object p2, p0, Lcom/mopub/nativeads/al;->a:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onErrorResponse(Lcom/mopub/volley/VolleyError;)V
    .locals 2

    .prologue
    .line 340
    const-string v0, "Failed to load image."

    invoke-static {v0, p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 341
    iget-object v0, p0, Lcom/mopub/nativeads/al;->a:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 342
    return-void
.end method

.method public final onResponse(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;Z)V
    .locals 2

    .prologue
    .line 332
    if-nez p2, :cond_0

    .line 333
    const-string v0, "Image was not loaded immediately into your ad view. You should call preCacheImages as part of your custom event loading process."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 335
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/al;->a:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 336
    return-void
.end method
