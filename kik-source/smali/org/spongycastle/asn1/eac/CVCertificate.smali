.class public Lorg/spongycastle/asn1/eac/CVCertificate;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/String;

.field private static e:I

.field private static f:I


# instance fields
.field private b:Lorg/spongycastle/asn1/eac/CertificateBody;

.field private c:[B

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x1

    sput v0, Lorg/spongycastle/asn1/eac/CVCertificate;->e:I

    .line 33
    const/4 v0, 0x2

    sput v0, Lorg/spongycastle/asn1/eac/CVCertificate;->f:I

    .line 36
    const-string v0, "ISO-8859-1"

    sput-object v0, Lorg/spongycastle/asn1/eac/CVCertificate;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    .line 199
    new-instance v1, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 201
    iget v0, p0, Lorg/spongycastle/asn1/eac/CVCertificate;->d:I

    sget v2, Lorg/spongycastle/asn1/eac/CVCertificate;->f:I

    sget v3, Lorg/spongycastle/asn1/eac/CVCertificate;->e:I

    or-int/2addr v2, v3

    if-eq v0, v2, :cond_0

    .line 203
    const/4 v0, 0x0

    .line 216
    :goto_0
    return-object v0

    .line 205
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/eac/CVCertificate;->b:Lorg/spongycastle/asn1/eac/CertificateBody;

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 209
    :try_start_0
    new-instance v0, Lorg/spongycastle/asn1/DERApplicationSpecific;

    const/16 v2, 0x37

    new-instance v3, Lorg/spongycastle/asn1/DEROctetString;

    iget-object v4, p0, Lorg/spongycastle/asn1/eac/CVCertificate;->c:[B

    invoke-direct {v3, v4}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v0, v2, v3}, Lorg/spongycastle/asn1/DERApplicationSpecific;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 216
    new-instance v0, Lorg/spongycastle/asn1/DERApplicationSpecific;

    const/16 v2, 0x21

    invoke-direct {v0, v2, v1}, Lorg/spongycastle/asn1/DERApplicationSpecific;-><init>(ILorg/spongycastle/asn1/ASN1EncodableVector;)V

    goto :goto_0

    .line 213
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unable to convert signature!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
