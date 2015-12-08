.class Lcom/fedorvlasov/lazylist/ImageLoader$BitmapDisplayer;
.super Ljava/lang/Object;
.source "ImageLoader.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fedorvlasov/lazylist/ImageLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "BitmapDisplayer"
.end annotation


# instance fields
.field bitmap:Landroid/graphics/Bitmap;

.field photoToLoad:Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

.field final synthetic this$0:Lcom/fedorvlasov/lazylist/ImageLoader;


# direct methods
.method public constructor <init>(Lcom/fedorvlasov/lazylist/ImageLoader;Landroid/graphics/Bitmap;Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;)V
    .locals 0
    .param p1, "this$0"    # Lcom/fedorvlasov/lazylist/ImageLoader;
    .param p2, "b"    # Landroid/graphics/Bitmap;
    .param p3, "p"    # Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

    .prologue
    .line 164
    iput-object p1, p0, Lcom/fedorvlasov/lazylist/ImageLoader$BitmapDisplayer;->this$0:Lcom/fedorvlasov/lazylist/ImageLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/fedorvlasov/lazylist/ImageLoader$BitmapDisplayer;->bitmap:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lcom/fedorvlasov/lazylist/ImageLoader$BitmapDisplayer;->photoToLoad:Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 167
    iget-object v0, p0, Lcom/fedorvlasov/lazylist/ImageLoader$BitmapDisplayer;->this$0:Lcom/fedorvlasov/lazylist/ImageLoader;

    iget-object v1, p0, Lcom/fedorvlasov/lazylist/ImageLoader$BitmapDisplayer;->photoToLoad:Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

    invoke-virtual {v0, v1}, Lcom/fedorvlasov/lazylist/ImageLoader;->imageViewReused(Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 175
    :cond_0
    :goto_0
    return-void

    .line 169
    :cond_1
    iget-object v0, p0, Lcom/fedorvlasov/lazylist/ImageLoader$BitmapDisplayer;->bitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/fedorvlasov/lazylist/ImageLoader$BitmapDisplayer;->photoToLoad:Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

    iget-object v0, v0, Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;->imageView:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/fedorvlasov/lazylist/ImageLoader$BitmapDisplayer;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 171
    iget-object v0, p0, Lcom/fedorvlasov/lazylist/ImageLoader$BitmapDisplayer;->photoToLoad:Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

    iget-object v0, v0, Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;->imageView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method
