.class Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$OnReceivedErrorInfo;
.super Ljava/lang/Object;
.source "XWalkContentsClientCallbackHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "OnReceivedErrorInfo"
.end annotation


# instance fields
.field final mDescription:Ljava/lang/String;

.field final mErrorCode:I

.field final mFailingUrl:Ljava/lang/String;


# direct methods
.method constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "errorCode"    # I
    .param p2, "description"    # Ljava/lang/String;
    .param p3, "failingUrl"    # Ljava/lang/String;

    .prologue
    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$OnReceivedErrorInfo;->mErrorCode:I

    .line 64
    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$OnReceivedErrorInfo;->mDescription:Ljava/lang/String;

    .line 65
    iput-object p3, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$OnReceivedErrorInfo;->mFailingUrl:Ljava/lang/String;

    .line 66
    return-void
.end method
