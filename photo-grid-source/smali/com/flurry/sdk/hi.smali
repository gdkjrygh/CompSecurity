.class public Lcom/flurry/sdk/hi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/kf;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Lcom/flurry/sdk/id;

.field private c:Lcom/flurry/sdk/iv;

.field private d:Lcom/flurry/sdk/if;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const-class v0, Lcom/flurry/sdk/hi;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/hi;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    return-void
.end method

.method public static declared-synchronized a()Lcom/flurry/sdk/hi;
    .locals 3

    .prologue
    .line 28
    const-class v1, Lcom/flurry/sdk/hi;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    const-class v2, Lcom/flurry/sdk/hi;

    invoke-virtual {v0, v2}, Lcom/flurry/sdk/jo;->a(Ljava/lang/Class;)Lcom/flurry/sdk/kf;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/hi;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private a(Lcom/flurry/sdk/lb;)Lcom/flurry/sdk/iy;
    .locals 1

    .prologue
    .line 250
    if-nez p1, :cond_0

    .line 251
    const/4 v0, 0x0

    .line 254
    :goto_0
    return-object v0

    :cond_0
    const-class v0, Lcom/flurry/sdk/iy;

    invoke-virtual {p1, v0}, Lcom/flurry/sdk/lb;->c(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/iy;

    goto :goto_0
.end method

.method private b(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 56
    const-string v0, "android.permission.INTERNET"

    invoke-static {p1, v0}, Lcom/flurry/sdk/lp;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 57
    sget-object v0, Lcom/flurry/sdk/hi;->a:Ljava/lang/String;

    const-string v1, "Application must declare permission: android.permission.INTERNET"

    invoke-static {v0, v1}, Lcom/flurry/sdk/kc;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    :cond_0
    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {p1, v0}, Lcom/flurry/sdk/lp;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 62
    sget-object v0, Lcom/flurry/sdk/hi;->a:Ljava/lang/String;

    const-string v1, "It is highly recommended that the application declare permission: android.permission.ACCESS_NETWORK_STATE"

    invoke-static {v0, v1}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    :cond_1
    return-void
.end method

.method private h()Lcom/flurry/sdk/iy;
    .locals 1

    .prologue
    .line 246
    invoke-static {}, Lcom/flurry/sdk/ld;->a()Lcom/flurry/sdk/ld;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/ld;->e()Lcom/flurry/sdk/lb;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/flurry/sdk/hi;->a(Lcom/flurry/sdk/lb;)Lcom/flurry/sdk/iy;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/flurry/android/FlurryEventRecordStatus;
    .locals 3

    .prologue
    .line 104
    invoke-direct {p0}, Lcom/flurry/sdk/hi;->h()Lcom/flurry/sdk/iy;

    move-result-object v1

    .line 105
    sget-object v0, Lcom/flurry/android/FlurryEventRecordStatus;->kFlurryEventFailed:Lcom/flurry/android/FlurryEventRecordStatus;

    .line 106
    if-eqz v1, :cond_0

    .line 107
    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/flurry/sdk/iy;->a(Ljava/lang/String;Ljava/util/Map;Z)Lcom/flurry/android/FlurryEventRecordStatus;

    move-result-object v0

    .line 109
    :cond_0
    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/flurry/android/FlurryEventRecordStatus;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/flurry/android/FlurryEventRecordStatus;"
        }
    .end annotation

    .prologue
    .line 122
    invoke-direct {p0}, Lcom/flurry/sdk/hi;->h()Lcom/flurry/sdk/iy;

    move-result-object v1

    .line 123
    sget-object v0, Lcom/flurry/android/FlurryEventRecordStatus;->kFlurryEventFailed:Lcom/flurry/android/FlurryEventRecordStatus;

    .line 124
    if-eqz v1, :cond_0

    .line 125
    const/4 v0, 0x0

    invoke-virtual {v1, p1, p2, p3, v0}, Lcom/flurry/sdk/iy;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)Lcom/flurry/android/FlurryEventRecordStatus;

    move-result-object v0

    .line 127
    :cond_0
    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;)Lcom/flurry/android/FlurryEventRecordStatus;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/flurry/android/FlurryEventRecordStatus;"
        }
    .end annotation

    .prologue
    .line 113
    invoke-direct {p0}, Lcom/flurry/sdk/hi;->h()Lcom/flurry/sdk/iy;

    move-result-object v1

    .line 114
    sget-object v0, Lcom/flurry/android/FlurryEventRecordStatus;->kFlurryEventFailed:Lcom/flurry/android/FlurryEventRecordStatus;

    .line 115
    if-eqz v1, :cond_0

    .line 116
    const/4 v0, 0x0

    invoke-virtual {v1, p1, p2, v0}, Lcom/flurry/sdk/iy;->a(Ljava/lang/String;Ljava/util/Map;Z)Lcom/flurry/android/FlurryEventRecordStatus;

    move-result-object v0

    .line 118
    :cond_0
    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;Z)Lcom/flurry/android/FlurryEventRecordStatus;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)",
            "Lcom/flurry/android/FlurryEventRecordStatus;"
        }
    .end annotation

    .prologue
    .line 151
    invoke-direct {p0}, Lcom/flurry/sdk/hi;->h()Lcom/flurry/sdk/iy;

    move-result-object v1

    .line 152
    sget-object v0, Lcom/flurry/android/FlurryEventRecordStatus;->kFlurryEventFailed:Lcom/flurry/android/FlurryEventRecordStatus;

    .line 154
    if-eqz v1, :cond_0

    .line 155
    invoke-virtual {v1, p1, p2, p3}, Lcom/flurry/sdk/iy;->a(Ljava/lang/String;Ljava/util/Map;Z)Lcom/flurry/android/FlurryEventRecordStatus;

    move-result-object v0

    .line 157
    :cond_0
    return-object v0
