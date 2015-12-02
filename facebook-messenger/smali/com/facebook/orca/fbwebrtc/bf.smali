.class Lcom/facebook/orca/fbwebrtc/bf;
.super Ljava/lang/Object;
.source "WebrtcUiHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:J

.field final synthetic c:Z

.field final synthetic d:Lcom/facebook/orca/fbwebrtc/bb;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/bb;IJZ)V
    .locals 0

    .prologue
    .line 677
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/bf;->d:Lcom/facebook/orca/fbwebrtc/bb;

    iput p2, p0, Lcom/facebook/orca/fbwebrtc/bf;->a:I

    iput-wide p3, p0, Lcom/facebook/orca/fbwebrtc/bf;->b:J

    iput-boolean p5, p0, Lcom/facebook/orca/fbwebrtc/bf;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 679
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bf;->d:Lcom/facebook/orca/fbwebrtc/bb;

    iget v1, p0, Lcom/facebook/orca/fbwebrtc/bf;->a:I

    iget-wide v2, p0, Lcom/facebook/orca/fbwebrtc/bf;->b:J

    iget-boolean v4, p0, Lcom/facebook/orca/fbwebrtc/bf;->c:Z

    invoke-static {v0, v1, v2, v3, v4}, Lcom/facebook/orca/fbwebrtc/bb;->a(Lcom/facebook/orca/fbwebrtc/bb;IJZ)V

    .line 680
    return-void
.end method
