.class final Lcom/roidapp/photogrid/cloud/aw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/PGShareActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V
    .locals 0

    .prologue
    .line 364
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/aw;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    .line 368
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/aw;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->e()Z

    .line 369
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/aw;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d()Z

    .line 370
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 371
    const/4 v0, 0x0

    return v0
.end method
