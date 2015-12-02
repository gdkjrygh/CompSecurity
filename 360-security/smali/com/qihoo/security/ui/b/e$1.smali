.class Lcom/qihoo/security/ui/b/e$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/b/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/b/e;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/b/e;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/qihoo/security/ui/b/e$1;->a:Lcom/qihoo/security/ui/b/e;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo/security/ui/b/e$1;->a:Lcom/qihoo/security/ui/b/e;

    invoke-static {v0, p1}, Lcom/qihoo/security/ui/b/e;->a(Lcom/qihoo/security/ui/b/e;Landroid/os/Message;)V

    .line 31
    return-void
.end method
