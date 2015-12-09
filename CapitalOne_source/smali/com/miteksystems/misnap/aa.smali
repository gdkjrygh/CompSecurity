.class final Lcom/miteksystems/misnap/aa;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/u;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/u;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/aa;->a:Lcom/miteksystems/misnap/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 4

    const/4 v1, 0x1

    iget-object v0, p0, Lcom/miteksystems/misnap/aa;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->K(Lcom/miteksystems/misnap/u;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/aa;->a:Lcom/miteksystems/misnap/u;

    iget-object v0, v0, Lcom/miteksystems/misnap/u;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/aa;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->I(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/aa;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->m(Lcom/miteksystems/misnap/u;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/miteksystems/misnap/aa;->a:Lcom/miteksystems/misnap/u;

    iget-object v1, v1, Lcom/miteksystems/misnap/u;->r:Ljava/lang/Runnable;

    iget-object v2, p0, Lcom/miteksystems/misnap/aa;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v2}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v2

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->J()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/aa;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->I(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/aa;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->J(Lcom/miteksystems/misnap/u;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/miteksystems/misnap/aa;->a:Lcom/miteksystems/misnap/u;

    iget-object v1, v1, Lcom/miteksystems/misnap/u;->k:Lcom/miteksystems/misnap/s;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/miteksystems/misnap/aa;->a:Lcom/miteksystems/misnap/u;

    iget-object v1, v1, Lcom/miteksystems/misnap/u;->k:Lcom/miteksystems/misnap/s;

    invoke-virtual {v1, v0}, Lcom/miteksystems/misnap/s;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
