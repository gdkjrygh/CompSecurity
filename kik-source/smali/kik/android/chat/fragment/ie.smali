.class final Lkik/android/chat/fragment/ie;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/n;

.field final synthetic b:Lkik/android/chat/fragment/KikCodeFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikCodeFragment;Lkik/a/d/n;)V
    .locals 0

    .prologue
    .line 402
    iput-object p1, p0, Lkik/android/chat/fragment/ie;->b:Lkik/android/chat/fragment/KikCodeFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/ie;->a:Lkik/a/d/n;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 402
    check-cast p1, Lkik/a/f/f/j;

    new-instance v0, Lcom/kik/scan/GroupKikCode;

    invoke-virtual {p1}, Lkik/a/f/f/j;->d()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/kik/scan/GroupKikCode;-><init>([BI)V

    iget-object v1, p0, Lkik/android/chat/fragment/ie;->b:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v1, v0}, Lkik/android/chat/fragment/KikCodeFragment;->b(Lkik/android/chat/fragment/KikCodeFragment;Lcom/kik/scan/KikCode;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 413
    invoke-static {p1}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 414
    iget-object v0, p0, Lkik/android/chat/fragment/ie;->b:Lkik/android/chat/fragment/KikCodeFragment;

    new-instance v1, Lkik/android/chat/fragment/if;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/if;-><init>(Lkik/android/chat/fragment/ie;)V

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikCodeFragment;->a(Lkik/android/chat/fragment/KikCodeFragment;Lkik/android/chat/fragment/KikCodeFragment$c;)V

    .line 421
    return-void
.end method
