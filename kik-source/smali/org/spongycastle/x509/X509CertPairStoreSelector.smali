.class public Lorg/spongycastle/x509/X509CertPairStoreSelector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/util/Selector;


# instance fields
.field private a:Lorg/spongycastle/x509/X509CertStoreSelector;

.field private b:Lorg/spongycastle/x509/X509CertStoreSelector;

.field private c:Lorg/spongycastle/x509/X509CertificatePair;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/x509/X509CertificatePair;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lorg/spongycastle/x509/X509CertPairStoreSelector;->c:Lorg/spongycastle/x509/X509CertificatePair;

    return-object v0
.end method

.method public final a(Lorg/spongycastle/x509/X509CertStoreSelector;)V
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lorg/spongycastle/x509/X509CertPairStoreSelector;->a:Lorg/spongycastle/x509/X509CertStoreSelector;

    .line 55
    return-void
.end method

.method public final a(Ljava/lang/Object;)Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 105
    instance-of v1, p1, Lorg/spongycastle/x509/X509CertificatePair;

    if-nez v1, :cond_0

    move v1, v2

    .line 132
    :goto_0
    return v1

    .line 109
    :cond_0
    :try_start_0
    move-object v0, p1

    check-cast v0, Lorg/spongycastle/x509/X509CertificatePair;

    move-object v1, v0

    .line 111
    iget-object v3, p0, Lorg/spongycastle/x509/X509CertPairStoreSelector;->a:Lorg/spongycastle/x509/X509CertStoreSelector;

    if-eqz v3, :cond_1

    iget-object v3, p0, Lorg/spongycastle/x509/X509CertPairStoreSelector;->a:Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-virtual {v1}, Lorg/spongycastle/x509/X509CertificatePair;->a()Ljava/security/cert/X509Certificate;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/spongycastle/x509/X509CertStoreSelector;->a(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    move v1, v2

    .line 114
    goto :goto_0

    .line 117
    :cond_1
    iget-object v3, p0, Lorg/spongycastle/x509/X509CertPairStoreSelector;->b:Lorg/spongycastle/x509/X509CertStoreSelector;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lorg/spongycastle/x509/X509CertPairStoreSelector;->b:Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-virtual {v1}, Lorg/spongycastle/x509/X509CertificatePair;->b()Ljava/security/cert/X509Certificate;

    move-result-object v1

    invoke-virtual {v3, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->a(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    move v1, v2

    .line 120
    goto :goto_0

    .line 123
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/x509/X509CertPairStoreSelector;->c:Lorg/spongycastle/x509/X509CertificatePair;

    if-eqz v1, :cond_3

    .line 125
    iget-object v1, p0, Lorg/spongycastle/x509/X509CertPairStoreSelector;->c:Lorg/spongycastle/x509/X509CertificatePair;

    invoke-virtual {v1, p1}, Lorg/spongycastle/x509/X509CertificatePair;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    goto :goto_0

    .line 128
    :cond_3
    const/4 v1, 0x1

    goto :goto_0

    .line 132
    :catch_0
    move-exception v1

    move v1, v2

    goto :goto_0
.end method

.method public final b()Lorg/spongycastle/x509/X509CertStoreSelector;
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lorg/spongycastle/x509/X509CertPairStoreSelector;->a:Lorg/spongycastle/x509/X509CertStoreSelector;

    return-object v0
.end method

.method public final b(Lorg/spongycastle/x509/X509CertStoreSelector;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lorg/spongycastle/x509/X509CertPairStoreSelector;->b:Lorg/spongycastle/x509/X509CertStoreSelector;

    .line 64
    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 74
    new-instance v1, Lorg/spongycastle/x509/X509CertPairStoreSelector;

    invoke-direct {v1}, Lorg/spongycastle/x509/X509CertPairStoreSelector;-><init>()V

    .line 76
    iget-object v0, p0, Lorg/spongycastle/x509/X509CertPairStoreSelector;->c:Lorg/spongycastle/x509/X509CertificatePair;

    iput-object v0, v1, Lorg/spongycastle/x509/X509CertPairStoreSelector;->c:Lorg/spongycastle/x509/X509CertificatePair;

    .line 78
    iget-object v0, p0, Lorg/spongycastle/x509/X509CertPairStoreSelector;->a:Lorg/spongycastle/x509/X509CertStoreSelector;

    if-eqz v0, :cond_0

    .line 80
    iget-object v0, p0, Lorg/spongycastle/x509/X509CertPairStoreSelector;->a:Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-virtual {v0}, Lorg/spongycastle/x509/X509CertStoreSelector;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/x509/X509CertStoreSelector;

    iput-object v0, v1, Lorg/spongycastle/x509/X509CertPairStoreSelector;->a:Lorg/spongycastle/x509/X509CertStoreSelector;

    .line 84
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/x509/X509CertPairStoreSelector;->b:Lorg/spongycastle/x509/X509CertStoreSelector;

    if-eqz v0, :cond_1

    .line 86
    iget-object v0, p0, Lorg/spongycastle/x509/X509CertPairStoreSelector;->b:Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-virtual {v0}, Lorg/spongycastle/x509/X509CertStoreSelector;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/x509/X509CertStoreSelector;

    iput-object v0, v1, Lorg/spongycastle/x509/X509CertPairStoreSelector;->b:Lorg/spongycastle/x509/X509CertStoreSelector;

    .line 90
    :cond_1
    return-object v1
.end method
