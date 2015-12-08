.class final Lkik/android/chat/fragment/ly;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:Lkik/android/chat/fragment/lw;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/lw;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lkik/android/chat/fragment/ly;->b:Lkik/android/chat/fragment/lw;

    iput-object p2, p0, Lkik/android/chat/fragment/ly;->a:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 105
    iget-object v0, p0, Lkik/android/chat/fragment/ly;->a:Ljava/lang/Throwable;

    instance-of v0, v0, Lkik/a/f/q;

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p0, Lkik/android/chat/fragment/ly;->a:Ljava/lang/Throwable;

    check-cast v0, Lkik/a/f/q;

    .line 108
    iget-object v1, p0, Lkik/android/chat/fragment/ly;->b:Lkik/android/chat/fragment/lw;

    iget-object v1, v1, Lkik/android/chat/fragment/lw;->a:Lkik/android/chat/fragment/KikIqFragmentBase;

    iget-object v2, p0, Lkik/android/chat/fragment/ly;->b:Lkik/android/chat/fragment/lw;

    iget-object v2, v2, Lkik/android/chat/fragment/lw;->a:Lkik/android/chat/fragment/KikIqFragmentBase;

    iget v2, v2, Lkik/android/chat/fragment/KikIqFragmentBase;->R:I

    invoke-virtual {v0}, Lkik/a/f/q;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lkik/android/chat/fragment/KikIqFragmentBase;->a(ILjava/lang/String;)V

    .line 115
    :goto_0
    return-void

    .line 111
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/ly;->a:Ljava/lang/Throwable;

    invoke-static {v0}, Lkik/android/util/cy;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    .line 113
    iget-object v1, p0, Lkik/android/chat/fragment/ly;->b:Lkik/android/chat/fragment/lw;

    iget-object v1, v1, Lkik/android/chat/fragment/lw;->a:Lkik/android/chat/fragment/KikIqFragmentBase;

    iput-object v0, v1, Lkik/android/chat/fragment/KikIqFragmentBase;->Q:Ljava/lang/String;

    goto :goto_0
.end method
