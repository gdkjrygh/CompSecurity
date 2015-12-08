.class public Lorg/spongycastle/asn1/DERNull;
.super Lorg/spongycastle/asn1/ASN1Null;
.source "SourceFile"


# static fields
.field public static final a:Lorg/spongycastle/asn1/DERNull;

.field private static final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11
    new-instance v0, Lorg/spongycastle/asn1/DERNull;

    invoke-direct {v0}, Lorg/spongycastle/asn1/DERNull;-><init>()V

    sput-object v0, Lorg/spongycastle/asn1/DERNull;->a:Lorg/spongycastle/asn1/DERNull;

    .line 13
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lorg/spongycastle/asn1/DERNull;->b:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Null;-><init>()V

    .line 17
    return-void
.end method


# virtual methods
.method final a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
    .locals 2

    .prologue
    .line 33
    const/4 v0, 0x5

    sget-object v1, Lorg/spongycastle/asn1/DERNull;->b:[B

    invoke-virtual {p1, v0, v1}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(I[B)V

    .line 34
    return-void
.end method

.method final h()Z
    .locals 1

    .prologue
    .line 21
    const/4 v0, 0x0

    return v0
.end method

.method final i()I
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x2

    return v0
.end method
