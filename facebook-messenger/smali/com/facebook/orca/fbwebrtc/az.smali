.class public Lcom/facebook/orca/fbwebrtc/az;
.super Ljava/lang/Object;
.source "WebrtcSignalingHandler.java"

# interfaces
.implements Lcom/facebook/webrtc/IWebrtcSignalingMessageInterface;


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
.field private final b:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private final c:Lcom/facebook/fbservice/ops/k;

.field private final d:Lcom/facebook/push/mqtt/v;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/credentials/UserTokenCredentials;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/facebook/orca/fbwebrtc/ag;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 40
    const-class v0, Lcom/facebook/orca/fbwebrtc/az;

    sput-object v0, Lcom/facebook/orca/fbwebrtc/az;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/fbservice/ops/k;Lcom/facebook/push/mqtt/v;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/ObjectMapper;",
            "Lcom/facebook/fbservice/ops/k;",
            "Lcom/facebook/push/mqtt/v;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/credentials/UserTokenCredentials;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/az;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 54
    iput-object p2, p0, Lcom/facebook/orca/fbwebrtc/az;->c:Lcom/facebook/fbservice/ops/k;

    .line 55
    iput-object p3, p0, Lcom/facebook/orca/fbwebrtc/az;->d:Lcom/facebook/push/mqtt/v;

    .line 56
    iput-object p4, p0, Lcom/facebook/orca/fbwebrtc/az;->e:Ljavax/inject/a;

    .line 57
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)I
    .locals 3

    .prologue
    const/4 v0, -0x1

    .line 107
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v1

    sget-object v2, Lcom/facebook/fbservice/service/t;->API_ERROR:Lcom/facebook/fbservice/service/t;

    if-ne v1, v2, :cond_1

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->g()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->g()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "result"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lcom/facebook/http/protocol/ApiErrorResult;

    if-eqz v1, :cond_1

    .line 111
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->g()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "result"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/ApiErrorResult;

    .line 112
    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v1

    const/16 v2, 0x4bc

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->c()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    .line 114
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v0

    .line 126
    :cond_1
    :goto_0
    return v0

    .line 117
    :cond_2
    :try_start_0
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/az;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 118
    const-string v2, "webrtc_error_code"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    const/4 v2, -0x1

    invoke-static {v1, v2}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;I)I
    :try_end_0
    .catch Lcom/fasterxml/jackson/core/JsonProcessingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 121
    :catch_0
    move-exception v1

    .line 124
    :goto_1
    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v0

    goto :goto_0

    .line 119
    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/az;Lcom/facebook/fbservice/service/ServiceException;)I
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/az;->a(Lcom/facebook/fbservice/service/ServiceException;)I

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/az;)Lcom/facebook/orca/fbwebrtc/ag;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/az;->f:Lcom/facebook/orca/fbwebrtc/ag;

    return-object v0
.end method

.method static synthetic a()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 38
    sget-object v0, Lcom/facebook/orca/fbwebrtc/az;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private b(JJLjava/lang/String;)V
    .locals 3

    .prologue
    .line 85
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 86
    new-instance v1, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p1, p2, v2, p5}, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string v2, "sendWebrtcMessageParams"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 89
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/az;->c:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->z:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 92
    new-instance v1, Lcom/facebook/orca/fbwebrtc/ba;

    invoke-direct {v1, p0, p3, p4}, Lcom/facebook/orca/fbwebrtc/ba;-><init>(Lcom/facebook/orca/fbwebrtc/az;J)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 104
    return-void
.end method


# virtual methods
.method a(Lcom/facebook/orca/fbwebrtc/ag;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/az;->f:Lcom/facebook/orca/fbwebrtc/ag;

    .line 61
    return-void
.end method

.method public a(JJLjava/lang/String;)Z
    .locals 4

    .prologue
    .line 72
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 73
    const-string v1, "to"

    invoke-virtual {v0, v1, p1, p2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 74
    const-string v1, "payload"

    invoke-virtual {v0, v1, p5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 75
    const-string v1, "id"

    invoke-virtual {v0, v1, p3, p4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 76
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/az;->d:Lcom/facebook/push/mqtt/v;

    const-string v2, "/webrtc"

    sget-object v3, Lcom/facebook/mqtt/x;->FIRE_AND_FORGET:Lcom/facebook/mqtt/x;

    invoke-virtual {v1, v2, v0, v3}, Lcom/facebook/push/mqtt/v;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/mqtt/x;)I

    move-result v0

    .line 77
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 78
    invoke-direct/range {p0 .. p5}, Lcom/facebook/orca/fbwebrtc/az;->b(JJLjava/lang/String;)V

    .line 80
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public sendToPeer(JJLjava/lang/String;)Z
    .locals 5

    .prologue
    .line 132
    sget-object v0, Lcom/facebook/orca/fbwebrtc/az;->a:Ljava/lang/Class;

    const-string v1, "Sending to peer peerId=%d messageId=%d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    sget-object v0, Lcom/facebook/orca/fbwebrtc/az;->a:Ljava/lang/Class;

    invoke-static {v0, p5}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 134
    invoke-virtual/range {p0 .. p5}, Lcom/facebook/orca/fbwebrtc/az;->a(JJLjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public sendToSelf(JLjava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 139
    sget-object v0, Lcom/facebook/orca/fbwebrtc/az;->a:Ljava/lang/Class;

    const-string v2, "Sending to self messageId=%d"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-static {v0, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    sget-object v0, Lcom/facebook/orca/fbwebrtc/az;->a:Ljava/lang/Class;

    invoke-static {v0, p3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 141
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/az;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/credentials/UserTokenCredentials;

    .line 142
    if-nez v0, :cond_0

    move v0, v1

    .line 145
    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/facebook/auth/credentials/UserTokenCredentials;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    move-object v0, p0

    move-wide v3, p1

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/fbwebrtc/az;->a(JJLjava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method
