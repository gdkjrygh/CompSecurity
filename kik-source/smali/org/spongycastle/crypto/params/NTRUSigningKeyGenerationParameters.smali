.class public Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;
.super Lorg/spongycastle/crypto/KeyGenerationParameters;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final a:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

.field public static final b:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

.field public static final c:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

.field public static final d:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

.field public static final e:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

.field public static final f:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;


# instance fields
.field public A:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field n:D

.field public o:D

.field p:D

.field public q:D

.field public r:I

.field s:D

.field public t:D

.field public u:Z

.field public v:I

.field w:I

.field public x:Z

.field public y:I

.field public z:Lorg/spongycastle/crypto/Digest;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .prologue
    .line 32
    new-instance v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    const/16 v1, 0x1b7

    const/16 v2, 0x800

    const/16 v3, 0x92

    const/4 v4, 0x1

    const/4 v5, 0x1

    const-wide v6, 0x3fc51eb851eb851fL    # 0.165

    const-wide/high16 v8, 0x4079000000000000L    # 400.0

    const-wide v10, 0x4071800000000000L    # 280.0

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    new-instance v15, Lorg/spongycastle/crypto/digests/SHA256Digest;

    invoke-direct {v15}, Lorg/spongycastle/crypto/digests/SHA256Digest;-><init>()V

    invoke-direct/range {v0 .. v15}, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;-><init>(IIIIIDDDZZILorg/spongycastle/crypto/Digest;)V

    sput-object v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->a:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    .line 37
    new-instance v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    const/16 v1, 0x1b7

    const/16 v2, 0x800

    const/16 v3, 0x9

    const/16 v4, 0x8

    const/4 v5, 0x5

    const/4 v6, 0x1

    const/4 v7, 0x1

    const-wide v8, 0x3fc51eb851eb851fL    # 0.165

    const-wide/high16 v10, 0x4079000000000000L    # 400.0

    const-wide v12, 0x4071800000000000L    # 280.0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    new-instance v17, Lorg/spongycastle/crypto/digests/SHA256Digest;

    invoke-direct/range {v17 .. v17}, Lorg/spongycastle/crypto/digests/SHA256Digest;-><init>()V

    invoke-direct/range {v0 .. v17}, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;-><init>(IIIIIIIDDDZZILorg/spongycastle/crypto/Digest;)V

    sput-object v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->b:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    .line 42
    new-instance v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    const/16 v1, 0x2e7

    const/16 v2, 0x800

    const/16 v3, 0xf8

    const/4 v4, 0x1

    const/4 v5, 0x1

    const-wide v6, 0x3fc04189374bc6a8L    # 0.127

    const-wide v8, 0x4079500000000000L    # 405.0

    const-wide v10, 0x4076800000000000L    # 360.0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    new-instance v15, Lorg/spongycastle/crypto/digests/SHA512Digest;

    invoke-direct {v15}, Lorg/spongycastle/crypto/digests/SHA512Digest;-><init>()V

    invoke-direct/range {v0 .. v15}, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;-><init>(IIIIIDDDZZILorg/spongycastle/crypto/Digest;)V

    sput-object v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->c:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    .line 47
    new-instance v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    const/16 v1, 0x2e7

    const/16 v2, 0x800

    const/16 v3, 0xb

    const/16 v4, 0xb

    const/16 v5, 0xf

    const/4 v6, 0x1

    const/4 v7, 0x1

    const-wide v8, 0x3fc04189374bc6a8L    # 0.127

    const-wide v10, 0x4079500000000000L    # 405.0

    const-wide v12, 0x4076800000000000L    # 360.0

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    new-instance v17, Lorg/spongycastle/crypto/digests/SHA512Digest;

    invoke-direct/range {v17 .. v17}, Lorg/spongycastle/crypto/digests/SHA512Digest;-><init>()V

    invoke-direct/range {v0 .. v17}, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;-><init>(IIIIIIIDDDZZILorg/spongycastle/crypto/Digest;)V

    sput-object v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->d:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    .line 52
    new-instance v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    const/16 v1, 0x9d

    const/16 v2, 0x100

    const/16 v3, 0x1d

    const/4 v4, 0x1

    const/4 v5, 0x1

    const-wide v6, 0x3fd851eb851eb852L    # 0.38

    const-wide/high16 v8, 0x4069000000000000L    # 200.0

    const-wide/high16 v10, 0x4054000000000000L    # 80.0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    new-instance v15, Lorg/spongycastle/crypto/digests/SHA256Digest;

    invoke-direct {v15}, Lorg/spongycastle/crypto/digests/SHA256Digest;-><init>()V

    invoke-direct/range {v0 .. v15}, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;-><init>(IIIIIDDDZZILorg/spongycastle/crypto/Digest;)V

    sput-object v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->e:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    .line 56
    new-instance v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    const/16 v1, 0x9d

    const/16 v2, 0x100

    const/4 v3, 0x5

    const/4 v4, 0x5

    const/16 v5, 0x8

    const/4 v6, 0x1

    const/4 v7, 0x1

    const-wide v8, 0x3fd851eb851eb852L    # 0.38

    const-wide/high16 v10, 0x4069000000000000L    # 200.0

    const-wide/high16 v12, 0x4054000000000000L    # 80.0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    new-instance v17, Lorg/spongycastle/crypto/digests/SHA256Digest;

    invoke-direct/range {v17 .. v17}, Lorg/spongycastle/crypto/digests/SHA256Digest;-><init>()V

    invoke-direct/range {v0 .. v17}, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;-><init>(IIIIIIIDDDZZILorg/spongycastle/crypto/Digest;)V

    sput-object v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->f:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    return-void
