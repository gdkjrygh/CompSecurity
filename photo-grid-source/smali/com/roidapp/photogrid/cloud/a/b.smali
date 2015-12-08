.class final Lcom/roidapp/photogrid/cloud/a/b;
.super Lcom/google/android/gms/ads/AdListener;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/a/a;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/a/a;)V
    .locals 0

    .prologue
    .line 211
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/a/b;->a:Lcom/roidapp/photogrid/cloud/a/a;

    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdFailedToLoad(I)V
    .locals 2

    .prologue
    .line 214
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/b;->a:Lcom/roidapp/photogrid/cloud/a/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/a;->d(Lcom/roidapp/photogrid/cloud/a/a;)Z

    .line 215
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/b;->a:Lcom/roidapp/photogrid/cloud/a/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/a;->e(Lcom/roidapp/photogrid/cloud/a/a;)Lcom/google/ads/AdLoader;

    .line 216
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/b;->a:Lcom/roidapp/photogrid/cloud/a/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/cloud/a/a;->a(Lcom/roidapp/photogrid/cloud/a/a;Lcom/google/ads/formats/NativeAppInstallAd;)Lcom/google/ads/formats/NativeAppInstallAd;

    .line 217
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/b;->a:Lcom/roidapp/photogrid/cloud/a/a;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/a/a;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/b;->a:Lcom/roidapp/photogrid/cloud/a/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/a;->c(Lcom/roidapp/photogrid/cloud/a/a;)V

    .line 220
    :cond_0
    return-void
.end method

.method public final onAdOpened()V
    .locals 2

    .prologue
    .line 224
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdOpened()V

    .line 225
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/b;->a:Lcom/roidapp/photogrid/cloud/a/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/a/a;->onClick(Landroid/view/View;)V

    .line 226
    return-void
.end method
