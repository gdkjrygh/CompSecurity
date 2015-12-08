.class public final Lcom/roidapp/baselib/view/e;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation


# instance fields
.field private final a:Ljava/util/Random;

.field private b:Z

.field private c:I

.field private d:I

.field private e:F

.field private f:[Landroid/graphics/drawable/Drawable;

.field private g:[I

.field private h:I

.field private i:Z

.field private j:Z

.field private k:Z

.field private final l:Landroid/view/animation/Interpolator;

.field private final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/animation/AnimatorSet;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 130
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 31
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/e;->a:Ljava/util/Random;

    .line 33
    iput-boolean v2, p0, Lcom/roidapp/baselib/view/e;->b:Z

    .line 39
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/baselib/view/e;->e:F

    .line 47
    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/baselib/view/e;->h:I

    .line 49
    iput-boolean v1, p0, Lcom/roidapp/baselib/view/e;->i:Z

    .line 51
    iput-boolean v2, p0, Lcom/roidapp/baselib/view/e;->j:Z

    .line 53
    iput-boolean v1, p0, Lcom/roidapp/baselib/view/e;->k:Z

    .line 55
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/e;->l:Landroid/view/animation/Interpolator;

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/e;->m:Ljava/util/List;

    .line 59
    new-instance v0, Lcom/roidapp/baselib/view/f;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/view/f;-><init>(Lcom/roidapp/baselib/view/e;)V

    iput-object v0, p0, Lcom/roidapp/baselib/view/e;->n:Ljava/lang/Runnable;

    .line 131
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/view/e;->setClickable(Z)V

    .line 132
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/view/e;->setVisibility(I)V

    .line 133
    return-void
.end method

.method private a(Z)V
    .locals 3

    .prologue
    .line 221
    iget-object v2, p0, Lcom/roidapp/baselib/view/e;->n:Ljava/lang/Runnable;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/view/e;->a:Ljava/util/Random;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    :goto_0
    invoke-virtual {p0, v2, v0, v1}, Lcom/roidapp/baselib/view/e;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 222
    return-void

    .line 221
    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/baselib/view/e;)Z
    .locals 1

    .prologue
    .line 29
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/e;->b:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/baselib/view/e;)I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/roidapp/baselib/view/e;->c:I

    return v0
.end method

.method static synthetic c(Lcom/roidapp/baselib/view/e;)I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/roidapp/baselib/view/e;->d:I

    return v0
.end method

.method static synthetic d(Lcom/roidapp/baselib/view/e;)Ljava/util/Random;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/baselib/view/e;->a:Ljava/util/Random;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/baselib/view/e;)F
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/roidapp/baselib/view/e;->e:F

    return v0
.end method

.method static synthetic f(Lcom/roidapp/baselib/view/e;)[Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/baselib/view/e;->f:[Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/baselib/view/e;)[I
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/baselib/view/e;->g:[I

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/baselib/view/e;)Z
    .locals 1

    .prologue
    .line 29
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/e;->i:Z

    return v0
.end method

.method static synthetic i(Lcom/roidapp/baselib/view/e;)Z
    .locals 1

    .prologue
    .line 29
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/e;->j:Z

    return v0
.end method

.method static synthetic j(Lcom/roidapp/baselib/view/e;)Z
    .locals 1

    .prologue
    .line 29
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/e;->k:Z

    return v0
.end method

.method static synthetic k(Lcom/roidapp/baselib/view/e;)I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/roidapp/baselib/view/e;->h:I

    return v0
.end method

.method static synthetic l(Lcom/roidapp/baselib/view/e;)Landroid/view/animation/Interpolator;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/baselib/view/e;->l:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method static synthetic m(Lcom/roidapp/baselib/view/e;)Ljava/util/List;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/baselib/view/e;->m:Ljava/util/List;

    return-object v0
.end method

.method static synthetic n(Lcom/roidapp/baselib/view/e;)V
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/baselib/view/e;->a(Z)V

    return-void
.end method


# virtual methods
.method public final a(F)Lcom/roidapp/baselib/view/e;
    .locals 0

    .prologue
    .line 201
    iput p1, p0, Lcom/roidapp/baselib/view/e;->e:F

    .line 202
    return-object p0
.end method

.method public final a(I)Lcom/roidapp/baselib/view/e;
    .locals 0

    .prologue
    .line 186
    iput p1, p0, Lcom/roidapp/baselib/view/e;->c:I

    .line 187
    return-object p0
.end method

.method public final varargs a([I)Lcom/roidapp/baselib/view/e;
    .locals 4

    .prologue
    .line 171
    array-length v0, p1

    if-lez v0, :cond_0

    .line 172
    array-length v0, p1

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lcom/roidapp/baselib/view/e;->f:[Landroid/graphics/drawable/Drawable;

    .line 174
    :cond_0
    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 175
    iget-object v1, p0, Lcom/roidapp/baselib/view/e;->f:[Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/e;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    aget v3, p1, v0

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    aput-object v2, v1, v0

    .line 174
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 177
    :cond_1
    return-object p0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 148
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/e;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(I)Lcom/roidapp/baselib/view/e;
    .locals 0

    .prologue
    .line 191
    iput p1, p0, Lcom/roidapp/baselib/view/e;->d:I

    .line 192
    return-object p0
.end method

.method public final b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 152
    iget-object v0, p0, Lcom/roidapp/baselib/view/e;->f:[Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 153
    iput-boolean v1, p0, Lcom/roidapp/baselib/view/e;->b:Z

    .line 154
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/view/e;->setVisibility(I)V

    .line 155
    invoke-direct {p0, v1}, Lcom/roidapp/baselib/view/e;->a(Z)V

    .line 157
    :cond_0
    return-void
.end method

.method public final c(I)Lcom/roidapp/baselib/view/e;
    .locals 0

    .prologue
    .line 196
    iput p1, p0, Lcom/roidapp/baselib/view/e;->h:I

    .line 197
    return-object p0
.end method

.method public final c()V
    .locals 3

    .prologue
    .line 160
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/e;->b:Z

    .line 161
    iget-object v0, p0, Lcom/roidapp/baselib/view/e;->n:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/view/e;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 162
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/view/e;->setVisibility(I)V

    .line 163
    iget-object v0, p0, Lcom/roidapp/baselib/view/e;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/AnimatorSet;

    .line 164
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 165
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet;->setTarget(Ljava/lang/Object;)V

    goto :goto_0

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/view/e;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 168
    return-void
.end method

.method public final d()Lcom/roidapp/baselib/view/e;
    .locals 1

    .prologue
    .line 206
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/e;->i:Z

    .line 207
    return-object p0
.end method

.method public final e()Lcom/roidapp/baselib/view/e;
    .locals 1

    .prologue
    .line 211
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/e;->j:Z

    .line 212
    return-object p0
.end method

.method public final f()Lcom/roidapp/baselib/view/e;
    .locals 1

    .prologue
    .line 216
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/e;->k:Z

    .line 217
    return-object p0
.end method

.method protected final onDetachedFromWindow()V
    .locals 0

    .prologue
    .line 226
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 227
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/e;->c()V

    .line 228
    return-void
.end method

.method protected final onMeasure(II)V
    .locals 4

    .prologue
    const/4 v3, -0x1

    const/4 v2, -0x2

    .line 137
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/e;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 138
    iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    if-eq v1, v2, :cond_0

    iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    if-ne v1, v2, :cond_1

    .line 140
    :cond_0
    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 141
    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 144
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 145
    return-void
.end method
