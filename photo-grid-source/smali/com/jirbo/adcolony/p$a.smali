.class Lcom/jirbo/adcolony/p$a;
.super Landroid/os/Handler;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 4

    .prologue
    .line 116
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 117
    invoke-virtual {p0}, Lcom/jirbo/adcolony/p$a;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const-wide/16 v2, 0x3e8

    invoke-virtual {p0, v0, v2, v3}, Lcom/jirbo/adcolony/p$a;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 118
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 123
    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    const-string v0, "Monitor pinger exiting."

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->b(Ljava/lang/String;)V

    .line 134
    :goto_0
    return-void

    .line 129
    :cond_0
    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 131
    invoke-static {}, Lcom/jirbo/adcolony/p;->a()V

    .line 133
    :cond_1
    invoke-virtual {p0}, Lcom/jirbo/adcolony/p$a;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const-wide/16 v2, 0x3e8

    invoke-virtual {p0, v0, v2, v3}, Lcom/jirbo/adcolony/p$a;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0
.end method
