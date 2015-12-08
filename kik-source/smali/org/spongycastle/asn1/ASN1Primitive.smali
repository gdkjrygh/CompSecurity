.class public abstract Lorg/spongycastle/asn1/ASN1Primitive;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 11
    return-void
.end method

.method public static a([B)Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 23
    new-instance v0, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v0, p0}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    .line 27
    :try_start_0
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 31
    :catch_0
    move-exception v0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "cannot recognise object in stream"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 0

    .prologue
    .line 47
    return-object p0
.end method

.method abstract a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
.end method

.method abstract a(Lorg/spongycastle/asn1/ASN1Primitive;)Z
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 37
    if-ne p0, p1, :cond_1

    .line 42
    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v1, p1, Lorg/spongycastle/asn1/ASN1Encodable;

    if-eqz v1, :cond_2

    check-cast p1, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {p1}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/spongycastle/asn1/ASN1Primitive;->a(Lorg/spongycastle/asn1/ASN1Primitive;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method f()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 0

    .prologue
    .line 52
    return-object p0
.end method

.method g()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 0

    .prologue
    .line 57
    return-object p0
.end method

.method abstract h()Z
.end method

.method public abstract hashCode()I
.end method

.method abstract i()I
.end method
