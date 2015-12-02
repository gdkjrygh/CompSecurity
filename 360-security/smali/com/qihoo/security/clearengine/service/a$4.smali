.class Lcom/qihoo/security/clearengine/service/a$4;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/clearengine/service/a;->a(Lcom/qihoo/security/e/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/clearengine/service/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/clearengine/service/a;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/security/clearengine/service/a$4;->a:Lcom/qihoo/security/clearengine/service/a;

    .line 304
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 307
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$4;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-static {v0, p1}, Lcom/qihoo/security/clearengine/service/a;->a(Lcom/qihoo/security/clearengine/service/a;Landroid/os/Message;)V

    .line 308
    return-void
.end method
