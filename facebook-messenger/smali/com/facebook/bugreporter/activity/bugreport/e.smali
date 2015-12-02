.class Lcom/facebook/bugreporter/activity/bugreport/e;
.super Ljava/lang/Object;
.source "BugReportFragment.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;


# direct methods
.method constructor <init>(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;)V
    .locals 0

    .prologue
    .line 224
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/bugreport/e;->a:Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Long;)V
    .locals 5

    .prologue
    .line 227
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/e;->a:Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;

    invoke-static {v0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->c(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;)Lcom/facebook/common/n/a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    long-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/facebook/common/n/a;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 228
    iget-object v1, p0, Lcom/facebook/bugreporter/activity/bugreport/e;->a:Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;

    sget v2, Lcom/facebook/o;->bug_report_screen_shot_title_with_size:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 229
    iget-object v1, p0, Lcom/facebook/bugreporter/activity/bugreport/e;->a:Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;

    invoke-static {v1}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->d(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 224
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/facebook/bugreporter/activity/bugreport/e;->a(Ljava/lang/Long;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 235
    return-void
.end method
