.class public final Lcom/roidapp/cloudlib/sns/c/a;
.super Lcom/roidapp/cloudlib/sns/c/b;
.source "SourceFile"


# instance fields
.field private b:Landroid/support/v4/app/Fragment;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/u;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/roidapp/baselib/c/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/baselib/c/x",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/support/v4/app/Fragment;Landroid/view/View$OnClickListener;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0, p2}, Lcom/roidapp/cloudlib/sns/c/b;-><init>(Landroid/view/View$OnClickListener;)V

    .line 47
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/c/a;->b:Landroid/support/v4/app/Fragment;

    .line 48
    return-void
.end method

.method private e()I
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/a;->d:Lcom/roidapp/baselib/c/x;

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/c/b;->a()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    :goto_0
    return v0

    :cond_0
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/c/b;->a()I

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public final a()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 193
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/a;->d:Lcom/roidapp/baselib/c/x;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 194
    :goto_0
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/c/a;->c:Ljava/util/List;

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/c/a;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 195
    :cond_0
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/c/b;->a()I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    return v0

    :cond_1
    move v0, v1

    .line 193
    goto :goto_0
.end method

.method public final a(I)I
    .locals 2

    .prologue
    .line 175
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/c/b;->a(I)I

    move-result v0

    .line 176
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 177
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/a;->d:Lcom/roidapp/baselib/c/x;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/a;->d:Lcom/roidapp/baselib/c/x;

    iget-object v0, v0, Lcom/roidapp/baselib/c/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p1, :cond_1

    .line 178
    const/4 v0, 0x3

    .line 188
    :cond_0
    :goto_0
    return v0

    .line 181
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/c/a;->e()I

    move-result v0

    sub-int v0, p1, v0

    .line 182
    if-nez v0, :cond_2

    .line 183
    const/4 v0, 0x2

    goto :goto_0

    .line 185
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final synthetic a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/bi;
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/c/a;->b(Landroid/view/ViewGroup;I)Lcom/roidapp/baselib/c/s;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a(Landroid/support/v7/widget/bi;I)V
    .locals 0

    .prologue
    .line 35
    check-cast p1, Lcom/roidapp/baselib/c/s;

    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/c/a;->a(Lcom/roidapp/baselib/c/s;I)V

    return-void
.end method

