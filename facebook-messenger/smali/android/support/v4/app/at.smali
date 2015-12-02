.class Landroid/support/v4/app/at;
.super Ljava/lang/Object;
.source "NotificationCompat.java"

# interfaces
.implements Landroid/support/v4/app/ar;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/v4/app/ap;)Landroid/app/Notification;
    .locals 10

    .prologue
    .line 100
    iget-object v0, p1, Landroid/support/v4/app/ap;->a:Landroid/content/Context;

    iget-object v1, p1, Landroid/support/v4/app/ap;->r:Landroid/app/Notification;

    iget-object v2, p1, Landroid/support/v4/app/ap;->b:Ljava/lang/CharSequence;

    iget-object v3, p1, Landroid/support/v4/app/ap;->c:Ljava/lang/CharSequence;

    iget-object v4, p1, Landroid/support/v4/app/ap;->h:Ljava/lang/CharSequence;

    iget-object v5, p1, Landroid/support/v4/app/ap;->f:Landroid/widget/RemoteViews;

    iget v6, p1, Landroid/support/v4/app/ap;->i:I

    iget-object v7, p1, Landroid/support/v4/app/ap;->d:Landroid/app/PendingIntent;

    iget-object v8, p1, Landroid/support/v4/app/ap;->e:Landroid/app/PendingIntent;

    iget-object v9, p1, Landroid/support/v4/app/ap;->g:Landroid/graphics/Bitmap;

    invoke-static/range {v0 .. v9}, Landroid/support/v4/app/ax;->a(Landroid/content/Context;Landroid/app/Notification;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/graphics/Bitmap;)Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method
