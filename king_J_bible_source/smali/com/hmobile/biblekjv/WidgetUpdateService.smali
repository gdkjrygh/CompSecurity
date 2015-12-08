.class public Lcom/hmobile/biblekjv/WidgetUpdateService;
.super Landroid/app/Service;
.source "WidgetUpdateService.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method private buildUpdate()V
    .locals 4

    .prologue
    .line 25
    new-instance v1, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetUpdateService;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 26
    const v3, 0x7f030037

    .line 25
    invoke-direct {v1, v2, v3}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 27
    .local v1, "view":Landroid/widget/RemoteViews;
    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v0

    .line 28
    .local v0, "manager":Landroid/appwidget/AppWidgetManager;
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetUpdateService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/hmobile/biblekjv/HolyBibleWidget;->updateWidget(Landroid/widget/RemoteViews;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;)V

    .line 29
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetUpdateService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->updateWidget(Landroid/widget/RemoteViews;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;)V

    .line 30
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 34
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 0

    .prologue
    .line 14
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 15
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "flags"    # I
    .param p3, "startId"    # I

    .prologue
    .line 19
    invoke-direct {p0}, Lcom/hmobile/biblekjv/WidgetUpdateService;->buildUpdate()V

    .line 21
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method
