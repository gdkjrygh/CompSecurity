.class final Lkik/android/chat/fragment/hk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lkik/android/util/p$a;

.field final synthetic b:Lkik/android/chat/fragment/KikChatInfoFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/android/util/p$a;)V
    .locals 0

    .prologue
    .line 1581
    iput-object p1, p0, Lkik/android/chat/fragment/hk;->b:Lkik/android/chat/fragment/KikChatInfoFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/hk;->a:Lkik/android/util/p$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 1585
    iget-object v0, p0, Lkik/android/chat/fragment/hk;->a:Lkik/android/util/p$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/util/p$a;->cancel(Z)Z

    .line 1586
    return-void
.end method
