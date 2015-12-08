.class public Lorg/spongycastle/jce/provider/X509CertPairParser;
.super Lorg/spongycastle/x509/X509StreamParserSpi;
.source "SourceFile"


# instance fields
.field private a:Ljava/io/InputStream;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Lorg/spongycastle/x509/X509StreamParserSpi;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/X509CertPairParser;->a:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    .prologue
    .line 48
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertPairParser;->a:Ljava/io/InputStream;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/io/InputStream;->mark(I)V

    .line 49
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertPairParser;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 51
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 53
    const/4 v0, 0x0

    .line 57
    :goto_0
    return-object v0

    .line 56
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertPairParser;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    .line 57
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertPairParser;->a:Ljava/io/InputStream;

    new-instance v1, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/CertificatePair;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/CertificatePair;

    move-result-object v1

    new-instance v0, Lorg/spongycastle/x509/X509CertificatePair;

    invoke-direct {v0, v1}, Lorg/spongycastle/x509/X509CertificatePair;-><init>(Lorg/spongycastle/asn1/x509/CertificatePair;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 59
    :catch_0
    move-exception v0

    .line 61
    new-instance v1, Lorg/spongycastle/x509/util/StreamParsingException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/x509/util/StreamParsingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final a(Ljava/io/InputStream;)V
    .locals 2

    .prologue
    .line 35
    iput-object p1, p0, Lorg/spongycastle/jce/provider/X509CertPairParser;->a:Ljava/io/InputStream;

    .line 37
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertPairParser;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Ljava/io/BufferedInputStream;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509CertPairParser;->a:Ljava/io/InputStream;

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/X509CertPairParser;->a:Ljava/io/InputStream;

    .line 41
    :cond_0
    return-void
.end method
