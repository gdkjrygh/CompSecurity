.class Lcom/facebook/l/f;
.super Ljava/lang/Object;
.source "MusicPresenceHandler.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field final synthetic a:Lcom/facebook/l/c;


# direct methods
.method constructor <init>(Lcom/facebook/l/c;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lcom/facebook/l/f;->a:Lcom/facebook/l/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 2

    .prologue
    .line 185
    const-string v0, "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 186
    const-string v0, "event"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Lcom/facebook/push/mqtt/cj;->fromValue(I)Lcom/facebook/push/mqtt/cj;

    move-result-object v0

    .line 188
    sget-object v1, Lcom/facebook/l/g;->a:[I

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/cj;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 194
    :cond_0
    :goto_0
    return-void

    .line 190
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/l/f;->a:Lcom/facebook/l/c;

    invoke-static {v0}, Lcom/facebook/l/c;->c(Lcom/facebook/l/c;)V

    goto :goto_0

    .line 188
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
