.class Lcom/facebook/orca/threadview/t;
.super Ljava/lang/Object;
.source "MessageListAdapter.java"

# interfaces
.implements Lcom/facebook/orca/threadview/r;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/s;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/s;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lcom/facebook/orca/threadview/t;->a:Lcom/facebook/orca/threadview/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/messages/model/share/Share;)V
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/facebook/orca/threadview/t;->a:Lcom/facebook/orca/threadview/s;

    invoke-static {v0}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/s;)Lcom/facebook/orca/threadview/u;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/facebook/orca/threadview/t;->a:Lcom/facebook/orca/threadview/s;

    invoke-static {v0}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/s;)Lcom/facebook/orca/threadview/u;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/orca/threadview/u;->a(Lcom/facebook/messages/model/share/Share;)V

    .line 117
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/orca/threadview/ad;)V
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/orca/threadview/t;->a:Lcom/facebook/orca/threadview/s;

    invoke-static {v0}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/s;)Lcom/facebook/orca/threadview/u;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/facebook/orca/threadview/t;->a:Lcom/facebook/orca/threadview/s;

    invoke-static {v0}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/s;)Lcom/facebook/orca/threadview/u;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/orca/threadview/u;->a(Lcom/facebook/orca/threadview/ac;)V

    .line 93
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/orca/threadview/ad;Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/facebook/orca/threadview/t;->a:Lcom/facebook/orca/threadview/s;

    invoke-static {v0}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/s;)Lcom/facebook/orca/threadview/u;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/facebook/orca/threadview/t;->a:Lcom/facebook/orca/threadview/s;

    invoke-static {v0}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/s;)Lcom/facebook/orca/threadview/u;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/facebook/orca/threadview/u;->a(Lcom/facebook/orca/threadview/ac;Landroid/os/Parcelable;)V

    .line 134
    :cond_0
    return-void
.end method

.method public a(Landroid/text/style/URLSpan;)Z
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/facebook/orca/threadview/t;->a:Lcom/facebook/orca/threadview/s;

    invoke-static {v0}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/s;)Lcom/facebook/orca/threadview/u;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threadview/t;->a:Lcom/facebook/orca/threadview/s;

    invoke-static {v0}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/s;)Lcom/facebook/orca/threadview/u;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/orca/threadview/u;->a(Landroid/text/style/URLSpan;)Z

    move-result v0

    .line 109
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Lcom/facebook/orca/threadview/ad;)Z
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/facebook/orca/threadview/t;->a:Lcom/facebook/orca/threadview/s;

    invoke-static {v0}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/s;)Lcom/facebook/orca/threadview/u;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/facebook/orca/threadview/t;->a:Lcom/facebook/orca/threadview/s;

    invoke-static {v0}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/s;)Lcom/facebook/orca/threadview/u;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/orca/threadview/u;->b(Lcom/facebook/orca/threadview/ac;)Z

    move-result v0

    .line 100
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(Lcom/facebook/orca/threadview/ad;)V
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/facebook/orca/threadview/t;->a:Lcom/facebook/orca/threadview/s;

    invoke-static {v0}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/s;)Lcom/facebook/orca/threadview/u;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 122
    iget-object v0, p0, Lcom/facebook/orca/threadview/t;->a:Lcom/facebook/orca/threadview/s;

    invoke-static {v0}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/s;)Lcom/facebook/orca/threadview/u;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/orca/threadview/u;->c(Lcom/facebook/orca/threadview/ac;)V

    .line 124
    :cond_0
    return-void
.end method
