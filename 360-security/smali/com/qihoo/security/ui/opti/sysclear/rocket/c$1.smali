.class Lcom/qihoo/security/ui/opti/sysclear/rocket/c$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a(FF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)V
    .locals 0

    .prologue
    .line 177
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$1;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 180
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$1;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->e(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    iget v0, p1, Landroid/os/Message;->what:I

    .line 182
    packed-switch v0, :pswitch_data_0

    .line 194
    :cond_0
    :goto_0
    return-void

    .line 184
    :pswitch_0
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$1;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->f(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)V

    .line 185
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$1;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$1;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->g(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    float-to-long v2, v1

    invoke-virtual {p0, v0, v2, v3}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$1;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 188
    :pswitch_1
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$1;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->h(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 189
    const/16 v1, 0x3e8

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$1;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->i(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)I

    move-result v2

    div-int/2addr v1, v2

    int-to-long v2, v1

    invoke-virtual {p0, v0, v2, v3}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$1;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 182
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
