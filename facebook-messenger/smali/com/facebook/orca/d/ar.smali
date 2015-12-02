.class Lcom/facebook/orca/d/ar;
.super Ljava/lang/Object;
.source "AudioRecorderTooltipController.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/aq;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/aq;)V
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/facebook/orca/d/ar;->a:Lcom/facebook/orca/d/aq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/orca/d/ar;->a:Lcom/facebook/orca/d/aq;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aq;->f()V

    .line 29
    return-void
.end method
