.class Lcom/facebook/orca/d/ak;
.super Ljava/lang/Object;
.source "AudioRecorder.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/af;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/af;)V
    .locals 0

    .prologue
    .line 189
    iput-object p1, p0, Lcom/facebook/orca/d/ak;->a:Lcom/facebook/orca/d/af;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lcom/facebook/orca/d/ak;->a:Lcom/facebook/orca/d/af;

    invoke-static {v0}, Lcom/facebook/orca/d/af;->c(Lcom/facebook/orca/d/af;)Lcom/facebook/orca/d/ao;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/orca/d/ao;->b()V

    .line 193
    return-void
.end method
