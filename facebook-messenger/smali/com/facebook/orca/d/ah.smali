.class Lcom/facebook/orca/d/ah;
.super Ljava/lang/Object;
.source "AudioRecorder.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/ag;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/ag;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/facebook/orca/d/ah;->a:Lcom/facebook/orca/d/ag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 131
    iget-object v0, p0, Lcom/facebook/orca/d/ah;->a:Lcom/facebook/orca/d/ag;

    iget-object v0, v0, Lcom/facebook/orca/d/ag;->a:Lcom/facebook/orca/d/af;

    invoke-static {v0}, Lcom/facebook/orca/d/af;->b(Lcom/facebook/orca/d/af;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "file"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    .line 132
    iget-object v1, p0, Lcom/facebook/orca/d/ah;->a:Lcom/facebook/orca/d/ag;

    iget-object v1, v1, Lcom/facebook/orca/d/ag;->a:Lcom/facebook/orca/d/af;

    invoke-static {v1}, Lcom/facebook/orca/d/af;->c(Lcom/facebook/orca/d/af;)Lcom/facebook/orca/d/ao;

    move-result-object v1

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    const v2, 0xea60

    invoke-interface {v1, v0, v2}, Lcom/facebook/orca/d/ao;->a(Landroid/net/Uri;I)V

    .line 134
    return-void
.end method
