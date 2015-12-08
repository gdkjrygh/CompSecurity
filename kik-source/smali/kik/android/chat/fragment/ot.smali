.class final Lkik/android/chat/fragment/ot;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikRegistrationFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V
    .locals 0

    .prologue
    .line 763
    iput-object p1, p0, Lkik/android/chat/fragment/ot;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 768
    iget-object v0, p0, Lkik/android/chat/fragment/ot;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/ot;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikRegistrationFragment;->_firstnameField:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f090348

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lkik/android/chat/fragment/KikRegistrationFragment;->b(Ljava/lang/String;Z)V

    .line 769
    new-instance v0, Lkik/android/util/p$a;

    iget-object v1, p0, Lkik/android/chat/fragment/ot;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikRegistrationFragment;->g:Lkik/a/f/k;

    iget-object v2, p0, Lkik/android/chat/fragment/ot;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikRegistrationFragment;->b:Lkik/a/e/n;

    iget-object v3, p0, Lkik/android/chat/fragment/ot;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikRegistrationFragment;->d:Lkik/a/e/w;

    iget-object v4, p0, Lkik/android/chat/fragment/ot;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v4, v4, Lkik/android/chat/fragment/KikRegistrationFragment;->e:Lkik/a/e/v;

    invoke-direct {v0, v1, v2, v3, v4}, Lkik/android/util/p$a;-><init>(Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/w;Lkik/a/e/v;)V

    .line 770
    const/4 v1, 0x1

    new-array v1, v1, [Lkik/android/e/d;

    iget-object v2, p0, Lkik/android/chat/fragment/ot;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    aput-object v2, v1, v5

    invoke-virtual {v0, v1}, Lkik/android/util/p$a;->a([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 771
    return-void
.end method
