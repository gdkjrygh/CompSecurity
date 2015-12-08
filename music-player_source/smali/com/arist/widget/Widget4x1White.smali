.class public Lcom/arist/widget/Widget4x1White;
.super Landroid/appwidget/AppWidgetProvider;


# instance fields
.field private a:Landroid/widget/RemoteViews;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    const-string v0, "Widget4x1White"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/arist/c/a;->j:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/arist/widget/Widget4x1White;->a:Landroid/widget/RemoteViews;

    :cond_0
    const-string v0, "appWidgetIds"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    move-result-object v0

    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Lcom/arist/widget/Widget4x1White;->onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V

    return-void
.end method

.method public onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 7

    const v6, 0x7f060051

    const/high16 v5, 0x8000000

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/arist/widget/Widget4x1White;->a:Landroid/widget/RemoteViews;

    if-nez v0, :cond_0

    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f030047

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Lcom/arist/widget/Widget4x1White;->a:Landroid/widget/RemoteViews;

    iget-object v0, p0, Lcom/arist/widget/Widget4x1White;->a:Landroid/widget/RemoteViews;

    const v1, 0x7f0600fd

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, " - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/arist/b/b;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/arist/c/a/a;->a(Landroid/content/Context;Lcom/arist/b/b;)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/widget/Widget4x1White;->a:Landroid/widget/RemoteViews;

    const v2, 0x7f0600fc

    invoke-virtual {v1, v2, v0}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    iget-object v0, p0, Lcom/arist/widget/Widget4x1White;->a:Landroid/widget/RemoteViews;

    sget-object v1, Lcom/arist/c/a;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/arist/c/j;->a(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    invoke-static {p1, v4, v1, v5}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v6, v1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    iget-object v0, p0, Lcom/arist/widget/Widget4x1White;->a:Landroid/widget/RemoteViews;

    const v1, 0x7f0600ff

    sget-object v2, Lcom/arist/c/a;->f:Ljava/lang/String;

    invoke-static {v2}, Lcom/arist/c/j;->a(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    invoke-static {p1, v4, v2, v5}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    iget-object v0, p0, Lcom/arist/widget/Widget4x1White;->a:Landroid/widget/RemoteViews;

    const v1, 0x7f060052

    sget-object v2, Lcom/arist/c/a;->g:Ljava/lang/String;

    invoke-static {v2}, Lcom/arist/c/j;->a(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    invoke-static {p1, v4, v2, v5}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    iget-object v0, p0, Lcom/arist/widget/Widget4x1White;->a:Landroid/widget/RemoteViews;

    const v1, 0x7f0600fb

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/arist/activity/WelcomeActivity;

    invoke-direct {v2, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {p1, v4, v2, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    :cond_0
    iget-object v1, p0, Lcom/arist/widget/Widget4x1White;->a:Landroid/widget/RemoteViews;

    sget v0, Lcom/arist/activity/MyApplication;->j:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const v0, 0x7f0200a3

    :goto_0
    invoke-virtual {v1, v6, v0}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    if-eqz p3, :cond_2

    array-length v0, p3

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/arist/widget/Widget4x1White;->a:Landroid/widget/RemoteViews;

    invoke-virtual {p2, p3, v0}, Landroid/appwidget/AppWidgetManager;->updateAppWidget([ILandroid/widget/RemoteViews;)V

    :goto_1
    return-void

    :cond_1
    const v0, 0x7f0200a2

    goto :goto_0

    :cond_2
    new-instance v0, Landroid/content/ComponentName;

    const-class v1, Lcom/arist/widget/Widget4x1White;

    invoke-direct {v0, p1, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/arist/widget/Widget4x1White;->a:Landroid/widget/RemoteViews;

    invoke-virtual {p2, v0, v1}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(Landroid/content/ComponentName;Landroid/widget/RemoteViews;)V

    goto :goto_1
.end method
