.class Landroid/support/v7/app/ActionBarActivityDelegateApi20$WindowCallbackWrapperApi20;
.super Landroid/support/v7/app/ActionBarActivityDelegateICS$WindowCallbackWrapper;
.source "ActionBarActivityDelegateApi20.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/ActionBarActivityDelegateApi20;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "WindowCallbackWrapperApi20"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/app/ActionBarActivityDelegateApi20;


# direct methods
.method constructor <init>(Landroid/support/v7/app/ActionBarActivityDelegateApi20;Landroid/view/Window$Callback;)V
    .locals 0
    .param p2, "wrapped"    # Landroid/view/Window$Callback;

    .prologue
    .line 34
    iput-object p1, p0, Landroid/support/v7/app/ActionBarActivityDelegateApi20$WindowCallbackWrapperApi20;->this$0:Landroid/support/v7/app/ActionBarActivityDelegateApi20;

    .line 35
    invoke-direct {p0, p1, p2}, Landroid/support/v7/app/ActionBarActivityDelegateICS$WindowCallbackWrapper;-><init>(Landroid/support/v7/app/ActionBarActivityDelegateICS;Landroid/view/Window$Callback;)V

    .line 36
    return-void
.end method
