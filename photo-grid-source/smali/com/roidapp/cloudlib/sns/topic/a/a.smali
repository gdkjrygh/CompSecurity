.class public final Lcom/roidapp/cloudlib/sns/topic/a/a;
.super Lcom/roidapp/cloudlib/sns/topic/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/topic/a",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/e;",
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
    .line 36
    const/4 v0, 0x3

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/cloudlib/sns/topic/a;-><init>(Landroid/support/v4/app/Fragment;Landroid/view/View$OnClickListener;I)V

    .line 37
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 38
    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->j:I

    .line 39
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 185
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->d:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(I)I
    .locals 1

    .prologue
    .line 43
    packed-switch p1, :pswitch_data_0

    .line 49
    const/16 v0, 0x22

    :goto_0
    return v0

    .line 45
    :pswitch_0
    const/16 v0, 0x20

    goto :goto_0

    .line 47
    :pswitch_1
    const/16 v0, 0x21

    goto :goto_0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final synthetic a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/bi;
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 28
    .line 4061
    packed-switch p2, :pswitch_data_0

    .line 4087
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->ag:I

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 4088
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v2, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->e:I

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 4089
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v2, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->e:I

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 4090
    new-instance v0, Lcom/roidapp/baselib/c/s;

    invoke-direct {v0, v1, p2}, Lcom/roidapp/baselib/c/s;-><init>(Landroid/view/View;I)V

    .line 4084
    :goto_0
    return-object v0

    .line 4063
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->ad:I

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 4064
    sget v0, Lcom/roidapp/cloudlib/ar;->cQ:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 4065
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 4066
    iget v2, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->g:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 4067
    iget v2, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->g:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 4068
    new-instance v0, Lcom/roidapp/baselib/c/s;

    invoke-direct {v0, v1, p2}, Lcom/roidapp/baselib/c/s;-><init>(Landroid/view/View;I)V

    goto :goto_0

    .line 4071
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->ae:I

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 4072
    sget v0, Lcom/roidapp/cloudlib/ar;->cR:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 4073
    sget v1, Lcom/roidapp/cloudlib/ar;->cU:I

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 4075
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 4076
    iget v4, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->g:I

    div-int/lit8 v4, v4, 0x2

    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 4077
    iget v4, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->g:I

    div-int/lit8 v4, v4, 0x2

    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 4078
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4080
    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 4081
    iget v2, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->g:I

    div-int/lit8 v2, v2, 0x2

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 4082
    iget v2, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->g:I

    div-int/lit8 v2, v2, 0x2

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 4083
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4084
    new-instance v0, Lcom/roidapp/baselib/c/s;

    invoke-direct {v0, v3, p2}, Lcom/roidapp/baselib/c/s;-><init>(Landroid/view/View;I)V

    goto :goto_0

    .line 4061
    :pswitch_data_0
    .packed-switch 0x20
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final synthetic a(Ljava/lang/Object;)Lcom/bumptech/glide/e;
    .locals 3

    .prologue
    .line 28
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/n;

    .line 2213
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->b:Landroid/support/v4/app/Fragment;

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

    iget v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->e:I

    iget v2, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->e:I

    invoke-virtual {v0, v1, v2}, Lcom/bumptech/glide/c;->b(II)Lcom/bumptech/glide/c;

    move-result-object v0

    .line 28
    return-object v0
.end method

