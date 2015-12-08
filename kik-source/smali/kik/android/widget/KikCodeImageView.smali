.class public Lkik/android/widget/KikCodeImageView;
.super Lkik/android/widget/KikCodeBackgroundImageView;
.source "SourceFile"


# instance fields
.field b:F

.field private c:Landroid/graphics/Bitmap;

.field private d:Landroid/graphics/Paint;

.field private e:Landroid/graphics/Paint;

.field private final f:F

.field private final g:F

.field private final h:F

.field private final i:F

.field private j:I

.field private k:I

.field private l:Lcom/kik/scan/KikCode;

.field private m:[B

.field private n:I

.field private o:[B

.field private p:Landroid/graphics/drawable/Drawable;

.field private q:Landroid/graphics/drawable/AnimationDrawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .prologue
    const/16 v3, 0xff

    const/4 v2, 0x1

    .line 51
    invoke-direct {p0, p1, p2}, Lkik/android/widget/KikCodeBackgroundImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    const v0, 0x3ea3d70a    # 0.32f

    iput v0, p0, Lkik/android/widget/KikCodeImageView;->f:F

    .line 36
    const v0, 0x3ed9999a    # 0.425f

    iput v0, p0, Lkik/android/widget/KikCodeImageView;->g:F

    .line 37
    const v0, 0x3f733333    # 0.95f

    iput v0, p0, Lkik/android/widget/KikCodeImageView;->h:F

    .line 38
    const v0, 0x3dcccccd    # 0.1f

    iput v0, p0, Lkik/android/widget/KikCodeImageView;->i:F

    .line 39
    const/4 v0, 0x6

    iput v0, p0, Lkik/android/widget/KikCodeImageView;->j:I

    .line 40
    const/16 v0, 0x8

    iput v0, p0, Lkik/android/widget/KikCodeImageView;->k:I

    .line 43
    iput v2, p0, Lkik/android/widget/KikCodeImageView;->n:I

    .line 44
    const/4 v0, 0x4

    new-array v0, v0, [B

    iput-object v0, p0, Lkik/android/widget/KikCodeImageView;->o:[B

    .line 52
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lkik/android/widget/KikCodeImageView;->d:Landroid/graphics/Paint;

    .line 53
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 54
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 55
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lkik/android/widget/KikCodeImageView;->e:Landroid/graphics/Paint;

    .line 56
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 57
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 58
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, v3, v3, v3, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 59
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 60
    invoke-virtual {p0}, Lkik/android/widget/KikCodeImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0201b0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/KikCodeImageView;->p:Landroid/graphics/drawable/Drawable;

    .line 61
    invoke-virtual {p0}, Lkik/android/widget/KikCodeImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070080

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lkik/android/widget/KikCodeImageView;->q:Landroid/graphics/drawable/AnimationDrawable;

    .line 62
    return-void
.end method

.method private a(I)V
    .locals 3

    .prologue
    .line 222
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    if-nez v0, :cond_0

    .line 245
    :goto_0
    return-void

    .line 225
    :cond_0
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    instance-of v0, v0, Lcom/kik/scan/RemoteKikCode;

    if-eqz v0, :cond_1

    .line 226
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    check-cast v0, Lcom/kik/scan/RemoteKikCode;

    .line 227
    new-instance v1, Lcom/kik/scan/RemoteKikCode;

    invoke-virtual {v0}, Lcom/kik/scan/RemoteKikCode;->getPayloadId()[B

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lcom/kik/scan/RemoteKikCode;-><init>([BI)V

    iput-object v1, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    .line 228
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    invoke-virtual {v0}, Lcom/kik/scan/KikCode;->encode()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/widget/KikCodeImageView;->a([B)V

    .line 244
    :goto_1
    invoke-virtual {p0}, Lkik/android/widget/KikCodeImageView;->invalidate()V

    goto :goto_0

    .line 230
    :cond_1
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    instance-of v0, v0, Lcom/kik/scan/UsernameKikCode;

    if-eqz v0, :cond_2

    .line 231
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    check-cast v0, Lcom/kik/scan/UsernameKikCode;

    .line 232
    new-instance v1, Lcom/kik/scan/UsernameKikCode;

    invoke-virtual {v0}, Lcom/kik/scan/UsernameKikCode;->getUsername()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/kik/scan/UsernameKikCode;->getNonce()I

    move-result v0

    invoke-direct {v1, v2, v0, p1}, Lcom/kik/scan/UsernameKikCode;-><init>(Ljava/lang/String;II)V

    iput-object v1, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    .line 233
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    invoke-virtual {v0}, Lcom/kik/scan/KikCode;->encode()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/widget/KikCodeImageView;->a([B)V

    goto :goto_1

    .line 235
    :cond_2
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    instance-of v0, v0, Lcom/kik/scan/GroupKikCode;

    if-eqz v0, :cond_3

    .line 236
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    check-cast v0, Lcom/kik/scan/GroupKikCode;

    .line 237
    new-instance v1, Lcom/kik/scan/GroupKikCode;

    invoke-virtual {v0}, Lcom/kik/scan/GroupKikCode;->getInviteCode()[B

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lcom/kik/scan/GroupKikCode;-><init>([BI)V

    iput-object v1, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    .line 238
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    invoke-virtual {v0}, Lcom/kik/scan/KikCode;->encode()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/widget/KikCodeImageView;->a([B)V

    goto :goto_1

    .line 241
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Code format unaccounted for! Unable to update view"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->d(Ljava/lang/Throwable;)V

    goto :goto_1
.end method


# virtual methods
.method public a(Lcom/kik/scan/KikCode;)V
    .locals 0

    .prologue
    .line 187
    iput-object p1, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    .line 188
    return-void
.end method

.method public final a([B)V
    .locals 3

    .prologue
    .line 170
    if-eqz p1, :cond_2

    .line 171
    const/16 v0, 0x27

    new-array v0, v0, [B

    iput-object v0, p0, Lkik/android/widget/KikCodeImageView;->m:[B

    .line 172
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lkik/android/widget/KikCodeImageView;->o:[B

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 173
    iget-object v1, p0, Lkik/android/widget/KikCodeImageView;->m:[B

    iget-object v2, p0, Lkik/android/widget/KikCodeImageView;->o:[B

    aget-byte v2, v2, v0

    aput-byte v2, v1, v0

    .line 172
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 175
    :cond_0
    const/4 v0, 0x4

    :goto_1
    array-length v1, p1

    add-int/lit8 v1, v1, 0x4

    if-ge v0, v1, :cond_1

    .line 176
    iget-object v1, p0, Lkik/android/widget/KikCodeImageView;->m:[B

    add-int/lit8 v2, v0, -0x4

    aget-byte v2, p1, v2

    aput-byte v2, v1, v0

    .line 175
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 178
    :cond_1
    invoke-virtual {p0}, Lkik/android/widget/KikCodeImageView;->invalidate()V

    .line 183
    :goto_2
    return-void

    .line 181
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/widget/KikCodeImageView;->m:[B

    goto :goto_2
.end method

.method public final a()[B
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    instance-of v0, v0, Lcom/kik/scan/RemoteKikCode;

    if-eqz v0, :cond_0

    .line 193
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    check-cast v0, Lcom/kik/scan/RemoteKikCode;

    invoke-virtual {v0}, Lcom/kik/scan/RemoteKikCode;->encode()[B

    move-result-object v0

    .line 202
    :goto_0
    return-object v0

    .line 195
    :cond_0
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    instance-of v0, v0, Lcom/kik/scan/UsernameKikCode;

    if-eqz v0, :cond_1

    .line 196
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    check-cast v0, Lcom/kik/scan/UsernameKikCode;

    invoke-virtual {v0}, Lcom/kik/scan/UsernameKikCode;->encode()[B

    move-result-object v0

    goto :goto_0

    .line 198
    :cond_1
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    instance-of v0, v0, Lcom/kik/scan/GroupKikCode;

    if-eqz v0, :cond_2

    .line 199
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    check-cast v0, Lcom/kik/scan/GroupKikCode;

    invoke-virtual {v0}, Lcom/kik/scan/GroupKikCode;->encode()[B

    move-result-object v0

    goto :goto_0

    .line 202
    :cond_2
    const/16 v0, 0x23

    new-array v0, v0, [B

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 208
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    if-nez v0, :cond_0

    .line 214
    :goto_0
    return-void

    .line 211
    :cond_0
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    invoke-virtual {v0}, Lcom/kik/scan/KikCode;->getColour()I

    move-result v0

    .line 212
    add-int/lit8 v0, v0, 0x1

    invoke-static {}, Lkik/android/chat/b/a$a;->values()[Lkik/android/chat/b/a$a;

    move-result-object v1

    array-length v1, v1

    rem-int/2addr v0, v1

    .line 213
    invoke-direct {p0, v0}, Lkik/android/widget/KikCodeImageView;->a(I)V

    goto :goto_0
.end method

.method public final b([B)V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 254
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->o:[B

    array-length v0, v0

    if-gt v0, v1, :cond_0

    .line 255
    iput-object p1, p0, Lkik/android/widget/KikCodeImageView;->o:[B

    .line 260
    :goto_0
    return-void

    .line 258
    :cond_0
    new-array v0, v1, [B

    iput-object v0, p0, Lkik/android/widget/KikCodeImageView;->o:[B

    goto :goto_0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 217
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/widget/KikCodeImageView;->a(I)V

    .line 218
    return-void
.end method

.method public final d()Lcom/kik/scan/KikCode;
    .locals 1

    .prologue
    .line 249
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->l:Lcom/kik/scan/KikCode;

    return-object v0
.end method

.method public final e()Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    .line 271
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->c:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 272
    invoke-virtual {p0}, Lkik/android/widget/KikCodeImageView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lkik/android/widget/KikCodeImageView;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 273
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v1}, Lkik/android/widget/KikCodeImageView;->draw(Landroid/graphics/Canvas;)V

    .line 274
    invoke-virtual {p0}, Lkik/android/widget/KikCodeImageView;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    .line 275
    invoke-virtual {p0}, Lkik/android/widget/KikCodeImageView;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Lkik/android/widget/KikCodeImageView;->getWidth()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    .line 276
    sub-int/2addr v1, v2

    .line 277
    const/4 v3, 0x0

    mul-int/lit8 v4, v2, 0x2

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v0, v3, v1, v4, v2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/KikCodeImageView;->c:Landroid/graphics/Bitmap;

    .line 279
    :cond_0
    iget-object v0, p0, Lkik/android/widget/KikCodeImageView;->c:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final f()F
    .locals 1

    .prologue
    .line 284
    iget v0, p0, Lkik/android/widget/KikCodeImageView;->b:F

    return v0
.end method

.method public invalidate()V
    .locals 1

    .prologue
    .line 265
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/widget/KikCodeImageView;->c:Landroid/graphics/Bitmap;

    .line 266
    invoke-super {p0}, Lkik/android/widget/KikCodeBackgroundImageView;->invalidate()V

    .line 267
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 26

    .prologue
    .line 67
    invoke-super/range {p0 .. p1}, Lkik/android/widget/KikCodeBackgroundImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 68
    invoke-virtual/range {p0 .. p0}, Lkik/android/widget/KikCodeImageView;->getWidth()I

    move-result v2

    .line 69
    invoke-virtual/range {p0 .. p0}, Lkik/android/widget/KikCodeImageView;->getHeight()I

    move-result v3

    .line 71
    int-to-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float v14, v4, v5

    .line 72
    int-to-float v4, v3

    const/high16 v5, 0x40000000    # 2.0f

    div-float v15, v4, v5

    .line 74
    if-ge v2, v3, :cond_2

    .line 76
    :goto_0
    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    move-object/from16 v0, p0

    iput v2, v0, Lkik/android/widget/KikCodeImageView;->b:F

    .line 79
    move-object/from16 v0, p0

    iget v2, v0, Lkik/android/widget/KikCodeImageView;->b:F

    float-to-double v2, v2

    const-wide v4, 0x3fedc28f5c28f5c3L    # 0.93

    mul-double/2addr v2, v4

    double-to-float v2, v2

    .line 81
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/widget/KikCodeImageView;->m:[B

    if-eqz v3, :cond_8

    .line 84
    const v3, 0x3ea3d70a    # 0.32f

    mul-float v16, v2, v3

    .line 85
    const v3, 0x3ed9999a    # 0.425f

    mul-float v17, v2, v3

    .line 86
    const v3, 0x3f733333    # 0.95f

    mul-float/2addr v2, v3

    .line 88
    sub-float v2, v2, v17

    move-object/from16 v0, p0

    iget v3, v0, Lkik/android/widget/KikCodeImageView;->j:I

    int-to-float v3, v3

    div-float v18, v2, v3

    .line 89
    const/high16 v2, 0x40400000    # 3.0f

    mul-float v2, v2, v18

    const/high16 v3, 0x40800000    # 4.0f

    div-float v19, v2, v3

    .line 91
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/widget/KikCodeImageView;->e:Landroid/graphics/Paint;

    move/from16 v0, v19

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 94
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/widget/KikCodeImageView;->d:Landroid/graphics/Paint;

    const/16 v3, 0xff

    const/16 v4, 0xff

    const/16 v5, 0xff

    const/16 v6, 0xff

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 96
    const/4 v3, 0x0

    .line 98
    const/4 v2, 0x0

    move v8, v2

    move v9, v3

    :goto_1
    move-object/from16 v0, p0

    iget v2, v0, Lkik/android/widget/KikCodeImageView;->j:I

    if-ge v8, v2, :cond_7

    .line 99
    int-to-float v2, v8

    mul-float v2, v2, v18

    add-float v2, v2, v17

    .line 101
    if-nez v8, :cond_0

    .line 102
    const/high16 v3, 0x41200000    # 10.0f

    div-float v3, v16, v3

    sub-float/2addr v2, v3

    .line 105
    :cond_0
    move-object/from16 v0, p0

    iget v3, v0, Lkik/android/widget/KikCodeImageView;->k:I

    mul-int/2addr v3, v8

    add-int/lit8 v20, v3, 0x20

    .line 107
    const-wide v4, 0x401921fb54442d18L    # 6.283185307179586

    move/from16 v0, v20

    int-to-double v6, v0

    div-double v22, v4, v6

    .line 110
    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v18, v3

    add-float v21, v2, v3

    .line 112
    const/4 v6, 0x0

    .line 113
    const-wide/16 v4, 0x0

    .line 115
    const/4 v2, 0x0

    move v11, v2

    move v10, v9

    :goto_2
    move/from16 v0, v20

    if-ge v11, v0, :cond_6

    .line 117
    int-to-double v2, v11

    mul-double v2, v2, v22

    const-wide v12, 0x3ff921fb54442d18L    # 1.5707963267948966

    sub-double/2addr v2, v12

    .line 120
    const/4 v7, 0x1

    rem-int/lit8 v12, v10, 0x8

    shl-int/2addr v7, v12

    .line 123
    move-object/from16 v0, p0

    iget-object v12, v0, Lkik/android/widget/KikCodeImageView;->m:[B

    div-int/lit8 v13, v10, 0x8

    aget-byte v12, v12, v13

    and-int/2addr v7, v12

    if-eqz v7, :cond_3

    const/4 v7, 0x1

    .line 125
    :goto_3
    if-eqz v7, :cond_b

    .line 126
    if-nez v6, :cond_a

    move-wide v12, v2

    .line 129
    :goto_4
    add-int/lit8 v5, v6, 0x1

    .line 131
    sub-int v4, v10, v9

    add-int/lit8 v4, v4, 0x1

    rem-int v4, v4, v20

    add-int/2addr v4, v9

    .line 132
    const/4 v6, 0x1

    rem-int/lit8 v7, v4, 0x8

    shl-int/2addr v6, v7

    .line 133
    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/widget/KikCodeImageView;->m:[B

    div-int/lit8 v4, v4, 0x8

    aget-byte v4, v7, v4

    and-int/2addr v4, v6

    if-eqz v4, :cond_4

    const/4 v4, 0x1

    .line 137
    :goto_5
    add-int/lit8 v6, v11, 0x1

    move/from16 v0, v20

    if-ne v6, v0, :cond_1

    if-eqz v4, :cond_1

    .line 138
    add-int/lit8 v5, v5, 0x1

    .line 140
    const/4 v4, 0x0

    .line 144
    :cond_1
    if-nez v4, :cond_9

    .line 145
    const/4 v4, 0x1

    if-le v5, v4, :cond_5

    .line 146
    new-instance v3, Landroid/graphics/RectF;

    sub-float v2, v14, v21

    sub-float v4, v15, v21

    add-float v6, v14, v21

    add-float v7, v15, v21

    invoke-direct {v3, v2, v4, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 147
    invoke-static {v12, v13}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v6

    double-to-float v4, v6

    add-int/lit8 v2, v5, -0x1

    int-to-double v6, v2

    mul-double v6, v6, v22

    invoke-static {v6, v7}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v6

    double-to-float v5, v6

    const/4 v6, 0x0

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/widget/KikCodeImageView;->e:Landroid/graphics/Paint;

    move-object/from16 v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 155
    :goto_6
    const/4 v2, 0x0

    .line 159
    :goto_7
    add-int/lit8 v10, v10, 0x1

    .line 115
    add-int/lit8 v3, v11, 0x1

    move-wide v4, v12

    move v11, v3

    move v6, v2

    goto :goto_2

    :cond_2
    move v2, v3

    .line 74
    goto/16 :goto_0

    .line 123
    :cond_3
    const/4 v7, 0x0

    goto :goto_3

    .line 133
    :cond_4
    const/4 v4, 0x0

    goto :goto_5

    .line 150
    :cond_5
    float-to-double v4, v14

    move/from16 v0, v21

    float-to-double v6, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v24

    mul-double v6, v6, v24

    add-double/2addr v4, v6

    .line 151
    float-to-double v6, v15

    move/from16 v0, v21

    float-to-double v0, v0

    move-wide/from16 v24, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    mul-double v2, v2, v24

    add-double/2addr v2, v6

    .line 153
    double-to-float v4, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v19, v3

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/widget/KikCodeImageView;->d:Landroid/graphics/Paint;

    move-object/from16 v0, p1

    invoke-virtual {v0, v4, v2, v3, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_6

    .line 98
    :cond_6
    add-int/lit8 v2, v8, 0x1

    move v8, v2

    move v9, v10

    goto/16 :goto_1

    .line 163
    :cond_7
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/widget/KikCodeImageView;->p:Landroid/graphics/drawable/Drawable;

    sub-float v3, v14, v16

    float-to-int v3, v3

    sub-float v4, v15, v16

    float-to-int v4, v4

    add-float v5, v14, v16

    float-to-int v5, v5

    add-float v6, v15, v16

    float-to-int v6, v6

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 164
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/widget/KikCodeImageView;->p:Landroid/graphics/drawable/Drawable;

    move-object/from16 v0, p1

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 166
    :cond_8
    return-void

    :cond_9
    move v2, v5

    goto :goto_7

    :cond_a
    move-wide v12, v4

    goto/16 :goto_4

    :cond_b
    move-wide v12, v4

    move v2, v6

    goto :goto_7
.end method
