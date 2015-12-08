.class public abstract Lcom/cmcm/adsdk/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Landroid/content/Context;

.field private static b:Ljava/lang/String;

.field private static c:Z

.field private static d:Z

.field private static e:Z

.field private static f:Z

.field private static g:Z

.field private static h:Lcom/cmcm/adsdk/b/a;

.field private static i:I

.field private static j:J

.field private static k:J

.field private static l:J

.field private static m:Lcom/cmcm/a/a;

.field private static n:Landroid/content/BroadcastReceiver;

.field private static o:Lcom/cmcm/adsdk/b/d;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    .line 30
    sput-boolean v1, Lcom/cmcm/adsdk/b;->c:Z

    .line 32
    const/4 v0, 0x1

    sput-boolean v0, Lcom/cmcm/adsdk/b;->d:Z

    .line 33
    sput-boolean v1, Lcom/cmcm/adsdk/b;->e:Z

    .line 34
    sput-boolean v1, Lcom/cmcm/adsdk/b;->f:Z

    .line 35
    sput-boolean v1, Lcom/cmcm/adsdk/b;->g:Z

    .line 36
    sput-object v4, Lcom/cmcm/adsdk/b;->h:Lcom/cmcm/adsdk/b/a;

    .line 39
    sput v1, Lcom/cmcm/adsdk/b;->i:I

    .line 40
    sput-wide v2, Lcom/cmcm/adsdk/b;->j:J

    .line 41
    sput-wide v2, Lcom/cmcm/adsdk/b;->k:J

    .line 42
    sput-wide v2, Lcom/cmcm/adsdk/b;->l:J

    .line 71
    sput-object v4, Lcom/cmcm/adsdk/b;->n:Landroid/content/BroadcastReceiver;

    .line 105
    new-instance v0, Lcom/cmcm/adsdk/c;

    invoke-direct {v0}, Lcom/cmcm/adsdk/c;-><init>()V

    sput-object v0, Lcom/cmcm/adsdk/b;->o:Lcom/cmcm/adsdk/b/d;

    return-void
.end method

.method static synthetic a(Landroid/content/BroadcastReceiver;)Landroid/content/BroadcastReceiver;
    .locals 0

    .prologue
    .line 27
    sput-object p0, Lcom/cmcm/adsdk/b;->n:Landroid/content/BroadcastReceiver;

    return-object p0
.end method

.method public static a()V
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x1

    sput-boolean v0, Lcom/cmcm/adsdk/b;->e:Z

    .line 46
    return-void
.end method

.method protected static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 74
    invoke-static {p1}, Lcom/cmcm/adsdk/b/a;->a(Ljava/lang/String;)Lcom/cmcm/adsdk/b/a;

    move-result-object v0

    .line 75
    sput-object v0, Lcom/cmcm/adsdk/b;->h:Lcom/cmcm/adsdk/b/a;

    invoke-virtual {v0, p0}, Lcom/cmcm/adsdk/b/a;->a(Landroid/content/Context;)V

    .line 77
    const/4 v0, 0x1

    sput-boolean v0, Lcom/cmcm/adsdk/b;->f:Z

    .line 78
    sget-object v0, Lcom/cmcm/adsdk/b;->h:Lcom/cmcm/adsdk/b/a;

    sget-object v1, Lcom/cmcm/adsdk/b;->o:Lcom/cmcm/adsdk/b/d;

    invoke-virtual {v0, v1}, Lcom/cmcm/adsdk/b/a;->a(Lcom/cmcm/adsdk/b/d;)V

    .line 79
    return-void
.end method

.method protected static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v1, 0x2

    const/4 v3, 0x0

    .line 49
    sput-object p0, Lcom/cmcm/adsdk/b;->a:Landroid/content/Context;

    .line 50
    sput-object p1, Lcom/cmcm/adsdk/b;->b:Ljava/lang/String;

    .line 51
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v2

    sget-boolean v0, Lcom/cmcm/adsdk/b;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v2, v0}, Lcom/picksinit/b;->setmAdResourceRp(I)V

    .line 52
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-static {}, Lcom/cmcm/adsdk/b;->f()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/picksinit/b;->setmCver(I)V

    .line 53
    sput-boolean v3, Lcom/cmcm/adsdk/b;->c:Z

    .line 54
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2, v3}, Lcom/picksinit/b;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 56
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/picksinit/b;->setSSPId(I)V

    .line 57
    return-void

    :cond_0
    move v0, v1

    .line 51
    goto :goto_0
.end method

.method public static b()Z
    .locals 1

    .prologue
    .line 64
    sget-boolean v0, Lcom/cmcm/adsdk/b;->c:Z

    return v0
.end method

.method public static c()Z
    .locals 1

    .prologue
    .line 69
    sget-boolean v0, Lcom/cmcm/adsdk/b;->f:Z

    return v0
.end method

.method public static declared-synchronized d()Z
    .locals 2

    .prologue
    .line 164
    const-class v0, Lcom/cmcm/adsdk/b;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/cmcm/adsdk/b;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 168
    sget-object v0, Lcom/cmcm/adsdk/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static f()I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 173
    :try_start_0
    sget-object v1, Lcom/cmcm/adsdk/b;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 174
    sget-object v2, Lcom/cmcm/adsdk/b;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 175
    iget v0, v1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    :goto_0
    return v0

    .line 177
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    goto :goto_0
.end method

.method public static g()J
    .locals 2

    .prologue
    .line 191
    sget-wide v0, Lcom/cmcm/adsdk/b;->j:J

    return-wide v0
.end method

.method public static h()J
    .locals 2

    .prologue
    .line 194
    sget-wide v0, Lcom/cmcm/adsdk/b;->k:J

    return-wide v0
.end method

.method public static i()J
    .locals 2

    .prologue
    .line 197
    sget-wide v0, Lcom/cmcm/adsdk/b;->l:J

    return-wide v0
.end method

.method public static j()I
    .locals 1

    .prologue
    .line 238
    sget v0, Lcom/cmcm/adsdk/b;->i:I

    return v0
.end method

.method public static k()Lcom/cmcm/a/a;
    .locals 1

    .prologue
    .line 252
    sget-object v0, Lcom/cmcm/adsdk/b;->m:Lcom/cmcm/a/a;

    return-object v0
.end method

.method static synthetic l()Landroid/content/BroadcastReceiver;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/cmcm/adsdk/b;->n:Landroid/content/BroadcastReceiver;

    return-object v0
.end method

.method static synthetic m()Lcom/cmcm/adsdk/b/d;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/cmcm/adsdk/b;->o:Lcom/cmcm/adsdk/b/d;

    return-object v0
.end method

.method static synthetic n()Lcom/cmcm/adsdk/b/a;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/cmcm/adsdk/b;->h:Lcom/cmcm/adsdk/b/a;

    return-object v0
.end method

.method static synthetic o()Z
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    sput-boolean v0, Lcom/cmcm/adsdk/b;->f:Z

    return v0
.end method

.method static synthetic p()Z
    .locals 1

    .prologue
    .line 27
    sget-boolean v0, Lcom/cmcm/adsdk/b;->g:Z

    return v0
.end method

.method static synthetic q()Landroid/content/Context;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/cmcm/adsdk/b;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic r()Z
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x1

    sput-boolean v0, Lcom/cmcm/adsdk/b;->g:Z

    return v0
.end method
