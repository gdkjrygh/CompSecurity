.class public Lorg/spongycastle/asn1/pkcs/ContentInfo;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;


# instance fields
.field private bA:Lorg/spongycastle/asn1/ASN1Encodable;

.field private bB:Z

.field private bz:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;


# direct methods
.method public constructor <init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 1

    .prologue
    .line 58
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 22
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/asn1/pkcs/ContentInfo;->bB:Z

    .line 59
    iput-object p1, p0, Lorg/spongycastle/asn1/pkcs/ContentInfo;->bz:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 60
    iput-object p2, p0, Lorg/spongycastle/asn1/pkcs/ContentInfo;->bA:Lorg/spongycastle/asn1/ASN1Encodable;

    .line 61
    return-void
.end method

.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 2

    .prologue
    .line 42
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 22
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/asn1/pkcs/ContentInfo;->bB:Z

    .line 43
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v1

    .line 45
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/ContentInfo;->bz:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 47
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/ContentInfo;->bA:Lorg/spongycastle/asn1/ASN1Encodable;

    .line 52
    :cond_0
    instance-of v0, p1, Lorg/spongycastle/asn1/BERSequence;

    iput-boolean v0, p0, Lorg/spongycastle/asn1/pkcs/ContentInfo;->bB:Z

    .line 53
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/ContentInfo;
    .locals 2

    .prologue
    .line 27
    instance-of v0, p0, Lorg/spongycastle/asn1/pkcs/ContentInfo;

    if-eqz v0, :cond_0

    .line 29
    check-cast p0, Lorg/spongycastle/asn1/pkcs/ContentInfo;

    .line 37
    :goto_0
    return-object p0

    .line 32
    :cond_0
    if-eqz p0, :cond_1

    .line 34
    new-instance v0, Lorg/spongycastle/asn1/pkcs/ContentInfo;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/pkcs/ContentInfo;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 37
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    .line 84
    new-instance v1, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 86
    iget-object v0, p0, Lorg/spongycastle/asn1/pkcs/ContentInfo;->bz:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 88
    iget-object v0, p0, Lorg/spongycastle/asn1/pkcs/ContentInfo;->bA:Lorg/spongycastle/asn1/ASN1Encodable;

    if-eqz v0, :cond_0

    .line 90
    new-instance v0, Lorg/spongycastle/asn1/BERTaggedObject;

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v4, p0, Lorg/spongycastle/asn1/pkcs/ContentInfo;->bA:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-direct {v0, v2, v3, v4}, Lorg/spongycastle/asn1/BERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 93
    :cond_0
    iget-boolean v0, p0, Lorg/spongycastle/asn1/pkcs/ContentInfo;->bB:Z

    if-eqz v0, :cond_1

    .line 95
    new-instance v0, Lorg/spongycastle/asn1/BERSequence;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/BERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    .line 99
    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Lorg/spongycastle/asn1/DLSequence;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DLSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    goto :goto_0
.end method

.method public final c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lorg/spongycastle/asn1/pkcs/ContentInfo;->bz:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lorg/spongycastle/asn1/pkcs/ContentInfo;->bA:Lorg/spongycastle/asn1/ASN1Encodable;

    return-object v0
.end method
