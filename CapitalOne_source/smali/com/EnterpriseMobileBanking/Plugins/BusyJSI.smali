.class public Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;
.super Ljava/lang/Object;
.source "BusyJSI.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "BusyJSI"

.field private static hideTask:Ljava/lang/Runnable;

.field private static spinner:Landroid/app/ProgressDialog;

.field private static waitingToHide:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    const/4 v0, 0x0

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->spinner:Landroid/app/ProgressDialog;

    .line 17
    const/4 v0, 0x0

    sput-boolean v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->waitingToHide:Z

    .line 19
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI$1;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI$1;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->hideTask:Ljava/lang/Runnable;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->buildSpinner()V

    .line 29
    return-void
.end method

.method static synthetic access$000()Landroid/app/ProgressDialog;
    .locals 1

    .prologue
    .line 12
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->spinner:Landroid/app/ProgressDialog;

    return-object v0
.end method

.method private buildSpinner()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 42
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->spinner:Landroid/app/ProgressDialog;

    if-nez v0, :cond_0

    .line 43
    const-string v0, "BusyJSI"

    const-string v1, "Building Spinner"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->spinner:Landroid/app/ProgressDialog;

    .line 45
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->spinner:Landroid/app/ProgressDialog;

    invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 46
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->spinner:Landroid/app/ProgressDialog;

    invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 47
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->spinner:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 48
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->spinner:Landroid/app/ProgressDialog;

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0900f9

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 50
    :cond_0
    return-void
.end method

.method public static declared-synchronized forceHide()V
    .locals 3

    .prologue
    .line 97
    const-class v1, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;

    monitor-enter v1

    :try_start_0
    const-string v0, "BusyJSI"

    const-string v2, "forceHide"

    invoke-static {v0, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->spinner:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI$3;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI$3;-><init>()V

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 106
    const/4 v0, 0x0

    sput-boolean v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->waitingToHide:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    :cond_0
    monitor-exit v1

    return-void

    .line 97
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static declared-synchronized forceShow()V
    .locals 2

    .prologue
    .line 112
    const-class v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->forceShow(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    monitor-exit v0

    return-void

    .line 112
    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized forceShow(Z)V
    .locals 4
    .param p0, "cancel"    # Z

    .prologue
    .line 117
    const-class v1, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;

    monitor-enter v1

    :try_start_0
    const-string v0, "BusyJSI"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "forceShow Cancelable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v0

    sget-object v2, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->hideTask:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 119
    const/4 v0, 0x0

    sput-boolean v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->waitingToHide:Z

    .line 120
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->spinner:Landroid/app/ProgressDialog;

    invoke-virtual {v0, p0}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 121
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI$4;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI$4;-><init>()V

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 128
    invoke-static {}, Ljava/lang/Thread;->yield()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    monitor-exit v1

    return-void

    .line 117
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public declared-synchronized hide()V
    .locals 4

    .prologue
    .line 89
    monitor-enter p0

    :try_start_0
    const-string v0, "BusyJSI"

    const-string v1, "hide called"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    sget-boolean v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->waitingToHide:Z

    if-nez v0, :cond_0

    .line 91
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v0

    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->hideTask:Ljava/lang/Runnable;

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/webkit/WebView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 92
    const/4 v0, 0x1

    sput-boolean v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->waitingToHide:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    :cond_0
    monitor-exit p0

    return-void

    .line 89
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public isVisible()Z
    .locals 1

    .prologue
    .line 85
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->spinner:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    return v0
.end method

.method public setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V
    .locals 2
    .param p1, "onCancelListener"    # Landroid/content/DialogInterface$OnCancelListener;

    .prologue
    .line 59
    if-eqz p1, :cond_0

    .line 61
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->spinner:Landroid/app/ProgressDialog;

    new-instance v1, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI$2;

    invoke-direct {v1, p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI$2;-><init>(Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;Landroid/content/DialogInterface$OnCancelListener;)V

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 72
    :goto_0
    return-void

    .line 70
    :cond_0
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->spinner:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    goto :goto_0
.end method

.method public declared-synchronized show()V
    .locals 2

    .prologue
    .line 80
    monitor-enter p0

    :try_start_0
    const-string v0, "BusyJSI"

    const-string v1, "Show called"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->worklightShow()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    monitor-exit p0

    return-void

    .line 80
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized show(Z)V
    .locals 3
    .param p1, "cancel"    # Z

    .prologue
    .line 32
    monitor-enter p0

    :try_start_0
    const-string v0, "BusyJSI"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Show called with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    invoke-static {p1}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->forceShow(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    monitor-exit p0

    return-void

    .line 32
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public worklightHide()V
    .locals 2

    .prologue
    .line 75
    const-string v0, "BusyJSI"

    const-string v1, "worklightHide"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->forceHide()V

    .line 77
    return-void
.end method

.method public worklightShow()V
    .locals 2

    .prologue
    .line 37
    const-string v0, "BusyJSI"

    const-string v1, "worklightShow"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->forceShow()V

    .line 39
    return-void
.end method
