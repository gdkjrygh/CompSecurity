.class public Lcom/facebook/push/mqtt/ai;
.super Ljava/lang/Object;
.source "MqttForegroundStateSender.java"

# interfaces
.implements Lcom/facebook/base/c;


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
.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/common/v/a;

.field private final d:Lcom/facebook/common/v/d;

.field private final e:Lcom/facebook/push/mqtt/v;

.field private final f:Lcom/facebook/common/executors/a;

.field private final g:Lcom/facebook/prefs/shared/d;

.field private final h:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lcom/facebook/prefs/shared/f;

.field private final j:Ljava/util/concurrent/ExecutorService;

.field private k:Lcom/facebook/base/broadcast/q;

.field private l:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation
.end field

.field private m:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation
.end field

.field private n:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation
.end field

.field private final o:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    const-class v0, Lcom/facebook/push/mqtt/ai;

    sput-object v0, Lcom/facebook/push/mqtt/ai;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/v/a;Lcom/facebook/common/v/d;Lcom/facebook/push/mqtt/v;Lcom/facebook/common/executors/a;Lcom/facebook/prefs/shared/d;Ljavax/inject/a;Ljava/util/concurrent/ExecutorService;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/common/v/a;",
            "Lcom/facebook/common/v/d;",
            "Lcom/facebook/push/mqtt/v;",
            "Lcom/facebook/common/executors/a;",
            "Lcom/facebook/prefs/shared/d;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/concurrent/ExecutorService;",
            ")V"
        }
    .end annotation

    .prologue
    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    new-instance v0, Lcom/facebook/push/mqtt/aj;

    invoke-direct {v0, p0}, Lcom/facebook/push/mqtt/aj;-><init>(Lcom/facebook/push/mqtt/ai;)V

    iput-object v0, p0, Lcom/facebook/push/mqtt/ai;->o:Ljava/lang/Runnable;

    .line 82
    iput-object p1, p0, Lcom/facebook/push/mqtt/ai;->b:Landroid/content/Context;

    .line 83
    iput-object p2, p0, Lcom/facebook/push/mqtt/ai;->c:Lcom/facebook/common/v/a;

    .line 84
    iput-object p3, p0, Lcom/facebook/push/mqtt/ai;->d:Lcom/facebook/common/v/d;

    .line 85
    iput-object p4, p0, Lcom/facebook/push/mqtt/ai;->e:Lcom/facebook/push/mqtt/v;

    .line 86
    iput-object p5, p0, Lcom/facebook/push/mqtt/ai;->f:Lcom/facebook/common/executors/a;

    .line 87
    iput-object p6, p0, Lcom/facebook/push/mqtt/ai;->g:Lcom/facebook/prefs/shared/d;

    .line 88
    iput-object p7, p0, Lcom/facebook/push/mqtt/ai;->h:Ljavax/inject/a;

    .line 89
    iput-object p8, p0, Lcom/facebook/push/mqtt/ai;->j:Ljava/util/concurrent/ExecutorService;

    .line 91
    new-instance v0, Lcom/facebook/push/mqtt/ak;

    invoke-direct {v0, p0}, Lcom/facebook/push/mqtt/ak;-><init>(Lcom/facebook/push/mqtt/ai;)V

    iput-object v0, p0, Lcom/facebook/push/mqtt/ai;->i:Lcom/facebook/prefs/shared/f;

    .line 99
    return-void
.end method

.method static synthetic a(Lcom/facebook/push/mqtt/ai;)Lcom/facebook/push/mqtt/v;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/push/mqtt/ai;->e:Lcom/facebook/push/mqtt/v;

    return-object v0
.end method

.method private a(Lcom/facebook/prefs/shared/ae;)V
    .locals 4

    .prologue
    .line 211
    sget-object v0, Lcom/facebook/push/b/a;->a:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, p1}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    iget-object v0, p0, Lcom/facebook/push/mqtt/ai;->g:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/push/b/a;->a:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    .line 214
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v2, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 215
    const-string v2, "make_user_available_when_in_foreground"

    invoke-virtual {v1, v2, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 216
    iget-object v0, p0, Lcom/facebook/push/mqtt/ai;->e:Lcom/facebook/push/mqtt/v;

    const-string v2, "/set_client_settings"

    sget-object v3, Lcom/facebook/mqtt/x;->FIRE_AND_FORGET:Lcom/facebook/mqtt/x;

    invoke-virtual {v0, v2, v1, v3}, Lcom/facebook/push/mqtt/v;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/mqtt/x;)I

    .line 218
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/push/mqtt/ai;Lcom/facebook/prefs/shared/ae;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/ai;->a(Lcom/facebook/prefs/shared/ae;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/push/mqtt/ai;Z)Z
    .locals 0

    .prologue
    .line 36
    iput-boolean p1, p0, Lcom/facebook/push/mqtt/ai;->l:Z

    return p1
.end method

