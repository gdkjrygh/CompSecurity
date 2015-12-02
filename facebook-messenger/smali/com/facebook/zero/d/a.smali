.class public Lcom/facebook/zero/d/a;
.super Ljava/lang/Object;
.source "ZeroTokenManager.java"

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

.field private final c:Lcom/facebook/common/time/a;

.field private final d:Lcom/facebook/prefs/shared/d;

.field private final e:Lcom/facebook/zero/server/d;

.field private final f:Lcom/facebook/fbservice/ops/k;

.field private final g:Lcom/facebook/base/broadcast/a;

.field private final h:Lcom/facebook/common/e/h;

.field private final i:Lcom/facebook/zero/b/d;

.field private final j:Lcom/facebook/zero/ui/h;

.field private final k:Lcom/facebook/zero/ui/p;

.field private final l:Lcom/facebook/zero/rewrite/e;

.field private final m:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;"
        }
    .end annotation
.end field

.field private volatile o:Lcom/facebook/zero/ui/CarrierBottomBannerData;

.field private volatile p:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private volatile q:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;",
            ">;"
        }
    .end annotation
.end field

.field private r:Lcom/facebook/base/broadcast/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 60
    const-class v0, Lcom/facebook/zero/d/a;

    sput-object v0, Lcom/facebook/zero/d/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/time/a;Lcom/facebook/prefs/shared/d;Lcom/facebook/zero/server/d;Lcom/facebook/fbservice/ops/k;Lcom/facebook/base/broadcast/a;Lcom/facebook/common/e/h;Lcom/facebook/zero/b/d;Lcom/facebook/zero/ui/h;Lcom/facebook/zero/ui/p;Lcom/facebook/zero/rewrite/e;Ljavax/inject/a;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/zero/server/d;",
            "Lcom/facebook/fbservice/ops/k;",
            "Lcom/facebook/base/broadcast/a;",
            "Lcom/facebook/common/e/h;",
            "Lcom/facebook/zero/b/d;",
            "Lcom/facebook/zero/ui/h;",
            "Lcom/facebook/zero/ui/p;",
            "Lcom/facebook/zero/rewrite/e;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput-object p1, p0, Lcom/facebook/zero/d/a;->b:Landroid/content/Context;

    .line 107
    iput-object p2, p0, Lcom/facebook/zero/d/a;->c:Lcom/facebook/common/time/a;

    .line 108
    iput-object p3, p0, Lcom/facebook/zero/d/a;->d:Lcom/facebook/prefs/shared/d;

    .line 109
    iput-object p4, p0, Lcom/facebook/zero/d/a;->e:Lcom/facebook/zero/server/d;

    .line 110
    iput-object p5, p0, Lcom/facebook/zero/d/a;->f:Lcom/facebook/fbservice/ops/k;

    .line 111
    iput-object p6, p0, Lcom/facebook/zero/d/a;->g:Lcom/facebook/base/broadcast/a;

    .line 112
    iput-object p7, p0, Lcom/facebook/zero/d/a;->h:Lcom/facebook/common/e/h;

    .line 113
    iput-object p8, p0, Lcom/facebook/zero/d/a;->i:Lcom/facebook/zero/b/d;

    .line 114
    iput-object p9, p0, Lcom/facebook/zero/d/a;->j:Lcom/facebook/zero/ui/h;

    .line 115
    iput-object p10, p0, Lcom/facebook/zero/d/a;->k:Lcom/facebook/zero/ui/p;

    .line 116
    iput-object p11, p0, Lcom/facebook/zero/d/a;->l:Lcom/facebook/zero/rewrite/e;

    .line 117
    iput-object p12, p0, Lcom/facebook/zero/d/a;->m:Ljavax/inject/a;

    .line 118
    iput-object p13, p0, Lcom/facebook/zero/d/a;->n:Ljavax/inject/a;

    .line 119
    return-void
.end method

