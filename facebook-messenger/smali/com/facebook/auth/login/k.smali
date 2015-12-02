.class Lcom/facebook/auth/login/k;
.super Lcom/facebook/widget/b/a;
.source "AuthFragmentLogoViewGroup.java"


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/j;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/j;)V
    .locals 0

    .prologue
    .line 427
    iput-object p1, p0, Lcom/facebook/auth/login/k;->a:Lcom/facebook/auth/login/j;

    invoke-direct {p0}, Lcom/facebook/widget/b/a;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 431
    iget-object v0, p0, Lcom/facebook/auth/login/k;->a:Lcom/facebook/auth/login/j;

    iget-object v0, v0, Lcom/facebook/auth/login/j;->b:Lcom/facebook/auth/login/g;

    iget-object v0, v0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashGroup:Landroid/view/View;
    invoke-static {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$400(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 432
    iget-object v0, p0, Lcom/facebook/auth/login/k;->a:Lcom/facebook/auth/login/j;

    iget-object v0, v0, Lcom/facebook/auth/login/j;->b:Lcom/facebook/auth/login/g;

    iget-object v0, v0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogoGroup:Landroid/view/View;
    invoke-static {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$300(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 433
    return-void
.end method
