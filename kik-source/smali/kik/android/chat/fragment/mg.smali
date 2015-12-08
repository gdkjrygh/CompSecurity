.class final Lkik/android/chat/fragment/mg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikLoginFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikLoginFragment;)V
    .locals 0

    .prologue
    .line 149
    iput-object p1, p0, Lkik/android/chat/fragment/mg;->a:Lkik/android/chat/fragment/KikLoginFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    .line 154
    iget-object v0, p0, Lkik/android/chat/fragment/mg;->a:Lkik/android/chat/fragment/KikLoginFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikLoginFragment;->g:Lcom/kik/android/a;

    const-string v1, "Forgot Password Clicked"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 156
    new-instance v0, Landroid/content/Intent;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lkik/android/chat/fragment/mg;->a:Lkik/android/chat/fragment/KikLoginFragment;

    iget-object v4, v4, Lkik/android/chat/fragment/KikLoginFragment;->a:Lkik/a/f/k;

    invoke-interface {v4}, Lkik/a/f/k;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/p"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 158
    iget-object v1, p0, Lkik/android/chat/fragment/mg;->a:Lkik/android/chat/fragment/KikLoginFragment;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikLoginFragment;->startActivity(Landroid/content/Intent;)V

    .line 159
    return-void
.end method
