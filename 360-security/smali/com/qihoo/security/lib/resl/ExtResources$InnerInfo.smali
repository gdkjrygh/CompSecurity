.class Lcom/qihoo/security/lib/resl/ExtResources$InnerInfo;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/lib/iresl/IInfo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/lib/resl/ExtResources;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "InnerInfo"
.end annotation


# instance fields
.field private pi:Ljava/lang/String;

.field private pn:Ljava/lang/String;

.field private vc:I

.field private vn:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput p1, p0, Lcom/qihoo/security/lib/resl/ExtResources$InnerInfo;->vc:I

    .line 82
    iput-object p2, p0, Lcom/qihoo/security/lib/resl/ExtResources$InnerInfo;->vn:Ljava/lang/String;

    .line 83
    iput-object p3, p0, Lcom/qihoo/security/lib/resl/ExtResources$InnerInfo;->pi:Ljava/lang/String;

    .line 84
    iput-object p4, p0, Lcom/qihoo/security/lib/resl/ExtResources$InnerInfo;->pn:Ljava/lang/String;

    .line 85
    return-void
.end method


# virtual methods
.method public getPkgInfo()Ljava/lang/String;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources$InnerInfo;->pi:Ljava/lang/String;

    return-object v0
.end method

.method public getPkgName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources$InnerInfo;->pn:Ljava/lang/String;

    return-object v0
.end method

.method public getVersionCode()I
    .locals 1

    .prologue
    .line 87
    iget v0, p0, Lcom/qihoo/security/lib/resl/ExtResources$InnerInfo;->vc:I

    return v0
.end method

.method public getVersionName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources$InnerInfo;->vn:Ljava/lang/String;

    return-object v0
.end method
