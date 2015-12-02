.class Lcom/facebook/orca/contacts/picker/aq;
.super Landroid/content/BroadcastReceiver;
.source "ContactPickerProgressView.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/ap;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/picker/ap;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/aq;->a:Lcom/facebook/orca/contacts/picker/ap;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 49
    const-string v0, "state"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/upload/ContactsUploadState;

    .line 51
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/aq;->a:Lcom/facebook/orca/contacts/picker/ap;

    invoke-static {v1, v0}, Lcom/facebook/orca/contacts/picker/ap;->a(Lcom/facebook/orca/contacts/picker/ap;Lcom/facebook/contacts/upload/ContactsUploadState;)V

    .line 52
    return-void
.end method
