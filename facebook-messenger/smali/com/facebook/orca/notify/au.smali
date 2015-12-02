.class public Lcom/facebook/orca/notify/au;
.super Ljava/lang/Object;
.source "OrcaMessagingNotificationPreferences.java"

# interfaces
.implements Lcom/facebook/orca/notify/an;


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/orca/notify/au;->a:Lcom/facebook/prefs/shared/d;

    .line 22
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 3

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/orca/notify/au;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->q:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    return v0
.end method

.method public b()Z
    .locals 3

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/orca/notify/au;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->p:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 3

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/notify/au;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->r:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    return v0
.end method

.method public d()Landroid/net/Uri;
    .locals 3

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/orca/notify/au;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->t:Lcom/facebook/prefs/shared/ae;

    sget-object v2, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 44
    if-nez v0, :cond_0

    .line 45
    const/4 v0, 0x0

    .line 47
    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method

.method public e()I
    .locals 2

    .prologue
    .line 52
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 53
    sget v0, Lcom/facebook/h;->orca_notification_icon_ics:I

    .line 57
    :goto_0
    return v0

    .line 54
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_1

    .line 55
    sget v0, Lcom/facebook/h;->orca_notification_icon_gingerbread:I

    goto :goto_0

    .line 57
    :cond_1
    sget v0, Lcom/facebook/h;->orca_notification_icon_froyo:I

    goto :goto_0
.end method
