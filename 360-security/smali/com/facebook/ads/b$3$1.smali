.class Lcom/facebook/ads/b$3$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/ads/b$3;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ads/b$3;


# direct methods
.method constructor <init>(Lcom/facebook/ads/b$3;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/b$3$1;->a:Lcom/facebook/ads/b$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/facebook/ads/b$3$1;->a:Lcom/facebook/ads/b$3;

    iget-object v0, v0, Lcom/facebook/ads/b$3;->c:Lcom/facebook/ads/b;

    invoke-static {v0}, Lcom/facebook/ads/b;->a(Lcom/facebook/ads/b;)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/b$3$1;->a:Lcom/facebook/ads/b$3;

    iget-object v0, v0, Lcom/facebook/ads/b$3;->c:Lcom/facebook/ads/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/ads/b;->a(Lcom/facebook/ads/b;Z)Z

    new-instance v0, Lcom/facebook/ads/b$3$1$1;

    invoke-direct {v0, p0}, Lcom/facebook/ads/b$3$1$1;-><init>(Lcom/facebook/ads/b$3$1;)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    iget-object v1, p0, Lcom/facebook/ads/b$3$1;->a:Lcom/facebook/ads/b$3;

    iget-object v1, v1, Lcom/facebook/ads/b$3;->c:Lcom/facebook/ads/b;

    invoke-virtual {v1, v0}, Lcom/facebook/ads/b;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method
