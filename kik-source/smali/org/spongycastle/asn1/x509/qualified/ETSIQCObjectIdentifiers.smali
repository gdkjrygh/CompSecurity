.class public interface abstract Lorg/spongycastle/asn1/x509/qualified/ETSIQCObjectIdentifiers;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 10
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "0.4.0.1862.1"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    .line 12
    sput-object v0, Lorg/spongycastle/asn1/x509/qualified/ETSIQCObjectIdentifiers;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/asn1/x509/qualified/ETSIQCObjectIdentifiers;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 13
    sget-object v0, Lorg/spongycastle/asn1/x509/qualified/ETSIQCObjectIdentifiers;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/asn1/x509/qualified/ETSIQCObjectIdentifiers;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 14
    sget-object v0, Lorg/spongycastle/asn1/x509/qualified/ETSIQCObjectIdentifiers;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "3"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/asn1/x509/qualified/ETSIQCObjectIdentifiers;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 15
    sget-object v0, Lorg/spongycastle/asn1/x509/qualified/ETSIQCObjectIdentifiers;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "4"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/asn1/x509/qualified/ETSIQCObjectIdentifiers;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-void
.end method
