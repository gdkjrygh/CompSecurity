.class public Lorg/spongycastle/crypto/params/NTRUSigningParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field h:D

.field public i:D

.field j:D

.field public k:D

.field public l:I

.field m:I

.field public n:Lorg/spongycastle/crypto/Digest;


# direct methods
.method private constructor <init>(IIIIDDLorg/spongycastle/crypto/Digest;)V
    .locals 5

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/16 v0, 0x64

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->l:I

    .line 28
    const/4 v0, 0x6

    iput v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->m:I

    .line 44
    iput p1, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->a:I

    .line 45
    iput p2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->b:I

    .line 46
    iput p3, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->c:I

    .line 47
    iput p4, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->g:I

    .line 48
    iput-wide p5, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->h:D

    .line 49
    iput-wide p7, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->j:D

    .line 50
    iput-object p9, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->n:Lorg/spongycastle/crypto/Digest;

    .line 51
    iget-wide v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->h:D

    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->h:D

    mul-double/2addr v0, v2

    iput-wide v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->i:D

    iget-wide v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->j:D

    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->j:D

    mul-double/2addr v0, v2

    iput-wide v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->k:D

    .line 52
    return-void
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .locals 11

    .prologue
    .line 17
    new-instance v1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;

    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->a:I

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->b:I

    iget v4, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->c:I

    iget v5, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->g:I

    iget-wide v6, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->h:D

    iget-wide v8, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->j:D

    iget-object v10, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->n:Lorg/spongycastle/crypto/Digest;

    invoke-direct/range {v1 .. v10}, Lorg/spongycastle/crypto/params/NTRUSigningParameters;-><init>(IIIIDDLorg/spongycastle/crypto/Digest;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 178
    if-ne p0, p1, :cond_1

    .line 255
    :cond_0
    :goto_0
    return v0

    .line 182
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 184
    goto :goto_0

    .line 186
    :cond_2
    instance-of v2, p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;

    if-nez v2, :cond_3

    move v0, v1

    .line 188
    goto :goto_0

    .line 190
    :cond_3
    check-cast p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;

    .line 191
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->g:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->g:I

    if-eq v2, v3, :cond_4

    move v0, v1

    .line 193
    goto :goto_0

    .line 195
    :cond_4
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->a:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->a:I

    if-eq v2, v3, :cond_5

    move v0, v1

    .line 197
    goto :goto_0

    .line 199
    :cond_5
    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->h:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    iget-wide v4, p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->h:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_6

    move v0, v1

    .line 201
    goto :goto_0

    .line 203
    :cond_6
    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->i:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    iget-wide v4, p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->i:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_7

    move v0, v1

    .line 205
    goto :goto_0

    .line 207
    :cond_7
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->m:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->m:I

    if-eq v2, v3, :cond_8

    move v0, v1

    .line 209
    goto :goto_0

    .line 211
    :cond_8
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->c:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->c:I

    if-eq v2, v3, :cond_9

    move v0, v1

    .line 213
    goto :goto_0

    .line 215
    :cond_9
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->d:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->d:I

    if-eq v2, v3, :cond_a

    move v0, v1

    .line 217
    goto :goto_0

    .line 219
    :cond_a
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->e:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->e:I

    if-eq v2, v3, :cond_b

    move v0, v1

    .line 221
    goto :goto_0

    .line 223
    :cond_b
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->f:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->f:I

    if-eq v2, v3, :cond_c

    move v0, v1

    .line 225
    goto :goto_0

    .line 227
    :cond_c
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->n:Lorg/spongycastle/crypto/Digest;

    if-nez v2, :cond_d

    .line 229
    iget-object v2, p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->n:Lorg/spongycastle/crypto/Digest;

    if-eqz v2, :cond_e

    move v0, v1

    .line 231
    goto :goto_0

    .line 234
    :cond_d
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->n:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/spongycastle/crypto/Digest;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->n:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v3}, Lorg/spongycastle/crypto/Digest;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    move v0, v1

    .line 236
    goto/16 :goto_0

    .line 238
    :cond_e
    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->j:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    iget-wide v4, p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->j:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_f

    move v0, v1

    .line 240
    goto/16 :goto_0

    .line 242
    :cond_f
    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->k:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    iget-wide v4, p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->k:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_10

    move v0, v1

    .line 244
    goto/16 :goto_0

    .line 246
    :cond_10
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->b:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->b:I

    if-eq v2, v3, :cond_11

    move v0, v1

    .line 248
    goto/16 :goto_0

    .line 250
    :cond_11
    iget v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->l:I

    iget v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->l:I

    if-eq v2, v3, :cond_0

    move v0, v1

    .line 252
    goto/16 :goto_0
.end method

.method public hashCode()I
    .locals 7

    .prologue
    const/16 v6, 0x20

    .line 152
    iget v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->g:I

    add-int/lit8 v0, v0, 0x1f

    .line 155
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->a:I

    add-int/2addr v0, v1

    .line 157
    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->h:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    .line 158
    mul-int/lit8 v0, v0, 0x1f

    ushr-long v4, v2, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    .line 159
    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->i:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    .line 160
    mul-int/lit8 v0, v0, 0x1f

    ushr-long v4, v2, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    .line 161
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->m:I

    add-int/2addr v0, v1

    .line 162
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->c:I

    add-int/2addr v0, v1

    .line 163
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->d:I

    add-int/2addr v0, v1

    .line 164
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->e:I

    add-int/2addr v0, v1

    .line 165
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->f:I

    add-int/2addr v0, v1

    .line 166
    mul-int/lit8 v1, v0, 0x1f

    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->n:Lorg/spongycastle/crypto/Digest;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v1

    .line 167
    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->j:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    .line 168
    mul-int/lit8 v0, v0, 0x1f

    ushr-long v4, v2, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    .line 169
    iget-wide v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->k:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    .line 170
    mul-int/lit8 v0, v0, 0x1f

    ushr-long v4, v2, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    .line 171
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->b:I

    add-int/2addr v0, v1

    .line 172
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->l:I

    add-int/2addr v0, v1

    .line 173
    return v0

    .line 166
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->n:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .prologue
    .line 260
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "0.00"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 262
    new-instance v1, Ljava/lang/StringBuilder;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SignatureParameters(N="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " q="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 264
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " B="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->g:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " beta="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v4, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->h:D

    invoke-virtual {v0, v4, v5}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " normBound="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v4, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->j:D

    invoke-virtual {v0, v4, v5}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " hashAlg="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->n:Lorg/spongycastle/crypto/Digest;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
