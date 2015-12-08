.class public Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public A:Lorg/spongycastle/crypto/Digest;

.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field l:I

.field public m:I

.field public n:I

.field public o:I

.field p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:Z

.field public w:[B

.field public x:Z

.field public y:Z

.field public z:I


# direct methods
.method private constructor <init>(IIIIIIIIIIZ[BZZLorg/spongycastle/crypto/Digest;)V
    .locals 2

    .prologue
    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput p1, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    .line 102
    iput p2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->b:I

    .line 103
    iput p3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->d:I

    .line 104
    iput p4, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->e:I

    .line 105
    iput p5, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->f:I

    .line 106
    iput p7, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->n:I

    .line 107
    iput p6, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->q:I

    .line 108
    iput p8, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->s:I

    .line 109
    iput p9, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->t:I

    .line 110
    iput p10, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->u:I

    .line 111
    iput-boolean p11, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->v:Z

    .line 112
    iput-object p12, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->w:[B

    .line 113
    iput-boolean p13, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->x:Z

    .line 114
    move/from16 v0, p14

    iput-boolean v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->y:Z

    .line 115
    const/4 v1, 0x1

    iput v1, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->z:I

    .line 116
    move-object/from16 v0, p15

    iput-object v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->A:Lorg/spongycastle/crypto/Digest;

    .line 117
    invoke-direct {p0}, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a()V

    .line 118
    return-void
.end method

.method private constructor <init>(IIIIIIIIZ[BZZLorg/spongycastle/crypto/Digest;)V
    .locals 1

    .prologue
    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput p1, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    .line 64
    iput p2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->b:I

    .line 65
    iput p3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->c:I

    .line 66
    iput p5, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->n:I

    .line 67
    iput p4, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->q:I

    .line 68
    iput p6, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->s:I

    .line 69
    iput p7, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->t:I

    .line 70
    iput p8, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->u:I

    .line 71
    iput-boolean p9, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->v:Z

    .line 72
    iput-object p10, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->w:[B

    .line 73
    iput-boolean p11, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->x:Z

    .line 74
    iput-boolean p12, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->y:Z

    .line 75
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->z:I

    .line 76
    iput-object p13, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->A:Lorg/spongycastle/crypto/Digest;

    .line 77
    invoke-direct {p0}, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a()V

    .line 78
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 122
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->c:I

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->g:I

    .line 123
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->d:I

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->h:I

    .line 124
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->e:I

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->i:I

    .line 125
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->f:I

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->j:I

    .line 126
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->k:I

    .line 127
    const/4 v0, 0x1

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->l:I

    .line 128
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    div-int/lit8 v0, v0, 0x8

    iget v1, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->l:I

    sub-int/2addr v0, v1

    iget v1, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->n:I

    div-int/lit8 v1, v1, 0x8

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->m:I

    .line 129
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    mul-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->o:I

    .line 130
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->p:I

    .line 131
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->n:I

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->r:I

    .line 132
    return-void
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .locals 17

    .prologue
    .line 17
    move-object/from16 v0, p0

    iget v1, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->z:I

    if-nez v1, :cond_0

    new-instance v1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    move-object/from16 v0, p0

    iget v2, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    move-object/from16 v0, p0

    iget v3, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->b:I

    move-object/from16 v0, p0

    iget v4, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->c:I

    move-object/from16 v0, p0

    iget v5, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->q:I

    move-object/from16 v0, p0

    iget v6, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->n:I

    move-object/from16 v0, p0

    iget v7, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->s:I

    move-object/from16 v0, p0

    iget v8, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->t:I

    move-object/from16 v0, p0

    iget v9, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->u:I

    move-object/from16 v0, p0

    iget-boolean v10, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->v:Z

    move-object/from16 v0, p0

    iget-object v11, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->w:[B

    move-object/from16 v0, p0

    iget-boolean v12, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->x:Z

    move-object/from16 v0, p0

    iget-boolean v13, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->y:Z

    move-object/from16 v0, p0

    iget-object v14, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->A:Lorg/spongycastle/crypto/Digest;

    invoke-direct/range {v1 .. v14}, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;-><init>(IIIIIIIIZ[BZZLorg/spongycastle/crypto/Digest;)V

    :goto_0
    return-object v1

    :cond_0
    new-instance v1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    move-object/from16 v0, p0

    iget v2, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    move-object/from16 v0, p0

    iget v3, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->b:I

    move-object/from16 v0, p0

    iget v4, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->d:I

    move-object/from16 v0, p0

    iget v5, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->e:I

    move-object/from16 v0, p0

    iget v6, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->f:I

    move-object/from16 v0, p0

    iget v7, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->q:I

    move-object/from16 v0, p0

    iget v8, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->n:I

    move-object/from16 v0, p0

    iget v9, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->s:I

    move-object/from16 v0, p0

    iget v10, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->t:I

    move-object/from16 v0, p0

    iget v11, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->u:I

    move-object/from16 v0, p0

    iget-boolean v12, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->v:Z

    move-object/from16 v0, p0

    iget-object v13, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->w:[B

    move-object/from16 v0, p0

    iget-boolean v14, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->x:Z

    move-object/from16 v0, p0

    iget-boolean v15, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->y:Z

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->A:Lorg/spongycastle/crypto/Digest;

    move-object/from16 v16, v0

    invoke-direct/range {v1 .. v16}, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;-><init>(IIIIIIIIIIZ[BZZLorg/spongycastle/crypto/Digest;)V

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 264
    if-ne p0, p1, :cond_1

    .line 392
    :cond_0
    :goto_0
    return v0

    .line 268
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 270
    goto :goto_0

    .line 272
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    move v0, v1

    .line 274
    goto :goto_0

    .line 276
    :cond_3
    check-cast p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    .line 277
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    if-eq v2, v3, :cond_4

    move v0, v1

    .line 279
    goto :goto_0

    .line 281
    :cond_4
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->o:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->o:I

    if-eq v2, v3, :cond_5

    move v0, v1

    .line 283
    goto :goto_0

    .line 285
    :cond_5
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->p:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->p:I

    if-eq v2, v3, :cond_6

    move v0, v1

    .line 287
    goto :goto_0

    .line 289
    :cond_6
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->s:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->s:I

    if-eq v2, v3, :cond_7

    move v0, v1

    .line 291
    goto :goto_0

    .line 293
    :cond_7
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->n:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->n:I

    if-eq v2, v3, :cond_8

    move v0, v1

    .line 295
    goto :goto_0

    .line 297
    :cond_8
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->c:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->c:I

    if-eq v2, v3, :cond_9

    move v0, v1

    .line 299
    goto :goto_0

    .line 301
    :cond_9
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->d:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->d:I

    if-eq v2, v3, :cond_a

    move v0, v1

    .line 303
    goto :goto_0

    .line 305
    :cond_a
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->e:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->e:I

    if-eq v2, v3, :cond_b

    move v0, v1

    .line 307
    goto :goto_0

    .line 309
    :cond_b
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->f:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->f:I

    if-eq v2, v3, :cond_c

    move v0, v1

    .line 311
    goto :goto_0

    .line 313
    :cond_c
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->k:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->k:I

    if-eq v2, v3, :cond_d

    move v0, v1

    .line 315
    goto :goto_0

    .line 317
    :cond_d
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->q:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->q:I

    if-eq v2, v3, :cond_e

    move v0, v1

    .line 319
    goto :goto_0

    .line 321
    :cond_e
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->g:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->g:I

    if-eq v2, v3, :cond_f

    move v0, v1

    .line 323
    goto :goto_0

    .line 325
    :cond_f
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->h:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->h:I

    if-eq v2, v3, :cond_10

    move v0, v1

    .line 327
    goto :goto_0

    .line 329
    :cond_10
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->i:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->i:I

    if-eq v2, v3, :cond_11

    move v0, v1

    .line 331
    goto/16 :goto_0

    .line 333
    :cond_11
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->j:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->j:I

    if-eq v2, v3, :cond_12

    move v0, v1

    .line 335
    goto/16 :goto_0

    .line 337
    :cond_12
    iget-boolean v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->y:Z

    iget-boolean v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->y:Z

    if-eq v2, v3, :cond_13

    move v0, v1

    .line 339
    goto/16 :goto_0

    .line 341
    :cond_13
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->A:Lorg/spongycastle/crypto/Digest;

    if-nez v2, :cond_14

    .line 343
    iget-object v2, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->A:Lorg/spongycastle/crypto/Digest;

    if-eqz v2, :cond_15

    move v0, v1

    .line 345
    goto/16 :goto_0

    .line 348
    :cond_14
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->A:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/spongycastle/crypto/Digest;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->A:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v3}, Lorg/spongycastle/crypto/Digest;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    move v0, v1

    .line 350
    goto/16 :goto_0

    .line 352
    :cond_15
    iget-boolean v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->v:Z

    iget-boolean v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->v:Z

    if-eq v2, v3, :cond_16

    move v0, v1

    .line 354
    goto/16 :goto_0

    .line 356
    :cond_16
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->l:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->l:I

    if-eq v2, v3, :cond_17

    move v0, v1

    .line 358
    goto/16 :goto_0

    .line 360
    :cond_17
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->m:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->m:I

    if-eq v2, v3, :cond_18

    move v0, v1

    .line 362
    goto/16 :goto_0

    .line 364
    :cond_18
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->u:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->u:I

    if-eq v2, v3, :cond_19

    move v0, v1

    .line 366
    goto/16 :goto_0

    .line 368
    :cond_19
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->t:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->t:I

    if-eq v2, v3, :cond_1a

    move v0, v1

    .line 370
    goto/16 :goto_0

    .line 372
    :cond_1a
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->w:[B

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->w:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-nez v2, :cond_1b

    move v0, v1

    .line 374
    goto/16 :goto_0

    .line 376
    :cond_1b
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->r:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->r:I

    if-eq v2, v3, :cond_1c

    move v0, v1

    .line 378
    goto/16 :goto_0

    .line 380
    :cond_1c
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->z:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->z:I

    if-eq v2, v3, :cond_1d

    move v0, v1

    .line 382
    goto/16 :goto_0

    .line 384
    :cond_1d
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->b:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->b:I

    if-eq v2, v3, :cond_1e

    move v0, v1

    .line 386
    goto/16 :goto_0

    .line 388
    :cond_1e
    iget-boolean v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->x:Z

    iget-boolean v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->x:Z

    if-eq v2, v3, :cond_0

    move v0, v1

    .line 390
    goto/16 :goto_0
.end method

.method public hashCode()I
    .locals 4

    .prologue
    const/16 v2, 0x4d5

    const/16 v1, 0x4cf

    .line 230
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    add-int/lit8 v0, v0, 0x1f

    .line 233
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->o:I

    add-int/2addr v0, v3

    .line 234
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->p:I

    add-int/2addr v0, v3

    .line 235
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->s:I

    add-int/2addr v0, v3

    .line 236
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->n:I

    add-int/2addr v0, v3

    .line 237
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->c:I

    add-int/2addr v0, v3

    .line 238
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->d:I

    add-int/2addr v0, v3

    .line 239
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->e:I

    add-int/2addr v0, v3

    .line 240
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->f:I

    add-int/2addr v0, v3

    .line 241
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->k:I

    add-int/2addr v0, v3

    .line 242
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->q:I

    add-int/2addr v0, v3

    .line 243
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->g:I

    add-int/2addr v0, v3

    .line 244
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->h:I

    add-int/2addr v0, v3

    .line 245
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->i:I

    add-int/2addr v0, v3

    .line 246
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->j:I

    add-int/2addr v0, v3

    .line 247
    mul-int/lit8 v3, v0, 0x1f

    iget-boolean v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->y:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    add-int/2addr v0, v3

    .line 248
    mul-int/lit8 v3, v0, 0x1f

    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->A:Lorg/spongycastle/crypto/Digest;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_1
    add-int/2addr v0, v3

    .line 249
    mul-int/lit8 v3, v0, 0x1f

    iget-boolean v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->v:Z

    if-eqz v0, :cond_2

    move v0, v1

    :goto_2
    add-int/2addr v0, v3

    .line 250
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->l:I

    add-int/2addr v0, v3

    .line 251
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->m:I

    add-int/2addr v0, v3

    .line 252
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->u:I

    add-int/2addr v0, v3

    .line 253
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->t:I

    add-int/2addr v0, v3

    .line 254
    mul-int/lit8 v0, v0, 0x1f

    iget-object v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->w:[B

    invoke-static {v3}, Ljava/util/Arrays;->hashCode([B)I

    move-result v3

    add-int/2addr v0, v3

    .line 255
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->r:I

    add-int/2addr v0, v3

    .line 256
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->z:I

    add-int/2addr v0, v3

    .line 257
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->b:I

    add-int/2addr v0, v3

    .line 258
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->x:Z

    if-eqz v3, :cond_3

    :goto_3
    add-int/2addr v0, v1

    .line 259
    return v0

    :cond_0
    move v0, v2

    .line 247
    goto :goto_0

    .line 248
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->A:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_1

    :cond_2
    move v0, v2

    .line 249
    goto :goto_2

    :cond_3
    move v1, v2

    .line 258
    goto :goto_3
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 397
    new-instance v0, Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "EncryptionParameters(N="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " q="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 398
    iget v1, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->z:I

    if-nez v1, :cond_0

    .line 400
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " polyType=SIMPLE df="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " dm0="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->q:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " db="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->n:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " c="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->s:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " minCallsR="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->t:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " minCallsMask="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->u:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " hashSeed="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->v:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " hashAlg="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->A:Lorg/spongycastle/crypto/Digest;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " oid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->w:[B

    invoke-static {v2}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " sparse="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->x:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 404
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " polyType=PRODUCT df1="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " df2="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " df3="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->f:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0
.end method
