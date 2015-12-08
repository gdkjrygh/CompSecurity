.class public interface abstract Lorg/spongycastle/asn1/microsoft/MicrosoftObjectIdentifiers;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 11
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.6.1.4.1.311"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    .line 12
    sput-object v0, Lorg/spongycastle/asn1/microsoft/MicrosoftObjectIdentifiers;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "20.2"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/asn1/microsoft/MicrosoftObjectIdentifiers;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 13
    sget-object v0, Lorg/spongycastle/asn1/microsoft/MicrosoftObjectIdentifiers;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "21.1"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/asn1/microsoft/MicrosoftObjectIdentifiers;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 14
    sget-object v0, Lorg/spongycastle/asn1/microsoft/MicrosoftObjectIdentifiers;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "21.2"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/asn1/microsoft/MicrosoftObjectIdentifiers;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 15
    sget-object v0, Lorg/spongycastle/asn1/microsoft/MicrosoftObjectIdentifiers;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "21.7"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/asn1/microsoft/MicrosoftObjectIdentifiers;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 16
    sget-object v0, Lorg/spongycastle/asn1/microsoft/MicrosoftObjectIdentifiers;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "21.10"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/asn1/microsoft/MicrosoftObjectIdentifiers;->f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-void
.end method
