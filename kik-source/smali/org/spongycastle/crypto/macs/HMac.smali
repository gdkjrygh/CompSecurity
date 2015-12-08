.class public Lorg/spongycastle/crypto/macs/HMac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/Mac;


# static fields
.field private static f:Ljava/util/Hashtable;


# instance fields
.field private a:Lorg/spongycastle/crypto/Digest;

.field private b:I

.field private c:I

.field private d:[B

.field private e:[B


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/16 v5, 0x80

    const/16 v4, 0x40

    .line 33
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 35
    sput-object v0, Lorg/spongycastle/crypto/macs/HMac;->f:Ljava/util/Hashtable;

    const-string v1, "GOST3411"

    new-instance v2, Ljava/lang/Integer;

    const/16 v3, 0x20

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    sget-object v0, Lorg/spongycastle/crypto/macs/HMac;->f:Ljava/util/Hashtable;

    const-string v1, "MD2"

    new-instance v2, Ljava/lang/Integer;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    sget-object v0, Lorg/spongycastle/crypto/macs/HMac;->f:Ljava/util/Hashtable;

    const-string v1, "MD4"

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    sget-object v0, Lorg/spongycastle/crypto/macs/HMac;->f:Ljava/util/Hashtable;

    const-string v1, "MD5"

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    sget-object v0, Lorg/spongycastle/crypto/macs/HMac;->f:Ljava/util/Hashtable;

    const-string v1, "RIPEMD128"

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    sget-object v0, Lorg/spongycastle/crypto/macs/HMac;->f:Ljava/util/Hashtable;

    const-string v1, "RIPEMD160"

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    sget-object v0, Lorg/spongycastle/crypto/macs/HMac;->f:Ljava/util/Hashtable;

    const-string v1, "SHA-1"

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    sget-object v0, Lorg/spongycastle/crypto/macs/HMac;->f:Ljava/util/Hashtable;

    const-string v1, "SHA-224"

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    sget-object v0, Lorg/spongycastle/crypto/macs/HMac;->f:Ljava/util/Hashtable;

    const-string v1, "SHA-256"

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    sget-object v0, Lorg/spongycastle/crypto/macs/HMac;->f:Ljava/util/Hashtable;

    const-string v1, "SHA-384"

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v5}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget-object v0, Lorg/spongycastle/crypto/macs/HMac;->f:Ljava/util/Hashtable;

    const-string v1, "SHA-512"

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v5}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    sget-object v0, Lorg/spongycastle/crypto/macs/HMac;->f:Ljava/util/Hashtable;

    const-string v1, "Tiger"

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    sget-object v0, Lorg/spongycastle/crypto/macs/HMac;->f:Ljava/util/Hashtable;

    const-string v1, "Whirlpool"

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/crypto/Digest;)V
    .locals 3

    .prologue
    .line 81
    instance-of v0, p1, Lorg/spongycastle/crypto/ExtendedDigest;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lorg/spongycastle/crypto/ExtendedDigest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/ExtendedDigest;->d()I

    move-result v0

    :goto_0
    invoke-direct {p0, p1, v0}, Lorg/spongycastle/crypto/macs/HMac;-><init>(Lorg/spongycastle/crypto/Digest;I)V

    .line 82
    return-void

    .line 81
    :cond_0
    sget-object v0, Lorg/spongycastle/crypto/macs/HMac;->f:Ljava/util/Hashtable;

    invoke-interface {p1}, Lorg/spongycastle/crypto/Digest;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown digest passed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lorg/spongycastle/crypto/Digest;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method

