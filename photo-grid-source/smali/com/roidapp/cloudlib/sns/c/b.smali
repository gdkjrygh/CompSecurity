.class public Lcom/roidapp/cloudlib/sns/c/b;
.super Landroid/support/v7/widget/al;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/al",
        "<",
        "Lcom/roidapp/baselib/c/s;",
        ">;"
    }
.end annotation


# instance fields
.field protected a:Landroid/view/View$OnClickListener;

.field private b:[Z


# direct methods
.method public constructor <init>(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Landroid/support/v7/widget/al;-><init>()V

    .line 31
    const/4 v0, 0x2

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/c/b;->b:[Z

    .line 34
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/c/b;->a:Landroid/view/View$OnClickListener;

    .line 35
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 96
    const/4 v0, 0x2

    return v0
.end method

.method public a(I)I
    .locals 1

    .prologue
    .line 89
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 90
    :cond_0
    const/4 v0, 0x0

    .line 91
    :goto_0
    return v0

    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public synthetic a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/bi;
    .locals 1

    .prologue
    .line 25
    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/c/b;->b(Landroid/view/ViewGroup;I)Lcom/roidapp/baselib/c/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Landroid/support/v7/widget/bi;I)V
    .locals 0

    .prologue
    .line 25
    check-cast p1, Lcom/roidapp/baselib/c/s;

    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/c/b;->a(Lcom/roidapp/baselib/c/s;I)V

    return-void
.end method

.method public a(Lcom/roidapp/baselib/c/s;I)V
    .locals 12

    .prologue
    const/4 v9, 0x1

    const-wide/16 v10, 0x1

    .line 60
    sget v0, Lcom/roidapp/cloudlib/ar;->d:I

    invoke-virtual {p1, v0}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 61
    sget v0, Lcom/roidapp/cloudlib/ar;->c:I

    invoke-virtual {p1, v0}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    .line 62
    sget v0, Lcom/roidapp/cloudlib/ar;->e:I

    invoke-virtual {p1, v0}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 63
    if-nez p2, :cond_2

    .line 64
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/b;->b:[Z

    aget-boolean v0, v0, p2

    if-nez v0, :cond_0

    .line 65
    iget-object v0, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    const-string v0, "SNS"

    const-string v1, "show"

    const-string v2, "SNS/PopularPost/Show/"

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "show"

    const-string v4, "SNS/PopularPost/Show/"

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 67
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/b;->b:[Z

    aput-boolean v9, v0, p2

    .line 69
    :cond_0
    iget-object v0, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->C:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 70
    sget v0, Lcom/roidapp/cloudlib/aq;->N:I

    invoke-static {v6, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 71
    sget v0, Lcom/roidapp/cloudlib/aq;->P:I

    invoke-static {v7, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 72
    sget v0, Lcom/roidapp/cloudlib/at;->A:I

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(I)V

    .line 85
    :cond_1
    :goto_0
    return-void

    .line 74
    :cond_2
    if-ne p2, v9, :cond_1

    .line 75
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/b;->b:[Z

    aget-boolean v0, v0, p2

    if-nez v0, :cond_3

    .line 76
    iget-object v0, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    const-string v0, "SNS"

    const-string v1, "show"

    const-string v2, "SNS/PopularUser/Show/"

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "show"

    const-string v4, "SNS/PopularUser/Show/"

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 78
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/b;->b:[Z

    aput-boolean v9, v0, p2

    .line 80
    :cond_3
    iget-object v0, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->w:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 81
    sget v0, Lcom/roidapp/cloudlib/aq;->M:I

    invoke-static {v6, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 82
    sget v0, Lcom/roidapp/cloudlib/aq;->O:I

    invoke-static {v7, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 83
    sget v0, Lcom/roidapp/cloudlib/at;->B:I

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0
.end method

.method public b(Landroid/view/ViewGroup;I)Lcom/roidapp/baselib/c/s;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 39
    if-nez p2, :cond_0

    .line 40
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->j:I

    invoke-virtual {v0, v1, p1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 41
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/c/b;->a:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 43
    const/4 v2, 0x1

    new-array v2, v2, [I

    const v3, 0x10100a7

    aput v3, v2, v5

    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    const/high16 v4, 0x33000000

    invoke-direct {v3, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 44
    new-array v2, v5, [I

    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v3, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 45
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 47
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/high16 v3, 0x40800000    # 4.0f

    invoke-static {v2, v3}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v2

    sub-int/2addr v1, v2

    .line 48
    int-to-float v2, v1

    const v3, 0x3fb33333    # 1.4f

    div-float/2addr v2, v3

    float-to-int v2, v2

    .line 49
    sget v3, Lcom/roidapp/cloudlib/ar;->d:I

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 50
    iput v1, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 51
    iput v2, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 52
    new-instance v1, Lcom/roidapp/baselib/c/s;

    invoke-direct {v1, v0}, Lcom/roidapp/baselib/c/s;-><init>(Landroid/view/View;)V

    return-object v1

    .line 55
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Illegal view type : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(I)Z
    .locals 1

    .prologue
    .line 100
    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
