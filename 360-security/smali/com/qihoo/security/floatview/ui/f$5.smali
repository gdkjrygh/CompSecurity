.class Lcom/qihoo/security/floatview/ui/f$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/floatview/ui/f;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/floatview/ui/f;


# direct methods
.method constructor <init>(Lcom/qihoo/security/floatview/ui/f;)V
    .locals 0

    .prologue
    .line 424
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/f$5;->a:Lcom/qihoo/security/floatview/ui/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .prologue
    .line 435
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f$5;->a:Lcom/qihoo/security/floatview/ui/f;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/f;->d(Lcom/qihoo/security/floatview/ui/f;)V

    .line 436
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 431
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 427
    return-void
.end method