.end method

.method public a(Ljava/lang/String;Z)Lcom/flurry/android/FlurryEventRecordStatus;
    .locals 2

    .prologue
    .line 141
    invoke-direct {p0}, Lcom/flurry/sdk/hi;->h()Lcom/flurry/sdk/iy;

    move-result-object v1

    .line 142
    sget-object v0, Lcom/flurry/android/FlurryEventRecordStatus;->kFlurryEventFailed:Lcom/flurry/android/FlurryEventRecordStatus;

    .line 144
    if-eqz v1, :cond_0

    .line 145
    const/4 v0, 0x0

    invoke-virtual {v1, p1, v0, p2}, Lcom/flurry/sdk/iy;->a(Ljava/lang/String;Ljava/util/Map;Z)Lcom/flurry/android/FlurryEventRecordStatus;

    move-result-object v0

    .line 147
    :cond_0
    return-object v0
.end method

.method public a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 41
    const-class v0, Lcom/flurry/sdk/iy;

    invoke-static {v0}, Lcom/flurry/sdk/lb;->a(Ljava/lang/Class;)V

    .line 43
    new-instance v0, Lcom/flurry/sdk/iv;

    invoke-direct {v0}, Lcom/flurry/sdk/iv;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/hi;->c:Lcom/flurry/sdk/iv;

    .line 44
    new-instance v0, Lcom/flurry/sdk/id;

    invoke-direct {v0}, Lcom/flurry/sdk/id;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/hi;->b:Lcom/flurry/sdk/id;

    .line 45
    new-instance v0, Lcom/flurry/sdk/if;

    invoke-direct {v0}, Lcom/flurry/sdk/if;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/hi;->d:Lcom/flurry/sdk/if;

    .line 47
    invoke-direct {p0, p1}, Lcom/flurry/sdk/hi;->b(Landroid/content/Context;)V

    .line 48
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    const/4 v4, 0x2

    .line 178
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    .line 179
    if-eqz v1, :cond_1

    array-length v0, v1

    if-le v0, v4, :cond_1

    .line 181
    array-length v0, v1

    add-int/lit8 v0, v0, -0x2

    new-array v0, v0, [Ljava/lang/StackTraceElement;

    .line 182
    const/4 v2, 0x0

    array-length v3, v0

    invoke-static {v1, v4, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 185
    :goto_0
    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 186
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 187
    invoke-direct {p0}, Lcom/flurry/sdk/hi;->h()Lcom/flurry/sdk/iy;

    move-result-object v0

    .line 188
    if-eqz v0, :cond_0

    .line 189
    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/flurry/sdk/iy;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 191
    :cond_0
    return-void

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 194
    invoke-direct {p0}, Lcom/flurry/sdk/hi;->h()Lcom/flurry/sdk/iy;

    move-result-object v0

    .line 195
    if-eqz v0, :cond_0

    .line 196
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1, p3}, Lcom/flurry/sdk/iy;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 198
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/flurry/android/FlurryEventRecordStatus;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/flurry/android/FlurryEventRecordStatus;"
        }
    .end annotation

    .prologue
    .line 131
    invoke-direct {p0}, Lcom/flurry/sdk/hi;->h()Lcom/flurry/sdk/iy;

    move-result-object v1

    .line 132
    sget-object v0, Lcom/flurry/android/FlurryEventRecordStatus;->kFlurryEventFailed:Lcom/flurry/android/FlurryEventRecordStatus;

    .line 133
    if-eqz v1, :cond_0

    .line 134
    invoke-static {p2}, Lcom/flurry/sdk/ja;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 135
    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, p3, v2}, Lcom/flurry/sdk/iy;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)Lcom/flurry/android/FlurryEventRecordStatus;

    move-result-object v0

    .line 137
    :cond_0
    return-object v0
