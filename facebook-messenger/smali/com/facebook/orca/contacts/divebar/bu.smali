.class Lcom/facebook/orca/contacts/divebar/bu;
.super Ljava/lang/Object;
.source "WildfirePresenceExperiment.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/abtest/qe/data/QuickExperimentInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/bs;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/bs;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/bu;->a:Lcom/facebook/orca/contacts/divebar/bs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V
    .locals 3

    .prologue
    .line 111
    const-string v0, "local_default_group"

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bu;->a:Lcom/facebook/orca/contacts/divebar/bs;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/bs;->a(Lcom/facebook/orca/contacts/divebar/bs;)Lcom/facebook/prefs/shared/d;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->g:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    invoke-static {}, Lcom/facebook/orca/contacts/divebar/bs;->e()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "QE data has not been fetched yet! Re-initializing..."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 114
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bu;->a:Lcom/facebook/orca/contacts/divebar/bs;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/bs;->d()V

    .line 126
    :goto_0
    return-void

    .line 118
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bu;->a:Lcom/facebook/orca/contacts/divebar/bs;

    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/bu;->a:Lcom/facebook/orca/contacts/divebar/bs;

    const-string v2, "show_presence"

    invoke-virtual {p1, v2}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/orca/contacts/divebar/bs;->a(Lcom/facebook/orca/contacts/divebar/bs;Lcom/google/common/base/Optional;)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/orca/contacts/divebar/bs;->a(Lcom/facebook/orca/contacts/divebar/bs;Z)Z

    .line 119
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bu;->a:Lcom/facebook/orca/contacts/divebar/bs;

    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/bu;->a:Lcom/facebook/orca/contacts/divebar/bs;

    const-string v2, "hide_offline"

    invoke-virtual {p1, v2}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/orca/contacts/divebar/bs;->a(Lcom/facebook/orca/contacts/divebar/bs;Lcom/google/common/base/Optional;)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/orca/contacts/divebar/bs;->b(Lcom/facebook/orca/contacts/divebar/bs;Z)Z

    .line 120
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bu;->a:Lcom/facebook/orca/contacts/divebar/bs;

    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/bu;->a:Lcom/facebook/orca/contacts/divebar/bs;

    const-string v2, "show_offline_section"

    invoke-virtual {p1, v2}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/orca/contacts/divebar/bs;->a(Lcom/facebook/orca/contacts/divebar/bs;Lcom/google/common/base/Optional;)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/orca/contacts/divebar/bs;->c(Lcom/facebook/orca/contacts/divebar/bs;Z)Z

    .line 121
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bu;->a:Lcom/facebook/orca/contacts/divebar/bs;

    sget-object v1, Lcom/facebook/orca/contacts/divebar/bv;->COMPLETED:Lcom/facebook/orca/contacts/divebar/bv;

    invoke-static {v0, v1}, Lcom/facebook/orca/contacts/divebar/bs;->a(Lcom/facebook/orca/contacts/divebar/bs;Lcom/facebook/orca/contacts/divebar/bv;)Lcom/facebook/orca/contacts/divebar/bv;

    .line 122
    invoke-static {}, Lcom/facebook/orca/contacts/divebar/bs;->e()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fetched QE params (group: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "Show presence? "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/bu;->a:Lcom/facebook/orca/contacts/divebar/bs;

    invoke-static {v2}, Lcom/facebook/orca/contacts/divebar/bs;->b(Lcom/facebook/orca/contacts/divebar/bs;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "; "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "Hide offline users? "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/bu;->a:Lcom/facebook/orca/contacts/divebar/bs;

    invoke-static {v2}, Lcom/facebook/orca/contacts/divebar/bs;->c(Lcom/facebook/orca/contacts/divebar/bs;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "; "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "Show offline section? "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/bu;->a:Lcom/facebook/orca/contacts/divebar/bs;

    invoke-static {v2}, Lcom/facebook/orca/contacts/divebar/bs;->d(Lcom/facebook/orca/contacts/divebar/bs;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 105
    check-cast p1, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/contacts/divebar/bu;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 130
    invoke-static {}, Lcom/facebook/orca/contacts/divebar/bs;->e()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Failed to fetch QE info for Wildfire presence experiment!"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 131
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bu;->a:Lcom/facebook/orca/contacts/divebar/bs;

    sget-object v1, Lcom/facebook/orca/contacts/divebar/bv;->INIT:Lcom/facebook/orca/contacts/divebar/bv;

    invoke-static {v0, v1}, Lcom/facebook/orca/contacts/divebar/bs;->a(Lcom/facebook/orca/contacts/divebar/bs;Lcom/facebook/orca/contacts/divebar/bv;)Lcom/facebook/orca/contacts/divebar/bv;

    .line 132
    return-void
.end method
