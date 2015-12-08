.class Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;
.super Ljava/lang/Object;
.source "XWalkNotificationServiceImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "WebNotification"
.end annotation


# instance fields
.field public mBuilder:Landroid/app/Notification$Builder;

.field public mMessageNum:Ljava/lang/Integer;

.field public mNotificationId:Ljava/lang/Integer;

.field public mReplaceId:Ljava/lang/String;

.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;)V
    .locals 1

    .prologue
    .line 38
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;->this$0:Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;->mMessageNum:Ljava/lang/Integer;

    .line 40
    return-void
.end method
