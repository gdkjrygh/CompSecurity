.class final Lcom/arist/activity/m;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Lcom/arist/activity/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/activity/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/m;->a:Lcom/arist/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/arist/activity/m;->a:Lcom/arist/activity/MainActivity;

    const-class v2, Lcom/arist/activity/MusicPlayActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/arist/activity/m;->a:Lcom/arist/activity/MainActivity;

    invoke-virtual {v1, v0}, Lcom/arist/activity/MainActivity;->startActivity(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/arist/activity/m;->a:Lcom/arist/activity/MainActivity;

    const v1, 0x7f04000b

    const v2, 0x7f040004

    invoke-virtual {v0, v1, v2}, Lcom/arist/activity/MainActivity;->overridePendingTransition(II)V

    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
