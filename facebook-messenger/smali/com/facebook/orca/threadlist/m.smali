.class public Lcom/facebook/orca/threadlist/m;
.super Landroid/app/Dialog;
.source "ThreadChooserDialog.java"


# static fields
.field public static final a:Ljava/lang/String;


# instance fields
.field private final b:Lcom/facebook/orca/threadlist/af;

.field private final c:Lcom/facebook/orca/f/k;

.field private final d:Lcom/facebook/fbservice/ops/c;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderType;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/lang/String;

.field private g:Landroid/widget/ListView;

.field private h:Lcom/facebook/widget/listview/EmptyListViewItem;

.field private i:Lcom/facebook/orca/threads/ThreadsCollection;

.field private j:Lcom/facebook/orca/threadlist/p;

.field private k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 35
    new-instance v0, Ljava/lang/String;

    const-string v1, "NEW_THREAD"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/threadlist/m;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/orca/threadlist/af;Lcom/facebook/orca/f/k;Lcom/facebook/fbservice/ops/c;Ljavax/inject/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/orca/threadlist/af;",
            "Lcom/facebook/orca/f/k;",
            "Lcom/facebook/fbservice/ops/c;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderType;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 59
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 49
    invoke-static {}, Lcom/facebook/orca/threads/ThreadsCollection;->a()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/m;->i:Lcom/facebook/orca/threads/ThreadsCollection;

    .line 60
    iput-object p2, p0, Lcom/facebook/orca/threadlist/m;->b:Lcom/facebook/orca/threadlist/af;

    .line 61
    iput-object p3, p0, Lcom/facebook/orca/threadlist/m;->c:Lcom/facebook/orca/f/k;

    .line 62
    iput-object p4, p0, Lcom/facebook/orca/threadlist/m;->d:Lcom/facebook/fbservice/ops/c;

    .line 63
    iput-object p5, p0, Lcom/facebook/orca/threadlist/m;->e:Ljavax/inject/a;

    .line 64
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/m;)Lcom/facebook/fbservice/ops/c;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->d:Lcom/facebook/fbservice/ops/c;

    return-object v0
.end method

