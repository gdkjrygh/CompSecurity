.class Lcom/facebook/orca/prefs/ac;
.super Ljava/lang/Object;
.source "OrcaInternalPreferenceActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/prefs/ab;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/ab;)V
    .locals 0

    .prologue
    .line 374
    iput-object p1, p0, Lcom/facebook/orca/prefs/ac;->a:Lcom/facebook/orca/prefs/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 377
    iget-object v0, p0, Lcom/facebook/orca/prefs/ac;->a:Lcom/facebook/orca/prefs/ab;

    iget-object v0, v0, Lcom/facebook/orca/prefs/ab;->a:Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->c(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/orca/stickers/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/e;->b()V

    .line 378
    iget-object v0, p0, Lcom/facebook/orca/prefs/ac;->a:Lcom/facebook/orca/prefs/ab;

    iget-object v0, v0, Lcom/facebook/orca/prefs/ab;->a:Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->d(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/orca/stickers/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/c;->b()V

    .line 379
    iget-object v0, p0, Lcom/facebook/orca/prefs/ac;->a:Lcom/facebook/orca/prefs/ab;

    iget-object v0, v0, Lcom/facebook/orca/prefs/ab;->a:Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->e(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/prefs/shared/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/stickers/v;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->b(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 382
    return-void
.end method
