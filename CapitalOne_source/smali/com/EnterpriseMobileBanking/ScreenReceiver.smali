.class public Lcom/EnterpriseMobileBanking/ScreenReceiver;
.super Landroid/content/BroadcastReceiver;
.source "ScreenReceiver.java"


# static fields
.field public static mScreenOnFlag:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 13
    const/4 v0, 0x1

    sput-boolean v0, Lcom/EnterpriseMobileBanking/ScreenReceiver;->mScreenOnFlag:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static getScreenFlag()Z
    .locals 1

    .prologue
    .line 25
    sget-boolean v0, Lcom/EnterpriseMobileBanking/ScreenReceiver;->mScreenOnFlag:Z

    return v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 17
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 18
    const/4 v0, 0x0

    sput-boolean v0, Lcom/EnterpriseMobileBanking/ScreenReceiver;->mScreenOnFlag:Z

    .line 22
    :cond_0
    :goto_0
    return-void

    .line 19
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.SCREEN_ON"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    const/4 v0, 0x1

    sput-boolean v0, Lcom/EnterpriseMobileBanking/ScreenReceiver;->mScreenOnFlag:Z

    goto :goto_0
.end method
