.class public final Lcom/roidapp/photogrid/release/by;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private b:Z

.field private c:Z

.field private d:I

.field private e:Z

.field private f:I

.field private g:Landroid/widget/TextView;

.field private h:Z

.field private i:Landroid/widget/HorizontalScrollView;

.field private j:I

.field private k:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 22
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 25
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/by;->b:Z

    .line 26
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/by;->c:Z

    .line 27
    iput v0, p0, Lcom/roidapp/photogrid/release/by;->d:I

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/by;I)I
    .locals 0

    .prologue
    .line 22
    iput p1, p0, Lcom/roidapp/photogrid/release/by;->f:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/by;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/roidapp/photogrid/release/by;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/by;)I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/roidapp/photogrid/release/by;->d:I

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/by;)Z
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/by;->e:Z

    return v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/by;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/roidapp/photogrid/release/by;->g:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/by;)Z
    .locals 1

    .prologue
    .line 22
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/by;->e:Z

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/by;)I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/roidapp/photogrid/release/by;->f:I

    return v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/by;)Landroid/widget/HorizontalScrollView;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/roidapp/photogrid/release/by;->i:Landroid/widget/HorizontalScrollView;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/by;)I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/roidapp/photogrid/release/by;->k:I

    return v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/by;)I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/roidapp/photogrid/release/by;->j:I

    return v0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/release/by;)Z
    .locals 1

    .prologue
    .line 22
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/by;->b:Z

    return v0
.end method

.method static synthetic k(Lcom/roidapp/photogrid/release/by;)Z
    .locals 1

    .prologue
    .line 22
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/by;->c:Z

    return v0
.end method


