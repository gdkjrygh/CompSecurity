.class Landroid/support/v7/app/ActionBarActivityDelegateApi20;
.super Landroid/support/v7/app/ActionBarActivityDelegateJBMR2;
.source "ActionBarActivityDelegateApi20.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/app/ActionBarActivityDelegateApi20$WindowCallbackWrapperApi20;
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/support/v7/app/ActionBarActivity;)V
    .locals 0
    .param p1, "activity"    # Landroid/support/v7/app/ActionBarActivity;

    .prologue
    .line 24
    invoke-direct {p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegateJBMR2;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    .line 25
    return-void
.end method


# virtual methods
.method createWindowCallbackWrapper(Landroid/view/Window$Callback;)Landroid/view/Window$Callback;
    .locals 1
    .param p1, "cb"    # Landroid/view/Window$Callback;

    .prologue
    .line 29
    new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegateApi20$WindowCallbackWrapperApi20;

    invoke-direct {v0, p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegateApi20$WindowCallbackWrapperApi20;-><init>(Landroid/support/v7/app/ActionBarActivityDelegateApi20;Landroid/view/Window$Callback;)V

    return-object v0
.end method
