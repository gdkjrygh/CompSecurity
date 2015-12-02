.class public Lcom/facebook/auth/login/w;
.super Lcom/facebook/base/activity/a;
.source "AuthenticatedActivityHelper.java"


# instance fields
.field protected a:Lcom/facebook/base/broadcast/q;

.field private final b:Landroid/app/Activity;

.field private final c:Lcom/facebook/auth/b/b;

.field private final d:Lcom/facebook/base/a/d;

.field private final e:Lcom/facebook/fbservice/ops/o;

.field private final f:Lcom/facebook/auth/login/al;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/facebook/auth/b/b;Lcom/facebook/base/a/d;Lcom/facebook/fbservice/ops/o;Lcom/facebook/auth/login/al;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/facebook/base/activity/a;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/facebook/auth/login/w;->b:Landroid/app/Activity;

    .line 39
    iput-object p2, p0, Lcom/facebook/auth/login/w;->c:Lcom/facebook/auth/b/b;

    .line 40
    iput-object p3, p0, Lcom/facebook/auth/login/w;->d:Lcom/facebook/base/a/d;

    .line 41
    iput-object p4, p0, Lcom/facebook/auth/login/w;->e:Lcom/facebook/fbservice/ops/o;

    .line 42
    iput-object p5, p0, Lcom/facebook/auth/login/w;->f:Lcom/facebook/auth/login/al;

    .line 43
    return-void
.end method

.method static synthetic a(Lcom/facebook/auth/login/w;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/facebook/auth/login/w;->b:Landroid/app/Activity;

    return-object v0
.end method

.method private m(Landroid/app/Activity;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lcom/facebook/base/activity/AuthNotRequired;

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 133
    :cond_0
    :goto_0
    return v0

    .line 125
    :cond_1
    iget-object v1, p0, Lcom/facebook/auth/login/w;->d:Lcom/facebook/base/a/d;

    invoke-virtual {v1}, Lcom/facebook/base/a/d;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 129
    iget-object v1, p0, Lcom/facebook/auth/login/w;->c:Lcom/facebook/auth/b/b;

    invoke-interface {v1}, Lcom/facebook/auth/b/b;->b()Z

    move-result v1

    if-nez v1, :cond_0

    .line 133
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/app/Activity;Ljava/lang/Exception;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lcom/facebook/base/activity/AuthNotRequired;

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 117
    :cond_0
    :goto_0
    return v0

    .line 105
    :cond_1
    iget-object v1, p0, Lcom/facebook/auth/login/w;->e:Lcom/facebook/fbservice/ops/o;

    invoke-virtual {v1, p2}, Lcom/facebook/fbservice/ops/o;->a(Ljava/lang/Exception;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 111
    iget-object v0, p0, Lcom/facebook/auth/login/w;->f:Lcom/facebook/auth/login/al;

    invoke-interface {v0, p1}, Lcom/facebook/auth/login/al;->a(Landroid/app/Activity;)V

    .line 115
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 117
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 78
    invoke-direct {p0, p1}, Lcom/facebook/auth/login/w;->m(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    :goto_0
    return-void

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/login/w;->f:Lcom/facebook/auth/login/al;

    invoke-interface {v0, p1}, Lcom/facebook/auth/login/al;->b(Landroid/app/Activity;)V

    .line 85
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    goto :goto_0
.end method

.method public f(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0, p1}, Lcom/facebook/auth/login/w;->m(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    :goto_0
    return-void

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/login/w;->f:Lcom/facebook/auth/login/al;

    invoke-interface {v0, p1}, Lcom/facebook/auth/login/al;->b(Landroid/app/Activity;)V

    .line 56
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    goto :goto_0
.end method

.method public g(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/facebook/base/activity/AuthNotRequired;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 74
    :goto_0
    return-void

    .line 65
    :cond_0
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 66
    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 67
    new-instance v1, Lcom/facebook/auth/login/x;

    invoke-direct {v1, p0, p1, v0}, Lcom/facebook/auth/login/x;-><init>(Lcom/facebook/auth/login/w;Landroid/content/Context;Landroid/content/IntentFilter;)V

    iput-object v1, p0, Lcom/facebook/auth/login/w;->a:Lcom/facebook/base/broadcast/q;

    .line 73
    iget-object v0, p0, Lcom/facebook/auth/login/w;->a:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->a()V

    goto :goto_0
.end method

.method public h(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/facebook/base/activity/AuthNotRequired;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 97
    :cond_0
    :goto_0
    return-void

    .line 93
    :cond_1
    iget-object v0, p0, Lcom/facebook/auth/login/w;->a:Lcom/facebook/base/broadcast/q;

    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/facebook/auth/login/w;->a:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->b()V

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/auth/login/w;->a:Lcom/facebook/base/broadcast/q;

    goto :goto_0
.end method
