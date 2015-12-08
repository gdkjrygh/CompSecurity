.class public Lcom/mopub/volley/toolbox/NetworkImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:I

.field private d:Lcom/mopub/volley/toolbox/ImageLoader;

.field private e:Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 53
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/mopub/volley/toolbox/NetworkImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 54
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 57
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/mopub/volley/toolbox/NetworkImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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

.method static synthetic a(Lcom/mopub/volley/toolbox/NetworkImageView;)I
    .locals 1

    .prologue
    .line 32
    iget v0, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->c:I

    return v0
.end method

.method private a()V
    .locals 1

    .prologue
    .line 187
    iget v0, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->b:I

    if-eqz v0, :cond_0

    .line 188
    iget v0, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->b:I

    invoke-virtual {p0, v0}, Lcom/mopub/volley/toolbox/NetworkImageView;->setImageResource(I)V

    .line 193
    :goto_0
    return-void

    .line 191
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/mopub/volley/toolbox/NetworkImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method private a(Z)V
    .locals 7

    .prologue
    const/4 v6, -0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 104
    invoke-virtual {p0}, Lcom/mopub/volley/toolbox/NetworkImageView;->getWidth()I

    move-result v5

    .line 105
    invoke-virtual {p0}, Lcom/mopub/volley/toolbox/NetworkImageView;->getHeight()I

    move-result v4

    .line 108
    invoke-virtual {p0}, Lcom/mopub/volley/toolbox/NetworkImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 109
    invoke-virtual {p0}, Lcom/mopub/volley/toolbox/NetworkImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-ne v0, v6, :cond_1

    move v0, v1

    .line 110
    :goto_0
    invoke-virtual {p0}, Lcom/mopub/volley/toolbox/NetworkImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-ne v3, v6, :cond_2

    move v3, v1

    .line 115
    :goto_1
    if-eqz v0, :cond_3

    if-eqz v3, :cond_3

    .line 116
    :goto_2
    if-nez v5, :cond_4

    if-nez v4, :cond_4

    if-nez v1, :cond_4

    .line 184
    :cond_0
    :goto_3
    return-void

    :cond_1
    move v0, v2

    .line 109
    goto :goto_0

    :cond_2
    move v3, v2

    .line 110
    goto :goto_1

    :cond_3
    move v1, v2

    .line 115
    goto :goto_2

    .line 122
    :cond_4
    iget-object v1, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->a:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 123
    iget-object v0, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->e:Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    if-eqz v0, :cond_5

    .line 124
    iget-object v0, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->e:Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    invoke-virtual {v0}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->cancelRequest()V

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->e:Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    .line 127
    :cond_5
    invoke-direct {p0}, Lcom/mopub/volley/toolbox/NetworkImageView;->a()V

    goto :goto_3

    .line 132
    :cond_6
    iget-object v1, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->e:Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->e:Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    invoke-virtual {v1}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->getRequestUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 133
    iget-object v1, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->e:Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    invoke-virtual {v1}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->getRequestUrl()Ljava/lang/String;

    move-result-object v1

    iget-object v6, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->a:Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 138
    iget-object v1, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->e:Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    invoke-virtual {v1}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->cancelRequest()V

    .line 139
    invoke-direct {p0}, Lcom/mopub/volley/toolbox/NetworkImageView;->a()V

    .line 144
    :cond_7
    if-eqz v0, :cond_8

    move v0, v2

    .line 145
    :goto_4
    if-eqz v3, :cond_9

    .line 149
    :goto_5
    iget-object v1, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->d:Lcom/mopub/volley/toolbox/ImageLoader;

    iget-object v3, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->a:Ljava/lang/String;

    new-instance v4, Lcom/mopub/volley/toolbox/i;

    invoke-direct {v4, p0, p1}, Lcom/mopub/volley/toolbox/i;-><init>(Lcom/mopub/volley/toolbox/NetworkImageView;Z)V

    invoke-virtual {v1, v3, v4, v0, v2}, Lcom/mopub/volley/toolbox/ImageLoader;->get(Ljava/lang/String;Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;II)Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    move-result-object v0

    .line 183
    iput-object v0, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->e:Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    goto :goto_3

    :cond_8
    move v0, v5

    .line 144
    goto :goto_4

    :cond_9
    move v2, v4

    .line 145
    goto :goto_5

    :cond_a
    move v3, v2

    move v0, v2

    goto :goto_1
.end method

.method static synthetic b(Lcom/mopub/volley/toolbox/NetworkImageView;)I
    .locals 1

    .prologue
    .line 32
    iget v0, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->b:I

    return v0
.end method


# virtual methods
.method protected drawableStateChanged()V
    .locals 0

    .prologue
    .line 216
    invoke-super {p0}, Landroid/widget/ImageView;->drawableStateChanged()V

    .line 217
    invoke-virtual {p0}, Lcom/mopub/volley/toolbox/NetworkImageView;->invalidate()V

    .line 218
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 203
    iget-object v0, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->e:Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    if-eqz v0, :cond_0

    .line 206
    iget-object v0, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->e:Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    invoke-virtual {v0}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->cancelRequest()V

    .line 207
    invoke-virtual {p0, v1}, Lcom/mopub/volley/toolbox/NetworkImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 209
    iput-object v1, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->e:Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    .line 211
    :cond_0
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    .line 212
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .prologue
    .line 197
    invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V

    .line 198
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/mopub/volley/toolbox/NetworkImageView;->a(Z)V

    .line 199
    return-void
.end method

.method public setDefaultImageResId(I)V
    .locals 0

    .prologue
    .line 88
    iput p1, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->b:I

    .line 89
    return-void
.end method

.method public setErrorImageResId(I)V
    .locals 0

    .prologue
    .line 96
    iput p1, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->c:I

    .line 97
    return-void
.end method

.method public setImageUrl(Ljava/lang/String;Lcom/mopub/volley/toolbox/ImageLoader;)V
    .locals 1

    .prologue
    .line 77
    iput-object p1, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->a:Ljava/lang/String;

    .line 78
    iput-object p2, p0, Lcom/mopub/volley/toolbox/NetworkImageView;->d:Lcom/mopub/volley/toolbox/ImageLoader;

    .line 80
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/mopub/volley/toolbox/NetworkImageView;->a(Z)V

    .line 81
    return-void
.end method
