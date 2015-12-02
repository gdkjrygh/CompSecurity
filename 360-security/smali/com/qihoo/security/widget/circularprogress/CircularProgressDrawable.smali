.class public Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "360Security"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;,
        Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;
    }
.end annotation


# static fields
.field public static final a:Landroid/view/animation/Interpolator;

.field private static final b:Landroid/view/animation/Interpolator;

.field private static final c:Landroid/view/animation/Interpolator;


# instance fields
.field private final d:Landroid/graphics/RectF;

.field private e:Lcom/nineoldandroids/a/o;

.field private f:Lcom/nineoldandroids/a/o;

.field private g:Lcom/nineoldandroids/a/o;

.field private h:Lcom/nineoldandroids/a/o;

.field private i:Z

.field private j:Landroid/graphics/Paint;

.field private k:Z

.field private l:I

.field private m:I

.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:Landroid/view/animation/Interpolator;

.field private s:Landroid/view/animation/Interpolator;

.field private t:F

.field private u:[I

.field private v:F

.field private w:F

.field private x:I

.field private y:I

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 57
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    sput-object v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->a:Landroid/view/animation/Interpolator;

    .line 58
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    sput-object v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->b:Landroid/view/animation/Interpolator;

    .line 59
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->c:Landroid/view/animation/Interpolator;

    return-void
.end method

.method private constructor <init>([IFFFIILcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;Landroid/view/animation/Interpolator;Landroid/view/animation/Interpolator;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 94
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 64
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->d:Landroid/graphics/RectF;

    .line 77
    iput v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->o:F

    .line 78
    iput v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->p:F

    .line 79
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->q:F

    .line 95
    iput-object p9, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->s:Landroid/view/animation/Interpolator;

    .line 96
    iput-object p8, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->r:Landroid/view/animation/Interpolator;

    .line 97
    iput p2, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->t:F

    .line 98
    iput v2, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->m:I

    .line 99
    iput-object p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->u:[I

    .line 100
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->u:[I

    aget v0, v0, v2

    iput v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->l:I

    .line 101
    iput p3, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->v:F

    .line 102
    iput p4, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->w:F

    .line 103
    iput p5, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->x:I

    .line 104
    iput p6, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->y:I

    .line 106
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->j:Landroid/graphics/Paint;

    .line 107
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->j:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 108
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->j:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 109
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 110
    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->j:Landroid/graphics/Paint;

    sget-object v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;->ROUNDED:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

    if-ne p7, v0, :cond_0

    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    :goto_0
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 111
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->j:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->u:[I

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 113
    invoke-direct {p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->f()V

    .line 114
    return-void

    .line 110
    :cond_0
    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    goto :goto_0
.end method

.method synthetic constructor <init>([IFFFIILcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;Landroid/view/animation/Interpolator;Landroid/view/animation/Interpolator;Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$1;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct/range {p0 .. p9}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;-><init>([IFFFIILcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;Landroid/view/animation/Interpolator;Landroid/view/animation/Interpolator;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;I)I
    .locals 0

    .prologue
    .line 47
    iput p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->m:I

    return p1
.end method

.method static synthetic a()Landroid/view/animation/Interpolator;
    .locals 1

    .prologue
    .line 47
    sget-object v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->c:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;F)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0, p1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->c(F)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)Z
    .locals 1

    .prologue
    .line 47
    iget-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->z:Z

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;Z)Z
    .locals 0

    .prologue
    .line 47
    iput-boolean p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->i:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)I
    .locals 1

    .prologue
    .line 47
    iget v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->y:I

    return v0
.end method

.method static synthetic b(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;I)I
    .locals 0

    .prologue
    .line 47
    iput p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->l:I

    return p1
.end method

.method static synthetic b()Landroid/view/animation/Interpolator;
    .locals 1

    .prologue
    .line 47
    sget-object v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->b:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;Z)Z
    .locals 0

    .prologue
    .line 47
    iput-boolean p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->z:Z

    return p1
.end method

.method static synthetic c(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)I
    .locals 1

    .prologue
    .line 47
    iget v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->x:I

    return v0
.end method

.method private c()V
    .locals 2

    .prologue
    .line 117
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->z:Z

    .line 118
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->j:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->l:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 119
    return-void
.end method

.method private c(F)V
    .locals 0

    .prologue
    .line 396
    iput p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->q:F

    .line 397
    invoke-virtual {p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->invalidateSelf()V

    .line 398
    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 165
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->i:Z

    .line 166
    iget v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->o:F

    iget v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->x:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->o:F

    .line 167
    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->e()V

    return-void
.end method

.method static synthetic e(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)Lcom/nineoldandroids/a/o;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->f:Lcom/nineoldandroids/a/o;

    return-object v0
.end method

.method private e()V
    .locals 2

    .prologue
    .line 170
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->i:Z

    .line 171
    iget v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->o:F

    iget v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->y:I

    rsub-int v1, v1, 0x168

    int-to-float v1, v1

    add-float/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->o:F

    .line 172
    return-void
.end method

.method private f()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/high16 v6, 0x44160000    # 600.0f

    const/4 v5, 0x1

    const/4 v4, 0x2

    .line 178
    new-array v0, v4, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Lcom/nineoldandroids/a/o;->b([F)Lcom/nineoldandroids/a/o;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->g:Lcom/nineoldandroids/a/o;

    .line 179
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->g:Lcom/nineoldandroids/a/o;

    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->r:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Landroid/view/animation/Interpolator;)V

    .line 180
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->g:Lcom/nineoldandroids/a/o;

    const/high16 v1, 0x44fa0000    # 2000.0f

    iget v2, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->w:F

    div-float/2addr v1, v2

    float-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    .line 181
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->g:Lcom/nineoldandroids/a/o;

    new-instance v1, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$1;-><init>(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 188
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->g:Lcom/nineoldandroids/a/o;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(I)V

    .line 189
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->g:Lcom/nineoldandroids/a/o;

    invoke-virtual {v0, v5}, Lcom/nineoldandroids/a/o;->b(I)V

    .line 191
    new-array v0, v4, [F

    iget v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->x:I

    int-to-float v1, v1

    aput v1, v0, v7

    iget v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->y:I

    int-to-float v1, v1

    aput v1, v0, v5

    invoke-static {v0}, Lcom/nineoldandroids/a/o;->b([F)Lcom/nineoldandroids/a/o;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->e:Lcom/nineoldandroids/a/o;

    .line 192
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->e:Lcom/nineoldandroids/a/o;

    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->s:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Landroid/view/animation/Interpolator;)V

    .line 193
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->e:Lcom/nineoldandroids/a/o;

    iget v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->v:F

    div-float v1, v6, v1

    float-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    .line 194
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->e:Lcom/nineoldandroids/a/o;

    new-instance v1, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$2;-><init>(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 207
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->e:Lcom/nineoldandroids/a/o;

    new-instance v1, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$3;-><init>(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 235
    new-array v0, v4, [F

    iget v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->y:I

    int-to-float v1, v1

    aput v1, v0, v7

    iget v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->x:I

    int-to-float v1, v1

    aput v1, v0, v5

    invoke-static {v0}, Lcom/nineoldandroids/a/o;->b([F)Lcom/nineoldandroids/a/o;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->f:Lcom/nineoldandroids/a/o;

    .line 236
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->f:Lcom/nineoldandroids/a/o;

    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->s:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Landroid/view/animation/Interpolator;)V

    .line 237
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->f:Lcom/nineoldandroids/a/o;

    iget v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->v:F

    div-float v1, v6, v1

    float-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    .line 238
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->f:Lcom/nineoldandroids/a/o;

    new-instance v1, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$4;

    invoke-direct {v1, p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$4;-><init>(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 252
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->f:Lcom/nineoldandroids/a/o;

    new-instance v1, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;

    invoke-direct {v1, p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;-><init>(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 280
    new-array v0, v4, [F

    fill-array-data v0, :array_1

    invoke-static {v0}, Lcom/nineoldandroids/a/o;->b([F)Lcom/nineoldandroids/a/o;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->h:Lcom/nineoldandroids/a/o;

    .line 281
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->h:Lcom/nineoldandroids/a/o;

    sget-object v1, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->a:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Landroid/view/animation/Interpolator;)V

    .line 282
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->h:Lcom/nineoldandroids/a/o;

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    .line 283
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->h:Lcom/nineoldandroids/a/o;

    new-instance v1, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$6;

    invoke-direct {v1, p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$6;-><init>(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 289
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->h:Lcom/nineoldandroids/a/o;

    new-instance v1, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$7;

    invoke-direct {v1, p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$7;-><init>(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 314
    return-void

    .line 178
    nop

    :array_0
    .array-data 4
        0x0
        0x43b40000    # 360.0f
    .end array-data

    .line 280
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method static synthetic f(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)[I
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->u:[I

    return-object v0
.end method

.method static synthetic g(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)I
    .locals 1

    .prologue
    .line 47
    iget v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->l:I

    return v0
.end method

.method private g()V
    .locals 1

    .prologue
    .line 339
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->g:Lcom/nineoldandroids/a/o;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/o;->b()V

    .line 340
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->e:Lcom/nineoldandroids/a/o;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/o;->b()V

    .line 341
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->f:Lcom/nineoldandroids/a/o;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/o;->b()V

    .line 342
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->h:Lcom/nineoldandroids/a/o;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/o;->b()V

    .line 343
    return-void
.end method

.method static synthetic h(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)Landroid/graphics/Paint;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->j:Landroid/graphics/Paint;

    return-object v0
.end method

.method static synthetic i(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->d()V

    return-void
.end method

.method static synthetic j(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)I
    .locals 1

    .prologue
    .line 47
    iget v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->m:I

    return v0
.end method

.method static synthetic k(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)Lcom/nineoldandroids/a/o;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->e:Lcom/nineoldandroids/a/o;

    return-object v0
.end method


# virtual methods
.method public a(F)V
    .locals 0

    .prologue
    .line 386
    iput p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->p:F

    .line 387
    invoke-virtual {p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->invalidateSelf()V

    .line 388
    return-void
.end method

.method public b(F)V
    .locals 0

    .prologue
    .line 391
    iput p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->n:F

    .line 392
    invoke-virtual {p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->invalidateSelf()V

    .line 393
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    const/high16 v4, 0x43b40000    # 360.0f

    .line 123
    invoke-virtual {p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->isRunning()Z

    move-result v0

    if-nez v0, :cond_0

    .line 138
    :goto_0
    return-void

    .line 126
    :cond_0
    iget v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->p:F

    iget v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->o:F

    sub-float/2addr v0, v1

    .line 127
    iget v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->n:F

    .line 128
    iget-boolean v2, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->i:Z

    if-nez v2, :cond_1

    .line 129
    sub-float v2, v4, v1

    add-float/2addr v0, v2

    .line 131
    :cond_1
    rem-float v2, v0, v4

    .line 132
    iget v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->q:F

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v3

    if-gez v0, :cond_2

    .line 133
    iget v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->q:F

    mul-float v3, v1, v0

    .line 134
    sub-float v0, v1, v3

    add-float/2addr v0, v2

    rem-float v2, v0, v4

    .line 137
    :goto_1
    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->d:Landroid/graphics/RectF;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->j:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_2
    move v3, v1

    goto :goto_1
.end method

.method public getOpacity()I
    .locals 1

    .prologue
    .line 152
    const/4 v0, -0x3

    return v0
.end method

.method public isRunning()Z
    .locals 1

    .prologue
    .line 382
    iget-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->k:Z

    return v0
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 5

    .prologue
    const/high16 v4, 0x40000000    # 2.0f

    const/high16 v3, 0x3f000000    # 0.5f

    .line 157
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 158
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->d:Landroid/graphics/RectF;

    iget v1, p1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->t:F

    div-float/2addr v2, v4

    add-float/2addr v1, v2

    add-float/2addr v1, v3

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 159
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->d:Landroid/graphics/RectF;

    iget v1, p1, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->t:F

    div-float/2addr v2, v4

    sub-float/2addr v1, v2

    sub-float/2addr v1, v3

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 160
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->d:Landroid/graphics/RectF;

    iget v1, p1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->t:F

    div-float/2addr v2, v4

    add-float/2addr v1, v2

    add-float/2addr v1, v3

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 161
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->d:Landroid/graphics/RectF;

    iget v1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->t:F

    div-float/2addr v2, v4

    sub-float/2addr v1, v2

    sub-float/2addr v1, v3

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 162
    return-void
.end method

.method public setAlpha(I)V
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 143
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 148
    return-void
.end method

.method public start()V
    .locals 1

    .prologue
    .line 318
    invoke-virtual {p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 326
    :goto_0
    return-void

    .line 321
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->k:Z

    .line 322
    invoke-direct {p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->c()V

    .line 323
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->g:Lcom/nineoldandroids/a/o;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/o;->a()V

    .line 324
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->e:Lcom/nineoldandroids/a/o;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/o;->a()V

    .line 325
    invoke-virtual {p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->invalidateSelf()V

    goto :goto_0
.end method

.method public stop()V
    .locals 1

    .prologue
    .line 330
    invoke-virtual {p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->isRunning()Z

    move-result v0

    if-nez v0, :cond_0

    .line 336
    :goto_0
    return-void

    .line 333
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->k:Z

    .line 334
    invoke-direct {p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->g()V

    .line 335
    invoke-virtual {p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->invalidateSelf()V

    goto :goto_0
.end method
