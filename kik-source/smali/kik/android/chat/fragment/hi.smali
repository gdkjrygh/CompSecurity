.class final Lkik/android/chat/fragment/hi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatInfoFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 0

    .prologue
    .line 1482
    iput-object p1, p0, Lkik/android/chat/fragment/hi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 1486
    iget-object v0, p0, Lkik/android/chat/fragment/hi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    const-string v1, "Chat Info Delete Chat Tapped"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 1487
    iget-object v0, p0, Lkik/android/chat/fragment/hi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatInfoFragment;->r:Lkik/a/e/i;

    iget-object v1, p0, Lkik/android/chat/fragment/hi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->i(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/f;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/i;->c(Ljava/lang/String;)V

    .line 1488
    iget-object v0, p0, Lkik/android/chat/fragment/hi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->x(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    .line 1489
    return-void
.end method
