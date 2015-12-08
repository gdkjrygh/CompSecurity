.class public Lorg/spongycastle/jcajce/provider/symmetric/util/PBE$Util;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/symmetric/util/PBE;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Util"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljavax/crypto/spec/PBEKeySpec;III)Lorg/spongycastle/crypto/CipherParameters;
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 256
    invoke-static {p1, p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/PBE$Util;->a(II)Lorg/spongycastle/crypto/PBEParametersGenerator;

    move-result-object v1

    .line 260
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 262
    invoke-virtual {p0}, Ljavax/crypto/spec/PBEKeySpec;->getPassword()[C

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/crypto/PBEParametersGenerator;->b([C)[B

    move-result-object v0

    .line 269
    :goto_0
    invoke-virtual {p0}, Ljavax/crypto/spec/PBEKeySpec;->getSalt()[B

    move-result-object v3

    invoke-virtual {p0}, Ljavax/crypto/spec/PBEKeySpec;->getIterationCount()I

    move-result v4

    invoke-virtual {v1, v0, v3, v4}, Lorg/spongycastle/crypto/PBEParametersGenerator;->a([B[BI)V

    .line 271
    invoke-virtual {v1, p3}, Lorg/spongycastle/crypto/PBEParametersGenerator;->b(I)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v3

    move v1, v2

    .line 273
    :goto_1
    array-length v4, v0

    if-eq v1, v4, :cond_1

    .line 275
    aput-byte v2, v0, v1

    .line 273
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 266
    :cond_0
    invoke-virtual {p0}, Ljavax/crypto/spec/PBEKeySpec;->getPassword()[C

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/crypto/PBEParametersGenerator;->a([C)[B

    move-result-object v0

    goto :goto_0

    .line 278
    :cond_1
    return-object v3
.end method

.method public static a(Ljavax/crypto/spec/PBEKeySpec;IIII)Lorg/spongycastle/crypto/CipherParameters;
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 213
    invoke-static {p1, p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/PBE$Util;->a(II)Lorg/spongycastle/crypto/PBEParametersGenerator;

    move-result-object v1

    .line 217
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 219
    invoke-virtual {p0}, Ljavax/crypto/spec/PBEKeySpec;->getPassword()[C

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/crypto/PBEParametersGenerator;->b([C)[B

    move-result-object v0

    .line 226
    :goto_0
    invoke-virtual {p0}, Ljavax/crypto/spec/PBEKeySpec;->getSalt()[B

    move-result-object v2

    invoke-virtual {p0}, Ljavax/crypto/spec/PBEKeySpec;->getIterationCount()I

    move-result v4

    invoke-virtual {v1, v0, v2, v4}, Lorg/spongycastle/crypto/PBEParametersGenerator;->a([B[BI)V

    .line 228
    if-eqz p4, :cond_1

    .line 230
    invoke-virtual {v1, p3, p4}, Lorg/spongycastle/crypto/PBEParametersGenerator;->a(II)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    :goto_1
    move v2, v3

    .line 237
    :goto_2
    array-length v4, v0

    if-eq v2, v4, :cond_2

    .line 239
    aput-byte v3, v0, v2

    .line 237
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 223
    :cond_0
    invoke-virtual {p0}, Ljavax/crypto/spec/PBEKeySpec;->getPassword()[C

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/crypto/PBEParametersGenerator;->a([C)[B

    move-result-object v0

    goto :goto_0

    .line 234
    :cond_1
    invoke-virtual {v1, p3}, Lorg/spongycastle/crypto/PBEParametersGenerator;->a(I)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    goto :goto_1

    .line 242
    :cond_2
    return-object v1
.end method

.method public static a(Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;Ljava/security/spec/AlgorithmParameterSpec;)Lorg/spongycastle/crypto/CipherParameters;
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 175
    if-eqz p1, :cond_0

    instance-of v0, p1, Ljavax/crypto/spec/PBEParameterSpec;

    if-nez v0, :cond_1

    .line 177
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Need a PBEParameter spec with a PBE key."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 180
    :cond_1
    check-cast p1, Ljavax/crypto/spec/PBEParameterSpec;

    .line 181
    iget v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->c:I

    iget v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->d:I

    invoke-static {v0, v1}, Lorg/spongycastle/jcajce/provider/symmetric/util/PBE$Util;->a(II)Lorg/spongycastle/crypto/PBEParametersGenerator;

    move-result-object v1

    .line 182
    invoke-virtual {p0}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->getEncoded()[B

    move-result-object v0

    .line 185
    iget-boolean v3, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->i:Z

    if-eqz v3, :cond_2

    .line 187
    const/4 v0, 0x2

    new-array v0, v0, [B

    .line 190
    :cond_2
    invoke-virtual {p1}, Ljavax/crypto/spec/PBEParameterSpec;->getSalt()[B

    move-result-object v3

    invoke-virtual {p1}, Ljavax/crypto/spec/PBEParameterSpec;->getIterationCount()I

    move-result v4

    invoke-virtual {v1, v0, v3, v4}, Lorg/spongycastle/crypto/PBEParametersGenerator;->a([B[BI)V

    .line 192
    iget v3, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->e:I

    invoke-virtual {v1, v3}, Lorg/spongycastle/crypto/PBEParametersGenerator;->b(I)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v3

    move v1, v2

    .line 194
    :goto_0
    array-length v4, v0

    if-eq v1, v4, :cond_3

    .line 196
    aput-byte v2, v0, v1

    .line 194
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 199
    :cond_3
    return-object v3
.end method

.method public static a(Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;Ljava/security/spec/AlgorithmParameterSpec;Ljava/lang/String;)Lorg/spongycastle/crypto/CipherParameters;
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 116
    if-eqz p1, :cond_0

    instance-of v0, p1, Ljavax/crypto/spec/PBEParameterSpec;

    if-nez v0, :cond_1

    .line 118
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Need a PBEParameter spec with a PBE key."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 121
    :cond_1
    check-cast p1, Ljavax/crypto/spec/PBEParameterSpec;

    .line 122
    iget v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->c:I

    iget v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->d:I

    invoke-static {v0, v1}, Lorg/spongycastle/jcajce/provider/symmetric/util/PBE$Util;->a(II)Lorg/spongycastle/crypto/PBEParametersGenerator;

    move-result-object v1

    .line 123
    invoke-virtual {p0}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->getEncoded()[B

    move-result-object v0

    .line 126
    iget-boolean v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->i:Z

    if-eqz v2, :cond_6

    .line 128
    const/4 v0, 0x2

    new-array v0, v0, [B

    move-object v2, v0

    .line 131
    :goto_0
    invoke-virtual {p1}, Ljavax/crypto/spec/PBEParameterSpec;->getSalt()[B

    move-result-object v0

    invoke-virtual {p1}, Ljavax/crypto/spec/PBEParameterSpec;->getIterationCount()I

    move-result v4

    invoke-virtual {v1, v2, v0, v4}, Lorg/spongycastle/crypto/PBEParametersGenerator;->a([B[BI)V

    .line 133
    iget v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->f:I

    if-eqz v0, :cond_3

    .line 135
    iget v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->e:I

    iget v4, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->f:I

    invoke-virtual {v1, v0, v4}, Lorg/spongycastle/crypto/PBEParametersGenerator;->a(II)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    .line 142
    :goto_1
    const-string v0, "DES"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 144
    instance-of v0, v1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_4

    move-object v0, v1

    .line 146
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    .line 148
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/crypto/params/DESParameters;->a([B)V

    :cond_2
    :goto_2
    move v0, v3

    .line 158
    :goto_3
    array-length v4, v2

    if-eq v0, v4, :cond_5

    .line 160
    aput-byte v3, v2, v0

    .line 158
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 139
    :cond_3
    iget v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->e:I

    invoke-virtual {v1, v0}, Lorg/spongycastle/crypto/PBEParametersGenerator;->a(I)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    goto :goto_1

    :cond_4
    move-object v0, v1

    .line 152
    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    .line 154
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/crypto/params/DESParameters;->a([B)V

    goto :goto_2

    .line 163
    :cond_5
    return-object v1

    :cond_6
    move-object v2, v0

    goto :goto_0
.end method

.method private static a(II)Lorg/spongycastle/crypto/PBEParametersGenerator;
    .locals 2

    .prologue
    .line 52
    if-nez p0, :cond_0

    .line 54
    packed-switch p1, :pswitch_data_0

    .line 66
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "PKCS5 scheme 1 only supports MD2, MD5 and SHA1."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 57
    :pswitch_1
    new-instance v0, Lorg/spongycastle/crypto/generators/PKCS5S1ParametersGenerator;

    new-instance v1, Lorg/spongycastle/crypto/digests/MD2Digest;

    invoke-direct {v1}, Lorg/spongycastle/crypto/digests/MD2Digest;-><init>()V

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/generators/PKCS5S1ParametersGenerator;-><init>(Lorg/spongycastle/crypto/Digest;)V

    .line 104
    :goto_0
    return-object v0

    .line 60
    :pswitch_2
    new-instance v0, Lorg/spongycastle/crypto/generators/PKCS5S1ParametersGenerator;

    new-instance v1, Lorg/spongycastle/crypto/digests/MD5Digest;

    invoke-direct {v1}, Lorg/spongycastle/crypto/digests/MD5Digest;-><init>()V

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/generators/PKCS5S1ParametersGenerator;-><init>(Lorg/spongycastle/crypto/Digest;)V

    goto :goto_0

    .line 63
    :pswitch_3
    new-instance v0, Lorg/spongycastle/crypto/generators/PKCS5S1ParametersGenerator;

    new-instance v1, Lorg/spongycastle/crypto/digests/SHA1Digest;

    invoke-direct {v1}, Lorg/spongycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/generators/PKCS5S1ParametersGenerator;-><init>(Lorg/spongycastle/crypto/Digest;)V

    goto :goto_0

    .line 69
    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    .line 71
    new-instance v0, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;

    invoke-direct {v0}, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;-><init>()V

    goto :goto_0

    .line 73
    :cond_1
    const/4 v0, 0x2

    if-ne p0, v0, :cond_2

    .line 75
    packed-switch p1, :pswitch_data_1

    .line 96
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unknown digest scheme for PBE encryption."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 78
    :pswitch_4
    new-instance v0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;

    new-instance v1, Lorg/spongycastle/crypto/digests/MD2Digest;

    invoke-direct {v1}, Lorg/spongycastle/crypto/digests/MD2Digest;-><init>()V

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;-><init>(Lorg/spongycastle/crypto/Digest;)V

    goto :goto_0

    .line 81
    :pswitch_5
    new-instance v0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;

    new-instance v1, Lorg/spongycastle/crypto/digests/MD5Digest;

    invoke-direct {v1}, Lorg/spongycastle/crypto/digests/MD5Digest;-><init>()V

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;-><init>(Lorg/spongycastle/crypto/Digest;)V

    goto :goto_0

    .line 84
    :pswitch_6
    new-instance v0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;

    new-instance v1, Lorg/spongycastle/crypto/digests/SHA1Digest;

    invoke-direct {v1}, Lorg/spongycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;-><init>(Lorg/spongycastle/crypto/Digest;)V

    goto :goto_0

    .line 87
    :pswitch_7
    new-instance v0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;

    new-instance v1, Lorg/spongycastle/crypto/digests/RIPEMD160Digest;

    invoke-direct {v1}, Lorg/spongycastle/crypto/digests/RIPEMD160Digest;-><init>()V

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;-><init>(Lorg/spongycastle/crypto/Digest;)V

    goto :goto_0

    .line 90
    :pswitch_8
    new-instance v0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;

    new-instance v1, Lorg/spongycastle/crypto/digests/TigerDigest;

    invoke-direct {v1}, Lorg/spongycastle/crypto/digests/TigerDigest;-><init>()V

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;-><init>(Lorg/spongycastle/crypto/Digest;)V

    goto :goto_0

    .line 93
    :pswitch_9
    new-instance v0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;

    new-instance v1, Lorg/spongycastle/crypto/digests/SHA256Digest;

    invoke-direct {v1}, Lorg/spongycastle/crypto/digests/SHA256Digest;-><init>()V

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;-><init>(Lorg/spongycastle/crypto/Digest;)V

    goto :goto_0

    .line 101
    :cond_2
    new-instance v0, Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;

    invoke-direct {v0}, Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;-><init>()V

    goto :goto_0

    .line 54
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 75
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_4
    .end packed-switch
.end method
