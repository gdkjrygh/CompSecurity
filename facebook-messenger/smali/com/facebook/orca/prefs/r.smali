.class Lcom/facebook/orca/prefs/r;
.super Lcom/facebook/fbservice/ops/h;
.source "OrcaContactsPreferenceActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lcom/facebook/orca/prefs/r;->a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 103
    iget-object v0, p0, Lcom/facebook/orca/prefs/r;->a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)Lcom/facebook/fbservice/ops/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/c;->d()V

    .line 104
    iget-object v0, p0, Lcom/facebook/orca/prefs/r;->a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    sget-object v1, Lcom/facebook/orca/prefs/y;->FINISHED_SUCCESS:Lcom/facebook/orca/prefs/y;

    invoke-static {v0, v1}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;Lcom/facebook/orca/prefs/y;)V

    .line 105
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 109
    iget-object v0, p0, Lcom/facebook/orca/prefs/r;->a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)Lcom/facebook/fbservice/ops/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/c;->d()V

    .line 110
    iget-object v0, p0, Lcom/facebook/orca/prefs/r;->a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    sget-object v1, Lcom/facebook/orca/prefs/y;->FINISHED_ERROR:Lcom/facebook/orca/prefs/y;

    invoke-static {v0, v1}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;Lcom/facebook/orca/prefs/y;)V

    .line 111
    return-void
.end method
