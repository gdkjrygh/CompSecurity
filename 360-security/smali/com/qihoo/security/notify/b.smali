.class public abstract Lcom/qihoo/security/notify/b;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/notify/b$a;
    }
.end annotation


# static fields
.field protected static final a:Ljava/lang/String;


# instance fields
.field protected final b:Landroid/content/Context;

.field protected final c:Lcom/qihoo/security/locale/d;

.field protected final d:Landroid/support/v4/app/y;

.field protected e:Landroid/app/Notification;

.field protected f:Z

.field protected g:Lcom/qihoo/security/notify/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/qihoo/security/notify/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/notify/b;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-boolean v2, p0, Lcom/qihoo/security/notify/b;->f:Z

    .line 46
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/notify/b;->b:Landroid/content/Context;

    .line 47
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/notify/b;->c:Lcom/qihoo/security/locale/d;

    .line 48
    iget-object v0, p0, Lcom/qihoo/security/notify/b;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/app/y;->a(Landroid/content/Context;)Landroid/support/v4/app/y;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/notify/b;->d:Landroid/support/v4/app/y;

    .line 49
    iget-object v0, p0, Lcom/qihoo/security/notify/b;->b:Landroid/content/Context;

    const-string/jumbo v1, "notification"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/notify/b;->f:Z

    .line 50
    new-instance v0, Lcom/qihoo/security/notify/b$a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/notify/b$a;-><init>(Lcom/qihoo/security/notify/b;)V

    iput-object v0, p0, Lcom/qihoo/security/notify/b;->g:Lcom/qihoo/security/notify/b$a;

    .line 51
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 5

    .prologue
    const/high16 v4, 0x10000000

    const/16 v3, 0xe

    .line 90
    new-instance v0, Landroid/support/v4/app/q$d;

    iget-object v1, p0, Lcom/qihoo/security/notify/b;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/support/v4/app/q$d;-><init>(Landroid/content/Context;)V

    .line 91
    const v1, 0x7f0200cf

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q$d;->a(I)Landroid/support/v4/app/q$d;

    .line 92
    iget-object v1, p0, Lcom/qihoo/security/notify/b;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0172

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q$d;->a(Ljava/lang/CharSequence;)Landroid/support/v4/app/q$d;

    .line 93
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q$d;->a(Z)Landroid/support/v4/app/q$d;

    .line 94
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q$d;->b(I)Landroid/support/v4/app/q$d;

    .line 95
    const-string/jumbo v1, "sort_key_00"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q$d;->a(Ljava/lang/String;)Landroid/support/v4/app/q$d;

    .line 97
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v3, :cond_0

    .line 98
    const-wide/32 v2, 0x1036640

    invoke-virtual {v0, v2, v3}, Landroid/support/v4/app/q$d;->a(J)Landroid/support/v4/app/q$d;

    .line 105
    :goto_0
    invoke-virtual {v0}, Landroid/support/v4/app/q$d;->a()Landroid/app/Notification;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/notify/b;->e:Landroid/app/Notification;

    .line 107
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/notify/b;->b:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/notify/NotificationActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 108
    invoke-virtual {v0, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 109
    const-string/jumbo v1, "com.qihoo.security.action.function.MAIN"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 111
    iget-object v1, p0, Lcom/qihoo/security/notify/b;->e:Landroid/app/Notification;

    iget-object v2, p0, Lcom/qihoo/security/notify/b;->b:Landroid/content/Context;

    const/16 v3, 0x115

    invoke-static {v2, v3, v0, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v1, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 114
    iget-object v0, p0, Lcom/qihoo/security/notify/b;->e:Landroid/app/Notification;

    const/4 v1, 0x0

    iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 115
    return-void

    .line 99
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-le v1, v3, :cond_1

    .line 100
    const-wide v2, 0x7fffffffffffffffL

    invoke-virtual {v0, v2, v3}, Landroid/support/v4/app/q$d;->a(J)Landroid/support/v4/app/q$d;

    goto :goto_0

    .line 103
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Landroid/support/v4/app/q$d;->a(J)Landroid/support/v4/app/q$d;

    goto :goto_0
.end method

.method public abstract a(I)V
.end method

.method protected a(ILandroid/app/Notification;)V
    .locals 1

    .prologue
    .line 126
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/notify/b;->d:Landroid/support/v4/app/y;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/app/y;->a(ILandroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    :goto_0
    return-void

    .line 127
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected abstract a(Landroid/os/Message;)V
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/qihoo/security/notify/b;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 63
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/notify/b;->f:Z

    .line 70
    :goto_0
    iget-boolean v0, p0, Lcom/qihoo/security/notify/b;->f:Z

    if-eqz v0, :cond_2

    .line 71
    invoke-virtual {p0}, Lcom/qihoo/security/notify/b;->c()V

    .line 75
    :cond_0
    :goto_1
    return-void

    .line 65
    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/notify/b;->f:Z

    if-eq v0, p1, :cond_0

    .line 68
    iput-boolean p1, p0, Lcom/qihoo/security/notify/b;->f:Z

    goto :goto_0

    .line 73
    :cond_2
    invoke-virtual {p0}, Lcom/qihoo/security/notify/b;->b()V

    goto :goto_1
.end method

.method public b()V
    .locals 2

    .prologue
    .line 136
    iget-object v0, p0, Lcom/qihoo/security/notify/b;->g:Lcom/qihoo/security/notify/b$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/notify/b$a;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 137
    iget-object v0, p0, Lcom/qihoo/security/notify/b;->d:Landroid/support/v4/app/y;

    const/16 v1, 0x115

    invoke-virtual {v0, v1}, Landroid/support/v4/app/y;->a(I)V

    .line 138
    iget-object v0, p0, Lcom/qihoo/security/notify/b;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 139
    invoke-virtual {p0}, Lcom/qihoo/security/notify/b;->d()V

    .line 141
    :cond_0
    return-void
.end method

.method public abstract c()V
.end method

.method protected abstract d()V
.end method
