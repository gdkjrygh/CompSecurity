.class public Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# static fields
.field static final serialVersionUID:J = 0x1L


# instance fields
.field private ExceptionRet:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 26
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 48
    return-void
.end method


# virtual methods
.method public getExceptionRet()I
    .locals 1

    .prologue
    .line 51
    iget v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->ExceptionRet:I

    return v0
.end method

.method public setExceptionRet(I)V
    .locals 0

    .prologue
    .line 55
    iput p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->ExceptionRet:I

    .line 56
    return-void
.end method
