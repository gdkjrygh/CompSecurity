.class Landroid/support/v4/app/NotificationManagerCompat$ImplBase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/app/NotificationManagerCompat$Impl;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public cancelNotification(Landroid/app/NotificationManager;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 127
    invoke-virtual {p1, p3}, Landroid/app/NotificationManager;->cancel(I)V

    .line 128
    return-void
.end method

.method public getSideChannelBindFlags()I
    .locals 1

    .prologue
    .line 138
    const/4 v0, 0x1

    return v0
.end method

.method public postNotification(Landroid/app/NotificationManager;Ljava/lang/String;ILandroid/app/Notification;)V
    .locals 0

    .prologue
    .line 133
    invoke-virtual {p1, p3, p4}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 134
    return-void
.end method
