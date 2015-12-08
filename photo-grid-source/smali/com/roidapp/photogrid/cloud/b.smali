.class final Lcom/roidapp/photogrid/cloud/b;
.super Lcom/google/android/gms/ads/AdListener;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/a;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/a;)V
    .locals 0

    .prologue
    .line 110
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/b;->a:Lcom/roidapp/photogrid/cloud/a;

    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdClosed()V
    .locals 0

    .prologue
    .line 116
    return-void
.end method

.method public final onAdFailedToLoad(I)V
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b;->a:Lcom/roidapp/photogrid/cloud/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a;->a(Lcom/roidapp/photogrid/cloud/a;)V

    .line 113
    return-void
.end method

.method public final onAdLeftApplication()V
    .locals 0

    .prologue
    .line 121
    return-void
.end method

.method public final onAdLoaded()V
    .locals 3

    .prologue
    .line 127
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b;->a:Lcom/roidapp/photogrid/cloud/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a;->b(Lcom/roidapp/photogrid/cloud/a;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/cloud/a;->a(Landroid/app/Activity;II)V

    .line 128
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b;->a:Lcom/roidapp/photogrid/cloud/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a;->b(Lcom/roidapp/photogrid/cloud/a;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b;->a:Lcom/roidapp/photogrid/cloud/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a;->b(Lcom/roidapp/photogrid/cloud/a;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 129
    invoke-static {}, Lcom/roidapp/photogrid/common/ai;->a()Lcom/roidapp/photogrid/common/ai;

    invoke-static {}, Lcom/roidapp/photogrid/common/ai;->c()V

    .line 130
    :cond_0
    return-void
.end method

.method public final onAdOpened()V
    .locals 3

    .prologue
    .line 132
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b;->a:Lcom/roidapp/photogrid/cloud/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a;->b(Lcom/roidapp/photogrid/cloud/a;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/cloud/a;->a(Landroid/app/Activity;II)V

    .line 133
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b;->a:Lcom/roidapp/photogrid/cloud/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a;->b(Lcom/roidapp/photogrid/cloud/a;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b;->a:Lcom/roidapp/photogrid/cloud/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a;->b(Lcom/roidapp/photogrid/cloud/a;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 134
    invoke-static {}, Lcom/roidapp/photogrid/common/ai;->a()Lcom/roidapp/photogrid/common/ai;

    invoke-static {}, Lcom/roidapp/photogrid/common/ai;->d()V

    .line 135
    :cond_0
    return-void
.end method
