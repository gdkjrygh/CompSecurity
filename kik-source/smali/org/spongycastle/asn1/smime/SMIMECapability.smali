.class public Lorg/spongycastle/asn1/smime/SMIMECapability;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# static fields
.field public static final a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final i:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;


# instance fields
.field private j:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private k:Lorg/spongycastle/asn1/ASN1Encodable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 19
    sget-object v0, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->ao:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/smime/SMIMECapability;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 20
    sget-object v0, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->ap:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/smime/SMIMECapability;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 21
    sget-object v0, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->aq:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/smime/SMIMECapability;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 26
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.14.3.2.7"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/smime/SMIMECapability;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 27
    sget-object v0, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->B:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/smime/SMIMECapability;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 28
    sget-object v0, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->C:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/smime/SMIMECapability;->f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 29
    sget-object v0, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/smime/SMIMECapability;->g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 30
    sget-object v0, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->o:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/smime/SMIMECapability;->h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 31
    sget-object v0, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->v:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/smime/SMIMECapability;->i:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 92
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 94
    iget-object v1, p0, Lorg/spongycastle/asn1/smime/SMIMECapability;->j:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 96
    iget-object v1, p0, Lorg/spongycastle/asn1/smime/SMIMECapability;->k:Lorg/spongycastle/asn1/ASN1Encodable;

    if-eqz v1, :cond_0

    .line 98
    iget-object v1, p0, Lorg/spongycastle/asn1/smime/SMIMECapability;->k:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 101
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
