.class Lcom/qihoo/security/gamebooster/GameBoosterActivity$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/floatview/ui/FloatViewWndmillView$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/GameBoosterActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V
    .locals 0

    .prologue
    .line 308
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$2;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 315
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$2;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    const v1, 0x7f04000a

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 317
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$2;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 318
    new-instance v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$2$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$2$1;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity$2;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 334
    return-void
.end method
