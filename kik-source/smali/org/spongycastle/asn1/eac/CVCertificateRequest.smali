.class public Lorg/spongycastle/asn1/eac/CVCertificateRequest;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# static fields
.field public static a:[B

.field private static d:I

.field private static e:I


# instance fields
.field private b:Lorg/spongycastle/asn1/eac/CertificateBody;

.field private c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 29
    sput v2, Lorg/spongycastle/asn1/eac/CVCertificateRequest;->d:I

    .line 30
    const/4 v0, 0x2

    sput v0, Lorg/spongycastle/asn1/eac/CVCertificateRequest;->e:I

    .line 103
    new-array v0, v2, [B

    aput-byte v1, v0, v1

    sput-object v0, Lorg/spongycastle/asn1/eac/CVCertificateRequest;->a:[B

    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    .line 155
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 157
    iget-object v1, p0, Lorg/spongycastle/asn1/eac/CVCertificateRequest;->b:Lorg/spongycastle/asn1/eac/CertificateBody;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 161
    :try_start_0
    new-instance v1, Lorg/spongycastle/asn1/DERApplicationSpecific;

    const/16 v2, 0x37

    new-instance v3, Lorg/spongycastle/asn1/DEROctetString;

    iget-object v4, p0, Lorg/spongycastle/asn1/eac/CVCertificateRequest;->c:[B

    invoke-direct {v3, v4}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/asn1/DERApplicationSpecific;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    new-instance v1, Lorg/spongycastle/asn1/DERApplicationSpecific;

    const/16 v2, 0x21

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/asn1/DERApplicationSpecific;-><init>(ILorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1

    .line 165
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unable to convert signature!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
