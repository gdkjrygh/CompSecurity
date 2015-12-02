.class Lcom/qihoo/security/service/SecurityService$3;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/service/SecurityService;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/service/SecurityService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/service/SecurityService;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 1193
    iput-object p1, p0, Lcom/qihoo/security/service/SecurityService$3;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 1197
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$3;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0, p1}, Lcom/qihoo/security/service/SecurityService;->a(Lcom/qihoo/security/service/SecurityService;Landroid/os/Message;)V

    .line 1198
    return-void
.end method