.method static synthetic a(Lcom/facebook/zero/d/a;Lcom/facebook/zero/ui/CarrierBottomBannerData;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lcom/facebook/zero/d/a;->a(Lcom/facebook/zero/ui/CarrierBottomBannerData;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/zero/d/a;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lcom/facebook/zero/d/a;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method private a(Lcom/facebook/zero/ui/CarrierBottomBannerData;)V
    .locals 3

    .prologue
    .line 348
    iget-object v0, p0, Lcom/facebook/zero/d/a;->o:Lcom/facebook/zero/ui/CarrierBottomBannerData;

    invoke-static {v0, p1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 349
    iput-object p1, p0, Lcom/facebook/zero/d/a;->o:Lcom/facebook/zero/ui/CarrierBottomBannerData;

    .line 352
    iget-object v0, p0, Lcom/facebook/zero/d/a;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->m:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 356
    iget-object v0, p0, Lcom/facebook/zero/d/a;->g:Lcom/facebook/base/broadcast/a;

    const-string v1, "com.facebook.orca.ZERO_RATING_BOTTOM_BANNER_DATA_CHANGED"

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V

    .line 358
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 361
    iget-object v0, p0, Lcom/facebook/zero/d/a;->n:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/w/q;

    .line 363
    iget-object v1, p0, Lcom/facebook/zero/d/a;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    sget-object v2, Lcom/facebook/zero/a/c;->e:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, p1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/prefs/shared/e;->a()V

    .line 367
    iget-object v1, p0, Lcom/facebook/zero/d/a;->n:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 368
    invoke-direct {p0}, Lcom/facebook/zero/d/a;->n()V

    .line 370
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 342
    sget-object v0, Lcom/facebook/zero/d/a;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception fetching zero token: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 344
    iget-object v0, p0, Lcom/facebook/zero/d/a;->h:Lcom/facebook/common/e/h;

    const-string v1, "zero_rating"

    const-string v2, "Error fetching zero token"

    invoke-interface {v0, v1, v2, p1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 345
    return-void
.end method

.method private g()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 142
    :try_start_0
    iget-object v0, p0, Lcom/facebook/zero/d/a;->i:Lcom/facebook/zero/b/d;

    sget-object v1, Lcom/facebook/zero/a/a;->a:Lcom/facebook/zero/b/b;

    invoke-virtual {v0, v1}, Lcom/facebook/zero/b/d;->a(Lcom/facebook/common/s/a;)Ljava/lang/String;

    move-result-object v0

    .line 144
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 145
    iget-object v1, p0, Lcom/facebook/zero/d/a;->j:Lcom/facebook/zero/ui/h;

    invoke-virtual {v1, v0}, Lcom/facebook/zero/ui/h;->a(Ljava/lang/String;)Lcom/facebook/zero/ui/CarrierBottomBannerData;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/d/a;->o:Lcom/facebook/zero/ui/CarrierBottomBannerData;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/facebook/common/json/jsonmirror/e; {:try_start_0 .. :try_end_0} :catch_1

    .line 156
    :cond_0
    :goto_0
    return-void

    .line 149
    :catch_0
    move-exception v0

    .line 150
    sget-object v1, Lcom/facebook/zero/d/a;->a:Ljava/lang/Class;

    const-string v2, "Error deserializing bottom banner data %s: "

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    iput-object v5, p0, Lcom/facebook/zero/d/a;->o:Lcom/facebook/zero/ui/CarrierBottomBannerData;

    goto :goto_0

    .line 152
    :catch_1
    move-exception v0

    .line 153
    sget-object v1, Lcom/facebook/zero/d/a;->a:Ljava/lang/Class;

    const-string v2, "Error deserializing bottom banner data: %s"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/facebook/common/json/jsonmirror/e;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    iput-object v5, p0, Lcom/facebook/zero/d/a;->o:Lcom/facebook/zero/ui/CarrierBottomBannerData;

    goto :goto_0
.end method

.method private h()V
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 160
    :try_start_0
    iget-object v0, p0, Lcom/facebook/zero/d/a;->i:Lcom/facebook/zero/b/d;

    sget-object v1, Lcom/facebook/zero/a/a;->b:Lcom/facebook/zero/b/b;

    invoke-virtual {v0, v1}, Lcom/facebook/zero/b/d;->a(Lcom/facebook/common/s/a;)Ljava/lang/String;

    move-result-object v0

    .line 162
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 163
    iget-object v1, p0, Lcom/facebook/zero/d/a;->k:Lcom/facebook/zero/ui/p;

    invoke-virtual {v1, v0}, Lcom/facebook/zero/ui/p;->a(Ljava/lang/String;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/d/a;->p:Lcom/google/common/a/fi;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/facebook/common/json/jsonmirror/e; {:try_start_0 .. :try_end_0} :catch_1

    .line 174
    :cond_0
    :goto_0
    return-void

    .line 167
    :catch_0
    move-exception v0

    .line 168
    sget-object v1, Lcom/facebook/zero/d/a;->a:Ljava/lang/Class;

    const-string v2, "Error deserializing enabled interstitials %s: "

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/d/a;->p:Lcom/google/common/a/fi;

    goto :goto_0

    .line 170
    :catch_1
    move-exception v0

    .line 171
    sget-object v1, Lcom/facebook/zero/d/a;->a:Ljava/lang/Class;

    const-string v2, "Error deserializing enabled interstitials %s: "

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/facebook/common/json/jsonmirror/e;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/d/a;->p:Lcom/google/common/a/fi;

    goto :goto_0
.end method

.method private i()V
    .locals 5

    .prologue
    .line 177
    iget-object v0, p0, Lcom/facebook/zero/d/a;->i:Lcom/facebook/zero/b/d;

    sget-object v1, Lcom/facebook/zero/a/a;->c:Lcom/facebook/zero/b/b;

    invoke-virtual {v0, v1}, Lcom/facebook/zero/b/d;->a(Lcom/facebook/common/s/a;)Ljava/lang/String;

    move-result-object v0

    .line 179
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 182
    :try_start_0
    iget-object v1, p0, Lcom/facebook/zero/d/a;->l:Lcom/facebook/zero/rewrite/e;

    invoke-virtual {v1, v0}, Lcom/facebook/zero/rewrite/e;->a(Ljava/lang/String;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/d/a;->q:Lcom/google/common/a/es;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 191
    :goto_0
    return-void

    .line 184
    :catch_0
    move-exception v0

    .line 185
    sget-object v1, Lcom/facebook/zero/d/a;->a:Ljava/lang/Class;

    const-string v2, "Error deserializing rewrite rules: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/d/a;->q:Lcom/google/common/a/es;

    goto :goto_0

    .line 189
    :cond_0
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/d/a;->q:Lcom/google/common/a/es;

    goto :goto_0
.end method

.method private j()V
    .locals 4

    .prologue
    .line 253
    iget-object v0, p0, Lcom/facebook/zero/d/a;->m:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 277
    :goto_0
    return-void

    .line 257
    :cond_0
    const-string v0, "unknown"

    invoke-direct {p0, v0}, Lcom/facebook/zero/d/a;->a(Ljava/lang/String;)V

    .line 258
    iget-object v0, p0, Lcom/facebook/zero/d/a;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->d:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/zero/d/a;->c:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 262
    new-instance v0, Lcom/facebook/zero/d/c;

    invoke-direct {v0, p0}, Lcom/facebook/zero/d/c;-><init>(Lcom/facebook/zero/d/a;)V

    .line 275
    invoke-direct {p0}, Lcom/facebook/zero/d/a;->l()Lcom/google/common/d/a/s;

    move-result-object v1

    .line 276
    invoke-static {v1, v0}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method private k()V
    .locals 2

    .prologue
    .line 280
    invoke-direct {p0}, Lcom/facebook/zero/d/a;->m()Lcom/google/common/d/a/s;

    move-result-object v0

    .line 281
    new-instance v1, Lcom/facebook/zero/d/d;

    invoke-direct {v1, p0}, Lcom/facebook/zero/d/d;-><init>(Lcom/facebook/zero/d/a;)V

    .line 294
    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 295
    return-void
.end method

.method private l()Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation

    .prologue
    .line 298
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 299
    new-instance v1, Lcom/facebook/zero/server/FetchZeroTokenParams;

    iget-object v2, p0, Lcom/facebook/zero/d/a;->e:Lcom/facebook/zero/server/d;

    invoke-virtual {v2}, Lcom/facebook/zero/server/d;->a()Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/zero/d/a;->e:Lcom/facebook/zero/server/d;

    invoke-virtual {v3}, Lcom/facebook/zero/server/d;->b()Lcom/facebook/zero/server/c;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/facebook/zero/server/FetchZeroTokenParams;-><init>(Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;Lcom/facebook/zero/server/c;)V

    .line 302
    const-string v2, "fetchZeroTokenParams"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 304
    iget-object v1, p0, Lcom/facebook/zero/d/a;->f:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/zero/server/e;->a:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    return-object v0
.end method

.method private m()Lcom/google/common/d/a/s;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation

    .prologue
    .line 310
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 311
    sget-object v1, Lcom/facebook/zero/a/c;->f:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/zero/d/a;->d:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/zero/a/c;->f:Lcom/facebook/prefs/shared/ae;

    const-string v4, ""

    invoke-interface {v2, v3, v4}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    iget-object v1, p0, Lcom/facebook/zero/d/a;->f:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/zero/server/e;->b:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    return-object v0
.end method

.method private n()V
    .locals 2

    .prologue
    .line 373
    sget-object v0, Lcom/facebook/zero/d/a;->a:Ljava/lang/Class;

    const-string v1, "Broadcasting zero rating state change"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 374
    iget-object v0, p0, Lcom/facebook/zero/d/a;->g:Lcom/facebook/base/broadcast/a;

    const-string v1, "com.facebook.orca.ZERO_RATING_STATE_CHANGED"

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V

    .line 375
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 123
    invoke-direct {p0}, Lcom/facebook/zero/d/a;->g()V

    .line 124
    invoke-direct {p0}, Lcom/facebook/zero/d/a;->h()V

    .line 125
    invoke-direct {p0}, Lcom/facebook/zero/d/a;->i()V

    .line 127
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 128
    const-string v1, "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 129
    new-instance v1, Lcom/facebook/zero/d/b;

    iget-object v2, p0, Lcom/facebook/zero/d/a;->b:Landroid/content/Context;

    invoke-direct {v1, p0, v2, v0}, Lcom/facebook/zero/d/b;-><init>(Lcom/facebook/zero/d/a;Landroid/content/Context;Landroid/content/IntentFilter;)V

    iput-object v1, p0, Lcom/facebook/zero/d/a;->r:Lcom/facebook/base/broadcast/q;

    .line 137
    iget-object v0, p0, Lcom/facebook/zero/d/a;->r:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->a()V

    .line 138
    return-void
.end method

.method public a(Lcom/facebook/zero/server/FetchZeroTokenResult;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 321
    iget-object v0, p0, Lcom/facebook/zero/d/a;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->f:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/zero/server/FetchZeroTokenResult;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 325
    invoke-virtual {p1}, Lcom/facebook/zero/server/FetchZeroTokenResult;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/d/a;->p:Lcom/google/common/a/fi;

    .line 326
    sget-object v0, Lcom/facebook/zero/d/a;->a:Ljava/lang/Class;

    const-string v1, "New enabled ui features: %s"

    new-array v2, v5, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/facebook/zero/d/a;->p:Lcom/google/common/a/fi;

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    invoke-virtual {p1}, Lcom/facebook/zero/server/FetchZeroTokenResult;->c()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/d/a;->q:Lcom/google/common/a/es;

    .line 329
    sget-object v0, Lcom/facebook/zero/d/a;->a:Ljava/lang/Class;

    const-string v1, "New rewrite rules: %s"

    new-array v2, v5, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/facebook/zero/d/a;->q:Lcom/google/common/a/es;

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    iget-object v0, p0, Lcom/facebook/zero/d/a;->d:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/zero/a/c;->f:Lcom/facebook/prefs/shared/ae;

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 334
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 335
    invoke-direct {p0}, Lcom/facebook/zero/d/a;->k()V

    .line 338
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/zero/server/FetchZeroTokenResult;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/zero/d/a;->a(Ljava/lang/String;)V

    .line 339
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    .line 198
    sget-object v0, Lcom/facebook/zero/d/a;->a:Ljava/lang/Class;

    const-string v1, "Clearing Zero Rating preferences"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 200
    iget-object v0, p0, Lcom/facebook/zero/d/a;->n:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/w/q;

    .line 201
    iget-object v1, p0, Lcom/facebook/zero/d/a;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    sget-object v2, Lcom/facebook/zero/a/c;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2}, Lcom/facebook/prefs/shared/e;->b(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/prefs/shared/e;->a()V

    .line 205
    iget-object v1, p0, Lcom/facebook/zero/d/a;->n:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 206
    invoke-direct {p0}, Lcom/facebook/zero/d/a;->n()V

    .line 209
    :cond_0
    invoke-direct {p0}, Lcom/facebook/zero/d/a;->j()V

    .line 210
    return-void
.end method

.method c()V
    .locals 5
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 214
    iget-object v0, p0, Lcom/facebook/zero/d/a;->e:Lcom/facebook/zero/server/d;

    invoke-virtual {v0}, Lcom/facebook/zero/server/d;->b()Lcom/facebook/zero/server/c;

    move-result-object v0

    .line 215
    sget-object v1, Lcom/facebook/zero/d/a;->a:Ljava/lang/Class;

    const-string v2, "Changing connectivity to: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    sget-object v1, Lcom/facebook/zero/a/b;->a:Lcom/facebook/zero/server/c;

    invoke-virtual {v0, v1}, Lcom/facebook/zero/server/c;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 250
    :cond_0
    :goto_0
    return-void

    .line 221
    :cond_1
    sget-object v1, Lcom/facebook/zero/a/b;->i:Lcom/facebook/zero/server/c;

    invoke-virtual {v0, v1}, Lcom/facebook/zero/server/c;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 223
    const-string v0, "disabled"

    invoke-direct {p0, v0}, Lcom/facebook/zero/d/a;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 227
    :cond_2
    sget-object v1, Lcom/facebook/zero/a/b;->d:Lcom/facebook/zero/server/c;

    invoke-virtual {v0, v1}, Lcom/facebook/zero/server/c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    new-instance v0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    iget-object v1, p0, Lcom/facebook/zero/d/a;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/zero/a/c;->b:Lcom/facebook/prefs/shared/ae;

    const-string v3, "0:0:0:0"

    invoke-interface {v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;-><init>(Ljava/lang/String;)V

    .line 233
    iget-object v1, p0, Lcom/facebook/zero/d/a;->e:Lcom/facebook/zero/server/d;

    invoke-virtual {v1}, Lcom/facebook/zero/server/d;->a()Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    move-result-object v1

    .line 237
    invoke-virtual {v1, v0}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 238
    iget-object v0, p0, Lcom/facebook/zero/d/a;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v2, Lcom/facebook/zero/a/c;->b:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 242
    invoke-direct {p0}, Lcom/facebook/zero/d/a;->j()V

    goto :goto_0

    .line 245
    :cond_3
    iget-object v0, p0, Lcom/facebook/zero/d/a;->d:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/zero/a/c;->f:Lcom/facebook/prefs/shared/ae;

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 246
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 247
    const-string v0, "enabled"

    invoke-direct {p0, v0}, Lcom/facebook/zero/d/a;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public d()Lcom/facebook/zero/ui/CarrierBottomBannerData;
    .locals 1

    .prologue
    .line 383
    iget-object v0, p0, Lcom/facebook/zero/d/a;->o:Lcom/facebook/zero/ui/CarrierBottomBannerData;

    return-object v0
.end method

.method public e()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;",
            ">;"
        }
    .end annotation

    .prologue
    .line 390
    iget-object v0, p0, Lcom/facebook/zero/d/a;->q:Lcom/google/common/a/es;

    return-object v0
.end method

.method public f()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 396
    iget-object v0, p0, Lcom/facebook/zero/d/a;->p:Lcom/google/common/a/fi;

    return-object v0
.end method
