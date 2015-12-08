.class final Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;
.super Ljava/lang/Object;
.source "UrlImageViewHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field final synthetic val$callback:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;

.field final synthetic val$defaultDrawable:Landroid/graphics/drawable/Drawable;

.field final synthetic val$downloads:Ljava/util/ArrayList;

.field final synthetic val$imageView:Landroid/widget/ImageView;

.field final synthetic val$loader:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 598
    const-class v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;Landroid/widget/ImageView;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 598
    iput-object p1, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$loader:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;

    iput-object p2, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$url:Ljava/lang/String;

    iput-object p3, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$defaultDrawable:Landroid/graphics/drawable/Drawable;

    iput-object p4, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$callback:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;

    iput-object p5, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$imageView:Landroid/widget/ImageView;

    iput-object p6, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$downloads:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .prologue
    const/4 v10, 0x0

    .line 601
    sget-boolean v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->$assertionsDisabled:Z

    if-nez v6, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v6

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    new-instance v6, Ljava/lang/AssertionError;

    invoke-direct {v6}, Ljava/lang/AssertionError;-><init>()V

    throw v6

    .line 602
    :cond_0
    iget-object v6, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$loader:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;

    iget-object v0, v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;->result:Landroid/graphics/Bitmap;

    .line 603
    .local v0, "bitmap":Landroid/graphics/Bitmap;
    const/4 v4, 0x0

    .line 604
    .local v4, "usableResult":Landroid/graphics/drawable/Drawable;
    if-eqz v0, :cond_1

    .line 605
    new-instance v4, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;

    .end local v4    # "usableResult":Landroid/graphics/drawable/Drawable;
    iget-object v6, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$url:Ljava/lang/String;

    sget-object v7, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mResources:Landroid/content/res/Resources;

    invoke-direct {v4, v6, v7, v0}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;-><init>(Ljava/lang/String;Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 607
    .restart local v4    # "usableResult":Landroid/graphics/drawable/Drawable;
    :cond_1
    if-nez v4, :cond_2

    .line 608
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "No usable result, defaulting "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$url:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v7, v10, [Ljava/lang/Object;

    invoke-static {v6, v7}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->clog(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 609
    iget-object v4, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$defaultDrawable:Landroid/graphics/drawable/Drawable;

    .line 610
    # getter for: Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mLiveCache:Lcom/koushikdutta/urlimageviewhelper/DrawableCache;
    invoke-static {}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->access$200()Lcom/koushikdutta/urlimageviewhelper/DrawableCache;

    move-result-object v6

    iget-object v7, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$url:Ljava/lang/String;

    invoke-virtual {v6, v7, v4}, Lcom/koushikdutta/urlimageviewhelper/DrawableCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 612
    :cond_2
    # getter for: Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mPendingDownloads:Ljava/util/Hashtable;
    invoke-static {}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->access$300()Ljava/util/Hashtable;

    move-result-object v6

    iget-object v7, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$url:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 614
    iget-object v6, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$callback:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;

    if-eqz v6, :cond_3

    iget-object v6, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$imageView:Landroid/widget/ImageView;

    if-nez v6, :cond_3

    .line 615
    iget-object v6, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$callback:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;

    const/4 v7, 0x0

    iget-object v8, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$loader:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;

    iget-object v8, v8, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;->result:Landroid/graphics/Bitmap;

    iget-object v9, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$url:Ljava/lang/String;

    invoke-interface {v6, v7, v8, v9, v10}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;->onLoaded(Landroid/widget/ImageView;Landroid/graphics/Bitmap;Ljava/lang/String;Z)V

    .line 616
    :cond_3
    const/4 v5, 0x0

    .line 617
    .local v5, "waitingCount":I
    iget-object v6, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$downloads:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_4
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 619
    .local v2, "iv":Landroid/widget/ImageView;
    # getter for: Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mPendingViews:Ljava/util/Hashtable;
    invoke-static {}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->access$400()Ljava/util/Hashtable;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 620
    .local v3, "pendingUrl":Ljava/lang/String;
    iget-object v6, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$url:Ljava/lang/String;

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    .line 621
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Ignoring out of date request to update view for "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$url:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v7, v10, [Ljava/lang/Object;

    invoke-static {v6, v7}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->clog(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 624
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 625
    # getter for: Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mPendingViews:Ljava/util/Hashtable;
    invoke-static {}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->access$400()Ljava/util/Hashtable;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    if-eqz v4, :cond_6

    .line 628
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 632
    :cond_6
    iget-object v6, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$callback:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;

    if-eqz v6, :cond_4

    iget-object v6, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$imageView:Landroid/widget/ImageView;

    if-ne v2, v6, :cond_4

    .line 633
    iget-object v6, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$callback:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;

    iget-object v7, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$loader:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;

    iget-object v7, v7, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;->result:Landroid/graphics/Bitmap;

    iget-object v8, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;->val$url:Ljava/lang/String;

    invoke-interface {v6, v2, v7, v8, v10}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;->onLoaded(Landroid/widget/ImageView;Landroid/graphics/Bitmap;Ljava/lang/String;Z)V

    goto :goto_0

    .line 635
    .end local v2    # "iv":Landroid/widget/ImageView;
    .end local v3    # "pendingUrl":Ljava/lang/String;
    :cond_7
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Populated: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v7, v10, [Ljava/lang/Object;

    invoke-static {v6, v7}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->clog(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 636
    return-void
.end method
