.class public Lorg/spongycastle/asn1/x509/RoleSyntax;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/x509/GeneralNames;

.field private b:Lorg/spongycastle/asn1/x509/GeneralName;


# direct methods
.method private c()[Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 172
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/RoleSyntax;->a:Lorg/spongycastle/asn1/x509/GeneralNames;

    if-nez v1, :cond_0

    .line 174
    new-array v0, v0, [Ljava/lang/String;

    .line 191
    :goto_0
    return-object v0

    .line 177
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/RoleSyntax;->a:Lorg/spongycastle/asn1/x509/GeneralNames;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/GeneralNames;->c()[Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v3

    .line 178
    array-length v1, v3

    new-array v2, v1, [Ljava/lang/String;

    move v1, v0

    .line 179
    :goto_1
    array-length v0, v3

    if-ge v1, v0, :cond_2

    .line 181
    aget-object v0, v3, v1

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    .line 182
    instance-of v4, v0, Lorg/spongycastle/asn1/ASN1String;

    if-eqz v4, :cond_1

    .line 184
    check-cast v0, Lorg/spongycastle/asn1/ASN1String;

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1String;->o_()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v1

    .line 179
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 188
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v1

    goto :goto_2

    :cond_2
    move-object v0, v2

    .line 191
    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 207
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 208
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/RoleSyntax;->a:Lorg/spongycastle/asn1/x509/GeneralNames;

    if-eqz v1, :cond_0

    .line 210
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/x509/RoleSyntax;->a:Lorg/spongycastle/asn1/x509/GeneralNames;

    invoke-direct {v1, v3, v3, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 212
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/x509/RoleSyntax;->b:Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-direct {v1, v4, v4, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 214
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 219
    new-instance v1, Ljava/lang/StringBuffer;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v0, "Name: "

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lorg/spongycastle/asn1/x509/RoleSyntax;->b:Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1String;

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1String;->o_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " - Auth: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 221
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/RoleSyntax;->a:Lorg/spongycastle/asn1/x509/GeneralNames;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/asn1/x509/RoleSyntax;->a:Lorg/spongycastle/asn1/x509/GeneralNames;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/GeneralNames;->c()[Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_1

    .line 223
    :cond_0
    const-string v0, "N/A"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 235
    :goto_0
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 227
    :cond_1
    invoke-direct {p0}, Lorg/spongycastle/asn1/x509/RoleSyntax;->c()[Ljava/lang/String;

    move-result-object v2

    .line 228
    const/16 v0, 0x5b

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move-result-object v0

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 229
    const/4 v0, 0x1

    :goto_1
    array-length v3, v2

    if-ge v0, v3, :cond_2

    .line 231
    const-string v3, ", "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    aget-object v4, v2, v0

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 229
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 233
    :cond_2
    const/16 v0, 0x5d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_0
.end method
