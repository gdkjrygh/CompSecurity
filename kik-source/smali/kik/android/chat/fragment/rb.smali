.class final Lkik/android/chat/fragment/rb;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ra;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ra;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lkik/android/chat/fragment/rb;->a:Lkik/android/chat/fragment/ra;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 161
    check-cast p1, Landroid/os/Bundle;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/chat/fragment/rb;->a:Lkik/android/chat/fragment/ra;

    iget-object v0, v0, Lkik/android/chat/fragment/ra;->a:Lkik/android/chat/fragment/SendToFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/SendToFragment;->J()V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lkik/android/chat/fragment/rb;->a:Lkik/android/chat/fragment/ra;

    iget-object v0, v0, Lkik/android/chat/fragment/ra;->a:Lkik/android/chat/fragment/SendToFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/SendToFragment;->W()V

    .line 166
    return-void
.end method
