.class public Lorg/spongycastle/asn1/x509/GeneralNames;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private final a:[Lorg/spongycastle/asn1/x509/GeneralName;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 3

    .prologue
    .line 57
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 58
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    new-array v0, v0, [Lorg/spongycastle/asn1/x509/GeneralName;

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/GeneralNames;->a:[Lorg/spongycastle/asn1/x509/GeneralName;

    .line 60
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 62
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/GeneralNames;->a:[Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/x509/GeneralName;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v2

    aput-object v2, v1, v0

    .line 60
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 64
    :cond_0
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/asn1/x509/GeneralName;)V
    .locals 2

    .prologue
    .line 44
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 45
    const/4 v0, 0x1

    new-array v0, v0, [Lorg/spongycastle/asn1/x509/GeneralName;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/GeneralNames;->a:[Lorg/spongycastle/asn1/x509/GeneralName;

    .line 46
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralNames;
    .locals 2

    .prologue
    .line 17
    instance-of v0, p0, Lorg/spongycastle/asn1/x509/GeneralNames;

    if-eqz v0, :cond_0

    .line 19
    check-cast p0, Lorg/spongycastle/asn1/x509/GeneralNames;

    .line 27
    :goto_0
    return-object p0

    .line 22
    :cond_0
    if-eqz p0, :cond_1

    .line 24
    new-instance v0, Lorg/spongycastle/asn1/x509/GeneralNames;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/GeneralNames;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 27
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/GeneralNames;
    .locals 1

    .prologue
    .line 34
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/GeneralNames;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 83
    new-instance v0, Lorg/spongycastle/asn1/DERSequence;

    iget-object v1, p0, Lorg/spongycastle/asn1/x509/GeneralNames;->a:[Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERSequence;-><init>([Lorg/spongycastle/asn1/ASN1Encodable;)V

    return-object v0
.end method

.method public final c()[Lorg/spongycastle/asn1/x509/GeneralName;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 68
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/GeneralNames;->a:[Lorg/spongycastle/asn1/x509/GeneralName;

    array-length v0, v0

    new-array v0, v0, [Lorg/spongycastle/asn1/x509/GeneralName;

    .line 70
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/GeneralNames;->a:[Lorg/spongycastle/asn1/x509/GeneralName;

    iget-object v2, p0, Lorg/spongycastle/asn1/x509/GeneralNames;->a:[Lorg/spongycastle/asn1/x509/GeneralName;

    array-length v2, v2

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 72
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 88
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 89
    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 91
    const-string v0, "GeneralNames:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 92
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 94
    const/4 v0, 0x0

    :goto_0
    iget-object v3, p0, Lorg/spongycastle/asn1/x509/GeneralNames;->a:[Lorg/spongycastle/asn1/x509/GeneralName;

    array-length v3, v3

    if-eq v0, v3, :cond_0

    .line 96
    const-string v3, "    "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 97
    iget-object v3, p0, Lorg/spongycastle/asn1/x509/GeneralNames;->a:[Lorg/spongycastle/asn1/x509/GeneralName;

    aget-object v3, v3, v0

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 94
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
