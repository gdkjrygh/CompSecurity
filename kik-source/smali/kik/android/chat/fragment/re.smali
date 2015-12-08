.class final Lkik/android/chat/fragment/re;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/os/Bundle;

.field final synthetic b:Lkik/android/chat/fragment/SendToFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/SendToFragment;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 229
    iput-object p1, p0, Lkik/android/chat/fragment/re;->b:Lkik/android/chat/fragment/SendToFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/re;->a:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 234
    iget-object v0, p0, Lkik/android/chat/fragment/re;->b:Lkik/android/chat/fragment/SendToFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/re;->a:Landroid/os/Bundle;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/SendToFragment;->b(Lkik/android/chat/fragment/SendToFragment;Landroid/os/Bundle;)V

    .line 235
    return-void
.end method
