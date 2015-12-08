.class public Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;
.super Lorg/spongycastle/crypto/KeyGenerationParameters;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final a:Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

.field public static final b:Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

.field public static final c:Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

.field public static final d:Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

.field public static final e:Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

.field public static final f:Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

.field public static final g:Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;


# instance fields
.field public A:I

.field public B:I

.field public C:Z

.field public D:[B

.field public E:Z

.field public F:Z

.field public G:I

.field public H:Lorg/spongycastle/crypto/Digest;

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field s:I

.field public t:I

.field public u:I

.field public v:I

.field w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .prologue
    .line 26
    new-instance v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    const/16 v1, 0x43f

    const/16 v2, 0x800

    const/16 v3, 0x78

    const/16 v4, 0x78

    const/16 v5, 0x100

    const/16 v6, 0xd

    const/16 v7, 0x19

    const/16 v8, 0xe

    const/4 v9, 0x1

    const/4 v10, 0x3

    new-array v10, v10, [B

    fill-array-data v10, :array_0

    const/4 v11, 0x1

    const/4 v12, 0x0

    new-instance v13, Lorg/spongycastle/crypto/digests/SHA512Digest;

    invoke-direct {v13}, Lorg/spongycastle/crypto/digests/SHA512Digest;-><init>()V

    invoke-direct/range {v0 .. v13}, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;-><init>(IIIIIIIIZ[BZZLorg/spongycastle/crypto/Digest;)V

    sput-object v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->a:Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    .line 31
    new-instance v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    const/16 v1, 0x493

    const/16 v2, 0x800

    const/16 v3, 0x6a

    const/16 v4, 0x6a

    const/16 v5, 0x100

    const/16 v6, 0xd

    const/16 v7, 0x14

    const/16 v8, 0xf

    const/4 v9, 0x1

    const/4 v10, 0x3

    new-array v10, v10, [B

    fill-array-data v10, :array_1

    const/4 v11, 0x1

    const/4 v12, 0x0

    new-instance v13, Lorg/spongycastle/crypto/digests/SHA512Digest;

    invoke-direct {v13}, Lorg/spongycastle/crypto/digests/SHA512Digest;-><init>()V

    invoke-direct/range {v0 .. v13}, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;-><init>(IIIIIIIIZ[BZZLorg/spongycastle/crypto/Digest;)V

    sput-object v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    .line 36
    new-instance v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    const/16 v1, 0x5db

    const/16 v2, 0x800

    const/16 v3, 0x4f

    const/16 v4, 0x4f

    const/16 v5, 0x100

    const/16 v6, 0xd

    const/16 v7, 0x11

    const/16 v8, 0x13

    const/4 v9, 0x1

    const/4 v10, 0x3

    new-array v10, v10, [B

    fill-array-data v10, :array_2

    const/4 v11, 0x1

    const/4 v12, 0x0

    new-instance v13, Lorg/spongycastle/crypto/digests/SHA512Digest;

    invoke-direct {v13}, Lorg/spongycastle/crypto/digests/SHA512Digest;-><init>()V

    invoke-direct/range {v0 .. v13}, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;-><init>(IIIIIIIIZ[BZZLorg/spongycastle/crypto/Digest;)V

    sput-object v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->c:Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    .line 41
    new-instance v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    const/16 v1, 0x1b7

    const/16 v2, 0x800

    const/16 v3, 0x92

    const/16 v4, 0x82

    const/16 v5, 0x80

    const/16 v6, 0x9

    const/16 v7, 0x20

    const/16 v8, 0x9

    const/4 v9, 0x1

    const/4 v10, 0x3

    new-array v10, v10, [B

    fill-array-data v10, :array_3

    const/4 v11, 0x1

    const/4 v12, 0x0

    new-instance v13, Lorg/spongycastle/crypto/digests/SHA256Digest;

    invoke-direct {v13}, Lorg/spongycastle/crypto/digests/SHA256Digest;-><init>()V

    invoke-direct/range {v0 .. v13}, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;-><init>(IIIIIIIIZ[BZZLorg/spongycastle/crypto/Digest;)V

    sput-object v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->d:Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    .line 46
    new-instance v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    const/16 v1, 0x1b7

    const/16 v2, 0x800

    const/16 v3, 0x9

    const/16 v4, 0x8

    const/4 v5, 0x5

    const/16 v6, 0x82

    const/16 v7, 0x80

    const/16 v8, 0x9

    const/16 v9, 0x20

    const/16 v10, 0x9

    const/4 v11, 0x1

    const/4 v12, 0x3

    new-array v12, v12, [B

    fill-array-data v12, :array_4

    const/4 v13, 0x1

    const/4 v14, 0x1

    new-instance v15, Lorg/spongycastle/crypto/digests/SHA256Digest;

    invoke-direct {v15}, Lorg/spongycastle/crypto/digests/SHA256Digest;-><init>()V

    invoke-direct/range {v0 .. v15}, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;-><init>(IIIIIIIIIIZ[BZZLorg/spongycastle/crypto/Digest;)V

    sput-object v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->e:Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    .line 51
    new-instance v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    const/16 v1, 0x2e7

    const/16 v2, 0x800

    const/16 v3, 0xf8

    const/16 v4, 0xdc

    const/16 v5, 0x100

    const/16 v6, 0xa

    const/16 v7, 0x1b

    const/16 v8, 0xe

    const/4 v9, 0x1

    const/4 v10, 0x3

    new-array v10, v10, [B

    fill-array-data v10, :array_5

    const/4 v11, 0x0

    const/4 v12, 0x0

    new-instance v13, Lorg/spongycastle/crypto/digests/SHA512Digest;

    invoke-direct {v13}, Lorg/spongycastle/crypto/digests/SHA512Digest;-><init>()V

    invoke-direct/range {v0 .. v13}, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;-><init>(IIIIIIIIZ[BZZLorg/spongycastle/crypto/Digest;)V

    sput-object v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->f:Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    .line 56
    new-instance v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    const/16 v1, 0x2e7

    const/16 v2, 0x800

    const/16 v3, 0xb

    const/16 v4, 0xb

    const/16 v5, 0xf

    const/16 v6, 0xdc

    const/16 v7, 0x100

    const/16 v8, 0xa

    const/16 v9, 0x1b

    const/16 v10, 0xe

    const/4 v11, 0x1

    const/4 v12, 0x3

    new-array v12, v12, [B

    fill-array-data v12, :array_6

    const/4 v13, 0x0

    const/4 v14, 0x1

    new-instance v15, Lorg/spongycastle/crypto/digests/SHA512Digest;

    invoke-direct {v15}, Lorg/spongycastle/crypto/digests/SHA512Digest;-><init>()V

    invoke-direct/range {v0 .. v15}, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;-><init>(IIIIIIIIIIZ[BZZLorg/spongycastle/crypto/Digest;)V

    sput-object v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->g:Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    return-void

    .line 26
    nop

    :array_0
    .array-data 1
        0x0t
        0x6t
        0x3t
    .end array-data

    .line 31
    :array_1
    .array-data 1
        0x0t
        0x6t
        0x4t
    .end array-data

    .line 36
    :array_2
    .array-data 1
        0x0t
        0x6t
        0x5t
    .end array-data

    .line 41
    :array_3
    .array-data 1
        0x0t
        0x7t
        0x65t
    .end array-data

    .line 46
    :array_4
    .array-data 1
        0x0t
        0x7t
        0x65t
    .end array-data

    .line 51
    :array_5
    .array-data 1
        0x0t
        0x7t
        0x69t
    .end array-data

    .line 56
    :array_6
    .array-data 1
        0x0t
        0x7t
        0x69t
    .end array-data
.end method

.method private constructor <init>(IIIIIIIIIIZ[BZZLorg/spongycastle/crypto/Digest;)V
    .locals 2

    .prologue
    .line 139
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    invoke-direct {p0, v1, p7}, Lorg/spongycastle/crypto/KeyGenerationParameters;-><init>(Ljava/security/SecureRandom;I)V

    .line 141
    iput p1, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->h:I

    .line 142
    iput p2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->i:I

    .line 143
    iput p3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->k:I

    .line 144
    iput p4, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->l:I

    .line 145
    iput p5, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->m:I

    .line 146
    iput p7, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->u:I

    .line 147
    iput p6, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->x:I

    .line 148
    iput p8, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->z:I

    .line 149
    iput p9, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->A:I

    .line 150
    iput p10, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->B:I

    .line 151
    iput-boolean p11, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->C:Z

    .line 152
    iput-object p12, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->D:[B

    .line 153
    iput-boolean p13, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->E:Z

    .line 154
    move/from16 v0, p14

    iput-boolean v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->F:Z

    .line 155
    const/4 v1, 0x1

    iput v1, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->G:I

    .line 156
    move-object/from16 v0, p15

    iput-object v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->H:Lorg/spongycastle/crypto/Digest;

    .line 157
    invoke-direct {p0}, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->c()V

    .line 158
    return-void
.end method

.method private constructor <init>(IIIIIIIIZ[BZZLorg/spongycastle/crypto/Digest;)V
    .locals 1

    .prologue
    .line 100
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    invoke-direct {p0, v0, p5}, Lorg/spongycastle/crypto/KeyGenerationParameters;-><init>(Ljava/security/SecureRandom;I)V

    .line 101
    iput p1, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->h:I

    .line 102
    iput p2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->i:I

    .line 103
    iput p3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->j:I

    .line 104
    iput p5, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->u:I

    .line 105
    iput p4, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->x:I

    .line 106
    iput p6, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->z:I

    .line 107
    iput p7, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->A:I

    .line 108
    iput p8, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->B:I

    .line 109
    iput-boolean p9, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->C:Z

    .line 110
    iput-object p10, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->D:[B

    .line 111
    iput-boolean p11, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->E:Z

    .line 112
    iput-boolean p12, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->F:Z

    .line 113
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->G:I

    .line 114
    iput-object p13, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->H:Lorg/spongycastle/crypto/Digest;

    .line 115
    invoke-direct {p0}, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->c()V

    .line 116
    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 162
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->j:I

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->n:I

    .line 163
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->k:I

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->o:I

    .line 164
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->l:I

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->p:I

    .line 165
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->m:I

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->q:I

    .line 166
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->h:I

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->r:I

    .line 167
    const/4 v0, 0x1

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->s:I

    .line 168
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->h:I

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    div-int/lit8 v0, v0, 0x8

    iget v1, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->s:I

    sub-int/2addr v0, v1

    iget v1, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->u:I

    div-int/lit8 v1, v1, 0x8

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->t:I

    .line 169
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->h:I

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    mul-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->v:I

    .line 170
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->h:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->w:I

    .line 171
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->u:I

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->y:I

    .line 172
    return-void
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .locals 17

    .prologue
    .line 19
    move-object/from16 v0, p0

    iget v1, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->G:I

    if-nez v1, :cond_0

    new-instance v1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    move-object/from16 v0, p0

    iget v2, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->h:I

    move-object/from16 v0, p0

    iget v3, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->i:I

    move-object/from16 v0, p0

    iget v4, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->j:I

    move-object/from16 v0, p0

    iget v5, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->x:I

    move-object/from16 v0, p0

    iget v6, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->u:I

    move-object/from16 v0, p0

    iget v7, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->z:I

    move-object/from16 v0, p0

    iget v8, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->A:I

    move-object/from16 v0, p0

    iget v9, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->B:I

    move-object/from16 v0, p0

    iget-boolean v10, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->C:Z

    move-object/from16 v0, p0

    iget-object v11, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->D:[B

    move-object/from16 v0, p0

    iget-boolean v12, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->E:Z

    move-object/from16 v0, p0

    iget-boolean v13, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->F:Z

    move-object/from16 v0, p0

    iget-object v14, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->H:Lorg/spongycastle/crypto/Digest;

    invoke-direct/range {v1 .. v14}, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;-><init>(IIIIIIIIZ[BZZLorg/spongycastle/crypto/Digest;)V

    :goto_0
    return-object v1

    :cond_0
    new-instance v1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    move-object/from16 v0, p0

    iget v2, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->h:I

    move-object/from16 v0, p0

    iget v3, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->i:I

    move-object/from16 v0, p0

    iget v4, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->k:I

    move-object/from16 v0, p0

    iget v5, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->l:I

    move-object/from16 v0, p0

    iget v6, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->m:I

    move-object/from16 v0, p0

    iget v7, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->x:I

    move-object/from16 v0, p0

    iget v8, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->u:I

    move-object/from16 v0, p0

    iget v9, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->z:I

    move-object/from16 v0, p0

    iget v10, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->A:I

    move-object/from16 v0, p0

    iget v11, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->B:I

    move-object/from16 v0, p0

    iget-boolean v12, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->C:Z

    move-object/from16 v0, p0

    iget-object v13, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->D:[B

    move-object/from16 v0, p0

    iget-boolean v14, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->E:Z

    move-object/from16 v0, p0

    iget-boolean v15, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->F:Z

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->H:Lorg/spongycastle/crypto/Digest;

    move-object/from16 v16, v0

    invoke-direct/range {v1 .. v16}, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;-><init>(IIIIIIIIIIZ[BZZLorg/spongycastle/crypto/Digest;)V

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 317
    if-ne p0, p1, :cond_1

    .line 445
    :cond_0
    :goto_0
    return v0

    .line 321
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 323
    goto :goto_0

    .line 325
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    move v0, v1

    .line 327
    goto :goto_0

    .line 329
    :cond_3
    check-cast p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;

    .line 330
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->h:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->h:I

    if-eq v2, v3, :cond_4

    move v0, v1

    .line 332
    goto :goto_0

    .line 334
    :cond_4
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->v:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->v:I

    if-eq v2, v3, :cond_5

    move v0, v1

    .line 336
    goto :goto_0

    .line 338
    :cond_5
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->w:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->w:I

    if-eq v2, v3, :cond_6

    move v0, v1

    .line 340
    goto :goto_0

    .line 342
    :cond_6
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->z:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->z:I

    if-eq v2, v3, :cond_7

    move v0, v1

    .line 344
    goto :goto_0

    .line 346
    :cond_7
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->u:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->u:I

    if-eq v2, v3, :cond_8

    move v0, v1

    .line 348
    goto :goto_0

    .line 350
    :cond_8
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->j:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->j:I

    if-eq v2, v3, :cond_9

    move v0, v1

    .line 352
    goto :goto_0

    .line 354
    :cond_9
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->k:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->k:I

    if-eq v2, v3, :cond_a

    move v0, v1

    .line 356
    goto :goto_0

    .line 358
    :cond_a
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->l:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->l:I

    if-eq v2, v3, :cond_b

    move v0, v1

    .line 360
    goto :goto_0

    .line 362
    :cond_b
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->m:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->m:I

    if-eq v2, v3, :cond_c

    move v0, v1

    .line 364
    goto :goto_0

    .line 366
    :cond_c
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->r:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->r:I

    if-eq v2, v3, :cond_d

    move v0, v1

    .line 368
    goto :goto_0

    .line 370
    :cond_d
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->x:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->x:I

    if-eq v2, v3, :cond_e

    move v0, v1

    .line 372
    goto :goto_0

    .line 374
    :cond_e
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->n:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->n:I

    if-eq v2, v3, :cond_f

    move v0, v1

    .line 376
    goto :goto_0

    .line 378
    :cond_f
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->o:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->o:I

    if-eq v2, v3, :cond_10

    move v0, v1

    .line 380
    goto :goto_0

    .line 382
    :cond_10
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->p:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->p:I

    if-eq v2, v3, :cond_11

    move v0, v1

    .line 384
    goto/16 :goto_0

    .line 386
    :cond_11
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->q:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->q:I

    if-eq v2, v3, :cond_12

    move v0, v1

    .line 388
    goto/16 :goto_0

    .line 390
    :cond_12
    iget-boolean v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->F:Z

    iget-boolean v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->F:Z

    if-eq v2, v3, :cond_13

    move v0, v1

    .line 392
    goto/16 :goto_0

    .line 394
    :cond_13
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->H:Lorg/spongycastle/crypto/Digest;

    if-nez v2, :cond_14

    .line 396
    iget-object v2, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->H:Lorg/spongycastle/crypto/Digest;

    if-eqz v2, :cond_15

    move v0, v1

    .line 398
    goto/16 :goto_0

    .line 401
    :cond_14
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->H:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/spongycastle/crypto/Digest;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->H:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v3}, Lorg/spongycastle/crypto/Digest;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    move v0, v1

    .line 403
    goto/16 :goto_0

    .line 405
    :cond_15
    iget-boolean v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->C:Z

    iget-boolean v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->C:Z

    if-eq v2, v3, :cond_16

    move v0, v1

    .line 407
    goto/16 :goto_0

    .line 409
    :cond_16
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->s:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->s:I

    if-eq v2, v3, :cond_17

    move v0, v1

    .line 411
    goto/16 :goto_0

    .line 413
    :cond_17
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->t:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->t:I

    if-eq v2, v3, :cond_18

    move v0, v1

    .line 415
    goto/16 :goto_0

    .line 417
    :cond_18
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->B:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->B:I

    if-eq v2, v3, :cond_19

    move v0, v1

    .line 419
    goto/16 :goto_0

    .line 421
    :cond_19
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->A:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->A:I

    if-eq v2, v3, :cond_1a

    move v0, v1

    .line 423
    goto/16 :goto_0

    .line 425
    :cond_1a
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->D:[B

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->D:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-nez v2, :cond_1b

    move v0, v1

    .line 427
    goto/16 :goto_0

    .line 429
    :cond_1b
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->y:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->y:I

    if-eq v2, v3, :cond_1c

    move v0, v1

    .line 431
    goto/16 :goto_0

    .line 433
    :cond_1c
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->G:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->G:I

    if-eq v2, v3, :cond_1d

    move v0, v1

    .line 435
    goto/16 :goto_0

    .line 437
    :cond_1d
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->i:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->i:I

    if-eq v2, v3, :cond_1e

    move v0, v1

    .line 439
    goto/16 :goto_0

    .line 441
    :cond_1e
    iget-boolean v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->E:Z

    iget-boolean v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->E:Z

    if-eq v2, v3, :cond_0

    move v0, v1

    .line 443
    goto/16 :goto_0
.end method

.method public hashCode()I
    .locals 4

    .prologue
    const/16 v2, 0x4d5

    const/16 v1, 0x4cf

    .line 283
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->h:I

    add-int/lit8 v0, v0, 0x1f

    .line 286
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->v:I

    add-int/2addr v0, v3

    .line 287
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->w:I

    add-int/2addr v0, v3

    .line 288
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->z:I

    add-int/2addr v0, v3

    .line 289
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->u:I

    add-int/2addr v0, v3

    .line 290
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->j:I

    add-int/2addr v0, v3

    .line 291
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->k:I

    add-int/2addr v0, v3

    .line 292
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->l:I

    add-int/2addr v0, v3

    .line 293
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->m:I

    add-int/2addr v0, v3

    .line 294
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->r:I

    add-int/2addr v0, v3

    .line 295
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->x:I

    add-int/2addr v0, v3

    .line 296
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->n:I

    add-int/2addr v0, v3

    .line 297
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->o:I

    add-int/2addr v0, v3

    .line 298
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->p:I

    add-int/2addr v0, v3

    .line 299
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->q:I

    add-int/2addr v0, v3

    .line 300
    mul-int/lit8 v3, v0, 0x1f

    iget-boolean v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->F:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    add-int/2addr v0, v3

    .line 301
    mul-int/lit8 v3, v0, 0x1f

    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->H:Lorg/spongycastle/crypto/Digest;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_1
    add-int/2addr v0, v3

    .line 302
    mul-int/lit8 v3, v0, 0x1f

    iget-boolean v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->C:Z

    if-eqz v0, :cond_2

    move v0, v1

    :goto_2
    add-int/2addr v0, v3

    .line 303
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->s:I

    add-int/2addr v0, v3

    .line 304
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->t:I

    add-int/2addr v0, v3

    .line 305
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->B:I

    add-int/2addr v0, v3

    .line 306
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->A:I

    add-int/2addr v0, v3

    .line 307
    mul-int/lit8 v0, v0, 0x1f

    iget-object v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->D:[B

    invoke-static {v3}, Ljava/util/Arrays;->hashCode([B)I

    move-result v3

    add-int/2addr v0, v3

    .line 308
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->y:I

    add-int/2addr v0, v3

    .line 309
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->G:I

    add-int/2addr v0, v3

    .line 310
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->i:I

    add-int/2addr v0, v3

    .line 311
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->E:Z

    if-eqz v3, :cond_3

    :goto_3
    add-int/2addr v0, v1

    .line 312
    return v0

    :cond_0
    move v0, v2

    .line 300
    goto :goto_0

    .line 301
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->H:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_1

    :cond_2
    move v0, v2

    .line 302
    goto :goto_2

    :cond_3
    move v1, v2

    .line 311
    goto :goto_3
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 450
    new-instance v0, Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "EncryptionParameters(N="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " q="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->i:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 451
    iget v1, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->G:I

    if-nez v1, :cond_0

    .line 453
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " polyType=SIMPLE df="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->j:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " dm0="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->x:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " db="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->u:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " c="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->z:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " minCallsR="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->A:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " minCallsMask="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->B:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " hashSeed="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->C:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " hashAlg="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->H:Lorg/spongycastle/crypto/Digest;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " oid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->D:[B

    invoke-static {v2}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " sparse="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->E:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 457
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " polyType=PRODUCT df1="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->k:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " df2="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->l:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " df3="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionKeyGenerationParameters;->m:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0
.end method
