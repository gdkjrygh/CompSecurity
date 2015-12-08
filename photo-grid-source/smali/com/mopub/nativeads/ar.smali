.class final Lcom/mopub/nativeads/ar;
.super Lcom/mopub/common/BaseUrlGenerator;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Lcom/mopub/common/BaseUrlGenerator;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/mopub/nativeads/ar;->a:Landroid/content/Context;

    .line 18
    return-void
.end method


# virtual methods
.method public final generateUrlString(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 28
    const-string v0, "/m/pos"

    invoke-virtual {p0, p1, v0}, Lcom/mopub/nativeads/ar;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    iget-object v0, p0, Lcom/mopub/nativeads/ar;->b:Ljava/lang/String;

    .line 1050
    const-string v1, "id"

    invoke-virtual {p0, v1, v0}, Lcom/mopub/nativeads/ar;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    const-string v0, "1"

    invoke-virtual {p0, v0}, Lcom/mopub/nativeads/ar;->b(Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcom/mopub/nativeads/ar;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/mopub/common/ClientMetadata;->getInstance(Landroid/content/Context;)Lcom/mopub/common/ClientMetadata;

    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getSdkVersion()Ljava/lang/String;

    move-result-object v1

    .line 1054
    const-string v2, "nsv"

    invoke-virtual {p0, v2, v1}, Lcom/mopub/nativeads/ar;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getDeviceManufacturer()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getDeviceModel()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getDeviceProduct()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {p0, v1}, Lcom/mopub/nativeads/ar;->a([Ljava/lang/String;)V

    .line 42
    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getAppVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mopub/nativeads/ar;->c(Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0}, Lcom/mopub/nativeads/ar;->c()V

    .line 46
    invoke-virtual {p0}, Lcom/mopub/nativeads/ar;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final withAdUnitId(Ljava/lang/String;)Lcom/mopub/nativeads/ar;
    .locals 0

    .prologue
    .line 22
    iput-object p1, p0, Lcom/mopub/nativeads/ar;->b:Ljava/lang/String;

    .line 23
    return-object p0
.end method
