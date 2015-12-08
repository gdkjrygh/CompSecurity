.class final Lcom/roidapp/photogrid/ad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/videolib/k;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/MainPage;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/MainPage;)V
    .locals 0

    .prologue
    .line 2543
    iput-object p1, p0, Lcom/roidapp/photogrid/ad;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZLjava/lang/String;)V
    .locals 2

    .prologue
    .line 2546
    iget-object v0, p0, Lcom/roidapp/photogrid/ad;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2549
    iget-object v0, p0, Lcom/roidapp/photogrid/ad;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->I(Lcom/roidapp/photogrid/MainPage;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2550
    iget-object v0, p0, Lcom/roidapp/photogrid/ad;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->I(Lcom/roidapp/photogrid/MainPage;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2551
    iget-object v0, p0, Lcom/roidapp/photogrid/ad;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->J(Lcom/roidapp/photogrid/MainPage;)Landroid/view/View;

    .line 2553
    if-eqz p1, :cond_1

    .line 2554
    iget-object v0, p0, Lcom/roidapp/photogrid/ad;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->K(Lcom/roidapp/photogrid/MainPage;)V

    .line 2568
    :cond_0
    :goto_0
    return-void

    .line 2557
    :cond_1
    const-string v0, "UnsatisfiedLinkError"

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_2

    .line 2558
    iget-object v0, p0, Lcom/roidapp/photogrid/ad;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->L(Lcom/roidapp/photogrid/MainPage;)V

    goto :goto_0

    .line 2560
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/ad;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->M(Lcom/roidapp/photogrid/MainPage;)V

    goto :goto_0
.end method
