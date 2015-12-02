.class Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;
.super Landroid/view/View;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$1;,
        Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$a;
    }
.end annotation


# instance fields
.field private A:F

.field private B:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$a;

.field private C:I

.field private D:I

.field private E:I

.field private F:D

.field public final a:I

.field public final b:I

.field c:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$a;

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:F

.field private final h:F

.field private final i:F

.field private final j:F

.field private final k:F

.field private final l:F

.field private final m:F

.field private final n:D

.field private o:Landroid/graphics/Path;

.field private p:Landroid/graphics/Path;

.field private q:Landroid/graphics/Paint;

.field private r:Landroid/graphics/Paint;

.field private s:I

.field private t:I

.field private u:F

.field private v:F

.field private w:I

.field private x:F

.field private y:F

.field private z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/16 v1, 0x64

    .line 66
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 15
    const/16 v0, 0x10

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->d:I

    .line 16
    const/16 v0, 0x8

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->e:I

    .line 17
    const/4 v0, 0x5

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->f:I

    .line 19
    const/high16 v0, 0x3fc00000    # 1.5f

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->g:F

    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->h:F

    .line 21
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->i:F

    .line 23
    const v0, 0x3e051eb8    # 0.13f

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->j:F

    .line 24
    const v0, 0x3db851ec    # 0.09f

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->k:F

    .line 25
    const v0, 0x3d4ccccd    # 0.05f

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->l:F

    .line 27
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->a:I

    .line 28
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->b:I

    .line 30
    const/high16 v0, 0x41a00000    # 20.0f

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->m:F

    .line 31
    const-wide v0, 0x401921fb54442d18L    # 6.283185307179586

    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->n:D

    .line 33
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->o:Landroid/graphics/Path;

    .line 35
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->p:Landroid/graphics/Path;

    .line 41
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->q:Landroid/graphics/Paint;

    .line 42
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->r:Landroid/graphics/Paint;

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->z:F

    .line 67
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    const/16 v1, 0x64

    .line 70
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 15
    const/16 v0, 0x10

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->d:I

    .line 16
    const/16 v0, 0x8

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->e:I

    .line 17
    const/4 v0, 0x5

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->f:I

    .line 19
    const/high16 v0, 0x3fc00000    # 1.5f

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->g:F

    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->h:F

    .line 21
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->i:F

    .line 23
    const v0, 0x3e051eb8    # 0.13f

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->j:F

    .line 24
    const v0, 0x3db851ec    # 0.09f

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->k:F

    .line 25
    const v0, 0x3d4ccccd    # 0.05f

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->l:F

    .line 27
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->a:I

    .line 28
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->b:I

    .line 30
    const/high16 v0, 0x41a00000    # 20.0f

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->m:F

    .line 31
    const-wide v0, 0x401921fb54442d18L    # 6.283185307179586

    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->n:D

    .line 33
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->o:Landroid/graphics/Path;

    .line 35
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->p:Landroid/graphics/Path;

    .line 41
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->q:Landroid/graphics/Paint;

    .line 42
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->r:Landroid/graphics/Paint;

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->z:F

    .line 72
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->f()V

    return-void
.end method

