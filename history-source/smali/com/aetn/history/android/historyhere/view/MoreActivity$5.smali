.class Lcom/aetn/history/android/historyhere/view/MoreActivity$5;
.super Ljava/lang/Object;
.source "MoreActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/view/MoreActivity;->setListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/view/MoreActivity;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/view/MoreActivity;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/view/MoreActivity;

    .prologue
    .line 130
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity$5;->this$0:Lcom/aetn/history/android/historyhere/view/MoreActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 133
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity$5;->this$0:Lcom/aetn/history/android/historyhere/view/MoreActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->access$100(Lcom/aetn/history/android/historyhere/view/MoreActivity;)Lcom/localytics/android/LocalyticsAmpSession;

    move-result-object v0

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->open()V

    .line 134
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity$5;->this$0:Lcom/aetn/history/android/historyhere/view/MoreActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->access$100(Lcom/aetn/history/android/historyhere/view/MoreActivity;)Lcom/localytics/android/LocalyticsAmpSession;

    move-result-object v0

    const-string v1, "HH:Feedback"

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsAmpSession;->tagScreen(Ljava/lang/String;)V

    .line 135
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity$5;->this$0:Lcom/aetn/history/android/historyhere/view/MoreActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->access$100(Lcom/aetn/history/android/historyhere/view/MoreActivity;)Lcom/localytics/android/LocalyticsAmpSession;

    move-result-object v0

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 136
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity$5;->this$0:Lcom/aetn/history/android/historyhere/view/MoreActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->access$100(Lcom/aetn/history/android/historyhere/view/MoreActivity;)Lcom/localytics/android/LocalyticsAmpSession;

    move-result-object v0

    const-string v1, "detail:share"

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsAmpSession;->tagEvent(Ljava/lang/String;)V

    .line 137
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity$5;->this$0:Lcom/aetn/history/android/historyhere/view/MoreActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/MoreActivity;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->access$200(Lcom/aetn/history/android/historyhere/view/MoreActivity;)Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->showFeedback()V

    .line 138
    return-void
.end method
