.class public Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;
.super Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RC2AlgorithmParameters"
.end annotation


# static fields
.field private static final a:[S

.field private static final b:[S


# instance fields
.field private c:[B

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/16 v1, 0x100

    .line 45
    new-array v0, v1, [S

    fill-array-data v0, :array_0

    sput-object v0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->a:[S

    .line 64
    new-array v0, v1, [S

    fill-array-data v0, :array_1

    sput-object v0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->b:[S

    return-void

    .line 45
    nop

    :array_0
    .array-data 2
        0xbds
        0x56s
        0xeas
        0xf2s
        0xa2s
        0xf1s
        0xacs
        0x2as
        0xb0s
        0x93s
        0xd1s
        0x9cs
        0x1bs
        0x33s
        0xfds
        0xd0s
        0x30s
        0x4s
        0xb6s
        0xdcs
        0x7ds
        0xdfs
        0x32s
        0x4bs
        0xf7s
        0xcbs
        0x45s
        0x9bs
        0x31s
        0xbbs
        0x21s
        0x5as
        0x41s
        0x9fs
        0xe1s
        0xd9s
        0x4as
        0x4ds
        0x9es
        0xdas
        0xa0s
        0x68s
        0x2cs
        0xc3s
        0x27s
        0x5fs
        0x80s
        0x36s
        0x3es
        0xees
        0xfbs
        0x95s
        0x1as
        0xfes
        0xces
        0xa8s
        0x34s
        0xa9s
        0x13s
        0xf0s
        0xa6s
        0x3fs
        0xd8s
        0xcs
        0x78s
        0x24s
        0xafs
        0x23s
        0x52s
        0xc1s
        0x67s
        0x17s
        0xf5s
        0x66s
        0x90s
        0xe7s
        0xe8s
        0x7s
        0xb8s
        0x60s
        0x48s
        0xe6s
        0x1es
        0x53s
        0xf3s
        0x92s
        0xa4s
        0x72s
        0x8cs
        0x8s
        0x15s
        0x6es
        0x86s
        0x0s
        0x84s
        0xfas
        0xf4s
        0x7fs
        0x8as
        0x42s
        0x19s
        0xf6s
        0xdbs
        0xcds
        0x14s
        0x8ds
        0x50s
        0x12s
        0xbas
        0x3cs
        0x6s
        0x4es
        0xecs
        0xb3s
        0x35s
        0x11s
        0xa1s
        0x88s
        0x8es
        0x2bs
        0x94s
        0x99s
        0xb7s
        0x71s
        0x74s
        0xd3s
        0xe4s
        0xbfs
        0x3as
        0xdes
        0x96s
        0xes
        0xbcs
        0xas
        0xeds
        0x77s
        0xfcs
        0x37s
        0x6bs
        0x3s
        0x79s
        0x89s
        0x62s
        0xc6s
        0xd7s
        0xc0s
        0xd2s
        0x7cs
        0x6as
        0x8bs
        0x22s
        0xa3s
        0x5bs
        0x5s
        0x5ds
        0x2s
        0x75s
        0xd5s
        0x61s
        0xe3s
        0x18s
        0x8fs
        0x55s
        0x51s
        0xads
        0x1fs
        0xbs
        0x5es
        0x85s
        0xe5s
        0xc2s
        0x57s
        0x63s
        0xcas
        0x3ds
        0x6cs
        0xb4s
        0xc5s
        0xccs
        0x70s
        0xb2s
        0x91s
        0x59s
        0xds
        0x47s
        0x20s
        0xc8s
        0x4fs
        0x58s
        0xe0s
        0x1s
        0xe2s
        0x16s
        0x38s
        0xc4s
        0x6fs
        0x3bs
        0xfs
        0x65s
        0x46s
        0xbes
        0x7es
        0x2ds
        0x7bs
        0x82s
        0xf9s
        0x40s
        0xb5s
        0x1ds
        0x73s
        0xf8s
        0xebs
        0x26s
        0xc7s
        0x87s
        0x97s
        0x25s
        0x54s
        0xb1s
        0x28s
        0xaas
        0x98s
        0x9ds
        0xa5s
        0x64s
        0x6ds
        0x7as
        0xd4s
        0x10s
        0x81s
        0x44s
        0xefs
        0x49s
        0xd6s
        0xaes
        0x2es
        0xdds
        0x76s
        0x5cs
        0x2fs
        0xa7s
        0x1cs
        0xc9s
        0x9s
        0x69s
        0x9as
        0x83s
        0xcfs
        0x29s
        0x39s
        0xb9s
        0xe9s
        0x4cs
        0xffs
        0x43s
        0xabs
    .end array-data

    .line 64
    :array_1
    .array-data 2
        0x5ds
        0xbes
        0x9bs
        0x8bs
        0x11s
        0x99s
        0x6es
        0x4ds
        0x59s
        0xf3s
        0x85s
        0xa6s
        0x3fs
        0xb7s
        0x83s
        0xc5s
        0xe4s
        0x73s
        0x6bs
        0x3as
        0x68s
        0x5as
        0xc0s
        0x47s
        0xa0s
        0x64s
        0x34s
        0xcs
        0xf1s
        0xd0s
        0x52s
        0xa5s
        0xb9s
        0x1es
        0x96s
        0x43s
        0x41s
        0xd8s
        0xd4s
        0x2cs
        0xdbs
        0xf8s
        0x7s
        0x77s
        0x2as
        0xcas
        0xebs
        0xefs
        0x10s
        0x1cs
        0x16s
        0xds
        0x38s
        0x72s
        0x2fs
        0x89s
        0xc1s
        0xf9s
        0x80s
        0xc4s
        0x6ds
        0xaes
        0x30s
        0x3ds
        0xces
        0x20s
        0x63s
        0xfes
        0xe6s
        0x1as
        0xc7s
        0xb8s
        0x50s
        0xe8s
        0x24s
        0x17s
        0xfcs
        0x25s
        0x6fs
        0xbbs
        0x6as
        0xa3s
        0x44s
        0x53s
        0xd9s
        0xa2s
        0x1s
        0xabs
        0xbcs
        0xb6s
        0x1fs
        0x98s
        0xees
        0x9as
        0xa7s
        0x2ds
        0x4fs
        0x9es
        0x8es
        0xacs
        0xe0s
        0xc6s
        0x49s
        0x46s
        0x29s
        0xf4s
        0x94s
        0x8as
        0xafs
        0xe1s
        0x5bs
        0xc3s
        0xb3s
        0x7bs
        0x57s
        0xd1s
        0x7cs
        0x9cs
        0xeds
        0x87s
        0x40s
        0x8cs
        0xe2s
        0xcbs
        0x93s
        0x14s
        0xc9s
        0x61s
        0x2es
        0xe5s
        0xccs
        0xf6s
        0x5es
        0xa8s
        0x5cs
        0xd6s
        0x75s
        0x8ds
        0x62s
        0x95s
        0x58s
        0x69s
        0x76s
        0xa1s
        0x4as
        0xb5s
        0x55s
        0x9s
        0x78s
        0x33s
        0x82s
        0xd7s
        0xdds
        0x79s
        0xf5s
        0x1bs
        0xbs
        0xdes
        0x26s
        0x21s
        0x28s
        0x74s
        0x4s
        0x97s
        0x56s
        0xdfs
        0x3cs
        0xf0s
        0x37s
        0x39s
        0xdcs
        0xffs
        0x6s
        0xa4s
        0xeas
        0x42s
        0x8s
        0xdas
        0xb4s
        0x71s
        0xb0s
        0xcfs
        0x12s
        0x7as
        0x4es
        0xfas
        0x6cs
        0x1ds
        0x84s
        0x0s
        0xc8s
        0x7fs
        0x91s
        0x45s
        0xaas
        0x2bs
        0xc2s
        0xb1s
        0x8fs
        0xd5s
        0xbas
        0xf2s
        0xads
        0x19s
        0xb2s
        0x67s
        0x36s
        0xf7s
        0xfs
        0xas
        0x92s
        0x7ds
        0xe3s
        0x9ds
        0xe9s
        0x90s
        0x3es
        0x23s
        0x27s
        0x66s
        0x13s
        0xecs
        0x81s
        0x15s
        0xbds
        0x22s
        0xbfs
        0x9fs
        0x7es
        0xa9s
        0x51s
        0x4bs
        0x4cs
        0xfbs
        0x2s
        0xd3s
        0x70s
        0x86s
        0x31s
        0xe7s
        0x3bs
        0x5s
        0x3s
        0x54s
        0x60s
        0x48s
        0x65s
        0x18s
        0xd2s
        0xcds
        0x5fs
        0x32s
        0x88s
        0xes
        0x35s
        0xfds
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters;-><init>()V

    .line 84
    const/16 v0, 0x3a

    iput v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->d:I

    return-void
.end method


# virtual methods
.method protected final a(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 3

    .prologue
    .line 119
    const-class v0, Ljavax/crypto/spec/RC2ParameterSpec;

    if-ne p1, v0, :cond_1

    .line 121
    iget v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->d:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 123
    iget v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->d:I

    const/16 v1, 0x100

    if-ge v0, v1, :cond_0

    .line 125
    new-instance v0, Ljavax/crypto/spec/RC2ParameterSpec;

    sget-object v1, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->b:[S

    iget v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->d:I

    aget-short v1, v1, v2

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->c:[B

    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/RC2ParameterSpec;-><init>(I[B)V

    .line 136
    :goto_0
    return-object v0

    .line 129
    :cond_0
    new-instance v0, Ljavax/crypto/spec/RC2ParameterSpec;

    iget v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->d:I

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->c:[B

    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/RC2ParameterSpec;-><init>(I[B)V

    goto :goto_0

    .line 134
    :cond_1
    const-class v0, Ljavax/crypto/spec/IvParameterSpec;

    if-ne p1, v0, :cond_2

    .line 136
    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->c:[B

    invoke-direct {v0, v1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    goto :goto_0

    .line 139
    :cond_2
    new-instance v0, Ljava/security/spec/InvalidParameterSpecException;

    const-string v1, "unknown parameter spec passed to RC2 parameters object."

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidParameterSpecException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineGetEncoded()[B
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->c:[B

    invoke-static {v0}, Lorg/spongycastle/util/Arrays;->b([B)[B

    move-result-object v0

    return-object v0
.end method

.method protected engineGetEncoded(Ljava/lang/String;)[B
    .locals 3

    .prologue
    .line 95
    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    iget v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 99
    new-instance v0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;

    invoke-virtual {p0}, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->engineGetEncoded()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;-><init>([B)V

    invoke-virtual {v0}, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->b()[B

    move-result-object v0

    .line 112
    :goto_0
    return-object v0

    .line 103
    :cond_0
    new-instance v0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;

    iget v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->d:I

    invoke-virtual {p0}, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->engineGetEncoded()[B

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;-><init>(I[B)V

    invoke-virtual {v0}, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->b()[B

    move-result-object v0

    goto :goto_0

    .line 107
    :cond_1
    const-string v0, "RAW"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 109
    invoke-virtual {p0}, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->engineGetEncoded()[B

    move-result-object v0

    goto :goto_0

    .line 112
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected engineInit(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 2

    .prologue
    .line 146
    instance-of v0, p1, Ljavax/crypto/spec/IvParameterSpec;

    if-eqz v0, :cond_0

    .line 148
    check-cast p1, Ljavax/crypto/spec/IvParameterSpec;

    invoke-virtual {p1}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->c:[B

    .line 166
    :goto_0
    return-void

    .line 150
    :cond_0
    instance-of v0, p1, Ljavax/crypto/spec/RC2ParameterSpec;

    if-eqz v0, :cond_3

    move-object v0, p1

    .line 152
    check-cast v0, Ljavax/crypto/spec/RC2ParameterSpec;

    invoke-virtual {v0}, Ljavax/crypto/spec/RC2ParameterSpec;->getEffectiveKeyBits()I

    move-result v0

    .line 153
    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 155
    const/16 v1, 0x100

    if-ge v0, v1, :cond_2

    .line 157
    sget-object v1, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->a:[S

    aget-short v0, v1, v0

    iput v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->d:I

    .line 165
    :cond_1
    :goto_1
    check-cast p1, Ljavax/crypto/spec/RC2ParameterSpec;

    invoke-virtual {p1}, Ljavax/crypto/spec/RC2ParameterSpec;->getIV()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->c:[B

    goto :goto_0

    .line 161
    :cond_2
    iput v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->d:I

    goto :goto_1

    .line 169
    :cond_3
    new-instance v0, Ljava/security/spec/InvalidParameterSpecException;

    const-string v1, "IvParameterSpec or RC2ParameterSpec required to initialise a RC2 parameters algorithm parameters object"

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidParameterSpecException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineInit([B)V
    .locals 1

    .prologue
    .line 177
    invoke-static {p1}, Lorg/spongycastle/util/Arrays;->b([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->c:[B

    .line 178
    return-void
.end method

.method protected engineInit([BLjava/lang/String;)V
    .locals 2

    .prologue
    .line 185
    invoke-static {p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 187
    invoke-static {p1}, Lorg/spongycastle/asn1/ASN1Primitive;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;

    move-result-object v0

    .line 189
    invoke-virtual {v0}, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->c()Ljava/math/BigInteger;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 191
    invoke-virtual {v0}, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->c()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I

    move-result v1

    iput v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->d:I

    .line 194
    :cond_0
    invoke-virtual {v0}, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->d()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->c:[B

    .line 202
    :goto_0
    return-void

    .line 199
    :cond_1
    const-string v0, "RAW"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 201
    invoke-virtual {p0, p1}, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters$RC2AlgorithmParameters;->engineInit([B)V

    goto :goto_0

    .line 205
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unknown parameters format in IV parameters object"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineToString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 210
    const-string v0, "RC2 Parameters"

    return-object v0
.end method
