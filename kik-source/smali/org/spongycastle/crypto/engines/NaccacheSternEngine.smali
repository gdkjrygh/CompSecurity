.class public Lorg/spongycastle/crypto/engines/NaccacheSternEngine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/AsymmetricBlockCipher;


# static fields
.field private static e:Ljava/math/BigInteger;

.field private static f:Ljava/math/BigInteger;


# instance fields
.field private a:Z

.field private b:Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;

.field private c:[Ljava/util/Vector;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 30
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->e:Ljava/math/BigInteger;

    .line 31
    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->f:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->c:[Ljava/util/Vector;

    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->d:Z

    return-void
.end method

.method private static a(Ljava/util/Vector;Ljava/util/Vector;)Ljava/math/BigInteger;
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 419
    sget-object v4, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->e:Ljava/math/BigInteger;

    .line 420
    sget-object v0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->f:Ljava/math/BigInteger;

    move v1, v2

    move-object v3, v0

    .line 421
    :goto_0
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 423
    invoke-virtual {p1, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/math/BigInteger;

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    .line 421
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    move-object v1, v4

    .line 425
    :goto_1
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 427
    invoke-virtual {p1, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/math/BigInteger;

    .line 428
    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    .line 429
    invoke-virtual {v4, v0}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 430
    invoke-virtual {v4, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    .line 431
    invoke-virtual {p0, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/math/BigInteger;

    invoke-virtual {v4, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 432
    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 425
    add-int/lit8 v2, v2, 0x1

    move-object v1, v0

    goto :goto_1

    .line 435
    :cond_1
    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 97
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->a:Z

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->b:Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;->c()I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, -0x1

    .line 105
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->b:Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;->d()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    array-length v0, v0

    goto :goto_0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 11

    .prologue
    .line 41
    iput-boolean p1, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->a:Z

    .line 43
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_4

    .line 45
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    .line 48
    :goto_0
    check-cast v0, Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->b:Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;

    .line 51
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->a:Z

    if-nez v0, :cond_3

    .line 53
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->d:Z

    if-eqz v0, :cond_0

    .line 55
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "Constructing lookup Array"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 57
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->b:Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;

    check-cast v0, Lorg/spongycastle/crypto/params/NaccacheSternPrivateKeyParameters;

    .line 58
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/NaccacheSternPrivateKeyParameters;->f()Ljava/util/Vector;

    move-result-object v5

    .line 59
    invoke-virtual {v5}, Ljava/util/Vector;->size()I

    move-result v1

    new-array v1, v1, [Ljava/util/Vector;

    iput-object v1, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->c:[Ljava/util/Vector;

    .line 60
    const/4 v1, 0x0

    move v2, v1

    :goto_1
    invoke-virtual {v5}, Ljava/util/Vector;->size()I

    move-result v1

    if-ge v2, v1, :cond_3

    .line 62
    invoke-virtual {v5, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/math/BigInteger;

    .line 63
    invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I

    move-result v6

    .line 65
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->c:[Ljava/util/Vector;

    new-instance v4, Ljava/util/Vector;

    invoke-direct {v4}, Ljava/util/Vector;-><init>()V

    aput-object v4, v3, v2

    .line 66
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->c:[Ljava/util/Vector;

    aget-object v3, v3, v2

    sget-object v4, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->f:Ljava/math/BigInteger;

    invoke-virtual {v3, v4}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 68
    iget-boolean v3, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->d:Z

    if-eqz v3, :cond_1

    .line 70
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "Constructing lookup ArrayList for "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 73
    :cond_1
    sget-object v4, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->e:Ljava/math/BigInteger;

    .line 75
    const/4 v3, 0x1

    :goto_2
    if-ge v3, v6, :cond_2

    .line 77
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/NaccacheSternPrivateKeyParameters;->e()Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    .line 78
    invoke-virtual {v4, v1}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v7

    .line 79
    iget-object v8, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->c:[Ljava/util/Vector;

    aget-object v8, v8, v2

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/NaccacheSternPrivateKeyParameters;->b()Ljava/math/BigInteger;

    move-result-object v9

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/NaccacheSternPrivateKeyParameters;->d()Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {v9, v7, v10}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 75
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 60
    :cond_2
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    .line 83
    :cond_3
    return-void

    :cond_4
    move-object v0, p2

    goto/16 :goto_0
.end method

.method public final a([BII)[B
    .locals 10

    .prologue
    const/4 v3, 0x0

    .line 136
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->b:Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;

    if-nez v0, :cond_0

    .line 138
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "NaccacheStern engine not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 140
    :cond_0
    invoke-virtual {p0}, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->a()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    if-le p3, v0, :cond_1

    .line 142
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input too large for Naccache-Stern cipher.\n"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 145
    :cond_1
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->a:Z

    if-nez v0, :cond_2

    .line 148
    invoke-virtual {p0}, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->a()I

    move-result v0

    if-ge p3, v0, :cond_2

    .line 150
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "BlockLength does not match modulus for Naccache-Stern cipher.\n"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 156
    :cond_2
    if-nez p2, :cond_3

    array-length v0, p1

    if-eq p3, v0, :cond_4

    .line 158
    :cond_3
    new-array v0, p3, [B

    .line 159
    invoke-static {p1, p2, v0, v3, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, v0

    .line 167
    :cond_4
    new-instance v4, Ljava/math/BigInteger;

    const/4 v0, 0x1

    invoke-direct {v4, v0, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 168
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->d:Z

    if-eqz v0, :cond_5

    .line 170
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "input as BigInteger: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 173
    :cond_5
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->a:Z

    if-eqz v0, :cond_7

    .line 175
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->b:Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;->d()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    invoke-static {v0, v3}, Lorg/spongycastle/util/Arrays;->a([BB)V

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->b:Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;->b()Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->b:Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;->d()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v1

    array-length v2, v0

    array-length v4, v1

    sub-int/2addr v2, v4

    array-length v4, v1

    invoke-static {v1, v3, v0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-boolean v1, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->d:Z

    if-eqz v1, :cond_6

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Encrypted value is:  "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/math/BigInteger;

    invoke-direct {v3, v0}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 246
    :cond_6
    :goto_0
    return-object v0

    .line 179
    :cond_7
    new-instance v5, Ljava/util/Vector;

    invoke-direct {v5}, Ljava/util/Vector;-><init>()V

    .line 180
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->b:Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;

    check-cast v0, Lorg/spongycastle/crypto/params/NaccacheSternPrivateKeyParameters;

    .line 181
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/NaccacheSternPrivateKeyParameters;->f()Ljava/util/Vector;

    move-result-object v6

    move v2, v3

    .line 183
    :goto_1
    invoke-virtual {v6}, Ljava/util/Vector;->size()I

    move-result v1

    if-ge v2, v1, :cond_c

    .line 185
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/NaccacheSternPrivateKeyParameters;->e()Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v6, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/math/BigInteger;

    invoke-virtual {v7, v1}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/NaccacheSternPrivateKeyParameters;->d()Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v4, v1, v7}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v7

    .line 186
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->c:[Ljava/util/Vector;

    aget-object v8, v1, v2

    .line 187
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->c:[Ljava/util/Vector;

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v9

    invoke-virtual {v6, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/math/BigInteger;

    invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I

    move-result v1

    if-eq v9, v1, :cond_9

    .line 189
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->d:Z

    if-eqz v0, :cond_8

    .line 191
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Prime is "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ", lookup table has size "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v8}, Ljava/util/Vector;->size()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 193
    :cond_8
    new-instance v1, Lorg/spongycastle/crypto/InvalidCipherTextException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v0, "Error in lookup Array for "

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ": Size mismatch. Expected ArrayList with length "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v6, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " but found ArrayList of length "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->c:[Ljava/util/Vector;

    aget-object v2, v3, v2

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 199
    :cond_9
    invoke-virtual {v8, v7}, Ljava/util/Vector;->indexOf(Ljava/lang/Object;)I

    move-result v1

    .line 201
    const/4 v8, -0x1

    if-ne v1, v8, :cond_b

    .line 203
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->d:Z

    if-eqz v0, :cond_a

    .line 205
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Actual prime is "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 206
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Decrypted value is "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 208
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "LookupList for "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, " with size "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->c:[Ljava/util/Vector;

    aget-object v4, v4, v2

    invoke-virtual {v4}, Ljava/util/Vector;->size()I

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, " is: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 210
    :goto_2
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->c:[Ljava/util/Vector;

    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v3, v0, :cond_a

    .line 212
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->c:[Ljava/util/Vector;

    aget-object v1, v1, v2

    invoke-virtual {v1, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 210
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 215
    :cond_a
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "Lookup failed"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 217
    :cond_b
    int-to-long v8, v1

    invoke-static {v8, v9}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 183
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto/16 :goto_1

    .line 219
    :cond_c
    invoke-static {v5, v6}, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->a(Ljava/util/Vector;Ljava/util/Vector;)Ljava/math/BigInteger;

    move-result-object v0

    .line 242
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    goto/16 :goto_0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 116
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->a:Z

    if-eqz v0, :cond_0

    .line 119
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->b:Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;->d()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    array-length v0, v0

    .line 124
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/NaccacheSternEngine;->b:Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;->c()I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, -0x1

    goto :goto_0
.end method
