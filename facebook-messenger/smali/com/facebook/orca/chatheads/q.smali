.class Lcom/facebook/orca/chatheads/q;
.super Ljava/lang/Object;
.source "ChatHeadService.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/ChatHeadService;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/ChatHeadService;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lcom/facebook/orca/chatheads/q;->a:Lcom/facebook/orca/chatheads/ChatHeadService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 2

    .prologue
    .line 186
    iget-object v0, p0, Lcom/facebook/orca/chatheads/q;->a:Lcom/facebook/orca/chatheads/ChatHeadService;

    const-string v1, "reason"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/ChatHeadService;->a(Lcom/facebook/orca/chatheads/ChatHeadService;Ljava/lang/String;)V

    .line 187
    return-void
.end method
