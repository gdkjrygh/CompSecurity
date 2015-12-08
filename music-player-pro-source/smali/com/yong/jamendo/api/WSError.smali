.class public Lcom/yong/jamendo/api/WSError;
.super Ljava/lang/Throwable;
.source "WSError.java"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private message:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/yong/jamendo/api/WSError;->message:Ljava/lang/String;

    .line 20
    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/yong/jamendo/api/WSError;->message:Ljava/lang/String;

    return-object v0
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 23
    iput-object p1, p0, Lcom/yong/jamendo/api/WSError;->message:Ljava/lang/String;

    .line 24
    return-void
.end method
