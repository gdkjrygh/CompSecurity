.class public interface abstract Lcom/facebook/webrtc/IWebrtcConfigInterface;
.super Ljava/lang/Object;
.source "IWebrtcConfigInterface.java"


# virtual methods
.method public abstract getConnectivityStatus()Ljava/lang/String;
.end method

.method public abstract getMinVersion()I
.end method

.method public abstract isVoipAllowedOnCell()Z
.end method

.method public abstract newPeerConnectionConfig()Ljava/lang/String;
.end method

.method public abstract shouldSendIceAfterAnswer()Z
.end method
