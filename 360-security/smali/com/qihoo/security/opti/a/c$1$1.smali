.class Lcom/qihoo/security/opti/a/c$1$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/a/c$1;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/a/c$1;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/a/c$1;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/qihoo/security/opti/a/c$1$1;->a:Lcom/qihoo/security/opti/a/c$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c$1$1;->a:Lcom/qihoo/security/opti/a/c$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/a/c$1;->a:Lcom/qihoo/security/opti/a/c;

    invoke-static {v0}, Lcom/qihoo/security/opti/a/c;->b(Lcom/qihoo/security/opti/a/c;)V

    .line 118
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c$1$1;->a:Lcom/qihoo/security/opti/a/c$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/a/c$1;->a:Lcom/qihoo/security/opti/a/c;

    invoke-static {v0}, Lcom/qihoo/security/opti/a/c;->c(Lcom/qihoo/security/opti/a/c;)V

    .line 119
    return-void
.end method
