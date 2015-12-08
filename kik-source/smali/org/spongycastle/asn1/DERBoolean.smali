.class public Lorg/spongycastle/asn1/DERBoolean;
.super Lorg/spongycastle/asn1/ASN1Primitive;
.source "SourceFile"


# static fields
.field public static final a:Lorg/spongycastle/asn1/ASN1Boolean;

.field public static final b:Lorg/spongycastle/asn1/ASN1Boolean;

.field private static final c:[B

.field private static final d:[B


# instance fields
.field private e:[B


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 10
    new-array v0, v3, [B

    const/4 v1, -0x1

    aput-byte v1, v0, v2

    sput-object v0, Lorg/spongycastle/asn1/DERBoolean;->c:[B

    .line 11
    new-array v0, v3, [B

    aput-byte v2, v0, v2

    sput-object v0, Lorg/spongycastle/asn1/DERBoolean;->d:[B

    .line 15
    new-instance v0, Lorg/spongycastle/asn1/ASN1Boolean;

    invoke-direct {v0, v2}, Lorg/spongycastle/asn1/ASN1Boolean;-><init>(Z)V

    sput-object v0, Lorg/spongycastle/asn1/DERBoolean;->a:Lorg/spongycastle/asn1/ASN1Boolean;

    .line 16
    new-instance v0, Lorg/spongycastle/asn1/ASN1Boolean;

    invoke-direct {v0, v3}, Lorg/spongycastle/asn1/ASN1Boolean;-><init>(Z)V

    sput-object v0, Lorg/spongycastle/asn1/DERBoolean;->b:Lorg/spongycastle/asn1/ASN1Boolean;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .prologue
    .line 98
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 99
    if-eqz p1, :cond_0

    sget-object v0, Lorg/spongycastle/asn1/DERBoolean;->c:[B

    :goto_0
    iput-object v0, p0, Lorg/spongycastle/asn1/DERBoolean;->e:[B

    .line 100
    return-void

    .line 99
    :cond_0
    sget-object v0, Lorg/spongycastle/asn1/DERBoolean;->d:[B

    goto :goto_0
.end method

.method constructor <init>([B)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 76
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 77
    array-length v0, p1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 79
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "byte value should have 1 byte in it"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 82
    :cond_0
    aget-byte v0, p1, v2

    if-nez v0, :cond_1

    .line 84
    sget-object v0, Lorg/spongycastle/asn1/DERBoolean;->d:[B

    iput-object v0, p0, Lorg/spongycastle/asn1/DERBoolean;->e:[B

    .line 94
    :goto_0
    return-void

    .line 86
    :cond_1
    aget-byte v0, p1, v2

    const/16 v1, 0xff

    if-ne v0, v1, :cond_2

    .line 88
    sget-object v0, Lorg/spongycastle/asn1/DERBoolean;->c:[B

    iput-object v0, p0, Lorg/spongycastle/asn1/DERBoolean;->e:[B

    goto :goto_0

    .line 92
    :cond_2
    invoke-static {p1}, Lorg/spongycastle/util/Arrays;->b([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/DERBoolean;->e:[B

    goto :goto_0
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Boolean;
    .locals 3

    .prologue
    .line 27
    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/spongycastle/asn1/ASN1Boolean;

    if-eqz v0, :cond_1

    .line 29
    :cond_0
    check-cast p0, Lorg/spongycastle/asn1/ASN1Boolean;

    .line 34
    :goto_0
    return-object p0

    .line 32
    :cond_1
    instance-of v0, p0, Lorg/spongycastle/asn1/DERBoolean;

    if-eqz v0, :cond_3

    .line 34
    check-cast p0, Lorg/spongycastle/asn1/DERBoolean;

    invoke-virtual {p0}, Lorg/spongycastle/asn1/DERBoolean;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lorg/spongycastle/asn1/DERBoolean;->b:Lorg/spongycastle/asn1/ASN1Boolean;

    goto :goto_0

    :cond_2
    sget-object p0, Lorg/spongycastle/asn1/DERBoolean;->a:Lorg/spongycastle/asn1/ASN1Boolean;

    goto :goto_0

    .line 37
    :cond_3
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

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/DERBoolean;
    .locals 2

    .prologue
    .line 62
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 64
    instance-of v1, v0, Lorg/spongycastle/asn1/DERBoolean;

    if-eqz v1, :cond_0

    .line 66
    invoke-static {v0}, Lorg/spongycastle/asn1/DERBoolean;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Boolean;

    move-result-object v0

    .line 70
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Boolean;->b([B)Lorg/spongycastle/asn1/ASN1Boolean;

    move-result-object v0

    goto :goto_0
.end method

.method static b([B)Lorg/spongycastle/asn1/ASN1Boolean;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 148
    array-length v0, p0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 150
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "byte value should have 1 byte in it"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 153
    :cond_0
    aget-byte v0, p0, v2

    if-nez v0, :cond_1

    .line 155
    sget-object v0, Lorg/spongycastle/asn1/DERBoolean;->a:Lorg/spongycastle/asn1/ASN1Boolean;

    .line 163
    :goto_0
    return-object v0

    .line 157
    :cond_1
    aget-byte v0, p0, v2

    const/16 v1, 0xff

    if-ne v0, v1, :cond_2

    .line 159
    sget-object v0, Lorg/spongycastle/asn1/DERBoolean;->b:Lorg/spongycastle/asn1/ASN1Boolean;

    goto :goto_0

    .line 163
    :cond_2
    new-instance v0, Lorg/spongycastle/asn1/ASN1Boolean;

    invoke-direct {v0, p0}, Lorg/spongycastle/asn1/ASN1Boolean;-><init>([B)V

    goto :goto_0
.end method

.method public static c()Lorg/spongycastle/asn1/ASN1Boolean;
    .locals 1

    .prologue
    .line 46
    sget-object v0, Lorg/spongycastle/asn1/DERBoolean;->b:Lorg/spongycastle/asn1/ASN1Boolean;

    return-object v0
.end method


# virtual methods
.method final a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
    .locals 2

    .prologue
    .line 121
    const/4 v0, 0x1

    iget-object v1, p0, Lorg/spongycastle/asn1/DERBoolean;->e:[B

    invoke-virtual {p1, v0, v1}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(I[B)V

    .line 122
    return-void
.end method

.method protected final a(Lorg/spongycastle/asn1/ASN1Primitive;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 127
    if-eqz p1, :cond_0

    instance-of v1, p1, Lorg/spongycastle/asn1/DERBoolean;

    if-nez v1, :cond_1

    .line 132
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/DERBoolean;->e:[B

    aget-byte v1, v1, v0

    check-cast p1, Lorg/spongycastle/asn1/DERBoolean;

    iget-object v2, p1, Lorg/spongycastle/asn1/DERBoolean;->e:[B

    aget-byte v2, v2, v0

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final d()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 104
    iget-object v1, p0, Lorg/spongycastle/asn1/DERBoolean;->e:[B

    aget-byte v1, v1, v0

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method final h()Z
    .locals 1

    .prologue
    .line 109
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 137
    iget-object v0, p0, Lorg/spongycastle/asn1/DERBoolean;->e:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    return v0
.end method

.method final i()I
    .locals 1

    .prologue
    .line 114
    const/4 v0, 0x3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 143
    iget-object v0, p0, Lorg/spongycastle/asn1/DERBoolean;->e:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    if-eqz v0, :cond_0

    const-string v0, "TRUE"

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "FALSE"

    goto :goto_0
.end method
