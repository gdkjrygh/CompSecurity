.class final Lcom/miteksystems/misnap/ab;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/u;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/u;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/ab;->a:Lcom/miteksystems/misnap/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/miteksystems/misnap/ab;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0, v1}, Lcom/miteksystems/misnap/u;->c(Lcom/miteksystems/misnap/u;Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/ab;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->p(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/ab;->a:Lcom/miteksystems/misnap/u;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/miteksystems/misnap/u;->c(Lcom/miteksystems/misnap/u;Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/ab;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v0

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_ghost_image_begins:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    return-void
.end method
