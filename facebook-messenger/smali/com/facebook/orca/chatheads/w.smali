.class Lcom/facebook/orca/chatheads/w;
.super Ljava/lang/Object;
.source "ChatHeadTextBubbleView.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/v;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/v;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/facebook/orca/chatheads/w;->a:Lcom/facebook/orca/chatheads/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/orca/chatheads/w;->a:Lcom/facebook/orca/chatheads/v;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/v;->a(Lcom/facebook/orca/chatheads/v;)V

    .line 80
    return-void
.end method
