.class public final Lcom/b/a/n;
.super Ljava/lang/Object;

# interfaces
.implements Lb/a/hw;


# instance fields
.field private final a:Lcom/b/a/a/b;

.field private b:Landroid/content/Context;

.field private c:Lcom/b/a/m;

.field private d:Lb/a/hp;

.field private e:Lb/a/e;

.field private f:Lb/a/ia;

.field private g:Lb/a/hq;

.field private h:Lb/a/hl;

.field private i:Z


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/b/a/a/b;

    invoke-direct {v0}, Lcom/b/a/a/b;-><init>()V

    iput-object v0, p0, Lcom/b/a/n;->a:Lcom/b/a/a/b;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/b/a/n;->b:Landroid/content/Context;

    new-instance v0, Lb/a/hp;

    invoke-direct {v0}, Lb/a/hp;-><init>()V

    iput-object v0, p0, Lcom/b/a/n;->d:Lb/a/hp;

    new-instance v0, Lb/a/e;

    invoke-direct {v0}, Lb/a/e;-><init>()V

    iput-object v0, p0, Lcom/b/a/n;->e:Lb/a/e;

    new-instance v0, Lb/a/ia;

    invoke-direct {v0}, Lb/a/ia;-><init>()V

    iput-object v0, p0, Lcom/b/a/n;->f:Lb/a/ia;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/b/a/n;->i:Z

    iget-object v0, p0, Lcom/b/a/n;->d:Lb/a/hp;

    invoke-virtual {v0, p0}, Lb/a/hp;->a(Lb/a/hw;)V

    return-void
.end method

.method static synthetic a(Lcom/b/a/n;Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/b/a/n;->f:Lb/a/ia;

    invoke-static {p1}, Lb/a/ia;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/b/a/n;->c:Lcom/b/a/m;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/b/a/n;->c:Lcom/b/a/m;

    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/b/a/n;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/b/a/n;->d(Landroid/content/Context;)V

    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 2

    iget-boolean v0, p0, Lcom/b/a/n;->i:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/n;->b:Landroid/content/Context;

    new-instance v0, Lb/a/hq;

    iget-object v1, p0, Lcom/b/a/n;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lb/a/hq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/b/a/n;->g:Lb/a/hq;

    iget-object v0, p0, Lcom/b/a/n;->b:Landroid/content/Context;

    invoke-static {v0}, Lb/a/hl;->a(Landroid/content/Context;)Lb/a/hl;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/n;->h:Lb/a/hl;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/b/a/n;->i:Z

    :cond_0
    return-void
.end method

.method private d(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/b/a/n;->f:Lb/a/ia;

    invoke-static {p1}, Lb/a/ia;->b(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/b/a/n;->e:Lb/a/e;

    invoke-virtual {v0, p1}, Lb/a/e;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/b/a/n;->c:Lcom/b/a/m;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/b/a/n;->c:Lcom/b/a/m;

    :cond_0
    iget-object v0, p0, Lcom/b/a/n;->h:Lb/a/hl;

    invoke-virtual {v0}, Lb/a/hl;->b()V

    return-void
.end method


# virtual methods
.method final a(Landroid/content/Context;)V
    .locals 3

    if-nez p1, :cond_0

    const-string v0, "MobclickAgent"

    const-string v1, "unexpected null context in onResume"

    invoke-static {v0, v1}, Lb/a/fg;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    sget-boolean v0, Lcom/b/a/a;->h:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/b/a/n;->e:Lb/a/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb/a/e;->a(Ljava/lang/String;)V

    :cond_1
    :try_start_0
    iget-boolean v0, p0, Lcom/b/a/n;->i:Z

    if-nez v0, :cond_2

    invoke-direct {p0, p1}, Lcom/b/a/n;->c(Landroid/content/Context;)V

    :cond_2
    new-instance v0, Lcom/b/a/o;

    invoke-direct {v0, p0, p1}, Lcom/b/a/o;-><init>(Lcom/b/a/n;Landroid/content/Context;)V

    invoke-static {v0}, Lcom/b/a/r;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "MobclickAgent"

    const-string v2, "Exception occurred in Mobclick.onResume(). "

    invoke-static {v1, v2, v0}, Lb/a/fg;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method final a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V
    .locals 3

    :try_start_0
    iget-boolean v0, p0, Lcom/b/a/n;->i:Z

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/b/a/n;->c(Landroid/content/Context;)V

    :cond_0
    iget-object v0, p0, Lcom/b/a/n;->g:Lb/a/hq;

    invoke-virtual {v0, p2, p3}, Lb/a/hq;->a(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "MobclickAgent"

    const-string v2, ""

    invoke-static {v1, v2, v0}, Lb/a/fg;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/b/a/n;->e:Lb/a/e;

    invoke-virtual {v0}, Lb/a/e;->a()V

    iget-object v0, p0, Lcom/b/a/n;->b:Landroid/content/Context;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/b/a/n;->h:Lb/a/hl;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/b/a/n;->h:Lb/a/hl;

    new-instance v1, Lb/a/g;

    invoke-direct {v1, p1}, Lb/a/g;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lb/a/hl;->b(Lb/a/hs;)V

    :cond_0
    iget-object v0, p0, Lcom/b/a/n;->b:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/b/a/n;->d(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/b/a/n;->b:Landroid/content/Context;

    const-string v1, "umeng_general_config"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_1
    invoke-static {}, Lcom/b/a/r;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "MobclickAgent"

    const-string v2, "Exception in onAppCrash"

    invoke-static {v1, v2, v0}, Lb/a/fg;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method final b(Landroid/content/Context;)V
    .locals 3

    if-nez p1, :cond_0

    const-string v0, "MobclickAgent"

    const-string v1, "unexpected null context in onPause"

    invoke-static {v0, v1}, Lb/a/fg;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    sget-boolean v0, Lcom/b/a/a;->h:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/b/a/n;->e:Lb/a/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb/a/e;->b(Ljava/lang/String;)V

    :cond_1
    :try_start_0
    iget-boolean v0, p0, Lcom/b/a/n;->i:Z

    if-nez v0, :cond_2

    invoke-direct {p0, p1}, Lcom/b/a/n;->c(Landroid/content/Context;)V

    :cond_2
    new-instance v0, Lcom/b/a/p;

    invoke-direct {v0, p0, p1}, Lcom/b/a/p;-><init>(Lcom/b/a/n;Landroid/content/Context;)V

    invoke-static {v0}, Lcom/b/a/r;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "MobclickAgent"

    const-string v2, "Exception occurred in Mobclick.onRause(). "

    invoke-static {v1, v2, v0}, Lb/a/fg;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0
.end method
