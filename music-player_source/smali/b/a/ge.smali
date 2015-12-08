.class public final Lb/a/ge;
.super Lb/a/gn;


# static fields
.field private static final f:Lb/a/gs;


# instance fields
.field protected a:Z

.field protected b:Z

.field protected c:I

.field protected d:Z

.field private g:[B

.field private h:[B

.field private i:[B

.field private j:[B

.field private k:[B

.field private l:[B

.field private m:[B

.field private n:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb/a/gs;

    invoke-direct {v0}, Lb/a/gs;-><init>()V

    sput-object v0, Lb/a/ge;->f:Lb/a/gs;

    return-void
.end method

.method public constructor <init>(Lb/a/ha;ZZ)V
    .locals 5

    const/16 v4, 0x8

    const/4 v3, 0x4

    const/4 v2, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1}, Lb/a/gn;-><init>(Lb/a/ha;)V

    iput-boolean v0, p0, Lb/a/ge;->a:Z

    iput-boolean v1, p0, Lb/a/ge;->b:Z

    iput-boolean v0, p0, Lb/a/ge;->d:Z

    new-array v0, v1, [B

    iput-object v0, p0, Lb/a/ge;->g:[B

    new-array v0, v2, [B

    iput-object v0, p0, Lb/a/ge;->h:[B

    new-array v0, v3, [B

    iput-object v0, p0, Lb/a/ge;->i:[B

    new-array v0, v4, [B

    iput-object v0, p0, Lb/a/ge;->j:[B

    new-array v0, v1, [B

    iput-object v0, p0, Lb/a/ge;->k:[B

    new-array v0, v2, [B

    iput-object v0, p0, Lb/a/ge;->l:[B

    new-array v0, v3, [B

    iput-object v0, p0, Lb/a/ge;->m:[B

    new-array v0, v4, [B

    iput-object v0, p0, Lb/a/ge;->n:[B

    iput-boolean p2, p0, Lb/a/ge;->a:Z

    iput-boolean p3, p0, Lb/a/ge;->b:Z

    return-void
.end method

.method private a([BI)I
    .locals 1

    invoke-direct {p0, p2}, Lb/a/ge;->d(I)V

    iget-object v0, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v0, p1, p2}, Lb/a/ha;->b([BI)I

    move-result v0

    return v0
.end method

.method private a(B)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lb/a/ge;->g:[B

    aput-byte p1, v0, v3

    iget-object v0, p0, Lb/a/ge;->e:Lb/a/ha;

    iget-object v1, p0, Lb/a/ge;->g:[B

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v3, v2}, Lb/a/ha;->b([BII)V

    return-void
.end method

.method private c(I)Ljava/lang/String;
    .locals 3

    :try_start_0
    invoke-direct {p0, p1}, Lb/a/ge;->d(I)V

    new-array v0, p1, [B

    iget-object v1, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v1, v0, p1}, Lb/a/ha;->b([BI)I

    new-instance v1, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    new-instance v0, Lb/a/fq;

    const-string v1, "JVM DOES NOT SUPPORT UTF-8"

    invoke-direct {v0, v1}, Lb/a/fq;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private d(I)V
    .locals 3

    if-gez p1, :cond_0

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Negative length: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-boolean v0, p0, Lb/a/ge;->d:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lb/a/ge;->c:I

    sub-int/2addr v0, p1

    iput v0, p0, Lb/a/ge;->c:I

    iget v0, p0, Lb/a/ge;->c:I

    if-gez v0, :cond_1

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Message length exceeded: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final a(D)V
    .locals 3

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lb/a/ge;->a(J)V

    return-void
.end method

.method public final a(I)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lb/a/ge;->i:[B

    shr-int/lit8 v1, p1, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    iget-object v0, p0, Lb/a/ge;->i:[B

    const/4 v1, 0x1

    shr-int/lit8 v2, p1, 0x10

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lb/a/ge;->i:[B

    const/4 v1, 0x2

    shr-int/lit8 v2, p1, 0x8

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lb/a/ge;->i:[B

    const/4 v1, 0x3

    and-int/lit16 v2, p1, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lb/a/ge;->e:Lb/a/ha;

    iget-object v1, p0, Lb/a/ge;->i:[B

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v3, v2}, Lb/a/ha;->b([BII)V

    return-void
.end method

.method public final a(J)V
    .locals 9

    const/16 v7, 0x8

    const/4 v6, 0x0

    const-wide/16 v4, 0xff

    iget-object v0, p0, Lb/a/ge;->j:[B

    const/16 v1, 0x38

    shr-long v2, p1, v1

    and-long/2addr v2, v4

    long-to-int v1, v2

    int-to-byte v1, v1

    aput-byte v1, v0, v6

    iget-object v0, p0, Lb/a/ge;->j:[B

    const/4 v1, 0x1

    const/16 v2, 0x30

    shr-long v2, p1, v2

    and-long/2addr v2, v4

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lb/a/ge;->j:[B

    const/4 v1, 0x2

    const/16 v2, 0x28

    shr-long v2, p1, v2

    and-long/2addr v2, v4

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lb/a/ge;->j:[B

    const/4 v1, 0x3

    const/16 v2, 0x20

    shr-long v2, p1, v2

    and-long/2addr v2, v4

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lb/a/ge;->j:[B

    const/4 v1, 0x4

    const/16 v2, 0x18

    shr-long v2, p1, v2

    and-long/2addr v2, v4

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lb/a/ge;->j:[B

    const/4 v1, 0x5

    const/16 v2, 0x10

    shr-long v2, p1, v2

    and-long/2addr v2, v4

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lb/a/ge;->j:[B

    const/4 v1, 0x6

    shr-long v2, p1, v7

    and-long/2addr v2, v4

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lb/a/ge;->j:[B

    const/4 v1, 0x7

    and-long v2, v4, p1

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lb/a/ge;->e:Lb/a/ha;

    iget-object v1, p0, Lb/a/ge;->j:[B

    invoke-virtual {v0, v1, v6, v7}, Lb/a/ha;->b([BII)V

    return-void
.end method

.method public final a(Lb/a/gk;)V
    .locals 1

    iget-byte v0, p1, Lb/a/gk;->b:B

    invoke-direct {p0, v0}, Lb/a/ge;->a(B)V

    iget-short v0, p1, Lb/a/gk;->c:S

    invoke-virtual {p0, v0}, Lb/a/ge;->a(S)V

    return-void
.end method

.method public final a(Lb/a/gl;)V
    .locals 1

    iget-byte v0, p1, Lb/a/gl;->a:B

    invoke-direct {p0, v0}, Lb/a/ge;->a(B)V

    iget v0, p1, Lb/a/gl;->b:I

    invoke-virtual {p0, v0}, Lb/a/ge;->a(I)V

    return-void
.end method

.method public final a(Lb/a/gm;)V
    .locals 1

    iget-byte v0, p1, Lb/a/gm;->a:B

    invoke-direct {p0, v0}, Lb/a/ge;->a(B)V

    iget-byte v0, p1, Lb/a/gm;->b:B

    invoke-direct {p0, v0}, Lb/a/ge;->a(B)V

    iget v0, p1, Lb/a/gm;->c:I

    invoke-virtual {p0, v0}, Lb/a/ge;->a(I)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    :try_start_0
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    array-length v1, v0

    invoke-virtual {p0, v1}, Lb/a/ge;->a(I)V

    iget-object v1, p0, Lb/a/ge;->e:Lb/a/ha;

    const/4 v2, 0x0

    array-length v3, v0

    invoke-virtual {v1, v0, v2, v3}, Lb/a/ha;->b([BII)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v0, Lb/a/fq;

    const-string v1, "JVM DOES NOT SUPPORT UTF-8"

    invoke-direct {v0, v1}, Lb/a/fq;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a(Ljava/nio/ByteBuffer;)V
    .locals 5

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lb/a/ge;->a(I)V

    iget-object v1, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v1, v2, v3, v0}, Lb/a/ha;->b([BII)V

    return-void
.end method

.method public final a(S)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lb/a/ge;->h:[B

    shr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    iget-object v0, p0, Lb/a/ge;->h:[B

    const/4 v1, 0x1

    and-int/lit16 v2, p1, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lb/a/ge;->e:Lb/a/ha;

    iget-object v1, p0, Lb/a/ge;->h:[B

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v3, v2}, Lb/a/ha;->b([BII)V

    return-void
.end method

.method public final a(Z)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-direct {p0, v0}, Lb/a/ge;->a(B)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final b(I)V
    .locals 1

    iput p1, p0, Lb/a/ge;->c:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb/a/ge;->d:Z

    return-void
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lb/a/ge;->a(B)V

    return-void
.end method

.method public final d()Lb/a/gs;
    .locals 1

    sget-object v0, Lb/a/ge;->f:Lb/a/gs;

    return-object v0
.end method

.method public final e()V
    .locals 0

    return-void
.end method

.method public final f()Lb/a/gk;
    .locals 4

    invoke-virtual {p0}, Lb/a/ge;->k()B

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    new-instance v2, Lb/a/gk;

    const-string v3, ""

    invoke-direct {v2, v3, v1, v0}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    return-object v2

    :cond_0
    invoke-virtual {p0}, Lb/a/ge;->l()S

    move-result v0

    goto :goto_0
.end method

.method public final g()Lb/a/gm;
    .locals 4

    new-instance v0, Lb/a/gm;

    invoke-virtual {p0}, Lb/a/ge;->k()B

    move-result v1

    invoke-virtual {p0}, Lb/a/ge;->k()B

    move-result v2

    invoke-virtual {p0}, Lb/a/ge;->m()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lb/a/gm;-><init>(BBI)V

    return-object v0
.end method

.method public final h()Lb/a/gl;
    .locals 3

    new-instance v0, Lb/a/gl;

    invoke-virtual {p0}, Lb/a/ge;->k()B

    move-result v1

    invoke-virtual {p0}, Lb/a/ge;->m()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lb/a/gl;-><init>(BI)V

    return-object v0
.end method

.method public final i()Lb/a/gr;
    .locals 3

    new-instance v0, Lb/a/gr;

    invoke-virtual {p0}, Lb/a/ge;->k()B

    move-result v1

    invoke-virtual {p0}, Lb/a/ge;->m()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lb/a/gr;-><init>(BI)V

    return-object v0
.end method

.method public final j()Z
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lb/a/ge;->k()B

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final k()B
    .locals 3

    const/4 v2, 0x1

    iget-object v0, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v0}, Lb/a/ha;->d()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v0}, Lb/a/ha;->b()[B

    move-result-object v0

    iget-object v1, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v1}, Lb/a/ha;->c()I

    move-result v1

    aget-byte v0, v0, v1

    iget-object v1, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v1, v2}, Lb/a/ha;->a(I)V

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lb/a/ge;->k:[B

    invoke-direct {p0, v0, v2}, Lb/a/ge;->a([BI)I

    iget-object v0, p0, Lb/a/ge;->k:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    goto :goto_0
.end method

.method public final l()S
    .locals 4

    const/4 v3, 0x2

    iget-object v1, p0, Lb/a/ge;->l:[B

    const/4 v0, 0x0

    iget-object v2, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v2}, Lb/a/ha;->d()I

    move-result v2

    if-lt v2, v3, :cond_0

    iget-object v0, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v0}, Lb/a/ha;->b()[B

    move-result-object v1

    iget-object v0, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v0}, Lb/a/ha;->c()I

    move-result v0

    iget-object v2, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v2, v3}, Lb/a/ha;->a(I)V

    :goto_0
    aget-byte v2, v1, v0

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    add-int/lit8 v0, v0, 0x1

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v2

    int-to-short v0, v0

    return v0

    :cond_0
    iget-object v2, p0, Lb/a/ge;->l:[B

    invoke-direct {p0, v2, v3}, Lb/a/ge;->a([BI)I

    goto :goto_0
.end method

.method public final m()I
    .locals 4

    const/4 v3, 0x4

    iget-object v1, p0, Lb/a/ge;->m:[B

    const/4 v0, 0x0

    iget-object v2, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v2}, Lb/a/ha;->d()I

    move-result v2

    if-lt v2, v3, :cond_0

    iget-object v0, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v0}, Lb/a/ha;->b()[B

    move-result-object v1

    iget-object v0, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v0}, Lb/a/ha;->c()I

    move-result v0

    iget-object v2, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v2, v3}, Lb/a/ha;->a(I)V

    :goto_0
    aget-byte v2, v1, v0

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x18

    add-int/lit8 v3, v0, 0x1

    aget-byte v3, v1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v2, v3

    add-int/lit8 v3, v0, 0x2

    aget-byte v3, v1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x3

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v2

    return v0

    :cond_0
    iget-object v2, p0, Lb/a/ge;->m:[B

    invoke-direct {p0, v2, v3}, Lb/a/ge;->a([BI)I

    goto :goto_0
.end method

.method public final n()J
    .locals 8

    const/16 v7, 0x8

    iget-object v1, p0, Lb/a/ge;->n:[B

    const/4 v0, 0x0

    iget-object v2, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v2}, Lb/a/ha;->d()I

    move-result v2

    if-lt v2, v7, :cond_0

    iget-object v0, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v0}, Lb/a/ha;->b()[B

    move-result-object v1

    iget-object v0, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v0}, Lb/a/ha;->c()I

    move-result v0

    iget-object v2, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v2, v7}, Lb/a/ha;->a(I)V

    :goto_0
    aget-byte v2, v1, v0

    and-int/lit16 v2, v2, 0xff

    int-to-long v2, v2

    const/16 v4, 0x38

    shl-long/2addr v2, v4

    add-int/lit8 v4, v0, 0x1

    aget-byte v4, v1, v4

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    const/16 v6, 0x30

    shl-long/2addr v4, v6

    or-long/2addr v2, v4

    add-int/lit8 v4, v0, 0x2

    aget-byte v4, v1, v4

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    const/16 v6, 0x28

    shl-long/2addr v4, v6

    or-long/2addr v2, v4

    add-int/lit8 v4, v0, 0x3

    aget-byte v4, v1, v4

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    const/16 v6, 0x20

    shl-long/2addr v4, v6

    or-long/2addr v2, v4

    add-int/lit8 v4, v0, 0x4

    aget-byte v4, v1, v4

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    const/16 v6, 0x18

    shl-long/2addr v4, v6

    or-long/2addr v2, v4

    add-int/lit8 v4, v0, 0x5

    aget-byte v4, v1, v4

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    const/16 v6, 0x10

    shl-long/2addr v4, v6

    or-long/2addr v2, v4

    add-int/lit8 v4, v0, 0x6

    aget-byte v4, v1, v4

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    shl-long/2addr v4, v7

    or-long/2addr v2, v4

    add-int/lit8 v0, v0, 0x7

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    int-to-long v0, v0

    or-long/2addr v0, v2

    return-wide v0

    :cond_0
    iget-object v2, p0, Lb/a/ge;->n:[B

    invoke-direct {p0, v2, v7}, Lb/a/ge;->a([BI)I

    goto :goto_0
.end method

.method public final o()D
    .locals 2

    invoke-virtual {p0}, Lb/a/ge;->n()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public final p()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lb/a/ge;->m()I

    move-result v1

    iget-object v0, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v0}, Lb/a/ha;->d()I

    move-result v0

    if-lt v0, v1, :cond_0

    :try_start_0
    new-instance v0, Ljava/lang/String;

    iget-object v2, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v2}, Lb/a/ha;->b()[B

    move-result-object v2

    iget-object v3, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v3}, Lb/a/ha;->c()I

    move-result v3

    const-string v4, "UTF-8"

    invoke-direct {v0, v2, v3, v1, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    iget-object v2, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v2, v1}, Lb/a/ha;->a(I)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    new-instance v0, Lb/a/fq;

    const-string v1, "JVM DOES NOT SUPPORT UTF-8"

    invoke-direct {v0, v1}, Lb/a/fq;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-direct {p0, v1}, Lb/a/ge;->c(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final q()Ljava/nio/ByteBuffer;
    .locals 3

    invoke-virtual {p0}, Lb/a/ge;->m()I

    move-result v1

    invoke-direct {p0, v1}, Lb/a/ge;->d(I)V

    iget-object v0, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v0}, Lb/a/ha;->d()I

    move-result v0

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v0}, Lb/a/ha;->b()[B

    move-result-object v0

    iget-object v2, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v2}, Lb/a/ha;->c()I

    move-result v2

    invoke-static {v0, v2, v1}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v2, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v2, v1}, Lb/a/ha;->a(I)V

    :goto_0
    return-object v0

    :cond_0
    new-array v0, v1, [B

    iget-object v2, p0, Lb/a/ge;->e:Lb/a/ha;

    invoke-virtual {v2, v0, v1}, Lb/a/ha;->b([BI)I

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    goto :goto_0
.end method
