.class Lcom/qihoo/security/opti/a/b$2;
.super Lcom/qihoo360/mobilesafe/core/c/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/a/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/a/b;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lcom/qihoo/security/opti/a/b$2;->a:Lcom/qihoo/security/opti/a/b;

    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/c/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 165
    invoke-super {p0, p1, p2}, Lcom/qihoo360/mobilesafe/core/c/b;->b(II)V

    .line 169
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b$2;->a:Lcom/qihoo/security/opti/a/b;

    invoke-static {v0}, Lcom/qihoo/security/opti/a/b;->d(Lcom/qihoo/security/opti/a/b;)Lcom/qihoo/security/opti/a/b$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b$2;->a:Lcom/qihoo/security/opti/a/b;

    invoke-static {v0}, Lcom/qihoo/security/opti/a/b;->d(Lcom/qihoo/security/opti/a/b;)Lcom/qihoo/security/opti/a/b$a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/qihoo/security/opti/a/b$a;->a(II)V

    .line 172
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b$2;->a:Lcom/qihoo/security/opti/a/b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/a/b;->a()V

    .line 174
    return-void
.end method
