.class public abstract Lorg/spongycastle/crypto/digests/LongDigest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/ExtendedDigest;


# static fields
.field static final i:[J


# instance fields
.field protected a:J

.field protected b:J

.field protected c:J

.field protected d:J

.field protected e:J

.field protected f:J

.field protected g:J

.field protected h:J

.field private j:[B

.field private k:I

.field private l:J

.field private m:J

.field private n:[J

.field private o:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 332
    const/16 v0, 0x50

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    sput-object v0, Lorg/spongycastle/crypto/digests/LongDigest;->i:[J

    return-void

    :array_0
    .array-data 8
        0x428a2f98d728ae22L    # 3.5989662528217666E12
        0x7137449123ef65cdL    # 2.367405559035152E237
        -0x4a3f043013b2c4d1L    # -9.0786554787018E-50
        -0x164a245a7e762444L
        0x3956c25bf348b538L
        0x59f111f1b605d019L    # 1.8054860536953294E125
        -0x6dc07d5b50e6b065L    # -8.717181310573585E-221
        -0x54e3a12a25927ee8L
        -0x27f855675cfcfdbeL    # -1.1656291332323638E116
        0x12835b0145706fbeL
        0x243185be4ee4b28cL    # 2.410773468256423E-134
        0x550c7dc3d5ffb4e2L    # 4.985403983718413E101
        0x72be5d74f27b896fL    # 5.183352230240388E244
        -0x7f214e01c4e9694fL
        -0x6423f958da38edcbL
        -0x3e640e8b3096d96cL    # -1.1720222785268623E8
        -0x1b64963e610eb52eL    # -4.339261227288659E176
        -0x1041b879c7b0da1dL    # -1.836300920646737E230
        0xfc19dc68b8cd5b5L    # 8.864787397362889E-233
        0x240ca1cc77ac9c65L    # 4.924067956729057E-135
        0x2de92c6f592b0275L    # 1.5818166760957606E-87
        0x4a7484aa6ea6e483L    # 4.79798724707082E50
        0x5cb0a9dcbd41fbd4L    # 3.100593885146353E138
        0x76f988da831153b5L    # 1.2864857866870779E265
        -0x67c1aead11992055L
        -0x57ce3992d24bcdf0L    # -4.511217866312199E-115
        -0x4ffcd8376704dec1L    # -2.0678662886600765E-77
        -0x40a680384110f11cL    # -0.0015563440936014411
        -0x391ff40cc257703eL    # -2.603722742751637E33
        -0x2a586eb86cf558dbL    # -4.222814448133811E104
        0x6ca6351e003826fL
        0x142929670a0e6e70L
        0x27b70a8546d22ffcL
        0x2e1b21385c26c926L    # 1.3637893953385892E-86
        0x4d2c6dfc5ac42aedL    # 5.84763610164635E63
        0x53380d139d95b3dfL    # 7.838866619197482E92
        0x650a73548baf63deL    # 5.35921865865203E178
        0x766a0abb3c77b2a8L    # 2.5625906234442426E262
        -0x7e3d36d1b812511aL    # -3.506432391784029E-300
        -0x6d8dd37aeb7dcac5L    # -8.044358981173315E-220
        -0x5d40175eb30efc9cL
        -0x57e599b443bdcfffL
        -0x3db4748f2f07686fL    # -2.366070870891841E11
        -0x3893ae5cf9ab41d0L    # -1.17632082693375E36
        -0x2e6d17e62910ade8L    # -9.182337425192181E84
        -0x2966f9dbaa9a56f0L    # -1.4692477645833556E109
        -0xbf1ca7aa88edfd6L
        0x106aa07032bbd1b8L
        0x19a4c116b8d2d0c8L
        0x1e376c085141ab53L    # 4.067301537801791E-163
        0x2748774cdf8eeb99L    # 1.894937972556452E-119
        0x34b0bcb5e19b48a8L    # 6.82593759724882E-55
        0x391c0cb3c5c95a63L    # 1.3505399862746614E-33
        0x4ed8aa4ae3418acbL    # 6.809319594147137E71
        0x5b9cca4f7763e373L    # 2.0435436325319052E133
        0x682e6ff3d6b2b8a3L    # 6.943421982965376E193
        0x748f82ee5defb2fcL    # 2.887850816088868E253
        0x78a5636f43172f60L    # 1.4463210820003646E273
        -0x7b3787eb5e0f548eL
        -0x7338fdf7e59bc614L
        -0x6f410005dc9ce1d8L    # -5.111680914909667E-228
        -0x5baf9314217d4217L    # -9.03940504491957E-134
        -0x41065c084d3986ebL    # -2.445268471406536E-5
        -0x398e870d1c8dacd5L    # -2.2148969568888243E31
        -0x35d8c13115d99e64L    # -1.6986554718624063E49
        -0x2e794738de3f3df9L    # -5.517613964471652E84
        -0x15258229321f14e2L    # -5.315750124715331E206
        -0xa82b08011912e88L    # -8.801976642581914E257
        0x6f067aa72176fbaL
        0xa637dc5a2c898a6L
        0x113f9804bef90daeL
        0x1b710b35131c471bL
        0x28db77f523047d84L    # 7.138679721560702E-112
        0x32caab7b40c72493L    # 5.064907242937011E-64
        0x3c9ebe0a15c9bebcL    # 1.0665892261952011E-16
        0x431d67c49c100d4cL    # 2.069217113539411E15
        0x4cc5d4becb3e42b6L    # 7.016224550123326E61
        0x597f299cfc657e2aL    # 1.2875119238090917E123
        0x5fcb6fab3ad6faecL    # 2.873901462601813E153
        0x6c44198c4a475817L    # 3.3832852265175575E213
    .end array-data
.end method

.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/16 v0, 0x50

    new-array v0, v0, [J

    iput-object v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    .line 30
    const/16 v0, 0x8

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->j:[B

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->k:I

    .line 33
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/LongDigest;->c()V

    .line 34
    return-void
.end method

.method protected constructor <init>(Lorg/spongycastle/crypto/digests/LongDigest;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/16 v0, 0x50

    new-array v0, v0, [J

    iput-object v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    .line 43
    iget-object v0, p1, Lorg/spongycastle/crypto/digests/LongDigest;->j:[B

    array-length v0, v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->j:[B

    .line 44
    iget-object v0, p1, Lorg/spongycastle/crypto/digests/LongDigest;->j:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/digests/LongDigest;->j:[B

    iget-object v2, p1, Lorg/spongycastle/crypto/digests/LongDigest;->j:[B

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 46
    iget v0, p1, Lorg/spongycastle/crypto/digests/LongDigest;->k:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->k:I

    .line 47
    iget-wide v0, p1, Lorg/spongycastle/crypto/digests/LongDigest;->l:J

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->l:J

    .line 48
    iget-wide v0, p1, Lorg/spongycastle/crypto/digests/LongDigest;->m:J

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->m:J

    .line 50
    iget-wide v0, p1, Lorg/spongycastle/crypto/digests/LongDigest;->a:J

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->a:J

    .line 51
    iget-wide v0, p1, Lorg/spongycastle/crypto/digests/LongDigest;->b:J

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->b:J

    .line 52
    iget-wide v0, p1, Lorg/spongycastle/crypto/digests/LongDigest;->c:J

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->c:J

    .line 53
    iget-wide v0, p1, Lorg/spongycastle/crypto/digests/LongDigest;->d:J

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->d:J

    .line 54
    iget-wide v0, p1, Lorg/spongycastle/crypto/digests/LongDigest;->e:J

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->e:J

    .line 55
    iget-wide v0, p1, Lorg/spongycastle/crypto/digests/LongDigest;->f:J

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->f:J

    .line 56
    iget-wide v0, p1, Lorg/spongycastle/crypto/digests/LongDigest;->g:J

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->g:J

    .line 57
    iget-wide v0, p1, Lorg/spongycastle/crypto/digests/LongDigest;->h:J

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->h:J

    .line 59
    iget-object v0, p1, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    iget-object v1, p0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    iget-object v2, p1, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 60
    iget v0, p1, Lorg/spongycastle/crypto/digests/LongDigest;->o:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->o:I

    .line 61
    return-void
.end method

.method private static a(J)J
    .locals 6

    .prologue
    .line 307
    const/16 v0, 0x24

    shl-long v0, p0, v0

    const/16 v2, 0x1c

    ushr-long v2, p0, v2

    or-long/2addr v0, v2

    const/16 v2, 0x1e

    shl-long v2, p0, v2

    const/16 v4, 0x22

    ushr-long v4, p0, v4

    or-long/2addr v2, v4

    xor-long/2addr v0, v2

    const/16 v2, 0x19

    shl-long v2, p0, v2

    const/16 v4, 0x27

    ushr-long v4, p0, v4

    or-long/2addr v2, v4

    xor-long/2addr v0, v2

    return-wide v0
.end method

.method private static a(JJJ)J
    .locals 4

    .prologue
    .line 293
    and-long v0, p0, p2

    const-wide/16 v2, -0x1

    xor-long/2addr v2, p0

    and-long/2addr v2, p4

    xor-long/2addr v0, v2

    return-wide v0
.end method

.method private static b(J)J
    .locals 6

    .prologue
    .line 313
    const/16 v0, 0x32

    shl-long v0, p0, v0

    const/16 v2, 0xe

    ushr-long v2, p0, v2

    or-long/2addr v0, v2

    const/16 v2, 0x2e

    shl-long v2, p0, v2

    const/16 v4, 0x12

    ushr-long v4, p0, v4

    or-long/2addr v2, v4

    xor-long/2addr v0, v2

    const/16 v2, 0x17

    shl-long v2, p0, v2

    const/16 v4, 0x29

    ushr-long v4, p0, v4

    or-long/2addr v2, v4

    xor-long/2addr v0, v2

    return-wide v0
.end method

.method private static b(JJJ)J
    .locals 4

    .prologue
    .line 301
    and-long v0, p0, p2

    and-long v2, p0, p4

    xor-long/2addr v0, v2

    and-long v2, p2, p4

    xor-long/2addr v0, v2

    return-wide v0
.end method

.method private b([BI)V
    .locals 4

    .prologue
    .line 166
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    iget v1, p0, Lorg/spongycastle/crypto/digests/LongDigest;->o:I

    invoke-static {p1, p2}, Lorg/spongycastle/crypto/util/Pack;->b([BI)J

    move-result-wide v2

    aput-wide v2, v0, v1

    .line 168
    iget v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->o:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->o:I

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    .line 170
    invoke-direct {p0}, Lorg/spongycastle/crypto/digests/LongDigest;->g()V

    .line 172
    :cond_0
    return-void
.end method

.method private f()V
    .locals 8

    .prologue
    const-wide v6, 0x1fffffffffffffffL

    .line 180
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->l:J

    cmp-long v0, v0, v6

    if-lez v0, :cond_0

    .line 182
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->m:J

    iget-wide v2, p0, Lorg/spongycastle/crypto/digests/LongDigest;->l:J

    const/16 v4, 0x3d

    ushr-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->m:J

    .line 183
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->l:J

    and-long/2addr v0, v6

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->l:J

    .line 185
    :cond_0
    return-void
.end method

.method private g()V
    .locals 31

    .prologue
    .line 202
    invoke-direct/range {p0 .. p0}, Lorg/spongycastle/crypto/digests/LongDigest;->f()V

    .line 207
    const/16 v2, 0x10

    :goto_0
    const/16 v3, 0x4f

    if-gt v2, v3, :cond_0

    .line 209
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    move-object/from16 v0, p0

    iget-object v4, v0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    add-int/lit8 v5, v2, -0x2

    aget-wide v4, v4, v5

    const/16 v6, 0x2d

    shl-long v6, v4, v6

    const/16 v8, 0x13

    ushr-long v8, v4, v8

    or-long/2addr v6, v8

    const/4 v8, 0x3

    shl-long v8, v4, v8

    const/16 v10, 0x3d

    ushr-long v10, v4, v10

    or-long/2addr v8, v10

    xor-long/2addr v6, v8

    const/4 v8, 0x6

    ushr-long/2addr v4, v8

    xor-long/2addr v4, v6

    move-object/from16 v0, p0

    iget-object v6, v0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    add-int/lit8 v7, v2, -0x7

    aget-wide v6, v6, v7

    add-long/2addr v4, v6

    move-object/from16 v0, p0

    iget-object v6, v0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    add-int/lit8 v7, v2, -0xf

    aget-wide v6, v6, v7

    const/16 v8, 0x3f

    shl-long v8, v6, v8

    const/4 v10, 0x1

    ushr-long v10, v6, v10

    or-long/2addr v8, v10

    const/16 v10, 0x38

    shl-long v10, v6, v10

    const/16 v12, 0x8

    ushr-long v12, v6, v12

    or-long/2addr v10, v12

    xor-long/2addr v8, v10

    const/4 v10, 0x7

    ushr-long/2addr v6, v10

    xor-long/2addr v6, v8

    add-long/2addr v4, v6

    move-object/from16 v0, p0

    iget-object v6, v0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    add-int/lit8 v7, v2, -0x10

    aget-wide v6, v6, v7

    add-long/2addr v4, v6

    aput-wide v4, v3, v2

    .line 207
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 215
    :cond_0
    move-object/from16 v0, p0

    iget-wide v0, v0, Lorg/spongycastle/crypto/digests/LongDigest;->a:J

    move-wide/from16 v18, v0

    .line 216
    move-object/from16 v0, p0

    iget-wide v0, v0, Lorg/spongycastle/crypto/digests/LongDigest;->b:J

    move-wide/from16 v16, v0

    .line 217
    move-object/from16 v0, p0

    iget-wide v14, v0, Lorg/spongycastle/crypto/digests/LongDigest;->c:J

    .line 218
    move-object/from16 v0, p0

    iget-wide v12, v0, Lorg/spongycastle/crypto/digests/LongDigest;->d:J

    .line 219
    move-object/from16 v0, p0

    iget-wide v10, v0, Lorg/spongycastle/crypto/digests/LongDigest;->e:J

    .line 220
    move-object/from16 v0, p0

    iget-wide v8, v0, Lorg/spongycastle/crypto/digests/LongDigest;->f:J

    .line 221
    move-object/from16 v0, p0

    iget-wide v6, v0, Lorg/spongycastle/crypto/digests/LongDigest;->g:J

    .line 222
    move-object/from16 v0, p0

    iget-wide v4, v0, Lorg/spongycastle/crypto/digests/LongDigest;->h:J

    .line 224
    const/4 v3, 0x0

    .line 225
    const/4 v2, 0x0

    move/from16 v20, v2

    move/from16 v30, v3

    move-wide v2, v10

    move-wide/from16 v10, v16

    move-wide/from16 v16, v4

    move-wide v4, v8

    move-wide/from16 v8, v18

    move-wide/from16 v18, v12

    move-wide v12, v14

    move/from16 v14, v30

    :goto_1
    const/16 v15, 0xa

    move/from16 v0, v20

    if-ge v0, v15, :cond_1

    .line 228
    invoke-static {v2, v3}, Lorg/spongycastle/crypto/digests/LongDigest;->b(J)J

    move-result-wide v22

    invoke-static/range {v2 .. v7}, Lorg/spongycastle/crypto/digests/LongDigest;->a(JJJ)J

    move-result-wide v24

    add-long v22, v22, v24

    sget-object v15, Lorg/spongycastle/crypto/digests/LongDigest;->i:[J

    aget-wide v24, v15, v14

    add-long v22, v22, v24

    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    add-int/lit8 v21, v14, 0x1

    aget-wide v14, v15, v14

    add-long v14, v14, v22

    add-long v16, v16, v14

    .line 229
    add-long v14, v18, v16

    .line 230
    invoke-static {v8, v9}, Lorg/spongycastle/crypto/digests/LongDigest;->a(J)J

    move-result-wide v18

    invoke-static/range {v8 .. v13}, Lorg/spongycastle/crypto/digests/LongDigest;->b(JJJ)J

    move-result-wide v22

    add-long v18, v18, v22

    add-long v22, v16, v18

    .line 233
    invoke-static {v14, v15}, Lorg/spongycastle/crypto/digests/LongDigest;->b(J)J

    move-result-wide v24

    move-wide/from16 v16, v2

    move-wide/from16 v18, v4

    invoke-static/range {v14 .. v19}, Lorg/spongycastle/crypto/digests/LongDigest;->a(JJJ)J

    move-result-wide v16

    add-long v16, v16, v24

    sget-object v18, Lorg/spongycastle/crypto/digests/LongDigest;->i:[J

    aget-wide v18, v18, v21

    add-long v16, v16, v18

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    move-object/from16 v18, v0

    add-int/lit8 v19, v21, 0x1

    aget-wide v24, v18, v21

    add-long v16, v16, v24

    add-long v16, v16, v6

    .line 234
    add-long v12, v12, v16

    .line 235
    invoke-static/range {v22 .. v23}, Lorg/spongycastle/crypto/digests/LongDigest;->a(J)J

    move-result-wide v24

    move-wide/from16 v6, v22

    invoke-static/range {v6 .. v11}, Lorg/spongycastle/crypto/digests/LongDigest;->b(JJJ)J

    move-result-wide v6

    add-long v6, v6, v24

    add-long v24, v16, v6

    .line 238
    invoke-static {v12, v13}, Lorg/spongycastle/crypto/digests/LongDigest;->b(J)J

    move-result-wide v6

    move-wide/from16 v16, v2

    invoke-static/range {v12 .. v17}, Lorg/spongycastle/crypto/digests/LongDigest;->a(JJJ)J

    move-result-wide v16

    add-long v6, v6, v16

    sget-object v16, Lorg/spongycastle/crypto/digests/LongDigest;->i:[J

    aget-wide v16, v16, v19

    add-long v6, v6, v16

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    move-object/from16 v16, v0

    add-int/lit8 v18, v19, 0x1

    aget-wide v16, v16, v19

    add-long v6, v6, v16

    add-long v16, v4, v6

    .line 239
    add-long v10, v10, v16

    .line 240
    invoke-static/range {v24 .. v25}, Lorg/spongycastle/crypto/digests/LongDigest;->a(J)J

    move-result-wide v26

    move-wide/from16 v4, v24

    move-wide/from16 v6, v22

    invoke-static/range {v4 .. v9}, Lorg/spongycastle/crypto/digests/LongDigest;->b(JJJ)J

    move-result-wide v4

    add-long v4, v4, v26

    add-long v16, v16, v4

    .line 243
    invoke-static {v10, v11}, Lorg/spongycastle/crypto/digests/LongDigest;->b(J)J

    move-result-wide v4

    invoke-static/range {v10 .. v15}, Lorg/spongycastle/crypto/digests/LongDigest;->a(JJJ)J

    move-result-wide v6

    add-long/2addr v4, v6

    sget-object v6, Lorg/spongycastle/crypto/digests/LongDigest;->i:[J

    aget-wide v6, v6, v18

    add-long/2addr v4, v6

    move-object/from16 v0, p0

    iget-object v6, v0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    add-int/lit8 v19, v18, 0x1

    aget-wide v6, v6, v18

    add-long/2addr v4, v6

    add-long v26, v2, v4

    .line 244
    add-long v8, v8, v26

    .line 245
    invoke-static/range {v16 .. v17}, Lorg/spongycastle/crypto/digests/LongDigest;->a(J)J

    move-result-wide v28

    move-wide/from16 v2, v16

    move-wide/from16 v4, v24

    move-wide/from16 v6, v22

    invoke-static/range {v2 .. v7}, Lorg/spongycastle/crypto/digests/LongDigest;->b(JJJ)J

    move-result-wide v2

    add-long v2, v2, v28

    add-long v2, v2, v26

    .line 248
    invoke-static {v8, v9}, Lorg/spongycastle/crypto/digests/LongDigest;->b(J)J

    move-result-wide v4

    invoke-static/range {v8 .. v13}, Lorg/spongycastle/crypto/digests/LongDigest;->a(JJJ)J

    move-result-wide v6

    add-long/2addr v4, v6

    sget-object v6, Lorg/spongycastle/crypto/digests/LongDigest;->i:[J

    aget-wide v6, v6, v19

    add-long/2addr v4, v6

    move-object/from16 v0, p0

    iget-object v6, v0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    add-int/lit8 v21, v19, 0x1

    aget-wide v6, v6, v19

    add-long/2addr v4, v6

    add-long/2addr v14, v4

    .line 249
    add-long v18, v22, v14

    .line 250
    invoke-static {v2, v3}, Lorg/spongycastle/crypto/digests/LongDigest;->a(J)J

    move-result-wide v22

    move-wide/from16 v4, v16

    move-wide/from16 v6, v24

    invoke-static/range {v2 .. v7}, Lorg/spongycastle/crypto/digests/LongDigest;->b(JJJ)J

    move-result-wide v4

    add-long v4, v4, v22

    add-long v22, v14, v4

    .line 253
    invoke-static/range {v18 .. v19}, Lorg/spongycastle/crypto/digests/LongDigest;->b(J)J

    move-result-wide v4

    move-wide/from16 v6, v18

    invoke-static/range {v6 .. v11}, Lorg/spongycastle/crypto/digests/LongDigest;->a(JJJ)J

    move-result-wide v6

    add-long/2addr v4, v6

    sget-object v6, Lorg/spongycastle/crypto/digests/LongDigest;->i:[J

    aget-wide v6, v6, v21

    add-long/2addr v4, v6

    move-object/from16 v0, p0

    iget-object v6, v0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    add-int/lit8 v26, v21, 0x1

    aget-wide v6, v6, v21

    add-long/2addr v4, v6

    add-long v6, v12, v4

    .line 254
    add-long v4, v24, v6

    .line 255
    invoke-static/range {v22 .. v23}, Lorg/spongycastle/crypto/digests/LongDigest;->a(J)J

    move-result-wide v24

    move-wide/from16 v12, v22

    move-wide v14, v2

    invoke-static/range {v12 .. v17}, Lorg/spongycastle/crypto/digests/LongDigest;->b(JJJ)J

    move-result-wide v12

    add-long v12, v12, v24

    add-long v24, v6, v12

    .line 258
    invoke-static {v4, v5}, Lorg/spongycastle/crypto/digests/LongDigest;->b(J)J

    move-result-wide v12

    move-wide/from16 v6, v18

    invoke-static/range {v4 .. v9}, Lorg/spongycastle/crypto/digests/LongDigest;->a(JJJ)J

    move-result-wide v6

    add-long/2addr v6, v12

    sget-object v12, Lorg/spongycastle/crypto/digests/LongDigest;->i:[J

    aget-wide v12, v12, v26

    add-long/2addr v6, v12

    move-object/from16 v0, p0

    iget-object v12, v0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    add-int/lit8 v21, v26, 0x1

    aget-wide v12, v12, v26

    add-long/2addr v6, v12

    add-long/2addr v6, v10

    .line 259
    add-long v16, v16, v6

    .line 260
    invoke-static/range {v24 .. v25}, Lorg/spongycastle/crypto/digests/LongDigest;->a(J)J

    move-result-wide v26

    move-wide/from16 v10, v24

    move-wide/from16 v12, v22

    move-wide v14, v2

    invoke-static/range {v10 .. v15}, Lorg/spongycastle/crypto/digests/LongDigest;->b(JJJ)J

    move-result-wide v10

    add-long v10, v10, v26

    add-long/2addr v6, v10

    .line 263
    invoke-static/range {v16 .. v17}, Lorg/spongycastle/crypto/digests/LongDigest;->b(J)J

    move-result-wide v26

    move-wide/from16 v10, v16

    move-wide v12, v4

    move-wide/from16 v14, v18

    invoke-static/range {v10 .. v15}, Lorg/spongycastle/crypto/digests/LongDigest;->a(JJJ)J

    move-result-wide v10

    add-long v10, v10, v26

    sget-object v12, Lorg/spongycastle/crypto/digests/LongDigest;->i:[J

    aget-wide v12, v12, v21

    add-long/2addr v10, v12

    move-object/from16 v0, p0

    iget-object v13, v0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    add-int/lit8 v12, v21, 0x1

    aget-wide v14, v13, v21

    add-long/2addr v10, v14

    add-long v26, v8, v10

    .line 264
    add-long v14, v2, v26

    .line 265
    invoke-static {v6, v7}, Lorg/spongycastle/crypto/digests/LongDigest;->a(J)J

    move-result-wide v2

    move-wide/from16 v8, v24

    move-wide/from16 v10, v22

    invoke-static/range {v6 .. v11}, Lorg/spongycastle/crypto/digests/LongDigest;->b(JJJ)J

    move-result-wide v8

    add-long/2addr v2, v8

    add-long v8, v26, v2

    .line 225
    add-int/lit8 v2, v20, 0x1

    move/from16 v20, v2

    move-wide v10, v6

    move-wide v6, v4

    move-wide v2, v14

    move-wide/from16 v4, v16

    move v14, v12

    move-wide/from16 v12, v24

    move-wide/from16 v16, v18

    move-wide/from16 v18, v22

    goto/16 :goto_1

    .line 268
    :cond_1
    move-object/from16 v0, p0

    iget-wide v14, v0, Lorg/spongycastle/crypto/digests/LongDigest;->a:J

    add-long/2addr v8, v14

    move-object/from16 v0, p0

    iput-wide v8, v0, Lorg/spongycastle/crypto/digests/LongDigest;->a:J

    .line 269
    move-object/from16 v0, p0

    iget-wide v8, v0, Lorg/spongycastle/crypto/digests/LongDigest;->b:J

    add-long/2addr v8, v10

    move-object/from16 v0, p0

    iput-wide v8, v0, Lorg/spongycastle/crypto/digests/LongDigest;->b:J

    .line 270
    move-object/from16 v0, p0

    iget-wide v8, v0, Lorg/spongycastle/crypto/digests/LongDigest;->c:J

    add-long/2addr v8, v12

    move-object/from16 v0, p0

    iput-wide v8, v0, Lorg/spongycastle/crypto/digests/LongDigest;->c:J

    .line 271
    move-object/from16 v0, p0

    iget-wide v8, v0, Lorg/spongycastle/crypto/digests/LongDigest;->d:J

    add-long v8, v8, v18

    move-object/from16 v0, p0

    iput-wide v8, v0, Lorg/spongycastle/crypto/digests/LongDigest;->d:J

    .line 272
    move-object/from16 v0, p0

    iget-wide v8, v0, Lorg/spongycastle/crypto/digests/LongDigest;->e:J

    add-long/2addr v2, v8

    move-object/from16 v0, p0

    iput-wide v2, v0, Lorg/spongycastle/crypto/digests/LongDigest;->e:J

    .line 273
    move-object/from16 v0, p0

    iget-wide v2, v0, Lorg/spongycastle/crypto/digests/LongDigest;->f:J

    add-long/2addr v2, v4

    move-object/from16 v0, p0

    iput-wide v2, v0, Lorg/spongycastle/crypto/digests/LongDigest;->f:J

    .line 274
    move-object/from16 v0, p0

    iget-wide v2, v0, Lorg/spongycastle/crypto/digests/LongDigest;->g:J

    add-long/2addr v2, v6

    move-object/from16 v0, p0

    iput-wide v2, v0, Lorg/spongycastle/crypto/digests/LongDigest;->g:J

    .line 275
    move-object/from16 v0, p0

    iget-wide v2, v0, Lorg/spongycastle/crypto/digests/LongDigest;->h:J

    add-long v2, v2, v16

    move-object/from16 v0, p0

    iput-wide v2, v0, Lorg/spongycastle/crypto/digests/LongDigest;->h:J

    .line 280
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput v2, v0, Lorg/spongycastle/crypto/digests/LongDigest;->o:I

    .line 281
    const/4 v2, 0x0

    :goto_2
    const/16 v3, 0x10

    if-ge v2, v3, :cond_2

    .line 283
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    const-wide/16 v4, 0x0

    aput-wide v4, v3, v2

    .line 281
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 285
    :cond_2
    return-void
.end method


# virtual methods
.method public final a(B)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 66
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->j:[B

    iget v1, p0, Lorg/spongycastle/crypto/digests/LongDigest;->k:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/spongycastle/crypto/digests/LongDigest;->k:I

    aput-byte p1, v0, v1

    .line 68
    iget v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->k:I

    iget-object v1, p0, Lorg/spongycastle/crypto/digests/LongDigest;->j:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 70
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->j:[B

    invoke-direct {p0, v0, v3}, Lorg/spongycastle/crypto/digests/LongDigest;->b([BI)V

    .line 71
    iput v3, p0, Lorg/spongycastle/crypto/digests/LongDigest;->k:I

    .line 74
    :cond_0
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->l:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->l:J

    .line 75
    return-void
.end method

.method public final a([BII)V
    .locals 4

    .prologue
    .line 85
    :goto_0
    iget v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->k:I

    if-eqz v0, :cond_0

    if-lez p3, :cond_0

    .line 87
    aget-byte v0, p1, p2

    invoke-virtual {p0, v0}, Lorg/spongycastle/crypto/digests/LongDigest;->a(B)V

    .line 89
    add-int/lit8 p2, p2, 0x1

    .line 90
    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    .line 96
    :cond_0
    :goto_1
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->j:[B

    array-length v0, v0

    if-le p3, v0, :cond_1

    .line 98
    invoke-direct {p0, p1, p2}, Lorg/spongycastle/crypto/digests/LongDigest;->b([BI)V

    .line 100
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->j:[B

    array-length v0, v0

    add-int/2addr p2, v0

    .line 101
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->j:[B

    array-length v0, v0

    sub-int/2addr p3, v0

    .line 102
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->l:J

    iget-object v2, p0, Lorg/spongycastle/crypto/digests/LongDigest;->j:[B

    array-length v2, v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->l:J

    goto :goto_1

    .line 108
    :cond_1
    :goto_2
    if-lez p3, :cond_2

    .line 110
    aget-byte v0, p1, p2

    invoke-virtual {p0, v0}, Lorg/spongycastle/crypto/digests/LongDigest;->a(B)V

    .line 112
    add-int/lit8 p2, p2, 0x1

    .line 113
    add-int/lit8 p3, p3, -0x1

    goto :goto_2

    .line 115
    :cond_2
    return-void
.end method

.method public c()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    .line 141
    iput-wide v4, p0, Lorg/spongycastle/crypto/digests/LongDigest;->l:J

    .line 142
    iput-wide v4, p0, Lorg/spongycastle/crypto/digests/LongDigest;->m:J

    .line 144
    iput v1, p0, Lorg/spongycastle/crypto/digests/LongDigest;->k:I

    move v0, v1

    .line 145
    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/digests/LongDigest;->j:[B

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 147
    iget-object v2, p0, Lorg/spongycastle/crypto/digests/LongDigest;->j:[B

    aput-byte v1, v2, v0

    .line 145
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 150
    :cond_0
    iput v1, p0, Lorg/spongycastle/crypto/digests/LongDigest;->o:I

    .line 151
    :goto_1
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    array-length v0, v0

    if-eq v1, v0, :cond_1

    .line 153
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    aput-wide v4, v0, v1

    .line 151
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 155
    :cond_1
    return-void
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 159
    const/16 v0, 0x80

    return v0
.end method

.method public final e()V
    .locals 6

    .prologue
    const/16 v5, 0xe

    .line 119
    invoke-direct {p0}, Lorg/spongycastle/crypto/digests/LongDigest;->f()V

    .line 121
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/LongDigest;->l:J

    const/4 v2, 0x3

    shl-long/2addr v0, v2

    .line 122
    iget-wide v2, p0, Lorg/spongycastle/crypto/digests/LongDigest;->m:J

    .line 127
    const/16 v4, -0x80

    invoke-virtual {p0, v4}, Lorg/spongycastle/crypto/digests/LongDigest;->a(B)V

    .line 129
    :goto_0
    iget v4, p0, Lorg/spongycastle/crypto/digests/LongDigest;->k:I

    if-eqz v4, :cond_0

    .line 131
    const/4 v4, 0x0

    invoke-virtual {p0, v4}, Lorg/spongycastle/crypto/digests/LongDigest;->a(B)V

    goto :goto_0

    .line 134
    :cond_0
    iget v4, p0, Lorg/spongycastle/crypto/digests/LongDigest;->o:I

    if-le v4, v5, :cond_1

    invoke-direct {p0}, Lorg/spongycastle/crypto/digests/LongDigest;->g()V

    :cond_1
    iget-object v4, p0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    aput-wide v2, v4, v5

    iget-object v2, p0, Lorg/spongycastle/crypto/digests/LongDigest;->n:[J

    const/16 v3, 0xf

    aput-wide v0, v2, v3

    .line 136
    invoke-direct {p0}, Lorg/spongycastle/crypto/digests/LongDigest;->g()V

    .line 137
    return-void
.end method
