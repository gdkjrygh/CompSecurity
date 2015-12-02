.class Lcom/qihoo/security/gamebooster/b$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/gamebooster/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/b;)V
    .locals 0

    .prologue
    .line 1066
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/b$5;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 1070
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$5;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {p2}, Lcom/qihoo/security/service/a$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/service/a;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/gamebooster/b;->a:Lcom/qihoo/security/service/a;

    .line 1071
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$5;->a:Lcom/qihoo/security/gamebooster/b;

    iget-object v0, v0, Lcom/qihoo/security/gamebooster/b;->a:Lcom/qihoo/security/service/a;

    if-eqz v0, :cond_0

    .line 1073
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$5;->a:Lcom/qihoo/security/gamebooster/b;

    iget-object v0, v0, Lcom/qihoo/security/gamebooster/b;->a:Lcom/qihoo/security/service/a;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$5;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/b;->k(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/service/c$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->a(Lcom/qihoo/security/service/c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1078
    :cond_0
    :goto_0
    return-void

    .line 1074
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 1082
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$5;->a:Lcom/qihoo/security/gamebooster/b;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/qihoo/security/gamebooster/b;->a:Lcom/qihoo/security/service/a;

    .line 1083
    return-void
.end method
