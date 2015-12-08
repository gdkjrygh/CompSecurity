.class final Lkik/a/b/d;
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
    .line 447
    iput-object p1, p0, Lkik/a/b/d;->a:Lkik/a/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/security/KeyPair;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 451
    if-eqz p1, :cond_0

    .line 452
    invoke-static {p1}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v0

    .line 467
    :goto_0
    return-object v0

    .line 456
    :cond_0
    :try_start_0
    iget-object v0, p0, Lkik/a/b/d;->a:Lkik/a/b/a;

    invoke-static {v0}, Lkik/a/b/a;->d(Lkik/a/b/a;)Lcom/kik/g/p;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/bouncycastle/openssl/EncryptionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v0

    goto :goto_0

    .line 458
    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0

    .line 461
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0

    .line 464
    :catch_2
    move-exception v0

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0

    .line 467
    :catch_3
    move-exception v0

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 447
    check-cast p1, Ljava/security/KeyPair;

    invoke-direct {p0, p1}, Lkik/a/b/d;->a(Ljava/security/KeyPair;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method
