.class Lcom/facebook/orca/threadview/bz;
.super Ljava/lang/Object;
.source "ThreadViewFragment.java"

# interfaces
.implements Lcom/facebook/contacts/contactcard/x;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 1111
    iput-object p1, p0, Lcom/facebook/orca/threadview/bz;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 1115
    iget-object v0, p0, Lcom/facebook/orca/threadview/bz;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->l(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/zero/ui/l;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->h:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/orca/threadview/bz;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v2}, Lcom/facebook/orca/threadview/ThreadViewFragment;->p()Landroid/support/v4/app/q;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Landroid/support/v4/app/q;)V

    .line 1117
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    .line 1121
    iget-object v0, p0, Lcom/facebook/orca/threadview/bz;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "map"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/analytics/cb;)V

    .line 1123
    invoke-static {}, Lcom/facebook/orca/threadview/cw;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1124
    iget-object v0, p0, Lcom/facebook/orca/threadview/bz;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    sget-object v1, Lcom/facebook/orca/threadview/ca;->MAP:Lcom/facebook/orca/threadview/ca;

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threadview/ca;)V

    .line 1126
    :cond_0
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 1130
    iget-object v0, p0, Lcom/facebook/orca/threadview/bz;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->T()V

    .line 1131
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 1135
    iget-object v0, p0, Lcom/facebook/orca/threadview/bz;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->w()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1136
    iget-object v0, p0, Lcom/facebook/orca/threadview/bz;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->m(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    .line 1138
    :cond_0
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 1142
    iget-object v0, p0, Lcom/facebook/orca/threadview/bz;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    .line 1143
    return-void
.end method
