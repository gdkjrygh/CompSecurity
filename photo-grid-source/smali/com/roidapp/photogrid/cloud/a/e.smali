.class final Lcom/roidapp/photogrid/cloud/a/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/a/a;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/a/a;)V
    .locals 0

    .prologue
    .line 343
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/a/e;->a:Lcom/roidapp/photogrid/cloud/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 346
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/e;->a:Lcom/roidapp/photogrid/cloud/a/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/a;->f(Lcom/roidapp/photogrid/cloud/a/a;)Lcom/google/ads/formats/NativeAppInstallAd;

    move-result-object v0

    const/16 v1, 0x7d9

    invoke-interface {v0, v1}, Lcom/google/ads/formats/NativeAppInstallAd;->performClick(I)V

    .line 347
    return-void
.end method
