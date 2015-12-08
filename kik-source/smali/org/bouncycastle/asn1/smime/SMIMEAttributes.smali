.class public interface abstract Lorg/bouncycastle/asn1/smime/SMIMEAttributes;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final b:Lorg/bouncycastle/asn1/DERObjectIdentifier;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->ae:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/smime/SMIMEAttributes;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->aJ:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/smime/SMIMEAttributes;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    return-void
.end method