.method public final synthetic a(Landroid/support/v7/widget/bi;I)V
    .locals 8

    .prologue
    const/16 v7, 0x8

    const/4 v6, 0x3

    .line 28
    check-cast p1, Lcom/roidapp/baselib/c/s;

    .line 3096
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v2

    .line 3097
    const/4 v0, 0x1

    if-eq v2, v0, :cond_0

    if-ne v2, v6, :cond_1

    .line 3098
    :cond_0
    sget v0, Lcom/roidapp/cloudlib/ar;->cT:I

    invoke-virtual {p1, v0}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 3101
    :cond_1
    iget v0, p1, Lcom/roidapp/baselib/c/s;->j:I

    packed-switch v0, :pswitch_data_0

    .line 3146
    :goto_0
    return-void

    .line 3103
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0, p2}, Lcom/roidapp/cloudlib/sns/b/a/e;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    .line 3104
    sget v1, Lcom/roidapp/cloudlib/ar;->cQ:I

    invoke-virtual {p1, v1}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 3105
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v2}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v2

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/o;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/d;->g()Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v2

    sget-object v3, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 3111
    iget-object v1, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/cloudlib/sns/topic/a/a;->a(Landroid/view/View;Lcom/roidapp/cloudlib/sns/b/n;)V

    goto :goto_0

    .line 3115
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0, p2}, Lcom/roidapp/cloudlib/sns/b/a/e;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    .line 3116
    sget v1, Lcom/roidapp/cloudlib/ar;->cS:I

    invoke-virtual {p1, v1}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v3

    .line 3117
    sget v1, Lcom/roidapp/cloudlib/ar;->cR:I

    invoke-virtual {p1, v1}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 3118
    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v4}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v4

    iget-object v5, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget-object v5, v5, Lcom/roidapp/cloudlib/sns/b/o;->e:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v4

    invoke-virtual {v4}, Lcom/bumptech/glide/d;->g()Lcom/bumptech/glide/c;

    move-result-object v4

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 3123
    invoke-virtual {p0, v3, v0}, Lcom/roidapp/cloudlib/sns/topic/a/a;->a(Landroid/view/View;Lcom/roidapp/cloudlib/sns/b/n;)V

    .line 3125
    if-ge v2, v6, :cond_2

    .line 3126
    sget v0, Lcom/roidapp/cloudlib/ar;->cV:I

    invoke-virtual {p1, v0}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 3129
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a/e;

    add-int/lit8 v1, p2, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/b/a/e;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    .line 3130
    sget v1, Lcom/roidapp/cloudlib/ar;->cV:I

    invoke-virtual {p1, v1}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v2

    .line 3132
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 3133
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->j:I

    div-int/lit8 v3, v3, 0x2

    iput v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 3135
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 3136
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->j:I

    div-int/lit8 v3, v3, 0x2

    iput v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 3138
    sget v1, Lcom/roidapp/cloudlib/ar;->cU:I

    invoke-virtual {p1, v1}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 3139
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v3}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v3

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget-object v4, v4, Lcom/roidapp/cloudlib/sns/b/o;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/bumptech/glide/d;->g()Lcom/bumptech/glide/c;

    move-result-object v3

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 3144
    invoke-virtual {p0, v2, v0}, Lcom/roidapp/cloudlib/sns/topic/a/a;->a(Landroid/view/View;Lcom/roidapp/cloudlib/sns/b/n;)V

    goto/16 :goto_0

    .line 3149
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a/e;

    add-int/lit8 v1, p2, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/b/a/e;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    .line 3150
    sget v1, Lcom/roidapp/cloudlib/ar;->cP:I

    invoke-virtual {p1, v1}, Lcom/roidapp/baselib/c/s;->b(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 3151
    iget-object v2, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 3152
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->e:I

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 3153
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->e:I

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 3154
    const/4 v3, 0x0

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 3155
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->j:I

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 3156
    add-int/lit8 v3, p2, -0x2

    iget v4, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->f:I

    rem-int/2addr v3, v4

    packed-switch v3, :pswitch_data_1

    .line 3172
    :goto_1
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->b:Landroid/support/v4/app/Fragment;

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

    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->e:I

    iget v4, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->e:I

    invoke-virtual {v2, v3, v4}, Lcom/bumptech/glide/c;->b(II)Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 3178
    iget-object v1, p1, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/cloudlib/sns/topic/a/a;->a(Landroid/view/View;Lcom/roidapp/cloudlib/sns/b/n;)V

    goto/16 :goto_0

    .line 3158
    :pswitch_3
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->j:I

    div-int/lit8 v3, v3, 0x2

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_1

    .line 3162
    :pswitch_4
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->j:I

    div-int/lit8 v3, v3, 0x2

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 3163
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->j:I

    div-int/lit8 v3, v3, 0x2

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_1

    .line 3167
    :pswitch_5
    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->j:I

    div-int/lit8 v3, v3, 0x2

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    goto :goto_1

    .line 3101
    :pswitch_data_0
    .packed-switch 0x20
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 3156
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public final bridge synthetic b()[I
    .locals 3

    .prologue
    .line 28
    .line 1222
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    iget v2, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->e:I

    aput v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->e:I

    aput v2, v0, v1

    .line 28
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
    .line 190
    iget v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->i:I

    sub-int v0, p1, v0

    add-int/lit8 v0, v0, 0x1

    .line 191
    if-gez v0, :cond_0

    .line 192
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->a:Ljava/util/List;

    .line 204
    :goto_0
    return-object v0

    .line 195
    :cond_0
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/topic/a/a;->a(I)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 204
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->a:Ljava/util/List;

    goto :goto_0

    .line 197
    :pswitch_0
    const/4 v1, 0x0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 198
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 199
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/a;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a/e;

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/b/a/e;->subList(II)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 195
    nop

    :pswitch_data_0
    .packed-switch 0x22
        :pswitch_0
    .end packed-switch
.end method

.method public final e(I)Z
    .locals 1

    .prologue
    .line 55
    const/16 v0, 0x22

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
