.class final Lkik/a/b/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Lkik/a/b/a;


# direct methods
.method constructor <init>(Lkik/a/b/a;)V
    .locals 0

    .prologue
    .line 322
    iput-object p1, p0, Lkik/a/b/b;->a:Lkik/a/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/kik/m/o;)Lcom/kik/g/p;
    .locals 11

    .prologue
    const/4 v4, 0x0

    .line 328
    iget-object v0, p1, Lcom/kik/m/o;->a:Ljava/lang/Object;

    check-cast v0, Lcom/kik/n/a/g/a;

    .line 329
    iget-object v1, p1, Lcom/kik/m/o;->b:Ljava/lang/Object;

    check-cast v1, Lcom/kik/n/a/g/a;

    .line 331
    invoke-static {v4}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v3

    .line 333
    const/4 v5, 0x1

    .line 341
    invoke-static {v4}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v2

    .line 343
    if-eqz v0, :cond_1

    .line 344
    invoke-virtual {v0}, Lcom/kik/n/a/g/a;->b()Lcom/b/a/b;

    move-result-object v7

    .line 350
    if-eqz v1, :cond_5

    .line 351
    invoke-virtual {v1}, Lcom/kik/n/a/g/a;->b()Lcom/b/a/b;

    move-result-object v6

    .line 354
    :goto_0
    if-eqz v0, :cond_2

    .line 356
    :try_start_0
    invoke-virtual {v7}, Lcom/b/a/b;->c()[B

    move-result-object v0

    invoke-static {v0}, Lkik/a/h/h;->b([B)Lorg/spongycastle/jce/interfaces/ECPrivateKey;
    :try_end_0
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v7

    .line 371
    if-eqz v1, :cond_4

    .line 372
    const/4 v1, 0x0

    .line 375
    :try_start_1
    invoke-virtual {v6}, Lcom/b/a/b;->c()[B

    move-result-object v0

    invoke-static {v0}, Lkik/a/h/h;->a([B)Lorg/spongycastle/jce/interfaces/ECPublicKey;
    :try_end_1
    .catch Ljava/security/NoSuchProviderException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_7

    move-result-object v0

    move v5, v1

    .line 391
    :goto_1
    if-eqz v0, :cond_0

    iget-object v1, p0, Lkik/a/b/b;->a:Lkik/a/b/a;

    invoke-static {v1, v0, v7}, Lkik/a/b/a;->a(Lkik/a/b/a;Lorg/spongycastle/jce/interfaces/ECPublicKey;Lorg/spongycastle/jce/interfaces/ECPrivateKey;)Z

    move-result v1

    if-nez v1, :cond_0

    move-object v0, v4

    .line 397
    :cond_0
    if-nez v0, :cond_3

    .line 399
    :try_start_2
    const-string v0, "EC"

    const-string v1, "SC"

    invoke-static {v0, v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    .line 401
    invoke-interface {v7}, Lorg/spongycastle/jce/interfaces/ECPrivateKey;->b()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/jce/spec/ECParameterSpec;->c()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v1

    invoke-interface {v7}, Lorg/spongycastle/jce/interfaces/ECPrivateKey;->c()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/spongycastle/math/ec/ECPoint;->a(Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v1

    .line 402
    new-instance v2, Lorg/spongycastle/jce/spec/ECPublicKeySpec;

    invoke-interface {v7}, Lorg/spongycastle/jce/interfaces/ECPrivateKey;->b()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v6

    invoke-direct {v2, v1, v6}, Lorg/spongycastle/jce/spec/ECPublicKeySpec;-><init>(Lorg/spongycastle/math/ec/ECPoint;Lorg/spongycastle/jce/spec/ECParameterSpec;)V

    .line 404
    invoke-virtual {v0, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/interfaces/ECPublicKey;

    .line 406
    invoke-interface {v0}, Lorg/spongycastle/jce/interfaces/ECPublicKey;->getEncoded()[B

    move-result-object v1

    .line 409
    iget-object v2, p0, Lkik/a/b/b;->a:Lkik/a/b/a;

    invoke-static {v2}, Lkik/a/b/a;->a(Lkik/a/b/a;)Lkik/a/j/m;

    move-result-object v2

    const-string v6, "messaging_pub_key"

    const/4 v8, 0x0

    new-instance v9, Lcom/kik/n/a/g/a;

    invoke-direct {v9}, Lcom/kik/n/a/g/a;-><init>()V

    invoke-static {v1}, Lcom/b/a/b;->b([B)Lcom/b/a/b;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/kik/n/a/g/a;->a(Lcom/b/a/b;)Lcom/kik/n/a/g/a;

    move-result-object v1

    invoke-interface {v2, v6, v8, v1}, Lkik/a/j/m;->b(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;)Lcom/kik/g/p;

    move-result-object v1

    .line 412
    iget-object v2, p0, Lkik/a/b/b;->a:Lkik/a/b/a;

    invoke-static {v2}, Lkik/a/b/a;->b(Lkik/a/b/a;)Lcom/kik/g/k;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_9
    .catch Ljava/security/NoSuchProviderException; {:try_start_2 .. :try_end_2} :catch_a

    move-object v10, v1

    move-object v1, v0

    move-object v0, v10

    .line 429
    :goto_2
    new-instance v2, Ljava/security/KeyPair;

    invoke-direct {v2, v1, v7}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V

    .line 431
    new-instance v1, Lkik/a/b/c;

    invoke-direct {v1, p0, v2}, Lkik/a/b/c;-><init>(Lkik/a/b/b;Ljava/security/KeyPair;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    .line 441
    :goto_3
    return-object v0

    :cond_1
    move-object v0, v3

    .line 347
    goto :goto_3

    .line 359
    :catch_0
    move-exception v0

    move-object v0, v3

    goto :goto_3

    .line 362
    :catch_1
    move-exception v0

    move-object v0, v3

    goto :goto_3

    .line 365
    :catch_2
    move-exception v0

    move-object v0, v3

    goto :goto_3

    .line 368
    :catch_3
    move-exception v0

    move-object v0, v3

    goto :goto_3

    .line 388
    :catch_4
    move-exception v0

    move-object v0, v4

    move v5, v1

    goto/16 :goto_1

    :catch_5
    move-exception v0

    move-object v0, v4

    move v5, v1

    goto/16 :goto_1

    :catch_6
    move-exception v0

    move-object v0, v4

    move v5, v1

    goto/16 :goto_1

    :catch_7
    move-exception v0

    move-object v0, v4

    move v5, v1

    goto/16 :goto_1

    .line 416
    :catch_8
    move-exception v0

    iget-object v0, p0, Lkik/a/b/b;->a:Lkik/a/b/a;

    invoke-static {v0}, Lkik/a/b/a;->c(Lkik/a/b/a;)Lcom/kik/g/k;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    move-object v0, v3

    .line 417
    goto :goto_3

    .line 420
    :catch_9
    move-exception v0

    iget-object v0, p0, Lkik/a/b/b;->a:Lkik/a/b/a;

    invoke-static {v0}, Lkik/a/b/a;->c(Lkik/a/b/a;)Lcom/kik/g/k;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    move-object v0, v3

    .line 421
    goto :goto_3

    .line 424
    :catch_a
    move-exception v0

    iget-object v0, p0, Lkik/a/b/b;->a:Lkik/a/b/a;

    invoke-static {v0}, Lkik/a/b/a;->c(Lkik/a/b/a;)Lcom/kik/g/k;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    move-object v0, v3

    .line 425
    goto :goto_3

    :cond_2
    move-object v0, v3

    .line 441
    goto :goto_3

    :cond_3
    move-object v1, v0

    move-object v0, v2

    goto :goto_2

    :cond_4
    move-object v0, v4

    goto/16 :goto_1

    :cond_5
    move-object v6, v4

    goto/16 :goto_0
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 322
    check-cast p1, Lcom/kik/m/o;

    invoke-direct {p0, p1}, Lkik/a/b/b;->a(Lcom/kik/m/o;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method
