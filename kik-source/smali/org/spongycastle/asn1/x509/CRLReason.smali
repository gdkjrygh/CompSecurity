.class public Lorg/spongycastle/asn1/x509/CRLReason;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# static fields
.field private static final a:[Ljava/lang/String;

.field private static final b:Ljava/util/Hashtable;


# instance fields
.field private c:Lorg/spongycastle/asn1/ASN1Enumerated;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 83
    const/16 v0, 0xb

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "unspecified"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "keyCompromise"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "cACompromise"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "affiliationChanged"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "superseded"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "cessationOfOperation"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "certificateHold"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "unknown"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "removeFromCRL"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "privilegeWithdrawn"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "aACompromise"

    aput-object v2, v0, v1

    sput-object v0, Lorg/spongycastle/asn1/x509/CRLReason;->a:[Ljava/lang/String;

    .line 90
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/spongycastle/asn1/x509/CRLReason;->b:Ljava/util/Hashtable;

    return-void
.end method

.method private constructor <init>(I)V
    .locals 1

    .prologue
    .line 110
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 111
    new-instance v0, Lorg/spongycastle/asn1/ASN1Enumerated;

    invoke-direct {v0, p1}, Lorg/spongycastle/asn1/ASN1Enumerated;-><init>(I)V

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/CRLReason;->c:Lorg/spongycastle/asn1/ASN1Enumerated;

    .line 112
    return-void
.end method

.method public static a(I)Lorg/spongycastle/asn1/x509/CRLReason;
    .locals 3

    .prologue
    .line 141
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 143
    sget-object v1, Lorg/spongycastle/asn1/x509/CRLReason;->b:Ljava/util/Hashtable;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 145
    sget-object v1, Lorg/spongycastle/asn1/x509/CRLReason;->b:Ljava/util/Hashtable;

    new-instance v2, Lorg/spongycastle/asn1/x509/CRLReason;

    invoke-direct {v2, p0}, Lorg/spongycastle/asn1/x509/CRLReason;-><init>(I)V

    invoke-virtual {v1, v0, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    :cond_0
    sget-object v1, Lorg/spongycastle/asn1/x509/CRLReason;->b:Ljava/util/Hashtable;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/x509/CRLReason;

    return-object v0
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/CRLReason;
    .locals 1

    .prologue
    .line 96
    instance-of v0, p0, Lorg/spongycastle/asn1/x509/CRLReason;

    if-eqz v0, :cond_0

    .line 98
    check-cast p0, Lorg/spongycastle/asn1/x509/CRLReason;

    .line 105
    :goto_0
    return-object p0

    .line 100
    :cond_0
    if-eqz p0, :cond_1

    .line 102
    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Enumerated;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Enumerated;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Enumerated;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/CRLReason;->a(I)Lorg/spongycastle/asn1/x509/CRLReason;

    move-result-object p0

    goto :goto_0

    .line 105
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/CRLReason;->c:Lorg/spongycastle/asn1/ASN1Enumerated;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 117
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/CRLReason;->c:Lorg/spongycastle/asn1/ASN1Enumerated;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Enumerated;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    .line 118
    if-ltz v0, :cond_0

    const/16 v1, 0xa

    if-le v0, v1, :cond_1

    .line 120
    :cond_0
    const-string v0, "invalid"

    .line 126
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CRLReason: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 124
    :cond_1
    sget-object v1, Lorg/spongycastle/asn1/x509/CRLReason;->a:[Ljava/lang/String;

    aget-object v0, v1, v0

    goto :goto_0
.end method
