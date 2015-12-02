.class Lcom/facebook/fbservice/service/i;
.super Ljava/lang/Object;
.source "BlueServiceQueue.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/service/h;


# direct methods
.method constructor <init>(Lcom/facebook/fbservice/service/h;)V
    .locals 0

    .prologue
    .line 148
    iput-object p1, p0, Lcom/facebook/fbservice/service/i;->a:Lcom/facebook/fbservice/service/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 151
    iget-object v0, p0, Lcom/facebook/fbservice/service/i;->a:Lcom/facebook/fbservice/service/h;

    invoke-static {v0}, Lcom/facebook/fbservice/service/h;->a(Lcom/facebook/fbservice/service/h;)Lcom/facebook/common/executors/i;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 152
    iget-object v0, p0, Lcom/facebook/fbservice/service/i;->a:Lcom/facebook/fbservice/service/h;

    invoke-static {v0}, Lcom/facebook/fbservice/service/h;->a(Lcom/facebook/fbservice/service/h;)Lcom/facebook/common/executors/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/common/executors/i;->a()V

    .line 154
    :cond_0
    iget-object v0, p0, Lcom/facebook/fbservice/service/i;->a:Lcom/facebook/fbservice/service/h;

    invoke-static {v0}, Lcom/facebook/fbservice/service/h;->b(Lcom/facebook/fbservice/service/h;)Lcom/facebook/fbservice/service/m;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 155
    iget-object v0, p0, Lcom/facebook/fbservice/service/i;->a:Lcom/facebook/fbservice/service/h;

    invoke-static {v0}, Lcom/facebook/fbservice/service/h;->b(Lcom/facebook/fbservice/service/h;)Lcom/facebook/fbservice/service/m;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/fbservice/service/m;->a(Lcom/facebook/fbservice/service/m;)Lcom/google/common/d/a/s;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/common/d/a/s;->cancel(Z)Z

    .line 157
    :cond_1
    iget-object v0, p0, Lcom/facebook/fbservice/service/i;->a:Lcom/facebook/fbservice/service/h;

    invoke-static {v0}, Lcom/facebook/fbservice/service/h;->c(Lcom/facebook/fbservice/service/h;)Lcom/facebook/fbservice/service/o;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/fbservice/service/i;->a:Lcom/facebook/fbservice/service/h;

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/service/o;->b(Lcom/facebook/fbservice/service/h;)V

    .line 158
    return-void
.end method
