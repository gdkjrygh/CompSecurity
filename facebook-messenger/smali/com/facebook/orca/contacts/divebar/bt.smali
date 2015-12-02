.class Lcom/facebook/orca/contacts/divebar/bt;
.super Ljava/lang/Object;
.source "WildfirePresenceExperiment.java"

# interfaces
.implements Lcom/facebook/abtest/qe/data/d;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/bs;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/bs;)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/bt;->a:Lcom/facebook/orca/contacts/divebar/bs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Z
    .locals 1

    .prologue
    .line 97
    const-string v0, "hide_offline"

    invoke-virtual {p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "show_offline_section"

    invoke-virtual {p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
