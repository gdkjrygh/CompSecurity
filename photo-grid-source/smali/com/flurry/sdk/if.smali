.class public Lcom/flurry/sdk/if;
.super Lcom/flurry/sdk/ko;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/flurry/sdk/ko",
        "<",
        "Lcom/flurry/sdk/ig;",
        ">;"
    }
.end annotation


# static fields
.field public static a:J

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/flurry/sdk/if;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/if;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/flurry/sdk/ko;-><init>()V

    .line 36
    const-wide/16 v0, 0x7530

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/if;->a(J)V

    .line 37
    return-void
.end method

.method static synthetic a(Lcom/flurry/sdk/if;Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1, p2}, Lcom/flurry/sdk/if;->b(Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;)V

    return-void
.end method

.method static synthetic a(Lcom/flurry/sdk/if;Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;Lcom/flurry/sdk/kj;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1, p2, p3}, Lcom/flurry/sdk/if;->a(Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;Lcom/flurry/sdk/kj;)V

    return-void
.end method

.method static synthetic a(Lcom/flurry/sdk/if;Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1, p2, p3}, Lcom/flurry/sdk/if;->a(Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;)V
    .locals 4

    .prologue
    .line 186
    const/4 v0, 0x3

    sget-object v1, Lcom/flurry/sdk/if;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/flurry/sdk/ig;->m()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " report sent successfully to : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/flurry/sdk/ig;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 188
    invoke-static {}, Lcom/flurry/sdk/ij;->a()Lcom/flurry/sdk/ij;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/flurry/sdk/ij;->a(Lcom/flurry/sdk/ih;)V

    .line 189
    invoke-virtual {p0, p2}, Lcom/flurry/sdk/if;->c(Lcom/flurry/sdk/kn;)V

    .line 190
    return-void
.end method

.method private a(Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;Lcom/flurry/sdk/kj;)V
    .locals 6

    .prologue
    const/4 v5, 0x3

    .line 195
    const/4 v0, 0x0

    .line 197
    const-string v1, "Location"

    invoke-virtual {p3, v1}, Lcom/flurry/sdk/kj;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 198
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 199
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p2}, Lcom/flurry/sdk/ig;->s()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/flurry/sdk/lt;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 202
    :cond_0
    invoke-static {}, Lcom/flurry/sdk/ij;->a()Lcom/flurry/sdk/ij;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/flurry/sdk/ij;->a(Lcom/flurry/sdk/ih;Ljava/lang/String;)Z

    move-result v1

    .line 204
    if-eqz v1, :cond_1

    .line 205
    sget-object v2, Lcom/flurry/sdk/if;->b:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Received redirect url. Retrying: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v2, v3}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 212
    :goto_0
    if-eqz v1, :cond_2

    .line 213
    invoke-virtual {p2, v0}, Lcom/flurry/sdk/ig;->c(Ljava/lang/String;)V

    .line 214
    invoke-virtual {p3, v0}, Lcom/flurry/sdk/kj;->a(Ljava/lang/String;)V

    .line 215
    const-string v0, "Location"

    invoke-virtual {p3, v0}, Lcom/flurry/sdk/kj;->c(Ljava/lang/String;)V

    .line 216
    invoke-static {}, Lcom/flurry/sdk/jm;->a()Lcom/flurry/sdk/jm;

    move-result-object v0

    invoke-virtual {v0, p0, p3}, Lcom/flurry/sdk/jm;->a(Ljava/lang/Object;Lcom/flurry/sdk/ls;)V

    .line 221
    :goto_1
    return-void

    .line 208
    :cond_1
    sget-object v2, Lcom/flurry/sdk/if;->b:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Received redirect url. Retrying: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v2, v3}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 219
    :cond_2
    invoke-virtual {p0, p2}, Lcom/flurry/sdk/if;->c(Lcom/flurry/sdk/kn;)V

    goto :goto_1
.end method

.method private a(Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 226
    invoke-static {}, Lcom/flurry/sdk/ij;->a()Lcom/flurry/sdk/ij;

    move-result-object v0

    invoke-virtual {v0, p1, p3}, Lcom/flurry/sdk/ij;->b(Lcom/flurry/sdk/ih;Ljava/lang/String;)Z

    move-result v0

    .line 228
    const/4 v1, 0x3

    sget-object v2, Lcom/flurry/sdk/if;->b:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed report retrying: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 230
    if-eqz v0, :cond_0

    .line 231
    invoke-virtual {p0, p2}, Lcom/flurry/sdk/if;->d(Lcom/flurry/sdk/kn;)V

    .line 236
    :goto_0
    return-void

    .line 234
    :cond_0
    invoke-virtual {p0, p2}, Lcom/flurry/sdk/if;->c(Lcom/flurry/sdk/kn;)V

    goto :goto_0
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/flurry/sdk/if;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/flurry/sdk/if;Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1, p2}, Lcom/flurry/sdk/if;->a(Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;)V

    return-void
