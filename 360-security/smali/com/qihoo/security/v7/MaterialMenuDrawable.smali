.class public Lcom/qihoo/security/v7/MaterialMenuDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "360Security"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/v7/MaterialMenuDrawable$5;,
        Lcom/qihoo/security/v7/MaterialMenuDrawable$a;,
        Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;,
        Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;,
        Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Z

.field private C:Lcom/nineoldandroids/a/k;

.field private D:Lcom/nineoldandroids/a/k;

.field private E:Lcom/qihoo/security/v7/MaterialMenuDrawable$a;

.field private F:Lcom/nineoldandroids/util/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/c",
            "<",
            "Lcom/qihoo/security/v7/MaterialMenuDrawable;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private G:Lcom/nineoldandroids/util/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/c",
            "<",
            "Lcom/qihoo/security/v7/MaterialMenuDrawable;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:F

.field private final g:F

.field private final h:I

.field private final i:I

.field private final j:F

.field private final k:F

.field private final l:F

.field private final m:F

.field private final n:F

.field private final o:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

.field private final p:Ljava/lang/Object;

.field private final q:Landroid/graphics/Paint;

.field private final r:Landroid/graphics/Paint;

.field private final s:Landroid/graphics/Paint;

.field private t:F

.field private u:F

.field private v:Z

.field private w:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

.field private x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

.field private y:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

.field private z:Z


# direct methods
.method private constructor <init>(ILcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;JJIIFFFF)V
    .locals 3

    .prologue
    .line 207
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 147
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->p:Ljava/lang/Object;

    .line 149
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->q:Landroid/graphics/Paint;

    .line 150
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->r:Landroid/graphics/Paint;

    .line 151
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->s:Landroid/graphics/Paint;

    .line 153
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->t:F

    .line 154
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->u:F

    .line 155
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->v:Z

    .line 157
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->BURGER:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->w:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    .line 158
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    .line 694
    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$1;

    const-class v1, Ljava/lang/Float;

    const-string/jumbo v2, "transformation"

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/v7/MaterialMenuDrawable$1;-><init>(Lcom/qihoo/security/v7/MaterialMenuDrawable;Ljava/lang/Class;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->F:Lcom/nineoldandroids/util/c;

    .line 707
    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$2;

    const-class v1, Ljava/lang/Float;

    const-string/jumbo v2, "pressedProgress"

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/v7/MaterialMenuDrawable$2;-><init>(Lcom/qihoo/security/v7/MaterialMenuDrawable;Ljava/lang/Class;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->G:Lcom/nineoldandroids/util/c;

    .line 208
    iput p12, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->b:F

    .line 209
    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v0, p12

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->c:F

    .line 210
    const/high16 v0, 0x40400000    # 3.0f

    mul-float/2addr v0, p12

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    .line 211
    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, p12

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e:F

    .line 212
    const/high16 v0, 0x40c00000    # 6.0f

    mul-float/2addr v0, p12

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->f:F

    .line 213
    const/high16 v0, 0x41000000    # 8.0f

    mul-float/2addr v0, p12

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->g:F

    .line 214
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, p12, v0

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a:F

    .line 215
    iput-object p2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->o:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    .line 216
    iput p7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    .line 217
    iput p8, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    .line 218
    iput p9, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->k:F

    .line 219
    iput p10, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->n:F

    .line 220
    iput p11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->j:F

    .line 221
    int-to-float v0, p7

    sub-float/2addr v0, p9

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    .line 222
    int-to-float v0, p8

    const/high16 v1, 0x40a00000    # 5.0f

    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    .line 224
    invoke-direct {p0, p1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d(I)V

    .line 225
    long-to-int v0, p3

    long-to-int v1, p5

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(II)V

    .line 227
    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;-><init>(Lcom/qihoo/security/v7/MaterialMenuDrawable;Lcom/qihoo/security/v7/MaterialMenuDrawable$1;)V

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->E:Lcom/qihoo/security/v7/MaterialMenuDrawable$a;

    .line 228
    return-void
.end method

.method synthetic constructor <init>(ILcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;JJIIFFFFLcom/qihoo/security/v7/MaterialMenuDrawable$1;)V
    .locals 1

    .prologue
    .line 22
    invoke-direct/range {p0 .. p12}, Lcom/qihoo/security/v7/MaterialMenuDrawable;-><init>(ILcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;JJIIFFFF)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;III)V
    .locals 5

    .prologue
    const/high16 v4, 0x42200000    # 40.0f

    const/4 v1, 0x0

    const/high16 v3, 0x40000000    # 2.0f

    .line 179
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 147
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->p:Ljava/lang/Object;

    .line 149
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->q:Landroid/graphics/Paint;

    .line 150
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->r:Landroid/graphics/Paint;

    .line 151
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->s:Landroid/graphics/Paint;

    .line 153
    iput v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->t:F

    .line 154
    iput v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->u:F

    .line 155
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->v:Z

    .line 157
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->BURGER:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->w:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    .line 158
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    .line 694
    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$1;

    const-class v1, Ljava/lang/Float;

    const-string/jumbo v2, "transformation"

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/v7/MaterialMenuDrawable$1;-><init>(Lcom/qihoo/security/v7/MaterialMenuDrawable;Ljava/lang/Class;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->F:Lcom/nineoldandroids/util/c;

    .line 707
    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$2;

    const-class v1, Ljava/lang/Float;

    const-string/jumbo v2, "pressedProgress"

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/v7/MaterialMenuDrawable$2;-><init>(Lcom/qihoo/security/v7/MaterialMenuDrawable;Ljava/lang/Class;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->G:Lcom/nineoldandroids/util/c;

    .line 180
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 182
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Landroid/content/res/Resources;F)F

    move-result v1

    int-to-float v2, p4

    mul-float/2addr v1, v2

    iput v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->b:F

    .line 183
    invoke-static {v0, v3}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Landroid/content/res/Resources;F)F

    move-result v1

    int-to-float v2, p4

    mul-float/2addr v1, v2

    iput v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->c:F

    .line 184
    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v0, v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Landroid/content/res/Resources;F)F

    move-result v1

    int-to-float v2, p4

    mul-float/2addr v1, v2

    iput v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    .line 185
    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Landroid/content/res/Resources;F)F

    move-result v1

    int-to-float v2, p4

    mul-float/2addr v1, v2

    iput v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e:F

    .line 186
    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Landroid/content/res/Resources;F)F

    move-result v1

    int-to-float v2, p4

    mul-float/2addr v1, v2

    iput v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->f:F

    .line 187
    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Landroid/content/res/Resources;F)F

    move-result v1

    int-to-float v2, p4

    mul-float/2addr v1, v2

    iput v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->g:F

    .line 188
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->b:F

    div-float/2addr v1, v3

    iput v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a:F

    .line 190
    iput-object p3, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->o:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    .line 191
    invoke-static {v0, v4}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Landroid/content/res/Resources;F)F

    move-result v1

    int-to-float v2, p4

    mul-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    .line 192
    invoke-static {v0, v4}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Landroid/content/res/Resources;F)F

    move-result v1

    int-to-float v2, p4

    mul-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    .line 193
    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Landroid/content/res/Resources;F)F

    move-result v1

    int-to-float v2, p4

    mul-float/2addr v1, v2

    iput v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->k:F

    .line 194
    const/high16 v1, 0x41900000    # 18.0f

    invoke-static {v0, v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Landroid/content/res/Resources;F)F

    move-result v1

    int-to-float v2, p4

    mul-float/2addr v1, v2

    iput v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->n:F

    .line 195
    invoke-static {p3}, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->a(Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Landroid/content/res/Resources;F)F

    move-result v0

    int-to-float v1, p4

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->j:F

    .line 197
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    int-to-float v0, v0

    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->k:F

    sub-float/2addr v0, v1

    div-float/2addr v0, v3

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    .line 198
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    int-to-float v0, v0

    const/high16 v1, 0x40a00000    # 5.0f

    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    div-float/2addr v0, v3

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    .line 200
    invoke-direct {p0, p2}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d(I)V

    .line 201
    invoke-direct {p0, p5, p6}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(II)V

    .line 203
    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;-><init>(Lcom/qihoo/security/v7/MaterialMenuDrawable;Lcom/qihoo/security/v7/MaterialMenuDrawable$1;)V

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->E:Lcom/qihoo/security/v7/MaterialMenuDrawable$a;

    .line 204
    return-void
