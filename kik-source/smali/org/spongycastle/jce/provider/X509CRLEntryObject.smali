.class public Lorg/spongycastle/jce/provider/X509CRLEntryObject;
.super Ljava/security/cert/X509CRLEntry;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;

.field private b:Lorg/spongycastle/asn1/x500/X500Name;

.field private c:I

.field private d:Z


# direct methods
.method public constructor <init>(Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;ZLorg/spongycastle/asn1/x500/X500Name;)V
    .locals 1

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/security/cert/X509CRLEntry;-><init>()V

    .line 71
    iput-object p1, p0, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->a:Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;

    .line 72
    invoke-direct {p0, p2, p3}, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->a(ZLorg/spongycastle/asn1/x500/X500Name;)Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->b:Lorg/spongycastle/asn1/x500/X500Name;

    .line 73
    return-void
.end method

.method private a(Z)Ljava/util/Set;
    .locals 5

    .prologue
    .line 136
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->a:Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;->e()Lorg/spongycastle/asn1/x509/Extensions;

    move-result-object v2

    .line 138
    if-eqz v2, :cond_2

    .line 140
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 141
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/Extensions;->c()Ljava/util/Enumeration;

    move-result-object v3

    .line 143
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 145
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 146
    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/x509/Extensions;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x509/Extension;

    move-result-object v4

    .line 148
    invoke-virtual {v4}, Lorg/spongycastle/asn1/x509/Extension;->a()Z

    move-result v4

    if-ne p1, v4, :cond_0

    .line 150
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 157
    :goto_1
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private a(ZLorg/spongycastle/asn1/x500/X500Name;)Lorg/spongycastle/asn1/x500/X500Name;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 88
    if-nez p1, :cond_1

    move-object p2, v0

    .line 114
    :cond_0
    :goto_0
    return-object p2

    .line 93
    :cond_1
    sget-object v1, Lorg/spongycastle/asn1/x509/X509Extension;->n:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v1

    .line 94
    if-eqz v1, :cond_0

    .line 101
    :try_start_0
    invoke-static {v1}, Lorg/spongycastle/x509/extension/X509ExtensionUtil;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/GeneralNames;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/GeneralNames;->c()[Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v2

    .line 103
    const/4 v1, 0x0

    :goto_1
    array-length v3, v2

    if-ge v1, v3, :cond_3

    .line 105
    aget-object v3, v2, v1

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/GeneralName;->c()I

    move-result v3

    const/4 v4, 0x4

    if-ne v3, v4, :cond_2

    .line 107
    aget-object v1, v2, v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x500/X500Name;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/X500Name;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p2

    goto :goto_0

    .line 103
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    move-object p2, v0

    .line 110
    goto :goto_0

    .line 114
    :catch_0
    move-exception v1

    move-object p2, v0

    goto :goto_0
.end method


# virtual methods
.method public getCertificateIssuer()Ljavax/security/auth/x500/X500Principal;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 120
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->b:Lorg/spongycastle/asn1/x500/X500Name;

    if-nez v1, :cond_0

    .line 130
    :goto_0
    return-object v0

    .line 126
    :cond_0
    :try_start_0
    new-instance v1, Ljavax/security/auth/x500/X500Principal;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->b:Lorg/spongycastle/asn1/x500/X500Name;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x500/X500Name;->b()[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljavax/security/auth/x500/X500Principal;-><init>([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    .line 130
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public getCriticalExtensionOIDs()Ljava/util/Set;
    .locals 1

    .prologue
    .line 162
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->a(Z)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getEncoded()[B
    .locals 2

    .prologue
    .line 214
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->a:Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;

    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 216
    :catch_0
    move-exception v0

    .line 218
    new-instance v1, Ljava/security/cert/CRLException;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CRLException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getExtensionValue(Ljava/lang/String;)[B
    .locals 4

    .prologue
    .line 172
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->a:Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;->e()Lorg/spongycastle/asn1/x509/Extensions;

    move-result-object v0

    .line 174
    if-eqz v0, :cond_0

    .line 176
    new-instance v1, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v1, p1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/x509/Extensions;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x509/Extension;

    move-result-object v0

    .line 178
    if-eqz v0, :cond_0

    .line 182
    :try_start_0
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Extension;->b()Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->b()[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 191
    :goto_0
    return-object v0

    .line 184
    :catch_0
    move-exception v0

    .line 186
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "error encoding "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 191
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getNonCriticalExtensionOIDs()Ljava/util/Set;
    .locals 1

    .prologue
    .line 167
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->a(Z)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getRevocationDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->a:Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;->d()Lorg/spongycastle/asn1/x509/Time;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Time;->d()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public getSerialNumber()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->a:Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;->c()Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public hasExtensions()Z
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->a:Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;->e()Lorg/spongycastle/asn1/x509/Extensions;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hasUnsupportedCriticalExtension()Z
    .locals 1

    .prologue
    .line 81
    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v0

    .line 83
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 200
    iget-boolean v0, p0, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->d:Z

    if-nez v0, :cond_0

    .line 202
    invoke-super {p0}, Ljava/security/cert/X509CRLEntry;->hashCode()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->c:I

    .line 203
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->d:Z

    .line 206
    :cond_0
    iget v0, p0, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->c:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .prologue
    .line 239
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 240
    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 242
    const-string v0, "      userCertificate: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 243
    const-string v0, "       revocationDate: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->getRevocationDate()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 244
    const-string v0, "       certificateIssuer: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->getCertificateIssuer()Ljavax/security/auth/x500/X500Principal;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 246
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CRLEntryObject;->a:Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;->e()Lorg/spongycastle/asn1/x509/Extensions;

    move-result-object v3

    .line 248
    if-eqz v3, :cond_3

    .line 250
    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/Extensions;->c()Ljava/util/Enumeration;

    move-result-object v4

    .line 251
    invoke-interface {v4}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 253
    const-string v0, "   crlEntryExtensions:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 255
    :goto_0
    invoke-interface {v4}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 257
    invoke-interface {v4}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 258
    invoke-virtual {v3, v0}, Lorg/spongycastle/asn1/x509/Extensions;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x509/Extension;

    move-result-object v5

    .line 259
    invoke-virtual {v5}, Lorg/spongycastle/asn1/x509/Extension;->b()Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 261
    invoke-virtual {v5}, Lorg/spongycastle/asn1/x509/Extension;->b()Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v6

    invoke-virtual {v6}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v6

    .line 262
    new-instance v7, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v7, v6}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    .line 263
    const-string v6, "                       critical("

    invoke-virtual {v1, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v6

    invoke-virtual {v5}, Lorg/spongycastle/asn1/x509/Extension;->a()Z

    move-result v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    move-result-object v5

    const-string v6, ") "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 266
    :try_start_0
    sget-object v5, Lorg/spongycastle/asn1/x509/X509Extension;->i:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v5}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 268
    invoke-virtual {v7}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v5

    invoke-static {v5}, Lorg/spongycastle/asn1/DEREnumerated;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Enumerated;

    move-result-object v5

    invoke-static {v5}, Lorg/spongycastle/asn1/x509/CRLReason;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/CRLReason;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 282
    :catch_0
    move-exception v5

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 283
    const-string v0, " value = *****"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 270
    :cond_0
    :try_start_1
    sget-object v5, Lorg/spongycastle/asn1/x509/X509Extension;->n:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v5}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 272
    const-string v5, "Certificate issuer: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v5

    invoke-virtual {v7}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v6

    invoke-static {v6}, Lorg/spongycastle/asn1/x509/GeneralNames;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto/16 :goto_0

    .line 276
    :cond_1
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 277
    const-string v5, " value = "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v5

    invoke-virtual {v7}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v6

    invoke-static {v6}, Lorg/spongycastle/asn1/util/ASN1Dump;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    .line 288
    :cond_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto/16 :goto_0

    .line 294
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
