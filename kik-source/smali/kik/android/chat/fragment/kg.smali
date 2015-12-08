.class final Lkik/android/chat/fragment/kg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lkik/android/chat/fragment/KikConversationsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikConversationsFragment;I)V
    .locals 0

    .prologue
    .line 902
    iput-object p1, p0, Lkik/android/chat/fragment/kg;->b:Lkik/android/chat/fragment/KikConversationsFragment;

    iput p2, p0, Lkik/android/chat/fragment/kg;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 906
    iget-object v0, p0, Lkik/android/chat/fragment/kg;->b:Lkik/android/chat/fragment/KikConversationsFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikConversationsFragment;->k:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/kg;->b:Lkik/android/chat/fragment/KikConversationsFragment;

    iget v2, p0, Lkik/android/chat/fragment/kg;->a:I

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikConversationsFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 907
    return-void
.end method
