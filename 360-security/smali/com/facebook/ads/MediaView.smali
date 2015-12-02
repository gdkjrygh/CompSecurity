.class public Lcom/facebook/ads/MediaView;
.super Landroid/widget/RelativeLayout;


# instance fields
.field private final a:Lcom/facebook/ads/internal/f/c;

.field private b:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const/4 v2, -0x1

    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/ads/MediaView;->b:Z

    new-instance v0, Lcom/facebook/ads/internal/f/c;

    invoke-direct {v0, p1}, Lcom/facebook/ads/internal/f/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/ads/MediaView;->a:Lcom/facebook/ads/internal/f/c;

    iget-object v0, p0, Lcom/facebook/ads/MediaView;->a:Lcom/facebook/ads/internal/f/c;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/facebook/ads/internal/f/c;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/facebook/ads/MediaView;->a:Lcom/facebook/ads/internal/f/c;

    invoke-virtual {p0, v0}, Lcom/facebook/ads/MediaView;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public setNativeAd(Lcom/facebook/ads/NativeAd;)V
    .locals 4

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-boolean v0, p0, Lcom/facebook/ads/MediaView;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/MediaView;->a:Lcom/facebook/ads/internal/f/c;

    invoke-virtual {v0, v1, v1}, Lcom/facebook/ads/internal/f/c;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    iput-boolean v3, p0, Lcom/facebook/ads/MediaView;->b:Z

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/facebook/ads/NativeAd;->e()Lcom/facebook/ads/NativeAd$a;

    move-result-object v0

    if-eqz v0, :cond_1

    iput-boolean v2, p0, Lcom/facebook/ads/MediaView;->b:Z

    new-instance v0, Lcom/facebook/ads/internal/util/l;

    iget-object v1, p0, Lcom/facebook/ads/MediaView;->a:Lcom/facebook/ads/internal/f/c;

    invoke-direct {v0, v1}, Lcom/facebook/ads/internal/util/l;-><init>(Lcom/facebook/ads/internal/f/c;)V

    new-array v1, v2, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/facebook/ads/NativeAd;->e()Lcom/facebook/ads/NativeAd$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/ads/NativeAd$a;->a()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/facebook/ads/internal/util/l;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_1
    return-void
.end method
