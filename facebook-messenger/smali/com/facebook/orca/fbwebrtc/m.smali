.class public Lcom/facebook/orca/fbwebrtc/m;
.super Ljava/lang/Object;
.source "WebRtcConfigManager.java"


# instance fields
.field private final a:Lcom/facebook/appconfig/b;


# direct methods
.method public constructor <init>(Lcom/facebook/appconfig/b;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/m;->a:Lcom/facebook/appconfig/b;

    .line 18
    return-void
.end method


# virtual methods
.method public a()I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 26
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/m;->a:Lcom/facebook/appconfig/b;

    invoke-virtual {v1}, Lcom/facebook/appconfig/b;->a()Lcom/facebook/appconfig/AppConfig;

    move-result-object v1

    .line 27
    if-nez v1, :cond_0

    .line 31
    :goto_0
    return v0

    .line 30
    :cond_0
    invoke-virtual {v1}, Lcom/facebook/appconfig/AppConfig;->a()Lcom/facebook/common/bundle/ImmutableBundle;

    move-result-object v1

    const-string v2, "min_webrtc_version"

    invoke-virtual {v1, v2}, Lcom/facebook/common/bundle/ImmutableBundle;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 31
    invoke-static {v1, v0}, Lcom/facebook/common/w/t;->a(Ljava/lang/Object;I)I

    move-result v0

    goto :goto_0
.end method

.method public b()D
    .locals 4

    .prologue
    const-wide/16 v0, 0x0

    .line 40
    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/m;->a:Lcom/facebook/appconfig/b;

    invoke-virtual {v2}, Lcom/facebook/appconfig/b;->a()Lcom/facebook/appconfig/AppConfig;

    move-result-object v2

    .line 41
    if-nez v2, :cond_0

    .line 45
    :goto_0
    return-wide v0

    .line 44
    :cond_0
    invoke-virtual {v2}, Lcom/facebook/appconfig/AppConfig;->a()Lcom/facebook/common/bundle/ImmutableBundle;

    move-result-object v2

    const-string v3, "webrtc_survey_pct"

    invoke-virtual {v2, v3}, Lcom/facebook/common/bundle/ImmutableBundle;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 45
    invoke-static {v2, v0, v1}, Lcom/facebook/common/w/t;->a(Ljava/lang/Object;D)D

    move-result-wide v0

    goto :goto_0
.end method
