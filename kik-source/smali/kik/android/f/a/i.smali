.class final Lkik/android/f/a/i;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/android/chat/fragment/KikCardBrowserFragment;

.field final synthetic c:Landroid/support/v4/app/Fragment;

.field final synthetic d:Lkik/android/f/a/f;


# direct methods
.method constructor <init>(Lkik/android/f/a/f;Lcom/kik/g/p;Lkik/android/chat/fragment/KikCardBrowserFragment;Landroid/support/v4/app/Fragment;)V
    .locals 0

    .prologue
    .line 1322
    iput-object p1, p0, Lkik/android/f/a/i;->d:Lkik/android/f/a/f;

    iput-object p2, p0, Lkik/android/f/a/i;->a:Lcom/kik/g/p;

    iput-object p3, p0, Lkik/android/f/a/i;->b:Lkik/android/chat/fragment/KikCardBrowserFragment;

    iput-object p4, p0, Lkik/android/f/a/i;->c:Landroid/support/v4/app/Fragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 1322
    iget-object v0, p0, Lkik/android/f/a/i;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/f/a/i;->b:Lkik/android/chat/fragment/KikCardBrowserFragment;

    iget-object v1, p0, Lkik/android/f/a/i;->c:Landroid/support/v4/app/Fragment;

    const v2, 0x7f090148

    invoke-virtual {v1, v2}, Landroid/support/v4/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikCardBrowserFragment;->f(Ljava/lang/String;)V

    iget-object v0, p0, Lkik/android/f/a/i;->a:Lcom/kik/g/p;

    new-instance v1, Lkik/android/f/a/j;

    invoke-direct {v1, p0}, Lkik/android/f/a/j;-><init>(Lkik/android/f/a/i;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    :cond_0
    return-void
.end method
