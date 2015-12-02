.class Lcom/facebook/orca/chatheads/cj;
.super Ljava/lang/Object;
.source "ChatHeadsInitializer.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/ch;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/ch;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/facebook/orca/chatheads/cj;->a:Lcom/facebook/orca/chatheads/ch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cj;->a:Lcom/facebook/orca/chatheads/ch;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ch;->e(Lcom/facebook/orca/chatheads/ch;)Lcom/facebook/prefs/shared/d;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/chatheads/cj;->a:Lcom/facebook/orca/chatheads/ch;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/ch;->d(Lcom/facebook/orca/chatheads/ch;)Lcom/facebook/prefs/shared/f;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 76
    return-void
.end method
