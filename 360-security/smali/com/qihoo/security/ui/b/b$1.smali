.class Lcom/qihoo/security/ui/b/b$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/b/b;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/b/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/b/b;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 380
    iput-object p1, p0, Lcom/qihoo/security/ui/b/b$1;->a:Lcom/qihoo/security/ui/b/b;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 384
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 396
    :goto_0
    return-void

    .line 386
    :pswitch_0
    iget-object v1, p0, Lcom/qihoo/security/ui/b/b$1;->a:Lcom/qihoo/security/ui/b/b;

    iget v2, p1, Landroid/os/Message;->arg1:I

    iget v3, p1, Landroid/os/Message;->arg2:I

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/ui/b/b$a;

    invoke-static {v1, v2, v3, v0}, Lcom/qihoo/security/ui/b/b;->a(Lcom/qihoo/security/ui/b/b;IILcom/qihoo/security/ui/b/b$a;)V

    goto :goto_0

    .line 389
    :pswitch_1
    iget-object v1, p0, Lcom/qihoo/security/ui/b/b$1;->a:Lcom/qihoo/security/ui/b/b;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/ui/b/b$c;

    invoke-static {v1, v0}, Lcom/qihoo/security/ui/b/b;->a(Lcom/qihoo/security/ui/b/b;Lcom/qihoo/security/ui/b/b$c;)V

    goto :goto_0

    .line 392
    :pswitch_2
    iget-object v1, p0, Lcom/qihoo/security/ui/b/b$1;->a:Lcom/qihoo/security/ui/b/b;

    iget v2, p1, Landroid/os/Message;->arg1:I

    iget v3, p1, Landroid/os/Message;->arg2:I

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/ui/b/b$a;

    invoke-static {v1, v2, v3, v0}, Lcom/qihoo/security/ui/b/b;->b(Lcom/qihoo/security/ui/b/b;IILcom/qihoo/security/ui/b/b$a;)V

    goto :goto_0

    .line 384
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
