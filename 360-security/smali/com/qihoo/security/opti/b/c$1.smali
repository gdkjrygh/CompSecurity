.class Lcom/qihoo/security/opti/b/c$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/b/c;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/b/c;)V
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/qihoo/security/opti/b/c$1;->a:Lcom/qihoo/security/opti/b/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 41
    iget-object v0, p0, Lcom/qihoo/security/opti/b/c$1;->a:Lcom/qihoo/security/opti/b/c;

    invoke-static {p2}, Lcom/qihoo360/mobilesafe/core/c/c$a;->a(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/b/c;->a(Lcom/qihoo/security/opti/b/c;Lcom/qihoo360/mobilesafe/core/c/c;)Lcom/qihoo360/mobilesafe/core/c/c;

    .line 43
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 47
    iget-object v0, p0, Lcom/qihoo/security/opti/b/c$1;->a:Lcom/qihoo/security/opti/b/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/b/c;->a(Lcom/qihoo/security/opti/b/c;Lcom/qihoo360/mobilesafe/core/c/c;)Lcom/qihoo360/mobilesafe/core/c/c;

    .line 48
    return-void
.end method
