.class Lcom/qihoo/security/floatview/ui/f$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/floatview/ui/f;->a(Ljava/lang/String;)V
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
    .line 298
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/f$2;->a:Lcom/qihoo/security/floatview/ui/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 4

    .prologue
    .line 309
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f$2;->a:Lcom/qihoo/security/floatview/ui/f;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/f;->b(Lcom/qihoo/security/floatview/ui/f;)Lcom/qihoo/security/floatview/ui/g;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/floatview/ui/f$2$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/floatview/ui/f$2$1;-><init>(Lcom/qihoo/security/floatview/ui/f$2;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/floatview/ui/g;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 315
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 305
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 301
    return-void
.end method
