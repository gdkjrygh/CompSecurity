.class public Lcom/flurry/sdk/id;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/lh$a;


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Ljava/lang/String;


# instance fields
.field private final c:Ljava/lang/Runnable;

.field private final d:Lcom/flurry/sdk/jx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jx",
            "<",
            "Lcom/flurry/sdk/jd;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/flurry/sdk/jx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jx",
            "<",
            "Lcom/flurry/sdk/je;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/flurry/sdk/jx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jx",
            "<",
            "Lcom/flurry/sdk/jh;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/flurry/sdk/kg;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/kg",
            "<",
            "Lcom/flurry/sdk/hp;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/flurry/sdk/kg;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/kg",
            "<",
            "Lcom/flurry/sdk/hq;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/flurry/sdk/jv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jv",
            "<",
            "Lcom/flurry/sdk/ib;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/flurry/sdk/jv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jv",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/ik;",
            ">;>;"
        }
    .end annotation
.end field

.field private final k:Lcom/flurry/sdk/ic;

.field private final l:Lcom/flurry/sdk/jt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jt",
            "<",
            "Ljava/lang/String;",
            "Lcom/flurry/sdk/ht;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/ik;",
            ">;"
        }
    .end annotation
.end field

.field private n:Z

.field private o:Ljava/lang/String;

.field private p:Z

.field private q:Z

.field private r:J

.field private s:J

.field private t:Z

.field private u:Lcom/flurry/sdk/hq;

