.class Lcom/facebook/orca/prefs/v;
.super Ljava/lang/Object;
.source "OrcaContactsPreferenceActivity.java"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)V
    .locals 0

    .prologue
    .line 275
    iput-object p1, p0, Lcom/facebook/orca/prefs/v;->a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 3

    .prologue
    .line 278
    iget-object v0, p0, Lcom/facebook/orca/prefs/v;->a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->c(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)Lcom/facebook/analytics/av;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/facebook/orca/prefs/v;->a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-virtual {v2}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "orca_preferences_manual_contacts_sync_preference"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 284
    iget-object v0, p0, Lcom/facebook/orca/prefs/v;->a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->e(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)V

    .line 286
    iget-object v0, p0, Lcom/facebook/orca/prefs/v;->a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    iget-object v1, p0, Lcom/facebook/orca/prefs/v;->a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-static {v1}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->f(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)Lcom/facebook/contacts/upload/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/contacts/upload/c;->b()Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;Lcom/facebook/contacts/upload/ContactsUploadState;)V

    .line 287
    iget-object v0, p0, Lcom/facebook/orca/prefs/v;->a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->f(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)Lcom/facebook/contacts/upload/c;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->SHOW_IN_THREAD_LIST_AND_DIVE_BAR:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)V

    .line 289
    const/4 v0, 0x1

    return v0
.end method