.method private a()V
    .locals 2

    .prologue
    .line 124
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/m;->b()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 125
    iget-object v1, p0, Lcom/facebook/orca/threadlist/m;->c:Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/f/k;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 126
    iget-object v1, p0, Lcom/facebook/orca/threadlist/m;->c:Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/f/k;->b(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/m;->i:Lcom/facebook/orca/threads/ThreadsCollection;

    .line 127
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/m;->c()V

    .line 131
    :goto_0
    return-void

    .line 129
    :cond_0
    sget-object v0, Lcom/facebook/fbservice/service/s;->STALE_DATA_OKAY:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/m;->a(Lcom/facebook/fbservice/service/s;)V

    goto :goto_0
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 176
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->b:Lcom/facebook/orca/threadlist/af;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadlist/af;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    .line 177
    sget-object v1, Lcom/facebook/orca/threadlist/af;->b:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    .line 178
    sget-object v0, Lcom/facebook/orca/threadlist/m;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/m;->k:Ljava/lang/String;

    .line 183
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/m;->dismiss()V

    .line 184
    return-void

    .line 179
    :cond_1
    instance-of v1, v0, Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v1, :cond_0

    .line 180
    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 181
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/m;->k:Ljava/lang/String;

    goto :goto_0
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 157
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadListResult;

    .line 159
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadListResult;->b()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/m;->i:Lcom/facebook/orca/threads/ThreadsCollection;

    .line 160
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/m;->c()V

    .line 161
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 164
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->h:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    .line 165
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->h:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 166
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/s;)V
    .locals 3

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->d:Lcom/facebook/fbservice/ops/c;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    :goto_0
    return-void

    .line 139
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/m;->b()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 140
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadListParams;->newBuilder()Lcom/facebook/orca/server/y;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/facebook/orca/server/y;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/y;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/orca/server/y;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/y;->f()Lcom/facebook/orca/server/FetchThreadListParams;

    move-result-object v0

    .line 144
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 145
    const-string v2, "fetchThreadListParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 146
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->d:Lcom/facebook/fbservice/ops/c;

    sget-object v2, Lcom/facebook/orca/server/aq;->i:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v2, v1}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 147
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->h:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/m;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/o;->thread_list_loading:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    .line 148
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->h:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/m;I)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/m;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/m;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/m;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/m;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/m;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method private b()Lcom/facebook/orca/threads/FolderName;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderType;

    .line 153
    invoke-static {v0}, Lcom/facebook/orca/threads/FolderName;->a(Lcom/facebook/orca/threads/FolderType;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    return-object v0
.end method

.method private c()V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 169
    iget-object v1, p0, Lcom/facebook/orca/threadlist/m;->b:Lcom/facebook/orca/threadlist/af;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/m;->i:Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/threadlist/af;->a(Lcom/google/common/a/es;)V

    .line 170
    iget-object v1, p0, Lcom/facebook/orca/threadlist/m;->h:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/m;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/facebook/o;->thread_list_no_threads:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    .line 171
    iget-object v1, p0, Lcom/facebook/orca/threadlist/m;->h:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v1, v0}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 172
    iget-object v1, p0, Lcom/facebook/orca/threadlist/m;->h:Lcom/facebook/widget/listview/EmptyListViewItem;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/m;->i:Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadsCollection;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    invoke-virtual {v1, v0}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 173
    return-void

    .line 172
    :cond_0
    const/16 v0, 0x8

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threadlist/p;)V
    .locals 0

    .prologue
    .line 191
    iput-object p1, p0, Lcom/facebook/orca/threadlist/m;->j:Lcom/facebook/orca/threadlist/p;

    .line 192
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/facebook/orca/threadlist/m;->f:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->b:Lcom/facebook/orca/threadlist/af;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadlist/af;->a(Ljava/lang/String;)V

    .line 72
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 76
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 78
    invoke-virtual {p0, v2}, Lcom/facebook/orca/threadlist/m;->requestWindowFeature(I)Z

    .line 79
    sget v0, Lcom/facebook/k;->orca_thread_chooser_dialog:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/m;->setContentView(I)V

    .line 81
    sget v0, Lcom/facebook/i;->title:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/m;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 82
    iget-object v1, p0, Lcom/facebook/orca/threadlist/m;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    sget v0, Lcom/facebook/i;->thread_list:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/m;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/m;->g:Landroid/widget/ListView;

    .line 85
    sget v0, Lcom/facebook/i;->threadlist_empty_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/m;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/EmptyListViewItem;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/m;->h:Lcom/facebook/widget/listview/EmptyListViewItem;

    .line 87
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->b:Lcom/facebook/orca/threadlist/af;

    sget-object v1, Lcom/facebook/orca/threadlist/al;->CHOOSE_DIALOG:Lcom/facebook/orca/threadlist/al;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/af;->a(Lcom/facebook/orca/threadlist/al;)V

    .line 88
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->g:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/m;->b:Lcom/facebook/orca/threadlist/af;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 89
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->g:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setItemsCanFocus(Z)V

    .line 90
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->g:Landroid/widget/ListView;

    new-instance v1, Lcom/facebook/orca/threadlist/n;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/n;-><init>(Lcom/facebook/orca/threadlist/m;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 97
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->d:Lcom/facebook/fbservice/ops/c;

    new-instance v1, Lcom/facebook/orca/threadlist/o;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/o;-><init>(Lcom/facebook/orca/threadlist/m;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 110
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/m;->a()V

    .line 111
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 115
    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    .line 116
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->d:Lcom/facebook/fbservice/ops/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 117
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->d:Lcom/facebook/fbservice/ops/c;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/c;->a()V

    .line 118
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->j:Lcom/facebook/orca/threadlist/p;

    if-eqz v0, :cond_0

    .line 119
    iget-object v0, p0, Lcom/facebook/orca/threadlist/m;->j:Lcom/facebook/orca/threadlist/p;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/m;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/p;->a(Ljava/lang/String;)V

    .line 121
    :cond_0
    return-void
.end method
