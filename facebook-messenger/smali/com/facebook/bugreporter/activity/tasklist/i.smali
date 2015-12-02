.class public Lcom/facebook/bugreporter/activity/tasklist/i;
.super Lcom/facebook/widget/f;
.source "TaskListItemView.java"


# instance fields
.field private final a:Landroid/widget/TextView;

.field private final b:Landroid/widget/TextView;

.field private c:Lcom/facebook/bugreporter/activity/tasklist/Task;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 26
    sget v0, Lcom/facebook/k;->task_list_row_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/i;->setContentView(I)V

    .line 27
    sget v0, Lcom/facebook/i;->task_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/i;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/i;->a:Landroid/widget/TextView;

    .line 28
    sget v0, Lcom/facebook/i;->task_description:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/i;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/i;->b:Landroid/widget/TextView;

    .line 29
    return-void
.end method


# virtual methods
.method public setTask(Lcom/facebook/bugreporter/activity/tasklist/Task;)V
    .locals 2

    .prologue
    .line 32
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/tasklist/i;->c:Lcom/facebook/bugreporter/activity/tasklist/Task;

    .line 33
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/i;->a:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/facebook/bugreporter/activity/tasklist/Task;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    iget-object v0, p1, Lcom/facebook/bugreporter/activity/tasklist/Task;->d:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/common/w/n;->c(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/i;->b:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 46
    :goto_0
    return-void

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/i;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 39
    iget-object v0, p1, Lcom/facebook/bugreporter/activity/tasklist/Task;->b:Ljava/lang/String;

    const-string v1, "-1"

    if-ne v0, v1, :cond_1

    .line 40
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/i;->b:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/facebook/bugreporter/activity/tasklist/Task;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 42
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p1, Lcom/facebook/bugreporter/activity/tasklist/Task;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p1, Lcom/facebook/bugreporter/activity/tasklist/Task;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 43
    iget-object v1, p0, Lcom/facebook/bugreporter/activity/tasklist/i;->b:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method
