.class public Lcom/facebook/appconfig/m;
.super Lcom/facebook/appconfig/n;
.source "AppVersionConfigManager.java"


# direct methods
.method public constructor <init>(Lcom/facebook/appconfig/b;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/facebook/appconfig/n;-><init>(Lcom/facebook/appconfig/b;)V

    .line 22
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 31
    const-string v0, "min_version"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/facebook/appconfig/m;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 2

    .prologue
    .line 41
    const-string v0, "current_version"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/facebook/appconfig/m;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 2

    .prologue
    .line 51
    const-string v0, "min_version_code"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/facebook/appconfig/m;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 2

    .prologue
    .line 61
    const-string v0, "current_version_code"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/facebook/appconfig/m;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 2

    .prologue
    .line 70
    const-string v0, "new_version_url"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/facebook/appconfig/m;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
