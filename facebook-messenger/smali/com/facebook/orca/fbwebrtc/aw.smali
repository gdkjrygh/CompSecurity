.class public Lcom/facebook/orca/fbwebrtc/aw;
.super Ljava/lang/Object;
.source "WebrtcMqttClientActiveCallback.java"

# interfaces
.implements Lcom/facebook/push/mqtt/i;


# instance fields
.field private final a:Lcom/facebook/orca/fbwebrtc/bb;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/bb;)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/aw;->a:Lcom/facebook/orca/fbwebrtc/bb;

    .line 13
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/aw;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/bb;->b()Z

    move-result v0

    return v0
.end method