.end method

.method private b(Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;)V
    .locals 1

    .prologue
    .line 240
    invoke-static {}, Lcom/flurry/sdk/ij;->a()Lcom/flurry/sdk/ij;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/flurry/sdk/ij;->b(Lcom/flurry/sdk/ih;)V

    .line 242
    invoke-virtual {p0, p2}, Lcom/flurry/sdk/if;->c(Lcom/flurry/sdk/kn;)V

    .line 243
    return-void
.end method


# virtual methods
.method protected a()Lcom/flurry/sdk/jv;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/flurry/sdk/jv",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/ig;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 41
    new-instance v0, Lcom/flurry/sdk/jv;

    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v1

    const-string v2, ".yflurryanpulsecallbackreporter"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const-string v2, ".yflurryanpulsecallbackreporter"

    const/4 v3, 0x2

    new-instance v4, Lcom/flurry/sdk/if$1;

    invoke-direct {v4, p0}, Lcom/flurry/sdk/if$1;-><init>(Lcom/flurry/sdk/if;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/flurry/sdk/jv;-><init>(Ljava/io/File;Ljava/lang/String;ILcom/flurry/sdk/la;)V

    return-object v0
.end method

.method protected a(Lcom/flurry/sdk/ig;)V
    .locals 10

    .prologue
    const-wide/16 v8, 0x0

    const/4 v7, 0x1

    .line 51
    const/4 v0, 0x3

    sget-object v1, Lcom/flurry/sdk/if;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Sending next pulse report to "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/flurry/sdk/ig;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " at: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/flurry/sdk/ig;->t()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 54
    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jb;->d()J

    move-result-wide v2

    .line 57
    cmp-long v0, v2, v8

    if-nez v0, :cond_0

    .line 58
    sget-wide v2, Lcom/flurry/sdk/if;->a:J

    .line 61
    :cond_0
    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jb;->g()J

    move-result-wide v4

    .line 64
    cmp-long v0, v4, v8

    if-nez v0, :cond_1

    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v4, v0, v2

    .line 68
    :cond_1
    invoke-virtual {p1}, Lcom/flurry/sdk/ig;->r()I

    move-result v6

    .line 71
    new-instance v0, Lcom/flurry/sdk/ih;

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/flurry/sdk/ih;-><init>(Lcom/flurry/sdk/ig;JJI)V

    .line 75
    new-instance v3, Lcom/flurry/sdk/kj;

    invoke-direct {v3}, Lcom/flurry/sdk/kj;-><init>()V

    .line 76
    invoke-virtual {p1}, Lcom/flurry/sdk/ig;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/flurry/sdk/kj;->a(Ljava/lang/String;)V

    .line 77
    const v1, 0x186a0

    invoke-virtual {v3, v1}, Lcom/flurry/sdk/kj;->d(I)V

    .line 80
    invoke-virtual {p1}, Lcom/flurry/sdk/ig;->f()Lcom/flurry/sdk/in;

    move-result-object v1

    sget-object v2, Lcom/flurry/sdk/in;->c:Lcom/flurry/sdk/in;

    invoke-virtual {v1, v2}, Lcom/flurry/sdk/in;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 81
    new-instance v1, Lcom/flurry/sdk/kt;

    invoke-direct {v1}, Lcom/flurry/sdk/kt;-><init>()V

    invoke-virtual {v3, v1}, Lcom/flurry/sdk/kj;->a(Lcom/flurry/sdk/kx;)V

    .line 83
    invoke-virtual {p1}, Lcom/flurry/sdk/ig;->l()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 84
    invoke-virtual {p1}, Lcom/flurry/sdk/ig;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    .line 85
    invoke-virtual {v3, v1}, Lcom/flurry/sdk/kj;->a(Ljava/lang/Object;)V

    .line 88
    :cond_2
    sget-object v1, Lcom/flurry/sdk/kl$a;->c:Lcom/flurry/sdk/kl$a;

    invoke-virtual {v3, v1}, Lcom/flurry/sdk/kj;->a(Lcom/flurry/sdk/kl$a;)V

    .line 96
    :goto_0
    invoke-virtual {p1}, Lcom/flurry/sdk/ig;->j()I

    move-result v1

    mul-int/lit16 v1, v1, 0x3e8

    invoke-virtual {v3, v1}, Lcom/flurry/sdk/kj;->a(I)V

    .line 98
    invoke-virtual {p1}, Lcom/flurry/sdk/ig;->k()I

    move-result v1

    mul-int/lit16 v1, v1, 0x3e8

    invoke-virtual {v3, v1}, Lcom/flurry/sdk/kj;->b(I)V

    .line 101
    invoke-virtual {v3, v7}, Lcom/flurry/sdk/kj;->c(Z)V

    .line 104
    invoke-virtual {v3, v7}, Lcom/flurry/sdk/kj;->a(Z)V

    .line 105
    invoke-virtual {p1}, Lcom/flurry/sdk/ig;->j()I

    move-result v1

    invoke-virtual {p1}, Lcom/flurry/sdk/ig;->k()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x3e8

    invoke-virtual {v3, v1}, Lcom/flurry/sdk/kj;->c(I)V

    .line 108
    invoke-virtual {p1}, Lcom/flurry/sdk/ig;->h()Ljava/util/Map;

    move-result-object v4

    .line 109
    if-eqz v4, :cond_4

    .line 110
    invoke-virtual {p1}, Lcom/flurry/sdk/ig;->h()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 111
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 113
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 114
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    .line 115
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v3, v2, v1}, Lcom/flurry/sdk/kj;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 92
    :cond_3
    sget-object v1, Lcom/flurry/sdk/kl$a;->b:Lcom/flurry/sdk/kl$a;

    invoke-virtual {v3, v1}, Lcom/flurry/sdk/kj;->a(Lcom/flurry/sdk/kl$a;)V

    goto :goto_0

    .line 119
    :cond_4
    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Lcom/flurry/sdk/kj;->b(Z)V

    .line 121
    new-instance v1, Lcom/flurry/sdk/if$2;

    invoke-direct {v1, p0, p1, v0}, Lcom/flurry/sdk/if$2;-><init>(Lcom/flurry/sdk/if;Lcom/flurry/sdk/ig;Lcom/flurry/sdk/ih;)V

    invoke-virtual {v3, v1}, Lcom/flurry/sdk/kj;->a(Lcom/flurry/sdk/kj$a;)V

    .line 180
    invoke-static {}, Lcom/flurry/sdk/jm;->a()Lcom/flurry/sdk/jm;

    move-result-object v0

    invoke-virtual {v0, p0, v3}, Lcom/flurry/sdk/jm;->a(Ljava/lang/Object;Lcom/flurry/sdk/ls;)V

    .line 181
    return-void
