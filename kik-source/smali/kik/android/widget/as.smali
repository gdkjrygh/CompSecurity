.class public final Lkik/android/widget/as;
.super Landroid/support/v7/widget/RecyclerView$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/as$a;,
        Lkik/android/widget/as$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/List;

.field private final d:I

.field private e:Landroid/content/Context;

.field private f:Lkik/android/widget/GifSearchFragment$b;

.field private g:Landroid/graphics/Paint;

.field private h:Lkik/android/gifs/view/EmojiLruCache;

.field private i:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;Lkik/android/widget/GifSearchFragment$b;)V
    .locals 2

    .prologue
    .line 62
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$a;-><init>()V

    .line 63
    iput-object p2, p0, Lkik/android/widget/as;->e:Landroid/content/Context;

    .line 64
    iput-object p1, p0, Lkik/android/widget/as;->a:Ljava/util/List;

    .line 65
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0d0013

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lkik/android/widget/as;->d:I

    .line 66
    iput-object p3, p0, Lkik/android/widget/as;->f:Lkik/android/widget/GifSearchFragment$b;

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/widget/as;->c:Ljava/util/List;

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/widget/as;->b:Ljava/util/List;

    .line 69
    iget-object v0, p0, Lkik/android/widget/as;->e:Landroid/content/Context;

    invoke-static {v0}, Lkik/android/gifs/view/EmojiLruCache;->a(Landroid/content/Context;)Lkik/android/gifs/view/EmojiLruCache;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/as;->h:Lkik/android/gifs/view/EmojiLruCache;

    .line 70
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkik/android/widget/as;->g:Landroid/graphics/Paint;

    .line 71
    iget-object v0, p0, Lkik/android/widget/as;->g:Landroid/graphics/Paint;

    const/16 v1, 0x1e

    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 72
    iget-object v0, p0, Lkik/android/widget/as;->g:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 73
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lkik/android/widget/as;->i:Ljava/util/HashMap;

    .line 74
    return-void
.end method

