.class Landroid/support/v4/app/q$k;
.super Landroid/support/v4/app/q$h;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "k"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 384
    invoke-direct {p0}, Landroid/support/v4/app/q$h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/v4/app/q$d;)Landroid/app/Notification;
    .locals 13

    .prologue
    .line 387
    iget-object v0, p1, Landroid/support/v4/app/q$d;->a:Landroid/content/Context;

    iget-object v1, p1, Landroid/support/v4/app/q$d;->w:Landroid/app/Notification;

    iget-object v2, p1, Landroid/support/v4/app/q$d;->b:Ljava/lang/CharSequence;

    iget-object v3, p1, Landroid/support/v4/app/q$d;->c:Ljava/lang/CharSequence;

    iget-object v4, p1, Landroid/support/v4/app/q$d;->h:Ljava/lang/CharSequence;

    iget-object v5, p1, Landroid/support/v4/app/q$d;->f:Landroid/widget/RemoteViews;

    iget v6, p1, Landroid/support/v4/app/q$d;->i:I

    iget-object v7, p1, Landroid/support/v4/app/q$d;->d:Landroid/app/PendingIntent;

    iget-object v8, p1, Landroid/support/v4/app/q$d;->e:Landroid/app/PendingIntent;

    iget-object v9, p1, Landroid/support/v4/app/q$d;->g:Landroid/graphics/Bitmap;

    iget v10, p1, Landroid/support/v4/app/q$d;->n:I

    iget v11, p1, Landroid/support/v4/app/q$d;->o:I

    iget-boolean v12, p1, Landroid/support/v4/app/q$d;->p:Z

    invoke-static/range {v0 .. v12}, Landroid/support/v4/app/v;->a(Landroid/content/Context;Landroid/app/Notification;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/graphics/Bitmap;IIZ)Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method
