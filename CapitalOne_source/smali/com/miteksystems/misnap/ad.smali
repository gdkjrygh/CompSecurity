.class final Lcom/miteksystems/misnap/ad;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/u;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/u;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/ad;->a:Lcom/miteksystems/misnap/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/ad;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->i(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/ad;->a:Lcom/miteksystems/misnap/u;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/miteksystems/misnap/u;->d(Lcom/miteksystems/misnap/u;Z)V

    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/ad;->a:Lcom/miteksystems/misnap/u;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/miteksystems/misnap/u;->d(Lcom/miteksystems/misnap/u;Z)V

    return-void
.end method
