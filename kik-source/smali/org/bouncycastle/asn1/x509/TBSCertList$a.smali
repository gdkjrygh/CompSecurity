.class final Lorg/bouncycastle/asn1/x509/TBSCertList$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Enumeration;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/asn1/x509/TBSCertList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lorg/bouncycastle/asn1/x509/TBSCertList;


# direct methods
.method private constructor <init>(Lorg/bouncycastle/asn1/x509/TBSCertList;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/asn1/x509/TBSCertList$a;->a:Lorg/bouncycastle/asn1/x509/TBSCertList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/bouncycastle/asn1/x509/TBSCertList;B)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/bouncycastle/asn1/x509/TBSCertList$a;-><init>(Lorg/bouncycastle/asn1/x509/TBSCertList;)V

    return-void
.end method


# virtual methods
.method public final hasMoreElements()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final nextElement()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
