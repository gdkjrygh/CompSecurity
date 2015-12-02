.class final Lcom/qihoo/security/widget/MaterialRippleLayout$b;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/widget/MaterialRippleLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/MaterialRippleLayout;

.field private final b:Landroid/view/MotionEvent;


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 639
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$b;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/widget/MaterialRippleLayout;->a(Lcom/qihoo/security/widget/MaterialRippleLayout;Z)Z

    .line 640
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$b;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-static {v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->a(Lcom/qihoo/security/widget/MaterialRippleLayout;)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$b;->b:Landroid/view/MotionEvent;

    invoke-virtual {v0, v1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 641
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$b;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-static {v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->a(Lcom/qihoo/security/widget/MaterialRippleLayout;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 642
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$b;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-static {v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->i(Lcom/qihoo/security/widget/MaterialRippleLayout;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 643
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$b;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-static {v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->j(Lcom/qihoo/security/widget/MaterialRippleLayout;)V

    .line 645
    :cond_0
    return-void
.end method
