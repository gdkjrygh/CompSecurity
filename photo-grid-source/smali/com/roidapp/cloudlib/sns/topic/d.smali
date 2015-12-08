.class public final Lcom/roidapp/cloudlib/sns/topic/d;
.super Lcom/roidapp/cloudlib/sns/topic/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/topic/a",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/w;",
        "Lcom/roidapp/cloudlib/sns/b/n;",
        ">;"
    }
.end annotation


# instance fields
.field private final j:I


# direct methods
.method public constructor <init>(Landroid/support/v4/app/Fragment;Landroid/view/View$OnClickListener;)V
    .locals 2

    .prologue
    .line 46
    const/4 v0, 0x2

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/cloudlib/sns/topic/a;-><init>(Landroid/support/v4/app/Fragment;Landroid/view/View$OnClickListener;I)V

    .line 47
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->j:I

    .line 48
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 179
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 180
    const/4 v0, 0x0

    .line 188
    :goto_0
    return v0

    .line 183
    :cond_0
    const/4 v1, 0x2

    .line 184
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 186
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public final a(I)I
    .locals 3

    .prologue
    const/16 v1, 0x15

    .line 52
    packed-switch p1, :pswitch_data_0

    .line 63
    const/16 v0, 0x14

    :goto_0
    return v0

    .line 54
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->a:Lcom/roidapp/cloudlib/sns/b/d;

    if-eqz v0, :cond_0

    const/16 v0, 0x10

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_0

    .line 56
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v0

    const/4 v2, 0x5

    if-ne v0, v2, :cond_1

    const/16 v0, 0x13

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0

    .line 61
    :pswitch_2
    const/16 v0, 0x12

    goto :goto_0

    .line 52
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final synthetic a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/bi;
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, -0x2

    .line 36
    .line 4069
    packed-switch p2, :pswitch_data_0

    .line 4093
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->ag:I

    invoke-virtual {v0, v1, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 4094
    new-instance v0, Lcom/roidapp/baselib/c/s;

    invoke-direct {v0, v1, p2}, Lcom/roidapp/baselib/c/s;-><init>(Landroid/view/View;I)V

    .line 4090
    :goto_0
    return-object v0

    .line 4071
    :pswitch_1
    new-instance v0, Lcom/roidapp/baselib/c/s;

    new-instance v1, Lcom/roidapp/baselib/view/SpaceCompat;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/d;->c:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/roidapp/baselib/view/SpaceCompat;-><init>(Landroid/content/Context;)V

    const/16 v2, 0x15

    invoke-direct {v0, v1, v2}, Lcom/roidapp/baselib/c/s;-><init>(Landroid/view/View;I)V

    goto :goto_0

    .line 4074
    :pswitch_2
    new-instance v0, Lcom/roidapp/baselib/c/s;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/d;->c:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/as;->X:I

    invoke-virtual {v1, v2, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Lcom/roidapp/baselib/c/s;-><init>(Landroid/view/View;I)V

    goto :goto_0

    .line 4078
    :pswitch_3
    new-instance v0, Lcom/roidapp/baselib/c/s;

    new-instance v1, Lcom/roidapp/cloudlib/sns/topic/m;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/d;->c:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/roidapp/cloudlib/sns/topic/m;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1, p2}, Lcom/roidapp/baselib/c/s;-><init>(Landroid/view/View;I)V

    goto :goto_0

    .line 4081
    :pswitch_4
    new-instance v1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4082
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v0, v2}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v0

    .line 4083
    new-instance v2, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 4084
    mul-int/lit8 v3, v0, 0x2

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 4085
    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 4086
    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 4087
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4088
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->c:Landroid/content/Context;

    sget v2, Lcom/roidapp/cloudlib/at;->aF:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4089
    const/4 v0, 0x2

    const/high16 v2, 0x41900000    # 18.0f

    invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 4090
    new-instance v0, Lcom/roidapp/baselib/c/s;

    invoke-direct {v0, v1}, Lcom/roidapp/baselib/c/s;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 4069
    nop

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final synthetic a(Ljava/lang/Object;)Lcom/bumptech/glide/e;
    .locals 3

    .prologue
    .line 36
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/n;

    .line 2222
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/o;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/d;->g()Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/c;->a()Lcom/bumptech/glide/c;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/cloudlib/sns/topic/d;->e:I

    iget v2, p0, Lcom/roidapp/cloudlib/sns/topic/d;->e:I

    invoke-virtual {v0, v1, v2}, Lcom/bumptech/glide/c;->b(II)Lcom/bumptech/glide/c;

    move-result-object v0

    .line 36
    return-object v0
