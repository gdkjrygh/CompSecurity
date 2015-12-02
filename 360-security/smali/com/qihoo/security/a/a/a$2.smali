.class Lcom/qihoo/security/a/a/a$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/a/a/a;->a(Ljava/util/concurrent/BlockingQueue;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Ljava/util/concurrent/BlockingQueue;

.field final synthetic c:I

.field final synthetic d:Lcom/qihoo/security/a/a/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/a/a/a;Landroid/view/View;Ljava/util/concurrent/BlockingQueue;I)V
    .locals 0

    .prologue
    .line 198
    iput-object p1, p0, Lcom/qihoo/security/a/a/a$2;->d:Lcom/qihoo/security/a/a/a;

    iput-object p2, p0, Lcom/qihoo/security/a/a/a$2;->a:Landroid/view/View;

    iput-object p3, p0, Lcom/qihoo/security/a/a/a$2;->b:Ljava/util/concurrent/BlockingQueue;

    iput p4, p0, Lcom/qihoo/security/a/a/a$2;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 210
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$2;->a:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 211
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$2;->d:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->e(Lcom/qihoo/security/a/a/a;)I

    move-result v0

    if-ne v0, v3, :cond_2

    .line 212
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$2;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 213
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$2;->d:Lcom/qihoo/security/a/a/a;

    iget-object v1, p0, Lcom/qihoo/security/a/a/a$2;->b:Ljava/util/concurrent/BlockingQueue;

    iget v2, p0, Lcom/qihoo/security/a/a/a$2;->c:I

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/a/a/a;->b(Lcom/qihoo/security/a/a/a;Ljava/util/concurrent/BlockingQueue;I)V

    .line 234
    :cond_0
    :goto_0
    return-void

    .line 215
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$2;->d:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->f(Lcom/qihoo/security/a/a/a;)Lcom/qihoo/security/a/a/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/a/a/a$2;->d:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->g(Lcom/qihoo/security/a/a/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 216
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$2;->d:Lcom/qihoo/security/a/a/a;

    invoke-static {v0, v2}, Lcom/qihoo/security/a/a/a;->a(Lcom/qihoo/security/a/a/a;Z)Z

    .line 217
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$2;->d:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->f(Lcom/qihoo/security/a/a/a;)Lcom/qihoo/security/a/a/a$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/a/a/a$a;->a()V

    goto :goto_0

    .line 221
    :cond_2
    iget v0, p0, Lcom/qihoo/security/a/a/a$2;->c:I

    if-ne v0, v3, :cond_0

    .line 222
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$2;->d:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->f(Lcom/qihoo/security/a/a/a;)Lcom/qihoo/security/a/a/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/a/a/a$2;->d:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->g(Lcom/qihoo/security/a/a/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$2;->d:Lcom/qihoo/security/a/a/a;

    invoke-static {v0, v2}, Lcom/qihoo/security/a/a/a;->a(Lcom/qihoo/security/a/a/a;Z)Z

    .line 224
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$2;->d:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->f(Lcom/qihoo/security/a/a/a;)Lcom/qihoo/security/a/a/a$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/a/a/a$a;->a()V

    goto :goto_0
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 206
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 202
    return-void
.end method
