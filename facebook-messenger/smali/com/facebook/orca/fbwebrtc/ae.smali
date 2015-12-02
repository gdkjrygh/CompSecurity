.class public Lcom/facebook/orca/fbwebrtc/ae;
.super Ljava/lang/Object;
.source "WebrtcLoggingHandler.java"

# interfaces
.implements Lcom/facebook/webrtc/IWebrtcLoggingInterface;


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
.field private final b:Lcom/facebook/analytics/av;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const-class v0, Lcom/facebook/orca/fbwebrtc/ae;

    sput-object v0, Lcom/facebook/orca/fbwebrtc/ae;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/analytics/av;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/ae;->b:Lcom/facebook/analytics/av;

    .line 22
    return-void
.end method

.method private a(Lcom/facebook/analytics/cb;)V
    .locals 1

    .prologue
    .line 25
    const-string v0, "webrtc"

    invoke-virtual {p1, v0}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 26
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ae;->b:Lcom/facebook/analytics/av;

    invoke-interface {v0, p1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 27
    return-void
.end method


# virtual methods
.method public a(IJ)V
    .locals 2

    .prologue
    .line 135
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "survey"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 137
    const-string v1, "rating5"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 138
    const-string v1, "call_id"

    invoke-virtual {v0, v1, p2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 140
    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/ae;->a(Lcom/facebook/analytics/cb;)V

    .line 141
    return-void
.end method

.method public a(JJJLjava/lang/String;ZZZ)V
    .locals 2

    .prologue
    .line 155
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "received_offer"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 157
    const-string v1, "call_id"

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 158
    const-string v1, "msg_id"

    invoke-virtual {v0, v1, p3, p4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 159
    const-string v1, "from"

    invoke-virtual {v0, v1, p5, p6}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 160
    const-string v1, "source"

    invoke-virtual {v0, v1, p7}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 161
    const-string v1, "duplicate"

    invoke-virtual {v0, v1, p8}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    .line 162
    const-string v1, "mqtt"

    invoke-virtual {v0, v1, p9}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    .line 163
    const-string v1, "wifi"

    invoke-virtual {v0, v1, p10}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    .line 165
    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/ae;->a(Lcom/facebook/analytics/cb;)V

    .line 166
    return-void
.end method

.method public a(Z)V
    .locals 3

    .prologue
    .line 144
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "client_event"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 145
    if-eqz p1, :cond_0

    .line 146
    const-string v1, "content"

    const-string v2, "disclaimer_accepted"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 150
    :goto_0
    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/ae;->a(Lcom/facebook/analytics/cb;)V

    .line 151
    return-void

    .line 148
    :cond_0
    const-string v1, "content"

    const-string v2, "disclaimer_cancel"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    goto :goto_0
.end method

.method public logCallAction(JJLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 89
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "call_action"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 91
    const-string v1, "call_id"

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 92
    const-string v1, "peer_id"

    invoke-virtual {v0, v1, p3, p4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 93
    const-string v1, "call_action"

    invoke-virtual {v0, v1, p5}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 94
    const-string v1, "content"

    invoke-virtual {v0, v1, p6}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 96
    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/ae;->a(Lcom/facebook/analytics/cb;)V

    .line 97
    return-void
.end method

.method public logConnectionStatus(ZLjava/lang/String;J)V
    .locals 3

    .prologue
    .line 101
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "connection_status"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 103
    const-string v1, "is_connected"

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 104
    const-string v1, "call_id"

    invoke-virtual {v0, v1, p3, p4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 105
    const-string v1, "content"

    invoke-virtual {v0, v1, p2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 107
    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/ae;->a(Lcom/facebook/analytics/cb;)V

    .line 108
    return-void
.end method

.method public logInternalError(Ljava/lang/String;J)V
    .locals 5

    .prologue
    .line 112
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "internal_error"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 114
    const-string v1, "error"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 115
    const-string v1, "call_id"

    invoke-virtual {v0, v1, p2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 117
    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/ae;->a(Lcom/facebook/analytics/cb;)V

    .line 119
    sget-object v0, Lcom/facebook/orca/fbwebrtc/ae;->a:Ljava/lang/Class;

    const-string v1, "internal error: callid=%d: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    return-void
.end method

.method public logMustFix(Ljava/lang/String;J)V
    .locals 5

    .prologue
    .line 124
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "must_fix_error"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 126
    const-string v1, "error"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 127
    const-string v1, "call_id"

    invoke-virtual {v0, v1, p2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 129
    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/ae;->a(Lcom/facebook/analytics/cb;)V

    .line 131
    sget-object v0, Lcom/facebook/orca/fbwebrtc/ae;->a:Ljava/lang/Class;

    const-string v1, "mustfix error: callid=%d: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    return-void
.end method

.method public logReceivedMessage(Ljava/lang/String;JJJJLjava/lang/String;)V
    .locals 3

    .prologue
    .line 32
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "received_message"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 34
    const-string v1, "type"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 35
    const-string v1, "msg_id"

    invoke-virtual {v0, v1, p2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 36
    const-wide/16 v1, 0x0

    cmp-long v1, p4, v1

    if-eqz v1, :cond_0

    .line 37
    const-string v1, "ack_msg_id"

    invoke-virtual {v0, v1, p4, p5}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 39
    :cond_0
    const-string v1, "call_id"

    invoke-virtual {v0, v1, p6, p7}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 40
    const-string v1, "from"

    invoke-virtual {v0, v1, p8, p9}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 41
    const-string v1, "content"

    invoke-virtual {v0, v1, p10}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 43
    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/ae;->a(Lcom/facebook/analytics/cb;)V

    .line 44
    return-void
.end method

.method public logSentMessage(Ljava/lang/String;JJJJLjava/lang/String;)V
    .locals 3

    .prologue
    .line 49
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "sent_message"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 51
    const-string v1, "type"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 52
    const-string v1, "msg_id"

    invoke-virtual {v0, v1, p2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 53
    const-wide/16 v1, 0x0

    cmp-long v1, p4, v1

    if-eqz v1, :cond_0

    .line 54
    const-string v1, "ack_msg_id"

    invoke-virtual {v0, v1, p4, p5}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 56
    :cond_0
    const-string v1, "call_id"

    invoke-virtual {v0, v1, p6, p7}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 57
    const-string v1, "to"

    invoke-virtual {v0, v1, p8, p9}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 58
    const-string v1, "content"

    invoke-virtual {v0, v1, p10}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 60
    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/ae;->a(Lcom/facebook/analytics/cb;)V

    .line 61
    return-void
.end method

.method public logSentMessageFailure(JILjava/lang/String;Ljava/lang/String;J)V
    .locals 2

    .prologue
    .line 76
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "send_failed"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 78
    const-string v1, "msg_id"

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 79
    const-string v1, "error"

    invoke-virtual {v0, v1, p5}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 80
    const-string v1, "error_code"

    invoke-virtual {v0, v1, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 81
    const-string v1, "error_domain"

    invoke-virtual {v0, v1, p4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 82
    const-string v1, "call_id"

    invoke-virtual {v0, v1, p6, p7}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 84
    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/ae;->a(Lcom/facebook/analytics/cb;)V

    .line 85
    return-void
.end method

.method public logSentMessageSuccess(JJ)V
    .locals 2

    .prologue
    .line 65
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "send_succeeded"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 67
    const-string v1, "msg_id"

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 68
    const-string v1, "call_id"

    invoke-virtual {v0, v1, p3, p4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 70
    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/ae;->a(Lcom/facebook/analytics/cb;)V

    .line 71
    return-void
.end method
