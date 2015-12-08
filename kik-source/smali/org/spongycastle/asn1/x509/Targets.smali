.class public Lorg/spongycastle/asn1/x509/Targets;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Sequence;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 0

    .prologue
    .line 70
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 71
    iput-object p1, p0, Lorg/spongycastle/asn1/x509/Targets;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    .line 72
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/Targets;
    .locals 2

    .prologue
    .line 50
    instance-of v0, p0, Lorg/spongycastle/asn1/x509/Targets;

    if-eqz v0, :cond_0

    .line 52
    check-cast p0, Lorg/spongycastle/asn1/x509/Targets;

    .line 59
    :goto_0
    return-object p0

    .line 54
    :cond_0
    if-eqz p0, :cond_1

    .line 56
    new-instance v0, Lorg/spongycastle/asn1/x509/Targets;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/Targets;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 59
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Targets;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    return-object v0
.end method

.method public final c()[Lorg/spongycastle/asn1/x509/Target;
    .locals 5

    .prologue
    .line 97
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Targets;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    new-array v2, v0, [Lorg/spongycastle/asn1/x509/Target;

    .line 98
    const/4 v0, 0x0

    .line 99
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/Targets;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 101
    add-int/lit8 v1, v0, 0x1

    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lorg/spongycastle/asn1/x509/Target;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/Target;

    move-result-object v4

    aput-object v4, v2, v0

    move v0, v1

    goto :goto_0

    .line 103
    :cond_0
    return-object v2
.end method
