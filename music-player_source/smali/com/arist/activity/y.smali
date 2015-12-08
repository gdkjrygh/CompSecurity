.class final Lcom/arist/activity/y;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/arist/activity/MainActivity;

.field private final synthetic b:Landroid/app/AlertDialog;

.field private final synthetic c:I

.field private final synthetic d:I


# direct methods
.method constructor <init>(Lcom/arist/activity/MainActivity;Landroid/app/AlertDialog;II)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/y;->a:Lcom/arist/activity/MainActivity;

    iput-object p2, p0, Lcom/arist/activity/y;->b:Landroid/app/AlertDialog;

    iput p3, p0, Lcom/arist/activity/y;->c:I

    iput p4, p0, Lcom/arist/activity/y;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3

    iget-object v0, p0, Lcom/arist/activity/y;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    iget v0, p0, Lcom/arist/activity/y;->c:I

    if-nez v0, :cond_3

    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/activity/y;->a:Lcom/arist/activity/MainActivity;

    iget-object v1, v1, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v1}, Lcom/arist/b/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/arist/activity/y;->a:Lcom/arist/activity/MainActivity;

    const v1, 0x7f0900c5

    invoke-virtual {v0, v1}, Lcom/arist/activity/MainActivity;->a(I)V

    :goto_1
    return-void

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/b;

    invoke-virtual {v0}, Lcom/arist/b/b;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    iget-object v1, p0, Lcom/arist/activity/y;->a:Lcom/arist/activity/MainActivity;

    iget-object v1, v1, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v0, v1}, Lcom/arist/b/c;->a(Lcom/arist/b/b;)V

    new-instance v1, Lcom/arist/model/b/d;

    invoke-direct {v1}, Lcom/arist/model/b/d;-><init>()V

    iget-object v0, p0, Lcom/arist/activity/y;->a:Lcom/arist/activity/MainActivity;

    iget-object v2, v0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v1, v2, v0}, Lcom/arist/model/b/d;->a(Lcom/arist/b/b;Lcom/arist/b/c;)V

    iget-object v0, p0, Lcom/arist/activity/y;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;)Lcom/arist/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/e;->notifyDataSetChanged()V

    iget-object v0, p0, Lcom/arist/activity/y;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->h(Lcom/arist/activity/MainActivity;)Lcom/arist/view/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/view/a;->b()V

    iget-object v0, p0, Lcom/arist/activity/y;->a:Lcom/arist/activity/MainActivity;

    const v1, 0x7f09005d

    invoke-virtual {v0, v1}, Lcom/arist/activity/MainActivity;->a(I)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/arist/activity/y;->a:Lcom/arist/activity/MainActivity;

    iget v1, p0, Lcom/arist/activity/y;->d:I

    invoke-static {v0, v1, p3}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;II)V

    goto :goto_1
.end method