# virtual methods
.method public final a(ZZI)V
    .locals 0

    .prologue
    .line 48
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/by;->b:Z

    .line 49
    iput-boolean p2, p0, Lcom/roidapp/photogrid/release/by;->c:Z

    .line 50
    iput p3, p0, Lcom/roidapp/photogrid/release/by;->d:I

    .line 51
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 38
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/by;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 39
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 40
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 11

    .prologue
    const v10, 0x7f0d0494

    const v9, 0x7f0203c7

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v3, 0x0

    .line 60
    const v0, 0x7f0300a8

    invoke-virtual {p1, v0, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 87
    const v0, 0x7f0d0287

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/HorizontalScrollView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/by;->i:Landroid/widget/HorizontalScrollView;

    .line 88
    const v0, 0x7f0d0289

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 90
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/by;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0900d1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/roidapp/photogrid/release/by;->j:I

    .line 91
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/by;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, p0, Lcom/roidapp/photogrid/release/by;->k:I

    .line 95
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/by;->b:Z

    if-eqz v1, :cond_1

    .line 96
    const v1, 0x7f030127

    invoke-virtual {p1, v1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 97
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    iget v5, p0, Lcom/roidapp/photogrid/release/by;->j:I

    iget v8, p0, Lcom/roidapp/photogrid/release/by;->j:I

    invoke-direct {v1, v5, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    invoke-virtual {v2, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/roidapp/photogrid/release/by;->g:Landroid/widget/TextView;

    .line 99
    iget v1, p0, Lcom/roidapp/photogrid/release/by;->d:I

    if-ne v1, v4, :cond_3

    .line 100
    iget-object v1, p0, Lcom/roidapp/photogrid/release/by;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    .line 101
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v1

    .line 102
    if-eqz v1, :cond_0

    instance-of v1, v1, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    .line 103
    invoke-virtual {v2, v9}, Landroid/view/View;->setId(I)V

    .line 104
    iget-object v1, p0, Lcom/roidapp/photogrid/release/by;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v3, v9, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 105
    iget-object v1, p0, Lcom/roidapp/photogrid/release/by;->g:Landroid/widget/TextView;

    const v5, 0x7f0701fa

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    .line 119
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/by;->g:Landroid/widget/TextView;

    new-instance v5, Lcom/roidapp/photogrid/release/bz;

    invoke-direct {v5, p0}, Lcom/roidapp/photogrid/release/bz;-><init>(Lcom/roidapp/photogrid/release/by;)V

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 174
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 176
    :cond_1
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v1, v4, :cond_2

    iget v1, p0, Lcom/roidapp/photogrid/release/by;->d:I

    if-eq v1, v4, :cond_2

    .line 177
    const v1, 0x7f030127

    invoke-virtual {p1, v1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 178
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    iget v5, p0, Lcom/roidapp/photogrid/release/by;->j:I

    iget v8, p0, Lcom/roidapp/photogrid/release/by;->j:I

    invoke-direct {v2, v5, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 179
    const v2, 0x7f0201ce

    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 180
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 181
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v1, v2

    .line 182
    check-cast v1, Landroid/widget/TextView;

    const v5, 0x7f020358

    invoke-virtual {v1, v3, v5, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    move-object v1, v2

    .line 183
    check-cast v1, Landroid/widget/TextView;

    const v5, 0x7f07003d

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    .line 185
    new-instance v1, Lcom/roidapp/photogrid/release/ca;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/ca;-><init>(Lcom/roidapp/photogrid/release/by;)V

    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 202
    :cond_2
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/by;->c:Z

    if-eqz v1, :cond_5

    move v1, v3

    :goto_1
    move v4, v1

    :goto_2
    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/baselib/c/p;->f:[I

    array-length v1, v1

    if-ge v4, v1, :cond_8

    .line 203
    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/baselib/c/p;->f:[I

    aget v8, v1, v4

    .line 204
    if-nez v4, :cond_6

    .line 205
    const v1, 0x7f030127

    invoke-virtual {p1, v1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 206
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    iget v2, p0, Lcom/roidapp/photogrid/release/by;->j:I

    iget v9, p0, Lcom/roidapp/photogrid/release/by;->j:I

    invoke-direct {v1, v2, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 207
    invoke-virtual {v5, v8}, Landroid/view/View;->setId(I)V

    .line 208
    invoke-virtual {v5, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v1, v2

    .line 209
    check-cast v1, Landroid/widget/TextView;

    const v8, 0x7f020396

    invoke-virtual {v1, v3, v8, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 210
    check-cast v2, Landroid/widget/TextView;

    const v1, 0x7f070174

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(I)V

    move-object v1, v5

    .line 233
    :goto_3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 234
    new-instance v2, Lcom/roidapp/photogrid/release/cb;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/cb;-><init>(Lcom/roidapp/photogrid/release/by;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 273
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 202
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_2

    .line 108
    :cond_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v1

    if-eqz v1, :cond_4

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v5, 0x6

    if-eq v1, v5, :cond_4

    .line 109
    const v1, 0x7f020361

    invoke-virtual {v2, v1}, Landroid/view/View;->setId(I)V

    .line 110
    iget-object v1, p0, Lcom/roidapp/photogrid/release/by;->g:Landroid/widget/TextView;

    const v5, 0x7f020361

    invoke-virtual {v1, v3, v5, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 111
    iget-object v1, p0, Lcom/roidapp/photogrid/release/by;->g:Landroid/widget/TextView;

    const v5, 0x7f070333

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 113
    :cond_4
    invoke-virtual {v2, v9}, Landroid/view/View;->setId(I)V

    .line 114
    iget-object v1, p0, Lcom/roidapp/photogrid/release/by;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v3, v9, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 115
    iget-object v1, p0, Lcom/roidapp/photogrid/release/by;->g:Landroid/widget/TextView;

    const v5, 0x7f0701fa

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    :cond_5
    move v1, v4

    .line 202
    goto/16 :goto_1

    .line 212
    :cond_6
    const v1, 0x7f030126

    invoke-virtual {p1, v1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 213
    const v1, 0x7f0d04c6

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 218
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    iget v5, p0, Lcom/roidapp/photogrid/release/by;->j:I

    iget v9, p0, Lcom/roidapp/photogrid/release/by;->j:I

    invoke-direct {v1, v5, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 219
    invoke-virtual {v2, v8}, Landroid/view/View;->setId(I)V

    .line 220
    invoke-virtual {v2, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 225
    :try_start_0
    iget-object v5, p0, Lcom/roidapp/photogrid/release/by;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v5}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 229
    :goto_4
    if-eqz v5, :cond_7

    .line 230
    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_7
    move-object v1, v2

    goto/16 :goto_3

    .line 227
    :catch_0
    move-exception v5

    invoke-virtual {v5}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v5, v6

    goto :goto_4

    .line 276
    :cond_8
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/by;->h:Z

    if-eqz v0, :cond_9

    .line 277
    iget-object v0, p0, Lcom/roidapp/photogrid/release/by;->i:Landroid/widget/HorizontalScrollView;

    new-instance v1, Lcom/roidapp/photogrid/release/cc;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/cc;-><init>(Lcom/roidapp/photogrid/release/by;)V

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/HorizontalScrollView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 285
    :cond_9
    return-object v7
.end method
