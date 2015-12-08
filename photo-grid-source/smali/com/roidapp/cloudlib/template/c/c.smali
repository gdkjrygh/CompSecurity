.class public final Lcom/roidapp/cloudlib/template/c/c;
.super Lcom/roidapp/cloudlib/template/c/f;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/view/u;


# instance fields
.field private h:Lcom/roidapp/baselib/view/r;

.field private i:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/roidapp/cloudlib/template/c/f;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a(Landroid/view/View;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, -0x1

    .line 37
    new-instance v2, Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/c;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {v2, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 38
    new-instance v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v5, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(II)V

    .line 40
    invoke-virtual {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->a()V

    .line 41
    invoke-virtual {v2, v0}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->aV:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 43
    const/4 v0, 0x2

    const/high16 v1, 0x41980000    # 19.0f

    invoke-virtual {v2, v0, v1}, Landroid/widget/Button;->setTextSize(IF)V

    .line 44
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/ao;->e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setTextColor(I)V

    .line 45
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/aq;->H:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 46
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/ap;->d:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setHeight(I)V

    .line 47
    new-instance v0, Lcom/roidapp/cloudlib/template/c/d;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/template/c/d;-><init>(Lcom/roidapp/cloudlib/template/c/c;)V

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/c;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->aa:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 56
    new-instance v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/c;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/high16 v4, 0x42000000    # 32.0f

    invoke-static {v1, v4}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v1

    iget v4, p0, Lcom/roidapp/cloudlib/template/c/c;->g:I

    add-int/2addr v1, v4

    invoke-direct {v0, v5, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(II)V

    .line 59
    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 60
    invoke-virtual {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->a()V

    .line 61
    invoke-virtual {v3, v6}, Landroid/view/View;->setClickable(Z)V

    .line 63
    new-instance v4, Lcom/roidapp/cloudlib/template/c/e;

    invoke-direct {v4, p0}, Lcom/roidapp/cloudlib/template/c/e;-><init>(Lcom/roidapp/cloudlib/template/c/c;)V

    .line 72
    sget v0, Lcom/roidapp/cloudlib/ar;->cw:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 73
    sget v1, Lcom/roidapp/cloudlib/ar;->ct:I

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 74
    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    invoke-virtual {v0, v6}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    .line 76
    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/template/c/f;->a(Landroid/view/View;)V

    .line 79
    new-instance v0, Lcom/roidapp/baselib/c/y;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/c;->a:Lcom/roidapp/cloudlib/template/a/e;

    invoke-direct {v0, v1}, Lcom/roidapp/baselib/c/y;-><init>(Landroid/support/v7/widget/al;)V

    .line 80
    invoke-virtual {v0, v3}, Lcom/roidapp/baselib/c/y;->a(Landroid/view/View;)V

    .line 81
    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/c/y;->b(Landroid/view/View;)V

    .line 82
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/c;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/al;)V

    .line 84
    return-void
.end method

.method public final b(II)V
    .locals 3

    .prologue
    .line 88
    if-ltz p2, :cond_0

    .line 89
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/c;->e:Landroid/os/Handler;

    const/16 v1, 0x2322

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/c/c;->a:Lcom/roidapp/cloudlib/template/a/e;

    invoke-virtual {v2, p2}, Lcom/roidapp/cloudlib/template/a/e;->e(I)Lcom/roidapp/cloudlib/template/TemplateInfo;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/template/c/c;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    .line 91
    :cond_0
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    .line 95
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->cy:I

    if-ne v0, v1, :cond_1

    .line 96
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 97
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/c;->a:Lcom/roidapp/cloudlib/template/a/e;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/a/e;->e(I)Lcom/roidapp/cloudlib/template/TemplateInfo;

    move-result-object v1

    .line 98
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/roidapp/cloudlib/template/j;->a(J)Z

    move-result v1

    if-nez v1, :cond_0

    .line 99
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/c;->h:Lcom/roidapp/baselib/view/r;

    sget v2, Lcom/roidapp/cloudlib/ar;->cy:I

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iget v3, p0, Lcom/roidapp/cloudlib/template/c/c;->i:I

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/roidapp/baselib/view/r;->a(Landroid/view/View;III)V

    .line 106
    :cond_0
    :goto_0
    return-void

    .line 104
    :cond_1
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/template/c/f;->onClick(Landroid/view/View;)V

    goto :goto_0
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    .line 29
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/ap;->c:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    neg-int v0, v0

    iput v0, p0, Lcom/roidapp/cloudlib/template/c/c;->i:I

    .line 30
    new-instance v0, Lcom/roidapp/baselib/view/r;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/c;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    sget v4, Lcom/roidapp/cloudlib/at;->v:I

    invoke-virtual {p0, v4}, Lcom/roidapp/cloudlib/template/c/c;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-direct {v0, v1, v2}, Lcom/roidapp/baselib/view/r;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/c/c;->h:Lcom/roidapp/baselib/view/r;

    .line 31
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/c;->h:Lcom/roidapp/baselib/view/r;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/view/r;->a(Lcom/roidapp/baselib/view/u;)V

    .line 32
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/cloudlib/template/c/f;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
