.class Lcom/aetn/history/android/historyhere/MainNavigationActivity$3;
.super Ljava/lang/Object;
.source "MainNavigationActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/MainNavigationActivity;->onNoNetworkConnection()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    .prologue
    .line 1122
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$3;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 1125
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$3;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->forceCloseApp()V

    .line 1126
    return-void
.end method
