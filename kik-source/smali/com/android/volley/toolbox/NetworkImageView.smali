.class public Lcom/android/volley/toolbox/NetworkImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:I

.field private d:Lcom/android/volley/toolbox/i;

.field private e:Lcom/android/volley/toolbox/i$c;

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 62
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/android/volley/toolbox/NetworkImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 63
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 67
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/android/volley/toolbox/NetworkImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 68
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 72
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 73
    return-void
.end method

.method static synthetic a(Lcom/android/volley/toolbox/NetworkImageView;)I
    .locals 1

    .prologue
    .line 32
    iget v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->c:I

    return v0
.end method

.method static synthetic b(Lcom/android/volley/toolbox/NetworkImageView;)I
    .locals 1

    .prologue
    .line 32
    iget v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->b:I

    return v0
.end method


# virtual methods
.method protected drawableStateChanged()V
    .locals 0

    .prologue
    .line 226
    invoke-super {p0}, Landroid/widget/ImageView;->drawableStateChanged()V

    .line 227
    invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->invalidate()V

    .line 228
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 212
    iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/i$c;

    if-eqz v0, :cond_0

    .line 215
    iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/i$c;

    invoke-virtual {v0}, Lcom/android/volley/toolbox/i$c;->a()V

    .line 216
    invoke-virtual {p0, v1}, Lcom/android/volley/toolbox/NetworkImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 218
    iput-object v1, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/i$c;

    .line 220
    :cond_0
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    .line 221
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 5

    .prologue
    const/4 v4, -0x2

    const/4 v3, 0x0

    .line 205
    invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V

    .line 206
    invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-ne v0, v4, :cond_3

    invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-ne v0, v4, :cond_3

    const/4 v0, 0x1

    :goto_0
    if-nez v1, :cond_0

    if-nez v2, :cond_0

    if-eqz v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/i$c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/i$c;

    invoke-virtual {v0}, Lcom/android/volley/toolbox/i$c;->a()V

    iput-object v3, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/i$c;

    :cond_1
    invoke-virtual {p0, v3}, Lcom/android/volley/toolbox/NetworkImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 207
    :cond_2
    :goto_1
    return-void

    .line 206
    :cond_3
    const/4 v0, 0x0

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/i$c;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/i$c;

    invoke-virtual {v0}, Lcom/android/volley/toolbox/i$c;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/i$c;

    invoke-virtual {v0}, Lcom/android/volley/toolbox/i$c;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/android/volley/toolbox/NetworkImageView;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/i$c;

    invoke-virtual {v0}, Lcom/android/volley/toolbox/i$c;->a()V

    invoke-virtual {p0, v3}, Lcom/android/volley/toolbox/NetworkImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_5
    iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->d:Lcom/android/volley/toolbox/i;

    iget-object v1, p0, Lcom/android/volley/toolbox/NetworkImageView;->a:Ljava/lang/String;

    new-instance v2, Lcom/android/volley/toolbox/q;

    invoke-direct {v2, p0}, Lcom/android/volley/toolbox/q;-><init>(Lcom/android/volley/toolbox/NetworkImageView;)V

    iget v3, p0, Lcom/android/volley/toolbox/NetworkImageView;->f:I

    iget v4, p0, Lcom/android/volley/toolbox/NetworkImageView;->g:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/android/volley/toolbox/i;->a(Ljava/lang/String;Lcom/android/volley/toolbox/i$d;II)Lcom/android/volley/toolbox/i$c;

    move-result-object v0

    iput-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->e:Lcom/android/volley/toolbox/i$c;

    goto :goto_1
.end method
