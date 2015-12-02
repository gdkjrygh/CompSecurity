.class Lcom/facebook/orca/chatheads/ci;
.super Ljava/lang/Object;
.source "ChatHeadsInitializer.java"

# interfaces
.implements Lcom/facebook/prefs/shared/f;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/ch;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/ch;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ci;->a:Lcom/facebook/orca/chatheads/ch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V
    .locals 3

    .prologue
    .line 46
    sget-object v0, Lcom/facebook/orca/chatheads/dy;->a:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, p2}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ci;->a:Lcom/facebook/orca/chatheads/ch;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ch;->a(Lcom/facebook/orca/chatheads/ch;)Lcom/facebook/orca/chatheads/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/by;->a()V

    .line 62
    :cond_0
    :goto_0
    return-void

    .line 48
    :cond_1
    sget-object v0, Lcom/facebook/orca/prefs/n;->s:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, p2}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ci;->a:Lcom/facebook/orca/chatheads/ch;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ch;->b(Lcom/facebook/orca/chatheads/ch;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    .line 52
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ci;->a:Lcom/facebook/orca/chatheads/ch;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ch;->c(Lcom/facebook/orca/chatheads/ch;)Lcom/facebook/i/a/a/f;

    move-result-object v0

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->f:Landroid/net/Uri;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    .line 60
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ci;->a:Lcom/facebook/orca/chatheads/ch;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ch;->a(Lcom/facebook/orca/chatheads/ch;)Lcom/facebook/orca/chatheads/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/by;->a()V

    goto :goto_0

    .line 55
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ci;->a:Lcom/facebook/orca/chatheads/ch;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ch;->c(Lcom/facebook/orca/chatheads/ch;)Lcom/facebook/i/a/a/f;

    move-result-object v0

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->k:Landroid/net/Uri;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    goto :goto_1
.end method
