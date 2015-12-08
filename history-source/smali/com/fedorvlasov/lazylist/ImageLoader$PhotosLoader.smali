.class Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;
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
    name = "PhotosLoader"
.end annotation


# instance fields
.field photoToLoad:Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

.field final synthetic this$0:Lcom/fedorvlasov/lazylist/ImageLoader;


# direct methods
.method constructor <init>(Lcom/fedorvlasov/lazylist/ImageLoader;Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;)V
    .locals 0
    .param p1, "this$0"    # Lcom/fedorvlasov/lazylist/ImageLoader;
    .param p2, "photoToLoad"    # Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

    .prologue
    .line 134
    iput-object p1, p0, Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;->this$0:Lcom/fedorvlasov/lazylist/ImageLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 135
    iput-object p2, p0, Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;->photoToLoad:Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

    .line 136
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 140
    iget-object v3, p0, Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;->this$0:Lcom/fedorvlasov/lazylist/ImageLoader;

    iget-object v4, p0, Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;->photoToLoad:Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

    invoke-virtual {v3, v4}, Lcom/fedorvlasov/lazylist/ImageLoader;->imageViewReused(Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 149
    :cond_0
    :goto_0
    return-void

    .line 142
    :cond_1
    iget-object v3, p0, Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;->this$0:Lcom/fedorvlasov/lazylist/ImageLoader;

    iget-object v4, p0, Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;->photoToLoad:Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

    iget-object v4, v4, Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;->url:Ljava/lang/String;

    # invokes: Lcom/fedorvlasov/lazylist/ImageLoader;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    invoke-static {v3, v4}, Lcom/fedorvlasov/lazylist/ImageLoader;->access$000(Lcom/fedorvlasov/lazylist/ImageLoader;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 143
    .local v2, "bmp":Landroid/graphics/Bitmap;
    iget-object v3, p0, Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;->this$0:Lcom/fedorvlasov/lazylist/ImageLoader;

    iget-object v3, v3, Lcom/fedorvlasov/lazylist/ImageLoader;->memoryCache:Lcom/fedorvlasov/lazylist/MemoryCache;

    iget-object v4, p0, Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;->photoToLoad:Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

    iget-object v4, v4, Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;->url:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, Lcom/fedorvlasov/lazylist/MemoryCache;->put(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 144
    iget-object v3, p0, Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;->this$0:Lcom/fedorvlasov/lazylist/ImageLoader;

    iget-object v4, p0, Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;->photoToLoad:Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

    invoke-virtual {v3, v4}, Lcom/fedorvlasov/lazylist/ImageLoader;->imageViewReused(Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 146
    new-instance v1, Lcom/fedorvlasov/lazylist/ImageLoader$BitmapDisplayer;

    iget-object v3, p0, Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;->this$0:Lcom/fedorvlasov/lazylist/ImageLoader;

    iget-object v4, p0, Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;->photoToLoad:Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

    invoke-direct {v1, v3, v2, v4}, Lcom/fedorvlasov/lazylist/ImageLoader$BitmapDisplayer;-><init>(Lcom/fedorvlasov/lazylist/ImageLoader;Landroid/graphics/Bitmap;Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;)V

    .line 147
    .local v1, "bd":Lcom/fedorvlasov/lazylist/ImageLoader$BitmapDisplayer;
    iget-object v3, p0, Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;->photoToLoad:Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

    iget-object v3, v3, Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;->imageView:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 148
    .local v0, "a":Landroid/app/Activity;
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method
