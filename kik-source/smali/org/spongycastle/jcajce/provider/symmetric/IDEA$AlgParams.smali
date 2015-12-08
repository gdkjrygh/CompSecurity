.class public Lorg/spongycastle/jcajce/provider/symmetric/IDEA$AlgParams;
.super Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/symmetric/IDEA;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AlgParams"
.end annotation


# instance fields
.field private a:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 119
    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameters;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 2

    .prologue
    .line 154
    const-class v0, Ljavax/crypto/spec/IvParameterSpec;

    if-ne p1, v0, :cond_0

    .line 156
    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/IDEA$AlgParams;->a:[B

    invoke-direct {v0, v1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    return-object v0

    .line 159
    :cond_0
    new-instance v0, Ljava/security/spec/InvalidParameterSpecException;

    const-string v1, "unknown parameter spec passed to IV parameters object."

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidParameterSpecException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineGetEncoded()[B
    .locals 1

    .prologue
    .line 127
    const-string v0, "ASN.1"

    invoke-virtual {p0, v0}, Lorg/spongycastle/jcajce/provider/symmetric/IDEA$AlgParams;->engineGetEncoded(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method protected engineGetEncoded(Ljava/lang/String;)[B
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 134
    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/symmetric/IDEA$AlgParams;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    new-instance v0, Lorg/spongycastle/asn1/misc/IDEACBCPar;

    const-string v1, "RAW"

    invoke-virtual {p0, v1}, Lorg/spongycastle/jcajce/provider/symmetric/IDEA$AlgParams;->engineGetEncoded(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/misc/IDEACBCPar;-><init>([B)V

    invoke-virtual {v0}, Lorg/spongycastle/asn1/misc/IDEACBCPar;->b()[B

    move-result-object v0

    .line 147
    :goto_0
    return-object v0

    .line 139
    :cond_0
    const-string v0, "RAW"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 141
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/IDEA$AlgParams;->a:[B

    array-length v0, v0

    new-array v0, v0, [B

    .line 143
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/IDEA$AlgParams;->a:[B

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/IDEA$AlgParams;->a:[B

    array-length v2, v2

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 147
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected engineInit(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 2

    .prologue
    .line 166
    instance-of v0, p1, Ljavax/crypto/spec/IvParameterSpec;

    if-nez v0, :cond_0

    .line 168
    new-instance v0, Ljava/security/spec/InvalidParameterSpecException;

    const-string v1, "IvParameterSpec required to initialise a IV parameters algorithm parameters object"

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidParameterSpecException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 171
    :cond_0
    check-cast p1, Ljavax/crypto/spec/IvParameterSpec;

    invoke-virtual {p1}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/IDEA$AlgParams;->a:[B

    .line 172
    return-void
.end method

.method protected engineInit([B)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 178
    array-length v0, p1

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/IDEA$AlgParams;->a:[B

    .line 180
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/IDEA$AlgParams;->a:[B

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/IDEA$AlgParams;->a:[B

    array-length v1, v1

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 181
    return-void
.end method

.method protected engineInit([BLjava/lang/String;)V
    .locals 2

    .prologue
    .line 188
    const-string v0, "RAW"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 190
    invoke-virtual {p0, p1}, Lorg/spongycastle/jcajce/provider/symmetric/IDEA$AlgParams;->engineInit([B)V

    .line 199
    :goto_0
    return-void

    .line 193
    :cond_0
    const-string v0, "ASN.1"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 195
    new-instance v0, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v0, p1}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    .line 196
    new-instance v1, Lorg/spongycastle/asn1/misc/IDEACBCPar;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/misc/IDEACBCPar;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    .line 198
    invoke-virtual {v1}, Lorg/spongycastle/asn1/misc/IDEACBCPar;->c()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/spongycastle/jcajce/provider/symmetric/IDEA$AlgParams;->engineInit([B)V

    goto :goto_0

    .line 202
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unknown parameters format in IV parameters object"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineToString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 207
    const-string v0, "IDEA Parameters"

    return-object v0
.end method
