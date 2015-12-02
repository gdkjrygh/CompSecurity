.class Lcom/facebook/l/l;
.super Lcom/facebook/base/broadcast/q;
.source "PresenceManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/l/k;


# direct methods
.method constructor <init>(Lcom/facebook/l/k;Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Lcom/facebook/l/l;->a:Lcom/facebook/l/k;

    invoke-direct {p0, p2, p3}, Lcom/facebook/base/broadcast/q;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 164
    const-string v0, "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 165
    const-string v0, "event"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Lcom/facebook/push/mqtt/cj;->fromValue(I)Lcom/facebook/push/mqtt/cj;

    move-result-object v0

    .line 167
    sget-object v1, Lcom/facebook/l/t;->a:[I

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/cj;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 181
    :cond_0
    :goto_0
    return-void

    .line 169
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/l/l;->a:Lcom/facebook/l/k;

    invoke-virtual {v0}, Lcom/facebook/l/k;->e()V

    goto :goto_0

    .line 172
    :cond_1
    const-string v0, "com.facebook.orca.ACTION_FRIEND_SYNC_PROGRESS"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 173
    iget-object v0, p0, Lcom/facebook/l/l;->a:Lcom/facebook/l/k;

    invoke-static {v0}, Lcom/facebook/l/k;->a(Lcom/facebook/l/k;)V

    goto :goto_0

    .line 174
    :cond_2
    const-string v0, "com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 175
    const-string v0, "state"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/upload/ContactsUploadState;

    .line 177
    invoke-virtual {v0}, Lcom/facebook/contacts/upload/ContactsUploadState;->a()Lcom/facebook/contacts/upload/k;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/upload/k;->RUNNING:Lcom/facebook/contacts/upload/k;

    if-ne v0, v1, :cond_0

    .line 178
    iget-object v0, p0, Lcom/facebook/l/l;->a:Lcom/facebook/l/k;

    invoke-static {v0}, Lcom/facebook/l/k;->a(Lcom/facebook/l/k;)V

    goto :goto_0

    .line 167
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
