.class final Lcom/roidapp/photogrid/cloud/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/a/a;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/a/a;)V
    .locals 0

    .prologue
    .line 201
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/a/c;->a:Lcom/roidapp/photogrid/cloud/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAppInstallAdLoaded(Lcom/google/ads/formats/NativeAppInstallAd;)V
    .locals 2

    .prologue
    .line 204
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/c;->a:Lcom/roidapp/photogrid/cloud/a/a;

    const/16 v1, 0x8

    iput v1, v0, Lcom/roidapp/photogrid/cloud/a/a;->b:I

    .line 205
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/c;->a:Lcom/roidapp/photogrid/cloud/a/a;

    invoke-static {v0, p1}, Lcom/roidapp/photogrid/cloud/a/a;->a(Lcom/roidapp/photogrid/cloud/a/a;Lcom/google/ads/formats/NativeAppInstallAd;)Lcom/google/ads/formats/NativeAppInstallAd;

    .line 206
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/c;->a:Lcom/roidapp/photogrid/cloud/a/a;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/cloud/a/a;->c:Z

    .line 207
    invoke-interface {p1}, Lcom/google/ads/formats/NativeAppInstallAd;->recordImpression()V

    .line 208
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/c;->a:Lcom/roidapp/photogrid/cloud/a/a;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/a/a;->b()V

    .line 209
    return-void
.end method
