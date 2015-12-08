.class final Lkik/android/chat/fragment/rc;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ra;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ra;)V
    .locals 0

    .prologue
    .line 183
    iput-object p1, p0, Lkik/android/chat/fragment/rc;->a:Lkik/android/chat/fragment/ra;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 183
    check-cast p1, Landroid/os/Bundle;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/chat/fragment/rc;->a:Lkik/android/chat/fragment/ra;

    iget-object v0, v0, Lkik/android/chat/fragment/ra;->a:Lkik/android/chat/fragment/SendToFragment;

    invoke-static {v0, p1}, Lkik/android/chat/fragment/SendToFragment;->a(Lkik/android/chat/fragment/SendToFragment;Landroid/os/Bundle;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 194
    iget-object v0, p0, Lkik/android/chat/fragment/rc;->a:Lkik/android/chat/fragment/ra;

    iget-object v0, v0, Lkik/android/chat/fragment/ra;->a:Lkik/android/chat/fragment/SendToFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/SendToFragment;->W()V

    .line 195
    return-void
.end method
