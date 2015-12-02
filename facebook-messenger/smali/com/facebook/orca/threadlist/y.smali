.class Lcom/facebook/orca/threadlist/y;
.super Landroid/content/BroadcastReceiver;
.source "ThreadListActivityDelegate.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/t;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/t;)V
    .locals 0

    .prologue
    .line 230
    iput-object p1, p0, Lcom/facebook/orca/threadlist/y;->a:Lcom/facebook/orca/threadlist/t;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 233
    const-string v0, "state"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/upload/ContactsUploadState;

    .line 235
    iget-object v1, p0, Lcom/facebook/orca/threadlist/y;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v1, v0}, Lcom/facebook/orca/threadlist/t;->a(Lcom/facebook/orca/threadlist/t;Lcom/facebook/contacts/upload/ContactsUploadState;)V

    .line 236
    return-void
.end method