.method public final a(Lcom/roidapp/baselib/c/s;I)V
    .locals 12

    .prologue
    const-wide/16 v10, 0x1

    const/16 v9, 0x64

    const/16 v8, 0x8

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 106
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/c/b;->a()I

    move-result v0

    if-ge p2, v0, :cond_1

    .line 107
    invoke-super {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/c/b;->a(Lcom/roidapp/baselib/c/s;I)V

    .line 171
    :cond_0
    :goto_0
    return-void

    .line 110
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/a;->d:Lcom/roidapp/baselib/c/x;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/a;->d:Lcom/roidapp/baselib/c/x;

    iget-object v0, v0, Lcom/roidapp/baselib/c/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p2, :cond_3

    .line 111
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/a;->d:Lcom/roidapp/baselib/c/x;

    iget-object v0, v0, Lcom/roidapp/baselib/c/x;->b:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 112
    sget v1, Lcom/roidapp/cloudlib/ar;->F:I

    invoke-virtual {p1, v1}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v4

    .line 113
    sget v1, Lcom/roidapp/cloudlib/ar;->H:I

    invoke-virtual {p1, v1}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 114
    sget v2, Lcom/roidapp/cloudlib/ar;->D:I

    invoke-virtual {p1, v2}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 115
    sget v3, Lcom/roidapp/cloudlib/ar;->I:I

    invoke-virtual {p1, v3}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ProgressBar;

    .line 117
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->d()I

    move-result v5

    if-ne v5, v9, :cond_2

    .line 118
    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    .line 119
    sget v4, Lcom/roidapp/cloudlib/at;->V:I

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(I)V

    .line 120
    sget v2, Lcom/roidapp/cloudlib/at;->an:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 121
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 122
    invoke-virtual {v3, v8}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 125
    :cond_2
    sget v1, Lcom/roidapp/cloudlib/ar;->E:I

    invoke-virtual {p1, v1}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 126
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/c/a;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v2}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v2

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 132
    sget v1, Lcom/roidapp/cloudlib/ar;->G:I

    invoke-virtual {p1, v1}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v1

    .line 133
    invoke-virtual {v1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 134
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/c/a;->a:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    invoke-virtual {v1}, Landroid/view/View;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->d()I

    move-result v0

    if-ne v0, v9, :cond_0

    .line 136
    invoke-virtual {v1, v7}, Landroid/view/View;->setEnabled(Z)V

    goto/16 :goto_0

    .line 140
    :cond_3
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/c/a;->e()I

    move-result v0

    sub-int v0, p2, v0

    .line 141
    if-eqz v0, :cond_0

    .line 142
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/c/a;->c:Ljava/util/List;

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/roidapp/cloudlib/sns/b/u;

    .line 144
    iget-object v0, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v0

    .line 146
    new-instance v1, Lcom/roidapp/baselib/view/w;

    iget v2, v4, Lcom/roidapp/cloudlib/sns/b/u;->g:I

    invoke-direct {v1, v2}, Lcom/roidapp/baselib/view/w;-><init>(I)V

    .line 147
    int-to-float v2, v0

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/view/w;->a(F)V

    .line 148
    invoke-virtual {v1}, Lcom/roidapp/baselib/view/w;->a()V

    .line 149
    iget-object v2, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 152
    new-instance v1, Lcom/roidapp/baselib/view/w;

    const/high16 v2, 0x33000000

    invoke-direct {v1, v2}, Lcom/roidapp/baselib/view/w;-><init>(I)V

    .line 153
    int-to-float v0, v0

    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/view/w;->a(F)V

    .line 154
    invoke-virtual {v1}, Lcom/roidapp/baselib/view/w;->a()V

    .line 155
    new-instance v2, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 156
    new-array v0, v7, [I

    const v3, 0x10100a7

    aput v3, v0, v6

    invoke-virtual {v2, v0, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 157
    new-array v0, v6, [I

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v6}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v2, v0, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 158
    iget-object v0, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 163
    iget-object v0, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-virtual {v0, v6}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 164
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "#"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v4, Lcom/roidapp/cloudlib/sns/b/u;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    iget-object v0, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    iget-object v2, v4, Lcom/roidapp/cloudlib/sns/b/u;->a:Ljava/lang/String;

    aput-object v2, v1, v6

    iget v2, v4, Lcom/roidapp/cloudlib/sns/b/u;->g:I

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v7

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 166
    iget-object v0, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    const-string v0, "SNS"

    const-string v1, "show"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SNS/PopularTags/Show/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v4, Lcom/roidapp/cloudlib/sns/b/u;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "show"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "SNS/PopularTags/Show/"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v4, Lcom/roidapp/cloudlib/sns/b/u;->a:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    goto/16 :goto_0
.end method

.method public final a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 2

    .prologue
    .line 63
    new-instance v0, Lcom/roidapp/baselib/c/x;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/roidapp/baselib/c/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/c/a;->d:Lcom/roidapp/baselib/c/x;

    .line 64
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/u;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 67
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/c/a;->c:Ljava/util/List;

    .line 68
    return-void
.end method

.method public final b(Landroid/view/ViewGroup;I)Lcom/roidapp/baselib/c/s;
    .locals 4

    .prologue
    const/4 v2, 0x0

    const/4 v3, -0x2

    .line 78
    packed-switch p2, :pswitch_data_0

    .line 101
    invoke-super {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/c/b;->b(Landroid/view/ViewGroup;I)Lcom/roidapp/baselib/c/s;

    move-result-object v0

    :goto_0
    return-object v0

    .line 80
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->l:I

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 81
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/c/a;->a:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 82
    new-instance v1, Lcom/roidapp/baselib/c/s;

    invoke-direct {v1, v0}, Lcom/roidapp/baselib/c/s;-><init>(Landroid/view/View;)V

    move-object v0, v1

    goto :goto_0

    .line 85
    :pswitch_1
    new-instance v1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 86
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v0, v2}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v0

    .line 87
    new-instance v2, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 88
    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 89
    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 90
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 91
    sget v0, Lcom/roidapp/cloudlib/at;->C:I

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 92
    const/4 v0, 0x2

    const/high16 v2, 0x41900000    # 18.0f

    invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 93
    new-instance v0, Lcom/roidapp/baselib/c/s;

    invoke-direct {v0, v1}, Lcom/roidapp/baselib/c/s;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 96
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->m:I

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 98
    new-instance v0, Lcom/roidapp/baselib/c/s;

    invoke-direct {v0, v1}, Lcom/roidapp/baselib/c/s;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 78
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final d()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 51
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/a;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 54
    :cond_0
    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/c/a;->d:Lcom/roidapp/baselib/c/x;

    .line 55
    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/c/a;->c:Ljava/util/List;

    .line 59
    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/c/a;->a:Landroid/view/View$OnClickListener;

    .line 60
    return-void
.end method

.method public final e(I)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 200
    if-eq v0, p1, :cond_0

    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/c/b;->e(I)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
