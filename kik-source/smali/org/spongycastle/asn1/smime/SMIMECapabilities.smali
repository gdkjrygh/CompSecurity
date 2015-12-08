.class public Lorg/spongycastle/asn1/smime/SMIMECapabilities;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# static fields
.field public static final a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;


# instance fields
.field private g:Lorg/spongycastle/asn1/ASN1Sequence;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 22
    sget-object v0, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->ao:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/smime/SMIMECapabilities;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 23
    sget-object v0, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->ap:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/smime/SMIMECapabilities;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 24
    sget-object v0, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->aq:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/smime/SMIMECapabilities;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 29
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.14.3.2.7"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/smime/SMIMECapabilities;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 30
    sget-object v0, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->B:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/smime/SMIMECapabilities;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 31
    sget-object v0, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->C:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/smime/SMIMECapabilities;->f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lorg/spongycastle/asn1/smime/SMIMECapabilities;->g:Lorg/spongycastle/asn1/ASN1Sequence;

    return-object v0
.end method
