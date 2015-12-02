.class public Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod;
.super Ljava/lang/Object;
.source "SendWebrtcMessageMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const-class v0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod;

    sput-object v0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;)Lcom/facebook/http/protocol/n;
    .locals 5

    .prologue
    .line 85
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 87
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "webrtc_message_id"

    invoke-virtual {p1}, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "payload"

    invoke-virtual {p1}, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;->c()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    invoke-static {}, Lcom/facebook/http/protocol/n;->newBuilder()Lcom/facebook/http/protocol/p;

    move-result-object v1

    const-string v2, "sendWebrtcMessage"

    invoke-virtual {v1, v2}, Lcom/facebook/http/protocol/p;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v1

    const-string v2, "POST"

    invoke-virtual {v1, v2}, Lcom/facebook/http/protocol/p;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/voip_calls"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/http/protocol/p;->c(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/http/protocol/p;->a(Ljava/util/List;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    sget-object v1, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/p;->a(Lcom/facebook/http/protocol/t;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/p;->k()Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 26
    check-cast p1, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod;->a(Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;Lcom/facebook/http/protocol/r;)Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 102
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    .line 103
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26
    check-cast p1, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod;->a(Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;Lcom/facebook/http/protocol/r;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
