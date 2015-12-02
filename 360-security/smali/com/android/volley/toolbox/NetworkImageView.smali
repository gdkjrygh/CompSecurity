.class public Lcom/android/volley/toolbox/NetworkImageView;
.super Landroid/widget/ImageView;
.source "360Security"


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:I

.field private d:Lcom/android/volley/toolbox/g;

.field private e:Lcom/android/volley/toolbox/g$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 57
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/android/volley/toolbox/NetworkImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 62
    return-void
.end method

.method static synthetic a(Lcom/android/volley/toolbox/NetworkImageView;)I
    .locals 1

    .prologue
    .line 44
    iget v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->c:I

    return v0
.end method

.method private a()V
    .locals 1

    .prologue
    .line 190
    iget v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->b:I

    if-eqz v0, :cond_0

    .line 191
    iget v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->b:I

    invoke-virtual {p0, v0}, Lcom/android/volley/toolbox/NetworkImageView;->setImageResource(I)V

    .line 195
    :goto_0
    return-void

    .line 193
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/android/volley/toolbox/NetworkImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/android/volley/toolbox/NetworkImageView;)I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->b:I

    return v0
.end method


# virtual methods
.method a(Z)V
    .locals 7

    .prologue
    const/4 v6, -0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 108
    invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->getWidth()I

    move-result v5

    .line 109
    invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->getHeight()I

    move-result v4

    .line 112
    invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 113
    invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-ne v0, v6, :cond_1

    move v0, v1

    .line 114
    :goto_0
    invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-ne v3, v6, :cond_2

    move v3, v1

    .line 119
    :goto_1
    if-eqz v0, :cond_3

    if-eqz v3, :cond_3

    .line 120
    :goto_2
    if-nez v5, :cond_4

    if-nez v4, :cond_4

    if-nez v1, :cond_4

    .line 187
    :cond_0
    :goto_3
    return-void

    :cond_1
    move v0, v2

    .line 113
    goto :goto_0

    :cond_2
    move v3, v2

    .line 114
    goto :goto_1

    :cond_3
    move v1, v2

    .line 119
    goto :goto_2

    .line 126
    :cond_4
    iget-object v1, p0, Lcom/android/volley/toolbox/NetworkImageView;->a:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 127
    iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/g$c;

    if-eqz v0, :cond_5

    .line 128
    iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/g$c;

    invoke-virtual {v0}, Lcom/android/volley/toolbox/g$c;->a()V

    .line 129
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/g$c;

    .line 131
    :cond_5
    invoke-direct {p0}, Lcom/android/volley/toolbox/NetworkImageView;->a()V

    goto :goto_3

    .line 136
    :cond_6
    iget-object v1, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/g$c;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/g$c;

    invoke-virtual {v1}, Lcom/android/volley/toolbox/g$c;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 137
    iget-object v1, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/g$c;

    invoke-virtual {v1}, Lcom/android/volley/toolbox/g$c;->c()Ljava/lang/String;

    move-result-object v1

    iget-object v6, p0, Lcom/android/volley/toolbox/NetworkImageView;->a:Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 142
    iget-object v1, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/g$c;

    invoke-virtual {v1}, Lcom/android/volley/toolbox/g$c;->a()V

    .line 143
    invoke-direct {p0}, Lcom/android/volley/toolbox/NetworkImageView;->a()V

    .line 148
    :cond_7
    if-eqz v0, :cond_8

    move v0, v2

    .line 149
    :goto_4
    if-eqz v3, :cond_9

    .line 153
    :goto_5
    iget-object v1, p0, Lcom/android/volley/toolbox/NetworkImageView;->d:Lcom/android/volley/toolbox/g;

    iget-object v3, p0, Lcom/android/volley/toolbox/NetworkImageView;->a:Ljava/lang/String;

    new-instance v4, Lcom/android/volley/toolbox/NetworkImageView$1;

    invoke-direct {v4, p0, p1}, Lcom/android/volley/toolbox/NetworkImageView$1;-><init>(Lcom/android/volley/toolbox/NetworkImageView;Z)V

    invoke-virtual {v1, v3, v4, v0, v2}, Lcom/android/volley/toolbox/g;->a(Ljava/lang/String;Lcom/android/volley/toolbox/g$d;II)Lcom/android/volley/toolbox/g$c;

    move-result-object v0

    .line 186
    iput-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/g$c;

    goto :goto_3

    :cond_8
    move v0, v5

    .line 148
    goto :goto_4

    :cond_9
    move v2, v4

    .line 149
    goto :goto_5

    :cond_a
    move v3, v2

    move v0, v2

    goto :goto_1
.end method

.method protected drawableStateChanged()V
    .locals 0

    .prologue
    .line 218
    invoke-super {p0}, Landroid/widget/ImageView;->drawableStateChanged()V

    .line 219
    invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->invalidate()V

    .line 220
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 205
    iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/g$c;

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/g$c;

    invoke-virtual {v0}, Lcom/android/volley/toolbox/g$c;->a()V

    .line 209
    invoke-virtual {p0, v1}, Lcom/android/volley/toolbox/NetworkImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 211
    iput-object v1, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/g$c;

    .line 213
    :cond_0
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    .line 214
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .prologue
    .line 199
    invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V

    .line 200
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/android/volley/toolbox/NetworkImageView;->a(Z)V

    .line 201
    return-void
.end method

.method public setDefaultImageResId(I)V
    .locals 0

    .prologue
    .line 90
    iput p1, p0, Lcom/android/volley/toolbox/NetworkImageView;->b:I

    .line 91
    return-void
.end method

.method public setErrorImageResId(I)V
    .locals 0

    .prologue
    .line 98
    iput p1, p0, Lcom/android/volley/toolbox/NetworkImageView;->c:I

    .line 99
    return-void
.end method
