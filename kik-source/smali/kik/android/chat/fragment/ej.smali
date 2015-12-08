.class final Lkik/android/chat/fragment/ej;
.super Lkik/android/widget/dl$c;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 3208
    iput-object p1, p0, Lkik/android/chat/fragment/ej;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Lkik/android/widget/dl$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 3215
    iget-object v0, p0, Lkik/android/chat/fragment/ej;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->R(Lkik/android/chat/fragment/KikChatFragment;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 3216
    return-void
.end method
