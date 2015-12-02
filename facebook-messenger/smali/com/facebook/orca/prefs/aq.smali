.class Lcom/facebook/orca/prefs/aq;
.super Ljava/lang/Object;
.source "OrcaRootPreferenceActivity.java"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;)V
    .locals 0

    .prologue
    .line 193
    iput-object p1, p0, Lcom/facebook/orca/prefs/aq;->a:Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 2

    .prologue
    .line 196
    iget-object v0, p0, Lcom/facebook/orca/prefs/aq;->a:Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;

    invoke-virtual {v0}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->b()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/auth/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/auth/c;

    .line 197
    invoke-interface {v0}, Lcom/facebook/orca/auth/c;->a()V

    .line 198
    const/4 v0, 0x1

    return v0
.end method
