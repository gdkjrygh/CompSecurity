.class final Lcom/a/a/a/c;
.super Lcom/a/a/a/o;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation


# instance fields
.field private final d:Landroid/app/Application;

.field private final e:Landroid/app/Application$ActivityLifecycleCallbacks;


# direct methods
.method constructor <init>(Lcom/a/a/a/r;Lcom/a/a/a/t;Landroid/app/Application;)V
    .locals 1

    .prologue
    .line 76
    invoke-direct {p0, p1, p2}, Lcom/a/a/a/o;-><init>(Lcom/a/a/a/r;Lcom/a/a/a/t;)V

    .line 24
    new-instance v0, Lcom/a/a/a/d;

    invoke-direct {v0, p0}, Lcom/a/a/a/d;-><init>(Lcom/a/a/a/c;)V

    iput-object v0, p0, Lcom/a/a/a/c;->e:Landroid/app/Application$ActivityLifecycleCallbacks;

    .line 77
    iput-object p3, p0, Lcom/a/a/a/c;->d:Landroid/app/Application;

    .line 78
    invoke-static {}, Lcom/a/a/a/a;->c()Lcom/a/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/a/a;->v()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lb/a/a/a/a/b/j;->e(Landroid/content/Context;)V

    .line 80
    iget-object v0, p0, Lcom/a/a/a/c;->e:Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {p3, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 81
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 85
    invoke-static {}, Lcom/a/a/a/a;->c()Lcom/a/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/a/a;->v()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lb/a/a/a/a/b/j;->e(Landroid/content/Context;)V

    .line 87
    iget-object v0, p0, Lcom/a/a/a/c;->d:Landroid/app/Application;

    iget-object v1, p0, Lcom/a/a/a/c;->e:Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 88
    invoke-super {p0}, Lcom/a/a/a/o;->a()V

    .line 89
    return-void
.end method
