.class Lcom/facebook/auth/login/i;
.super Ljava/lang/Object;
.source "AuthFragmentLogoViewGroup.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/g;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/g;)V
    .locals 0

    .prologue
    .line 399
    iput-object p1, p0, Lcom/facebook/auth/login/i;->a:Lcom/facebook/auth/login/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 402
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 403
    const-wide/16 v1, 0x7d

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 405
    iget-object v1, p0, Lcom/facebook/auth/login/i;->a:Lcom/facebook/auth/login/g;

    iget-object v1, v1, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mRootGroup:Landroid/view/View;
    invoke-static {v1}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$900(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 406
    iget-object v1, p0, Lcom/facebook/auth/login/i;->a:Lcom/facebook/auth/login/g;

    iget-object v1, v1, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mRootGroup:Landroid/view/View;
    invoke-static {v1}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$900(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 407
    return-void
.end method
