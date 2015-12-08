.class final Lcom/roidapp/cloudlib/sns/basepost/bn;
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
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/roidapp/cloudlib/sns/b/n;

.field final synthetic c:Lcom/roidapp/cloudlib/sns/basepost/bc;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/bc;Landroid/view/View;Lcom/roidapp/cloudlib/sns/b/n;)V
    .locals 0

    .prologue
    .line 630
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bn;->c:Lcom/roidapp/cloudlib/sns/basepost/bc;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/basepost/bn;->a:Landroid/view/View;

    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/basepost/bn;->b:Lcom/roidapp/cloudlib/sns/b/n;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 660
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bn;->b:Lcom/roidapp/cloudlib/sns/b/n;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/bn;->c:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/basepost/bc;->c(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v2

    sget-object v3, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;Lcom/roidapp/cloudlib/sns/b/c;)V

    .line 661
    return-void
.end method

.method public final b(ILjava/lang/Exception;)V
    .locals 4

    .prologue
    .line 654
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bn;->c:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bn;->c:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->k:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 655
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bn;->b:Lcom/roidapp/cloudlib/sns/b/n;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/bn;->c:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/basepost/bc;->c(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v2

    sget-object v3, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;Lcom/roidapp/cloudlib/sns/b/c;)V

    .line 656
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 630
    .line 1635
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bn;->c:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1636
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bn;->a:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->ai:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1637
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bn;->a:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->aj:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1638
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bn;->c:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->P:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1639
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bn;->c:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/ao;->a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1640
    sget v1, Lcom/roidapp/cloudlib/aq;->K:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 1648
    :cond_0
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bn;->b:Lcom/roidapp/cloudlib/sns/b/n;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/bn;->c:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/basepost/bc;->c(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V

    .line 630
    return-void
.end method
