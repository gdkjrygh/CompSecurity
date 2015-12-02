.class Lcom/qihoo/security/a/a/a$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/a/a/a;->a(Ljava/util/concurrent/BlockingQueue;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Ljava/util/concurrent/BlockingQueue;

.field final synthetic c:Lcom/qihoo/security/a/a/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/a/a/a;Landroid/view/View;Ljava/util/concurrent/BlockingQueue;)V
    .locals 0

    .prologue
    .line 301
    iput-object p1, p0, Lcom/qihoo/security/a/a/a$4;->c:Lcom/qihoo/security/a/a/a;

    iput-object p2, p0, Lcom/qihoo/security/a/a/a$4;->a:Landroid/view/View;

    iput-object p3, p0, Lcom/qihoo/security/a/a/a$4;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 313
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$4;->a:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 314
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$4;->c:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->e(Lcom/qihoo/security/a/a/a;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 315
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$4;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 316
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$4;->c:Lcom/qihoo/security/a/a/a;

    iget-object v1, p0, Lcom/qihoo/security/a/a/a$4;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-static {v0, v1}, Lcom/qihoo/security/a/a/a;->a(Lcom/qihoo/security/a/a/a;Ljava/util/concurrent/BlockingQueue;)V

    .line 332
    :cond_0
    :goto_0
    return-void

    .line 318
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$4;->c:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->f(Lcom/qihoo/security/a/a/a;)Lcom/qihoo/security/a/a/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/a/a/a$4;->c:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->g(Lcom/qihoo/security/a/a/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 319
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$4;->c:Lcom/qihoo/security/a/a/a;

    invoke-static {v0, v2}, Lcom/qihoo/security/a/a/a;->a(Lcom/qihoo/security/a/a/a;Z)Z

    .line 320
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$4;->c:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->f(Lcom/qihoo/security/a/a/a;)Lcom/qihoo/security/a/a/a$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/a/a/a$a;->a()V

    goto :goto_0

    .line 324
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$4;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 325
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$4;->c:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->f(Lcom/qihoo/security/a/a/a;)Lcom/qihoo/security/a/a/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/a/a/a$4;->c:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->g(Lcom/qihoo/security/a/a/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 326
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$4;->c:Lcom/qihoo/security/a/a/a;

    invoke-static {v0, v2}, Lcom/qihoo/security/a/a/a;->a(Lcom/qihoo/security/a/a/a;Z)Z

    .line 327
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$4;->c:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->f(Lcom/qihoo/security/a/a/a;)Lcom/qihoo/security/a/a/a$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/a/a/a$a;->a()V

    goto :goto_0
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 309
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 305
    return-void
.end method
