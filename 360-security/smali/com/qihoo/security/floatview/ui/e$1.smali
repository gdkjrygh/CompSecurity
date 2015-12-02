.class Lcom/qihoo/security/floatview/ui/e$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/floatview/ui/e;->d()V
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
    .line 69
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/e$1;->a:Lcom/qihoo/security/floatview/ui/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 72
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e$1;->a:Lcom/qihoo/security/floatview/ui/e;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/e;->b()V

    .line 73
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e$1;->a:Lcom/qihoo/security/floatview/ui/e;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/e;->a(Lcom/qihoo/security/floatview/ui/e;)V

    .line 74
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 75
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 76
    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 77
    new-instance v1, Lcom/qihoo/security/floatview/ui/e$1$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/floatview/ui/e$1$1;-><init>(Lcom/qihoo/security/floatview/ui/e$1;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 92
    return-void
.end method
