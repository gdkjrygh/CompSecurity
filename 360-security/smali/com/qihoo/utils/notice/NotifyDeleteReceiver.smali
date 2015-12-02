.class public Lcom/qihoo/utils/notice/NotifyDeleteReceiver;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# static fields
.field public static a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/utils/notice/NotifyDeleteReceiver;->a:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 37
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 41
    const-string/jumbo v1, "com.qihoo.security.action.LANGUAGE_UPGRADE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 42
    sput-boolean v2, Lcom/qihoo/utils/notice/NotifyDeleteReceiver;->a:Z

    .line 56
    :cond_0
    :goto_0
    return-void

    .line 43
    :cond_1
    const-string/jumbo v1, "com.qihoo.security.action.LANGUAGE_NEW"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 44
    sput-boolean v2, Lcom/qihoo/utils/notice/NotifyDeleteReceiver;->a:Z

    goto :goto_0

    .line 45
    :cond_2
    const-string/jumbo v1, "com.qihoo.security.action.LANGUAGE_AUTO_DOWN_FINISH"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 47
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_MALWARE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 49
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_RISKY_APP"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 51
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_SAFE_APP"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 53
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_ANTIVIRUS_UPGRADE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0
.end method
