.class Lcom/facebook/orca/prefs/at;
.super Ljava/lang/Object;
.source "OrcaRootPreferenceActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 318
    iput-object p1, p0, Lcom/facebook/orca/prefs/at;->b:Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;

    iput-object p2, p0, Lcom/facebook/orca/prefs/at;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 321
    iget-object v0, p0, Lcom/facebook/orca/prefs/at;->b:Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->c(Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;)Lcom/facebook/analytics/av;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/facebook/orca/prefs/at;->b:Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;

    invoke-virtual {v2}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/prefs/at;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "orca_preferences_delete_account_dialog_confirm"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 328
    iget-object v0, p0, Lcom/facebook/orca/prefs/at;->b:Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;

    invoke-virtual {v0}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->b()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/auth/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/auth/c;

    .line 329
    invoke-interface {v0}, Lcom/facebook/orca/auth/c;->b()V

    .line 330
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 331
    return-void
.end method
