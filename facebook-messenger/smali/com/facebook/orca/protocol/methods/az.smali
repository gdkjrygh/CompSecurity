.class public Lcom/facebook/orca/protocol/methods/az;
.super Ljava/lang/Object;
.source "SetUserSettingsMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/orca/server/SetSettingsParams;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(Lcom/facebook/orca/server/SetSettingsParams;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 40
    invoke-virtual {p1}, Lcom/facebook/orca/server/SetSettingsParams;->b()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lcom/facebook/orca/notify/NotificationSetting;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/SetSettingsParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 25
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 26
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    invoke-virtual {p1}, Lcom/facebook/orca/server/SetSettingsParams;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "mute_until"

    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/methods/az;->b(Lcom/facebook/orca/server/SetSettingsParams;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    :cond_0
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "setUserSettings"

    const-string v2, "POST"

    const-string v3, "method/messaging.setsettings"

    sget-object v5, Lcom/facebook/http/protocol/t;->STRING:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 21
    check-cast p1, Lcom/facebook/orca/server/SetSettingsParams;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/az;->a(Lcom/facebook/orca/server/SetSettingsParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 21
    check-cast p1, Lcom/facebook/orca/server/SetSettingsParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/az;->a(Lcom/facebook/orca/server/SetSettingsParams;Lcom/facebook/http/protocol/r;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/server/SetSettingsParams;Lcom/facebook/http/protocol/r;)Ljava/lang/Void;
    .locals 1

    .prologue
    .line 47
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->f()V

    .line 48
    const/4 v0, 0x0

    return-object v0
.end method
