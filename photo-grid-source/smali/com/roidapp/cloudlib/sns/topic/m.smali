.class final Lcom/roidapp/cloudlib/sns/topic/m;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# instance fields
.field private final a:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    .prologue
    const/4 v3, -0x2

    const/4 v1, 0x0

    const/4 v7, -0x1

    .line 33
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 30
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/m;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v0, v2}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/topic/m;->a:I

    .line 35
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v7, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/topic/m;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 36
    new-instance v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/m;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 37
    new-instance v2, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 38
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/m;->a:I

    mul-int/lit8 v3, v3, 0x4

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 39
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/m;->a:I

    mul-int/lit8 v3, v3, 0x2

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 40
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/m;->a:I

    mul-int/lit8 v3, v3, 0x2

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 41
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    sget v2, Lcom/roidapp/cloudlib/at;->aQ:I

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    const/4 v2, 0x2

    const/high16 v3, 0x41900000    # 18.0f

    invoke-virtual {v0, v2, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 44
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/topic/m;->addView(Landroid/view/View;)V

    move v0, v1

    .line 46
    :goto_0
    const/4 v2, 0x5

    if-ge v0, v2, :cond_0

    .line 47
    new-instance v2, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/m;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 48
    new-instance v3, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v3, v7, v7}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    new-instance v3, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 50
    const/4 v4, 0x1

    new-array v4, v4, [I

    const v5, 0x10100a7

    aput v5, v4, v1

    new-instance v5, Landroid/graphics/drawable/ColorDrawable;

    const v6, -0x5fc69314

    invoke-direct {v5, v6}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v3, v4, v5}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 51
    new-array v4, v1, [I

    new-instance v5, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v5, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v3, v4, v5}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 52
    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 54
    new-instance v3, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/m;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 55
    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 56
    new-instance v4, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v4, v7, v7}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 57
    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 59
    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/sns/topic/m;->addView(Landroid/view/View;)V

    .line 46
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 61
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/support/v4/app/Fragment;Lcom/roidapp/cloudlib/sns/b/a/e;Landroid/view/View$OnClickListener;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 64
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v0

    const/4 v1, 0x5

    if-ge v0, v1, :cond_1

    .line 90
    :cond_0
    return-void

    :cond_1
    move v3, v4

    .line 68
    :goto_0
    invoke-virtual {p2}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 69
    invoke-virtual {p2, v3}, Lcom/roidapp/cloudlib/sns/b/a/e;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    .line 70
    add-int/lit8 v1, v3, 0x1

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/sns/topic/m;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    .line 71
    invoke-virtual {v1, v4}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 72
    invoke-virtual {v1, p3}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 74
    if-nez v3, :cond_2

    .line 75
    invoke-static {p1}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v1

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/o;->f:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/d;->g()Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 68
    :goto_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 83
    :cond_2
    invoke-static {p1}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v1

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/o;->e:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/d;->g()Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    goto :goto_1
.end method

.method protected final onLayout(ZIIII)V
    .locals 12

    .prologue
    .line 174
    const/4 v2, 0x0

    .line 175
    const/4 v1, 0x0

    .line 177
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/m;->getChildCount()I

    move-result v4

    .line 178
    const/4 v0, 0x0

    move v3, v0

    :goto_0
    if-ge v3, v4, :cond_5

    .line 179
    invoke-virtual {p0, v3}, Lcom/roidapp/cloudlib/sns/topic/m;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 180
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 181
    instance-of v6, v5, Landroid/widget/TextView;

    if-eqz v6, :cond_0

    .line 182
    iget v6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v7, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    iget v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v8, v9

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    iget v10, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v9, v10

    iget v10, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v9, v10

    invoke-virtual {v5, v6, v7, v8, v9}, Landroid/view/View;->layout(IIII)V

    .line 184
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    iget v6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v5, v6

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v0, v5

    add-int/2addr v0, v2

    move v11, v1

    move v1, v0

    move v0, v11

    .line 178
    :goto_1
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move v2, v1

    move v1, v0

    goto :goto_0

    .line 187
    :cond_0
    const/4 v6, 0x1

    if-eq v3, v6, :cond_1

    const/4 v6, 0x4

    if-ne v3, v6, :cond_2

    .line 188
    :cond_1
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v6, v2

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    add-int/2addr v8, v2

    invoke-virtual {v5, v1, v6, v7, v8}, Landroid/view/View;->layout(IIII)V

    .line 190
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v1, v5

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, v1

    move v1, v2

    goto :goto_1

    .line 192
    :cond_2
    const/4 v6, 0x2

    if-eq v3, v6, :cond_3

    const/4 v6, 0x3

    if-ne v3, v6, :cond_4

    .line 193
    :cond_3
    iget v6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v6, v1

    iget v7, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v7, v2

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    add-int/2addr v8, v1

    iget v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v8, v9

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    add-int/2addr v9, v2

    iget v10, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v9, v10

    invoke-virtual {v5, v6, v7, v8, v9}, Landroid/view/View;->layout(IIII)V

    .line 197
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    iget v6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v5, v6

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v0, v5

    add-int/2addr v0, v2

    move v11, v1

    move v1, v0

    move v0, v11

    goto :goto_1

    .line 200
    :cond_4
    iget v6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v6, v1

    iget v7, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v7, v2

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    add-int/2addr v8, v1

    iget v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v8, v9

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    add-int/2addr v9, v2

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v0, v9

    invoke-virtual {v5, v6, v7, v8, v0}, Landroid/view/View;->layout(IIII)V

    move v0, v1

    move v1, v2

    goto :goto_1

    .line 207
    :cond_5
    return-void
.end method

