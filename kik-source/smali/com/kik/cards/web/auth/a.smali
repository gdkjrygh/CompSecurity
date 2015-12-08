.class public final Lcom/kik/cards/web/auth/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/d;
.implements Lkik/a/f/j;


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private final b:Lkik/a/e/f;

.field private final c:Lkik/a/e/v;

.field private final d:Lkik/a/e/t;

.field private final e:Lkik/a/e/w;

.field private f:Ljava/lang/String;

.field private g:J

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Z

.field private k:Lcom/kik/g/f;

.field private final l:Lcom/kik/g/i;

.field private final m:Lcom/kik/g/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 68
    const-string v0, "KikAuthManager"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/cards/web/auth/a;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Lkik/a/e/f;Lkik/a/e/v;Lkik/a/e/t;Lkik/a/e/w;)V
    .locals 3

    .prologue
    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/auth/a;->j:Z

    .line 84
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/auth/a;->k:Lcom/kik/g/f;

    .line 86
    new-instance v0, Lcom/kik/cards/web/auth/b;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/auth/b;-><init>(Lcom/kik/cards/web/auth/a;)V

    iput-object v0, p0, Lcom/kik/cards/web/auth/a;->l:Lcom/kik/g/i;

    .line 97
    new-instance v0, Lcom/kik/cards/web/auth/c;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/auth/c;-><init>(Lcom/kik/cards/web/auth/a;)V

    iput-object v0, p0, Lcom/kik/cards/web/auth/a;->m:Lcom/kik/g/i;

    .line 109
    iput-object p1, p0, Lcom/kik/cards/web/auth/a;->b:Lkik/a/e/f;

    .line 110
    iput-object p2, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    .line 111
    iput-object p3, p0, Lcom/kik/cards/web/auth/a;->d:Lkik/a/e/t;

    .line 112
    iput-object p4, p0, Lcom/kik/cards/web/auth/a;->e:Lkik/a/e/w;

    .line 114
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    const-string v1, "kik.auth.manager.store.url"

    invoke-interface {v0, v1}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/auth/a;->f:Ljava/lang/String;

    .line 115
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    const-string v1, "kik.auth.manager.store.revalidate"

    invoke-interface {v0, v1}, Lkik/a/e/v;->o(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kik/cards/web/auth/a;->g:J

    .line 116
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    const-string v1, "kik.auth.manager.store.signature"

    invoke-interface {v0, v1}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/auth/a;->h:Ljava/lang/String;

    .line 117
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    const-string v1, "kik.auth.manager.store.username.in.hash"

    invoke-interface {v0, v1}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/auth/a;->i:Ljava/lang/String;

    .line 120
    invoke-interface {p4}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v0, v0, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/kik/cards/web/auth/a;->a(Ljava/lang/String;)V

    .line 122
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->k:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/cards/web/auth/a;->b:Lkik/a/e/f;

    invoke-interface {v1}, Lkik/a/e/f;->b()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/auth/a;->l:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 123
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->k:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/cards/web/auth/a;->e:Lkik/a/e/w;

    invoke-interface {v1}, Lkik/a/e/w;->a()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/auth/a;->m:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 124
    return-void
.end method

.method private static a(Ljava/lang/String;[B)Ljava/lang/String;
    .locals 13

    .prologue
    const/16 v12, 0x40

    const/16 v11, 0x20

    const/4 v8, 0x0

    .line 562
    :try_start_0
    invoke-static {p1}, Lorg/spongycastle/crypto/util/PrivateKeyFactory;->a([B)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    move-object v7, v0

    .line 564
    const-string v1, "UTF-8"

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v9

    .line 567
    sget-object v1, Lorg/spongycastle/asn1/sec/SECObjectIdentifiers;->H:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v1}, Lorg/spongycastle/asn1/sec/SECNamedCurves;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x9/X9ECParameters;

    move-result-object v6

    .line 568
    new-instance v10, Lorg/spongycastle/crypto/digests/SHA256Digest;

    invoke-direct {v10}, Lorg/spongycastle/crypto/digests/SHA256Digest;-><init>()V

    .line 570
    new-instance v1, Lorg/spongycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v6}, Lorg/spongycastle/asn1/x9/X9ECParameters;->c()Lorg/spongycastle/math/ec/ECCurve;

    move-result-object v2

    invoke-virtual {v6}, Lorg/spongycastle/asn1/x9/X9ECParameters;->d()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v3

    invoke-virtual {v6}, Lorg/spongycastle/asn1/x9/X9ECParameters;->e()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v6}, Lorg/spongycastle/asn1/x9/X9ECParameters;->f()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v6}, Lorg/spongycastle/asn1/x9/X9ECParameters;->g()[B

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lorg/spongycastle/crypto/params/ECDomainParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    .line 577
    new-instance v2, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    invoke-virtual {v7}, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;->c()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/ECDomainParameters;)V

    .line 580
    const/4 v1, 0x0

    array-length v3, v9

    invoke-interface {v10, v9, v1, v3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 581
    invoke-interface {v10}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v1

    new-array v1, v1, [B

    .line 582
    const/4 v3, 0x0

    invoke-interface {v10, v1, v3}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 584
    new-instance v3, Lorg/spongycastle/crypto/signers/ECDSASigner;

    invoke-direct {v3}, Lorg/spongycastle/crypto/signers/ECDSASigner;-><init>()V

    const/4 v4, 0x1

    invoke-virtual {v3, v4, v2}, Lorg/spongycastle/crypto/signers/ECDSASigner;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    invoke-virtual {v3, v1}, Lorg/spongycastle/crypto/signers/ECDSASigner;->a([B)[Ljava/math/BigInteger;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v2, v1, v2

    const/4 v3, 0x1

    aget-object v1, v1, v3

    invoke-virtual {v2}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v2

    invoke-virtual {v1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v3

    const/16 v1, 0x40

    new-array v4, v1, [B

    move v1, v8

    :goto_0
    if-ge v1, v12, :cond_0

    const/4 v5, 0x0

    aput-byte v5, v4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    array-length v1, v2

    if-lt v1, v11, :cond_1

    array-length v1, v2

    add-int/lit8 v1, v1, -0x20

    const/4 v5, 0x0

    const/16 v6, 0x20

    invoke-static {v2, v1, v4, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_1
    array-length v1, v3

    if-lt v1, v11, :cond_2

    array-length v1, v3

    add-int/lit8 v1, v1, -0x20

    const/16 v2, 0x20

    const/16 v5, 0x20

    invoke-static {v3, v1, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 586
    :goto_2
    invoke-static {v4}, Lcom/kik/m/e;->b([B)Ljava/lang/String;

    move-result-object v1

    .line 589
    :goto_3
    return-object v1

    .line 584
    :cond_1
    const/4 v1, 0x0

    array-length v5, v2

    rsub-int/lit8 v5, v5, 0x20

    array-length v6, v2

    invoke-static {v2, v1, v4, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 589
    :catch_0
    move-exception v1

    const/4 v1, 0x0

    goto :goto_3

    .line 584
    :cond_2
    const/4 v1, 0x0

    array-length v2, v3

    rsub-int/lit8 v2, v2, 0x40

    array-length v5, v3

    invoke-static {v3, v1, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2
.end method

.method static synthetic a(Lcom/kik/cards/web/auth/a;)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 59
    iget-object v2, p0, Lcom/kik/cards/web/auth/a;->i:Ljava/lang/String;

    if-eqz v2, :cond_1

    move v2, v0

    :goto_0
    if-eqz v2, :cond_0

    iget-boolean v2, p0, Lcom/kik/cards/web/auth/a;->j:Z

    if-eqz v2, :cond_2

    :cond_0
    :goto_1
    return-void

    :cond_1
    move v2, v1

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/kik/cards/web/auth/a;->j()Ljava/security/interfaces/RSAPublicKey;

    move-result-object v2

    if-eqz v2, :cond_3

    :goto_2
    if-nez v0, :cond_4

    invoke-direct {p0}, Lcom/kik/cards/web/auth/a;->d()V

    invoke-direct {p0}, Lcom/kik/cards/web/auth/a;->f()V

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_2

    :cond_4
    invoke-direct {p0}, Lcom/kik/cards/web/auth/a;->e()V

    goto :goto_1
.end method

.method static synthetic a(Lcom/kik/cards/web/auth/a;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0, p1}, Lcom/kik/cards/web/auth/a;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/kik/cards/web/auth/a;Ljava/security/KeyPair;)V
    .locals 4

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/kik/cards/web/auth/a;->h()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljavax/crypto/spec/DESKeySpec;

    const-string v2, "UTF8"

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/spec/DESKeySpec;-><init>([B)V

    const-string v0, "DES"

    invoke-static {v0}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    const-string v1, "DES"

    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    invoke-virtual {p1}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    invoke-static {v0}, Lcom/kik/m/e;->a([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v2

    invoke-interface {v2}, Ljava/security/PrivateKey;->getEncoded()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v1

    invoke-static {v1}, Lcom/kik/m/e;->a([B)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    const-string v3, "kik.auth.gen.pub.key"

    invoke-interface {v2, v3, v0}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    const-string v2, "kik.auth.gen.priv.key"

    invoke-interface {v0, v2, v1}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 275
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 276
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    const-string v1, "kik.auth.gen.pub.key"

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    const-string v1, "kik.auth.gen.priv.key"

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 277
    invoke-direct {p0}, Lcom/kik/cards/web/auth/a;->d()V

    .line 278
    iput-object p1, p0, Lcom/kik/cards/web/auth/a;->i:Ljava/lang/String;

    .line 279
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    const-string v1, "kik.auth.manager.store.username.in.hash"

    iget-object v2, p0, Lcom/kik/cards/web/auth/a;->i:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 281
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 348
    iget-object v1, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    invoke-static {v1}, Lkik/a/z;->a(Lkik/a/e/v;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 373
    :cond_0
    :goto_0
    return-object v0

    .line 354
    :cond_1
    :try_start_0
    invoke-direct {p0}, Lcom/kik/cards/web/auth/a;->i()[B

    move-result-object v1

    .line 355
    if-eqz v1, :cond_0

    .line 359
    const-string v2, "HmacSHA1"

    invoke-static {v2}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v2

    .line 361
    new-instance v3, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    invoke-virtual {v2}, Ljavax/crypto/Mac;->getAlgorithm()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 362
    invoke-virtual {v2, v3}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 363
    invoke-virtual {v2, v1}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v1

    .line 364
    invoke-static {v1}, Lcom/kik/m/e;->a([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0

    .line 370
    :catch_1
    move-exception v1

    goto :goto_0

    .line 367
    :catch_2
    move-exception v1

    goto :goto_0
.end method

.method static synthetic b(Lcom/kik/cards/web/auth/a;)Lkik/a/e/w;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->e:Lkik/a/e/w;

    return-object v0
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 596
    :try_start_0
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    .line 597
    invoke-static {v0}, Lcom/kik/m/e;->b([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 600
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic c(Lcom/kik/cards/web/auth/a;)Z
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/auth/a;->j:Z

    return v0
.end method

.method private d()V
    .locals 2

    .prologue
    .line 151
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/kik/cards/web/auth/a;->g:J

    .line 152
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/cards/web/auth/a;->f:Ljava/lang/String;

    .line 153
    invoke-direct {p0}, Lcom/kik/cards/web/auth/a;->g()V

    .line 154
    return-void
.end method

.method static synthetic d(Lcom/kik/cards/web/auth/a;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/kik/cards/web/auth/a;->e()V

    return-void
.end method

.method private e()V
    .locals 4

    .prologue
    .line 158
    iget-wide v0, p0, Lcom/kik/cards/web/auth/a;->g:J

    invoke-static {}, Lcom/kik/sdkutils/ab;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 159
    const/4 v0, 0x0

    .line 161
    :try_start_0
    invoke-direct {p0}, Lcom/kik/cards/web/auth/a;->i()[B

    move-result-object v1

    invoke-static {v1}, Lcom/kik/m/e;->a([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 167
    :goto_0
    iget-object v1, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    invoke-static {v1}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v1

    .line 169
    if-nez v1, :cond_1

    .line 170
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Generating certificate without credentials"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 192
    :cond_0
    :goto_1
    return-void

    .line 163
    :catch_0
    move-exception v1

    .line 164
    sget-object v2, Lcom/kik/cards/web/auth/a;->a:Lorg/c/b;

    const-string v3, "Key generation failed"

    invoke-interface {v2, v3, v1}, Lorg/c/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 174
    :cond_1
    invoke-virtual {v1}, Lkik/a/z;->b()Ljava/lang/String;

    move-result-object v1

    .line 177
    if-nez v1, :cond_2

    .line 178
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Generating certificate without passkey"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 182
    :cond_2
    invoke-direct {p0, v1}, Lcom/kik/cards/web/auth/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/cards/web/auth/a;->h:Ljava/lang/String;

    .line 184
    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/kik/cards/web/auth/a;->h:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 185
    new-instance v1, Lkik/a/f/f/b;

    iget-object v2, p0, Lcom/kik/cards/web/auth/a;->h:Ljava/lang/String;

    iget-object v3, p0, Lcom/kik/cards/web/auth/a;->f:Ljava/lang/String;

    invoke-direct {v1, p0, v0, v2, v3}, Lkik/a/f/f/b;-><init>(Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->b:Lkik/a/e/f;

    invoke-interface {v0, v1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    goto :goto_1

    .line 189
    :cond_3
    sget-object v0, Lcom/kik/cards/web/auth/a;->a:Lorg/c/b;

    const-string v1, "No key, not uploading."

    invoke-interface {v0, v1}, Lorg/c/b;->a(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private f()V
    .locals 2

    .prologue
    .line 196
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/cards/web/auth/a;->j:Z

    .line 198
    new-instance v0, Lcom/kik/cards/web/auth/d;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/auth/d;-><init>(Lcom/kik/cards/web/auth/a;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/auth/d;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 223
    return-void
.end method

.method private g()V
    .locals 4

    .prologue
    .line 249
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    const-string v1, "kik.auth.manager.store.url"

    iget-object v2, p0, Lcom/kik/cards/web/auth/a;->f:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 250
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    const-string v1, "kik.auth.manager.store.revalidate"

    iget-wide v2, p0, Lcom/kik/cards/web/auth/a;->g:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Long;)Z

    .line 251
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    const-string v1, "kik.auth.manager.store.signature"

    iget-object v2, p0, Lcom/kik/cards/web/auth/a;->h:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 252
    return-void
.end method

.method private h()Ljava/lang/String;
    .locals 3

    .prologue
    .line 336
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->i:Ljava/lang/String;

    .line 337
    if-nez v0, :cond_0

    .line 338
    const/4 v0, 0x0

    .line 342
    :goto_0
    return-object v0

    .line 341
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkik/android/chat/KikApplication;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 342
    iget-object v1, p0, Lcom/kik/cards/web/auth/a;->d:Lkik/a/e/t;

    invoke-interface {v1, v0}, Lkik/a/e/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private i()[B
    .locals 4

    .prologue
    .line 382
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    const-string v1, "kik.auth.gen.pub.key"

    invoke-interface {v0, v1}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 383
    if-nez v0, :cond_0

    .line 384
    const/4 v0, 0x0

    .line 394
    :goto_0
    return-object v0

    .line 387
    :cond_0
    new-instance v1, Ljavax/crypto/spec/DESKeySpec;

    invoke-direct {p0}, Lcom/kik/cards/web/auth/a;->h()Ljava/lang/String;

    move-result-object v2

    const-string v3, "UTF8"

    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljavax/crypto/spec/DESKeySpec;-><init>([B)V

    .line 388
    const-string v2, "DES"

    invoke-static {v2}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v2

    .line 389
    invoke-virtual {v2, v1}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v1

    .line 391
    const-string v2, "DES"

    invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v2

    .line 392
    const/4 v3, 0x2

    invoke-virtual {v2, v3, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 393
    invoke-static {v0}, Lcom/kik/m/e;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    goto :goto_0
.end method

.method private j()Ljava/security/interfaces/RSAPublicKey;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 447
    :try_start_0
    invoke-direct {p0}, Lcom/kik/cards/web/auth/a;->i()[B

    move-result-object v0

    .line 448
    if-nez v0, :cond_0

    move-object v0, v1

    .line 459
    :goto_0
    return-object v0

    .line 451
    :cond_0
    const-string v2, "RSA"

    invoke-static {v2}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v2

    new-instance v3, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v3, v0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    invoke-virtual {v2, v3}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/RSAPublicKey;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 453
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    :goto_1
    move-object v0, v1

    .line 459
    goto :goto_0

    .line 456
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/security/GeneralSecurityException;->printStackTrace()V

    goto :goto_1
.end method


# virtual methods
.method public final a(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    .line 485
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 486
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    .line 488
    const-string v1, "cty"

    const-string v4, "text/plain"

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    const-string v1, "alg"

    const-string v4, "RS256"

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    const-string v1, "x5u"

    invoke-virtual {p0}, Lcom/kik/cards/web/auth/a;->b()Ljava/net/URL;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    const-string v1, "typ"

    const-string v4, "JWT"

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    const-string v1, "nbf"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    const-string v1, "exp"

    const-wide/16 v4, 0x2a30

    add-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 496
    new-instance v1, Lc/a/a/d;

    invoke-direct {v1, v0}, Lc/a/a/d;-><init>(Ljava/util/Map;)V

    .line 497
    invoke-virtual {v1}, Lc/a/a/d;->toString()Ljava/lang/String;

    move-result-object v0

    .line 498
    invoke-static {v0}, Lcom/kik/cards/web/auth/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 499
    invoke-static {p2}, Lcom/kik/cards/web/auth/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 501
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 502
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    const-string v0, "."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/kik/cards/web/auth/a;->c()Ljava/security/interfaces/RSAPrivateKey;

    move-result-object v1

    const-string v3, "SHA256withRSA"

    invoke-static {v3}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/security/Signature;->update([B)V

    invoke-virtual {v3}, Ljava/security/Signature;->sign()[B

    move-result-object v0

    invoke-static {v0}, Lcom/kik/m/e;->b([B)Ljava/lang/String;

    move-result-object v0

    .line 508
    const-string v1, "."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 515
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 511
    :catch_0
    move-exception v0

    .line 512
    new-instance v1, Ljava/lang/Exception;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final a(Ljava/util/Map;Ljava/lang/String;[B)Ljava/lang/String;
    .locals 6

    .prologue
    .line 521
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 522
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    .line 524
    const-string v1, "cty"

    const-string v4, "text/plain"

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    const-string v1, "alg"

    const-string v4, "ES256"

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 526
    const-string v1, "typ"

    const-string v4, "JWT"

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    const-string v1, "nbf"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    const-string v1, "exp"

    const-wide/16 v4, 0x2a30

    add-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 531
    new-instance v1, Lc/a/a/d;

    invoke-direct {v1, v0}, Lc/a/a/d;-><init>(Ljava/util/Map;)V

    .line 532
    invoke-virtual {v1}, Lc/a/a/d;->toString()Ljava/lang/String;

    move-result-object v0

    .line 533
    invoke-static {v0}, Lcom/kik/cards/web/auth/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 534
    invoke-static {p2}, Lcom/kik/cards/web/auth/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 536
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 537
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    const-string v0, "."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p3}, Lcom/kik/cards/web/auth/a;->a(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    .line 542
    const-string v1, "."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 543
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 548
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 545
    :catch_0
    move-exception v0

    .line 546
    new-instance v1, Ljava/lang/Exception;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->k:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 147
    return-void
.end method

.method public final a(Lkik/a/f/f/z;I)V
    .locals 4

    .prologue
    .line 291
    instance-of v0, p1, Lkik/a/f/f/b;

    if-eqz v0, :cond_0

    .line 292
    check-cast p1, Lkik/a/f/f/b;

    .line 293
    packed-switch p2, :pswitch_data_0

    .line 307
    :cond_0
    :goto_0
    return-void

    .line 295
    :pswitch_0
    invoke-virtual {p1}, Lkik/a/f/f/b;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/auth/a;->f:Ljava/lang/String;

    .line 296
    invoke-static {}, Lcom/kik/sdkutils/ab;->a()J

    move-result-wide v0

    invoke-virtual {p1}, Lkik/a/f/f/b;->b()J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/kik/cards/web/auth/a;->g:J

    .line 297
    invoke-direct {p0}, Lcom/kik/cards/web/auth/a;->g()V

    goto :goto_0

    .line 301
    :pswitch_1
    invoke-virtual {p1}, Lkik/a/f/f/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 302
    invoke-direct {p0}, Lcom/kik/cards/web/auth/a;->f()V

    goto :goto_0

    .line 293
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final b()Ljava/net/URL;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 233
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 244
    :goto_0
    return-object v1

    .line 239
    :cond_0
    :try_start_0
    new-instance v0, Ljava/net/URL;

    iget-object v2, p0, Lcom/kik/cards/web/auth/a;->f:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    move-object v1, v0

    .line 244
    goto :goto_0

    .line 241
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/net/MalformedURLException;->printStackTrace()V

    move-object v0, v1

    goto :goto_1
.end method

.method public final c()Ljava/security/interfaces/RSAPrivateKey;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 429
    :try_start_0
    iget-object v0, p0, Lcom/kik/cards/web/auth/a;->c:Lkik/a/e/v;

    const-string v2, "kik.auth.gen.priv.key"

    invoke-interface {v0, v2}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/kik/cards/web/auth/a;->h()Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_0

    if-nez v2, :cond_1

    :cond_0
    move-object v0, v1

    .line 430
    :goto_0
    if-nez v0, :cond_2

    move-object v0, v1

    .line 441
    :goto_1
    return-object v0

    .line 429
    :cond_1
    new-instance v3, Ljavax/crypto/spec/DESKeySpec;

    const-string v4, "UTF8"

    invoke-virtual {v2, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-direct {v3, v2}, Ljavax/crypto/spec/DESKeySpec;-><init>([B)V

    const-string v2, "DES"

    invoke-static {v2}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v2

    const-string v3, "DES"

    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    const/4 v4, 0x2

    invoke-virtual {v3, v4, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    invoke-static {v0}, Lcom/kik/m/e;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    goto :goto_0

    .line 433
    :cond_2
    const-string v2, "RSA"

    invoke-static {v2}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v2

    new-instance v3, Ljava/security/spec/PKCS8EncodedKeySpec;

    invoke-direct {v3, v0}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V

    invoke-virtual {v2, v3}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/RSAPrivateKey;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    .line 435
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    :goto_2
    move-object v0, v1

    .line 441
    goto :goto_1

    .line 438
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/security/GeneralSecurityException;->printStackTrace()V

    goto :goto_2
.end method