.end method

.method public final synthetic a(Landroid/support/v7/widget/bi;I)V
    .locals 7

    .prologue
    const/4 v5, 0x0

    .line 36
    check-cast p1, Lcom/roidapp/baselib/c/s;

    .line 3100
    iget v0, p1, Lcom/roidapp/baselib/c/s;->j:I

    packed-switch v0, :pswitch_data_0

    .line 3147
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 3102
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->a:Lcom/roidapp/cloudlib/sns/b/d;

    if-eqz v0, :cond_0

    .line 3103
    sget v0, Lcom/roidapp/cloudlib/ar;->bp:I

    invoke-virtual {p1, v0}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 3104
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/d;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v1}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v2

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v1, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/w;->a:Lcom/roidapp/cloudlib/sns/b/d;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/d;->b:Ljava/lang/String;

    invoke-virtual {v2, v1}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v1

    sget-object v2, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v1

    new-instance v2, Lcom/roidapp/cloudlib/sns/e/b;

    invoke-direct {v2, v0}, Lcom/roidapp/cloudlib/sns/e/b;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    .line 3111
    sget v0, Lcom/roidapp/cloudlib/ar;->cZ:I

    invoke-virtual {p1, v0}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/topic/TriangleView;

    .line 3112
    sget v1, Lcom/roidapp/cloudlib/ar;->bq:I

    invoke-virtual {p1, v1}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 3113
    invoke-virtual {v1}, Landroid/widget/TextView;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 3114
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v3, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/w;->a:Lcom/roidapp/cloudlib/sns/b/d;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/d;->d:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    const/4 v3, 0x1

    .line 3115
    :goto_1
    if-eqz v3, :cond_7

    .line 3116
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v3, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/w;->a:Lcom/roidapp/cloudlib/sns/b/d;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/d;->i:[I

    if-eqz v3, :cond_2

    .line 3117
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v3, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/w;->a:Lcom/roidapp/cloudlib/sns/b/d;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/d;->h:Lcom/roidapp/cloudlib/sns/b/e;

    sget-object v4, Lcom/roidapp/cloudlib/sns/b/e;->b:Lcom/roidapp/cloudlib/sns/b/e;

    if-ne v3, v4, :cond_4

    .line 3118
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v3, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/w;->a:Lcom/roidapp/cloudlib/sns/b/d;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/d;->i:[I

    aget v3, v3, v5

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 3134
    :cond_1
    :goto_2
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v3, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/w;->a:Lcom/roidapp/cloudlib/sns/b/d;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/d;->i:[I

    aget v3, v3, v5

    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->a(I)V

    .line 3136
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->a:Lcom/roidapp/cloudlib/sns/b/d;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/d;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3137
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    :cond_3
    move v3, v5

    .line 3114
    goto :goto_1

    .line 3119
    :cond_4
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v3, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/w;->a:Lcom/roidapp/cloudlib/sns/b/d;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/d;->h:Lcom/roidapp/cloudlib/sns/b/e;

    sget-object v4, Lcom/roidapp/cloudlib/sns/b/e;->a:Lcom/roidapp/cloudlib/sns/b/e;

    if-ne v3, v4, :cond_1

    .line 3120
    invoke-static {}, Lcom/roidapp/baselib/c/n;->g()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 3121
    invoke-virtual {v2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 3122
    instance-of v4, v3, Landroid/graphics/drawable/GradientDrawable;

    if-nez v4, :cond_5

    .line 3123
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    sget-object v6, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v3, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/w;->a:Lcom/roidapp/cloudlib/sns/b/d;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/d;->i:[I

    invoke-direct {v4, v6, v3}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 3126
    :cond_5
    check-cast v3, Landroid/graphics/drawable/GradientDrawable;

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v4, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v4, v4, Lcom/roidapp/cloudlib/sns/b/w;->a:Lcom/roidapp/cloudlib/sns/b/d;

    iget-object v4, v4, Lcom/roidapp/cloudlib/sns/b/d;->i:[I

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    goto :goto_2

    .line 3130
    :cond_6
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    sget-object v6, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v3, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/w;->a:Lcom/roidapp/cloudlib/sns/b/d;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/d;->i:[I

    invoke-direct {v4, v6, v3}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 3131
    invoke-virtual {v2, v4}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 3140
    :cond_7
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    .line 3146
    :pswitch_2
    iget-object v0, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    check-cast v0, Lcom/roidapp/cloudlib/sns/topic/m;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/d;->b:Landroid/support/v4/app/Fragment;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v1, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/d;->h:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2, v1, v3}, Lcom/roidapp/cloudlib/sns/topic/m;->a(Landroid/support/v4/app/Fragment;Lcom/roidapp/cloudlib/sns/b/a/e;Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 3150
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    add-int/lit8 v1, p2, -0x3

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/b/a/e;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    .line 3151
    sget v1, Lcom/roidapp/cloudlib/ar;->cP:I

    invoke-virtual {p1, v1}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 3152
    iget-object v2, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 3153
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/d;->e:I

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 3154
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/d;->e:I

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 3155
    iput v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 3156
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/d;->j:I

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 3157
    add-int/lit8 v3, p2, -0x3

    iget v4, p0, Lcom/roidapp/cloudlib/sns/topic/d;->f:I

    rem-int/2addr v3, v4

    packed-switch v3, :pswitch_data_1

    .line 3166
    :goto_3
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/d;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v2}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v2

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/o;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/d;->g()Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v2

    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/d;->e:I

    iget v4, p0, Lcom/roidapp/cloudlib/sns/topic/d;->e:I

    invoke-virtual {v2, v3, v4}, Lcom/bumptech/glide/c;->b(II)Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 3172
    iget-object v1, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/cloudlib/sns/topic/d;->a(Landroid/view/View;Lcom/roidapp/cloudlib/sns/b/n;)V

    goto/16 :goto_0

    .line 3159
    :pswitch_4
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/d;->j:I

    div-int/lit8 v3, v3, 0x2

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_3

    .line 3163
    :pswitch_5
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/d;->j:I

    div-int/lit8 v3, v3, 0x2

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    goto :goto_3

    .line 3100
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch

    .line 3157
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public final bridge synthetic b()[I
    .locals 3

    .prologue
    .line 36
    .line 1231
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    iget v2, p0, Lcom/roidapp/cloudlib/sns/topic/d;->e:I

    aput v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/roidapp/cloudlib/sns/topic/d;->e:I

    aput v2, v0, v1

    .line 36
    return-object v0
.end method

.method public final c(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/n;",
            ">;"
        }
    .end annotation

    .prologue
    .line 198
    iget v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->i:I

    sub-int v0, p1, v0

    add-int/lit8 v0, v0, 0x1

    .line 199
    if-gez v0, :cond_0

    .line 200
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->a:Ljava/util/List;

    .line 214
    :goto_0
    return-object v0

    .line 203
    :cond_0
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/topic/d;->a(I)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 214
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->a:Ljava/util/List;

    goto :goto_0

    .line 205
    :pswitch_0
    const/4 v1, 0x0

    add-int/lit8 v0, v0, -0x3

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 206
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 207
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/d;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/b/a/e;->subList(II)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 203
    nop

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
    .end packed-switch
.end method

.method public final e(I)Z
    .locals 1

    .prologue
    .line 193
    const/16 v0, 0x14

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
