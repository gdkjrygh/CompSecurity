.class Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$LoginRequestInfo;
.super Ljava/lang/Object;
.source "XWalkContentsClientCallbackHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LoginRequestInfo"
.end annotation


# instance fields
.field final mAccount:Ljava/lang/String;

.field final mArgs:Ljava/lang/String;

.field final mRealm:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "realm"    # Ljava/lang/String;
    .param p2, "account"    # Ljava/lang/String;
    .param p3, "args"    # Ljava/lang/String;

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$LoginRequestInfo;->mRealm:Ljava/lang/String;

    .line 52
    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$LoginRequestInfo;->mAccount:Ljava/lang/String;

    .line 53
    iput-object p3, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$LoginRequestInfo;->mArgs:Ljava/lang/String;

    .line 54
    return-void
.end method
