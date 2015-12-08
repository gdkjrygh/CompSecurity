.class public Lorg/chromium/base/library_loader/ProcessInitException;
.super Ljava/lang/Exception;
.source "ProcessInitException.java"


# instance fields
.field private mErrorCode:I


# direct methods
.method public constructor <init>(I)V
    .locals 1
    .param p1, "errorCode"    # I

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 11
    const/4 v0, 0x0

    iput v0, p0, Lorg/chromium/base/library_loader/ProcessInitException;->mErrorCode:I

    .line 17
    iput p1, p0, Lorg/chromium/base/library_loader/ProcessInitException;->mErrorCode:I

    .line 18
    return-void
.end method

.method public constructor <init>(ILjava/lang/Throwable;)V
    .locals 1
    .param p1, "errorCode"    # I
    .param p2, "throwable"    # Ljava/lang/Throwable;

    .prologue
    .line 25
    const/4 v0, 0x0

    invoke-direct {p0, v0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    const/4 v0, 0x0

    iput v0, p0, Lorg/chromium/base/library_loader/ProcessInitException;->mErrorCode:I

    .line 26
    iput p1, p0, Lorg/chromium/base/library_loader/ProcessInitException;->mErrorCode:I

    .line 27
    return-void
.end method


# virtual methods
.method public getErrorCode()I
    .locals 1

    .prologue
    .line 33
    iget v0, p0, Lorg/chromium/base/library_loader/ProcessInitException;->mErrorCode:I

    return v0
.end method
