.class Lcom/facebook/config/server/b;
.super Ljava/lang/Object;
.source "DefaultServerConfig.java"

# interfaces
.implements Lcom/facebook/config/server/j;


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
.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Lcom/facebook/base/broadcast/a;

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

.field private final f:Lcom/facebook/config/a/a;

.field private final g:Lcom/facebook/prefs/shared/f;

.field private final h:Lcom/facebook/common/v/a;

.field private final i:Ljava/lang/String;

.field private final j:Lcom/facebook/http/c/i;

.field private final k:Lcom/facebook/mqtt/t;

.field private l:Lcom/facebook/http/c/i;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private m:Lcom/facebook/http/c/i;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private n:Lcom/facebook/mqtt/t;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private o:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/facebook/config/server/b;

    sput-object v0, Lcom/facebook/config/server/b;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/base/broadcast/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/config/a/a;Lcom/facebook/common/v/a;Lcom/facebook/config/server/q;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/base/broadcast/a;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/config/a/a;",
            "Lcom/facebook/common/v/a;",
            "Lcom/facebook/config/server/q;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lcom/facebook/config/server/b;->b:Lcom/facebook/prefs/shared/d;

    .line 63
    iput-object p2, p0, Lcom/facebook/config/server/b;->c:Lcom/facebook/base/broadcast/a;

    .line 64
    iput-object p3, p0, Lcom/facebook/config/server/b;->d:Ljavax/inject/a;

    .line 65
    iput-object p4, p0, Lcom/facebook/config/server/b;->e:Ljavax/inject/a;

    .line 66
    iput-object p5, p0, Lcom/facebook/config/server/b;->f:Lcom/facebook/config/a/a;

    .line 67
    iput-object p6, p0, Lcom/facebook/config/server/b;->h:Lcom/facebook/common/v/a;

    .line 68
    new-instance v0, Lcom/facebook/config/server/c;

    invoke-direct {v0, p0}, Lcom/facebook/config/server/c;-><init>(Lcom/facebook/config/server/b;)V

    iput-object v0, p0, Lcom/facebook/config/server/b;->g:Lcom/facebook/prefs/shared/f;

    .line 76
    iget-object v0, p0, Lcom/facebook/config/server/b;->g:Lcom/facebook/prefs/shared/f;

    invoke-interface {p1, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 77
    invoke-virtual {p7}, Lcom/facebook/config/server/q;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/config/server/b;->i:Ljava/lang/String;

    .line 78
    new-instance v0, Lcom/facebook/config/server/i;

    new-instance v1, Lcom/facebook/http/c/j;

    const-string v2, "facebook.com"

    invoke-direct {v1, v2, v4}, Lcom/facebook/http/c/j;-><init>(Ljava/lang/String;Z)V

    iget-object v2, p0, Lcom/facebook/config/server/b;->i:Ljava/lang/String;

    invoke-direct {v0, v1, p6, v2}, Lcom/facebook/config/server/i;-><init>(Lcom/facebook/http/c/i;Lcom/facebook/common/v/a;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/config/server/b;->j:Lcom/facebook/http/c/i;

    .line 83
    new-instance v0, Lcom/facebook/mqtt/t;

    const-string v1, "orcart.facebook.com"

    const/16 v2, 0x146c

    const/16 v3, 0x1bb

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/mqtt/t;-><init>(Ljava/lang/String;IIZ)V

    iput-object v0, p0, Lcom/facebook/config/server/b;->k:Lcom/facebook/mqtt/t;

    .line 84
    return-void
.end method

.method private a(Ljava/lang/String;Z)Lcom/facebook/http/c/i;
    .locals 4

    .prologue
    .line 130
    new-instance v0, Lcom/facebook/config/server/i;

    new-instance v1, Lcom/facebook/http/c/j;

    invoke-direct {v1, p1, p2}, Lcom/facebook/http/c/j;-><init>(Ljava/lang/String;Z)V

    iget-object v2, p0, Lcom/facebook/config/server/b;->h:Lcom/facebook/common/v/a;

    invoke-virtual {p0}, Lcom/facebook/config/server/b;->e()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/config/server/i;-><init>(Lcom/facebook/http/c/i;Lcom/facebook/common/v/a;Ljava/lang/String;)V

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/config/server/b;Lcom/facebook/prefs/shared/ae;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1}, Lcom/facebook/config/server/b;->a(Lcom/facebook/prefs/shared/ae;)V

    return-void
.end method

.method private declared-synchronized a(Lcom/facebook/prefs/shared/ae;)V
    .locals 2

    .prologue
    .line 87
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/facebook/http/f/c;->i:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1, v0}, Lcom/facebook/prefs/shared/ae;->a(Lcom/facebook/common/s/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 88
    iget-object v0, p0, Lcom/facebook/config/server/b;->l:Lcom/facebook/http/c/i;

    if-eqz v0, :cond_0

    .line 89
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/config/server/b;->l:Lcom/facebook/http/c/i;

    .line 90
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/config/server/b;->o:Z

    .line 91
    iget-object v0, p0, Lcom/facebook/config/server/b;->c:Lcom/facebook/base/broadcast/a;

    const-string v1, "com.facebook.config.server.ACTION_SERVER_CONFIG_CHANGED"

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 93
    :cond_1
    :try_start_1
    sget-object v0, Lcom/facebook/http/f/c;->l:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1, v0}, Lcom/facebook/prefs/shared/ae;->a(Lcom/facebook/common/s/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/facebook/config/server/b;->n:Lcom/facebook/mqtt/t;

    if-eqz v0, :cond_0

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/config/server/b;->n:Lcom/facebook/mqtt/t;

    .line 96
    iget-object v0, p0, Lcom/facebook/config/server/b;->c:Lcom/facebook/base/broadcast/a;

    const-string v1, "com.facebook.mqtt.ACTION_MQTT_CONFIG_CHANGED"

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 87
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private f()Z
    .locals 2

    .prologue
    .line 138
    iget-object v0, p0, Lcom/facebook/config/server/b;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/config/server/b;->f:Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->h()Lcom/facebook/config/a/b;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/a/b;->PUBLIC:Lcom/facebook/config/a/b;

    if-eq v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private g()V
    .locals 5
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 144
    iget-object v0, p0, Lcom/facebook/config/server/b;->l:Lcom/facebook/http/c/i;

    if-eqz v0, :cond_1

    .line 172
    :cond_0
    :goto_0
    return-void

    .line 147
    :cond_1
    invoke-direct {p0}, Lcom/facebook/config/server/b;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 148
    iget-object v0, p0, Lcom/facebook/config/server/b;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/http/f/c;->j:Lcom/facebook/prefs/shared/ae;

    const-string v2, "default"

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 150
    const-string v1, "intern"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 151
    const-string v0, "intern.facebook.com"

    invoke-direct {p0, v0, v4}, Lcom/facebook/config/server/b;->a(Ljava/lang/String;Z)Lcom/facebook/http/c/i;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/config/server/b;->l:Lcom/facebook/http/c/i;

    .line 168
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/facebook/config/server/b;->l:Lcom/facebook/http/c/i;

    if-nez v0, :cond_0

    .line 169
    iget-object v0, p0, Lcom/facebook/config/server/b;->j:Lcom/facebook/http/c/i;

    iput-object v0, p0, Lcom/facebook/config/server/b;->l:Lcom/facebook/http/c/i;

    .line 170
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/config/server/b;->o:Z

    goto :goto_0

    .line 152
    :cond_3
    const-string v1, "dev"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 153
    const-string v0, "dev.facebook.com"

    invoke-direct {p0, v0, v4}, Lcom/facebook/config/server/b;->a(Ljava/lang/String;Z)Lcom/facebook/http/c/i;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/config/server/b;->l:Lcom/facebook/http/c/i;

    goto :goto_1

    .line 154
    :cond_4
    const-string v1, "sandbox"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 155
    iget-object v0, p0, Lcom/facebook/config/server/b;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/http/f/c;->k:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 157
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 159
    :try_start_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    :goto_2
    invoke-direct {p0, v0, v4}, Lcom/facebook/config/server/b;->a(Ljava/lang/String;Z)Lcom/facebook/http/c/i;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/config/server/b;->l:Lcom/facebook/http/c/i;

    goto :goto_1

    .line 160
    :catch_0
    move-exception v1

    .line 161
    sget-object v2, Lcom/facebook/config/server/b;->a:Ljava/lang/Class;

    const-string v3, "Failed to parse web sandbox URL"

    invoke-static {v2, v3, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2
.end method

.method private h()V
    .locals 5
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation

    .prologue
    .line 176
    iget-object v0, p0, Lcom/facebook/config/server/b;->n:Lcom/facebook/mqtt/t;

    if-eqz v0, :cond_1

    .line 205
    :cond_0
    :goto_0
    return-void

    .line 179
    :cond_1
    invoke-direct {p0}, Lcom/facebook/config/server/b;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 180
    iget-object v0, p0, Lcom/facebook/config/server/b;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/http/f/c;->m:Lcom/facebook/prefs/shared/ae;

    const-string v2, "default"

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 182
    const-string v1, "sandbox"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 183
    iget-object v0, p0, Lcom/facebook/config/server/b;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/http/f/c;->n:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 185
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 187
    :try_start_0
    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 188
    const-string v1, ":"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    .line 189
    const/4 v1, 0x0

    aget-object v1, v0, v1

    .line 190
    const/4 v2, 0x1

    aget-object v0, v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 191
    new-instance v2, Lcom/facebook/mqtt/t;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v0, v0, v3}, Lcom/facebook/mqtt/t;-><init>(Ljava/lang/String;IIZ)V

    iput-object v2, p0, Lcom/facebook/config/server/b;->n:Lcom/facebook/mqtt/t;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/facebook/config/server/b;->n:Lcom/facebook/mqtt/t;

    if-nez v0, :cond_0

    .line 203
    iget-object v0, p0, Lcom/facebook/config/server/b;->k:Lcom/facebook/mqtt/t;

    iput-object v0, p0, Lcom/facebook/config/server/b;->n:Lcom/facebook/mqtt/t;

    goto :goto_0

    .line 193
    :cond_3
    :try_start_1
    new-instance v1, Lcom/facebook/mqtt/t;

    const/16 v2, 0x22b3

    const/16 v3, 0x22b3

    const/4 v4, 0x0

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/facebook/mqtt/t;-><init>(Ljava/lang/String;IIZ)V

    iput-object v1, p0, Lcom/facebook/config/server/b;->n:Lcom/facebook/mqtt/t;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 195
    :catch_0
    move-exception v0

    .line 196
    sget-object v1, Lcom/facebook/config/server/b;->a:Ljava/lang/Class;

    const-string v2, "Failed to parse mqtt sandbox URL"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method private i()V
    .locals 4
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation

    .prologue
    .line 209
    iget-object v0, p0, Lcom/facebook/config/server/b;->m:Lcom/facebook/http/c/i;

    if-eqz v0, :cond_0

    .line 221
    :goto_0
    return-void

    .line 213
    :cond_0
    iget-object v0, p0, Lcom/facebook/config/server/b;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 214
    new-instance v0, Lcom/facebook/config/server/i;

    new-instance v1, Lcom/facebook/config/server/a;

    invoke-direct {v1}, Lcom/facebook/config/server/a;-><init>()V

    iget-object v2, p0, Lcom/facebook/config/server/b;->h:Lcom/facebook/common/v/a;

    invoke-virtual {p0}, Lcom/facebook/config/server/b;->e()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/config/server/i;-><init>(Lcom/facebook/http/c/i;Lcom/facebook/common/v/a;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/config/server/b;->m:Lcom/facebook/http/c/i;

    goto :goto_0

    .line 219
    :cond_1
    iget-object v0, p0, Lcom/facebook/config/server/b;->l:Lcom/facebook/http/c/i;

    iput-object v0, p0, Lcom/facebook/config/server/b;->m:Lcom/facebook/http/c/i;

    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized a()Lcom/facebook/http/c/i;
    .locals 1

    .prologue
    .line 103
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/config/server/b;->g()V

    .line 104
    iget-object v0, p0, Lcom/facebook/config/server/b;->l:Lcom/facebook/http/c/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 103
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public b()Lcom/facebook/http/c/i;
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/facebook/config/server/b;->j:Lcom/facebook/http/c/i;

    return-object v0
.end method

.method public declared-synchronized c()Lcom/facebook/http/c/i;
    .locals 1

    .prologue
    .line 114
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/config/server/b;->i()V

    .line 115
    iget-object v0, p0, Lcom/facebook/config/server/b;->m:Lcom/facebook/http/c/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 114
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d()Lcom/facebook/mqtt/t;
    .locals 1

    .prologue
    .line 120
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/config/server/b;->h()V

    .line 121
    iget-object v0, p0, Lcom/facebook/config/server/b;->n:Lcom/facebook/mqtt/t;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 120
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/facebook/config/server/b;->i:Ljava/lang/String;

    return-object v0
.end method
