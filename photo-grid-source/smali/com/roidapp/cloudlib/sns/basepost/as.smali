.class final Lcom/roidapp/cloudlib/sns/basepost/as;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/ar;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/ar;)V
    .locals 0

    .prologue
    .line 857
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/as;->a:Lcom/roidapp/cloudlib/sns/basepost/ar;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 2

    .prologue
    .line 875
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/as;->a:Lcom/roidapp/cloudlib/sns/basepost/ar;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/ar;->c:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->x(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 880
    :goto_0
    return-void

    .line 878
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/as;->a:Lcom/roidapp/cloudlib/sns/basepost/ar;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/ar;->c:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->t(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 879
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/as;->a:Lcom/roidapp/cloudlib/sns/basepost/ar;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/ar;->c:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->aw:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    goto :goto_0
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 857
    .line 1861
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/as;->a:Lcom/roidapp/cloudlib/sns/basepost/ar;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/ar;->c:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->w(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1865
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/as;->a:Lcom/roidapp/cloudlib/sns/basepost/ar;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/ar;->c:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->f(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1866
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/as;->a:Lcom/roidapp/cloudlib/sns/basepost/ar;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/ar;->c:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->g(Lcom/roidapp/cloudlib/sns/basepost/ad;)V

    .line 1868
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/as;->a:Lcom/roidapp/cloudlib/sns/basepost/ar;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/ar;->c:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->t(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1869
    new-instance v0, Lcom/roidapp/cloudlib/sns/basepost/aw;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/aw;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bb;)V

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/as;->a:Lcom/roidapp/cloudlib/sns/basepost/ar;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/basepost/ar;->c:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->ay:I

    sget v3, Lcom/roidapp/cloudlib/at;->ax:I

    sget v4, Lcom/roidapp/cloudlib/at;->f:I

    const/4 v5, -0x1

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/sns/basepost/aw;->a(Landroid/content/Context;IIII)V

    .line 857
    :cond_1
    return-void
.end method
