.class Lcom/facebook/bugreporter/activity/e;
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
    .line 303
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/e;->a:Lcom/facebook/bugreporter/activity/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 305
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/e;->a:Lcom/facebook/bugreporter/activity/d;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/activity/d;->a()V

    .line 306
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/e;->a:Lcom/facebook/bugreporter/activity/d;

    iget-object v0, v0, Lcom/facebook/bugreporter/activity/d;->Z:Lcom/facebook/bugreporter/activity/BugReportActivity;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->finish()V

    .line 307
    return-void
.end method
