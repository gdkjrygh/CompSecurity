.class public Lorg/bouncycastle/asn1/DERNull;
.super Lorg/bouncycastle/asn1/ASN1Null;


# static fields
.field public static final b:Lorg/bouncycastle/asn1/DERNull;


# instance fields
.field c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/bouncycastle/asn1/DERNull;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/DERNull;-><init>()V

    sput-object v0, Lorg/bouncycastle/asn1/DERNull;->b:Lorg/bouncycastle/asn1/DERNull;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Null;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/asn1/DERNull;->c:[B

    return-void
.end method


# virtual methods
.method a(Lorg/bouncycastle/asn1/DEROutputStream;)V
    .locals 2

    const/4 v0, 0x5

    iget-object v1, p0, Lorg/bouncycastle/asn1/DERNull;->c:[B

    invoke-virtual {p1, v0, v1}, Lorg/bouncycastle/asn1/DEROutputStream;->a(I[B)V

    return-void
.end method
