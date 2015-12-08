.class final Lkik/android/chat/fragment/hp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ho;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ho;)V
    .locals 0

    .prologue
    .line 1668
    iput-object p1, p0, Lkik/android/chat/fragment/hp;->a:Lkik/android/chat/fragment/ho;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 1672
    iget-object v0, p0, Lkik/android/chat/fragment/hp;->a:Lkik/android/chat/fragment/ho;

    iget-object v0, v0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v0, v0, Lkik/android/chat/fragment/hn;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(Z)V

    .line 1673
    return-void
.end method
