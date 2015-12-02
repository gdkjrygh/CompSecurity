.class Lcom/facebook/orca/d/aj;
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
    .line 172
    iput-object p1, p0, Lcom/facebook/orca/d/aj;->a:Lcom/facebook/orca/d/af;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 175
    iget-object v0, p0, Lcom/facebook/orca/d/aj;->a:Lcom/facebook/orca/d/af;

    invoke-static {v0}, Lcom/facebook/orca/d/af;->b(Lcom/facebook/orca/d/af;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "file"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    .line 176
    iget-object v1, p0, Lcom/facebook/orca/d/aj;->a:Lcom/facebook/orca/d/af;

    invoke-static {v1}, Lcom/facebook/orca/d/af;->c(Lcom/facebook/orca/d/af;)Lcom/facebook/orca/d/ao;

    move-result-object v1

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/orca/d/ao;->a(Landroid/net/Uri;)V

    .line 177
    return-void
.end method
