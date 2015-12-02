.class Lcom/facebook/orca/d/ai;
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
    .line 157
    iput-object p1, p0, Lcom/facebook/orca/d/ai;->a:Lcom/facebook/orca/d/af;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/facebook/orca/d/ai;->a:Lcom/facebook/orca/d/af;

    invoke-static {v0}, Lcom/facebook/orca/d/af;->d(Lcom/facebook/orca/d/af;)V

    .line 161
    return-void
.end method
