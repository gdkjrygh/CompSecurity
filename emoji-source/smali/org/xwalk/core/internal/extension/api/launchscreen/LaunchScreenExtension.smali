.class public Lorg/xwalk/core/internal/extension/api/launchscreen/LaunchScreenExtension;
.super Lorg/xwalk/core/internal/XWalkExtensionInternal;
.source "LaunchScreenExtension.java"


# static fields
.field private static final CMD_HIDE_LAUNCH_SCREEN:Ljava/lang/String; = "hideLaunchScreen"

.field public static final JS_API_PATH:Ljava/lang/String; = "jsapi/launch_screen_api.js"

.field private static final JS_ENTRY_POINTS:[Ljava/lang/String;

.field private static final NAME:Ljava/lang/String; = "xwalk.launchscreen"


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 21
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "window.screen.show"

    aput-object v2, v0, v1

    sput-object v0, Lorg/xwalk/core/internal/extension/api/launchscreen/LaunchScreenExtension;->JS_ENTRY_POINTS:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
    .locals 2
    .param p1, "jsApi"    # Ljava/lang/String;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    .line 31
    const-string v0, "xwalk.launchscreen"

    sget-object v1, Lorg/xwalk/core/internal/extension/api/launchscreen/LaunchScreenExtension;->JS_ENTRY_POINTS:[Ljava/lang/String;

    invoke-direct {p0, v0, p1, v1}, Lorg/xwalk/core/internal/XWalkExtensionInternal;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 32
    iput-object p2, p0, Lorg/xwalk/core/internal/extension/api/launchscreen/LaunchScreenExtension;->mContext:Landroid/content/Context;

    .line 33
    return-void
.end method

.method private hideLaunchScreen()V
    .locals 3

    .prologue
    .line 46
    invoke-static {}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getHideLaunchScreenFilterStr()Ljava/lang/String;

    move-result-object v0

    .line 47
    .local v0, "filterStr":Ljava/lang/String;
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 48
    .local v1, "intent":Landroid/content/Intent;
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/launchscreen/LaunchScreenExtension;->mContext:Landroid/content/Context;

    invoke-virtual {v2, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 49
    return-void
.end method


# virtual methods
.method public onMessage(ILjava/lang/String;)V
    .locals 1
    .param p1, "instanceId"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 37
    const-string v0, "hideLaunchScreen"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/launchscreen/LaunchScreenExtension;->hideLaunchScreen()V

    .line 40
    :cond_0
    return-void
.end method

.method public onSyncMessage(ILjava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "instanceID"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 53
    const/4 v0, 0x0

    return-object v0
.end method
