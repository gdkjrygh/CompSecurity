.class Lcom/qihoo/security/gamebooster/GameBoosterActivity$2$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/GameBoosterActivity$2;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/gamebooster/GameBoosterActivity$2;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity$2;)V
    .locals 0

    .prologue
    .line 318
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$2$1;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 330
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$2$1;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity$2;

    iget-object v0, v0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$2;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 331
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$2$1;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity$2;

    iget-object v0, v0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$2;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V

    .line 332
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 326
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 322
    return-void
.end method
