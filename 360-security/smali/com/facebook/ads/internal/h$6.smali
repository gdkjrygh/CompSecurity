.class Lcom/facebook/ads/internal/h$6;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/facebook/ads/internal/adapters/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/ads/internal/h;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/facebook/ads/internal/h;


# direct methods
.method constructor <init>(Lcom/facebook/ads/internal/h;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    iput-object p2, p0, Lcom/facebook/ads/internal/h$6;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/ads/internal/adapters/e;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->d(Lcom/facebook/ads/internal/h;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->e(Lcom/facebook/ads/internal/h;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/ads/internal/h$6;->a:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0, p1}, Lcom/facebook/ads/internal/h;->b(Lcom/facebook/ads/internal/h;Lcom/facebook/ads/internal/adapters/a;)Lcom/facebook/ads/internal/adapters/a;

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->l(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/a;->a()V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->b(Lcom/facebook/ads/internal/h;)V

    return-void
.end method

.method public a(Lcom/facebook/ads/internal/adapters/e;Lcom/facebook/ads/c;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->d(Lcom/facebook/ads/internal/h;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->e(Lcom/facebook/ads/internal/h;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/ads/internal/h$6;->a:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0, p1}, Lcom/facebook/ads/internal/h;->a(Lcom/facebook/ads/internal/h;Lcom/facebook/ads/internal/adapters/a;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->c(Lcom/facebook/ads/internal/h;)V

    return-void
.end method

.method public a(Lcom/facebook/ads/internal/adapters/e;Ljava/lang/String;Z)V
    .locals 3

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->d(Lcom/facebook/ads/internal/h;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->n(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/a;->b()V

    invoke-static {p2}, Lcom/facebook/ads/internal/util/t;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Clickthrough event with playerHandles="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " and url "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz v0, :cond_2

    const-string/jumbo v1, "defined"

    :goto_1
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/ads/internal/c/a;->b(Ljava/lang/String;)V

    if-nez p3, :cond_3

    const-string/jumbo v0, "Adapter handles click, ignoring click url."

    invoke-static {v0}, Lcom/facebook/ads/internal/c/a;->a(Ljava/lang/String;)V

    :cond_0
    :goto_2
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    const-string/jumbo v1, "not defined"

    goto :goto_1

    :cond_3
    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Intent url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ads/internal/c/a;->b(Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v1}, Lcom/facebook/ads/internal/h;->o(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/d/d;

    move-result-object v1

    iget-object v1, v1, Lcom/facebook/ads/internal/d/d;->f:Landroid/content/Context;

    instance-of v1, v1, Landroid/app/Activity;

    if-nez v1, :cond_4

    const-string/jumbo v1, "Context is not instance of Activity"

    invoke-static {v1}, Lcom/facebook/ads/internal/c/a;->b(Ljava/lang/String;)V

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_4
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v1}, Lcom/facebook/ads/internal/h;->o(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/d/d;

    move-result-object v1

    iget-object v1, v1, Lcom/facebook/ads/internal/d/d;->f:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_2
.end method

.method public b(Lcom/facebook/ads/internal/adapters/e;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->d(Lcom/facebook/ads/internal/h;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->m(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/a;->c()V

    return-void
.end method

.method public c(Lcom/facebook/ads/internal/adapters/e;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->d(Lcom/facebook/ads/internal/h;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->p(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/a;->e()V

    return-void
.end method

.method public d(Lcom/facebook/ads/internal/adapters/e;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->d(Lcom/facebook/ads/internal/h;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->q(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/a;->d()V

    return-void
.end method
