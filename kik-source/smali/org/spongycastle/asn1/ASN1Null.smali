.class public abstract Lorg/spongycastle/asn1/ASN1Null;
.super Lorg/spongycastle/asn1/ASN1Primitive;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 13
    return-void
.end method


# virtual methods
.method abstract a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
.end method

.method final a(Lorg/spongycastle/asn1/ASN1Primitive;)Z
    .locals 1

    .prologue
    .line 49
    instance-of v0, p1, Lorg/spongycastle/asn1/ASN1Null;

    if-nez v0, :cond_0

    .line 51
    const/4 v0, 0x0

    .line 54
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 43
    const/4 v0, -0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    const-string v0, "NULL"

    return-object v0
.end method
