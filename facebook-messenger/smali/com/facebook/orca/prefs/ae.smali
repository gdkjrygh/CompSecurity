.class Lcom/facebook/orca/prefs/ae;
.super Ljava/lang/Object;
.source "OrcaInternalPreferenceActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/prefs/ad;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/ad;)V
    .locals 0

    .prologue
    .line 401
    iput-object p1, p0, Lcom/facebook/orca/prefs/ae;->a:Lcom/facebook/orca/prefs/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 404
    iget-object v0, p0, Lcom/facebook/orca/prefs/ae;->a:Lcom/facebook/orca/prefs/ad;

    iget-object v0, v0, Lcom/facebook/orca/prefs/ad;->a:Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->f(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/orca/app/dt;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/app/dt;->a()V

    .line 405
    return-void
.end method