.method private c(I)F
    .locals 1

    .prologue
    .line 139
    packed-switch p1, :pswitch_data_0

    .line 147
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 141
    :pswitch_0
    const/high16 v0, 0x3fc00000    # 1.5f

    goto :goto_0

    .line 143
    :pswitch_1
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    .line 145
    :pswitch_2
    const/high16 v0, 0x3f000000    # 0.5f

    goto :goto_0

    .line 139
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private d(I)I
    .locals 1

    .prologue
    .line 151
    packed-switch p1, :pswitch_data_0

    .line 159
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 153
    :pswitch_0
    const/16 v0, 0x10

    goto :goto_0

    .line 155
    :pswitch_1
    const/16 v0, 0x8

    goto :goto_0

    .line 157
    :pswitch_2
    const/4 v0, 0x5

    goto :goto_0

    .line 151
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private e(I)F
    .locals 1

    .prologue
    .line 163
    packed-switch p1, :pswitch_data_0

    .line 171
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 165
    :pswitch_0
    const v0, 0x3e051eb8    # 0.13f

    goto :goto_0

    .line 167
    :pswitch_1
    const v0, 0x3db851ec    # 0.09f

    goto :goto_0

    .line 169
    :pswitch_2
    const v0, 0x3d4ccccd    # 0.05f

    goto :goto_0

    .line 163
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private f()V
    .locals 9

    .prologue
    const/high16 v8, 0x41a00000    # 20.0f

    const/4 v1, 0x0

    .line 178
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->o:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 179
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->p:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 181
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->h()V

    .line 184
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->o:Landroid/graphics/Path;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->C:I

    int-to-float v2, v2

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->E:I

    int-to-float v3, v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    move v0, v1

    .line 185
    :goto_0
    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->x:F

    cmpg-float v2, v0, v2

    if-gtz v2, :cond_0

    .line 186
    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->w:I

    int-to-double v2, v2

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->F:D

    float-to-double v6, v0

    mul-double/2addr v4, v6

    iget v6, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->z:F

    float-to-double v6, v6

    add-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->w:I

    int-to-double v4, v4

    add-double/2addr v2, v4

    double-to-float v2, v2

    .line 187
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->o:Landroid/graphics/Path;

    invoke-virtual {v3, v0, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 185
    add-float/2addr v0, v8

    goto :goto_0

    .line 189
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->o:Landroid/graphics/Path;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->D:I

    int-to-float v2, v2

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->E:I

    int-to-float v3, v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 191
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->p:Landroid/graphics/Path;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->C:I

    int-to-float v2, v2

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->E:I

    int-to-float v3, v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 192
    :goto_1
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->x:F

    cmpg-float v0, v1, v0

    if-gtz v0, :cond_1

    .line 193
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->w:I

    int-to-double v2, v0

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->F:D

    float-to-double v6, v1

    mul-double/2addr v4, v6

    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->A:F

    float-to-double v6, v0

    add-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->w:I

    int-to-double v4, v0

    add-double/2addr v2, v4

    double-to-float v0, v2

    .line 194
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->p:Landroid/graphics/Path;

    invoke-virtual {v2, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 192
    add-float/2addr v1, v8

    goto :goto_1

    .line 196
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->p:Landroid/graphics/Path;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->D:I

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->E:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 197
    return-void
.end method

.method private g()V
    .locals 4

    .prologue
    .line 215
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->getWidth()I

    move-result v0

    if-eqz v0, :cond_0

    .line 216
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->getWidth()I

    move-result v0

    .line 217
    int-to-float v0, v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->u:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->v:F

    .line 218
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->getLeft()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->C:I

    .line 219
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->getRight()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->D:I

    .line 220
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->getBottom()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->E:I

    .line 221
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->D:I

    int-to-float v0, v0

    const/high16 v1, 0x41a00000    # 20.0f

    add-float/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->x:F

    .line 222
    const-wide v0, 0x401921fb54442d18L    # 6.283185307179586

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->v:F

    float-to-double v2, v2

    div-double/2addr v0, v2

    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->F:D

    .line 224
    :cond_0
    return-void
.end method

.method private h()V
    .locals 4

    .prologue
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v2, 0x0

    .line 227
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->A:F

    cmpl-float v0, v0, v3

    if-lez v0, :cond_0

    .line 228
    iput v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->A:F

    .line 233
    :goto_0
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->z:F

    cmpl-float v0, v0, v3

    if-lez v0, :cond_1

    .line 234
    iput v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->z:F

    .line 238
    :goto_1
    return-void

    .line 230
    :cond_0
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->A:F

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->y:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->A:F

    goto :goto_0

    .line 236
    :cond_1
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->z:F

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->y:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->z:F

    goto :goto_1
.end method


# virtual methods
.method public a()Landroid/graphics/Path;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->p:Landroid/graphics/Path;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 98
    iput p1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->s:I

    .line 99
    return-void
.end method

.method public a(III)V
    .locals 3

    .prologue
    .line 118
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->c(I)F

    move-result v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->u:F

    .line 119
    invoke-direct {p0, p2}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->d(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->w:I

    .line 120
    invoke-direct {p0, p3}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->e(I)F

    move-result v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->y:F

    .line 121
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->w:I

    int-to-float v0, v0

    const v1, 0x3ecccccd    # 0.4f

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->A:F

    .line 122
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->w:I

    mul-int/lit8 v2, v2, 0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 123
    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 124
    return-void
.end method

.method public a(Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$a;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->c:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$a;

    .line 80
    return-void
.end method

.method public a(Z)V
    .locals 2

    .prologue
    .line 257
    if-eqz p1, :cond_1

    .line 258
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->B:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$a;

    if-eqz v0, :cond_0

    .line 259
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->B:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$a;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 265
    :cond_0
    :goto_0
    return-void

    .line 262
    :cond_1
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$a;-><init>(Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$1;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->B:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$a;

    .line 263
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->B:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$a;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public b()Landroid/graphics/Path;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->o:Landroid/graphics/Path;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .prologue
    .line 102
    iput p1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->t:I

    .line 103
    return-void
.end method

.method public c()Landroid/graphics/Paint;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->q:Landroid/graphics/Paint;

    return-object v0
.end method

.method public d()Landroid/graphics/Paint;
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->r:Landroid/graphics/Paint;

    return-object v0
.end method

.method public e()V
    .locals 4

    .prologue
    const/16 v3, 0x64

    const/4 v2, 0x1

    .line 127
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->q:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->s:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 128
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->q:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 129
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->q:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 130
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->q:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 132
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->r:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->t:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 133
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->r:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 134
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->r:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 135
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->r:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 136
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .prologue
    .line 201
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 202
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .prologue
    .line 84
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 85
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->p:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->r:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 86
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->o:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->q:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 87
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->c:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$a;

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->c:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$a;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$a;->a()V

    .line 90
    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .prologue
    .line 94
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 95
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 2

    .prologue
    .line 206
    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    .line 207
    if-eqz p1, :cond_0

    .line 208
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->v:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 209
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->g()V

    .line 212
    :cond_0
    return-void
.end method
