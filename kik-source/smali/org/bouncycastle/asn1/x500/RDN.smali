.class public Lorg/bouncycastle/asn1/x500/RDN;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field private a:Lorg/bouncycastle/asn1/ASN1Set;


# direct methods
.method private constructor <init>(Lorg/bouncycastle/asn1/ASN1Set;)V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/x500/RDN;->a:Lorg/bouncycastle/asn1/ASN1Set;

    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x500/RDN;
    .locals 2

    instance-of v0, p0, Lorg/bouncycastle/asn1/x500/RDN;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/bouncycastle/asn1/x500/RDN;

    :goto_0
    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, Lorg/bouncycastle/asn1/x500/RDN;

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1Set;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x500/RDN;-><init>(Lorg/bouncycastle/asn1/ASN1Set;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x500/RDN;->a:Lorg/bouncycastle/asn1/ASN1Set;

    return-object v0
.end method

.method public final e()Z
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, Lorg/bouncycastle/asn1/x500/RDN;->a:Lorg/bouncycastle/asn1/ASN1Set;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Set;->f()I

    move-result v1

    if-le v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f()Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/asn1/x500/RDN;->a:Lorg/bouncycastle/asn1/ASN1Set;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Set;->f()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/x500/RDN;->a:Lorg/bouncycastle/asn1/ASN1Set;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1Set;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v0

    goto :goto_0
.end method

.method public final g()[Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/asn1/x500/RDN;->a:Lorg/bouncycastle/asn1/ASN1Set;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Set;->f()I

    move-result v0

    new-array v1, v0, [Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;

    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-eq v0, v2, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/asn1/x500/RDN;->a:Lorg/bouncycastle/asn1/ASN1Set;

    invoke-virtual {v2, v0}, Lorg/bouncycastle/asn1/ASN1Set;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v2

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
