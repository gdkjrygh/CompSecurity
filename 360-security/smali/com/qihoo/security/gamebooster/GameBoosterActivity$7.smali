.class Lcom/qihoo/security/gamebooster/GameBoosterActivity$7;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/GameBoosterActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/qihoo/security/gamebooster/GameBoosterActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;I)V
    .locals 0

    .prologue
    .line 1638
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$7;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    iput p2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$7;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1652
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$7;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->h(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 1653
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$7;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->h(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Landroid/view/View;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$7;->a:I

    iget v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$7;->a:I

    invoke-virtual {v0, v1, v3, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 1655
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 1648
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 1643
    return-void
.end method
