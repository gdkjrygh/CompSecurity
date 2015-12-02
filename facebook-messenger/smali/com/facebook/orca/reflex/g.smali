.class Lcom/facebook/orca/reflex/g;
.super Ljava/lang/Object;
.source "ReflexThreadListExperiment.java"

# interfaces
.implements Lcom/facebook/abtest/qe/d/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/abtest/qe/d/d",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/reflex/e;


# direct methods
.method constructor <init>(Lcom/facebook/orca/reflex/e;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/facebook/orca/reflex/g;->a:Lcom/facebook/orca/reflex/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 3

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/orca/reflex/g;->a:Lcom/facebook/orca/reflex/e;

    invoke-static {v0}, Lcom/facebook/orca/reflex/e;->a(Lcom/facebook/orca/reflex/e;)Lcom/facebook/prefs/shared/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/reflex/d;->a:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 77
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 71
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/reflex/g;->a(Ljava/lang/Boolean;)V

    return-void
.end method
