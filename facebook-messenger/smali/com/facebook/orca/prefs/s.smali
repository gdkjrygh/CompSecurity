.class Lcom/facebook/orca/prefs/s;
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
    .line 173
    iput-object p1, p0, Lcom/facebook/orca/prefs/s;->a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lcom/facebook/orca/prefs/s;->a:Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->b(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)V

    .line 177
    const/4 v0, 0x1

    return v0
.end method
