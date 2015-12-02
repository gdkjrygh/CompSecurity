.class public Lcom/facebook/bugreporter/activity/tasklist/ViewTaskActivity;
.super Lcom/facebook/base/activity/i;
.source "ViewTaskActivity.java"


# annotations
.annotation runtime Lcom/facebook/base/activity/AuthNotRequired;
.end annotation


# static fields
.field private static final p:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/facebook/bugreporter/activity/tasklist/ViewTaskActivity;

    sput-object v0, Lcom/facebook/bugreporter/activity/tasklist/ViewTaskActivity;->p:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v1, 0x3

    .line 26
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 28
    invoke-virtual {p0, v1}, Lcom/facebook/bugreporter/activity/tasklist/ViewTaskActivity;->requestWindowFeature(I)Z

    .line 29
    sget v0, Lcom/facebook/h;->view_task_icon:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/bugreporter/activity/tasklist/ViewTaskActivity;->setFeatureDrawableResource(II)V

    .line 31
    sget v0, Lcom/facebook/k;->task_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/ViewTaskActivity;->setContentView(I)V

    .line 33
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/tasklist/ViewTaskActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x106000c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/ViewTaskActivity;->setTitleColor(I)V

    .line 34
    sget v0, Lcom/facebook/i;->taskview:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/ViewTaskActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 36
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/tasklist/ViewTaskActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "task"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/facebook/bugreporter/activity/tasklist/Task;

    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v1, Lcom/facebook/bugreporter/activity/tasklist/Task;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 38
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "Task Number: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v1, Lcom/facebook/bugreporter/activity/tasklist/Task;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 39
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "Description \n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v1, v1, Lcom/facebook/bugreporter/activity/tasklist/Task;->d:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    sget v0, Lcom/facebook/i;->btn_back:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/ViewTaskActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/facebook/bugreporter/activity/tasklist/p;

    invoke-direct {v1, p0}, Lcom/facebook/bugreporter/activity/tasklist/p;-><init>(Lcom/facebook/bugreporter/activity/tasklist/ViewTaskActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    sget v0, Lcom/facebook/i;->btn_yes:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/ViewTaskActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/facebook/bugreporter/activity/tasklist/q;

    invoke-direct {v1, p0}, Lcom/facebook/bugreporter/activity/tasklist/q;-><init>(Lcom/facebook/bugreporter/activity/tasklist/ViewTaskActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    return-void
.end method
