.class public Lcom/hmobile/twitter/DialogError;
.super Ljava/lang/Throwable;
.source "DialogError.java"


# static fields
.field private static final serialVersionUID:J = -0xdc6cbc789774ec4L


# instance fields
.field private mErrorCode:I

.field private mFailingUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "errorCode"    # I
    .param p3, "failingUrl"    # Ljava/lang/String;

    .prologue
    .line 11
    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 12
    iput p2, p0, Lcom/hmobile/twitter/DialogError;->mErrorCode:I

    .line 13
    iput-object p3, p0, Lcom/hmobile/twitter/DialogError;->mFailingUrl:Ljava/lang/String;

    .line 14
    return-void
.end method


# virtual methods
.method public getErrorCode()I
    .locals 1

    .prologue
    .line 17
    iget v0, p0, Lcom/hmobile/twitter/DialogError;->mErrorCode:I

    return v0
.end method

.method public getFailingUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/hmobile/twitter/DialogError;->mFailingUrl:Ljava/lang/String;

    return-object v0
.end method
