.class Lcom/aetn/history/android/historyhere/view/MoreActivity$4;
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
    .line 119
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity$4;->this$0:Lcom/aetn/history/android/historyhere/view/MoreActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 122
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity$4;->this$0:Lcom/aetn/history/android/historyhere/view/MoreActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->access$100(Lcom/aetn/history/android/historyhere/view/MoreActivity;)Lcom/localytics/android/LocalyticsAmpSession;

    move-result-object v1

    invoke-virtual {v1}, Lcom/localytics/android/LocalyticsAmpSession;->open()V

    .line 123
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity$4;->this$0:Lcom/aetn/history/android/historyhere/view/MoreActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->access$100(Lcom/aetn/history/android/historyhere/view/MoreActivity;)Lcom/localytics/android/LocalyticsAmpSession;

    move-result-object v1

    const-string v2, "HH:TermsOfUse"

    invoke-virtual {v1, v2}, Lcom/localytics/android/LocalyticsAmpSession;->tagScreen(Ljava/lang/String;)V

    .line 124
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity$4;->this$0:Lcom/aetn/history/android/historyhere/view/MoreActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->access$100(Lcom/aetn/history/android/historyhere/view/MoreActivity;)Lcom/localytics/android/LocalyticsAmpSession;

    move-result-object v1

    invoke-virtual {v1}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 125
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    const-string v2, "http://www.aenetworks.com/terms/"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 126
    .local v0, "browserIntent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity$4;->this$0:Lcom/aetn/history/android/historyhere/view/MoreActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/MoreActivity;->mContext:Landroid/content/Context;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->access$000(Lcom/aetn/history/android/historyhere/view/MoreActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 127
    return-void
.end method