.method private constructor <init>(Lorg/spongycastle/crypto/Digest;I)V
    .locals 1

    .prologue
    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, Lorg/spongycastle/crypto/macs/HMac;->a:Lorg/spongycastle/crypto/Digest;

    .line 89
    invoke-interface {p1}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/macs/HMac;->b:I

    .line 91
    iput p2, p0, Lorg/spongycastle/crypto/macs/HMac;->c:I

    .line 93
    iget v0, p0, Lorg/spongycastle/crypto/macs/HMac;->c:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/HMac;->d:[B

    .line 94
    iget v0, p0, Lorg/spongycastle/crypto/macs/HMac;->c:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/HMac;->e:[B

    .line 95
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 150
    iget v0, p0, Lorg/spongycastle/crypto/macs/HMac;->b:I

    return v0
.end method

.method public final a([BI)I
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 171
    iget v0, p0, Lorg/spongycastle/crypto/macs/HMac;->b:I

    new-array v0, v0, [B

    .line 172
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/HMac;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1, v0, v4}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 174
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/HMac;->a:Lorg/spongycastle/crypto/Digest;

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/HMac;->e:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/HMac;->e:[B

    array-length v3, v3

    invoke-interface {v1, v2, v4, v3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 175
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/HMac;->a:Lorg/spongycastle/crypto/Digest;

    array-length v2, v0

    invoke-interface {v1, v0, v4, v2}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 177
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/HMac;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1, p2}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    move-result v0

    .line 179
    invoke-virtual {p0}, Lorg/spongycastle/crypto/macs/HMac;->b()V

    .line 181
    return v0
.end method

.method public final a(B)V
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/HMac;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 157
    return-void
.end method

.method public final a(Lorg/spongycastle/crypto/CipherParameters;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 110
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/HMac;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 112
    check-cast p1, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    .line 114
    array-length v2, v0

    iget v3, p0, Lorg/spongycastle/crypto/macs/HMac;->c:I

    if-le v2, v3, :cond_0

    .line 116
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/HMac;->a:Lorg/spongycastle/crypto/Digest;

    array-length v3, v0

    invoke-interface {v2, v0, v1, v3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 117
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/HMac;->a:Lorg/spongycastle/crypto/Digest;

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/HMac;->d:[B

    invoke-interface {v0, v2, v1}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 118
    iget v0, p0, Lorg/spongycastle/crypto/macs/HMac;->b:I

    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/HMac;->d:[B

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 120
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/HMac;->d:[B

    aput-byte v1, v2, v0

    .line 118
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 125
    :cond_0
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/HMac;->d:[B

    array-length v3, v0

    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 126
    array-length v0, v0

    :goto_1
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/HMac;->d:[B

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 128
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/HMac;->d:[B

    aput-byte v1, v2, v0

    .line 126
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 132
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/HMac;->d:[B

    array-length v0, v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/HMac;->e:[B

    .line 133
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/HMac;->d:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/HMac;->e:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/HMac;->d:[B

    array-length v3, v3

    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v1

    .line 135
    :goto_2
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/HMac;->d:[B

    array-length v2, v2

    if-ge v0, v2, :cond_2

    .line 137
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/HMac;->d:[B

    aget-byte v3, v2, v0

    xor-int/lit8 v3, v3, 0x36

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    .line 135
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    move v0, v1

    .line 140
    :goto_3
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/HMac;->e:[B

    array-length v2, v2

    if-ge v0, v2, :cond_3

    .line 142
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/HMac;->e:[B

    aget-byte v3, v2, v0

    xor-int/lit8 v3, v3, 0x5c

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    .line 140
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 145
    :cond_3
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/HMac;->a:Lorg/spongycastle/crypto/Digest;

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/HMac;->d:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/HMac;->d:[B

    array-length v3, v3

    invoke-interface {v0, v2, v1, v3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 146
    return-void
.end method

.method public final a([BII)V
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/HMac;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 165
    return-void
.end method

.method public final b()V
    .locals 4

    .prologue
    .line 192
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/HMac;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 197
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/HMac;->a:Lorg/spongycastle/crypto/Digest;

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/HMac;->d:[B

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/HMac;->d:[B

    array-length v3, v3

    invoke-interface {v0, v1, v2, v3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 198
    return-void
.end method
