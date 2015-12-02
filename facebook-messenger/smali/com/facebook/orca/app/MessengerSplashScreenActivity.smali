.class public Lcom/facebook/orca/app/MessengerSplashScreenActivity;
.super Lcom/facebook/ui/h/a;
.source "MessengerSplashScreenActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# annotations
.annotation runtime Lcom/facebook/base/activity/AppInitializationNotRequired;
.end annotation

.annotation runtime Lcom/facebook/base/activity/AuthNotRequired;
.end annotation


# static fields
.field private static final p:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private q:Landroid/content/ComponentName;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/facebook/orca/app/MessengerSplashScreenActivity;

    sput-object v0, Lcom/facebook/orca/app/MessengerSplashScreenActivity;->p:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 31
    sget v0, Lcom/facebook/k;->splash_screen:I

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/ui/h/a;-><init>(ILjava/lang/Class;)V

    .line 32
    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 36
    invoke-super {p0, p1}, Lcom/facebook/ui/h/a;->b(Landroid/os/Bundle;)V

    .line 37
    invoke-virtual {p0}, Lcom/facebook/orca/app/MessengerSplashScreenActivity;->i()Lcom/facebook/inject/t;

    move-result-object v0

    .line 38
    const-class v1, Landroid/content/ComponentName;

    const-class v2, Lcom/facebook/orca/threadlist/ForThreadListActivity;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ComponentName;

    iput-object v0, p0, Lcom/facebook/orca/app/MessengerSplashScreenActivity;->q:Landroid/content/ComponentName;

    .line 39
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 48
    sget-object v0, Lcom/facebook/analytics/f/a;->SPLASH_SCREEN_ACTIVITY:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method protected j()Landroid/content/ComponentName;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/app/MessengerSplashScreenActivity;->q:Landroid/content/ComponentName;

    return-object v0
.end method
