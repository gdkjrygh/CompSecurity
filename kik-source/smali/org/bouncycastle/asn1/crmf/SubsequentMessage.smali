.class public Lorg/bouncycastle/asn1/crmf/SubsequentMessage;
.super Lorg/bouncycastle/asn1/DERInteger;


# static fields
.field public static final b:Lorg/bouncycastle/asn1/crmf/SubsequentMessage;

.field public static final c:Lorg/bouncycastle/asn1/crmf/SubsequentMessage;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/crmf/SubsequentMessage;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/crmf/SubsequentMessage;-><init>(I)V

    sput-object v0, Lorg/bouncycastle/asn1/crmf/SubsequentMessage;->b:Lorg/bouncycastle/asn1/crmf/SubsequentMessage;

    new-instance v0, Lorg/bouncycastle/asn1/crmf/SubsequentMessage;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/crmf/SubsequentMessage;-><init>(I)V

    sput-object v0, Lorg/bouncycastle/asn1/crmf/SubsequentMessage;->c:Lorg/bouncycastle/asn1/crmf/SubsequentMessage;

    return-void
.end method

.method private constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/bouncycastle/asn1/DERInteger;-><init>(I)V

    return-void
.end method