.end method

.method private constructor <init>(IIIIIDDDZZILorg/spongycastle/crypto/Digest;)V
    .locals 2

    .prologue
    .line 95
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    invoke-direct {p0, v1, p1}, Lorg/spongycastle/crypto/KeyGenerationParameters;-><init>(Ljava/security/SecureRandom;I)V

    .line 66
    const/16 v1, 0x64

    iput v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->r:I

    .line 71
    const/4 v1, 0x6

    iput v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->w:I

    .line 96
    iput p1, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->g:I

    .line 97
    iput p2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->h:I

    .line 98
    iput p3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->i:I

    .line 99
    iput p4, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->m:I

    .line 100
    iput p5, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->v:I

    .line 101
    iput-wide p6, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->n:D

    .line 102
    iput-wide p8, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->p:D

    .line 103
    iput-wide p10, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->s:D

    .line 104
    iput-boolean p12, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->u:Z

    .line 105
    iput-boolean p13, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->x:Z

    .line 106
    move/from16 v0, p14

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->y:I

    .line 107
    move-object/from16 v0, p15

    iput-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->z:Lorg/spongycastle/crypto/Digest;

    .line 108
    const/4 v1, 0x0

    iput v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->A:I

    .line 109
    invoke-direct {p0}, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->c()V

    .line 110
    return-void
.end method

.method private constructor <init>(IIIIIIIDDDZZILorg/spongycastle/crypto/Digest;)V
    .locals 2

    .prologue
    .line 132
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    invoke-direct {p0, v1, p1}, Lorg/spongycastle/crypto/KeyGenerationParameters;-><init>(Ljava/security/SecureRandom;I)V

    .line 66
    const/16 v1, 0x64

    iput v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->r:I

    .line 71
    const/4 v1, 0x6

    iput v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->w:I

    .line 133
    iput p1, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->g:I

    .line 134
    iput p2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->h:I

    .line 135
    iput p3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->j:I

    .line 136
    iput p4, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->k:I

    .line 137
    iput p5, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->l:I

    .line 138
    iput p6, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->m:I

    .line 139
    iput p7, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->v:I

    .line 140
    iput-wide p8, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->n:D

    .line 141
    iput-wide p10, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->p:D

    .line 142
    iput-wide p12, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->s:D

    .line 143
    move/from16 v0, p14

    iput-boolean v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->u:Z

    .line 144
    move/from16 v0, p15

    iput-boolean v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->x:Z

    .line 145
    move/from16 v0, p16

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->y:I

    .line 146
    move-object/from16 v0, p17

    iput-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->z:Lorg/spongycastle/crypto/Digest;

    .line 147
    const/4 v1, 0x1

    iput v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->A:I

    .line 148
    invoke-direct {p0}, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->c()V

    .line 149
    return-void
