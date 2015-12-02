.class Lcom/facebook/orca/threadview/bj;
.super Ljava/lang/Object;
.source "ThreadViewFragment.java"

# interfaces
.implements Lcom/facebook/contacts/contactcard/ai;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 1171
    iput-object p1, p0, Lcom/facebook/orca/threadview/bj;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 1194
    iget-object v0, p0, Lcom/facebook/orca/threadview/bj;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->l(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/zero/ui/l;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->h:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/orca/threadview/bj;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v2}, Lcom/facebook/orca/threadview/ThreadViewFragment;->p()Landroid/support/v4/app/q;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Landroid/support/v4/app/q;)V

    .line 1196
    return-void
.end method

.method public a(Lcom/facebook/user/UserKey;)V
    .locals 3

    .prologue
    .line 1174
    iget-object v0, p0, Lcom/facebook/orca/threadview/bj;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "contact"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/analytics/cb;)V

    .line 1177
    iget-object v0, p0, Lcom/facebook/orca/threadview/bj;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->o(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    .line 1178
    iget-object v0, p0, Lcom/facebook/orca/threadview/bj;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/contacts/contactcard/ContactCardFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->U()V

    .line 1179
    iget-object v0, p0, Lcom/facebook/orca/threadview/bj;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/contacts/contactcard/ContactCardFragment;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/user/UserKey;Z)V

    .line 1180
    iget-object v0, p0, Lcom/facebook/orca/threadview/bj;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    sget-object v1, Lcom/facebook/orca/threadview/ca;->CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threadview/ca;)V

    .line 1181
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    .line 1200
    iget-object v0, p0, Lcom/facebook/orca/threadview/bj;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "map"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/analytics/cb;)V

    .line 1202
    iget-object v0, p0, Lcom/facebook/orca/threadview/bj;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    sget-object v1, Lcom/facebook/orca/threadview/ca;->MAP:Lcom/facebook/orca/threadview/ca;

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threadview/ca;)V

    .line 1203
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 1207
    iget-object v0, p0, Lcom/facebook/orca/threadview/bj;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->T()V

    .line 1208
    return-void
.end method

.method public d()V
    .locals 0

    .prologue
    .line 1213
    return-void
.end method

.method public e()V
    .locals 0

    .prologue
    .line 1218
    return-void
.end method

.method public f()V
    .locals 3

    .prologue
    .line 1185
    iget-object v0, p0, Lcom/facebook/orca/threadview/bj;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "leave_conversation"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/analytics/cb;)V

    .line 1189
    iget-object v0, p0, Lcom/facebook/orca/threadview/bj;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->p(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    .line 1190
    return-void
.end method
