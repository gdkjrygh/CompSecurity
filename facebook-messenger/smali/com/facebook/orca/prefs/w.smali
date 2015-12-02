.class Lcom/facebook/orca/prefs/w;
.super Landroid/content/BroadcastReceiver;
.source "OrcaContactsPreferenceActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)V
    .locals 0

    .prologue
    .line 296
    iput-object p1, p0, Lcom/facebook/orca/prefs/w;->a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 299
    const-string v0, "state"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/upload/ContactsUploadState;

    .line 301
    iget-object v1, p0, Lcom/facebook/orca/prefs/w;->a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-static {v1, v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;Lcom/facebook/contacts/upload/ContactsUploadState;)V

    .line 302
    return-void
.end method
