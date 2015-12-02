.class Lcom/facebook/bugreporter/activity/c;
.super Ljava/lang/Object;
.source "BugReportActivity.java"

# interfaces
.implements Lcom/facebook/base/fragment/c;


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/activity/BugReportActivity;


# direct methods
.method constructor <init>(Lcom/facebook/bugreporter/activity/BugReportActivity;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/c;->a:Lcom/facebook/bugreporter/activity/BugReportActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/c;->a:Lcom/facebook/bugreporter/activity/BugReportActivity;

    invoke-static {v0, p1, p2}, Lcom/facebook/bugreporter/activity/BugReportActivity;->a(Lcom/facebook/bugreporter/activity/BugReportActivity;Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    .line 84
    return-void
.end method
