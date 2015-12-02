.class public Lcom/facebook/orca/push/a/a;
.super Ljava/lang/Object;
.source "OrcaFbPushDataHandler.java"

# interfaces
.implements Lcom/facebook/push/fbpushdata/a;


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/auth/b/b;

.field private final c:Landroid/content/res/Resources;

.field private final d:Lcom/facebook/orca/push/b;

.field private final e:Lcom/facebook/orca/push/a/b;

.field private final f:Lcom/facebook/l/k;

.field private final g:Lcom/facebook/analytics/cn;

.field private final h:Lcom/facebook/push/c2dm/y;

.field private final i:Lcom/facebook/orca/push/h;

.field private final j:Lcom/facebook/auth/login/bm;

.field private final k:Lcom/facebook/config/a/d;

.field private final l:Lcom/facebook/orca/fbwebrtc/ag;

.field private final m:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private final n:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/fbservice/ops/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    const-class v0, Lcom/facebook/orca/push/a/a;

    sput-object v0, Lcom/facebook/orca/push/a/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/auth/b/b;Landroid/content/res/Resources;Lcom/facebook/orca/push/b;Lcom/facebook/orca/push/a/b;Lcom/facebook/l/k;Lcom/facebook/analytics/cn;Lcom/facebook/push/c2dm/y;Lcom/facebook/orca/push/h;Lcom/facebook/auth/login/bm;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/config/a/d;Lcom/facebook/orca/fbwebrtc/ag;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/auth/b/b;",
            "Landroid/content/res/Resources;",
            "Lcom/facebook/orca/push/b;",
            "Lcom/facebook/orca/push/a/b;",
            "Lcom/facebook/l/k;",
            "Lcom/facebook/analytics/cn;",
            "Lcom/facebook/push/c2dm/y;",
            "Lcom/facebook/orca/push/h;",
            "Lcom/facebook/auth/login/bm;",
            "Lcom/fasterxml/jackson/databind/ObjectMapper;",
            "Lcom/facebook/config/a/d;",
            "Lcom/facebook/orca/fbwebrtc/ag;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/fbservice/ops/c;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p1, p0, Lcom/facebook/orca/push/a/a;->b:Lcom/facebook/auth/b/b;

    .line 92
    iput-object p2, p0, Lcom/facebook/orca/push/a/a;->c:Landroid/content/res/Resources;

    .line 93
    iput-object p3, p0, Lcom/facebook/orca/push/a/a;->d:Lcom/facebook/orca/push/b;

    .line 94
    iput-object p4, p0, Lcom/facebook/orca/push/a/a;->e:Lcom/facebook/orca/push/a/b;

    .line 95
    iput-object p5, p0, Lcom/facebook/orca/push/a/a;->f:Lcom/facebook/l/k;

    .line 96
    iput-object p6, p0, Lcom/facebook/orca/push/a/a;->g:Lcom/facebook/analytics/cn;

    .line 97
    iput-object p7, p0, Lcom/facebook/orca/push/a/a;->h:Lcom/facebook/push/c2dm/y;

    .line 98
    iput-object p8, p0, Lcom/facebook/orca/push/a/a;->i:Lcom/facebook/orca/push/h;

    .line 99
    iput-object p9, p0, Lcom/facebook/orca/push/a/a;->j:Lcom/facebook/auth/login/bm;

    .line 100
    iput-object p10, p0, Lcom/facebook/orca/push/a/a;->m:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 101
    iput-object p11, p0, Lcom/facebook/orca/push/a/a;->k:Lcom/facebook/config/a/d;

    .line 102
    iput-object p12, p0, Lcom/facebook/orca/push/a/a;->l:Lcom/facebook/orca/fbwebrtc/ag;

    .line 103
    iput-object p13, p0, Lcom/facebook/orca/push/a/a;->n:Ljavax/inject/a;

    .line 104
    return-void
.end method

