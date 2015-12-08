.class final Lkik/android/chat/fragment/bi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:Lkik/android/chat/fragment/bg;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/bg;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lkik/android/chat/fragment/bi;->b:Lkik/android/chat/fragment/bg;

    iput-object p2, p0, Lkik/android/chat/fragment/bi;->a:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 104
    iget-object v0, p0, Lkik/android/chat/fragment/bi;->b:Lkik/android/chat/fragment/bg;

    iget-object v0, v0, Lkik/android/chat/fragment/bg;->a:Lkik/android/chat/fragment/bf;

    iget-object v0, v0, Lkik/android/chat/fragment/bf;->b:Lkik/android/chat/fragment/KikAddToBlockFragment;

    invoke-static {}, Lkik/android/util/cq;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/bi;->a:Ljava/lang/Throwable;

    invoke-static {v2}, Lkik/android/util/cy;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikAddToBlockFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    return-void
.end method
