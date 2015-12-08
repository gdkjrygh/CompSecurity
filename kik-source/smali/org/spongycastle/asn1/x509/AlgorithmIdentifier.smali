.class public Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private b:Lorg/spongycastle/asn1/ASN1Encodable;

.field private c:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 67
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->c:Z

    .line 68
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v0, p1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 69
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V
    .locals 1

    .prologue
    .line 57
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->c:Z

    .line 58
    iput-object p1, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 59
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 1

    .prologue
    .line 98
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->c:Z

    .line 99
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->c:Z

    .line 100
    iput-object p1, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 101
    iput-object p2, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->b:Lorg/spongycastle/asn1/ASN1Encodable;

    .line 102
    return-void
.end method

.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 106
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 20
    iput-boolean v1, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->c:Z

    .line 107
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    if-le v0, v3, :cond_1

    .line 109
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

    .line 113
    :cond_1
    invoke-virtual {p1, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 115
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    if-ne v0, v3, :cond_2

    .line 117
    iput-boolean v2, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->c:Z

    .line 118
    invoke-virtual {p1, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->b:Lorg/spongycastle/asn1/ASN1Encodable;

    .line 124
    :goto_0
    return-void

    .line 122
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->b:Lorg/spongycastle/asn1/ASN1Encodable;

    goto :goto_0
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;
    .locals 3

    .prologue
    .line 32
    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    if-eqz v0, :cond_1

    .line 34
    :cond_0
    check-cast p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    .line 49
    :goto_0
    return-object p0

    .line 37
    :cond_1
    instance-of v0, p0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v0, :cond_2

    .line 39
    new-instance v0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    check-cast p0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v0, p0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    move-object p0, v0

    goto :goto_0

    .line 42
    :cond_2
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 44
    new-instance v0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    check-cast p0, Ljava/lang/String;

    invoke-direct {v0, p0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Ljava/lang/String;)V

    move-object p0, v0

    goto :goto_0

    .line 47
    :cond_3
    instance-of v0, p0, Lorg/spongycastle/asn1/ASN1Sequence;

    if-nez v0, :cond_4

    instance-of v0, p0, Lorg/spongycastle/asn1/ASN1SequenceParser;

    if-eqz v0, :cond_5

    .line 49
    :cond_4
    new-instance v0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 52
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown object in factory: "

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

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 155
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 157
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 159
    iget-boolean v1, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->c:Z

    if-eqz v1, :cond_0

    .line 161
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->b:Lorg/spongycastle/asn1/ASN1Encodable;

    if-eqz v1, :cond_1

    .line 163
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->b:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 171
    :cond_0
    :goto_0
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1

    .line 167
    :cond_1
    sget-object v1, Lorg/spongycastle/asn1/DERNull;->a:Lorg/spongycastle/asn1/DERNull;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0
.end method

.method public c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 2

    .prologue
    .line 128
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iget-object v1, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final e()Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->b:Lorg/spongycastle/asn1/ASN1Encodable;

    return-object v0
.end method
