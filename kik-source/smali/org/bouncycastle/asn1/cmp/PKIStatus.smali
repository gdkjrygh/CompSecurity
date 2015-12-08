.class public Lorg/bouncycastle/asn1/cmp/PKIStatus;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# static fields
.field public static final a:Lorg/bouncycastle/asn1/cmp/PKIStatus;

.field public static final b:Lorg/bouncycastle/asn1/cmp/PKIStatus;

.field public static final c:Lorg/bouncycastle/asn1/cmp/PKIStatus;

.field public static final d:Lorg/bouncycastle/asn1/cmp/PKIStatus;

.field public static final e:Lorg/bouncycastle/asn1/cmp/PKIStatus;

.field public static final f:Lorg/bouncycastle/asn1/cmp/PKIStatus;

.field public static final g:Lorg/bouncycastle/asn1/cmp/PKIStatus;


# instance fields
.field private h:Lorg/bouncycastle/asn1/DERInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/cmp/PKIStatus;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/cmp/PKIStatus;-><init>(I)V

    sput-object v0, Lorg/bouncycastle/asn1/cmp/PKIStatus;->a:Lorg/bouncycastle/asn1/cmp/PKIStatus;

    new-instance v0, Lorg/bouncycastle/asn1/cmp/PKIStatus;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/cmp/PKIStatus;-><init>(I)V

    sput-object v0, Lorg/bouncycastle/asn1/cmp/PKIStatus;->b:Lorg/bouncycastle/asn1/cmp/PKIStatus;

    new-instance v0, Lorg/bouncycastle/asn1/cmp/PKIStatus;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/cmp/PKIStatus;-><init>(I)V

    sput-object v0, Lorg/bouncycastle/asn1/cmp/PKIStatus;->c:Lorg/bouncycastle/asn1/cmp/PKIStatus;

    new-instance v0, Lorg/bouncycastle/asn1/cmp/PKIStatus;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/cmp/PKIStatus;-><init>(I)V

    sput-object v0, Lorg/bouncycastle/asn1/cmp/PKIStatus;->d:Lorg/bouncycastle/asn1/cmp/PKIStatus;

    new-instance v0, Lorg/bouncycastle/asn1/cmp/PKIStatus;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/cmp/PKIStatus;-><init>(I)V

    sput-object v0, Lorg/bouncycastle/asn1/cmp/PKIStatus;->e:Lorg/bouncycastle/asn1/cmp/PKIStatus;

    new-instance v0, Lorg/bouncycastle/asn1/cmp/PKIStatus;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/cmp/PKIStatus;-><init>(I)V

    sput-object v0, Lorg/bouncycastle/asn1/cmp/PKIStatus;->f:Lorg/bouncycastle/asn1/cmp/PKIStatus;

    new-instance v0, Lorg/bouncycastle/asn1/cmp/PKIStatus;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/cmp/PKIStatus;-><init>(I)V

    sput-object v0, Lorg/bouncycastle/asn1/cmp/PKIStatus;->g:Lorg/bouncycastle/asn1/cmp/PKIStatus;

    return-void
.end method

.method private constructor <init>(I)V
    .locals 1

    new-instance v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/DERInteger;-><init>(I)V

    invoke-direct {p0, v0}, Lorg/bouncycastle/asn1/cmp/PKIStatus;-><init>(Lorg/bouncycastle/asn1/DERInteger;)V

    return-void
.end method

.method private constructor <init>(Lorg/bouncycastle/asn1/DERInteger;)V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/cmp/PKIStatus;->h:Lorg/bouncycastle/asn1/DERInteger;

    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/cmp/PKIStatus;->h:Lorg/bouncycastle/asn1/DERInteger;

    return-object v0
.end method