.end method

.method private c()V
    .locals 4

    .prologue
    .line 153
    iget-wide v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->n:D

    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->n:D

    mul-double/2addr v0, v2

    iput-wide v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->o:D

    .line 154
    iget-wide v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->p:D

    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->p:D

    mul-double/2addr v0, v2

    iput-wide v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->q:D

    .line 155
    iget-wide v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->s:D

    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->s:D

    mul-double/2addr v0, v2

    iput-wide v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->t:D

    .line 156
    return-void
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .locals 20

    .prologue
    .line 19
    move-object/from16 v0, p0

    iget v2, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->A:I

    if-nez v2, :cond_0

    new-instance v2, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    move-object/from16 v0, p0

    iget v3, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->g:I

    move-object/from16 v0, p0

    iget v4, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->h:I

    move-object/from16 v0, p0

    iget v5, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->i:I

    move-object/from16 v0, p0

    iget v6, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->m:I

    move-object/from16 v0, p0

    iget v7, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->v:I

    move-object/from16 v0, p0

    iget-wide v8, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->n:D

    move-object/from16 v0, p0

    iget-wide v10, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->p:D

    move-object/from16 v0, p0

    iget-wide v12, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->s:D

    move-object/from16 v0, p0

    iget-boolean v14, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->u:Z

    move-object/from16 v0, p0

    iget-boolean v15, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->x:Z

    move-object/from16 v0, p0

    iget v0, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->y:I

    move/from16 v16, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->z:Lorg/spongycastle/crypto/Digest;

    move-object/from16 v17, v0

    invoke-direct/range {v2 .. v17}, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;-><init>(IIIIIDDDZZILorg/spongycastle/crypto/Digest;)V

    :goto_0
    return-object v2

    :cond_0
    new-instance v2, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    move-object/from16 v0, p0

    iget v3, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->g:I

    move-object/from16 v0, p0

    iget v4, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->h:I

    move-object/from16 v0, p0

    iget v5, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->j:I

    move-object/from16 v0, p0

    iget v6, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->k:I

    move-object/from16 v0, p0

    iget v7, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->l:I

    move-object/from16 v0, p0

    iget v8, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->m:I

    move-object/from16 v0, p0

    iget v9, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->v:I

    move-object/from16 v0, p0

    iget-wide v10, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->n:D

    move-object/from16 v0, p0

    iget-wide v12, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->p:D

    move-object/from16 v0, p0

    iget-wide v14, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->s:D

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->u:Z

    move/from16 v16, v0

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->x:Z

    move/from16 v17, v0

    move-object/from16 v0, p0

    iget v0, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->y:I

    move/from16 v18, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->z:Lorg/spongycastle/crypto/Digest;

    move-object/from16 v19, v0

    invoke-direct/range {v2 .. v19}, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;-><init>(IIIIIIIDDDZZILorg/spongycastle/crypto/Digest;)V

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 282
    if-ne p0, p1, :cond_1

    .line 386
    :cond_0
    :goto_0
    return v0

    .line 286
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 288
    goto :goto_0

    .line 290
    :cond_2
    instance-of v2, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    if-nez v2, :cond_3

    move v0, v1

    .line 292
    goto :goto_0

    .line 294
    :cond_3
    check-cast p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    .line 295
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->m:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->m:I

    if-eq v2, v3, :cond_4

    move v0, v1

    .line 297
    goto :goto_0

    .line 299
    :cond_4
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->g:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->g:I

    if-eq v2, v3, :cond_5

    move v0, v1

    .line 301
    goto :goto_0

    .line 303
    :cond_5
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->v:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->v:I

    if-eq v2, v3, :cond_6

    move v0, v1

    .line 305
    goto :goto_0

    .line 307
    :cond_6
    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->n:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    iget-wide v4, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->n:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_7

    move v0, v1

    .line 309
    goto :goto_0

    .line 311
    :cond_7
    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->o:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    iget-wide v4, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->o:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_8

    move v0, v1

    .line 313
    goto :goto_0

    .line 315
    :cond_8
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->w:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->w:I

    if-eq v2, v3, :cond_9

    move v0, v1

    .line 317
    goto :goto_0

    .line 319
    :cond_9
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->i:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->i:I

    if-eq v2, v3, :cond_a

    move v0, v1

    .line 321
    goto :goto_0

    .line 323
    :cond_a
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->j:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->j:I

    if-eq v2, v3, :cond_b

    move v0, v1

    .line 325
    goto :goto_0

    .line 327
    :cond_b
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->k:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->k:I

    if-eq v2, v3, :cond_c

    move v0, v1

    .line 329
    goto :goto_0

    .line 331
    :cond_c
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->l:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->l:I

    if-eq v2, v3, :cond_d

    move v0, v1

    .line 333
    goto :goto_0

    .line 335
    :cond_d
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->z:Lorg/spongycastle/crypto/Digest;

    if-nez v2, :cond_e

    .line 337
    iget-object v2, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->z:Lorg/spongycastle/crypto/Digest;

    if-eqz v2, :cond_f

    move v0, v1

    .line 339
    goto :goto_0

    .line 342
    :cond_e
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->z:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/spongycastle/crypto/Digest;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->z:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v3}, Lorg/spongycastle/crypto/Digest;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    move v0, v1

    .line 344
    goto/16 :goto_0

    .line 346
    :cond_f
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->y:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->y:I

    if-eq v2, v3, :cond_10

    move v0, v1

    .line 348
    goto/16 :goto_0

    .line 350
    :cond_10
    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->s:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    iget-wide v4, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->s:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_11

    move v0, v1

    .line 352
    goto/16 :goto_0

    .line 354
    :cond_11
    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->t:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    iget-wide v4, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->t:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_12

    move v0, v1

    .line 356
    goto/16 :goto_0

    .line 358
    :cond_12
    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->p:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    iget-wide v4, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->p:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_13

    move v0, v1

    .line 360
    goto/16 :goto_0

    .line 362
    :cond_13
    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->q:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    iget-wide v4, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->q:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_14

    move v0, v1

    .line 364
    goto/16 :goto_0

    .line 366
    :cond_14
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->A:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->A:I

    if-eq v2, v3, :cond_15

    move v0, v1

    .line 368
    goto/16 :goto_0

    .line 370
    :cond_15
    iget-boolean v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->u:Z

    iget-boolean v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->u:Z

    if-eq v2, v3, :cond_16

    move v0, v1

    .line 372
    goto/16 :goto_0

    .line 374
    :cond_16
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->h:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->h:I

    if-eq v2, v3, :cond_17

    move v0, v1

    .line 376
    goto/16 :goto_0

    .line 378
    :cond_17
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->r:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->r:I

    if-eq v2, v3, :cond_18

    move v0, v1

    .line 380
    goto/16 :goto_0

    .line 382
    :cond_18
    iget-boolean v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->x:Z

    iget-boolean v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->x:Z

    if-eq v2, v3, :cond_0

    move v0, v1

    .line 384
    goto/16 :goto_0
