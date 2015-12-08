.class final Lcom/roidapp/photogrid/b;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/a;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/a;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/roidapp/photogrid/b;->a:Lcom/roidapp/photogrid/a;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 59
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 61
    iget-object v0, p0, Lcom/roidapp/photogrid/b;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/a;->b(Lcom/roidapp/photogrid/a;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/b;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v1}, Lcom/roidapp/photogrid/a;->a(Lcom/roidapp/photogrid/a;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 62
    iget-object v0, p0, Lcom/roidapp/photogrid/b;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/a;->c(Lcom/roidapp/photogrid/a;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/roidapp/photogrid/b;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/a;->c(Lcom/roidapp/photogrid/a;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/b;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v1}, Lcom/roidapp/photogrid/a;->d(Lcom/roidapp/photogrid/a;)Lcom/roidapp/photogrid/c;

    move-result-object v1

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 64
    :cond_0
    return-void
.end method
