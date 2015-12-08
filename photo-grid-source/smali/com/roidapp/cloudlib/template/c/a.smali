.class public final Lcom/roidapp/cloudlib/template/c/a;
.super Lcom/roidapp/cloudlib/template/c/f;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/roidapp/cloudlib/template/c/f;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a(Landroid/view/View;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 35
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->aa:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 36
    new-instance v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    const/4 v1, -0x1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/a;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const/high16 v4, 0x42000000    # 32.0f

    invoke-static {v3, v4}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v3

    iget v4, p0, Lcom/roidapp/cloudlib/template/c/a;->g:I

    add-int/2addr v3, v4

    invoke-direct {v0, v1, v3}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(II)V

    .line 39
    invoke-virtual {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->a()V

    .line 40
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    invoke-virtual {v2, v5}, Landroid/view/View;->setClickable(Z)V

    .line 43
    new-instance v3, Lcom/roidapp/cloudlib/template/c/b;

    invoke-direct {v3, p0}, Lcom/roidapp/cloudlib/template/c/b;-><init>(Lcom/roidapp/cloudlib/template/c/a;)V

    .line 52
    sget v0, Lcom/roidapp/cloudlib/ar;->cw:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 53
    sget v1, Lcom/roidapp/cloudlib/ar;->ct:I

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 54
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    invoke-virtual {v1, v5}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    .line 58
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/a;->d:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->aX:I

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/template/c/a;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->b()Lcom/roidapp/cloudlib/template/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/a;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/a;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/a;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 63
    :cond_0
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/template/c/f;->a(Landroid/view/View;)V

    .line 64
    new-instance v0, Lcom/roidapp/baselib/c/y;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/a;->a:Lcom/roidapp/cloudlib/template/a/e;

    invoke-direct {v0, v1}, Lcom/roidapp/baselib/c/y;-><init>(Landroid/support/v7/widget/al;)V

    .line 65
    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/c/y;->a(Landroid/view/View;)V

    .line 66
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/a;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/al;)V

    .line 67
    return-void
.end method

.method public final c()Lcom/roidapp/cloudlib/template/a/e;
    .locals 2

    .prologue
    .line 22
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/a;->a:Lcom/roidapp/cloudlib/template/a/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/a;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/a;->a:Lcom/roidapp/cloudlib/template/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/a/e;->a()I

    move-result v0

    if-lez v0, :cond_1

    .line 24
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/a;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 30
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/a;->a:Lcom/roidapp/cloudlib/template/a/e;

    return-object v0

    .line 27
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/a;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 71
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->cF:I

    if-ne v0, v1, :cond_0

    .line 72
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 73
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/a;->a:Lcom/roidapp/cloudlib/template/a/e;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/a/e;->e(I)Lcom/roidapp/cloudlib/template/TemplateInfo;

    move-result-object v0

    .line 74
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->b()Lcom/roidapp/cloudlib/template/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/a;->c(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    .line 75
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/a;->e:Landroid/os/Handler;

    const/16 v1, 0x2401

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/template/c/a;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    .line 80
    :goto_0
    return-void

    .line 78
    :cond_0
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/template/c/f;->onClick(Landroid/view/View;)V

    goto :goto_0
.end method
