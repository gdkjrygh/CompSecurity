.class Landroid/support/v4/app/q$h;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/support/v4/app/q$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "h"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 299
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/v4/app/q$d;)Landroid/app/Notification;
    .locals 5

    .prologue
    .line 302
    iget-object v0, p1, Landroid/support/v4/app/q$d;->w:Landroid/app/Notification;

    .line 303
    iget-object v1, p1, Landroid/support/v4/app/q$d;->a:Landroid/content/Context;

    iget-object v2, p1, Landroid/support/v4/app/q$d;->b:Ljava/lang/CharSequence;

    iget-object v3, p1, Landroid/support/v4/app/q$d;->c:Ljava/lang/CharSequence;

    iget-object v4, p1, Landroid/support/v4/app/q$d;->d:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 306
    iget v1, p1, Landroid/support/v4/app/q$d;->j:I

    if-lez v1, :cond_0

    .line 307
    iget v1, v0, Landroid/app/Notification;->flags:I

    or-int/lit16 v1, v1, 0x80

    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 309
    :cond_0
    return-object v0
.end method

.method public a(Landroid/app/Notification;)Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 314
    const/4 v0, 0x0

    return-object v0
.end method
