.class public Lorg/spongycastle/asn1/x500/X500Name;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1Choice;


# static fields
.field private static a:Lorg/spongycastle/asn1/x500/X500NameStyle;


# instance fields
.field private b:Z

.field private c:I

.field private d:Lorg/spongycastle/asn1/x500/X500NameStyle;

.field private e:[Lorg/spongycastle/asn1/x500/RDN;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->a:Lorg/spongycastle/asn1/x500/X500NameStyle;

    sput-object v0, Lorg/spongycastle/asn1/x500/X500Name;->a:Lorg/spongycastle/asn1/x500/X500NameStyle;

    return-void
.end method

.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 1

    .prologue
    .line 101
    sget-object v0, Lorg/spongycastle/asn1/x500/X500Name;->a:Lorg/spongycastle/asn1/x500/X500NameStyle;

    invoke-direct {p0, v0, p1}, Lorg/spongycastle/asn1/x500/X500Name;-><init>(Lorg/spongycastle/asn1/x500/X500NameStyle;Lorg/spongycastle/asn1/ASN1Sequence;)V

    .line 102
    return-void
.end method

.method private constructor <init>(Lorg/spongycastle/asn1/x500/X500NameStyle;Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 5

    .prologue
    .line 107
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 108
    iput-object p1, p0, Lorg/spongycastle/asn1/x500/X500Name;->d:Lorg/spongycastle/asn1/x500/X500NameStyle;

    .line 109
    invoke-virtual {p2}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    new-array v0, v0, [Lorg/spongycastle/asn1/x500/RDN;

    iput-object v0, p0, Lorg/spongycastle/asn1/x500/X500Name;->e:[Lorg/spongycastle/asn1/x500/RDN;

    .line 111
    const/4 v0, 0x0

    .line 113
    invoke-virtual {p2}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 115
    iget-object v3, p0, Lorg/spongycastle/asn1/x500/X500Name;->e:[Lorg/spongycastle/asn1/x500/RDN;

    add-int/lit8 v1, v0, 0x1

    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lorg/spongycastle/asn1/x500/RDN;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/RDN;

    move-result-object v4

    aput-object v4, v3, v0

    move v0, v1

    goto :goto_0

    .line 117
    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/X500Name;
    .locals 2

    .prologue
    .line 65
    instance-of v0, p0, Lorg/spongycastle/asn1/x500/X500Name;

    if-eqz v0, :cond_0

    .line 67
    check-cast p0, Lorg/spongycastle/asn1/x500/X500Name;

    .line 74
    :goto_0
    return-object p0

    .line 69
    :cond_0
    if-eqz p0, :cond_1

    .line 71
    new-instance v0, Lorg/spongycastle/asn1/x500/X500Name;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x500/X500Name;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 74
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x500/X500Name;
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x500/X500Name;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 248
    new-instance v0, Lorg/spongycastle/asn1/DERSequence;

    iget-object v1, p0, Lorg/spongycastle/asn1/x500/X500Name;->e:[Lorg/spongycastle/asn1/x500/RDN;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERSequence;-><init>([Lorg/spongycastle/asn1/ASN1Encodable;)V

    return-object v0
.end method

.method public final c()[Lorg/spongycastle/asn1/x500/RDN;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 155
    iget-object v0, p0, Lorg/spongycastle/asn1/x500/X500Name;->e:[Lorg/spongycastle/asn1/x500/RDN;

    array-length v0, v0

    new-array v0, v0, [Lorg/spongycastle/asn1/x500/RDN;

    .line 157
    iget-object v1, p0, Lorg/spongycastle/asn1/x500/X500Name;->e:[Lorg/spongycastle/asn1/x500/RDN;

    array-length v2, v0

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 159
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 270
    if-ne p1, p0, :cond_0

    move v0, v1

    .line 293
    :goto_0
    return v0

    .line 275
    :cond_0
    instance-of v0, p1, Lorg/spongycastle/asn1/x500/X500Name;

    if-nez v0, :cond_1

    instance-of v0, p1, Lorg/spongycastle/asn1/ASN1Sequence;

    if-nez v0, :cond_1

    move v0, v2

    .line 277
    goto :goto_0

    :cond_1
    move-object v0, p1

    .line 280
    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 282
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x500/X500Name;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v3

    invoke-virtual {v3, v0}, Lorg/spongycastle/asn1/ASN1Primitive;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    .line 284
    goto :goto_0

    .line 289
    :cond_2
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/asn1/x500/X500Name;->d:Lorg/spongycastle/asn1/x500/X500NameStyle;

    new-instance v1, Lorg/spongycastle/asn1/x500/X500Name;

    check-cast p1, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {p1}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v3

    invoke-static {v3}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v3

    invoke-direct {v1, v3}, Lorg/spongycastle/asn1/x500/X500Name;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    invoke-interface {v0, p0, v1}, Lorg/spongycastle/asn1/x500/X500NameStyle;->a(Lorg/spongycastle/asn1/x500/X500Name;Lorg/spongycastle/asn1/x500/X500Name;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 293
    :catch_0
    move-exception v0

    move v0, v2

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 253
    iget-boolean v0, p0, Lorg/spongycastle/asn1/x500/X500Name;->b:Z

    if-eqz v0, :cond_0

    .line 255
    iget v0, p0, Lorg/spongycastle/asn1/x500/X500Name;->c:I

    .line 262
    :goto_0
    return v0

    .line 258
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/asn1/x500/X500Name;->b:Z

    .line 260
    iget-object v0, p0, Lorg/spongycastle/asn1/x500/X500Name;->d:Lorg/spongycastle/asn1/x500/X500NameStyle;

    invoke-interface {v0, p0}, Lorg/spongycastle/asn1/x500/X500NameStyle;->a(Lorg/spongycastle/asn1/x500/X500Name;)I

    move-result v0

    iput v0, p0, Lorg/spongycastle/asn1/x500/X500Name;->c:I

    .line 262
    iget v0, p0, Lorg/spongycastle/asn1/x500/X500Name;->c:I

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 299
    iget-object v0, p0, Lorg/spongycastle/asn1/x500/X500Name;->d:Lorg/spongycastle/asn1/x500/X500NameStyle;

    invoke-interface {v0, p0}, Lorg/spongycastle/asn1/x500/X500NameStyle;->b(Lorg/spongycastle/asn1/x500/X500Name;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
