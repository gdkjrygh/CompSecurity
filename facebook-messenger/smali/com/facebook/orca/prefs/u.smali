.class Lcom/facebook/orca/prefs/u;
.super Ljava/lang/Object;
.source "OrcaContactsPreferenceActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 196
    iput-object p1, p0, Lcom/facebook/orca/prefs/u;->b:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    iput-object p2, p0, Lcom/facebook/orca/prefs/u;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 199
    iget-object v0, p0, Lcom/facebook/orca/prefs/u;->b:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->c(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)Lcom/facebook/analytics/av;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/facebook/orca/prefs/u;->b:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-virtual {v2}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/prefs/u;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "orca_preferences_delete_synced_contacts_preference_confirm"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 206
    iget-object v0, p0, Lcom/facebook/orca/prefs/u;->b:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->d(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)Lcom/facebook/orca/prefs/y;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/y;->NOT_STARTED:Lcom/facebook/orca/prefs/y;

    if-eq v0, v1, :cond_0

    .line 207
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 210
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/prefs/u;->b:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    sget-object v1, Lcom/facebook/orca/prefs/y;->IN_PROGRESS:Lcom/facebook/orca/prefs/y;

    invoke-static {v0, v1}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;Lcom/facebook/orca/prefs/y;)V

    .line 211
    iget-object v0, p0, Lcom/facebook/orca/prefs/u;->b:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)Lcom/facebook/fbservice/ops/c;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/server/d;->f:Lcom/facebook/fbservice/service/OperationType;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 212
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 213
    return-void
.end method
