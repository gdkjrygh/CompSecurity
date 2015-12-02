.class Lcom/facebook/orca/prefs/aa;
.super Ljava/lang/Object;
.source "OrcaInternalPreferenceActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/prefs/z;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/z;)V
    .locals 0

    .prologue
    .line 351
    iput-object p1, p0, Lcom/facebook/orca/prefs/aa;->a:Lcom/facebook/orca/prefs/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 354
    iget-object v0, p0, Lcom/facebook/orca/prefs/aa;->a:Lcom/facebook/orca/prefs/z;

    iget-object v0, v0, Lcom/facebook/orca/prefs/z;->a:Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->a(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/ui/images/cache/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/cache/a;->c()V

    .line 355
    return-void
.end method