.method private a(ZZ)Z
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v1, 0x0

    .line 158
    new-instance v2, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v2, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 159
    const-string v0, "foreground"

    invoke-virtual {v2, v0, p1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 162
    iget-object v0, p0, Lcom/facebook/push/mqtt/ai;->h:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    const-string v0, "foreground_device"

    invoke-virtual {v2, v0, p2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 168
    :cond_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/ai;->e:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v0, p1}, Lcom/facebook/push/mqtt/v;->a(Z)Z

    move-result v3

    .line 170
    if-eqz v3, :cond_1

    .line 171
    iget-object v0, p0, Lcom/facebook/push/mqtt/ai;->e:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v0, p1}, Lcom/facebook/push/mqtt/v;->b(Z)I

    move-result v0

    .line 172
    sget-object v4, Lcom/facebook/push/mqtt/ai;->a:Ljava/lang/Class;

    const-string v5, "Sending /foreground_state appstate:%b with keepalive_timeout:%d seconds"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    aput-object v7, v6, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v6, v8

    invoke-static {v4, v5, v6}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    const-string v1, "keepalive_timeout"

    invoke-virtual {v2, v1, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 182
    :goto_0
    sget-object v1, Lcom/facebook/push/mqtt/ai;->a:Ljava/lang/Class;

    const-string v4, "Submitting publish foreground state runnable."

    invoke-static {v1, v4}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 183
    iget-object v1, p0, Lcom/facebook/push/mqtt/ai;->j:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Lcom/facebook/push/mqtt/am;

    invoke-direct {v4, p0, v2, v3, v0}, Lcom/facebook/push/mqtt/am;-><init>(Lcom/facebook/push/mqtt/ai;Lcom/fasterxml/jackson/databind/node/ObjectNode;ZI)V

    invoke-interface {v1, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 207
    return v8

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method static synthetic c()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 36
    sget-object v0, Lcom/facebook/push/mqtt/ai;->a:Ljava/lang/Class;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 103
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 104
    sget-object v1, Lcom/facebook/common/v/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 105
    sget-object v1, Lcom/facebook/common/v/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 106
    new-instance v1, Lcom/facebook/push/mqtt/al;

    iget-object v2, p0, Lcom/facebook/push/mqtt/ai;->b:Landroid/content/Context;

    invoke-direct {v1, p0, v2, v0}, Lcom/facebook/push/mqtt/al;-><init>(Lcom/facebook/push/mqtt/ai;Landroid/content/Context;Landroid/content/IntentFilter;)V

    iput-object v1, p0, Lcom/facebook/push/mqtt/ai;->k:Lcom/facebook/base/broadcast/q;

    .line 115
    iget-object v0, p0, Lcom/facebook/push/mqtt/ai;->k:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->a()V

    .line 116
    iget-object v0, p0, Lcom/facebook/push/mqtt/ai;->g:Lcom/facebook/prefs/shared/d;

    iget-object v1, p0, Lcom/facebook/push/mqtt/ai;->i:Lcom/facebook/prefs/shared/f;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 117
    return-void
.end method

.method b()V
    .locals 4
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    const-wide/16 v2, 0x2710

    .line 126
    iget-object v0, p0, Lcom/facebook/push/mqtt/ai;->c:Lcom/facebook/common/v/a;

    invoke-virtual {v0, v2, v3}, Lcom/facebook/common/v/a;->b(J)Z

    move-result v0

    .line 127
    iget-object v1, p0, Lcom/facebook/push/mqtt/ai;->d:Lcom/facebook/common/v/d;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/common/v/d;->a(J)Z

    move-result v1

    .line 131
    iget-boolean v2, p0, Lcom/facebook/push/mqtt/ai;->m:Z

    if-ne v2, v0, :cond_0

    iget-boolean v2, p0, Lcom/facebook/push/mqtt/ai;->n:Z

    if-eq v2, v1, :cond_1

    .line 134
    :cond_0
    invoke-direct {p0, v0, v1}, Lcom/facebook/push/mqtt/ai;->a(ZZ)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 135
    iput-boolean v0, p0, Lcom/facebook/push/mqtt/ai;->m:Z

    .line 136
    iput-boolean v1, p0, Lcom/facebook/push/mqtt/ai;->n:Z

    .line 141
    :cond_1
    if-nez v0, :cond_2

    if-eqz v1, :cond_3

    .line 142
    :cond_2
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/ai;->l:Z

    if-nez v0, :cond_3

    .line 143
    iget-object v0, p0, Lcom/facebook/push/mqtt/ai;->f:Lcom/facebook/common/executors/a;

    iget-object v1, p0, Lcom/facebook/push/mqtt/ai;->o:Ljava/lang/Runnable;

    const-wide/32 v2, 0xea60

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/common/executors/a;->a(Ljava/lang/Runnable;J)V

    .line 144
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/push/mqtt/ai;->l:Z

    .line 147
    :cond_3
    return-void
.end method
