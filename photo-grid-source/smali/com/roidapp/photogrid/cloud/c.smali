.class final Lcom/roidapp/photogrid/cloud/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/mobileads/MoPubView$BannerAdListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/a;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/a;)V
    .locals 0

    .prologue
    .line 255
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/c;->a:Lcom/roidapp/photogrid/cloud/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onBannerClicked(Lcom/mopub/mobileads/MoPubView;)V
    .locals 3

    .prologue
    .line 275
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/c;->a:Lcom/roidapp/photogrid/cloud/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a;->b(Lcom/roidapp/photogrid/cloud/a;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x7

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/cloud/a;->a(Landroid/app/Activity;II)V

    .line 278
    return-void
.end method

.method public final onBannerCollapsed(Lcom/mopub/mobileads/MoPubView;)V
    .locals 0

    .prologue
    .line 286
    return-void
.end method

.method public final onBannerExpanded(Lcom/mopub/mobileads/MoPubView;)V
    .locals 0

    .prologue
    .line 282
    return-void
.end method

.method public final onBannerFailed(Lcom/mopub/mobileads/MoPubView;Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 1

    .prologue
    .line 266
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/c;->a:Lcom/roidapp/photogrid/cloud/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a;->f(Lcom/roidapp/photogrid/cloud/a;)Lcom/mopub/mobileads/MoPubView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 267
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/c;->a:Lcom/roidapp/photogrid/cloud/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a;->f(Lcom/roidapp/photogrid/cloud/a;)Lcom/mopub/mobileads/MoPubView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubView;->destroy()V

    .line 268
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/c;->a:Lcom/roidapp/photogrid/cloud/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a;->g(Lcom/roidapp/photogrid/cloud/a;)Lcom/mopub/mobileads/MoPubView;

    .line 270
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/c;->a:Lcom/roidapp/photogrid/cloud/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a;->a(Lcom/roidapp/photogrid/cloud/a;)V

    .line 271
    return-void
.end method

.method public final onBannerLoaded(Lcom/mopub/mobileads/MoPubView;)V
    .locals 3

    .prologue
    .line 259
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/c;->a:Lcom/roidapp/photogrid/cloud/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a;->b(Lcom/roidapp/photogrid/cloud/a;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x7

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/cloud/a;->a(Landroid/app/Activity;II)V

    .line 262
    return-void
.end method