.end method

.method protected bridge synthetic a(Lcom/flurry/sdk/kn;)V
    .locals 0

    .prologue
    .line 25
    check-cast p1, Lcom/flurry/sdk/ig;

    invoke-virtual {p0, p1}, Lcom/flurry/sdk/if;->a(Lcom/flurry/sdk/ig;)V

    return-void
.end method

.method protected declared-synchronized a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/ig;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 248
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/flurry/sdk/ij;->a()Lcom/flurry/sdk/ij;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/ij;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    monitor-exit p0

    return-void

    .line 248
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected declared-synchronized b(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/ig;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 254
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/flurry/sdk/ij;->a()Lcom/flurry/sdk/ij;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/ij;->e()Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 256
    if-nez v0, :cond_1

    .line 281
    :cond_0
    monitor-exit p0

    return-void

    .line 259
    :cond_1
    :try_start_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_0

    .line 262
    const/4 v1, 0x3

    sget-object v2, Lcom/flurry/sdk/if;->b:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Restoring "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " from report queue."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 264
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/ik;

    .line 265
    invoke-static {}, Lcom/flurry/sdk/ij;->a()Lcom/flurry/sdk/ij;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ij;->b(Lcom/flurry/sdk/ik;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 254
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 269
    :cond_2
    :try_start_2
    invoke-static {}, Lcom/flurry/sdk/ij;->a()Lcom/flurry/sdk/ij;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/ij;->c()Ljava/util/List;

    move-result-object v0

    .line 272
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/ik;

    .line 273
    invoke-virtual {v0}, Lcom/flurry/sdk/ik;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/ig;

    .line 274
    invoke-virtual {v0}, Lcom/flurry/sdk/ig;->n()Z

    move-result v3

    if-nez v3, :cond_4

    .line 275
    const/4 v3, 0x3

    sget-object v4, Lcom/flurry/sdk/if;->b:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Callback for "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/flurry/sdk/ig;->m()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " to "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v0}, Lcom/flurry/sdk/ig;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " not completed.  Adding to reporter queue."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 276
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method
