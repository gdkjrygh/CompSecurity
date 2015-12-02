.class Lcom/facebook/orca/prefs/ab;
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
    .line 368
    iput-object p1, p0, Lcom/facebook/orca/prefs/ab;->a:Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 4

    .prologue
    .line 371
    iget-object v0, p0, Lcom/facebook/orca/prefs/ab;->a:Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->b(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/common/executors/d;

    move-result-object v0

    sget v1, Lcom/facebook/o;->clearing_stickers_cache_title:I

    sget v2, Lcom/facebook/o;->clearing_stickers_cache_message:I

    new-instance v3, Lcom/facebook/orca/prefs/ac;

    invoke-direct {v3, p0}, Lcom/facebook/orca/prefs/ac;-><init>(Lcom/facebook/orca/prefs/ab;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/common/executors/d;->a(IILjava/lang/Runnable;)V

    .line 385
    const/4 v0, 0x1

    return v0
.end method
