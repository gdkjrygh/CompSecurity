.class Lcom/facebook/orca/threadview/da;
.super Ljava/lang/Object;
.source "ThreadViewMessageFragment.java"

# interfaces
.implements Lcom/facebook/orca/threadview/u;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V
    .locals 0

    .prologue
    .line 301
    iput-object p1, p0, Lcom/facebook/orca/threadview/da;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/messages/model/share/Share;)V
    .locals 1

    .prologue
    .line 323
    iget-object v0, p0, Lcom/facebook/orca/threadview/da;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Lcom/facebook/messages/model/share/Share;)V

    .line 324
    return-void
.end method

.method public a(Lcom/facebook/orca/threadview/ac;)V
    .locals 1

    .prologue
    .line 304
    iget-object v0, p0, Lcom/facebook/orca/threadview/da;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Lcom/facebook/orca/threadview/ac;)V

    .line 305
    return-void
.end method

.method public a(Lcom/facebook/orca/threadview/ac;Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 333
    iget-object v0, p0, Lcom/facebook/orca/threadview/da;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-static {v0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Lcom/facebook/orca/threadview/ac;Landroid/os/Parcelable;)Z

    .line 334
    return-void
.end method

.method public a(Landroid/text/style/URLSpan;)Z
    .locals 3

    .prologue
    .line 314
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {p1}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 315
    iget-object v1, p0, Lcom/facebook/orca/threadview/da;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-static {v1, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Landroid/content/Intent;)V

    .line 318
    const/4 v0, 0x1

    return v0
.end method

.method public b(Lcom/facebook/orca/threadview/ac;)Z
    .locals 2

    .prologue
    .line 309
    iget-object v0, p0, Lcom/facebook/orca/threadview/da;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Lcom/facebook/orca/threadview/ac;Landroid/os/Parcelable;)Z

    move-result v0

    return v0
.end method

.method public c(Lcom/facebook/orca/threadview/ac;)V
    .locals 1

    .prologue
    .line 328
    iget-object v0, p0, Lcom/facebook/orca/threadview/da;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Lcom/facebook/orca/threadview/ac;)V

    .line 329
    return-void
.end method
