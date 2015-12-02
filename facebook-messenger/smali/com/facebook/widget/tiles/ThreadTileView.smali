.class public Lcom/facebook/widget/tiles/ThreadTileView;
.super Lcom/facebook/widget/f;
.source "ThreadTileView.java"


# static fields
.field private static final a:I

.field private static final b:[Lcom/facebook/widget/tiles/i;


# instance fields
.field private final c:Lcom/facebook/widget/tiles/b;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/widget/images/UrlImage;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Landroid/graphics/drawable/Drawable;

.field private final g:F

.field private final h:Lcom/facebook/widget/tiles/i;

.field private final i:Z

.field private final j:Landroid/graphics/Paint;

.field private k:I

.field private l:I

.field private m:Lcom/facebook/widget/tiles/j;

.field private n:I

.field private o:I

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/16 v1, 0xff

    .line 36
    const/16 v0, 0x7f

    invoke-static {v0, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Lcom/facebook/widget/tiles/ThreadTileView;->a:I

    .line 42
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/widget/tiles/i;

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/widget/tiles/i;->LEFT:Lcom/facebook/widget/tiles/i;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/facebook/widget/tiles/i;->RIGHT:Lcom/facebook/widget/tiles/i;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/widget/tiles/ThreadTileView;->b:[Lcom/facebook/widget/tiles/i;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 68
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/widget/tiles/ThreadTileView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 69
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/widget/tiles/ThreadTileView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 73
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .prologue
    const/4 v4, 0x3

    const/4 v3, -0x1

    .line 76
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 78
    invoke-virtual {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->getInjector()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/widget/tiles/b;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/tiles/b;

    iput-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->c:Lcom/facebook/widget/tiles/b;

    .line 80
    invoke-virtual {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/facebook/q;->ThreadTileView:[I

    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 81
    sget v1, Lcom/facebook/q;->ThreadTileView_threadTileSize:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    .line 82
    iget v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    if-ne v1, v3, :cond_0

    .line 83
    const/high16 v1, 0x42480000    # 50.0f

    invoke-static {p1, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v1

    iput v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    .line 85
    :cond_0
    sget v1, Lcom/facebook/q;->ThreadTileView_bigImageWidthPercent:I

    const v2, 0x3f2aaaab

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->g:F

    .line 88
    sget v1, Lcom/facebook/q;->ThreadTileView_bigImageLocation:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    .line 89
    if-ltz v1, :cond_2

    .line 90
    sget-object v2, Lcom/facebook/widget/tiles/ThreadTileView;->b:[Lcom/facebook/widget/tiles/i;

    aget-object v1, v2, v1

    iput-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->h:Lcom/facebook/widget/tiles/i;

    .line 94
    :goto_0
    sget v1, Lcom/facebook/q;->ThreadTileView_overlayDivider:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->i:Z

    .line 95
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v1

    iput v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->l:I

    .line 96
    iget-boolean v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->i:Z

    if-eqz v1, :cond_3

    .line 97
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->j:Landroid/graphics/Paint;

    .line 98
    iget-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->j:Landroid/graphics/Paint;

    iget v2, p0, Lcom/facebook/widget/tiles/ThreadTileView;->l:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 99
    iget-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->j:Landroid/graphics/Paint;

    sget v2, Lcom/facebook/widget/tiles/ThreadTileView;->a:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 104
    :goto_1
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 106
    invoke-virtual {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_1

    .line 107
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/facebook/widget/tiles/ThreadTileView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 110
    :cond_1
    invoke-static {v4}, Lcom/google/common/a/hq;->c(I)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    .line 111
    invoke-static {v4}, Lcom/google/common/a/hq;->c(I)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->e:Ljava/util/List;

    .line 113
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/16 v1, 0xff

    const/16 v2, 0xcc

    const/16 v3, 0xd3

    const/16 v4, 0xe0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->f:Landroid/graphics/drawable/Drawable;

    .line 114
    return-void

    .line 92
    :cond_2
    sget-object v1, Lcom/facebook/widget/tiles/i;->LEFT:Lcom/facebook/widget/tiles/i;

    iput-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->h:Lcom/facebook/widget/tiles/i;

    goto :goto_0

    .line 101
    :cond_3
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->j:Landroid/graphics/Paint;

    goto :goto_1
.end method

.method private a(II)Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 188
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->m:Lcom/facebook/widget/tiles/j;

    invoke-interface {v0}, Lcom/facebook/widget/tiles/j;->b()Lcom/facebook/widget/tiles/a;

    move-result-object v0

    .line 189
    if-nez v0, :cond_0

    .line 190
    const/4 v0, 0x0

    .line 192
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->c:Lcom/facebook/widget/tiles/b;

    iget-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->m:Lcom/facebook/widget/tiles/j;

    invoke-interface {v1}, Lcom/facebook/widget/tiles/j;->b()Lcom/facebook/widget/tiles/a;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/widget/tiles/b;->a(Lcom/facebook/widget/tiles/a;II)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0
.end method

.method private a()V
    .locals 3

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->m:Lcom/facebook/widget/tiles/j;

    if-nez v0, :cond_0

    .line 153
    :goto_0
    return-void

    .line 137
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->m:Lcom/facebook/widget/tiles/j;

    invoke-interface {v0}, Lcom/facebook/widget/tiles/j;->a()I

    move-result v0

    .line 140
    if-nez v0, :cond_1

    .line 141
    const/4 v0, 0x1

    .line 144
    :cond_1
    iget v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->n:I

    if-ne v0, v1, :cond_2

    iget-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lcom/facebook/widget/tiles/ThreadTileView;->n:I

    if-lt v1, v2, :cond_2

    .line 145
    invoke-direct {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->b()V

    goto :goto_0

    .line 148
    :cond_2
    iput v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->n:I

    .line 149
    invoke-direct {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->e()V

    .line 150
    invoke-direct {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->b()V

    .line 151
    invoke-virtual {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->requestLayout()V

    .line 152
    invoke-virtual {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->invalidate()V

    goto :goto_0
.end method

.method private a(I)V
    .locals 3

    .prologue
    .line 369
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 370
    new-instance v1, Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/widget/images/UrlImage;-><init>(Landroid/content/Context;)V

    .line 371
    invoke-virtual {p0, v1}, Lcom/facebook/widget/tiles/ThreadTileView;->addView(Landroid/view/View;)V

    .line 372
    iget-object v2, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 373
    iget-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->e:Ljava/util/List;

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 369
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 375
    :cond_0
    return-void
.end method

.method private b()V
    .locals 2

    .prologue
    .line 156
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->n:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 157
    invoke-direct {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->c()V

    .line 161
    :goto_0
    return-void

    .line 159
    :cond_0
    invoke-direct {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->d()V

    goto :goto_0
.end method

.method private c()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 164
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    .line 165
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setPlaceHolderScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 168
    iget-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->m:Lcom/facebook/widget/tiles/j;

    invoke-interface {v1}, Lcom/facebook/widget/tiles/j;->a()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 169
    iget-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->m:Lcom/facebook/widget/tiles/j;

    iget v2, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    iget v3, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    invoke-interface {v1, v4, v2, v3}, Lcom/facebook/widget/tiles/j;->a(III)Lcom/facebook/ui/images/b/m;

    move-result-object v1

    .line 171
    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Lcom/facebook/ui/images/b/m;)V

    .line 172
    iget v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    iget v2, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    invoke-direct {p0, v1, v2}, Lcom/facebook/widget/tiles/ThreadTileView;->a(II)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setPlaceHolderDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 176
    :cond_0
    iget-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->m:Lcom/facebook/widget/tiles/j;

    invoke-interface {v1}, Lcom/facebook/widget/tiles/j;->a()I

    move-result v1

    if-nez v1, :cond_1

    .line 177
    sget-object v1, Lcom/facebook/widget/images/UrlImage;->a:Lcom/facebook/ui/images/b/m;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Lcom/facebook/ui/images/b/m;)V

    .line 178
    iget v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    iget v2, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    invoke-direct {p0, v1, v2}, Lcom/facebook/widget/tiles/ThreadTileView;->a(II)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setPlaceHolderDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 185
    :goto_0
    return-void

    .line 182
    :cond_1
    iget-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->m:Lcom/facebook/widget/tiles/j;

    iget v2, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    iget v3, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    invoke-interface {v1, v4, v2, v3}, Lcom/facebook/widget/tiles/j;->a(III)Lcom/facebook/ui/images/b/m;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Lcom/facebook/ui/images/b/m;)V

    .line 184
    iget v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    iget v2, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    invoke-direct {p0, v1, v2}, Lcom/facebook/widget/tiles/ThreadTileView;->a(II)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setPlaceHolderDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method private d()V
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 197
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->e:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    .line 198
    iget-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/images/UrlImage;

    .line 199
    iget-object v2, p0, Lcom/facebook/widget/tiles/ThreadTileView;->m:Lcom/facebook/widget/tiles/j;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    invoke-interface {v2, v4, v3, v0}, Lcom/facebook/widget/tiles/j;->a(III)Lcom/facebook/ui/images/b/m;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Lcom/facebook/ui/images/b/m;)V

    .line 202
    invoke-direct {p0, v1}, Lcom/facebook/widget/tiles/ThreadTileView;->setBackground(Lcom/facebook/widget/images/UrlImage;)V

    .line 204
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->e:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    .line 205
    iget-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/images/UrlImage;

    .line 207
    iget-object v2, p0, Lcom/facebook/widget/tiles/ThreadTileView;->m:Lcom/facebook/widget/tiles/j;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    invoke-interface {v2, v5, v3, v0}, Lcom/facebook/widget/tiles/j;->a(III)Lcom/facebook/ui/images/b/m;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Lcom/facebook/ui/images/b/m;)V

    .line 211
    invoke-direct {p0, v1}, Lcom/facebook/widget/tiles/ThreadTileView;->setBackground(Lcom/facebook/widget/images/UrlImage;)V

    .line 212
    invoke-virtual {v1, v4}, Lcom/facebook/widget/images/UrlImage;->setVisibility(I)V

    .line 215
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->n:I

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    .line 226
    :goto_0
    return-void

    .line 219
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->e:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    .line 220
    iget-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/images/UrlImage;

    .line 222
    iget-object v2, p0, Lcom/facebook/widget/tiles/ThreadTileView;->m:Lcom/facebook/widget/tiles/j;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    invoke-interface {v2, v6, v3, v0}, Lcom/facebook/widget/tiles/j;->a(III)Lcom/facebook/ui/images/b/m;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Lcom/facebook/ui/images/b/m;)V

    .line 225
    invoke-direct {p0, v1}, Lcom/facebook/widget/tiles/ThreadTileView;->setBackground(Lcom/facebook/widget/images/UrlImage;)V

    goto :goto_0
.end method

.method private e()V
    .locals 10

    .prologue
    const/16 v9, 0x8

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v2, 0x0

    .line 304
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->m:Lcom/facebook/widget/tiles/j;

    if-nez v0, :cond_1

    .line 362
    :cond_0
    return-void

    .line 308
    :cond_1
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->n:I

    invoke-direct {p0, v0}, Lcom/facebook/widget/tiles/ThreadTileView;->a(I)V

    .line 309
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->n:I

    if-ne v0, v7, :cond_3

    .line 310
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setPlaceHolderScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 311
    iput v2, p0, Lcom/facebook/widget/tiles/ThreadTileView;->o:I

    .line 312
    iput v2, p0, Lcom/facebook/widget/tiles/ThreadTileView;->p:I

    :goto_0
    move v1, v2

    .line 353
    :goto_1
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 354
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->n:I

    if-ge v1, v0, :cond_9

    .line 355
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {v0}, Lcom/facebook/widget/images/UrlImage;->getVisibility()I

    move-result v0

    if-ne v0, v9, :cond_2

    .line 356
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/images/UrlImage;->setVisibility(I)V

    .line 353
    :cond_2
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 314
    :cond_3
    iget-boolean v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->i:Z

    if-eqz v0, :cond_4

    move v1, v2

    .line 315
    :goto_3
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v3, p0, Lcom/facebook/widget/tiles/ThreadTileView;->g:F

    mul-float/2addr v0, v3

    float-to-int v0, v0

    .line 316
    iget v3, p0, Lcom/facebook/widget/tiles/ThreadTileView;->n:I

    if-ne v3, v8, :cond_a

    .line 317
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    move v3, v0

    .line 319
    :goto_4
    iput v3, p0, Lcom/facebook/widget/tiles/ThreadTileView;->o:I

    .line 321
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->h:Lcom/facebook/widget/tiles/i;

    sget-object v4, Lcom/facebook/widget/tiles/i;->LEFT:Lcom/facebook/widget/tiles/i;

    if-ne v0, v4, :cond_5

    .line 322
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->e:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    iget v4, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    invoke-virtual {v0, v2, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 329
    :goto_5
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->n:I

    if-ne v0, v8, :cond_7

    .line 330
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->h:Lcom/facebook/widget/tiles/i;

    sget-object v4, Lcom/facebook/widget/tiles/i;->LEFT:Lcom/facebook/widget/tiles/i;

    if-ne v0, v4, :cond_6

    .line 331
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->e:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    add-int/2addr v1, v3

    iget v3, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    iget v4, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 335
    :goto_6
    iput v2, p0, Lcom/facebook/widget/tiles/ThreadTileView;->p:I

    goto :goto_0

    .line 314
    :cond_4
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->l:I

    move v1, v0

    goto :goto_3

    .line 324
    :cond_5
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->e:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    add-int v4, v3, v1

    iget v5, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    iget v6, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    invoke-virtual {v0, v4, v2, v5, v6}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_5

    .line 333
    :cond_6
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->e:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    iget v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    invoke-virtual {v0, v2, v2, v3, v1}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_6

    .line 337
    :cond_7
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    sub-int/2addr v0, v1

    div-int/lit8 v4, v0, 0x2

    .line 338
    iput v4, p0, Lcom/facebook/widget/tiles/ThreadTileView;->p:I

    .line 340
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->h:Lcom/facebook/widget/tiles/i;

    sget-object v5, Lcom/facebook/widget/tiles/i;->LEFT:Lcom/facebook/widget/tiles/i;

    if-ne v0, v5, :cond_8

    .line 341
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->e:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    add-int v5, v3, v1

    iget v6, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    invoke-virtual {v0, v5, v2, v6, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 343
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->e:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    add-int/2addr v3, v1

    add-int/2addr v1, v4

    iget v4, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    iget v5, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    invoke-virtual {v0, v3, v1, v4, v5}, Landroid/graphics/Rect;->set(IIII)V

    goto/16 :goto_0

    .line 346
    :cond_8
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->e:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    invoke-virtual {v0, v2, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 347
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->e:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    add-int/2addr v1, v4

    iget v4, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    goto/16 :goto_0

    .line 359
    :cond_9
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {v0, v9}, Lcom/facebook/widget/images/UrlImage;->setVisibility(I)V

    goto/16 :goto_2

    :cond_a
    move v3, v0

    goto/16 :goto_4
.end method

.method private setBackground(Lcom/facebook/widget/images/UrlImage;)V
    .locals 1

    .prologue
    .line 365
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Lcom/facebook/widget/images/UrlImage;->setPlaceHolderDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 366
    return-void
.end method


# virtual methods
.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 287
    invoke-super {p0, p1}, Lcom/facebook/widget/f;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 289
    iget-boolean v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->i:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->o:I

    if-eqz v0, :cond_0

    .line 291
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->o:I

    int-to-float v1, v0

    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->o:I

    int-to-float v3, v0

    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    int-to-float v4, v0

    iget-object v5, p0, Lcom/facebook/widget/tiles/ThreadTileView;->j:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 294
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->h:Lcom/facebook/widget/tiles/i;

    sget-object v1, Lcom/facebook/widget/tiles/i;->RIGHT:Lcom/facebook/widget/tiles/i;

    if-ne v0, v1, :cond_1

    .line 295
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->p:I

    int-to-float v3, v0

    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->o:I

    int-to-float v4, v0

    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->p:I

    int-to-float v5, v0

    iget-object v6, p0, Lcom/facebook/widget/tiles/ThreadTileView;->j:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 301
    :cond_0
    :goto_0
    return-void

    .line 297
    :cond_1
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->o:I

    int-to-float v1, v0

    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->p:I

    int-to-float v2, v0

    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    int-to-float v3, v0

    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->p:I

    int-to-float v4, v0

    iget-object v5, p0, Lcom/facebook/widget/tiles/ThreadTileView;->j:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_0
.end method

.method public getTileSizePx()I
    .locals 1

    .prologue
    .line 122
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 266
    const-string v1, "ThreadTileView.onLayout"

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v3

    .line 267
    iget v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->n:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 269
    iget-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    .line 270
    invoke-virtual {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->getPaddingLeft()I

    move-result v4

    invoke-virtual {v0}, Lcom/facebook/widget/images/UrlImage;->getMeasuredWidth()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->getPaddingTop()I

    move-result v5

    invoke-virtual {v0}, Lcom/facebook/widget/images/UrlImage;->getMeasuredHeight()I

    move-result v6

    add-int/2addr v5, v6

    invoke-virtual {v0, v1, v2, v4, v5}, Lcom/facebook/widget/images/UrlImage;->layout(IIII)V

    .line 282
    :cond_0
    invoke-virtual {v3}, Lcom/facebook/debug/d/e;->a()J

    .line 283
    return-void

    :cond_1
    move v2, v0

    .line 276
    :goto_0
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->n:I

    if-ge v2, v0, :cond_0

    .line 277
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    .line 278
    iget-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->e:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    .line 279
    iget v4, v1, Landroid/graphics/Rect;->left:I

    iget v5, v1, Landroid/graphics/Rect;->top:I

    iget v6, v1, Landroid/graphics/Rect;->right:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v0, v4, v5, v6, v1}, Lcom/facebook/widget/images/UrlImage;->layout(IIII)V

    .line 276
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0
.end method

.method protected onMeasure(II)V
    .locals 9

    .prologue
    const/high16 v4, 0x40000000    # 2.0f

    const/4 v3, 0x0

    .line 230
    const-string v0, "ThreadTileView.onMeasure"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v8

    .line 235
    invoke-virtual {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    add-int v6, v3, v0

    .line 236
    invoke-virtual {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->getPaddingBottom()I

    move-result v1

    add-int/2addr v0, v1

    add-int v7, v3, v0

    .line 239
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->n:I

    invoke-direct {p0, v0}, Lcom/facebook/widget/tiles/ThreadTileView;->a(I)V

    .line 240
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->n:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 241
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/images/UrlImage;

    move-object v0, p0

    move v2, p1

    move v4, p2

    move v5, v3

    .line 242
    invoke-virtual/range {v0 .. v5}, Lcom/facebook/widget/tiles/ThreadTileView;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 243
    invoke-virtual {v1}, Lcom/facebook/widget/images/UrlImage;->getMeasuredWidth()I

    move-result v0

    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 244
    invoke-virtual {v1}, Lcom/facebook/widget/images/UrlImage;->getMeasuredHeight()I

    move-result v1

    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 256
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 257
    invoke-virtual {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 258
    invoke-static {v0, p1}, Lcom/facebook/widget/tiles/ThreadTileView;->resolveSize(II)I

    move-result v0

    invoke-static {v1, p2}, Lcom/facebook/widget/tiles/ThreadTileView;->resolveSize(II)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/widget/tiles/ThreadTileView;->setMeasuredDimension(II)V

    .line 261
    invoke-virtual {v8}, Lcom/facebook/debug/d/e;->a()J

    .line 262
    return-void

    .line 246
    :cond_0
    :goto_1
    iget v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->n:I

    if-ge v3, v0, :cond_1

    .line 247
    iget-object v0, p0, Lcom/facebook/widget/tiles/ThreadTileView;->d:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    .line 248
    iget-object v1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->e:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    .line 249
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    invoke-static {v1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lcom/facebook/widget/images/UrlImage;->measure(II)V

    .line 246
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    move v0, v6

    move v1, v7

    goto :goto_0
.end method

.method public setThreadTileViewData(Lcom/facebook/widget/tiles/j;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->m:Lcom/facebook/widget/tiles/j;

    .line 118
    invoke-direct {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->a()V

    .line 119
    return-void
.end method

.method public setTileSizePx(I)V
    .locals 0

    .prologue
    .line 127
    iput p1, p0, Lcom/facebook/widget/tiles/ThreadTileView;->k:I

    .line 128
    invoke-direct {p0}, Lcom/facebook/widget/tiles/ThreadTileView;->a()V

    .line 129
    return-void
.end method
