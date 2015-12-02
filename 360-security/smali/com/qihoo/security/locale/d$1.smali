.class Lcom/qihoo/security/locale/d$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/locale/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/locale/d;


# direct methods
.method constructor <init>(Lcom/qihoo/security/locale/d;)V
    .locals 0

    .prologue
    .line 814
    iput-object p1, p0, Lcom/qihoo/security/locale/d$1;->a:Lcom/qihoo/security/locale/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    .prologue
    .line 825
    iget-object v0, p0, Lcom/qihoo/security/locale/d$1;->a:Lcom/qihoo/security/locale/d;

    invoke-static {p2}, Lcom/qihoo/security/locale/a$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/locale/a;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/locale/d;->a(Lcom/qihoo/security/locale/d;Lcom/qihoo/security/locale/a;)Lcom/qihoo/security/locale/a;

    .line 827
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d$1;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->b(Lcom/qihoo/security/locale/d;)Lcom/qihoo/security/locale/a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/locale/d$1;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v1}, Lcom/qihoo/security/locale/d;->a(Lcom/qihoo/security/locale/d;)Lcom/qihoo/security/locale/b$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo/security/locale/a;->a(Lcom/qihoo/security/locale/b;)V

    .line 828
    iget-object v0, p0, Lcom/qihoo/security/locale/d$1;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->c(Lcom/qihoo/security/locale/d;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/locale/d$1;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->c(Lcom/qihoo/security/locale/d;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 829
    iget-object v0, p0, Lcom/qihoo/security/locale/d$1;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->c(Lcom/qihoo/security/locale/d;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/b;

    .line 830
    iget-object v2, p0, Lcom/qihoo/security/locale/d$1;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v2}, Lcom/qihoo/security/locale/d;->b(Lcom/qihoo/security/locale/d;)Lcom/qihoo/security/locale/a;

    move-result-object v2

    invoke-interface {v2, v0}, Lcom/qihoo/security/locale/a;->a(Lcom/qihoo/security/locale/b;)V

    goto :goto_0

    .line 836
    :catch_0
    move-exception v0

    .line 841
    :cond_0
    :goto_1
    return-void

    .line 832
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/locale/d$1;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->c(Lcom/qihoo/security/locale/d;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 833
    iget-object v0, p0, Lcom/qihoo/security/locale/d$1;->a:Lcom/qihoo/security/locale/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/locale/d;->a(Lcom/qihoo/security/locale/d;Ljava/util/List;)Ljava/util/List;

    .line 834
    iget-object v0, p0, Lcom/qihoo/security/locale/d$1;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->b(Lcom/qihoo/security/locale/d;)Lcom/qihoo/security/locale/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/locale/a;->f()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    .prologue
    .line 818
    return-void
.end method
