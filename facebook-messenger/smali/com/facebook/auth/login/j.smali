.class Lcom/facebook/auth/login/j;
.super Ljava/lang/Object;
.source "AuthFragmentLogoViewGroup.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/facebook/auth/login/g;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/g;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 415
    iput-object p1, p0, Lcom/facebook/auth/login/j;->b:Lcom/facebook/auth/login/g;

    iput-object p2, p0, Lcom/facebook/auth/login/j;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x1f4

    .line 419
    iget-object v0, p0, Lcom/facebook/auth/login/j;->b:Lcom/facebook/auth/login/g;

    iget-object v1, p0, Lcom/facebook/auth/login/j;->b:Lcom/facebook/auth/login/g;

    iget-object v1, v1, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo1View:Landroid/widget/ImageView;
    invoke-static {v1}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$1200(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageView;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/auth/login/j;->b:Lcom/facebook/auth/login/g;

    iget-object v2, v2, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo1View:Landroid/widget/ImageView;
    invoke-static {v2}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$600(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/facebook/auth/login/g;->a(Lcom/facebook/auth/login/g;Landroid/view/View;Landroid/view/View;)Landroid/view/animation/AnimationSet;

    move-result-object v0

    .line 420
    iget-object v1, p0, Lcom/facebook/auth/login/j;->b:Lcom/facebook/auth/login/g;

    iget-object v2, p0, Lcom/facebook/auth/login/j;->b:Lcom/facebook/auth/login/g;

    iget-object v2, v2, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo2View:Landroid/widget/ImageView;
    invoke-static {v2}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$1400(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageView;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/auth/login/j;->b:Lcom/facebook/auth/login/g;

    iget-object v3, v3, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo2View:Landroid/widget/ImageView;
    invoke-static {v3}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$800(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageView;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/facebook/auth/login/g;->a(Lcom/facebook/auth/login/g;Landroid/view/View;Landroid/view/View;)Landroid/view/animation/AnimationSet;

    move-result-object v1

    .line 423
    invoke-virtual {v0, v4, v5}, Landroid/view/animation/AnimationSet;->setDuration(J)V

    .line 424
    invoke-virtual {v1, v4, v5}, Landroid/view/animation/AnimationSet;->setDuration(J)V

    .line 427
    new-instance v2, Lcom/facebook/auth/login/k;

    invoke-direct {v2, p0}, Lcom/facebook/auth/login/k;-><init>(Lcom/facebook/auth/login/j;)V

    invoke-virtual {v0, v2}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 437
    iget-object v2, p0, Lcom/facebook/auth/login/j;->b:Lcom/facebook/auth/login/g;

    iget-object v2, v2, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo1View:Landroid/widget/ImageView;
    invoke-static {v2}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$1200(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 438
    iget-object v0, p0, Lcom/facebook/auth/login/j;->b:Lcom/facebook/auth/login/g;

    iget-object v0, v0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo2View:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$1400(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 441
    iget-object v0, p0, Lcom/facebook/auth/login/j;->b:Lcom/facebook/auth/login/g;

    iget-object v0, v0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    iget-object v1, p0, Lcom/facebook/auth/login/j;->a:Ljava/lang/Runnable;

    const-wide/16 v2, 0x177

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 442
    return-void
.end method
