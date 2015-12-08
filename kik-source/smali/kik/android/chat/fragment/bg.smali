.class final Lkik/android/chat/fragment/bg;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/bf;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/bf;)V
    .locals 0

    .prologue
    .line 81
    iput-object p1, p0, Lkik/android/chat/fragment/bg;->a:Lkik/android/chat/fragment/bf;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 81
    iget-object v0, p0, Lkik/android/chat/fragment/bg;->a:Lkik/android/chat/fragment/bf;

    iget-object v0, v0, Lkik/android/chat/fragment/bf;->b:Lkik/android/chat/fragment/KikAddToBlockFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    iget-object v0, p0, Lkik/android/chat/fragment/bg;->a:Lkik/android/chat/fragment/bf;

    iget-object v0, v0, Lkik/android/chat/fragment/bf;->b:Lkik/android/chat/fragment/KikAddToBlockFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikAddToBlockFragment;->c:Landroid/widget/ListView;

    new-instance v1, Lkik/android/chat/fragment/bh;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/bh;-><init>(Lkik/android/chat/fragment/bg;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 99
    iget-object v0, p0, Lkik/android/chat/fragment/bg;->a:Lkik/android/chat/fragment/bf;

    iget-object v0, v0, Lkik/android/chat/fragment/bf;->b:Lkik/android/chat/fragment/KikAddToBlockFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 100
    iget-object v0, p0, Lkik/android/chat/fragment/bg;->a:Lkik/android/chat/fragment/bf;

    iget-object v0, v0, Lkik/android/chat/fragment/bf;->b:Lkik/android/chat/fragment/KikAddToBlockFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikAddToBlockFragment;->c:Landroid/widget/ListView;

    new-instance v1, Lkik/android/chat/fragment/bi;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/bi;-><init>(Lkik/android/chat/fragment/bg;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    .line 107
    return-void
.end method
