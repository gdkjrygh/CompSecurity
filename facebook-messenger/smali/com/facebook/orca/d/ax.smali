.class Lcom/facebook/orca/d/ax;
.super Ljava/lang/Object;
.source "AudioRecorderTopBarController.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/aw;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/aw;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/facebook/orca/d/ax;->a:Lcom/facebook/orca/d/aw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/orca/d/ax;->a:Lcom/facebook/orca/d/aw;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aw;->d()V

    .line 36
    return-void
.end method
