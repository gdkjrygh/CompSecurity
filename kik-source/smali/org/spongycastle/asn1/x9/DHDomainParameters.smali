.class public Lorg/spongycastle/asn1/x9/DHDomainParameters;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Integer;

.field private b:Lorg/spongycastle/asn1/ASN1Integer;

.field private c:Lorg/spongycastle/asn1/ASN1Integer;

.field private d:Lorg/spongycastle/asn1/ASN1Integer;

.field private e:Lorg/spongycastle/asn1/x9/DHValidationParms;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 3

    .prologue
    .line 65
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 66
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    const/4 v1, 0x5

    if-le v0, v1, :cond_1

    .line 68
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad sequence size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 71
    :cond_1
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v1

    .line 72
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Integer;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/DHDomainParameters;->a:Lorg/spongycastle/asn1/ASN1Integer;

    .line 73
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Integer;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/DHDomainParameters;->b:Lorg/spongycastle/asn1/ASN1Integer;

    .line 74
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Integer;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/DHDomainParameters;->c:Lorg/spongycastle/asn1/ASN1Integer;

    .line 76
    invoke-static {v1}, Lorg/spongycastle/asn1/x9/DHDomainParameters;->a(Ljava/util/Enumeration;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    .line 78
    if-eqz v0, :cond_2

    instance-of v2, v0, Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v2, :cond_2

    .line 80
    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Integer;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/DHDomainParameters;->d:Lorg/spongycastle/asn1/ASN1Integer;

    .line 81
    invoke-static {v1}, Lorg/spongycastle/asn1/x9/DHDomainParameters;->a(Ljava/util/Enumeration;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    .line 84
    :cond_2
    if-eqz v0, :cond_3

    .line 86
    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x9/DHValidationParms;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x9/DHValidationParms;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/DHDomainParameters;->e:Lorg/spongycastle/asn1/x9/DHValidationParms;

    .line 88
    :cond_3
    return-void
.end method

.method private static a(Ljava/util/Enumeration;)Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 1

    .prologue
    .line 92
    invoke-interface {p0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x9/DHDomainParameters;
    .locals 3

    .prologue
    .line 27
    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/spongycastle/asn1/x9/DHDomainParameters;

    if-eqz v0, :cond_1

    .line 29
    :cond_0
    check-cast p0, Lorg/spongycastle/asn1/x9/DHDomainParameters;

    .line 34
    :goto_0
    return-object p0

    .line 32
    :cond_1
    instance-of v0, p0, Lorg/spongycastle/asn1/ASN1Sequence;

    if-eqz v0, :cond_2

    .line 34
    new-instance v0, Lorg/spongycastle/asn1/x9/DHDomainParameters;

    check-cast p0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v0, p0}, Lorg/spongycastle/asn1/x9/DHDomainParameters;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 37
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid DHDomainParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 122
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 123
    iget-object v1, p0, Lorg/spongycastle/asn1/x9/DHDomainParameters;->a:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 124
    iget-object v1, p0, Lorg/spongycastle/asn1/x9/DHDomainParameters;->b:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 125
    iget-object v1, p0, Lorg/spongycastle/asn1/x9/DHDomainParameters;->c:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 127
    iget-object v1, p0, Lorg/spongycastle/asn1/x9/DHDomainParameters;->d:Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v1, :cond_0

    .line 129
    iget-object v1, p0, Lorg/spongycastle/asn1/x9/DHDomainParameters;->d:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 132
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/x9/DHDomainParameters;->e:Lorg/spongycastle/asn1/x9/DHValidationParms;

    if-eqz v1, :cond_1

    .line 134
    iget-object v1, p0, Lorg/spongycastle/asn1/x9/DHDomainParameters;->e:Lorg/spongycastle/asn1/x9/DHValidationParms;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 137
    :cond_1
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/asn1/ASN1Integer;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/DHDomainParameters;->a:Lorg/spongycastle/asn1/ASN1Integer;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/ASN1Integer;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/DHDomainParameters;->b:Lorg/spongycastle/asn1/ASN1Integer;

    return-object v0
.end method
