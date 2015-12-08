.class public Lorg/spongycastle/asn1/cmp/RevRepContentBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1EncodableVector;

.field private b:Lorg/spongycastle/asn1/ASN1EncodableVector;

.field private c:Lorg/spongycastle/asn1/ASN1EncodableVector;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/asn1/cmp/RevRepContentBuilder;->a:Lorg/spongycastle/asn1/ASN1EncodableVector;

    .line 12
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/asn1/cmp/RevRepContentBuilder;->b:Lorg/spongycastle/asn1/ASN1EncodableVector;

    .line 13
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/asn1/cmp/RevRepContentBuilder;->c:Lorg/spongycastle/asn1/ASN1EncodableVector;

    return-void
.end method