.method private a(Lkik/android/gifs/a/a;)Z
    .locals 2

    .prologue
    .line 209
    iget-object v0, p0, Lkik/android/widget/as;->g:Landroid/graphics/Paint;

    invoke-virtual {p1}, Lkik/android/gifs/a/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    .line 210
    const/high16 v1, 0x42480000    # 50.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lkik/android/widget/as;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final a(I)I
    .locals 1

    .prologue
    .line 118
    if-gtz p1, :cond_0

    .line 119
    const/4 v0, 0x0

    .line 121
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$t;
    .locals 3

    .prologue
    .line 78
    if-nez p2, :cond_0

    .line 79
    new-instance v1, Landroid/widget/Space;

    iget-object v0, p0, Lkik/android/widget/as;->e:Landroid/content/Context;

    invoke-direct {v1, v0}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 80
    iget-object v0, p0, Lkik/android/widget/as;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0d0017

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/16 v2, 0x8

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Landroid/widget/Space;->setMinimumHeight(I)V

    .line 81
    new-instance v0, Lkik/android/widget/as$a;

    invoke-direct {v0, v1}, Lkik/android/widget/as$a;-><init>(Landroid/view/View;)V

    .line 85
    :goto_0
    return-object v0

    .line 84
    :cond_0
    iget-object v0, p0, Lkik/android/widget/as;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03004b

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 85
    new-instance v1, Lkik/android/widget/as$b;

    invoke-direct {v1, v0}, Lkik/android/widget/as$b;-><init>(Landroid/widget/ImageView;)V

    move-object v0, v1

    goto :goto_0
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView$t;I)V
    .locals 9

    .prologue
    const/4 v8, 0x5

    const/4 v6, -0x1

    const/high16 v7, 0x40000000    # 2.0f

    .line 91
    instance-of v0, p1, Lkik/android/widget/as$b;

    if-eqz v0, :cond_1

    .line 92
    iget-object v0, p0, Lkik/android/widget/as;->b:Ljava/util/List;

    add-int/lit8 v1, p2, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/gifs/a/a;

    move-object v1, p1

    .line 93
    check-cast v1, Lkik/android/widget/as$b;

    iget-object v2, p0, Lkik/android/widget/as;->f:Lkik/android/widget/GifSearchFragment$b;

    invoke-static {v1, v2}, Lkik/android/widget/as$b;->a(Lkik/android/widget/as$b;Lkik/android/widget/GifSearchFragment$b;)V

    .line 94
    invoke-direct {p0, v0}, Lkik/android/widget/as;->a(Lkik/android/gifs/a/a;)Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v1, p1

    .line 95
    check-cast v1, Lkik/android/widget/as$b;

    invoke-virtual {v0}, Lkik/android/gifs/a/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lkik/android/gifs/a/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lkik/android/widget/as$b;->a(Lkik/android/widget/as$b;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    :goto_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt v1, v2, :cond_4

    .line 102
    invoke-virtual {v0}, Lkik/android/gifs/a/a;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lkik/android/widget/as;->h:Lkik/android/gifs/view/EmojiLruCache;

    invoke-virtual {v0, v1}, Lkik/android/gifs/view/EmojiLruCache;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    iget v0, p0, Lkik/android/widget/as;->d:I

    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    invoke-virtual {v2, v6}, Landroid/graphics/Canvas;->drawColor(I)V

    iget-object v4, p0, Lkik/android/widget/as;->g:Landroid/graphics/Paint;

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v4

    iget v5, p0, Lkik/android/widget/as;->d:I

    int-to-float v5, v5

    const/high16 v6, 0x3fc00000    # 1.5f

    mul-float/2addr v5, v6

    cmpl-float v4, v4, v5

    if-lez v4, :cond_3

    iget-object v4, p0, Lkik/android/widget/as;->g:Landroid/graphics/Paint;

    const/16 v5, 0xf

    invoke-static {v5}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    iget-object v5, p0, Lkik/android/widget/as;->g:Landroid/graphics/Paint;

    invoke-virtual {v5}, Landroid/graphics/Paint;->descent()F

    move-result v5

    iget-object v6, p0, Lkik/android/widget/as;->g:Landroid/graphics/Paint;

    invoke-virtual {v6}, Landroid/graphics/Paint;->ascent()F

    move-result v6

    add-float/2addr v5, v6

    div-float/2addr v5, v7

    sub-float/2addr v4, v5

    float-to-int v4, v4

    int-to-float v3, v3

    int-to-float v4, v4

    iget-object v5, p0, Lkik/android/widget/as;->g:Landroid/graphics/Paint;

    invoke-virtual {v2, v1, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-object v2, p0, Lkik/android/widget/as;->g:Landroid/graphics/Paint;

    const/16 v3, 0x1e

    invoke-static {v3}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    :goto_1
    iget-object v2, p0, Lkik/android/widget/as;->h:Lkik/android/gifs/view/EmojiLruCache;

    invoke-virtual {v2, v1, v0}, Lkik/android/gifs/view/EmojiLruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    :cond_0
    check-cast p1, Lkik/android/widget/as$b;

    iget-object v1, p1, Lkik/android/widget/as$b;->j:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 109
    :cond_1
    :goto_2
    return-void

    :cond_2
    move-object v1, p1

    .line 98
    check-cast v1, Lkik/android/widget/as$b;

    invoke-virtual {v0}, Lkik/android/gifs/a/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lkik/android/gifs/a/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lkik/android/widget/as$b;->a(Lkik/android/widget/as$b;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 102
    :cond_3
    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    iget-object v5, p0, Lkik/android/widget/as;->g:Landroid/graphics/Paint;

    invoke-virtual {v5}, Landroid/graphics/Paint;->descent()F

    move-result v5

    iget-object v6, p0, Lkik/android/widget/as;->g:Landroid/graphics/Paint;

    invoke-virtual {v6}, Landroid/graphics/Paint;->ascent()F

    move-result v6

    add-float/2addr v5, v6

    div-float/2addr v5, v7

    sub-float/2addr v4, v5

    float-to-int v4, v4

    int-to-float v3, v3

    int-to-float v4, v4

    iget-object v5, p0, Lkik/android/widget/as;->g:Landroid/graphics/Paint;

    invoke-virtual {v2, v1, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 106
    :cond_4
    check-cast p1, Lkik/android/widget/as$b;

    iget-object v2, p1, Lkik/android/widget/as$b;->j:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lkik/android/gifs/a/a;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lkik/android/widget/as;->h:Lkik/android/gifs/view/EmojiLruCache;

    invoke-virtual {v0, v3}, Lkik/android/gifs/view/EmojiLruCache;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_5

    iget v4, p0, Lkik/android/widget/as;->d:I

    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v4, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    iget-object v0, p0, Lkik/android/widget/as;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    iget-object v0, p0, Lkik/android/widget/as;->i:Ljava/util/HashMap;

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v5, v6}, Landroid/graphics/Canvas;->drawColor(I)V

    add-int/lit8 v6, v4, -0x5

    add-int/lit8 v4, v4, -0x5

    invoke-virtual {v0, v8, v8, v6, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lkik/android/widget/as;->h:Lkik/android/gifs/view/EmojiLruCache;

    invoke-virtual {v0, v3, v1}, Lkik/android/gifs/view/EmojiLruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    :cond_5
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_2
.end method

.method public final d()V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 131
    iget-object v0, p0, Lkik/android/widget/as;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lkik/android/widget/as;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/gifs/a/a;

    invoke-direct {p0, v0}, Lkik/android/widget/as;->a(Lkik/android/gifs/a/a;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lkik/android/widget/as;->b:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkik/android/widget/as;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/gifs/a/a;

    invoke-virtual {v0}, Lkik/android/gifs/a/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v5, 0x2

    if-eq v1, v5, :cond_3

    move v1, v2

    :goto_2
    if-eqz v1, :cond_2

    iget-object v1, p0, Lkik/android/widget/as;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v1, v5}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v1

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "emoji_u"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v6, 0x10

    invoke-static {v1, v6}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u2764\ufe0f"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const-string v1, "emoji_heart"

    :cond_4
    iget-object v5, p0, Lkik/android/widget/as;->e:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const-string v6, "drawable"

    iget-object v7, p0, Lkik/android/widget/as;->e:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v1, v6, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_2

    :cond_5
    iget-object v5, p0, Lkik/android/widget/as;->i:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 132
    :cond_6
    invoke-super {p0}, Landroid/support/v7/widget/RecyclerView$a;->c()V

    .line 133
    return-void
.end method

.method public final e()Ljava/util/List;
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lkik/android/widget/as;->a:Ljava/util/List;

    return-object v0
.end method
