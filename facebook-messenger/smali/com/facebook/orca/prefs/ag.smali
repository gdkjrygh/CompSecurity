.class Lcom/facebook/orca/prefs/ag;
.super Ljava/lang/Object;
.source "OrcaInternalPreferenceActivity.java"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)V
    .locals 0

    .prologue
    .line 443
    iput-object p1, p0, Lcom/facebook/orca/prefs/ag;->a:Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 2

    .prologue
    .line 446
    iget-object v0, p0, Lcom/facebook/orca/prefs/ag;->a:Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->i(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/contacts/upload/c;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->SHOW_IN_THREAD_LIST_AND_DIVE_BAR:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)V

    .line 448
    const/4 v0, 0x1

    return v0
.end method
