.class public Lorg/spongycastle/asn1/isismtt/x509/NamingAuthority;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# static fields
.field public static final a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;


# instance fields
.field private b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private c:Ljava/lang/String;

.field private d:Lorg/spongycastle/asn1/x500/DirectoryString;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 44
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/spongycastle/asn1/isismtt/ISISMTTObjectIdentifiers;->o:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".1"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    .line 229
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 230
    iget-object v1, p0, Lorg/spongycastle/asn1/isismtt/x509/NamingAuthority;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v1, :cond_0

    .line 232
    iget-object v1, p0, Lorg/spongycastle/asn1/isismtt/x509/NamingAuthority;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 234
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/isismtt/x509/NamingAuthority;->c:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 236
    new-instance v1, Lorg/spongycastle/asn1/DERIA5String;

    iget-object v2, p0, Lorg/spongycastle/asn1/isismtt/x509/NamingAuthority;->c:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/asn1/DERIA5String;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 238
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/isismtt/x509/NamingAuthority;->d:Lorg/spongycastle/asn1/x500/DirectoryString;

    if-eqz v1, :cond_2

    .line 240
    iget-object v1, p0, Lorg/spongycastle/asn1/isismtt/x509/NamingAuthority;->d:Lorg/spongycastle/asn1/x500/DirectoryString;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 242
    :cond_2
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
