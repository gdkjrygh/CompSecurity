.class final Lorg/spongycastle/asn1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Lorg/spongycastle/asn1/BERSequence;

.field static final b:Lorg/spongycastle/asn1/BERSet;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 5
    new-instance v0, Lorg/spongycastle/asn1/BERSequence;

    invoke-direct {v0}, Lorg/spongycastle/asn1/BERSequence;-><init>()V

    sput-object v0, Lorg/spongycastle/asn1/a;->a:Lorg/spongycastle/asn1/BERSequence;

    .line 6
    new-instance v0, Lorg/spongycastle/asn1/BERSet;

    invoke-direct {v0}, Lorg/spongycastle/asn1/BERSet;-><init>()V

    sput-object v0, Lorg/spongycastle/asn1/a;->b:Lorg/spongycastle/asn1/BERSet;

    return-void
.end method

.method static a(Lorg/spongycastle/asn1/ASN1EncodableVector;)Lorg/spongycastle/asn1/BERSequence;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1EncodableVector;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lorg/spongycastle/asn1/a;->a:Lorg/spongycastle/asn1/BERSequence;

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/spongycastle/asn1/BERSequence;

    invoke-direct {v0, p0}, Lorg/spongycastle/asn1/BERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    goto :goto_0
.end method
