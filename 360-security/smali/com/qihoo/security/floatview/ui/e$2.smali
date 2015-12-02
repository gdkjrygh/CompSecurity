.class Lcom/qihoo/security/floatview/ui/e$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/floatview/ui/e;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/floatview/ui/e;


# direct methods
.method constructor <init>(Lcom/qihoo/security/floatview/ui/e;)V
    .locals 0

    .prologue
    .line 223
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/e$2;->a:Lcom/qihoo/security/floatview/ui/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 234
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e$2;->a:Lcom/qihoo/security/floatview/ui/e;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/e;->b(Lcom/qihoo/security/floatview/ui/e;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 235
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 230
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 226
    return-void
.end method
