.class public Lcom/facebook/orca/fbwebrtc/af;
.super Ljava/lang/Object;
.source "WebrtcLogoutHandler.java"

# interfaces
.implements Lcom/facebook/auth/f/b;


# instance fields
.field private a:Lcom/facebook/orca/fbwebrtc/ag;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/fbwebrtc/ag;)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/af;->a:Lcom/facebook/orca/fbwebrtc/ag;

    .line 13
    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/af;->a:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ag;->g()V

    .line 18
    return-void
.end method