.field private v:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 69
    const-class v0, Lcom/flurry/sdk/id;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    .line 71
    const-string v0, "https://proton.flurry.com/sdk/v1/config"

    sput-object v0, Lcom/flurry/sdk/id;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .prologue
    const/4 v5, 0x4

    const/4 v4, 0x1

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    new-instance v0, Lcom/flurry/sdk/id$1;

    invoke-direct {v0, p0}, Lcom/flurry/sdk/id$1;-><init>(Lcom/flurry/sdk/id;)V

    iput-object v0, p0, Lcom/flurry/sdk/id;->c:Ljava/lang/Runnable;

    .line 106
    new-instance v0, Lcom/flurry/sdk/id$4;

    invoke-direct {v0, p0}, Lcom/flurry/sdk/id$4;-><init>(Lcom/flurry/sdk/id;)V

    iput-object v0, p0, Lcom/flurry/sdk/id;->d:Lcom/flurry/sdk/jx;

    .line 139
    new-instance v0, Lcom/flurry/sdk/id$5;

    invoke-direct {v0, p0}, Lcom/flurry/sdk/id$5;-><init>(Lcom/flurry/sdk/id;)V

    iput-object v0, p0, Lcom/flurry/sdk/id;->e:Lcom/flurry/sdk/jx;

    .line 146
    new-instance v0, Lcom/flurry/sdk/id$6;

    invoke-direct {v0, p0}, Lcom/flurry/sdk/id$6;-><init>(Lcom/flurry/sdk/id;)V

    iput-object v0, p0, Lcom/flurry/sdk/id;->f:Lcom/flurry/sdk/jx;

    .line 155
    new-instance v0, Lcom/flurry/sdk/kg;

    const-string v1, "proton config request"

    new-instance v2, Lcom/flurry/sdk/ip;

    invoke-direct {v2}, Lcom/flurry/sdk/ip;-><init>()V

    invoke-direct {v0, v1, v2}, Lcom/flurry/sdk/kg;-><init>(Ljava/lang/String;Lcom/flurry/sdk/kx;)V

    iput-object v0, p0, Lcom/flurry/sdk/id;->g:Lcom/flurry/sdk/kg;

    .line 156
    new-instance v0, Lcom/flurry/sdk/kg;

    const-string v1, "proton config response"

    new-instance v2, Lcom/flurry/sdk/iq;

    invoke-direct {v2}, Lcom/flurry/sdk/iq;-><init>()V

    invoke-direct {v0, v1, v2}, Lcom/flurry/sdk/kg;-><init>(Ljava/lang/String;Lcom/flurry/sdk/kx;)V

    iput-object v0, p0, Lcom/flurry/sdk/id;->h:Lcom/flurry/sdk/kg;

    .line 161
    new-instance v0, Lcom/flurry/sdk/ic;

    invoke-direct {v0}, Lcom/flurry/sdk/ic;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/id;->k:Lcom/flurry/sdk/ic;

    .line 162
    new-instance v0, Lcom/flurry/sdk/jt;

    invoke-direct {v0}, Lcom/flurry/sdk/jt;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/id;->l:Lcom/flurry/sdk/jt;

    .line 165
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/id;->m:Ljava/util/List;

    .line 169
    iput-boolean v4, p0, Lcom/flurry/sdk/id;->p:Z

    .line 172
    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lcom/flurry/sdk/id;->r:J

    .line 181
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v1

    .line 183
    const-string v0, "ProtonEnabled"

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/flurry/sdk/id;->n:Z

    .line 184
    const-string v0, "ProtonEnabled"

    invoke-virtual {v1, v0, p0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)V

    .line 185
    sget-object v0, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "initSettings, protonEnabled = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, p0, Lcom/flurry/sdk/id;->n:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v0, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 187
    const-string v0, "ProtonConfigUrl"

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/flurry/sdk/id;->o:Ljava/lang/String;

    .line 188
    const-string v0, "ProtonConfigUrl"

    invoke-virtual {v1, v0, p0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)V

    .line 189
    sget-object v0, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "initSettings, protonConfigUrl = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/flurry/sdk/id;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v0, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 191
    const-string v0, "analyticsEnabled"

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/flurry/sdk/id;->p:Z

    .line 192
    const-string v0, "analyticsEnabled"

    invoke-virtual {v1, v0, p0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)V

    .line 193
    sget-object v0, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "initSettings, AnalyticsEnabled = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/flurry/sdk/id;->p:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v0, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 195
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.sdk.IdProviderFinishedEvent"

    iget-object v2, p0, Lcom/flurry/sdk/id;->d:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->a(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 196
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.sdk.IdProviderUpdatedAdvertisingId"

    iget-object v2, p0, Lcom/flurry/sdk/id;->e:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->a(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 197
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.sdk.NetworkStateEvent"

    iget-object v2, p0, Lcom/flurry/sdk/id;->f:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->a(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 200
    new-instance v0, Lcom/flurry/sdk/jv;

    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0}, Lcom/flurry/sdk/id;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const-string v2, ".yflurryprotonconfig."

    new-instance v3, Lcom/flurry/sdk/id$7;

    invoke-direct {v3, p0}, Lcom/flurry/sdk/id$7;-><init>(Lcom/flurry/sdk/id;)V

    invoke-direct {v0, v1, v2, v4, v3}, Lcom/flurry/sdk/jv;-><init>(Ljava/io/File;Ljava/lang/String;ILcom/flurry/sdk/la;)V

    iput-object v0, p0, Lcom/flurry/sdk/id;->i:Lcom/flurry/sdk/jv;

    .line 207
    new-instance v0, Lcom/flurry/sdk/jv;

    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0}, Lcom/flurry/sdk/id;->p()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const-string v2, ".yflurryprotonreport."

    new-instance v3, Lcom/flurry/sdk/id$8;

    invoke-direct {v3, p0}, Lcom/flurry/sdk/id$8;-><init>(Lcom/flurry/sdk/id;)V

    invoke-direct {v0, v1, v2, v4, v3}, Lcom/flurry/sdk/jv;-><init>(Ljava/io/File;Ljava/lang/String;ILcom/flurry/sdk/la;)V

    iput-object v0, p0, Lcom/flurry/sdk/id;->j:Lcom/flurry/sdk/jv;

    .line 216
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/id$9;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/id$9;-><init>(Lcom/flurry/sdk/id;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    .line 224
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/id$10;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/id$10;-><init>(Lcom/flurry/sdk/id;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    .line 230
    return-void
.end method

.method static synthetic a(Lcom/flurry/sdk/id;J)J
    .locals 1

    .prologue
    .line 68
    iput-wide p1, p0, Lcom/flurry/sdk/id;->r:J

    return-wide p1
.end method

.method private declared-synchronized a(JZ[B)V
    .locals 3

    .prologue
    .line 936
    monitor-enter p0

    if-nez p4, :cond_0

    .line 948
    :goto_0
    monitor-exit p0

    return-void

    .line 940
    :cond_0
    const/4 v0, 0x4

    :try_start_0
    sget-object v1, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v2, "Saving proton config response"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 942
    new-instance v0, Lcom/flurry/sdk/ib;

    invoke-direct {v0}, Lcom/flurry/sdk/ib;-><init>()V

    .line 943
    invoke-virtual {v0, p1, p2}, Lcom/flurry/sdk/ib;->a(J)V

    .line 944
    invoke-virtual {v0, p3}, Lcom/flurry/sdk/ib;->a(Z)V

    .line 945
    invoke-virtual {v0, p4}, Lcom/flurry/sdk/ib;->a([B)V

    .line 947
    iget-object v1, p0, Lcom/flurry/sdk/id;->i:Lcom/flurry/sdk/jv;

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/jv;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 936
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic a(Lcom/flurry/sdk/id;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0}, Lcom/flurry/sdk/id;->g()V

    return-void
.end method

.method static synthetic a(Lcom/flurry/sdk/id;JZ[B)V
    .locals 1

    .prologue
    .line 68
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/flurry/sdk/id;->a(JZ[B)V

    return-void
.end method

.method static synthetic a(Lcom/flurry/sdk/id;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0, p1, p2}, Lcom/flurry/sdk/id;->b(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private a(Lcom/flurry/sdk/ho;)Z
    .locals 8

    .prologue
    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 621
    if-nez p1, :cond_0

    move v2, v3

    .line 641
    :goto_0
    return v2

    .line 626
    :cond_0
    iget-object v0, p1, Lcom/flurry/sdk/ho;->a:Ljava/util/List;

    if-nez v0, :cond_1

    move v2, v3

    .line 627
    goto :goto_0

    :cond_1
    move v1, v2

    .line 630
    :goto_1
    iget-object v0, p1, Lcom/flurry/sdk/ho;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 631
    iget-object v0, p1, Lcom/flurry/sdk/ho;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/hn;

    .line 632
    if-eqz v0, :cond_3

    .line 633
    iget-object v4, v0, Lcom/flurry/sdk/hn;->b:Ljava/lang/String;

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-wide v4, v0, Lcom/flurry/sdk/hn;->a:J

    const-wide/16 v6, -0x1

    cmp-long v4, v4, v6

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/flurry/sdk/hn;->e:Ljava/lang/String;

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v0, v0, Lcom/flurry/sdk/hn;->c:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/flurry/sdk/id;->a(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 635
    :cond_2
    const/4 v0, 0x3

    sget-object v1, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v3, "A callback template is missing required values"

    invoke-static {v0, v1, v3}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 630
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_4
    move v2, v3

    .line 641
    goto :goto_0
.end method

.method private a(Lcom/flurry/sdk/hq;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 604
    if-nez p1, :cond_0

    .line 616
    :goto_0
    return v0

    .line 610
    :cond_0
    iget-object v1, p1, Lcom/flurry/sdk/hq;->e:Lcom/flurry/sdk/ho;

    invoke-direct {p0, v1}, Lcom/flurry/sdk/id;->a(Lcom/flurry/sdk/ho;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p1, Lcom/flurry/sdk/hq;->e:Lcom/flurry/sdk/ho;

    iget-object v1, v1, Lcom/flurry/sdk/ho;->e:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 612
    :cond_1
    const/4 v1, 0x3

    sget-object v2, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v3, "Config response is missing required values."

    invoke-static {v1, v2, v3}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 616
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic a(Lcom/flurry/sdk/id;Lcom/flurry/sdk/hq;)Z
    .locals 1

    .prologue
    .line 68
    invoke-direct {p0, p1}, Lcom/flurry/sdk/id;->a(Lcom/flurry/sdk/hq;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/flurry/sdk/id;Z)Z
    .locals 0

    .prologue
    .line 68
    iput-boolean p1, p0, Lcom/flurry/sdk/id;->t:Z

    return p1
.end method

.method private a(Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/ht;",
            ">;)Z"
        }
    .end annotation

    .prologue
    const/4 v6, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 646
    if-nez p1, :cond_0

    move v0, v1

    .line 665
    :goto_0
    return v0

    .line 651
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/ht;

    .line 652
    iget-object v4, v0, Lcom/flurry/sdk/ht;->a:Ljava/lang/String;

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 653
    sget-object v0, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v1, "An event is missing a name"

    invoke-static {v6, v0, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    move v0, v2

    .line 654
    goto :goto_0

    .line 657
    :cond_2
    instance-of v4, v0, Lcom/flurry/sdk/hu;

    if-eqz v4, :cond_1

    .line 658
    check-cast v0, Lcom/flurry/sdk/hu;

    iget-object v0, v0, Lcom/flurry/sdk/hu;->c:Ljava/lang/String;

    const-string v4, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 659
    sget-object v0, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v1, "An event trigger is missing a param name"

    invoke-static {v6, v0, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    move v0, v2

    .line 660
    goto :goto_0

    :cond_3
    move v0, v1

    .line 665
    goto :goto_0
.end method

.method static synthetic b(Lcom/flurry/sdk/id;J)J
    .locals 1

    .prologue
    .line 68
    iput-wide p1, p0, Lcom/flurry/sdk/id;->s:J

    return-wide p1
.end method

.method static synthetic b(Lcom/flurry/sdk/id;Lcom/flurry/sdk/hq;)Lcom/flurry/sdk/hq;
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/flurry/sdk/id;->u:Lcom/flurry/sdk/hq;

    return-object p1
.end method

.method private declared-synchronized b(J)V
    .locals 5

    .prologue
    .line 885
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/flurry/sdk/id;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 887
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 888
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/ik;

    .line 889
    invoke-virtual {v0}, Lcom/flurry/sdk/ik;->b()J

    move-result-wide v2

    cmp-long v0, p1, v2

    if-nez v0, :cond_0

    .line 890
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 885
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 893
    :cond_1
    monitor-exit p0

    return-void
.end method

.method static synthetic b(Lcom/flurry/sdk/id;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0}, Lcom/flurry/sdk/id;->j()V

    return-void
.end method

.method private declared-synchronized b(Ljava/lang/String;Ljava/util/Map;)V
    .locals 23
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
    .line 732
    monitor-enter p0

    const/4 v2, 0x3

    :try_start_0
    sget-object v3, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Event triggered: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 734
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/flurry/sdk/id;->p:Z

    if-nez v2, :cond_1

    .line 735
    sget-object v2, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v3, "Analytics and pulse have been disabled."

    invoke-static {v2, v3}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 882
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 739
    :cond_1
    :try_start_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flurry/sdk/id;->u:Lcom/flurry/sdk/hq;

    if-nez v2, :cond_2

    .line 740
    const/4 v2, 0x3

    sget-object v3, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v4, "Config response is empty. No events to fire."

    invoke-static {v2, v3, v4}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 732
    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2

    .line 744
    :cond_2
    :try_start_2
    invoke-static {}, Lcom/flurry/sdk/lp;->b()V

    .line 746
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 751
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flurry/sdk/id;->l:Lcom/flurry/sdk/jt;

    move-object/from16 v0, p1

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/jt;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 753
    if-nez v3, :cond_3

    .line 754
    const/4 v2, 0x3

    sget-object v3, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v4, "No events to fire. Returning."

    invoke-static {v2, v3, v4}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 758
    :cond_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_4

    .line 759
    const/4 v2, 0x3

    sget-object v3, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v4, "No events to fire. Returning."

    invoke-static {v2, v3, v4}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 763
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    .line 765
    if-eqz p2, :cond_7

    const/4 v2, 0x1

    move/from16 v17, v2

    .line 769
    :goto_1
    const/4 v2, -0x1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    :cond_5
    :goto_2
    packed-switch v2, :pswitch_data_0

    .line 780
    sget-object v2, Lcom/flurry/sdk/io;->d:Lcom/flurry/sdk/io;

    move-object/from16 v16, v2

    .line 783
    :goto_3
    new-instance v20, Ljava/util/HashMap;

    invoke-direct/range {v20 .. v20}, Ljava/util/HashMap;-><init>()V

    .line 787
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_4
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/flurry/sdk/ht;

    .line 788
    const/4 v4, 0x0

    .line 790
    instance-of v2, v3, Lcom/flurry/sdk/hu;

    if-eqz v2, :cond_d

    .line 791
    const/4 v2, 0x4

    sget-object v5, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v6, "Event contains triggers."

    invoke-static {v2, v5, v6}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 792
    move-object v0, v3

    check-cast v0, Lcom/flurry/sdk/hu;

    move-object v2, v0

    iget-object v6, v2, Lcom/flurry/sdk/hu;->d:[Ljava/lang/String;

    .line 795
    if-nez v6, :cond_8

    .line 796
    const/4 v2, 0x4

    sget-object v4, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v5, "Template does not contain trigger values. Firing."

    invoke-static {v2, v4, v5}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 797
    const/4 v4, 0x1

    .line 812
    :cond_6
    :goto_5
    move-object v0, v3

    check-cast v0, Lcom/flurry/sdk/hu;

    move-object v2, v0

    iget-object v2, v2, Lcom/flurry/sdk/hu;->c:Ljava/lang/String;

    .line 813
    move-object/from16 v0, p2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 816
    if-nez v2, :cond_a

    .line 817
    const/4 v2, 0x4

    sget-object v3, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v4, "Publisher params has no value associated with proton key. Not firing."

    invoke-static {v2, v3, v4}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 765
    :cond_7
    const/4 v2, 0x0

    move/from16 v17, v2

    goto :goto_1

    .line 769
    :sswitch_0
    const-string v4, "flurry.session_start"

    move-object/from16 v0, p1

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v2, 0x0

    goto :goto_2

    :sswitch_1
    const-string v4, "flurry.session_end"

    move-object/from16 v0, p1

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v2, 0x1

    goto :goto_2

    :sswitch_2
    const-string v4, "flurry.app_install"

    move-object/from16 v0, p1

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v2, 0x2

    goto :goto_2

    .line 771
    :pswitch_0
    sget-object v2, Lcom/flurry/sdk/io;->b:Lcom/flurry/sdk/io;

    move-object/from16 v16, v2

    .line 772
    goto :goto_3

    .line 774
    :pswitch_1
    sget-object v2, Lcom/flurry/sdk/io;->c:Lcom/flurry/sdk/io;

    move-object/from16 v16, v2

    .line 775
    goto :goto_3

    .line 777
    :pswitch_2
    sget-object v2, Lcom/flurry/sdk/io;->a:Lcom/flurry/sdk/io;

    move-object/from16 v16, v2

    .line 778
    goto/16 :goto_3

    .line 800
    :cond_8
    array-length v2, v6

    if-nez v2, :cond_9

    .line 801
    const/4 v2, 0x4

    sget-object v4, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v5, "Template does not contain trigger values. Firing."

    invoke-static {v2, v4, v5}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 802
    const/4 v4, 0x1

    goto :goto_5

    .line 806
    :cond_9
    if-nez p2, :cond_6

    .line 807
    const/4 v2, 0x4

    sget-object v3, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v4, "Publisher has not passed in params list. Not firing."

    invoke-static {v2, v3, v4}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 822
    :cond_a
    const/4 v5, 0x0

    :goto_6
    array-length v7, v6

    if-ge v5, v7, :cond_12

    .line 823
    aget-object v7, v6, v5

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    .line 824
    const/4 v2, 0x1

    .line 829
    :goto_7
    if-nez v2, :cond_c

    .line 830
    const/4 v2, 0x4

    sget-object v3, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v4, "Publisher params list does not match proton param values. Not firing."

    invoke-static {v2, v3, v4}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 822
    :cond_b
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    .line 834
    :cond_c
    const/4 v2, 0x4

    sget-object v4, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v5, "Publisher params match proton values. Firing."

    invoke-static {v2, v4, v5}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 838
    :cond_d
    iget-object v0, v3, Lcom/flurry/sdk/ht;->b:Lcom/flurry/sdk/hn;

    move-object/from16 v22, v0

    .line 840
    if-nez v22, :cond_e

    .line 841
    const/4 v2, 0x3

    sget-object v3, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v4, "Template is empty. Not firing current event."

    invoke-static {v2, v3, v4}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 845
    :cond_e
    const/4 v2, 0x3

    sget-object v3, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Creating callback report for partner: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v22

    iget-object v5, v0, Lcom/flurry/sdk/hn;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 848
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 849
    const-string v3, "event_name"

    move-object/from16 v0, p1

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 850
    const-string v3, "event_time_millis"

    invoke-static/range {v18 .. v19}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 851
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/flurry/sdk/id;->k:Lcom/flurry/sdk/ic;

    move-object/from16 v0, v22

    iget-object v4, v0, Lcom/flurry/sdk/hn;->e:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, Lcom/flurry/sdk/ic;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    .line 854
    const/4 v15, 0x0

    .line 855
    move-object/from16 v0, v22

    iget-object v3, v0, Lcom/flurry/sdk/hn;->f:Ljava/lang/String;

    if-eqz v3, :cond_f

    .line 856
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/flurry/sdk/id;->k:Lcom/flurry/sdk/ic;

    move-object/from16 v0, v22

    iget-object v4, v0, Lcom/flurry/sdk/hn;->f:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, Lcom/flurry/sdk/ic;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v15

    .line 859
    :cond_f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/32 v4, 0xf731400

    add-long v7, v2, v4

    .line 862
    new-instance v2, Lcom/flurry/sdk/ig;

    move-object/from16 v0, v22

    iget-object v3, v0, Lcom/flurry/sdk/hn;->b:Ljava/lang/String;

    move-object/from16 v0, v22

    iget-wide v4, v0, Lcom/flurry/sdk/hn;->a:J

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/flurry/sdk/id;->u:Lcom/flurry/sdk/hq;

    iget-object v9, v9, Lcom/flurry/sdk/hq;->e:Lcom/flurry/sdk/ho;

    iget v9, v9, Lcom/flurry/sdk/ho;->b:I

    move-object/from16 v0, v22

    iget v10, v0, Lcom/flurry/sdk/hn;->g:I

    move-object/from16 v0, v22

    iget-object v11, v0, Lcom/flurry/sdk/hn;->d:Lcom/flurry/sdk/in;

    move-object/from16 v0, v22

    iget-object v12, v0, Lcom/flurry/sdk/hn;->j:Ljava/util/Map;

    move-object/from16 v0, v22

    iget v13, v0, Lcom/flurry/sdk/hn;->i:I

    move-object/from16 v0, v22

    iget v14, v0, Lcom/flurry/sdk/hn;->h:I

    invoke-direct/range {v2 .. v15}, Lcom/flurry/sdk/ig;-><init>(Ljava/lang/String;JLjava/lang/String;JIILcom/flurry/sdk/in;Ljava/util/Map;IILjava/lang/String;)V

    .line 866
    move-object/from16 v0, v22

    iget-wide v4, v0, Lcom/flurry/sdk/hn;->a:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v0, v20

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_4

    .line 870
    :cond_10
    invoke-interface/range {v20 .. v20}, Ljava/util/Map;->size()I

    move-result v2

    if-eqz v2, :cond_0

    .line 871
    new-instance v3, Lcom/flurry/sdk/ik;

    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/flurry/sdk/jb;->d()J

    move-result-wide v6

    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/flurry/sdk/jb;->g()J

    move-result-wide v8

    move-object/from16 v4, p1

    move/from16 v5, v17

    move-object/from16 v10, v16

    move-object/from16 v11, v20

    invoke-direct/range {v3 .. v11}, Lcom/flurry/sdk/ik;-><init>(Ljava/lang/String;ZJJLcom/flurry/sdk/io;Ljava/util/Map;)V

    .line 874
    const-string v2, "flurry.session_end"

    move-object/from16 v0, p1

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 875
    const/4 v2, 0x3

    sget-object v4, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Storing Pulse callbacks for event: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p1

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v4, v5}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 876
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flurry/sdk/id;->m:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 878
    :cond_11
    const/4 v2, 0x3

    sget-object v4, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Firing Pulse callbacks for event: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p1

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v4, v5}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 879
    invoke-static {}, Lcom/flurry/sdk/ij;->a()Lcom/flurry/sdk/ij;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/flurry/sdk/ij;->a(Lcom/flurry/sdk/ik;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    :cond_12
    move v2, v4

    goto/16 :goto_7

    .line 769
    nop

    :sswitch_data_0
    .sparse-switch
        0x26750b2e -> :sswitch_1
        0x51bea0f9 -> :sswitch_2
        0x5e26fdf5 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic b(Lcom/flurry/sdk/id;Z)Z
    .locals 0

    .prologue
    .line 68
    iput-boolean p1, p0, Lcom/flurry/sdk/id;->v:Z

    return p1
.end method

.method static synthetic c(Lcom/flurry/sdk/id;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0}, Lcom/flurry/sdk/id;->l()V

    return-void
.end method

.method static synthetic d(Lcom/flurry/sdk/id;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0}, Lcom/flurry/sdk/id;->m()V

    return-void
.end method

.method static synthetic e(Lcom/flurry/sdk/id;)Lcom/flurry/sdk/kg;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/flurry/sdk/id;->h:Lcom/flurry/sdk/kg;

    return-object v0
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 68
    sget-object v0, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    return-object v0
.end method

.method private declared-synchronized f()V
    .locals 3

    .prologue
    .line 368
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/flurry/sdk/id;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 382
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 372
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/flurry/sdk/lp;->b()V

    .line 374
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "FLURRY_SHARED_PREFERENCES"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 375
    const-string v1, "com.flurry.android.flurryAppInstall"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 376
    if-eqz v1, :cond_0

    .line 377
    const-string v1, "flurry.app_install"

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2}, Lcom/flurry/sdk/id;->b(Ljava/lang/String;Ljava/util/Map;)V

    .line 378
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 379
    const-string v1, "com.flurry.android.flurryAppInstall"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 380
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 368
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic f(Lcom/flurry/sdk/id;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0}, Lcom/flurry/sdk/id;->i()V

    return-void
.end method

.method private declared-synchronized g()V
    .locals 12

    .prologue
    const-wide/16 v10, 0x3e8

    const/4 v0, 0x1

    .line 385
    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lcom/flurry/sdk/id;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    .line 541
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 389
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/flurry/sdk/lp;->b()V

    .line 392
    iget-boolean v1, p0, Lcom/flurry/sdk/id;->q:Z

    if-eqz v1, :cond_0

    .line 397
    invoke-static {}, Lcom/flurry/sdk/jc;->a()Lcom/flurry/sdk/jc;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jc;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 402
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 403
    invoke-static {}, Lcom/flurry/sdk/jc;->a()Lcom/flurry/sdk/jc;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jc;->e()Z

    move-result v1

    if-nez v1, :cond_3

    move v1, v0

    .line 406
    :goto_1
    iget-object v0, p0, Lcom/flurry/sdk/id;->u:Lcom/flurry/sdk/hq;

    if-eqz v0, :cond_2

    .line 408
    iget-boolean v0, p0, Lcom/flurry/sdk/id;->t:Z

    if-eq v0, v1, :cond_4

    .line 409
    const/4 v0, 0x3

    sget-object v4, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v5, "Limit ad tracking value has changed, purging"

    invoke-static {v0, v4, v5}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 410
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/flurry/sdk/id;->u:Lcom/flurry/sdk/hq;

    .line 436
    :cond_2
    :goto_2
    invoke-static {}, Lcom/flurry/sdk/jm;->a()Lcom/flurry/sdk/jm;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/flurry/sdk/jm;->a(Ljava/lang/Object;)V

    .line 438
    const/4 v0, 0x3

    sget-object v4, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v5, "Requesting proton config"

    invoke-static {v0, v4, v5}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 441
    invoke-direct {p0}, Lcom/flurry/sdk/id;->h()[B

    move-result-object v4

    .line 443
    if-eqz v4, :cond_0

    .line 448
    new-instance v5, Lcom/flurry/sdk/kj;

    invoke-direct {v5}, Lcom/flurry/sdk/kj;-><init>()V

    .line 449
    iget-object v0, p0, Lcom/flurry/sdk/id;->o:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lcom/flurry/sdk/id;->b:Ljava/lang/String;

    :goto_3
    invoke-virtual {v5, v0}, Lcom/flurry/sdk/kj;->a(Ljava/lang/String;)V

    .line 450
    const/16 v0, 0x1388

    invoke-virtual {v5, v0}, Lcom/flurry/sdk/kj;->d(I)V

    .line 451
    sget-object v0, Lcom/flurry/sdk/kl$a;->c:Lcom/flurry/sdk/kl$a;

    invoke-virtual {v5, v0}, Lcom/flurry/sdk/kj;->a(Lcom/flurry/sdk/kl$a;)V

    .line 452
    const-string v0, "Content-Type"

    const-string v6, "application/x-flurry;version=2"

    invoke-virtual {v5, v0, v6}, Lcom/flurry/sdk/kj;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 453
    const-string v0, "Accept"

    const-string v6, "application/x-flurry;version=2"

    invoke-virtual {v5, v0, v6}, Lcom/flurry/sdk/kj;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 454
    const-string v0, "FM-Checksum"

    invoke-static {v4}, Lcom/flurry/sdk/kg;->c([B)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v0, v6}, Lcom/flurry/sdk/kj;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 455
    new-instance v0, Lcom/flurry/sdk/kt;

    invoke-direct {v0}, Lcom/flurry/sdk/kt;-><init>()V

    invoke-virtual {v5, v0}, Lcom/flurry/sdk/kj;->a(Lcom/flurry/sdk/kx;)V

    .line 456
    new-instance v0, Lcom/flurry/sdk/kt;

    invoke-direct {v0}, Lcom/flurry/sdk/kt;-><init>()V

    invoke-virtual {v5, v0}, Lcom/flurry/sdk/kj;->b(Lcom/flurry/sdk/kx;)V

    .line 457
    invoke-virtual {v5, v4}, Lcom/flurry/sdk/kj;->a(Ljava/lang/Object;)V

    .line 459
    new-instance v0, Lcom/flurry/sdk/id$2;

    invoke-direct {v0, p0, v2, v3, v1}, Lcom/flurry/sdk/id$2;-><init>(Lcom/flurry/sdk/id;JZ)V

    invoke-virtual {v5, v0}, Lcom/flurry/sdk/kj;->a(Lcom/flurry/sdk/kj$a;)V

    .line 540
    invoke-static {}, Lcom/flurry/sdk/jm;->a()Lcom/flurry/sdk/jm;

    move-result-object v0

    invoke-virtual {v0, p0, v5}, Lcom/flurry/sdk/jm;->a(Ljava/lang/Object;Lcom/flurry/sdk/ls;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    .line 385
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 403
    :cond_3
    const/4 v0, 0x0

    move v1, v0

    goto/16 :goto_1

    .line 415
    :cond_4
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/flurry/sdk/id;->s:J

    iget-object v0, p0, Lcom/flurry/sdk/id;->u:Lcom/flurry/sdk/hq;

    iget-wide v8, v0, Lcom/flurry/sdk/hq;->b:J

    mul-long/2addr v8, v10

    add-long/2addr v6, v8

    cmp-long v0, v4, v6

    if-gez v0, :cond_5

    .line 416
    const/4 v0, 0x3

    sget-object v1, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v2, "Cached Proton config valid, no need to refresh"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 417
    iget-boolean v0, p0, Lcom/flurry/sdk/id;->v:Z

    if-nez v0, :cond_0

    .line 418
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/flurry/sdk/id;->v:Z

    .line 419
    const-string v0, "flurry.session_start"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/flurry/sdk/id;->b(Ljava/lang/String;Ljava/util/Map;)V

    goto/16 :goto_0

    .line 427
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/flurry/sdk/id;->s:J

    iget-object v0, p0, Lcom/flurry/sdk/id;->u:Lcom/flurry/sdk/hq;

    iget-wide v8, v0, Lcom/flurry/sdk/hq;->c:J

    mul-long/2addr v8, v10

    add-long/2addr v6, v8

    cmp-long v0, v4, v6

    if-ltz v0, :cond_2

    .line 428
    const/4 v0, 0x3

    sget-object v4, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v5, "Cached Proton config expired, purging"

    invoke-static {v0, v4, v5}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 429
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/flurry/sdk/id;->u:Lcom/flurry/sdk/hq;

    .line 430
    iget-object v0, p0, Lcom/flurry/sdk/id;->l:Lcom/flurry/sdk/jt;

    invoke-virtual {v0}, Lcom/flurry/sdk/jt;->a()V

    goto/16 :goto_2

    .line 449
    :cond_6
    iget-object v0, p0, Lcom/flurry/sdk/id;->o:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_3
.end method

.method static synthetic g(Lcom/flurry/sdk/id;)Z
    .locals 1

    .prologue
    .line 68
    iget-boolean v0, p0, Lcom/flurry/sdk/id;->v:Z

    return v0
.end method

.method static synthetic h(Lcom/flurry/sdk/id;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0}, Lcom/flurry/sdk/id;->f()V

    return-void
.end method

.method private h()[B
    .locals 6

    .prologue
    .line 547
    :try_start_0
    new-instance v2, Lcom/flurry/sdk/hp;

    invoke-direct {v2}, Lcom/flurry/sdk/hp;-><init>()V

    .line 548
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/flurry/sdk/hp;->a:Ljava/lang/String;

    .line 549
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/flurry/sdk/lm;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/flurry/sdk/hp;->b:Ljava/lang/String;

    .line 550
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/flurry/sdk/lm;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/flurry/sdk/hp;->c:Ljava/lang/String;

    .line 551
    invoke-static {}, Lcom/flurry/sdk/jp;->a()I

    move-result v0

    iput v0, v2, Lcom/flurry/sdk/hp;->d:I

    .line 552
    const/4 v0, 0x3

    iput v0, v2, Lcom/flurry/sdk/hp;->e:I

    .line 553
    invoke-static {}, Lcom/flurry/sdk/jl;->a()Lcom/flurry/sdk/jl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jl;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/flurry/sdk/hp;->f:Ljava/lang/String;

    .line 554
    invoke-static {}, Lcom/flurry/sdk/jc;->a()Lcom/flurry/sdk/jc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jc;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, v2, Lcom/flurry/sdk/hp;->g:Z

    .line 556
    new-instance v0, Lcom/flurry/sdk/hs;

    invoke-direct {v0}, Lcom/flurry/sdk/hs;-><init>()V

    iput-object v0, v2, Lcom/flurry/sdk/hp;->h:Lcom/flurry/sdk/hs;

    .line 557
    iget-object v0, v2, Lcom/flurry/sdk/hp;->h:Lcom/flurry/sdk/hs;

    new-instance v1, Lcom/flurry/sdk/hm;

    invoke-direct {v1}, Lcom/flurry/sdk/hm;-><init>()V

    iput-object v1, v0, Lcom/flurry/sdk/hs;->a:Lcom/flurry/sdk/hm;

    .line 558
    iget-object v0, v2, Lcom/flurry/sdk/hp;->h:Lcom/flurry/sdk/hs;

    iget-object v0, v0, Lcom/flurry/sdk/hs;->a:Lcom/flurry/sdk/hm;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    iput-object v1, v0, Lcom/flurry/sdk/hm;->a:Ljava/lang/String;

    .line 559
    iget-object v0, v2, Lcom/flurry/sdk/hp;->h:Lcom/flurry/sdk/hs;

    iget-object v0, v0, Lcom/flurry/sdk/hs;->a:Lcom/flurry/sdk/hm;

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    iput-object v1, v0, Lcom/flurry/sdk/hm;->b:Ljava/lang/String;

    .line 560
    iget-object v0, v2, Lcom/flurry/sdk/hp;->h:Lcom/flurry/sdk/hs;

    iget-object v0, v0, Lcom/flurry/sdk/hs;->a:Lcom/flurry/sdk/hm;

    sget-object v1, Landroid/os/Build;->ID:Ljava/lang/String;

    iput-object v1, v0, Lcom/flurry/sdk/hm;->c:Ljava/lang/String;

    .line 561
    iget-object v0, v2, Lcom/flurry/sdk/hp;->h:Lcom/flurry/sdk/hs;

    iget-object v0, v0, Lcom/flurry/sdk/hs;->a:Lcom/flurry/sdk/hm;

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    iput-object v1, v0, Lcom/flurry/sdk/hm;->d:Ljava/lang/String;

    .line 562
    iget-object v0, v2, Lcom/flurry/sdk/hp;->h:Lcom/flurry/sdk/hs;

    iget-object v0, v0, Lcom/flurry/sdk/hs;->a:Lcom/flurry/sdk/hm;

    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    iput-object v1, v0, Lcom/flurry/sdk/hm;->e:Ljava/lang/String;

    .line 563
    iget-object v0, v2, Lcom/flurry/sdk/hp;->h:Lcom/flurry/sdk/hs;

    iget-object v0, v0, Lcom/flurry/sdk/hs;->a:Lcom/flurry/sdk/hm;

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    iput-object v1, v0, Lcom/flurry/sdk/hm;->f:Ljava/lang/String;

    .line 565
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v2, Lcom/flurry/sdk/hp;->i:Ljava/util/List;

    .line 567
    invoke-static {}, Lcom/flurry/sdk/jc;->a()Lcom/flurry/sdk/jc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jc;->h()Ljava/util/Map;

    move-result-object v0

    .line 568
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 569
    new-instance v4, Lcom/flurry/sdk/hr;

    invoke-direct {v4}, Lcom/flurry/sdk/hr;-><init>()V

    .line 570
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/flurry/sdk/jk;

    iget v1, v1, Lcom/flurry/sdk/jk;->d:I

    iput v1, v4, Lcom/flurry/sdk/hr;->a:I

    .line 571
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/flurry/sdk/jk;

    iget-boolean v1, v1, Lcom/flurry/sdk/jk;->e:Z

    if-eqz v1, :cond_1

    .line 572
    new-instance v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    iput-object v1, v4, Lcom/flurry/sdk/hr;->b:Ljava/lang/String;

    .line 577
    :goto_2
    iget-object v0, v2, Lcom/flurry/sdk/hp;->i:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 597
    :catch_0
    move-exception v0

    .line 598
    const/4 v1, 0x5

    sget-object v2, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Proton config request failed with exception: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 599
    const/4 v0, 0x0

    :goto_3
    return-object v0

    .line 554
    :cond_0
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 575
    :cond_1
    :try_start_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-static {v0}, Lcom/flurry/sdk/lp;->b([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/flurry/sdk/hr;->b:Ljava/lang/String;

    goto :goto_2

    .line 580
    :cond_2
    invoke-static {}, Lcom/flurry/sdk/jg;->a()Lcom/flurry/sdk/jg;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jg;->e()Landroid/location/Location;

    move-result-object v0

    .line 581
    if-eqz v0, :cond_3

    .line 582
    new-instance v1, Lcom/flurry/sdk/hw;

    invoke-direct {v1}, Lcom/flurry/sdk/hw;-><init>()V

    iput-object v1, v2, Lcom/flurry/sdk/hp;->j:Lcom/flurry/sdk/hw;

    .line 583
    iget-object v1, v2, Lcom/flurry/sdk/hp;->j:Lcom/flurry/sdk/hw;

    new-instance v3, Lcom/flurry/sdk/hv;

    invoke-direct {v3}, Lcom/flurry/sdk/hv;-><init>()V

    iput-object v3, v1, Lcom/flurry/sdk/hw;->a:Lcom/flurry/sdk/hv;

    .line 584
    iget-object v1, v2, Lcom/flurry/sdk/hp;->j:Lcom/flurry/sdk/hw;

    iget-object v1, v1, Lcom/flurry/sdk/hw;->a:Lcom/flurry/sdk/hv;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    const/4 v3, 0x3

    invoke-static {v4, v5, v3}, Lcom/flurry/sdk/lp;->a(DI)D

    move-result-wide v4

    iput-wide v4, v1, Lcom/flurry/sdk/hv;->a:D

    .line 585
    iget-object v1, v2, Lcom/flurry/sdk/hp;->j:Lcom/flurry/sdk/hw;

    iget-object v1, v1, Lcom/flurry/sdk/hw;->a:Lcom/flurry/sdk/hv;

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    const/4 v3, 0x3

    invoke-static {v4, v5, v3}, Lcom/flurry/sdk/lp;->a(DI)D

    move-result-wide v4

    iput-wide v4, v1, Lcom/flurry/sdk/hv;->b:D

    .line 586
    iget-object v1, v2, Lcom/flurry/sdk/hp;->j:Lcom/flurry/sdk/hw;

    iget-object v1, v1, Lcom/flurry/sdk/hw;->a:Lcom/flurry/sdk/hv;

    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    float-to-double v4, v0

    const/4 v0, 0x3

    invoke-static {v4, v5, v0}, Lcom/flurry/sdk/lp;->a(DI)D

    move-result-wide v4

    double-to-float v0, v4

    iput v0, v1, Lcom/flurry/sdk/hv;->c:F

    .line 589
    :cond_3
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v0

    const-string v1, "UserId"

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 590
    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 591
    new-instance v1, Lcom/flurry/sdk/hz;

    invoke-direct {v1}, Lcom/flurry/sdk/hz;-><init>()V

    iput-object v1, v2, Lcom/flurry/sdk/hp;->k:Lcom/flurry/sdk/hz;

    .line 592
    iget-object v1, v2, Lcom/flurry/sdk/hp;->k:Lcom/flurry/sdk/hz;

    iput-object v0, v1, Lcom/flurry/sdk/hz;->a:Ljava/lang/String;

    .line 595
    :cond_4
    iget-object v0, p0, Lcom/flurry/sdk/id;->g:Lcom/flurry/sdk/kg;

    invoke-virtual {v0, v2}, Lcom/flurry/sdk/kg;->a(Ljava/lang/Object;)[B
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto :goto_3
.end method

.method static synthetic i(Lcom/flurry/sdk/id;)J
    .locals 2

    .prologue
    .line 68
    iget-wide v0, p0, Lcom/flurry/sdk/id;->r:J

    return-wide v0
.end method

.method private i()V
    .locals 6

    .prologue
    .line 671
    iget-object v0, p0, Lcom/flurry/sdk/id;->u:Lcom/flurry/sdk/hq;

    if-nez v0, :cond_1

    .line 729
    :cond_0
    return-void

    .line 675
    :cond_1
    const/4 v0, 0x5

    sget-object v1, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v2, "Processing config response"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 678
    iget-object v0, p0, Lcom/flurry/sdk/id;->u:Lcom/flurry/sdk/hq;

    iget-object v0, v0, Lcom/flurry/sdk/hq;->e:Lcom/flurry/sdk/ho;

    iget v0, v0, Lcom/flurry/sdk/ho;->c:I

    invoke-static {v0}, Lcom/flurry/sdk/ij;->a(I)V

    .line 679
    iget-object v0, p0, Lcom/flurry/sdk/id;->u:Lcom/flurry/sdk/hq;

    iget-object v0, v0, Lcom/flurry/sdk/hq;->e:Lcom/flurry/sdk/ho;

    iget v0, v0, Lcom/flurry/sdk/ho;->d:I

    mul-int/lit16 v0, v0, 0x3e8

    invoke-static {v0}, Lcom/flurry/sdk/ij;->b(I)V

    .line 680
    invoke-static {}, Lcom/flurry/sdk/il;->a()Lcom/flurry/sdk/il;

    move-result-object v0

    iget-object v1, p0, Lcom/flurry/sdk/id;->u:Lcom/flurry/sdk/hq;

    iget-object v1, v1, Lcom/flurry/sdk/hq;->e:Lcom/flurry/sdk/ho;

    iget-object v1, v1, Lcom/flurry/sdk/ho;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/il;->a(Ljava/lang/String;)V

    .line 683
    iget-boolean v0, p0, Lcom/flurry/sdk/id;->n:Z

    if-eqz v0, :cond_2

    .line 684
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v0

    const-string v1, "analyticsEnabled"

    iget-object v2, p0, Lcom/flurry/sdk/id;->u:Lcom/flurry/sdk/hq;

    iget-object v2, v2, Lcom/flurry/sdk/hq;->f:Lcom/flurry/sdk/ia;

    iget-boolean v2, v2, Lcom/flurry/sdk/ia;->b:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 688
    :cond_2
    iget-object v0, p0, Lcom/flurry/sdk/id;->l:Lcom/flurry/sdk/jt;

    invoke-virtual {v0}, Lcom/flurry/sdk/jt;->a()V

    .line 690
    iget-object v0, p0, Lcom/flurry/sdk/id;->u:Lcom/flurry/sdk/hq;

    iget-object v0, v0, Lcom/flurry/sdk/hq;->e:Lcom/flurry/sdk/ho;

    .line 691
    if-eqz v0, :cond_0

    .line 695
    iget-object v0, v0, Lcom/flurry/sdk/ho;->a:Ljava/util/List;

    .line 696
    if-eqz v0, :cond_0

    .line 700
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/hn;

    .line 701
    if-eqz v0, :cond_3

    .line 705
    iget-object v1, v0, Lcom/flurry/sdk/hn;->c:Ljava/util/List;

    .line 707
    if-eqz v1, :cond_3

    .line 711
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/flurry/sdk/ht;

    .line 712
    if-eqz v1, :cond_4

    .line 717
    iget-object v4, v1, Lcom/flurry/sdk/ht;->a:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 722
    iput-object v0, v1, Lcom/flurry/sdk/ht;->b:Lcom/flurry/sdk/hn;

    .line 725
    iget-object v4, p0, Lcom/flurry/sdk/id;->l:Lcom/flurry/sdk/jt;

    iget-object v5, v1, Lcom/flurry/sdk/ht;->a:Ljava/lang/String;

    invoke-virtual {v4, v5, v1}, Lcom/flurry/sdk/jt;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method static synthetic j(Lcom/flurry/sdk/id;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/flurry/sdk/id;->c:Ljava/lang/Runnable;

    return-object v0
.end method

.method private declared-synchronized j()V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 896
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/flurry/sdk/id;->i:Lcom/flurry/sdk/jv;

    invoke-virtual {v0}, Lcom/flurry/sdk/jv;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/ib;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 897
    if-eqz v0, :cond_1

    .line 900
    :try_start_1
    iget-object v1, p0, Lcom/flurry/sdk/id;->h:Lcom/flurry/sdk/kg;

    invoke-virtual {v0}, Lcom/flurry/sdk/ib;->c()[B

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/flurry/sdk/kg;->d([B)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/flurry/sdk/hq;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 906
    :goto_0
    :try_start_2
    invoke-direct {p0, v1}, Lcom/flurry/sdk/id;->a(Lcom/flurry/sdk/hq;)Z

    move-result v3

    if-nez v3, :cond_0

    move-object v1, v2

    .line 910
    :cond_0
    if-eqz v1, :cond_1

    .line 911
    const/4 v2, 0x4

    sget-object v3, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v4, "Loaded saved proton config response"

    invoke-static {v2, v3, v4}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 913
    const-wide/16 v2, 0x2710

    iput-wide v2, p0, Lcom/flurry/sdk/id;->r:J

    .line 915
    invoke-virtual {v0}, Lcom/flurry/sdk/ib;->a()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/flurry/sdk/id;->s:J

    .line 916
    invoke-virtual {v0}, Lcom/flurry/sdk/ib;->b()Z

    move-result v0

    iput-boolean v0, p0, Lcom/flurry/sdk/id;->t:Z

    .line 917
    iput-object v1, p0, Lcom/flurry/sdk/id;->u:Lcom/flurry/sdk/hq;

    .line 920
    invoke-direct {p0}, Lcom/flurry/sdk/id;->i()V

    .line 924
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/flurry/sdk/id;->q:Z

    .line 927
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/id$3;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/id$3;-><init>(Lcom/flurry/sdk/id;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 933
    monitor-exit p0

    return-void

    .line 901
    :catch_0
    move-exception v1

    .line 902
    const/4 v3, 0x5

    :try_start_3
    sget-object v4, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Failed to decode saved proton config response: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v4, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 903
    iget-object v1, p0, Lcom/flurry/sdk/id;->i:Lcom/flurry/sdk/jv;

    invoke-virtual {v1}, Lcom/flurry/sdk/jv;->b()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v1, v2

    goto :goto_0

    .line 896
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized k()V
    .locals 6

    .prologue
    .line 951
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/flurry/sdk/id;->p:Z

    if-nez v0, :cond_0

    .line 952
    sget-object v0, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v1, "Analytics disabled, not sending pulse reports."

    invoke-static {v0, v1}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 964
    :goto_0
    monitor-exit p0

    return-void

    .line 956
    :cond_0
    const/4 v0, 0x4

    :try_start_1
    sget-object v1, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Sending "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/flurry/sdk/id;->m:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " queued reports."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 958
    iget-object v0, p0, Lcom/flurry/sdk/id;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/ik;

    .line 959
    const/4 v2, 0x3

    sget-object v3, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Firing Pulse callbacks for event: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/flurry/sdk/ik;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 960
    invoke-static {}, Lcom/flurry/sdk/ij;->a()Lcom/flurry/sdk/ij;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ij;->a(Lcom/flurry/sdk/ik;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 951
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 963
    :cond_1
    :try_start_2
    invoke-direct {p0}, Lcom/flurry/sdk/id;->n()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method private declared-synchronized l()V
    .locals 3

    .prologue
    .line 967
    monitor-enter p0

    const/4 v0, 0x4

    :try_start_0
    sget-object v1, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v2, "Loading queued report data."

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 969
    iget-object v0, p0, Lcom/flurry/sdk/id;->j:Lcom/flurry/sdk/jv;

    invoke-virtual {v0}, Lcom/flurry/sdk/jv;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 971
    if-eqz v0, :cond_0

    .line 972
    iget-object v1, p0, Lcom/flurry/sdk/id;->m:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 974
    :cond_0
    monitor-exit p0

    return-void

    .line 967
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized m()V
    .locals 3

    .prologue
    .line 977
    monitor-enter p0

    const/4 v0, 0x4

    :try_start_0
    sget-object v1, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v2, "Saving queued report data."

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 979
    iget-object v0, p0, Lcom/flurry/sdk/id;->j:Lcom/flurry/sdk/jv;

    iget-object v1, p0, Lcom/flurry/sdk/id;->m:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jv;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 980
    monitor-exit p0

    return-void

    .line 977
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized n()V
    .locals 1

    .prologue
    .line 983
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/flurry/sdk/id;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 984
    iget-object v0, p0, Lcom/flurry/sdk/id;->j:Lcom/flurry/sdk/jv;

    invoke-virtual {v0}, Lcom/flurry/sdk/jv;->b()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 985
    monitor-exit p0

    return-void

    .line 983
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private o()Ljava/lang/String;
    .locals 4

    .prologue
    .line 988
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ".yflurryprotonconfig."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jo;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/flurry/sdk/lp;->i(Ljava/lang/String;)J

    move-result-wide v2

    const/16 v1, 0x10

    invoke-static {v2, v3, v1}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private p()Ljava/lang/String;
    .locals 4

    .prologue
    .line 992
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ".yflurryprotonreport."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jo;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/flurry/sdk/lp;->i(Ljava/lang/String;)J

    move-result-wide v2

    const/16 v1, 0x10

    invoke-static {v2, v3, v1}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 233
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    iget-object v1, p0, Lcom/flurry/sdk/id;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->c(Ljava/lang/Runnable;)V

    .line 235
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.sdk.NetworkStateEvent"

    iget-object v2, p0, Lcom/flurry/sdk/id;->f:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->b(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 236
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.sdk.IdProviderUpdatedAdvertisingId"

    iget-object v2, p0, Lcom/flurry/sdk/id;->e:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->b(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 237
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.sdk.IdProviderFinishedEvent"

    iget-object v2, p0, Lcom/flurry/sdk/id;->d:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->b(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 240
    invoke-static {}, Lcom/flurry/sdk/ij;->b()V

    .line 242
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v0

    const-string v1, "ProtonEnabled"

    invoke-virtual {v0, v1, p0}, Lcom/flurry/sdk/lg;->b(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)Z

    .line 244
    return-void
.end method

.method public declared-synchronized a(J)V
    .locals 3

    .prologue
    .line 299
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/flurry/sdk/id;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 343
    :goto_0
    monitor-exit p0

    return-void

    .line 303
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/flurry/sdk/lp;->b()V

    .line 306
    invoke-direct {p0, p1, p2}, Lcom/flurry/sdk/id;->b(J)V

    .line 334
    const-string v0, "flurry.session_end"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/flurry/sdk/id;->b(Ljava/lang/String;Ljava/util/Map;)V

    .line 337
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/id$11;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/id$11;-><init>(Lcom/flurry/sdk/id;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 299
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v3, 0x4

    .line 248
    const/4 v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    :cond_0
    :goto_0
    packed-switch v0, :pswitch_data_0

    .line 262
    const/4 v0, 0x6

    sget-object v1, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    const-string v2, "onSettingUpdate internal error!"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 265
    :goto_1
    return-void

    .line 248
    :sswitch_0
    const-string v1, "ProtonEnabled"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :sswitch_1
    const-string v1, "ProtonConfigUrl"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "analyticsEnabled"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    .line 250
    :pswitch_0
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/flurry/sdk/id;->n:Z

    .line 251
    sget-object v0, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onSettingUpdate, protonEnabled = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/flurry/sdk/id;->n:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 254
    :pswitch_1
    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/flurry/sdk/id;->o:Ljava/lang/String;

    .line 255
    sget-object v0, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onSettingUpdate, protonConfigUrl = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/flurry/sdk/id;->o:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 258
    :pswitch_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/flurry/sdk/id;->p:Z

    .line 259
    sget-object v0, Lcom/flurry/sdk/id;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onSettingUpdate, AnalyticsEnabled = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/flurry/sdk/id;->p:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 248
    :sswitch_data_0
    .sparse-switch
        -0x66855b25 -> :sswitch_2
        0x2633fcbb -> :sswitch_0
        0x5edae5c7 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/util/Map;)V
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
    .line 358
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/flurry/sdk/id;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 365
    :goto_0
    monitor-exit p0

    return-void

    .line 362
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/flurry/sdk/lp;->b()V

    .line 364
    invoke-direct {p0, p1, p2}, Lcom/flurry/sdk/id;->b(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 358
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 2

    .prologue
    .line 269
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/flurry/sdk/id;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 282
    :goto_0
    monitor-exit p0

    return-void

    .line 273
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/flurry/sdk/lp;->b()V

    .line 276
    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jb;->d()J

    move-result-wide v0

    sput-wide v0, Lcom/flurry/sdk/if;->a:J

    .line 279
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/flurry/sdk/id;->v:Z

    .line 281
    invoke-direct {p0}, Lcom/flurry/sdk/id;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 269
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()V
    .locals 2

    .prologue
    .line 286
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/flurry/sdk/id;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 295
    :goto_0
    monitor-exit p0

    return-void

    .line 290
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/flurry/sdk/lp;->b()V

    .line 293
    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jb;->d()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/flurry/sdk/id;->b(J)V

    .line 294
    invoke-direct {p0}, Lcom/flurry/sdk/id;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 286
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d()V
    .locals 1

    .prologue
    .line 347
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/flurry/sdk/id;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 355
    :goto_0
    monitor-exit p0

    return-void

    .line 351
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/flurry/sdk/lp;->b()V

    .line 354
    invoke-direct {p0}, Lcom/flurry/sdk/id;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 347
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
