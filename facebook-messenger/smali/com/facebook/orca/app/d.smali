.class Lcom/facebook/orca/app/d;
.super Lcom/facebook/base/broadcast/q;
.source "LoginReminderManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/LoginReminderManager;


# direct methods
.method constructor <init>(Lcom/facebook/orca/app/LoginReminderManager;Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/facebook/orca/app/d;->a:Lcom/facebook/orca/app/LoginReminderManager;

    invoke-direct {p0, p2, p3}, Lcom/facebook/base/broadcast/q;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 81
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 82
    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.SHOWING_LOGIN_UI"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 83
    iget-object v0, p0, Lcom/facebook/orca/app/d;->a:Lcom/facebook/orca/app/LoginReminderManager;

    invoke-virtual {v0}, Lcom/facebook/orca/app/LoginReminderManager;->b()V

    .line 89
    :cond_0
    :goto_0
    return-void

    .line 84
    :cond_1
    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 85
    iget-object v0, p0, Lcom/facebook/orca/app/d;->a:Lcom/facebook/orca/app/LoginReminderManager;

    invoke-virtual {v0}, Lcom/facebook/orca/app/LoginReminderManager;->c()V

    goto :goto_0

    .line 86
    :cond_2
    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/facebook/orca/app/d;->a:Lcom/facebook/orca/app/LoginReminderManager;

    invoke-virtual {v0}, Lcom/facebook/orca/app/LoginReminderManager;->a()V

    goto :goto_0
.end method
