.class Lcom/facebook/fbservice/ops/x;
.super Ljava/lang/Object;
.source "DefaultBlueServiceOperationFactory.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/ops/r;


# direct methods
.method private constructor <init>(Lcom/facebook/fbservice/ops/r;)V
    .locals 0

    .prologue
    .line 164
    iput-object p1, p0, Lcom/facebook/fbservice/ops/x;->a:Lcom/facebook/fbservice/ops/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/fbservice/ops/r;Lcom/facebook/fbservice/ops/q;)V
    .locals 0

    .prologue
    .line 164
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/ops/x;-><init>(Lcom/facebook/fbservice/ops/r;)V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 167
    iget-object v0, p0, Lcom/facebook/fbservice/ops/x;->a:Lcom/facebook/fbservice/ops/r;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/r;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 168
    iget-object v0, p0, Lcom/facebook/fbservice/ops/x;->a:Lcom/facebook/fbservice/ops/r;

    invoke-static {p2}, Lcom/facebook/fbservice/service/x;->a(Landroid/os/IBinder;)Lcom/facebook/fbservice/service/w;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/fbservice/ops/r;->a(Lcom/facebook/fbservice/ops/r;Lcom/facebook/fbservice/service/w;)Lcom/facebook/fbservice/service/w;

    .line 169
    iget-object v0, p0, Lcom/facebook/fbservice/ops/x;->a:Lcom/facebook/fbservice/ops/r;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/r;->c(Lcom/facebook/fbservice/ops/r;)V

    .line 171
    :cond_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 175
    iget-object v0, p0, Lcom/facebook/fbservice/ops/x;->a:Lcom/facebook/fbservice/ops/r;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/fbservice/ops/r;->a(Lcom/facebook/fbservice/ops/r;Lcom/facebook/fbservice/service/w;)Lcom/facebook/fbservice/service/w;

    .line 176
    iget-object v0, p0, Lcom/facebook/fbservice/ops/x;->a:Lcom/facebook/fbservice/ops/r;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/fbservice/ops/r;->a(Lcom/facebook/fbservice/ops/r;Z)Z

    .line 177
    return-void
.end method
