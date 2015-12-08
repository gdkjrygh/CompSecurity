.class public Lorg/spongycastle/asn1/esf/SignaturePolicyIdentifier;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/esf/SignaturePolicyId;

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 36
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/asn1/esf/SignaturePolicyIdentifier;->b:Z

    .line 37
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 67
    iget-boolean v0, p0, Lorg/spongycastle/asn1/esf/SignaturePolicyIdentifier;->b:Z

    if-eqz v0, :cond_0

    .line 69
    new-instance v0, Lorg/spongycastle/asn1/DERNull;

    invoke-direct {v0}, Lorg/spongycastle/asn1/DERNull;-><init>()V

    .line 73
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/esf/SignaturePolicyIdentifier;->a:Lorg/spongycastle/asn1/esf/SignaturePolicyId;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/esf/SignaturePolicyId;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    goto :goto_0
.end method
