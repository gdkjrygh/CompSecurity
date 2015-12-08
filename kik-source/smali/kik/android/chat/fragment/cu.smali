.class final Lkik/android/chat/fragment/cu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnCreateContextMenuListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 1446
    iput-object p1, p0, Lkik/android/chat/fragment/cu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1450
    check-cast p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 1451
    iget-object v0, p0, Lkik/android/chat/fragment/cu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->m(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ResizeEventList;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/widget/ResizeEventList;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    iget v3, p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-interface {v0, v3}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 1452
    if-nez v0, :cond_1

    .line 1502
    :cond_0
    :goto_0
    return-void

    .line 1459
    :cond_1
    iget-object v3, p0, Lkik/android/chat/fragment/cu;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v4, p0, Lkik/android/chat/fragment/cu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikChatFragment;->e(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ImeAwareEditText;

    move-result-object v4

    invoke-static {v3, v4}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Landroid/view/View;)V

    .line 1461
    invoke-virtual {v0}, Lkik/a/d/s;->e()J

    move-result-wide v4

    invoke-static {v4, v5, v2}, Lkik/android/util/cq;->a(JZ)Lkik/android/util/cq$a;

    move-result-object v3

    iget-object v3, v3, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    invoke-interface {p1, v3}, Landroid/view/ContextMenu;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/ContextMenu;

    .line 1463
    const-class v3, Lkik/a/d/a/a;

    invoke-static {v0, v3}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 1465
    if-eqz v0, :cond_9

    .line 1466
    invoke-virtual {v0}, Lkik/a/d/a/a;->v()I

    move-result v3

    .line 1467
    sget v4, Lkik/a/d/a/a$a;->e:I

    if-eq v3, v4, :cond_2

    sget v4, Lkik/a/d/a/a$a;->a:I

    if-ne v3, v4, :cond_3

    :cond_2
    const-string v3, "allow-forward"

    invoke-virtual {v0, v3}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "true"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1468
    const v3, 0x7f0902be

    invoke-interface {p1, v2, v6, v1, v3}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 1472
    :cond_3
    invoke-virtual {v0}, Lkik/a/d/a/a;->x()Z

    move-result v3

    if-nez v3, :cond_5

    .line 1473
    invoke-static {v0}, Lkik/android/f/a/f;->d(Lkik/a/d/a/a;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 1474
    iget-object v3, p0, Lkik/android/chat/fragment/cu;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikChatFragment;->n:Lcom/kik/l/ab;

    invoke-virtual {v0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/kik/l/ab;->f(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 1476
    if-eqz v3, :cond_4

    iget-object v4, p0, Lkik/android/chat/fragment/cu;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v4, v4, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    invoke-interface {v4, v3}, Lkik/a/e/v;->c(Ljava/io/File;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_4
    iget-object v3, p0, Lkik/android/chat/fragment/cu;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    invoke-static {v3, v0}, Lkik/android/util/a;->a(Lkik/a/e/v;Lkik/a/d/a/a;)Z

    move-result v0

    if-nez v0, :cond_6

    move v0, v1

    .line 1477
    :goto_1
    const v1, 0x7f090203

    invoke-interface {p1, v2, v8, v6, v1}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 1494
    :cond_5
    :goto_2
    const v0, 0x7f0902a9

    invoke-interface {p1, v2, v7, v7, v0}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 1498
    invoke-interface {p1}, Landroid/view/ContextMenu;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1500
    invoke-static {p2}, Lkik/android/util/cv;->a(Landroid/view/View;)V

    goto/16 :goto_0

    :cond_6
    move v0, v2

    .line 1476
    goto :goto_1

    .line 1479
    :cond_7
    invoke-static {v0}, Lkik/android/f/a/f;->c(Lkik/a/d/a/a;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 1480
    new-instance v3, Lkik/a/d/d;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lkik/a/d/d;-><init>([B)V

    .line 1481
    invoke-virtual {v0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lkik/a/d/d;->a(Ljava/lang/String;)V

    .line 1483
    invoke-static {}, Lkik/android/util/a;->a()Lkik/android/util/a;

    move-result-object v4

    invoke-virtual {v0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lkik/android/util/a;->a(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_8

    invoke-static {}, Lkik/a/h/e;->a()Lkik/a/h/e;

    move-result-object v4

    invoke-virtual {v4, v3}, Lkik/a/h/e;->a(Lkik/a/d/d;)Z

    move-result v3

    if-nez v3, :cond_8

    iget-object v3, p0, Lkik/android/chat/fragment/cu;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    invoke-static {v3, v0}, Lkik/android/util/a;->a(Lkik/a/e/v;Lkik/a/d/a/a;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 1486
    :goto_3
    const v0, 0x7f090203

    invoke-interface {p1, v2, v8, v6, v0}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    goto :goto_2

    :cond_8
    move v1, v2

    .line 1483
    goto :goto_3

    .line 1491
    :cond_9
    const v0, 0x7f0902a6

    invoke-interface {p1, v2, v1, v2, v0}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    goto :goto_2
.end method
