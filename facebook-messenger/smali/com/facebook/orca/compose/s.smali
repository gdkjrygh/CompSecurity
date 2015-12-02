.class Lcom/facebook/orca/compose/s;
.super Ljava/lang/Object;
.source "ComposeFragment.java"

# interfaces
.implements Lcom/facebook/orca/chatheads/c;


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/ComposeFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 1217
    iput-object p1, p0, Lcom/facebook/orca/compose/s;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 1220
    iget-object v0, p0, Lcom/facebook/orca/compose/s;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->G(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/prefs/shared/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 1221
    sget-object v1, Lcom/facebook/orca/prefs/n;->x:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 1222
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 1223
    iget-object v0, p0, Lcom/facebook/orca/compose/s;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0, v2}, Lcom/facebook/orca/compose/ComposeFragment;->d(Lcom/facebook/orca/compose/ComposeFragment;Z)V

    .line 1224
    return-void
.end method
