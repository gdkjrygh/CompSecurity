.class public Lorg/spongycastle/asn1/x509/Target;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1Choice;


# instance fields
.field private a:Lorg/spongycastle/asn1/x509/GeneralName;

.field private b:Lorg/spongycastle/asn1/x509/GeneralName;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1TaggedObject;)V
    .locals 3

    .prologue
    .line 67
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 68
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 77
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown tag: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 71
    :pswitch_0
    invoke-static {p1}, Lorg/spongycastle/asn1/x509/GeneralName;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/Target;->a:Lorg/spongycastle/asn1/x509/GeneralName;

    .line 75
    :goto_0
    return-void

    .line 74
    :pswitch_1
    invoke-static {p1}, Lorg/spongycastle/asn1/x509/GeneralName;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/Target;->b:Lorg/spongycastle/asn1/x509/GeneralName;

    goto :goto_0

    .line 68
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/Target;
    .locals 3

    .prologue
    .line 47
    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/spongycastle/asn1/x509/Target;

    if-eqz v0, :cond_1

    .line 49
    :cond_0
    check-cast p0, Lorg/spongycastle/asn1/x509/Target;

    .line 53
    :goto_0
    return-object p0

    .line 51
    :cond_1
    instance-of v0, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    if-eqz v0, :cond_2

    .line 53
    new-instance v0, Lorg/spongycastle/asn1/x509/Target;

    check-cast p0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    invoke-direct {v0, p0}, Lorg/spongycastle/asn1/x509/Target;-><init>(Lorg/spongycastle/asn1/ASN1TaggedObject;)V

    move-object p0, v0

    goto :goto_0

    .line 56
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown object in factory: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 129
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Target;->a:Lorg/spongycastle/asn1/x509/GeneralName;

    if-eqz v0, :cond_0

    .line 131
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v1, 0x0

    iget-object v2, p0, Lorg/spongycastle/asn1/x509/Target;->a:Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-direct {v0, v3, v1, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    .line 135
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v1, p0, Lorg/spongycastle/asn1/x509/Target;->b:Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-direct {v0, v3, v3, v1}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0
.end method

.method public final c()Lorg/spongycastle/asn1/x509/GeneralName;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Target;->b:Lorg/spongycastle/asn1/x509/GeneralName;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/x509/GeneralName;
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Target;->a:Lorg/spongycastle/asn1/x509/GeneralName;

    return-object v0
.end method
