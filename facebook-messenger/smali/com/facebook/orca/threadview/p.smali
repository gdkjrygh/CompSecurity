.class Lcom/facebook/orca/threadview/p;
.super Ljava/lang/Object;
.source "MessageItemView.java"

# interfaces
.implements Lcom/facebook/orca/share/c;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/facebook/orca/threadview/l;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/l;Z)V
    .locals 0

    .prologue
    .line 305
    iput-object p1, p0, Lcom/facebook/orca/threadview/p;->b:Lcom/facebook/orca/threadview/l;

    iput-boolean p2, p0, Lcom/facebook/orca/threadview/p;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/messages/model/share/Share;)V
    .locals 2

    .prologue
    .line 308
    iget-object v0, p0, Lcom/facebook/orca/threadview/p;->b:Lcom/facebook/orca/threadview/l;

    invoke-static {v0}, Lcom/facebook/orca/threadview/l;->a(Lcom/facebook/orca/threadview/l;)Lcom/facebook/orca/threadview/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 309
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/p;->a:Z

    if-eqz v0, :cond_1

    .line 311
    iget-object v0, p0, Lcom/facebook/orca/threadview/p;->b:Lcom/facebook/orca/threadview/l;

    invoke-static {v0}, Lcom/facebook/orca/threadview/l;->a(Lcom/facebook/orca/threadview/l;)Lcom/facebook/orca/threadview/r;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadview/p;->b:Lcom/facebook/orca/threadview/l;

    invoke-static {v1}, Lcom/facebook/orca/threadview/l;->b(Lcom/facebook/orca/threadview/l;)Lcom/facebook/orca/threadview/ad;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/orca/threadview/r;->a(Lcom/facebook/orca/threadview/ad;)V

    .line 316
    :cond_0
    :goto_0
    return-void

    .line 313
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/p;->b:Lcom/facebook/orca/threadview/l;

    invoke-static {v0}, Lcom/facebook/orca/threadview/l;->a(Lcom/facebook/orca/threadview/l;)Lcom/facebook/orca/threadview/r;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/orca/threadview/r;->a(Lcom/facebook/messages/model/share/Share;)V

    goto :goto_0
.end method
