.class public Lcom/facebook/orca/reflex/e;
.super Ljava/lang/Object;
.source "ReflexThreadListExperiment.java"

# interfaces
.implements Lcom/facebook/base/c;


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Lcom/facebook/abtest/qe/d/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/abtest/qe/d/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/abtest/qe/d/e;)V
    .locals 3

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/facebook/orca/reflex/e;->a:Lcom/facebook/prefs/shared/d;

    .line 34
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/d/e;

    const-string v1, "reflex_threadlistactivity"

    new-instance v2, Lcom/facebook/orca/reflex/f;

    invoke-direct {v2, p0}, Lcom/facebook/orca/reflex/f;-><init>(Lcom/facebook/orca/reflex/e;)V

    invoke-virtual {v0, v1, v2}, Lcom/facebook/abtest/qe/d/e;->a(Ljava/lang/String;Lcom/facebook/abtest/qe/d/c;)Lcom/facebook/abtest/qe/d/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/reflex/e;->b:Lcom/facebook/abtest/qe/d/a;

    .line 49
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/reflex/e;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/orca/reflex/e;->a:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/orca/reflex/e;->b:Lcom/facebook/abtest/qe/d/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/d/a;->e()V

    .line 71
    iget-object v0, p0, Lcom/facebook/orca/reflex/e;->b:Lcom/facebook/abtest/qe/d/a;

    new-instance v1, Lcom/facebook/orca/reflex/g;

    invoke-direct {v1, p0}, Lcom/facebook/orca/reflex/g;-><init>(Lcom/facebook/orca/reflex/e;)V

    invoke-virtual {v0, v1}, Lcom/facebook/abtest/qe/d/a;->a(Lcom/facebook/abtest/qe/d/d;)V

    .line 79
    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 52
    instance-of v1, p1, Lcom/facebook/orca/threadlist/FrameworkBasedThreadListActivity;

    .line 53
    invoke-virtual {p0}, Lcom/facebook/orca/reflex/e;->b()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 54
    :goto_0
    iget-object v2, p0, Lcom/facebook/orca/reflex/e;->b:Lcom/facebook/abtest/qe/d/a;

    invoke-virtual {v2}, Lcom/facebook/abtest/qe/d/a;->c()Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    .line 58
    if-ne v1, v0, :cond_0

    .line 60
    iget-object v0, p0, Lcom/facebook/orca/reflex/e;->b:Lcom/facebook/abtest/qe/d/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/d/a;->d()V

    .line 62
    :cond_0
    return-void

    .line 53
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Z
    .locals 3

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/orca/reflex/e;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/reflex/d;->a:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    return v0
.end method
