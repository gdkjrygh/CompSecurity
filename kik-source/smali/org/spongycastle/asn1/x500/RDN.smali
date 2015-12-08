.class public Lorg/spongycastle/asn1/x500/RDN;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Set;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Set;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 19
    iput-object p1, p0, Lorg/spongycastle/asn1/x500/RDN;->a:Lorg/spongycastle/asn1/ASN1Set;

    .line 20
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/RDN;
    .locals 2

    .prologue
    .line 24
    instance-of v0, p0, Lorg/spongycastle/asn1/x500/RDN;

    if-eqz v0, :cond_0

    .line 26
    check-cast p0, Lorg/spongycastle/asn1/x500/RDN;

    .line 33
    :goto_0
    return-object p0

    .line 28
    :cond_0
    if-eqz p0, :cond_1

    .line 30
    new-instance v0, Lorg/spongycastle/asn1/x500/RDN;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Set;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Set;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x500/RDN;-><init>(Lorg/spongycastle/asn1/ASN1Set;)V

    move-object p0, v0

    goto :goto_0

    .line 33
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lorg/spongycastle/asn1/x500/RDN;->a:Lorg/spongycastle/asn1/ASN1Set;

    return-object v0
.end method

.method public final c()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 69
    iget-object v1, p0, Lorg/spongycastle/asn1/x500/RDN;->a:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Set;->d()I

    move-result v1

    if-le v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;
    .locals 2

    .prologue
    .line 84
    iget-object v0, p0, Lorg/spongycastle/asn1/x500/RDN;->a:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Set;->d()I

    move-result v0

    if-nez v0, :cond_0

    .line 86
    const/4 v0, 0x0

    .line 89
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/x500/RDN;->a:Lorg/spongycastle/asn1/ASN1Set;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1Set;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v0

    goto :goto_0
.end method

.method public final e()[Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;
    .locals 3

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/asn1/x500/RDN;->a:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Set;->d()I

    move-result v0

    new-array v1, v0, [Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    .line 96
    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-eq v0, v2, :cond_0

    .line 98
    iget-object v2, p0, Lorg/spongycastle/asn1/x500/RDN;->a:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/ASN1Set;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v2

    aput-object v2, v1, v0

    .line 96
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 101
    :cond_0
    return-object v1
.end method
