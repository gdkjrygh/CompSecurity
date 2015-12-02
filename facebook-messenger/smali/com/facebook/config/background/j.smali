.class Lcom/facebook/config/background/j;
.super Lcom/facebook/fbservice/ops/ac;
.source "ConfigurationBackgroundTask.java"


# instance fields
.field final synthetic a:Lcom/facebook/config/background/i;


# direct methods
.method constructor <init>(Lcom/facebook/config/background/i;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/facebook/config/background/j;->a:Lcom/facebook/config/background/i;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 4

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/config/background/j;->a:Lcom/facebook/config/background/i;

    invoke-static {v0}, Lcom/facebook/config/background/i;->b(Lcom/facebook/config/background/i;)Lcom/facebook/prefs/shared/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/background/h;->b:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/config/background/j;->a:Lcom/facebook/config/background/i;

    invoke-static {v2}, Lcom/facebook/config/background/i;->a(Lcom/facebook/config/background/i;)Lcom/facebook/common/time/a;

    move-result-object v2

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 96
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 102
    return-void
.end method

.method protected synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 88
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/config/background/j;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
