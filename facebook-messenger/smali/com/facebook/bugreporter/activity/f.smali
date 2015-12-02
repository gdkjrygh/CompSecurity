.class Lcom/facebook/bugreporter/activity/f;
.super Ljava/lang/Object;
.source "BugReportActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/activity/d;


# direct methods
.method constructor <init>(Lcom/facebook/bugreporter/activity/d;)V
    .locals 0

    .prologue
    .line 295
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/f;->a:Lcom/facebook/bugreporter/activity/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 297
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/f;->a:Lcom/facebook/bugreporter/activity/d;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/activity/d;->a()V

    .line 298
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/f;->a:Lcom/facebook/bugreporter/activity/d;

    iget-object v0, v0, Lcom/facebook/bugreporter/activity/d;->Z:Lcom/facebook/bugreporter/activity/BugReportActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/bugreporter/activity/BugReportActivity;->a(Lcom/facebook/bugreporter/activity/BugReportActivity;Z)V

    .line 299
    return-void
.end method
