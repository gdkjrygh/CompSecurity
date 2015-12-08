.class final Lkik/android/chat/fragment/jv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ju;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ju;)V
    .locals 0

    .prologue
    .line 724
    iput-object p1, p0, Lkik/android/chat/fragment/jv;->a:Lkik/android/chat/fragment/ju;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 728
    iget-object v0, p0, Lkik/android/chat/fragment/jv;->a:Lkik/android/chat/fragment/ju;

    iget-object v0, v0, Lkik/android/chat/fragment/ju;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikConversationsFragment;->f:Lcom/kik/android/a;

    const-string v1, "Address Book Opt In"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 731
    iget-object v0, p0, Lkik/android/chat/fragment/jv;->a:Lkik/android/chat/fragment/ju;

    iget-object v0, v0, Lkik/android/chat/fragment/ju;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikConversationsFragment;->n:Lkik/a/e/b;

    invoke-interface {v0}, Lkik/a/e/b;->d()V

    .line 732
    return-void
.end method
