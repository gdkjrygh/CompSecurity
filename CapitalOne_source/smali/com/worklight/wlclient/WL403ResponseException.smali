.class public Lcom/worklight/wlclient/WL403ResponseException;
.super Ljava/lang/Exception;
.source "WL403ResponseException.java"


# static fields
.field private static final serialVersionUID:J = -0x73b2cd0d4fbe4a23L


# instance fields
.field private challengeData:Ljava/lang/String;

.field private instanceAuthData:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 23
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 19
    iput-object v0, p0, Lcom/worklight/wlclient/WL403ResponseException;->challengeData:Ljava/lang/String;

    .line 20
    iput-object v0, p0, Lcom/worklight/wlclient/WL403ResponseException;->instanceAuthData:Ljava/lang/String;

    .line 24
    return-void
.end method


# virtual methods
.method public getChallengeData()Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/worklight/wlclient/WL403ResponseException;->challengeData:Ljava/lang/String;

    return-object v0
.end method

.method public getInstanceAuthData()Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/worklight/wlclient/WL403ResponseException;->instanceAuthData:Ljava/lang/String;

    return-object v0
.end method

.method public setChallengeData(Ljava/lang/String;)V
    .locals 0
    .param p1, "challengeData"    # Ljava/lang/String;

    .prologue
    .line 29
    iput-object p1, p0, Lcom/worklight/wlclient/WL403ResponseException;->challengeData:Ljava/lang/String;

    .line 30
    return-void
.end method

.method public setInstanceAuthData(Ljava/lang/String;)V
    .locals 0
    .param p1, "instanceAuthData"    # Ljava/lang/String;

    .prologue
    .line 35
    iput-object p1, p0, Lcom/worklight/wlclient/WL403ResponseException;->instanceAuthData:Ljava/lang/String;

    .line 36
    return-void
.end method
