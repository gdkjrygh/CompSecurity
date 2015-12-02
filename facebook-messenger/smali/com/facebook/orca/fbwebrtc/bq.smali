.class Lcom/facebook/orca/fbwebrtc/bq;
.super Ljava/lang/Object;
.source "WebrtcUiHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/facebook/orca/fbwebrtc/bb;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/bb;J)V
    .locals 0

    .prologue
    .line 570
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/bq;->b:Lcom/facebook/orca/fbwebrtc/bb;

    iput-wide p2, p0, Lcom/facebook/orca/fbwebrtc/bq;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 572
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bq;->b:Lcom/facebook/orca/fbwebrtc/bb;

    iget-wide v1, p0, Lcom/facebook/orca/fbwebrtc/bq;->a:J

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/fbwebrtc/bb;->a(Lcom/facebook/orca/fbwebrtc/bb;J)V

    .line 573
    return-void
.end method