.method protected final onMeasure(II)V
    .locals 13

    .prologue
    const/4 v12, 0x4

    const/high16 v11, 0x40000000    # 2.0f

    const/4 v3, 0x0

    .line 95
    .line 97
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 98
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 99
    sparse-switch v0, :sswitch_data_0

    move v1, v3

    .line 106
    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/m;->getChildCount()I

    move-result v6

    move v5, v3

    move v4, v3

    .line 107
    :goto_1
    if-ge v5, v6, :cond_5

    .line 108
    invoke-virtual {p0, v5}, Lcom/roidapp/cloudlib/sns/topic/m;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    .line 109
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 110
    instance-of v8, v7, Landroid/widget/TextView;

    if-eqz v8, :cond_0

    .line 111
    invoke-virtual {p0, v7, p1, p2}, Lcom/roidapp/cloudlib/sns/topic/m;->measureChild(Landroid/view/View;II)V

    .line 112
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v7, v8

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v0, v7

    add-int/2addr v0, v4

    .line 107
    :goto_2
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    move v4, v0

    goto :goto_1

    :sswitch_0
    move v1, v2

    .line 102
    goto :goto_0

    .line 115
    :cond_0
    const/4 v8, 0x1

    if-ne v5, v8, :cond_1

    .line 116
    mul-int/lit8 v8, v1, 0x2

    div-int/lit8 v8, v8, 0x3

    .line 118
    iget v9, p0, Lcom/roidapp/cloudlib/sns/topic/m;->a:I

    div-int/lit8 v9, v9, 0x2

    iput v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 119
    iget v9, p0, Lcom/roidapp/cloudlib/sns/topic/m;->a:I

    div-int/lit8 v9, v9, 0x2

    iput v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 120
    iget v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int v9, v8, v9

    iget v10, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v9, v10

    invoke-static {v3, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 121
    iget v10, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v8, v10

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int v0, v8, v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 122
    invoke-static {v9, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    invoke-static {v0, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p0, v7, v8, v0}, Lcom/roidapp/cloudlib/sns/topic/m;->measureChild(Landroid/view/View;II)V

    .line 124
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int/2addr v0, v4

    .line 125
    goto :goto_2

    .line 126
    :cond_1
    const/4 v8, 0x2

    if-ne v5, v8, :cond_2

    .line 127
    div-int/lit8 v8, v2, 0x3

    .line 129
    iget v9, p0, Lcom/roidapp/cloudlib/sns/topic/m;->a:I

    div-int/lit8 v9, v9, 0x2

    iput v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 130
    iget v9, p0, Lcom/roidapp/cloudlib/sns/topic/m;->a:I

    div-int/lit8 v9, v9, 0x2

    iput v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 131
    iget v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int v9, v8, v9

    iget v10, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v9, v10

    invoke-static {v3, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 132
    iget v10, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v8, v10

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int v0, v8, v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 133
    invoke-static {v9, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    invoke-static {v0, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p0, v7, v8, v0}, Lcom/roidapp/cloudlib/sns/topic/m;->measureChild(Landroid/view/View;II)V

    move v0, v4

    .line 135
    goto :goto_2

    .line 136
    :cond_2
    const/4 v8, 0x3

    if-ne v5, v8, :cond_3

    .line 137
    div-int/lit8 v8, v2, 0x3

    .line 139
    iget v9, p0, Lcom/roidapp/cloudlib/sns/topic/m;->a:I

    div-int/lit8 v9, v9, 0x2

    iput v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 140
    iget v9, p0, Lcom/roidapp/cloudlib/sns/topic/m;->a:I

    div-int/lit8 v9, v9, 0x2

    iput v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 141
    iget v9, p0, Lcom/roidapp/cloudlib/sns/topic/m;->a:I

    div-int/lit8 v9, v9, 0x2

    iput v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 142
    iget v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int v9, v8, v9

    iget v10, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v9, v10

    invoke-static {v3, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 143
    iget v10, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v8, v10

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int v0, v8, v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 144
    invoke-static {v9, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    invoke-static {v0, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p0, v7, v8, v0}, Lcom/roidapp/cloudlib/sns/topic/m;->measureChild(Landroid/view/View;II)V

    move v0, v4

    .line 146
    goto/16 :goto_2

    .line 148
    :cond_3
    div-int/lit8 v8, v2, 0x2

    .line 150
    if-ne v5, v12, :cond_4

    .line 151
    iget v9, p0, Lcom/roidapp/cloudlib/sns/topic/m;->a:I

    div-int/lit8 v9, v9, 0x2

    iput v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 156
    :goto_3
    iget v9, p0, Lcom/roidapp/cloudlib/sns/topic/m;->a:I

    div-int/lit8 v9, v9, 0x2

    iput v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 157
    iget v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int v9, v8, v9

    iget v10, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v9, v10

    invoke-static {v3, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 158
    iget v10, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v8, v10

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int v0, v8, v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 159
    invoke-static {v9, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    invoke-static {v0, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p0, v7, v8, v0}, Lcom/roidapp/cloudlib/sns/topic/m;->measureChild(Landroid/view/View;II)V

    .line 161
    if-ne v5, v12, :cond_6

    .line 162
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int/2addr v0, v4

    goto/16 :goto_2

    .line 154
    :cond_4
    iget v9, p0, Lcom/roidapp/cloudlib/sns/topic/m;->a:I

    div-int/lit8 v9, v9, 0x2

    iput v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    goto :goto_3

    .line 168
    :cond_5
    invoke-virtual {p0, v1, v4}, Lcom/roidapp/cloudlib/sns/topic/m;->setMeasuredDimension(II)V

    .line 169
    return-void

    :cond_6
    move v0, v4

    goto/16 :goto_2

    .line 99
    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_0
        0x40000000 -> :sswitch_0
    .end sparse-switch
.end method
