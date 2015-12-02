.class public Lcom/facebook/orca/fbwebrtc/n;
.super Ljava/lang/Object;
.source "WebrtcConfigHandler.java"

# interfaces
.implements Lcom/facebook/webrtc/IWebrtcConfigInterface;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/credentials/UserTokenCredentials;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/facebook/orca/fbwebrtc/m;

.field private final g:Lcom/facebook/e/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const-class v0, Lcom/facebook/orca/fbwebrtc/n;

    sput-object v0, Lcom/facebook/orca/fbwebrtc/n;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/fbwebrtc/m;Lcom/facebook/e/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/credentials/UserTokenCredentials;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/orca/fbwebrtc/m;",
            "Lcom/facebook/e/c;",
            ")V"
        }
    .end annotation

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/n;->b:Ljavax/inject/a;

    .line 38
    iput-object p2, p0, Lcom/facebook/orca/fbwebrtc/n;->c:Ljavax/inject/a;

    .line 39
    iput-object p3, p0, Lcom/facebook/orca/fbwebrtc/n;->d:Ljavax/inject/a;

    .line 40
    iput-object p4, p0, Lcom/facebook/orca/fbwebrtc/n;->e:Ljavax/inject/a;

    .line 41
    iput-object p5, p0, Lcom/facebook/orca/fbwebrtc/n;->f:Lcom/facebook/orca/fbwebrtc/m;

    .line 42
    iput-object p6, p0, Lcom/facebook/orca/fbwebrtc/n;->g:Lcom/facebook/e/c;

    .line 43
    return-void
.end method


# virtual methods
.method public getConnectivityStatus()Ljava/lang/String;
    .locals 2

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/n;->g:Lcom/facebook/e/c;

    invoke-virtual {v0}, Lcom/facebook/e/c;->c()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 58
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v1

    if-nez v1, :cond_1

    .line 59
    :cond_0
    const-string v0, ""

    .line 66
    :goto_0
    return-object v0

    .line 61
    :cond_1
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v1

    if-nez v1, :cond_2

    .line 64
    const-string v0, "cell"

    goto :goto_0

    .line 66
    :cond_2
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getMinVersion()I
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/n;->f:Lcom/facebook/orca/fbwebrtc/m;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/m;->a()I

    move-result v0

    return v0
.end method

.method public isVoipAllowedOnCell()Z
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/n;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public newPeerConnectionConfig()Ljava/lang/String;
    .locals 5

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/n;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/credentials/UserTokenCredentials;

    .line 73
    if-nez v0, :cond_0

    .line 74
    const-string v0, ""

    .line 84
    :goto_0
    return-object v0

    .line 77
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/auth/credentials/UserTokenCredentials;->a()Ljava/lang/String;

    move-result-object v1

    .line 78
    invoke-virtual {v0}, Lcom/facebook/auth/credentials/UserTokenCredentials;->b()Ljava/lang/String;

    move-result-object v0

    .line 80
    const-string v2, "stun.fbsbx.com:3478"

    .line 81
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "api.facebook.com:443:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ":"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/n;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "1"

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 84
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STUN "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",TURN "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 81
    :cond_1
    const-string v0, "0"

    goto :goto_1
.end method

.method public shouldSendIceAfterAnswer()Z
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/n;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
