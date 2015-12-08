.class final Lkik/android/chat/fragment/oc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikPromotedChatsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikPromotedChatsFragment;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lkik/android/chat/fragment/oc;->a:Lkik/android/chat/fragment/KikPromotedChatsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5

    .prologue
    .line 38
    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    .line 39
    instance-of v1, v0, Lkik/a/d/k;

    if-eqz v1, :cond_1

    .line 40
    check-cast v0, Lkik/a/d/k;

    .line 41
    if-eqz v0, :cond_1

    .line 42
    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    .line 43
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 44
    iget-object v3, p0, Lkik/android/chat/fragment/oc;->a:Lkik/android/chat/fragment/KikPromotedChatsFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikPromotedChatsFragment;->l:Lcom/kik/android/a;

    const-string v4, "Suggested Chat Click"

    invoke-virtual {v3, v4}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Bots"

    invoke-virtual {v3, v4, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Is Contact"

    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/android/a$f;->b()V

    .line 49
    invoke-virtual {v0}, Lkik/a/d/k;->m()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lkik/a/d/k;->p()Z

    move-result v0

    if-nez v0, :cond_2

    .line 50
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/oc;->a:Lkik/android/chat/fragment/KikPromotedChatsFragment;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikPromotedChatsFragment;->b(Ljava/lang/String;)V

    .line 58
    :cond_1
    :goto_0
    return-void

    .line 54
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/oc;->a:Lkik/android/chat/fragment/KikPromotedChatsFragment;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikPromotedChatsFragment;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