.method private a(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 8

    .prologue
    .line 233
    const-string v0, "thread_timestamps"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 234
    if-nez v0, :cond_0

    .line 256
    :goto_0
    return-void

    .line 238
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/facebook/orca/push/a/a;->m:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 239
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v2

    .line 240
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->fields()Ljava/util/Iterator;

    move-result-object v3

    .line 241
    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 242
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 243
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/facebook/orca/threads/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 244
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    const-wide/16 v4, -0x1

    invoke-static {v0, v4, v5}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;J)J

    move-result-wide v4

    .line 245
    if-eqz v1, :cond_1

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_1

    .line 246
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 252
    :catch_0
    move-exception v0

    .line 253
    sget-object v0, Lcom/facebook/orca/push/a/a;->a:Ljava/lang/Class;

    const-string v1, "Failed to parse thread_counts"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 249
    :cond_2
    :try_start_1
    invoke-virtual {v2}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    .line 250
    new-instance v1, Lcom/facebook/orca/notify/bi;

    invoke-direct {v1, v0}, Lcom/facebook/orca/notify/bi;-><init>(Lcom/google/common/a/ev;)V

    .line 251
    iget-object v0, p0, Lcom/facebook/orca/push/a/a;->d:Lcom/facebook/orca/push/b;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/push/b;->a(Lcom/facebook/orca/notify/bi;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Lcom/facebook/push/g;)V
    .locals 2

    .prologue
    .line 178
    invoke-static {p1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 179
    const-string v0, "invalid_payload"

    invoke-direct {p0, v0}, Lcom/facebook/orca/push/a/a;->b(Ljava/lang/String;)V

    .line 205
    :goto_0
    return-void

    .line 183
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/push/a/a;->k:Lcom/facebook/config/a/d;

    sget-object v1, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-eq v0, v1, :cond_1

    .line 185
    iget-object v0, p0, Lcom/facebook/orca/push/a/a;->i:Lcom/facebook/orca/push/h;

    iget-object v1, p0, Lcom/facebook/orca/push/a/a;->h:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v1}, Lcom/facebook/push/c2dm/y;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/push/h;->a(Ljava/lang/String;)Lcom/facebook/orca/push/i;

    move-result-object v0

    .line 187
    invoke-virtual {v0}, Lcom/facebook/orca/push/i;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 188
    sget-object v0, Lcom/facebook/orca/push/a/a;->a:Ljava/lang/Class;

    const-string v1, "User receives notifications in Messenger, eating notification"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 189
    const-string v0, "eaten_messenger"

    invoke-direct {p0, v0}, Lcom/facebook/orca/push/a/a;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 194
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/push/a/a;->h:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->j()Ljava/lang/String;

    move-result-object v0

    .line 195
    invoke-direct {p0, v0}, Lcom/facebook/orca/push/a/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 196
    sget-object v0, Lcom/facebook/orca/push/a/a;->a:Ljava/lang/Class;

    const-string v1, "Ignore logged out push since the user is logged in to FB4A"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 197
    const-string v0, "eaten_fb4a"

    invoke-direct {p0, v0}, Lcom/facebook/orca/push/a/a;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 202
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/push/a/a;->c:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->app_name:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 203
    new-instance v1, Lcom/facebook/orca/notify/w;

    invoke-direct {v1, v0, p1, p2}, Lcom/facebook/orca/notify/w;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/push/g;)V

    .line 204
    iget-object v0, p0, Lcom/facebook/orca/push/a/a;->d:Lcom/facebook/orca/push/b;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/push/b;->a(Lcom/facebook/orca/notify/w;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/push/g;)V
    .locals 3

    .prologue
    .line 209
    iget-object v0, p0, Lcom/facebook/orca/push/a/a;->e:Lcom/facebook/orca/push/a/b;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/push/a/b;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 210
    if-nez v0, :cond_0

    .line 211
    const-string v0, "invalid_payload"

    invoke-direct {p0, v0}, Lcom/facebook/orca/push/a/a;->b(Ljava/lang/String;)V

    .line 230
    :goto_0
    return-void

    .line 215
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/push/a/a;->k:Lcom/facebook/config/a/d;

    sget-object v2, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-eq v1, v2, :cond_1

    .line 217
    iget-object v1, p0, Lcom/facebook/orca/push/a/a;->i:Lcom/facebook/orca/push/h;

    iget-object v2, p0, Lcom/facebook/orca/push/a/a;->h:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v2}, Lcom/facebook/push/c2dm/y;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/push/h;->a(Ljava/lang/String;)Lcom/facebook/orca/push/i;

    move-result-object v1

    .line 219
    invoke-virtual {v1}, Lcom/facebook/orca/push/i;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 220
    sget-object v0, Lcom/facebook/orca/push/a/a;->a:Ljava/lang/Class;

    const-string v1, "User logged into Messenger, eating notification"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 221
    const-string v0, "eaten_messenger"

    invoke-direct {p0, v0}, Lcom/facebook/orca/push/a/a;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 226
    :cond_1
    sget-object v1, Lcom/facebook/orca/push/a/a;->a:Ljava/lang/Class;

    const-string v2, "Received C2DM push"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 227
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    .line 228
    iget-object v2, p0, Lcom/facebook/orca/push/a/a;->f:Lcom/facebook/l/k;

    invoke-virtual {v2, v0}, Lcom/facebook/l/k;->a(Lcom/facebook/messages/model/threads/Message;)V

    .line 229
    iget-object v2, p0, Lcom/facebook/orca/push/a/a;->d:Lcom/facebook/orca/push/b;

    invoke-virtual {v2, p1, v1, v0, p3}, Lcom/facebook/orca/push/b;->a(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 259
    iget-object v0, p0, Lcom/facebook/orca/push/a/a;->j:Lcom/facebook/auth/login/bm;

    invoke-virtual {v0}, Lcom/facebook/auth/login/bm;->a()Lcom/facebook/auth/credentials/b;

    move-result-object v0

    .line 260
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/auth/credentials/b;->a()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    .line 261
    :cond_0
    const/4 v0, 0x0

    .line 263
    :goto_0
    return v0

    :cond_1
    invoke-virtual {v0}, Lcom/facebook/auth/credentials/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method private b(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 3

    .prologue
    .line 276
    const-string v0, "params"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "params"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const-string v1, "trace_info"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    const-string v0, "params"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 278
    const-string v1, "trace_info"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 279
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 280
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 281
    const-string v2, "traceInfo"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    iget-object v0, p0, Lcom/facebook/orca/push/a/a;->n:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/c;

    .line 283
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/facebook/fbservice/ops/c;->b(Z)V

    .line 284
    sget-object v2, Lcom/facebook/orca/server/aq;->F:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v2, v1}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 287
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 267
    iget-object v0, p0, Lcom/facebook/orca/push/a/a;->g:Lcom/facebook/analytics/cn;

    const-string v1, ""

    const-string v2, ""

    sget-object v3, Lcom/facebook/push/h;->C2DM:Lcom/facebook/push/h;

    invoke-virtual {v3}, Lcom/facebook/push/h;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    return-void
.end method


# virtual methods
.method public a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/push/g;)V
    .locals 6

    .prologue
    .line 108
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 109
    const-string v1, "msg"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "orca_message"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "orca_friend_msg"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "orca_thread_read"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "webrtc_voip_call"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 114
    sget-object v1, Lcom/facebook/orca/push/a/a;->a:Ljava/lang/Class;

    const-string v2, "Ignoring FbPushData of type %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    :goto_0
    return-void

    .line 118
    :cond_0
    const-string v1, "is_logged_out_push"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v1

    .line 120
    const-string v2, "message"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    .line 121
    const-string v3, "params"

    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    .line 123
    iget-object v4, p0, Lcom/facebook/orca/push/a/a;->h:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v4}, Lcom/facebook/push/c2dm/y;->j()Ljava/lang/String;

    move-result-object v4

    .line 125
    invoke-static {v4}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 126
    sget-object v0, Lcom/facebook/orca/push/a/a;->a:Ljava/lang/Class;

    const-string v1, "No push receiver user set. Ignoring"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 127
    const-string v0, "no_user"

    invoke-direct {p0, v0}, Lcom/facebook/orca/push/a/a;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 131
    :cond_1
    const-string v5, "target_uid"

    invoke-virtual {p1, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    invoke-static {v5}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v5

    .line 132
    invoke-static {v5, v4}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 133
    sget-object v0, Lcom/facebook/orca/push/a/a;->a:Ljava/lang/Class;

    const-string v1, "Push notification intended for different user"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 134
    const-string v0, "eaten_wrong_user"

    invoke-direct {p0, v0}, Lcom/facebook/orca/push/a/a;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 138
    :cond_2
    iget-object v4, p0, Lcom/facebook/orca/push/a/a;->b:Lcom/facebook/auth/b/b;

    invoke-interface {v4}, Lcom/facebook/auth/b/b;->b()Z

    move-result v4

    .line 140
    if-nez v4, :cond_3

    if-nez v1, :cond_3

    .line 141
    sget-object v0, Lcom/facebook/orca/push/a/a;->a:Ljava/lang/Class;

    const-string v1, "Ignore push no loggedInUser"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 142
    const-string v0, "logged_out_user"

    invoke-direct {p0, v0}, Lcom/facebook/orca/push/a/a;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 146
    :cond_3
    if-eqz v4, :cond_4

    if-eqz v1, :cond_4

    .line 147
    sget-object v0, Lcom/facebook/orca/push/a/a;->a:Ljava/lang/Class;

    const-string v1, "Ignore logged out push since a user is logged in"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 148
    const-string v0, "logged_in_user"

    invoke-direct {p0, v0}, Lcom/facebook/orca/push/a/a;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 152
    :cond_4
    const-string v4, "msg"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    const-string v4, "orca_message"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 153
    :cond_5
    if-eqz v1, :cond_7

    .line 154
    invoke-direct {p0, v2, p2}, Lcom/facebook/orca/push/a/a;->a(Ljava/lang/String;Lcom/facebook/push/g;)V

    .line 174
    :cond_6
    :goto_1
    invoke-direct {p0, p1}, Lcom/facebook/orca/push/a/a;->b(Lcom/fasterxml/jackson/databind/JsonNode;)V

    goto/16 :goto_0

    .line 156
    :cond_7
    invoke-direct {p0, v2, v3, p2}, Lcom/facebook/orca/push/a/a;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/push/g;)V

    goto :goto_1

    .line 158
    :cond_8
    const-string v1, "orca_friend_msg"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 160
    iget-object v0, p0, Lcom/facebook/orca/push/a/a;->c:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->app_name:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 161
    invoke-static {v2, v0, v3}, Lcom/facebook/orca/push/a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/orca/push/a;

    move-result-object v0

    .line 163
    if-eqz v0, :cond_9

    .line 164
    iget-object v1, p0, Lcom/facebook/orca/push/a/a;->d:Lcom/facebook/orca/push/b;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/push/b;->a(Lcom/facebook/orca/push/a;)V

    goto :goto_1

    .line 166
    :cond_9
    const-string v0, "invalid_payload"

    invoke-direct {p0, v0}, Lcom/facebook/orca/push/a/a;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 168
    :cond_a
    const-string v1, "webrtc_voip_call"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 169
    iget-object v0, p0, Lcom/facebook/orca/push/a/a;->l:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/fbwebrtc/ag;->a(Lcom/fasterxml/jackson/databind/JsonNode;)V

    goto :goto_1

    .line 170
    :cond_b
    const-string v1, "orca_thread_read"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 171
    invoke-direct {p0, v3}, Lcom/facebook/orca/push/a/a;->a(Lcom/fasterxml/jackson/databind/JsonNode;)V

    goto :goto_1
.end method
