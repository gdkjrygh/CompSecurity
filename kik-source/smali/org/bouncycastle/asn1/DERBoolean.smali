.class public Lorg/bouncycastle/asn1/DERBoolean;
.super Lorg/bouncycastle/asn1/ASN1Object;


# static fields
.field public static final b:Lorg/bouncycastle/asn1/DERBoolean;

.field public static final c:Lorg/bouncycastle/asn1/DERBoolean;


# instance fields
.field a:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/DERBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERBoolean;-><init>(Z)V

    sput-object v0, Lorg/bouncycastle/asn1/DERBoolean;->b:Lorg/bouncycastle/asn1/DERBoolean;

    new-instance v0, Lorg/bouncycastle/asn1/DERBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERBoolean;-><init>(Z)V

    sput-object v0, Lorg/bouncycastle/asn1/DERBoolean;->c:Lorg/bouncycastle/asn1/DERBoolean;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Object;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, -0x1

    :goto_0
    iput-byte v0, p0, Lorg/bouncycastle/asn1/DERBoolean;->a:B

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>([B)V
    .locals 2

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Object;-><init>()V

    array-length v0, p1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "byte value should have 1 byte in it"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x0

    aget-byte v0, p1, v0

    iput-byte v0, p0, Lorg/bouncycastle/asn1/DERBoolean;->a:B

    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERBoolean;
    .locals 3

    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/bouncycastle/asn1/DERBoolean;

    if-eqz v0, :cond_1

    :cond_0
    check-cast p0, Lorg/bouncycastle/asn1/DERBoolean;

    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "illegal object in getInstance: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/DERBoolean;
    .locals 2

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->i()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    instance-of v1, v0, Lorg/bouncycastle/asn1/DERBoolean;

    if-eqz v1, :cond_0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERBoolean;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERBoolean;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Lorg/bouncycastle/asn1/DERBoolean;

    check-cast v0, Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERBoolean;-><init>([B)V

    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method final a(Lorg/bouncycastle/asn1/DEROutputStream;)V
    .locals 4

    const/4 v3, 0x1

    new-array v0, v3, [B

    const/4 v1, 0x0

    iget-byte v2, p0, Lorg/bouncycastle/asn1/DERBoolean;->a:B

    aput-byte v2, v0, v1

    invoke-virtual {p1, v3, v0}, Lorg/bouncycastle/asn1/DEROutputStream;->a(I[B)V

    return-void
.end method

.method protected final a(Lorg/bouncycastle/asn1/DERObject;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    instance-of v1, p1, Lorg/bouncycastle/asn1/DERBoolean;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-byte v1, p0, Lorg/bouncycastle/asn1/DERBoolean;->a:B

    check-cast p1, Lorg/bouncycastle/asn1/DERBoolean;

    iget-byte v2, p1, Lorg/bouncycastle/asn1/DERBoolean;->a:B

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final e()Z
    .locals 1

    iget-byte v0, p0, Lorg/bouncycastle/asn1/DERBoolean;->a:B

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    iget-byte v0, p0, Lorg/bouncycastle/asn1/DERBoolean;->a:B

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-byte v0, p0, Lorg/bouncycastle/asn1/DERBoolean;->a:B

    if-eqz v0, :cond_0

    const-string v0, "TRUE"

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "FALSE"

    goto :goto_0
.end method
