.class public interface abstract Lorg/spongycastle/asn1/x509/qualified/RFC3739QCObjectIdentifiers;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final Q_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final R_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final S_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 10
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.7.11"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    .line 12
    sput-object v0, Lorg/spongycastle/asn1/x509/qualified/RFC3739QCObjectIdentifiers;->Q_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/asn1/x509/qualified/RFC3739QCObjectIdentifiers;->R_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 13
    sget-object v0, Lorg/spongycastle/asn1/x509/qualified/RFC3739QCObjectIdentifiers;->Q_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/asn1/x509/qualified/RFC3739QCObjectIdentifiers;->S_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-void
.end method
