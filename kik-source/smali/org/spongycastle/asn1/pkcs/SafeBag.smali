.class public Lorg/spongycastle/asn1/pkcs/SafeBag;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private b:Lorg/spongycastle/asn1/ASN1Encodable;

.field private c:Lorg/spongycastle/asn1/ASN1Set;


# direct methods
.method public constructor <init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;Lorg/spongycastle/asn1/ASN1Set;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 35
    iput-object p1, p0, Lorg/spongycastle/asn1/pkcs/SafeBag;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 36
    iput-object p2, p0, Lorg/spongycastle/asn1/pkcs/SafeBag;->b:Lorg/spongycastle/asn1/ASN1Encodable;

    .line 37
    iput-object p3, p0, Lorg/spongycastle/asn1/pkcs/SafeBag;->c:Lorg/spongycastle/asn1/ASN1Set;

    .line 38
    return-void
.end method

.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 2

    .prologue
    .line 58
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 59
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/SafeBag;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 60
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/SafeBag;->b:Lorg/spongycastle/asn1/ASN1Encodable;

    .line 61
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 63
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Set;

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/SafeBag;->c:Lorg/spongycastle/asn1/ASN1Set;

    .line 65
    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/SafeBag;
    .locals 2

    .prologue
    .line 43
    instance-of v0, p0, Lorg/spongycastle/asn1/pkcs/SafeBag;

    if-eqz v0, :cond_0

    .line 45
    check-cast p0, Lorg/spongycastle/asn1/pkcs/SafeBag;

    .line 53
    :goto_0
    return-object p0

    .line 48
    :cond_0
    if-eqz p0, :cond_1

    .line 50
    new-instance v0, Lorg/spongycastle/asn1/pkcs/SafeBag;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/pkcs/SafeBag;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 53
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    .line 84
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 86
    iget-object v1, p0, Lorg/spongycastle/asn1/pkcs/SafeBag;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 87
    new-instance v1, Lorg/spongycastle/asn1/DLTaggedObject;

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v4, p0, Lorg/spongycastle/asn1/pkcs/SafeBag;->b:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-direct {v1, v2, v3, v4}, Lorg/spongycastle/asn1/DLTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 89
    iget-object v1, p0, Lorg/spongycastle/asn1/pkcs/SafeBag;->c:Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v1, :cond_0

    .line 91
    iget-object v1, p0, Lorg/spongycastle/asn1/pkcs/SafeBag;->c:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 94
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/DLSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DLSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lorg/spongycastle/asn1/pkcs/SafeBag;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lorg/spongycastle/asn1/pkcs/SafeBag;->b:Lorg/spongycastle/asn1/ASN1Encodable;

    return-object v0
.end method

.method public final e()Lorg/spongycastle/asn1/ASN1Set;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lorg/spongycastle/asn1/pkcs/SafeBag;->c:Lorg/spongycastle/asn1/ASN1Set;

    return-object v0
.end method