.end method

.method private a(F)F
    .locals 3

    .prologue
    .line 559
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->b:[I

    iget-object v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->o:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 576
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 561
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ARROW_X:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->X_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    if-ne v0, v1, :cond_1

    .line 562
    :cond_0
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->f:F

    mul-float/2addr v1, p1

    sub-float/2addr v0, v1

    goto :goto_0

    .line 564
    :cond_1
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    mul-float/2addr v0, p1

    goto :goto_0

    .line 566
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ARROW_X:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->X_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    if-ne v0, v1, :cond_3

    .line 567
    :cond_2
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a:F

    add-float/2addr v0, v1

    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->f:F

    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a:F

    add-float/2addr v1, v2

    mul-float/2addr v1, p1

    sub-float/2addr v0, v1

    goto :goto_0

    .line 569
    :cond_3
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a:F

    add-float/2addr v0, v1

    mul-float/2addr v0, p1

    goto :goto_0

    .line 571
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ARROW_X:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->X_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    if-ne v0, v1, :cond_5

    .line 572
    :cond_4
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e:F

    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->f:F

    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->b:F

    add-float/2addr v1, v2

    mul-float/2addr v1, p1

    sub-float/2addr v0, v1

    goto :goto_0

    .line 574
    :cond_5
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e:F

    mul-float/2addr v0, p1

    goto :goto_0

    .line 559
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static a(Landroid/content/res/Resources;F)F
    .locals 2

    .prologue
    .line 893
    const/4 v0, 0x1

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v0, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/v7/MaterialMenuDrawable;F)F
    .locals 0

    .prologue
    .line 22
    iput p1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->u:F

    return p1
.end method

