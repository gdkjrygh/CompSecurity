.class Lcom/qihoo/security/v5/CheckUpdateDialog$3;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/v5/CheckUpdateDialog;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/v5/CheckUpdateDialog$a;

.field final synthetic b:Lcom/qihoo/security/v5/CheckUpdateDialog;


# direct methods
.method constructor <init>(Lcom/qihoo/security/v5/CheckUpdateDialog;Lcom/qihoo/security/v5/CheckUpdateDialog$a;)V
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lcom/qihoo/security/v5/CheckUpdateDialog$3;->b:Lcom/qihoo/security/v5/CheckUpdateDialog;

    iput-object p2, p0, Lcom/qihoo/security/v5/CheckUpdateDialog$3;->a:Lcom/qihoo/security/v5/CheckUpdateDialog$a;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 109
    invoke-static {}, Lcom/qihoo/security/v5/CheckUpdateDialog;->c()I

    move-result v0

    .line 110
    iget-object v1, p0, Lcom/qihoo/security/v5/CheckUpdateDialog$3;->a:Lcom/qihoo/security/v5/CheckUpdateDialog$a;

    iget-object v2, p0, Lcom/qihoo/security/v5/CheckUpdateDialog$3;->a:Lcom/qihoo/security/v5/CheckUpdateDialog$a;

    invoke-static {v2, v3, v0, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/v5/CheckUpdateDialog$a;->sendMessage(Landroid/os/Message;)Z

    .line 111
    return-void
.end method
