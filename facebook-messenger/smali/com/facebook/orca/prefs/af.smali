.class Lcom/facebook/orca/prefs/af;
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
    .line 417
    iput-object p1, p0, Lcom/facebook/orca/prefs/af;->a:Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 1

    .prologue
    .line 420
    iget-object v0, p0, Lcom/facebook/orca/prefs/af;->a:Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->g(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/orca/nux/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/nux/h;->a()V

    .line 421
    iget-object v0, p0, Lcom/facebook/orca/prefs/af;->a:Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->h(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/orca/chatheads/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/k;->i()V

    .line 422
    const/4 v0, 0x1

    return v0
.end method
