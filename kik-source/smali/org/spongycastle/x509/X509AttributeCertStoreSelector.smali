.class public Lorg/spongycastle/x509/X509AttributeCertStoreSelector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/util/Selector;


# instance fields
.field private a:Lorg/spongycastle/x509/AttributeCertificateHolder;

.field private b:Lorg/spongycastle/x509/AttributeCertificateIssuer;

.field private c:Ljava/math/BigInteger;

.field private d:Ljava/util/Date;

.field private e:Lorg/spongycastle/x509/X509AttributeCertificate;

.field private f:Ljava/util/Collection;

.field private g:Ljava/util/Collection;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->f:Ljava/util/Collection;

    .line 50
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->g:Ljava/util/Collection;

    .line 55
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/x509/X509AttributeCertificate;
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->e:Lorg/spongycastle/x509/X509AttributeCertificate;

    return-object v0
.end method

.method public final a(Ljava/lang/Object;)Z
    .locals 9

    .prologue
    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 66
    instance-of v0, p1, Lorg/spongycastle/x509/X509AttributeCertificate;

    if-nez v0, :cond_1

    .line 190
    :cond_0
    :goto_0
    return v1

    .line 71
    :cond_1
    check-cast p1, Lorg/spongycastle/x509/X509AttributeCertificate;

    .line 73
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->e:Lorg/spongycastle/x509/X509AttributeCertificate;

    if-eqz v0, :cond_2

    .line 75
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->e:Lorg/spongycastle/x509/X509AttributeCertificate;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->c:Ljava/math/BigInteger;

    if-eqz v0, :cond_3

    .line 82
    invoke-interface {p1}, Lorg/spongycastle/x509/X509AttributeCertificate;->a()Ljava/math/BigInteger;

    move-result-object v0

    iget-object v2, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->c:Ljava/math/BigInteger;

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    :cond_3
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->a:Lorg/spongycastle/x509/AttributeCertificateHolder;

    if-eqz v0, :cond_4

    .line 89
    invoke-interface {p1}, Lorg/spongycastle/x509/X509AttributeCertificate;->c()Lorg/spongycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    iget-object v2, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->a:Lorg/spongycastle/x509/AttributeCertificateHolder;

    invoke-virtual {v0, v2}, Lorg/spongycastle/x509/AttributeCertificateHolder;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    :cond_4
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->b:Lorg/spongycastle/x509/AttributeCertificateIssuer;

    if-eqz v0, :cond_5

    .line 96
    invoke-interface {p1}, Lorg/spongycastle/x509/X509AttributeCertificate;->d()Lorg/spongycastle/x509/AttributeCertificateIssuer;

    move-result-object v0

    iget-object v2, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->b:Lorg/spongycastle/x509/AttributeCertificateIssuer;

    invoke-virtual {v0, v2}, Lorg/spongycastle/x509/AttributeCertificateIssuer;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    :cond_5
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->d:Ljava/util/Date;

    if-eqz v0, :cond_6

    .line 106
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->d:Ljava/util/Date;

    invoke-interface {p1, v0}, Lorg/spongycastle/x509/X509AttributeCertificate;->a(Ljava/util/Date;)V
    :try_end_0
    .catch Ljava/security/cert/CertificateExpiredException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/cert/CertificateNotYetValidException; {:try_start_0 .. :try_end_0} :catch_2

    .line 117
    :cond_6
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->f:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->g:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_f

    .line 120
    :cond_7
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->E:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lorg/spongycastle/x509/X509AttributeCertificate;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v0

    .line 122
    if-eqz v0, :cond_f

    .line 127
    :try_start_1
    new-instance v2, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-static {v0}, Lorg/spongycastle/asn1/DEROctetString;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DEROctetString;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DEROctetString;->d()[B

    move-result-object v0

    invoke-direct {v2, v0}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/TargetInformation;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/TargetInformation;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    .line 141
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TargetInformation;->c()[Lorg/spongycastle/asn1/x509/Targets;

    move-result-object v5

    .line 142
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->f:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    move v0, v1

    move v2, v1

    .line 146
    :goto_1
    array-length v3, v5

    if-ge v0, v3, :cond_a

    .line 148
    aget-object v3, v5, v0

    .line 149
    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/Targets;->c()[Lorg/spongycastle/asn1/x509/Target;

    move-result-object v6

    move v3, v1

    .line 150
    :goto_2
    array-length v7, v6

    if-ge v3, v7, :cond_8

    .line 152
    iget-object v7, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->f:Ljava/util/Collection;

    aget-object v8, v6, v3

    invoke-virtual {v8}, Lorg/spongycastle/asn1/x509/Target;->d()Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v8

    invoke-static {v8}, Lorg/spongycastle/asn1/x509/GeneralName;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    move v2, v4

    .line 146
    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 150
    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 160
    :cond_a
    if-eqz v2, :cond_0

    .line 165
    :cond_b
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->g:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_f

    move v0, v1

    move v2, v1

    .line 169
    :goto_3
    array-length v3, v5

    if-ge v0, v3, :cond_e

    .line 171
    aget-object v3, v5, v0

    .line 172
    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/Targets;->c()[Lorg/spongycastle/asn1/x509/Target;

    move-result-object v6

    move v3, v1

    .line 173
    :goto_4
    array-length v7, v6

    if-ge v3, v7, :cond_c

    .line 175
    iget-object v7, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->g:Ljava/util/Collection;

    aget-object v8, v6, v3

    invoke-virtual {v8}, Lorg/spongycastle/asn1/x509/Target;->c()Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v8

    invoke-static {v8}, Lorg/spongycastle/asn1/x509/GeneralName;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_d

    move v2, v4

    .line 169
    :cond_c
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 173
    :cond_d
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 183
    :cond_e
    if-eqz v2, :cond_0

    :cond_f
    move v1, v4

    .line 190
    goto/16 :goto_0

    .line 139
    :catch_0
    move-exception v0

    goto/16 :goto_0

    .line 135
    :catch_1
    move-exception v0

    goto/16 :goto_0

    .line 114
    :catch_2
    move-exception v0

    goto/16 :goto_0

    .line 110
    :catch_3
    move-exception v0

    goto/16 :goto_0
.end method

.method public final b()Lorg/spongycastle/x509/AttributeCertificateHolder;
    .locals 1

    .prologue
    .line 274
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->a:Lorg/spongycastle/x509/AttributeCertificateHolder;

    return-object v0
.end method

.method public final c()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 315
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->c:Ljava/math/BigInteger;

    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 4

    .prologue
    .line 200
    new-instance v1, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;

    invoke-direct {v1}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;-><init>()V

    .line 201
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->e:Lorg/spongycastle/x509/X509AttributeCertificate;

    iput-object v0, v1, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->e:Lorg/spongycastle/x509/X509AttributeCertificate;

    .line 202
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->d:Ljava/util/Date;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/Date;

    iget-object v2, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->d:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    :goto_0
    iput-object v0, v1, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->d:Ljava/util/Date;

    .line 203
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->a:Lorg/spongycastle/x509/AttributeCertificateHolder;

    iput-object v0, v1, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->a:Lorg/spongycastle/x509/AttributeCertificateHolder;

    .line 204
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->b:Lorg/spongycastle/x509/AttributeCertificateIssuer;

    iput-object v0, v1, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->b:Lorg/spongycastle/x509/AttributeCertificateIssuer;

    .line 205
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->c:Ljava/math/BigInteger;

    iput-object v0, v1, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->c:Ljava/math/BigInteger;

    .line 206
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->g:Ljava/util/Collection;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    iput-object v0, v1, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->g:Ljava/util/Collection;

    .line 207
    iget-object v0, p0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->f:Ljava/util/Collection;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    iput-object v0, v1, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->f:Ljava/util/Collection;

    .line 208
    return-object v1

    .line 202
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
