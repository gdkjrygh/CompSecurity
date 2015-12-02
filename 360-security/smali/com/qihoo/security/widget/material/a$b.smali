.class final Lcom/qihoo/security/widget/material/a$b;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/widget/material/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/material/a;


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 551
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a$b;->a:Lcom/qihoo/security/widget/material/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/widget/material/a;->a(Lcom/qihoo/security/widget/material/a;Z)Z

    .line 552
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a$b;->a:Lcom/qihoo/security/widget/material/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/material/a;->a(Lcom/qihoo/security/widget/material/a;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 553
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a$b;->a:Lcom/qihoo/security/widget/material/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/material/a;->f(Lcom/qihoo/security/widget/material/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 554
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a$b;->a:Lcom/qihoo/security/widget/material/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/material/a;->g(Lcom/qihoo/security/widget/material/a;)V

    .line 556
    :cond_0
    return-void
.end method