.end method

.method public hashCode()I
    .locals 9

    .prologue
    const/16 v2, 0x4d5

    const/16 v1, 0x4cf

    const/16 v8, 0x20

    .line 247
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->m:I

    add-int/lit8 v0, v0, 0x1f

    .line 250
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->g:I

    add-int/2addr v0, v3

    .line 251
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->v:I

    add-int/2addr v0, v3

    .line 253
    iget-wide v4, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->n:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    .line 254
    mul-int/lit8 v0, v0, 0x1f

    ushr-long v6, v4, v8

    xor-long/2addr v4, v6

    long-to-int v3, v4

    add-int/2addr v0, v3

    .line 255
    iget-wide v4, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->o:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    .line 256
    mul-int/lit8 v0, v0, 0x1f

    ushr-long v6, v4, v8

    xor-long/2addr v4, v6

    long-to-int v3, v4

    add-int/2addr v0, v3

    .line 257
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->w:I

    add-int/2addr v0, v3

    .line 258
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->i:I

    add-int/2addr v0, v3

    .line 259
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->j:I

    add-int/2addr v0, v3

    .line 260
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->k:I

    add-int/2addr v0, v3

    .line 261
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->l:I

    add-int/2addr v0, v3

    .line 262
    mul-int/lit8 v3, v0, 0x1f

    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->z:Lorg/spongycastle/crypto/Digest;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v3

    .line 263
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->y:I

    add-int/2addr v0, v3

    .line 264
    iget-wide v4, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->s:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    .line 265
    mul-int/lit8 v0, v0, 0x1f

    ushr-long v6, v4, v8

    xor-long/2addr v4, v6

    long-to-int v3, v4

    add-int/2addr v0, v3

    .line 266
    iget-wide v4, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->t:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    .line 267
    mul-int/lit8 v0, v0, 0x1f

    ushr-long v6, v4, v8

    xor-long/2addr v4, v6

    long-to-int v3, v4

    add-int/2addr v0, v3

    .line 268
    iget-wide v4, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->p:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    .line 269
    mul-int/lit8 v0, v0, 0x1f

    ushr-long v6, v4, v8

    xor-long/2addr v4, v6

    long-to-int v3, v4

    add-int/2addr v0, v3

    .line 270
    iget-wide v4, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->q:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    .line 271
    mul-int/lit8 v0, v0, 0x1f

    ushr-long v6, v4, v8

    xor-long/2addr v4, v6

    long-to-int v3, v4

    add-int/2addr v0, v3

    .line 272
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->A:I

    add-int/2addr v0, v3

    .line 273
    mul-int/lit8 v3, v0, 0x1f

    iget-boolean v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->u:Z

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    add-int/2addr v0, v3

    .line 274
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->h:I

    add-int/2addr v0, v3

    .line 275
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->r:I

    add-int/2addr v0, v3

    .line 276
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->x:Z

    if-eqz v3, :cond_2

    :goto_2
    add-int/2addr v0, v1

    .line 277
    return v0

    .line 262
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->z:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    .line 273
    goto :goto_1

    :cond_2
    move v1, v2

    .line 276
    goto :goto_2
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .prologue
    .line 391
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "0.00"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 393
    new-instance v1, Ljava/lang/StringBuilder;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SignatureParameters(N="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->g:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " q="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->h:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 394
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->A:I

    if-nez v2, :cond_0

    .line 396
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " polyType=SIMPLE d="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->i:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " B="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->m:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " basisType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->v:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " beta="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v4, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->n:D

    invoke-virtual {v0, v4, v5}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " normBound="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v4, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->p:D

    invoke-virtual {v0, v4, v5}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " keyNormBound="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v4, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->s:D

    invoke-virtual {v0, v4, v5}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " prime="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->u:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " sparse="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->x:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " keyGenAlg="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->y:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " hashAlg="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->z:Lorg/spongycastle/crypto/Digest;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 400
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " polyType=PRODUCT d1="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->j:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " d2="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->k:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " d3="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->l:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0
.end method
