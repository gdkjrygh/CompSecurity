.class public Lcom/roidapp/baselib/hlistview/aj;
.super Lcom/roidapp/baselib/hlistview/ag;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/ag;-><init>(Landroid/view/View;)V

    .line 30
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aj;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/aj;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getScrollY()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Landroid/view/View;->scrollTo(II)V

    .line 41
    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aj;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 35
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x0

    return v0
.end method
