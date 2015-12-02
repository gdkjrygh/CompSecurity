.class Landroid/support/v4/app/q$i;
.super Landroid/support/v4/app/q$h;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "i"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 359
    invoke-direct {p0}, Landroid/support/v4/app/q$h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/v4/app/q$d;)Landroid/app/Notification;
    .locals 6

    .prologue
    .line 362
    iget-object v0, p1, Landroid/support/v4/app/q$d;->w:Landroid/app/Notification;

    .line 363
    iget-object v1, p1, Landroid/support/v4/app/q$d;->a:Landroid/content/Context;

    iget-object v2, p1, Landroid/support/v4/app/q$d;->b:Ljava/lang/CharSequence;

    iget-object v3, p1, Landroid/support/v4/app/q$d;->c:Ljava/lang/CharSequence;

    iget-object v4, p1, Landroid/support/v4/app/q$d;->d:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 365
    iget-object v1, p1, Landroid/support/v4/app/q$d;->a:Landroid/content/Context;

    iget-object v2, p1, Landroid/support/v4/app/q$d;->b:Ljava/lang/CharSequence;

    iget-object v3, p1, Landroid/support/v4/app/q$d;->c:Ljava/lang/CharSequence;

    iget-object v4, p1, Landroid/support/v4/app/q$d;->d:Landroid/app/PendingIntent;

    iget-object v5, p1, Landroid/support/v4/app/q$d;->e:Landroid/app/PendingIntent;

    invoke-static/range {v0 .. v5}, Landroid/support/v4/app/t;->a(Landroid/app/Notification;Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Landroid/app/Notification;

    move-result-object v0

    .line 368
    iget v1, p1, Landroid/support/v4/app/q$d;->j:I

    if-lez v1, :cond_0

    .line 369
    iget v1, v0, Landroid/app/Notification;->flags:I

    or-int/lit16 v1, v1, 0x80

    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 371
    :cond_0
    return-object v0
.end method