.end method

.method public b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 68
    iget-object v0, p0, Lcom/flurry/sdk/hi;->d:Lcom/flurry/sdk/if;

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/flurry/sdk/hi;->d:Lcom/flurry/sdk/if;

    invoke-virtual {v0}, Lcom/flurry/sdk/if;->c()V

    .line 70
    iput-object v1, p0, Lcom/flurry/sdk/hi;->d:Lcom/flurry/sdk/if;

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/flurry/sdk/hi;->c:Lcom/flurry/sdk/iv;

    if-eqz v0, :cond_1

    .line 74
    iget-object v0, p0, Lcom/flurry/sdk/hi;->c:Lcom/flurry/sdk/iv;

    invoke-virtual {v0}, Lcom/flurry/sdk/iv;->a()V

    .line 75
    iput-object v1, p0, Lcom/flurry/sdk/hi;->c:Lcom/flurry/sdk/iv;

    .line 78
    :cond_1
    iget-object v0, p0, Lcom/flurry/sdk/hi;->b:Lcom/flurry/sdk/id;

    if-eqz v0, :cond_2

    .line 79
    iget-object v0, p0, Lcom/flurry/sdk/hi;->b:Lcom/flurry/sdk/id;

    invoke-virtual {v0}, Lcom/flurry/sdk/id;->a()V

    .line 80
    iput-object v1, p0, Lcom/flurry/sdk/hi;->b:Lcom/flurry/sdk/id;

    .line 83
    :cond_2
    const-class v0, Lcom/flurry/sdk/iy;

    invoke-static {v0}, Lcom/flurry/sdk/lb;->b(Ljava/lang/Class;)V

    .line 84
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 161
    invoke-direct {p0}, Lcom/flurry/sdk/hi;->h()Lcom/flurry/sdk/iy;

    move-result-object v0

    .line 162
    if-eqz v0, :cond_0

    .line 163
    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/flurry/sdk/iy;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 165
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 169
    invoke-direct {p0}, Lcom/flurry/sdk/hi;->h()Lcom/flurry/sdk/iy;

    move-result-object v0

    .line 170
    if-eqz v0, :cond_0

    .line 171
    invoke-virtual {v0, p1, p2}, Lcom/flurry/sdk/iy;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 173
    :cond_0
    return-void
.end method

.method public c()Lcom/flurry/sdk/id;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/flurry/sdk/hi;->b:Lcom/flurry/sdk/id;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 201
    invoke-direct {p0}, Lcom/flurry/sdk/hi;->h()Lcom/flurry/sdk/iy;

    move-result-object v0

    .line 202
    if-eqz v0, :cond_0

    .line 203
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lcom/flurry/sdk/iy;->a(Ljava/lang/String;Ljava/util/Map;Z)Lcom/flurry/android/FlurryEventRecordStatus;

    .line 205
    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 208
    invoke-direct {p0}, Lcom/flurry/sdk/hi;->h()Lcom/flurry/sdk/iy;

    move-result-object v0

    .line 209
    if-eqz v0, :cond_0

    .line 210
    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lcom/flurry/sdk/iy;->a(Ljava/lang/String;Ljava/util/Map;Z)Lcom/flurry/android/FlurryEventRecordStatus;

    .line 212
    :cond_0
    return-void
.end method

.method public d()Lcom/flurry/sdk/iv;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/flurry/sdk/hi;->c:Lcom/flurry/sdk/iv;

    return-object v0
.end method

.method public e()Lcom/flurry/sdk/if;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/flurry/sdk/hi;->d:Lcom/flurry/sdk/if;

    return-object v0
.end method

.method public f()V
    .locals 1

    .prologue
    .line 97
    invoke-direct {p0}, Lcom/flurry/sdk/hi;->h()Lcom/flurry/sdk/iy;

    move-result-object v0

    .line 98
    if-eqz v0, :cond_0

    .line 99
    invoke-virtual {v0}, Lcom/flurry/sdk/iy;->a()V

    .line 101
    :cond_0
    return-void
.end method

.method public g()V
    .locals 1

    .prologue
    .line 215
    invoke-direct {p0}, Lcom/flurry/sdk/hi;->h()Lcom/flurry/sdk/iy;

    move-result-object v0

    .line 216
    if-eqz v0, :cond_0

    .line 217
    invoke-virtual {v0}, Lcom/flurry/sdk/iy;->b()V

    .line 219
    :cond_0
    return-void
.end method
