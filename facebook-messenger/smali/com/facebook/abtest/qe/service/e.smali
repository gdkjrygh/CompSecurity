.class Lcom/facebook/abtest/qe/service/e;
.super Ljava/lang/Object;
.source "QuickExperimentRefresher.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field final synthetic a:Lcom/facebook/abtest/qe/service/d;


# direct methods
.method constructor <init>(Lcom/facebook/abtest/qe/service/d;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/facebook/abtest/qe/service/e;->a:Lcom/facebook/abtest/qe/service/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 4

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/e;->a:Lcom/facebook/abtest/qe/service/d;

    invoke-static {v0}, Lcom/facebook/abtest/qe/service/d;->b(Lcom/facebook/abtest/qe/service/d;)Lcom/facebook/prefs/shared/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/abtest/qe/data/a;->d:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/abtest/qe/service/e;->a:Lcom/facebook/abtest/qe/service/d;

    invoke-static {v2}, Lcom/facebook/abtest/qe/service/d;->a(Lcom/facebook/abtest/qe/service/d;)Lcom/facebook/common/time/a;

    move-result-object v2

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 54
    return-void
.end method
