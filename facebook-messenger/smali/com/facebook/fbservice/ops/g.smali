.class Lcom/facebook/fbservice/ops/g;
.super Ljava/lang/Object;
.source "BlueServiceOperation.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/ops/c;


# direct methods
.method private constructor <init>(Lcom/facebook/fbservice/ops/c;)V
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lcom/facebook/fbservice/ops/g;->a:Lcom/facebook/fbservice/ops/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/fbservice/ops/c;Lcom/facebook/fbservice/ops/d;)V
    .locals 0

    .prologue
    .line 86
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/ops/g;-><init>(Lcom/facebook/fbservice/ops/c;)V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/fbservice/ops/g;->a:Lcom/facebook/fbservice/ops/c;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/ops/c;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 89
    iget-object v0, p0, Lcom/facebook/fbservice/ops/g;->a:Lcom/facebook/fbservice/ops/c;

    invoke-static {p2}, Lcom/facebook/fbservice/service/x;->a(Landroid/os/IBinder;)Lcom/facebook/fbservice/service/w;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/ops/c;Lcom/facebook/fbservice/service/w;)Lcom/facebook/fbservice/service/w;

    .line 90
    iget-object v0, p0, Lcom/facebook/fbservice/ops/g;->a:Lcom/facebook/fbservice/ops/c;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/c;->b(Lcom/facebook/fbservice/ops/c;)V

    .line 92
    :cond_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 95
    iget-object v0, p0, Lcom/facebook/fbservice/ops/g;->a:Lcom/facebook/fbservice/ops/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/ops/c;Lcom/facebook/fbservice/service/w;)Lcom/facebook/fbservice/service/w;

    .line 96
    iget-object v0, p0, Lcom/facebook/fbservice/ops/g;->a:Lcom/facebook/fbservice/ops/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/ops/c;Z)Z

    .line 97
    return-void
.end method
