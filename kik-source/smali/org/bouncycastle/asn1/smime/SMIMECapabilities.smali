.class public Lorg/bouncycastle/asn1/smime/SMIMECapabilities;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# static fields
.field public static final a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final d:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final e:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final f:Lorg/bouncycastle/asn1/DERObjectIdentifier;


# instance fields
.field private g:Lorg/bouncycastle/asn1/ASN1Sequence;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->ao:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/smime/SMIMECapabilities;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->ap:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/smime/SMIMECapabilities;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->aq:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/smime/SMIMECapabilities;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "1.3.14.3.2.7"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/smime/SMIMECapabilities;->d:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->B:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/smime/SMIMECapabilities;->e:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->C:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/smime/SMIMECapabilities;->f:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/smime/SMIMECapabilities;->g:Lorg/bouncycastle/asn1/ASN1Sequence;

    return-object v0
.end method
