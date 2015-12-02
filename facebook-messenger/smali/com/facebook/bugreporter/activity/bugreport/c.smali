.class Lcom/facebook/bugreporter/activity/bugreport/c;
.super Lcom/facebook/widget/text/f;
.source "BugReportFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;


# direct methods
.method constructor <init>(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;)V
    .locals 0

    .prologue
    .line 175
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/bugreport/c;->a:Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;

    invoke-direct {p0}, Lcom/facebook/widget/text/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 178
    const-string v0, "http://m.facebook.com/about/privacy"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 179
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 180
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/c;->a:Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;

    invoke-virtual {v0, v1}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->a(Landroid/content/Intent;)V

    .line 181
    return-void
.end method