.method static synthetic a(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->y:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    return-object v0
.end method

.method private a(II)V
    .locals 4

    .prologue
    .line 740
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->F:Lcom/nineoldandroids/util/c;

    const/4 v1, 0x1

    new-array v1, v1, [F

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput v3, v1, v2

    invoke-static {p0, v0, v1}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Lcom/nineoldandroids/util/c;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->C:Lcom/nineoldandroids/a/k;

    .line 742
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->C:Lcom/nineoldandroids/a/k;

    int-to-long v2, p1

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 743
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->C:Lcom/nineoldandroids/a/k;

    new-instance v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable$3;-><init>(Lcom/qihoo/security/v7/MaterialMenuDrawable;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 751
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->G:Lcom/nineoldandroids/util/c;

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {p0, v0, v1}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Lcom/nineoldandroids/util/c;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->D:Lcom/nineoldandroids/a/k;

    .line 752
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->D:Lcom/nineoldandroids/a/k;

    int-to-long v2, p2

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 753
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->D:Lcom/nineoldandroids/a/k;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 754
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->D:Lcom/nineoldandroids/a/k;

    new-instance v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$4;

    invoke-direct {v1, p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable$4;-><init>(Lcom/qihoo/security/v7/MaterialMenuDrawable;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 765
    return-void

    .line 751
    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 274
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 275
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->u:F

    iget-object v3, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->s:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 276
    return-void
.end method

.method private a(Landroid/graphics/Canvas;F)V
    .locals 12

    .prologue
    .line 279
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 280
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 282
    const/4 v3, 0x0

    .line 283
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v7, v0

    .line 284
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v8, v0

    .line 285
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    .line 286
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    const/high16 v4, 0x40a00000    # 5.0f

    mul-float/2addr v2, v4

    add-float/2addr v2, v0

    .line 287
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    int-to-float v0, v0

    iget v4, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    sub-float v6, v0, v4

    .line 288
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    iget v4, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40a00000    # 5.0f

    mul-float/2addr v4, v5

    add-float/2addr v4, v0

    .line 289
    const/16 v5, 0xff

    .line 291
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->a:[I

    iget-object v9, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    invoke-virtual {v9}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ordinal()I

    move-result v9

    aget v0, v0, v9

    packed-switch v0, :pswitch_data_0

    move v0, v5

    move v5, v7

    move v11, v6

    move v6, v3

    move v3, v11

    .line 347
    :goto_0
    iget-object v7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->r:Landroid/graphics/Paint;

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 348
    invoke-virtual {p1, v6, v5, v8}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 349
    iget-object v5, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->r:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 350
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->r:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 351
    return-void

    .line 294
    :pswitch_0
    invoke-direct {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 295
    const/high16 v0, 0x43340000    # 180.0f

    mul-float/2addr v0, p2

    .line 300
    :goto_1
    invoke-direct {p0, p2}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(F)F

    move-result v3

    mul-float/2addr v3, p2

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v3, v9

    sub-float v3, v6, v3

    move v6, v0

    move v0, v5

    move v5, v7

    .line 301
    goto :goto_0

    .line 297
    :cond_0
    const/high16 v0, 0x43340000    # 180.0f

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v3, p2

    const/high16 v9, 0x43340000    # 180.0f

    mul-float/2addr v3, v9

    add-float/2addr v0, v3

    goto :goto_1

    .line 304
    :pswitch_1
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p2

    const/high16 v5, 0x437f0000    # 255.0f

    mul-float/2addr v0, v5

    float-to-int v0, v0

    move v5, v7

    move v11, v6

    move v6, v3

    move v3, v11

    .line 305
    goto :goto_0

    .line 308
    :pswitch_2
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p2

    const/high16 v5, 0x437f0000    # 255.0f

    mul-float/2addr v0, v5

    float-to-int v0, v0

    .line 309
    const/high16 v5, 0x3f800000    # 1.0f

    sub-float/2addr v5, p2

    iget v9, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->c:F

    mul-float/2addr v5, v9

    add-float/2addr v1, v5

    move v5, v7

    move v11, v6

    move v6, v3

    move v3, v11

    .line 310
    goto :goto_0

    .line 312
    :pswitch_3
    invoke-direct {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 314
    const/high16 v0, 0x43070000    # 135.0f

    mul-float v3, p2, v0

    .line 316
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v0, v7

    iget v7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e:F

    mul-float/2addr v7, p2

    add-float/2addr v0, v7

    add-float/2addr v1, v0

    .line 317
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->g:F

    iget v7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a:F

    add-float/2addr v0, v7

    mul-float/2addr v0, p2

    add-float/2addr v0, v6

    .line 325
    :goto_2
    iget v6, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v6, v6, 0x2

    int-to-float v6, v6

    iget v7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    const/high16 v9, 0x40000000    # 2.0f

    mul-float/2addr v7, v9

    add-float/2addr v6, v7

    move v11, v5

    move v5, v6

    move v6, v3

    move v3, v0

    move v0, v11

    .line 326
    goto/16 :goto_0

    .line 320
    :cond_1
    const/high16 v0, 0x43070000    # 135.0f

    const/high16 v3, 0x43070000    # 135.0f

    const/high16 v7, 0x3f800000    # 1.0f

    sub-float/2addr v7, p2

    mul-float/2addr v3, v7

    sub-float v3, v0, v3

    .line 322
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v0, v7

    iget v7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e:F

    add-float/2addr v0, v7

    const/high16 v7, 0x3f800000    # 1.0f

    sub-float/2addr v7, p2

    iget v9, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->c:F

    iget v10, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a:F

    add-float/2addr v9, v10

    mul-float/2addr v7, v9

    sub-float/2addr v0, v7

    add-float/2addr v1, v0

    .line 323
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->g:F

    const/high16 v7, 0x3f800000    # 1.0f

    sub-float/2addr v7, p2

    iget v9, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->c:F

    iget v10, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->f:F

    add-float/2addr v9, v10

    mul-float/2addr v7, v9

    sub-float/2addr v0, v7

    add-float/2addr v0, v6

    goto :goto_2

    .line 329
    :pswitch_4
    const/high16 v0, 0x43070000    # 135.0f

    mul-float v7, p2, v0

    .line 331
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e:F

    iget v3, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v3, v9

    add-float/2addr v0, v3

    mul-float/2addr v0, p2

    add-float/2addr v1, v0

    .line 332
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->g:F

    iget v3, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a:F

    add-float/2addr v0, v3

    mul-float/2addr v0, p2

    add-float v3, v6, v0

    .line 333
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iget v6, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    const/high16 v9, 0x40000000    # 2.0f

    mul-float/2addr v6, v9

    add-float/2addr v0, v6

    move v6, v7

    move v11, v0

    move v0, v5

    move v5, v11

    .line 334
    goto/16 :goto_0

    .line 337
    :pswitch_5
    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr v0, p2

    float-to-int v0, v0

    .line 339
    const/high16 v3, 0x43070000    # 135.0f

    mul-float v7, p2, v3

    .line 341
    iget v3, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e:F

    iget v5, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v5, v9

    add-float/2addr v3, v5

    mul-float/2addr v3, p2

    add-float/2addr v1, v3

    .line 342
    iget v3, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->g:F

    iget v5, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a:F

    add-float/2addr v3, v5

    mul-float/2addr v3, p2

    add-float/2addr v3, v6

    .line 343
    iget v5, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v5, v5, 0x2

    int-to-float v5, v5

    iget v6, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    const/high16 v9, 0x40000000    # 2.0f

    mul-float/2addr v6, v9

    add-float/2addr v5, v6

    move v6, v7

    goto/16 :goto_0

    .line 291
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method static synthetic a(Lcom/qihoo/security/v7/MaterialMenuDrawable;Z)Z
    .locals 0

    .prologue
    .line 22
    iput-boolean p1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->v:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Landroid/graphics/Paint;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->s:Landroid/graphics/Paint;

    return-object v0
.end method

.method private b(Landroid/graphics/Canvas;F)V
    .locals 15

    .prologue
    .line 354
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 356
    const/4 v10, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x0

    .line 357
    const/4 v7, 0x0

    .line 359
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float v11, v1, v2

    .line 360
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->c:F

    add-float v12, v1, v2

    .line 362
    iget v6, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    .line 363
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->c:F

    add-float v3, v1, v2

    .line 364
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    sub-float v4, v1, v2

    .line 365
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->c:F

    add-float v5, v1, v2

    .line 366
    const/16 v2, 0xff

    .line 368
    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->a:[I

    iget-object v13, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    invoke-virtual {v13}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ordinal()I

    move-result v13

    aget v1, v1, v13

    packed-switch v1, :pswitch_data_0

    move v1, v2

    move v2, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    .line 440
    :goto_0
    iget-object v10, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->r:Landroid/graphics/Paint;

    invoke-virtual {v10, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 441
    move-object/from16 v0, p1

    invoke-virtual {v0, v9, v8, v7}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 442
    move-object/from16 v0, p1

    invoke-virtual {v0, v6, v11, v12}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 443
    iget-object v6, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->r:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 444
    iget-object v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->r:Landroid/graphics/Paint;

    const/16 v2, 0xff

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 445
    return-void

    .line 370
    :pswitch_0
    invoke-direct {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 372
    const/high16 v1, 0x43610000    # 225.0f

    mul-float v1, v1, p2

    .line 378
    :goto_1
    iget v8, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v8, v8, 0x2

    int-to-float v9, v8

    .line 379
    iget v8, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    div-int/lit8 v8, v8, 0x2

    int-to-float v8, v8

    .line 382
    move/from16 v0, p2

    invoke-direct {p0, v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(F)F

    move-result v10

    sub-float/2addr v4, v10

    .line 383
    iget v10, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    mul-float v10, v10, p2

    add-float/2addr v6, v10

    move v14, v2

    move v2, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v1

    move v1, v14

    .line 385
    goto :goto_0

    .line 375
    :cond_0
    const/high16 v1, 0x43610000    # 225.0f

    const/high16 v8, 0x3f800000    # 1.0f

    sub-float v8, v8, p2

    const/high16 v9, 0x43070000    # 135.0f

    mul-float/2addr v8, v9

    add-float/2addr v1, v8

    goto :goto_1

    .line 388
    :pswitch_1
    const/high16 v1, 0x42300000    # 44.0f

    mul-float v9, v1, p2

    .line 389
    const/high16 v1, 0x42b40000    # 90.0f

    mul-float v1, v1, p2

    .line 392
    iget v7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    iget v8, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e:F

    add-float/2addr v8, v7

    .line 393
    iget v7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    iget v10, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    add-float/2addr v7, v10

    .line 396
    iget v10, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    mul-float v10, v10, p2

    add-float/2addr v4, v10

    move v14, v2

    move v2, v6

    move v6, v1

    move v1, v14

    .line 397
    goto :goto_0

    .line 400
    :pswitch_2
    const/high16 v1, 0x43610000    # 225.0f

    const/high16 v7, -0x3ccb0000    # -181.0f

    mul-float v7, v7, p2

    add-float v10, v1, v7

    .line 401
    const/high16 v1, 0x42b40000    # 90.0f

    mul-float v7, v1, p2

    .line 404
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v8, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    iget v9, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e:F

    add-float/2addr v8, v9

    iget v9, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v9, v9, 0x2

    int-to-float v9, v9

    sub-float/2addr v8, v9

    mul-float v8, v8, p2

    add-float v9, v1, v8

    .line 405
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v8, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    iget v13, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    add-float/2addr v8, v13

    iget v13, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    div-int/lit8 v13, v13, 0x2

    int-to-float v13, v13

    sub-float/2addr v8, v13

    mul-float v8, v8, p2

    add-float/2addr v8, v1

    .line 408
    move/from16 v0, p2

    invoke-direct {p0, v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(F)F

    move-result v1

    sub-float/2addr v4, v1

    .line 409
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    const/high16 v13, 0x3f800000    # 1.0f

    sub-float v13, v13, p2

    mul-float/2addr v1, v13

    add-float/2addr v1, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    move v14, v2

    move v2, v1

    move v1, v14

    .line 410
    goto/16 :goto_0

    .line 413
    :pswitch_3
    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v1, v1, p2

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    .line 415
    const/high16 v10, 0x43610000    # 225.0f

    .line 416
    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v9, v2

    .line 417
    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v8, v2

    .line 420
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {p0, v2}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(F)F

    move-result v2

    sub-float/2addr v4, v2

    .line 421
    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    add-float/2addr v2, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    .line 422
    goto/16 :goto_0

    .line 425
    :pswitch_4
    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v1, v1, p2

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    move v2, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    .line 426
    goto/16 :goto_0

    .line 429
    :pswitch_5
    const/high16 v9, 0x42300000    # 44.0f

    .line 430
    const/high16 v2, 0x42b40000    # 90.0f

    .line 431
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    iget v7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e:F

    add-float v8, v1, v7

    .line 432
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    iget v7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    add-float/2addr v7, v1

    .line 433
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    add-float/2addr v4, v1

    .line 436
    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v1, v1, p2

    const/high16 v10, 0x437f0000    # 255.0f

    mul-float/2addr v1, v10

    float-to-int v1, v1

    move v14, v6

    move v6, v2

    move v2, v14

    goto/16 :goto_0

    .line 368
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method static synthetic c(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->o:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    return-object v0
.end method

.method private c(Landroid/graphics/Canvas;F)V
    .locals 15

    .prologue
    .line 448
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 449
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 451
    const/4 v8, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x0

    .line 452
    const/4 v6, 0x0

    .line 454
    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    iget v3, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float v9, v2, v3

    .line 455
    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    int-to-float v2, v2

    iget v3, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->c:F

    sub-float v10, v2, v3

    .line 457
    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    .line 458
    iget v3, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    int-to-float v3, v3

    iget v4, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->c:F

    sub-float/2addr v3, v4

    .line 459
    iget v4, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    int-to-float v4, v4

    iget v5, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    sub-float/2addr v4, v5

    .line 460
    iget v5, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    int-to-float v5, v5

    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    sub-float/2addr v5, v11

    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->c:F

    sub-float/2addr v5, v11

    .line 462
    sget-object v11, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->a:[I

    iget-object v12, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    invoke-virtual {v12}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ordinal()I

    move-result v12

    aget v11, v11, v12

    packed-switch v11, :pswitch_data_0

    move v14, v6

    move v6, v1

    move v1, v14

    .line 549
    :goto_0
    move-object/from16 v0, p1

    invoke-virtual {v0, v8, v7, v6}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 550
    move-object/from16 v0, p1

    invoke-virtual {v0, v1, v9, v10}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 551
    iget-object v6, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->r:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 552
    return-void

    .line 464
    :pswitch_0
    invoke-direct {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 466
    const/high16 v1, 0x43070000    # 135.0f

    mul-float v1, v1, p2

    .line 472
    :goto_1
    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v8, v2

    .line 473
    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v7, v2

    .line 476
    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    int-to-float v2, v2

    iget v4, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    sub-float/2addr v2, v4

    move/from16 v0, p2

    invoke-direct {p0, v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(F)F

    move-result v4

    sub-float v4, v2, v4

    .line 477
    iget v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    mul-float v11, v11, p2

    add-float/2addr v2, v11

    move v14, v6

    move v6, v7

    move v7, v8

    move v8, v1

    move v1, v14

    .line 478
    goto :goto_0

    .line 469
    :cond_0
    const/high16 v1, 0x43070000    # 135.0f

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v2, v2, p2

    const/high16 v4, 0x43610000    # 225.0f

    mul-float/2addr v2, v4

    add-float/2addr v1, v2

    goto :goto_1

    .line 480
    :pswitch_1
    invoke-direct {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 482
    const/high16 v1, -0x3d4c0000    # -90.0f

    mul-float v1, v1, p2

    .line 488
    :goto_2
    const/high16 v6, -0x3dd00000    # -44.0f

    mul-float v8, v6, p2

    .line 491
    iget v6, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    iget v7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e:F

    add-float/2addr v7, v6

    .line 492
    iget v6, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    int-to-float v6, v6

    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    sub-float/2addr v6, v11

    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    sub-float/2addr v6, v11

    .line 495
    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    mul-float v11, v11, p2

    add-float/2addr v4, v11

    .line 496
    goto :goto_0

    .line 485
    :cond_1
    const/high16 v1, 0x42b40000    # 90.0f

    mul-float v1, v1, p2

    goto :goto_2

    .line 499
    :pswitch_2
    const/high16 v1, 0x43070000    # 135.0f

    const/high16 v6, 0x43350000    # 181.0f

    mul-float v6, v6, p2

    add-float v8, v1, v6

    .line 500
    const/high16 v1, -0x3d4c0000    # -90.0f

    mul-float v1, v1, p2

    .line 503
    iget v6, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v6, v6, 0x2

    int-to-float v6, v6

    iget v7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e:F

    add-float/2addr v7, v11

    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v11, v11, 0x2

    int-to-float v11, v11

    sub-float/2addr v7, v11

    mul-float v7, v7, p2

    add-float/2addr v7, v6

    .line 504
    iget v6, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    div-int/lit8 v6, v6, 0x2

    int-to-float v6, v6

    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    div-int/lit8 v11, v11, 0x2

    int-to-float v11, v11

    iget v12, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    sub-float/2addr v11, v12

    iget v12, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    sub-float/2addr v11, v12

    mul-float v11, v11, p2

    add-float/2addr v6, v11

    .line 507
    move/from16 v0, p2

    invoke-direct {p0, v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(F)F

    move-result v11

    sub-float/2addr v4, v11

    .line 508
    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    const/high16 v12, 0x3f800000    # 1.0f

    sub-float v12, v12, p2

    mul-float/2addr v11, v12

    add-float/2addr v2, v11

    .line 509
    goto/16 :goto_0

    .line 512
    :pswitch_3
    const/high16 v1, 0x43070000    # 135.0f

    const/high16 v7, -0x3d4c0000    # -90.0f

    mul-float v7, v7, p2

    add-float v8, v1, v7

    .line 515
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    mul-float v7, v7, p2

    sub-float v7, v1, v7

    .line 516
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    mul-float v11, v11, p2

    sub-float/2addr v1, v11

    .line 519
    const/high16 v11, 0x3f800000    # 1.0f

    invoke-direct {p0, v11}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(F)F

    move-result v11

    sub-float/2addr v4, v11

    .line 520
    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    add-float/2addr v2, v11

    move v14, v6

    move v6, v1

    move v1, v14

    .line 521
    goto/16 :goto_0

    .line 524
    :pswitch_4
    const/high16 v1, 0x42340000    # 45.0f

    mul-float v8, p2, v1

    .line 527
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    mul-float v7, v7, p2

    sub-float v7, v1, v7

    .line 528
    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    mul-float v11, v11, p2

    sub-float/2addr v1, v11

    .line 531
    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    mul-float v11, v11, p2

    add-float/2addr v2, v11

    .line 532
    move/from16 v0, p2

    invoke-direct {p0, v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(F)F

    move-result v11

    sub-float/2addr v4, v11

    move v14, v6

    move v6, v1

    move v1, v14

    .line 533
    goto/16 :goto_0

    .line 536
    :pswitch_5
    const/high16 v1, -0x3d4c0000    # -90.0f

    const/high16 v6, 0x3f800000    # 1.0f

    sub-float v6, v6, p2

    mul-float/2addr v1, v6

    .line 537
    const/high16 v6, -0x3dd00000    # -44.0f

    const/high16 v7, 0x42b20000    # 89.0f

    mul-float v7, v7, p2

    add-float v8, v6, v7

    .line 540
    iget v6, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    iget v7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e:F

    add-float/2addr v6, v7

    iget v7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    div-int/lit8 v7, v7, 0x2

    int-to-float v7, v7

    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->m:F

    sub-float/2addr v7, v11

    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    sub-float/2addr v7, v11

    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e:F

    sub-float/2addr v7, v11

    mul-float v7, v7, p2

    add-float/2addr v7, v6

    .line 541
    iget v6, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    int-to-float v6, v6

    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    sub-float/2addr v6, v11

    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    sub-float/2addr v6, v11

    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->l:F

    iget v12, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    div-int/lit8 v12, v12, 0x2

    int-to-float v12, v12

    add-float/2addr v11, v12

    iget v12, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    int-to-float v12, v12

    sub-float/2addr v11, v12

    mul-float v11, v11, p2

    add-float/2addr v6, v11

    .line 544
    iget v11, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    iget v12, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->d:F

    const/high16 v13, 0x3f800000    # 1.0f

    sub-float v13, v13, p2

    mul-float/2addr v12, v13

    sub-float/2addr v11, v12

    add-float/2addr v2, v11

    .line 545
    const/high16 v11, 0x3f800000    # 1.0f

    sub-float v11, v11, p2

    invoke-direct {p0, v11}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(F)F

    move-result v11

    sub-float/2addr v4, v11

    goto/16 :goto_0

    .line 462
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method static synthetic d(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Lcom/nineoldandroids/a/k;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->C:Lcom/nineoldandroids/a/k;

    return-object v0
.end method

.method private d(I)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 231
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->q:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 232
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->q:Landroid/graphics/Paint;

    const v1, -0xff0100

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 233
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->q:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 235
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->r:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 236
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->r:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 237
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->r:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->j:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 238
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->r:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 240
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->s:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 241
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->s:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 242
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->s:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 243
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->s:Landroid/graphics/Paint;

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 245
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    invoke-virtual {p0, v2, v2, v0, v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->setBounds(IIII)V

    .line 246
    return-void
.end method

.method private d()Z
    .locals 2

    .prologue
    .line 555
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->t:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic e(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Lcom/nineoldandroids/a/k;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->D:Lcom/nineoldandroids/a/k;

    return-object v0
.end method

.method private e()Z
    .locals 11

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 768
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->w:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    sget-object v3, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->BURGER:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    if-ne v0, v3, :cond_2

    move v0, v1

    .line 769
    :goto_0
    iget-object v3, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->w:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    sget-object v4, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    if-ne v3, v4, :cond_3

    move v3, v1

    .line 770
    :goto_1
    iget-object v4, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->w:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    sget-object v5, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->X:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    if-ne v4, v5, :cond_4

    move v4, v1

    .line 771
    :goto_2
    iget-object v5, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->w:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    sget-object v6, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    if-ne v5, v6, :cond_5

    move v5, v1

    .line 772
    :goto_3
    iget-object v6, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->y:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    sget-object v7, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->BURGER:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    if-ne v6, v7, :cond_6

    move v6, v1

    .line 773
    :goto_4
    iget-object v7, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->y:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    sget-object v8, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    if-ne v7, v8, :cond_7

    move v7, v1

    .line 774
    :goto_5
    iget-object v8, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->y:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    sget-object v9, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->X:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    if-ne v8, v9, :cond_8

    move v8, v1

    .line 775
    :goto_6
    iget-object v9, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->y:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    sget-object v10, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    if-ne v9, v10, :cond_9

    move v9, v1

    .line 777
    :goto_7
    if-eqz v0, :cond_0

    if-nez v7, :cond_1

    :cond_0
    if-eqz v3, :cond_a

    if-eqz v6, :cond_a

    .line 778
    :cond_1
    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    iput-object v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    .line 804
    :goto_8
    return v0

    :cond_2
    move v0, v2

    .line 768
    goto :goto_0

    :cond_3
    move v3, v2

    .line 769
    goto :goto_1

    :cond_4
    move v4, v2

    .line 770
    goto :goto_2

    :cond_5
    move v5, v2

    .line 771
    goto :goto_3

    :cond_6
    move v6, v2

    .line 772
    goto :goto_4

    :cond_7
    move v7, v2

    .line 773
    goto :goto_5

    :cond_8
    move v8, v2

    .line 774
    goto :goto_6

    :cond_9
    move v9, v2

    .line 775
    goto :goto_7

    .line 782
    :cond_a
    if-eqz v3, :cond_b

    if-nez v8, :cond_c

    :cond_b
    if-eqz v4, :cond_d

    if-eqz v7, :cond_d

    .line 783
    :cond_c
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ARROW_X:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    move v0, v3

    .line 784
    goto :goto_8

    .line 787
    :cond_d
    if-eqz v0, :cond_e

    if-nez v8, :cond_f

    :cond_e
    if-eqz v4, :cond_10

    if-eqz v6, :cond_10

    .line 788
    :cond_f
    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_X:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    iput-object v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    goto :goto_8

    .line 792
    :cond_10
    if-eqz v3, :cond_11

    if-nez v9, :cond_12

    :cond_11
    if-eqz v5, :cond_13

    if-eqz v7, :cond_13

    .line 793
    :cond_12
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ARROW_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    move v0, v3

    .line 794
    goto :goto_8

    .line 797
    :cond_13
    if-eqz v0, :cond_14

    if-nez v9, :cond_15

    :cond_14
    if-eqz v5, :cond_16

    if-eqz v6, :cond_16

    .line 798
    :cond_15
    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    iput-object v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    goto :goto_8

    .line 802
    :cond_16
    if-eqz v4, :cond_17

    if-nez v9, :cond_18

    :cond_17
    if-eqz v5, :cond_19

    if-eqz v8, :cond_19

    .line 803
    :cond_18
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->X_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    move v0, v4

    .line 804
    goto :goto_8

    .line 807
    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v3, "Animating from %s to %s is not supported"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->w:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    aput-object v5, v4, v2

    iget-object v2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->y:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    aput-object v2, v4, v1

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic f(Lcom/qihoo/security/v7/MaterialMenuDrawable;)I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    return v0
.end method

.method static synthetic g(Lcom/qihoo/security/v7/MaterialMenuDrawable;)I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    return v0
.end method

.method static synthetic h(Lcom/qihoo/security/v7/MaterialMenuDrawable;)F
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->k:F

    return v0
.end method

.method static synthetic i(Lcom/qihoo/security/v7/MaterialMenuDrawable;)F
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->n:F

    return v0
.end method

.method static synthetic j(Lcom/qihoo/security/v7/MaterialMenuDrawable;)F
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->j:F

    return v0
.end method

.method static synthetic k(Lcom/qihoo/security/v7/MaterialMenuDrawable;)F
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->b:F

    return v0
.end method

.method static synthetic l(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->w:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    return-object v0
.end method

.method static synthetic m(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Z
    .locals 1

    .prologue
    .line 22
    iget-boolean v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->B:Z

    return v0
.end method


# virtual methods
.method public a()Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;
    .locals 1

    .prologue
    .line 688
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->w:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    return-object v0
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 599
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->r:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 600
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->s:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 601
    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->invalidateSelf()V

    .line 602
    return-void
.end method

.method public a(Landroid/view/animation/Interpolator;)V
    .locals 1

    .prologue
    .line 613
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->C:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0, p1}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 614
    return-void
.end method

.method public a(Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;)V
    .locals 3

    .prologue
    .line 621
    iget-object v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->p:Ljava/lang/Object;

    monitor-enter v1

    .line 622
    :try_start_0
    iget-boolean v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->v:Z

    if-eqz v0, :cond_0

    .line 623
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->C:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->b()V

    .line 624
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->v:Z

    .line 627
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->w:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    if-ne v0, p1, :cond_1

    .line 628
    monitor-exit v1

    .line 650
    :goto_0
    return-void

    .line 630
    :cond_1
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->c:[I

    invoke-virtual {p1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ordinal()I

    move-result v2

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    .line 647
    :goto_1
    iput-object p1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->w:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    .line 648
    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->invalidateSelf()V

    .line 649
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 632
    :pswitch_0
    :try_start_1
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    .line 633
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->t:F

    goto :goto_1

    .line 636
    :pswitch_1
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    .line 637
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->t:F

    goto :goto_1

    .line 640
    :pswitch_2
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_X:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    .line 641
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->t:F

    goto :goto_1

    .line 644
    :pswitch_3
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->x:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    .line 645
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->t:F
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 630
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public a(Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;Z)V
    .locals 2

    .prologue
    .line 653
    iget-object v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->p:Ljava/lang/Object;

    monitor-enter v1

    .line 654
    :try_start_0
    iget-boolean v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->v:Z

    if-eqz v0, :cond_0

    .line 655
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->C:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->c()V

    .line 656
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->D:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->c()V

    .line 658
    :cond_0
    iput-boolean p2, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->z:Z

    .line 659
    iput-object p1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->y:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    .line 660
    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->start()V

    .line 661
    monitor-exit v1

    .line 662
    return-void

    .line 661
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/Float;)V
    .locals 1

    .prologue
    .line 725
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->t:F

    .line 726
    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->invalidateSelf()V

    .line 727
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 683
    iput-boolean p1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->B:Z

    .line 684
    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->invalidateSelf()V

    .line 685
    return-void
.end method

.method public b()Ljava/lang/Float;
    .locals 1

    .prologue
    .line 721
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->t:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public b(I)V
    .locals 4

    .prologue
    .line 605
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->C:Lcom/nineoldandroids/a/k;

    int-to-long v2, p1

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 606
    return-void
.end method

.method public b(Ljava/lang/Float;)V
    .locals 6

    .prologue
    .line 734
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->u:F

    .line 735
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->s:Landroid/graphics/Paint;

    const/high16 v1, 0x43480000    # 200.0f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v3

    iget v4, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->n:F

    const v5, 0x3f9c28f6    # 1.22f

    mul-float/2addr v4, v5

    div-float/2addr v3, v4

    sub-float/2addr v2, v3

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 736
    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->invalidateSelf()V

    .line 737
    return-void
.end method

.method public c()Ljava/lang/Float;
    .locals 1

    .prologue
    .line 730
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->u:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public c(I)V
    .locals 4

    .prologue
    .line 609
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->D:Lcom/nineoldandroids/a/k;

    int-to-long v2, p1

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 610
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    .line 253
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->t:F

    cmpg-float v0, v0, v3

    if-gtz v0, :cond_3

    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->t:F

    .line 255
    :goto_0
    iget-boolean v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->B:Z

    if-eqz v1, :cond_0

    .line 256
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 257
    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {p1, v1, v3, v2, v2}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 258
    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->getIntrinsicWidth()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 261
    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->b(Landroid/graphics/Canvas;F)V

    .line 262
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Landroid/graphics/Canvas;F)V

    .line 263
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->c(Landroid/graphics/Canvas;F)V

    .line 265
    iget-boolean v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->B:Z

    if-eqz v0, :cond_1

    .line 266
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 269
    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->z:Z

    if-eqz v0, :cond_2

    .line 270
    invoke-direct {p0, p1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Landroid/graphics/Canvas;)V

    .line 271
    :cond_2
    return-void

    .line 253
    :cond_3
    const/high16 v0, 0x40000000    # 2.0f

    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->t:F

    sub-float/2addr v0, v1

    goto :goto_0
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 2

    .prologue
    .line 860
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->E:Lcom/qihoo/security/v7/MaterialMenuDrawable$a;

    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->getChangingConfigurations()I

    move-result v1

    invoke-static {v0, v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;->a(Lcom/qihoo/security/v7/MaterialMenuDrawable$a;I)I

    .line 861
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->E:Lcom/qihoo/security/v7/MaterialMenuDrawable$a;

    return-object v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    .prologue
    .line 855
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->i:I

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    .prologue
    .line 850
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->h:I

    return v0
.end method

.method public getOpacity()I
    .locals 1

    .prologue
    .line 591
    const/4 v0, -0x2

    return v0
.end method

.method public isRunning()Z
    .locals 1

    .prologue
    .line 845
    iget-boolean v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->v:Z

    return v0
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 866
    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$a;-><init>(Lcom/qihoo/security/v7/MaterialMenuDrawable;Lcom/qihoo/security/v7/MaterialMenuDrawable$1;)V

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->E:Lcom/qihoo/security/v7/MaterialMenuDrawable$a;

    .line 867
    return-object p0
.end method

.method public setAlpha(I)V
    .locals 1

    .prologue
    .line 581
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->r:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 582
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .prologue
    .line 586
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->r:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 587
    return-void
.end method

.method public start()V
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    const/4 v6, 0x1

    .line 813
    iget-boolean v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->v:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->y:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->y:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    iget-object v3, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->w:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    if-ne v0, v3, :cond_1

    .line 831
    :cond_0
    :goto_0
    return-void

    .line 815
    :cond_1
    iput-boolean v6, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->v:Z

    .line 817
    invoke-direct {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->e()Z

    move-result v3

    .line 818
    iget-object v4, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->C:Lcom/nineoldandroids/a/k;

    new-array v5, v8, [F

    if-eqz v3, :cond_4

    move v0, v1

    :goto_1
    aput v0, v5, v7

    if-eqz v3, :cond_5

    :goto_2
    aput v2, v5, v6

    invoke-virtual {v4, v5}, Lcom/nineoldandroids/a/k;->a([F)V

    .line 820
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->C:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->a()V

    .line 822
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->D:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 823
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->D:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->b()V

    .line 825
    :cond_2
    iget-boolean v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->z:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->A:Z

    if-nez v0, :cond_3

    .line 826
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->D:Lcom/nineoldandroids/a/k;

    new-array v2, v8, [F

    aput v1, v2, v7

    iget v1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->n:F

    const v3, 0x3f9c28f6    # 1.22f

    mul-float/2addr v1, v3

    aput v1, v2, v6

    invoke-virtual {v0, v2}, Lcom/nineoldandroids/a/k;->a([F)V

    .line 827
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->D:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->a()V

    .line 830
    :cond_3
    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->invalidateSelf()V

    goto :goto_0

    :cond_4
    move v0, v2

    .line 818
    goto :goto_1

    :cond_5
    const/high16 v2, 0x40000000    # 2.0f

    goto :goto_2
.end method

.method public stop()V
    .locals 1

    .prologue
    .line 835
    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->C:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 836
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->C:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->c()V

    .line 841
    :goto_0
    return-void

    .line 838
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable;->v:Z

    .line 839
    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->invalidateSelf()V

    goto :goto_0
.end method
