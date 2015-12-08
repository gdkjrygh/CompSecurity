.class public Lcom/thetransitapp/droid/TransitApplication;
.super Landroid/app/Application;
.source "TransitApplication.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 4

    .prologue
    .line 9
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 11
    sget-object v0, Lroboguice/RoboGuice;->DEFAULT_STAGE:Lcom/google/inject/Stage;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/inject/Module;

    const/4 v2, 0x0

    invoke-static {p0}, Lroboguice/RoboGuice;->newDefaultRoboModule(Landroid/app/Application;)Lroboguice/config/DefaultRoboModule;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    .line 12
    new-instance v3, Lcom/thetransitapp/droid/TransitModule;

    invoke-direct {v3}, Lcom/thetransitapp/droid/TransitModule;-><init>()V

    aput-object v3, v1, v2

    .line 11
    invoke-static {p0, v0, v1}, Lroboguice/RoboGuice;->setBaseApplicationInjector(Landroid/app/Application;Lcom/google/inject/Stage;[Lcom/google/inject/Module;)Lcom/google/inject/Injector;

    .line 13
    return-void
.end method
