.class final Lcom/roidapp/photogrid/video/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/ScrollImageViewEx;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/roidapp/photogrid/video/n;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 3

    .prologue
    .line 69
    iget-object v0, p0, Lcom/roidapp/photogrid/video/n;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(Lcom/roidapp/photogrid/video/ScrollImageViewEx;)Lcom/roidapp/photogrid/release/hr;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 70
    iget-object v0, p0, Lcom/roidapp/photogrid/video/n;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(Lcom/roidapp/photogrid/video/ScrollImageViewEx;)Lcom/roidapp/photogrid/release/hr;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/release/hr;->a()V

    .line 72
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/n;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b(Lcom/roidapp/photogrid/video/ScrollImageViewEx;)I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/video/n;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    iget v0, v0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a:I

    if-eqz v0, :cond_1

    .line 73
    iget-object v0, p0, Lcom/roidapp/photogrid/video/n;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/n;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b(Lcom/roidapp/photogrid/video/ScrollImageViewEx;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(IZ)V

    .line 79
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/n;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 80
    return-void

    .line 75
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/n;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/n;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    iget v1, v1, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b:I

    neg-int v1, v1

    int-to-float v1, v1

    iput v1, v0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->c:F

    .line 76
    iget-object v0, p0, Lcom/roidapp/photogrid/video/n;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/n;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    iget v1, v1, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->c:F

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->setX(F)V

    goto :goto_0
.end method
