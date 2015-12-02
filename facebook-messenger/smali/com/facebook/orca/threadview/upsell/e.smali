.class Lcom/facebook/orca/threadview/upsell/e;
.super Ljava/lang/Object;
.source "MergedThreadsUpsellController.java"

# interfaces
.implements Lcom/facebook/widget/c;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/upsell/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/upsell/a;)V
    .locals 0

    .prologue
    .line 197
    iput-object p1, p0, Lcom/facebook/orca/threadview/upsell/e;->a:Lcom/facebook/orca/threadview/upsell/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/e;->a:Lcom/facebook/orca/threadview/upsell/a;

    invoke-static {v0}, Lcom/facebook/orca/threadview/upsell/a;->e(Lcom/facebook/orca/threadview/upsell/a;)V

    .line 203
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    .line 207
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/e;->a:Lcom/facebook/orca/threadview/upsell/a;

    invoke-static {v0}, Lcom/facebook/orca/threadview/upsell/a;->f(Lcom/facebook/orca/threadview/upsell/a;)Lcom/facebook/prefs/shared/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/n;->l:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 210
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/e;->a:Lcom/facebook/orca/threadview/upsell/a;

    invoke-static {v0}, Lcom/facebook/orca/threadview/upsell/a;->e(Lcom/facebook/orca/threadview/upsell/a;)V

    .line 211
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/e;->a:Lcom/facebook/orca/threadview/upsell/a;

    invoke-static {v0}, Lcom/facebook/orca/threadview/upsell/a;->g(Lcom/facebook/orca/threadview/upsell/a;)V

    .line 212
    return-void
.end method
