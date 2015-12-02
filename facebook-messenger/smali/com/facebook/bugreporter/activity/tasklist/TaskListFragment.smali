.class public Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;
.super Lcom/facebook/base/fragment/FbFragment;
.source "TaskListFragment.java"

# interfaces
.implements Lcom/facebook/base/fragment/b;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private Z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/bugreporter/activity/tasklist/Task;",
            ">;"
        }
    .end annotation
.end field

.field private aa:Landroid/content/Intent;

.field private b:Lcom/facebook/bugreporter/activity/tasklist/c;

.field private c:Lcom/facebook/bugreporter/activity/tasklist/b;

.field private d:Ljava/util/concurrent/Executor;

.field private e:Lcom/facebook/ui/i/g;

.field private f:Lcom/facebook/base/fragment/c;

.field private g:Lcom/facebook/widget/titlebar/a;

.field private h:Landroid/widget/ListView;

.field private i:Lcom/facebook/widget/listview/EmptyListViewItem;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 46
    const-class v0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;

    sput-object v0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Lcom/facebook/base/fragment/FbFragment;-><init>()V

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->Z:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;I)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->e(I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;Lcom/google/common/a/es;Lcom/facebook/common/w/q;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->a(Lcom/google/common/a/es;Lcom/facebook/common/w/q;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;Ljava/util/List;Lcom/facebook/common/w/q;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->a(Ljava/util/List;Lcom/facebook/common/w/q;)V

    return-void
.end method

.method private a(Lcom/google/common/a/es;Lcom/facebook/common/w/q;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/bugreporter/activity/tasklist/Task;",
            ">;",
            "Lcom/facebook/common/w/q;",
            ")V"
        }
    .end annotation

    .prologue
    .line 133
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v0

    .line 134
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/common/a/es;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 135
    invoke-virtual {v0, p1}, Lcom/google/common/a/et;->b(Ljava/lang/Iterable;)Lcom/google/common/a/et;

    .line 136
    new-instance v1, Lcom/facebook/bugreporter/activity/tasklist/Task;

    const-string v2, "-1"

    const-string v3, "-1"

    const-string v4, "No Match"

    const-string v5, "None of the tasks above match my issue."

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/facebook/bugreporter/activity/tasklist/Task;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 139
    :cond_0
    invoke-virtual {v0}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->a(Ljava/util/List;Lcom/facebook/common/w/q;)V

    .line 140
    return-void
.end method

.method private a(Ljava/util/List;Lcom/facebook/common/w/q;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/bugreporter/activity/tasklist/Task;",
            ">;",
            "Lcom/facebook/common/w/q;",
            ")V"
        }
    .end annotation

    .prologue
    .line 149
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->Z:Ljava/util/List;

    .line 151
    sget-object v0, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-eq p2, v0, :cond_0

    sget-object v0, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    if-ne p2, v0, :cond_3

    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->Z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 154
    :cond_0
    sget-object v0, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-eq p2, v0, :cond_1

    .line 155
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->e:Lcom/facebook/ui/i/g;

    new-instance v1, Lcom/facebook/ui/i/a;

    sget v2, Lcom/facebook/o;->bug_report_tasks_not_found:I

    invoke-direct {v1, v2}, Lcom/facebook/ui/i/a;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/facebook/ui/i/g;->a(Lcom/facebook/ui/i/a;)V

    .line 157
    :cond_1
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->aa:Landroid/content/Intent;

    const-string v1, "task_number"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 158
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->aa:Landroid/content/Intent;

    const-string v1, "remove_fragment"

    iget-object v2, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->Z:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 159
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->f:Lcom/facebook/base/fragment/c;

    if-eqz v0, :cond_2

    .line 160
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->f:Lcom/facebook/base/fragment/c;

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->aa:Landroid/content/Intent;

    invoke-interface {v0, p0, v1}, Lcom/facebook/base/fragment/c;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    .line 168
    :cond_2
    :goto_0
    return-void

    .line 163
    :cond_3
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->i:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 164
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->i:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 165
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->c:Lcom/facebook/bugreporter/activity/tasklist/b;

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->Z:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/facebook/bugreporter/activity/tasklist/b;->a(Ljava/util/List;)V

    .line 166
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->g:Lcom/facebook/widget/titlebar/a;

    sget v1, Lcom/facebook/o;->bug_report_task_list_title:I

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setTitle(I)V

    goto :goto_0
.end method

.method private e(I)V
    .locals 6

    .prologue
    .line 171
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->c:Lcom/facebook/bugreporter/activity/tasklist/b;

    invoke-virtual {v0, p1}, Lcom/facebook/bugreporter/activity/tasklist/b;->a(I)Lcom/facebook/bugreporter/activity/tasklist/Task;

    move-result-object v0

    .line 172
    iget-object v1, v0, Lcom/facebook/bugreporter/activity/tasklist/Task;->b:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 173
    iget-object v2, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->aa:Landroid/content/Intent;

    const-string v3, "task_number"

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 174
    iget-object v2, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->aa:Landroid/content/Intent;

    const-string v3, "task_desc"

    iget-object v4, v0, Lcom/facebook/bugreporter/activity/tasklist/Task;->d:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 175
    iget-object v2, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->aa:Landroid/content/Intent;

    const-string v3, "task_id"

    iget-object v4, v0, Lcom/facebook/bugreporter/activity/tasklist/Task;->a:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 176
    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 177
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->f:Lcom/facebook/base/fragment/c;

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->f:Lcom/facebook/base/fragment/c;

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->aa:Landroid/content/Intent;

    invoke-interface {v0, p0, v1}, Lcom/facebook/base/fragment/c;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    .line 185
    :cond_0
    :goto_0
    return-void

    .line 181
    :cond_1
    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->n()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/facebook/bugreporter/activity/tasklist/ViewTaskActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 182
    const-string v2, "task"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 183
    const/16 v0, 0x3ed

    invoke-virtual {p0, v1, v0}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->a(Landroid/content/Intent;I)V

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 68
    sget v0, Lcom/facebook/k;->task_list_view:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    .line 194
    packed-switch p1, :pswitch_data_0

    .line 211
    sget-object v0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unexpected request code"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 214
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 196
    :pswitch_1
    packed-switch p2, :pswitch_data_1

    .line 205
    const-string v0, "Task List Activity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unexpected result code from View Task: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/common/e/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 198
    :pswitch_2
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->f:Lcom/facebook/base/fragment/c;

    if-eqz v0, :cond_0

    .line 199
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->f:Lcom/facebook/base/fragment/c;

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->aa:Landroid/content/Intent;

    invoke-interface {v0, p0, v1}, Lcom/facebook/base/fragment/c;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    goto :goto_0

    .line 194
    :pswitch_data_0
    .packed-switch 0x3ed
        :pswitch_1
    .end packed-switch

    .line 196
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public a(Lcom/facebook/base/fragment/c;)V
    .locals 0

    .prologue
    .line 189
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->f:Lcom/facebook/base/fragment/c;

    .line 190
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 73
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->d(Landroid/os/Bundle;)V

    .line 75
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 76
    const-class v0, Lcom/facebook/bugreporter/activity/tasklist/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/activity/tasklist/c;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->b:Lcom/facebook/bugreporter/activity/tasklist/c;

    .line 77
    const-class v0, Lcom/facebook/bugreporter/activity/tasklist/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/activity/tasklist/b;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->c:Lcom/facebook/bugreporter/activity/tasklist/b;

    .line 78
    const-class v0, Ljava/util/concurrent/Executor;

    const-class v2, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->d:Ljava/util/concurrent/Executor;

    .line 79
    const-class v0, Lcom/facebook/ui/i/g;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/i/g;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->e:Lcom/facebook/ui/i/g;

    .line 81
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->aa:Landroid/content/Intent;

    .line 83
    const v0, 0x102000a

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->h:Landroid/widget/ListView;

    .line 84
    sget v0, Lcom/facebook/i;->empty_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/EmptyListViewItem;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->i:Lcom/facebook/widget/listview/EmptyListViewItem;

    .line 85
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->h:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->c:Lcom/facebook/bugreporter/activity/tasklist/b;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 87
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->z()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/view/View;)Z

    .line 88
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->g:Lcom/facebook/widget/titlebar/a;

    .line 89
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->g:Lcom/facebook/widget/titlebar/a;

    const-string v1, "Loading..."

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setTitle(Ljava/lang/String;)V

    .line 91
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->i:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v3}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 92
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->i:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 93
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->i:Lcom/facebook/widget/listview/EmptyListViewItem;

    const-string v1, "Loading..."

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    .line 95
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->h:Landroid/widget/ListView;

    new-instance v1, Lcom/facebook/bugreporter/activity/tasklist/g;

    invoke-direct {v1, p0}, Lcom/facebook/bugreporter/activity/tasklist/g;-><init>(Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 102
    if-eqz p1, :cond_0

    .line 103
    const-string v0, "saved_tasks"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->Z:Ljava/util/List;

    .line 104
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->Z:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->Z:Ljava/util/List;

    sget-object v1, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    invoke-direct {p0, v0, v1}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->a(Ljava/util/List;Lcom/facebook/common/w/q;)V

    .line 130
    :goto_0
    return-void

    .line 110
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->k()Landroid/os/Bundle;

    move-result-object v2

    .line 111
    const-string v0, "retry"

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 112
    if-eqz v0, :cond_1

    sget-object v0, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    move-object v1, v0

    .line 114
    :goto_1
    const-string v0, "category_id"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 115
    const-string v0, "reporter_config"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/ConstBugReporterConfig;

    .line 117
    iget-object v2, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->b:Lcom/facebook/bugreporter/activity/tasklist/c;

    invoke-virtual {v2, v3, v0}, Lcom/facebook/bugreporter/activity/tasklist/c;->a(Ljava/lang/String;Lcom/facebook/bugreporter/l;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 119
    new-instance v2, Lcom/facebook/bugreporter/activity/tasklist/h;

    invoke-direct {v2, p0, v1}, Lcom/facebook/bugreporter/activity/tasklist/h;-><init>(Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;Lcom/facebook/common/w/q;)V

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v2, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    goto :goto_0

    .line 112
    :cond_1
    sget-object v0, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    move-object v1, v0

    goto :goto_1
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 218
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->e(Landroid/os/Bundle;)V

    .line 219
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->Z:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 220
    const-string v0, "saved_tasks"

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->Z:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 221
    :cond_0
    return-void
.end method
