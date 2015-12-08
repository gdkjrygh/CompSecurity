.class final Lcom/cleanmaster/ui/app/market/p;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/cleanmaster/ui/app/market/o;


# direct methods
.method constructor <init>(Lcom/cleanmaster/ui/app/market/o;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/p;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 51
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 64
    :cond_0
    :goto_0
    return-void

    .line 53
    :pswitch_0
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/p;->a:Lcom/cleanmaster/ui/app/market/o;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/cleanmaster/ui/app/market/o;->a(Lcom/cleanmaster/ui/app/market/o;Z)Z

    .line 54
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/p;->a:Lcom/cleanmaster/ui/app/market/o;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/cleanmaster/ui/app/market/o;->a(Lcom/cleanmaster/ui/app/market/o;Ljava/lang/String;)V

    goto :goto_0

    .line 57
    :pswitch_1
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/p;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/o;->a(Lcom/cleanmaster/ui/app/market/o;)Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 58
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/p;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/o;->a(Lcom/cleanmaster/ui/app/market/o;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    goto :goto_0

    .line 51
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
