.class Lcom/qihoo/security/widget/a$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/a;)V
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/qihoo/security/widget/a$1;->a:Lcom/qihoo/security/widget/a;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 58
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 59
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 69
    :cond_0
    :goto_0
    return-void

    .line 61
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/widget/a$1;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->a(Lcom/qihoo/security/widget/a;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/qihoo/security/widget/a$1;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->b(Lcom/qihoo/security/widget/a;)Lcom/qihoo/security/widget/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/widget/a$1;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v1}, Lcom/qihoo/security/widget/a;->a(Lcom/qihoo/security/widget/a;)Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/qihoo/security/widget/a$a;->a(Z)V

    .line 63
    iget-object v0, p0, Lcom/qihoo/security/widget/a$1;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->b(Lcom/qihoo/security/widget/a;)Lcom/qihoo/security/widget/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lcom/qihoo/security/widget/a$1;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->b(Lcom/qihoo/security/widget/a;)Lcom/qihoo/security/widget/a$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/qihoo/security/widget/a$a;->b(Z)V

    goto :goto_0

    .line 59
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
