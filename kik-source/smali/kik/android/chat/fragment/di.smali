.class final Lkik/android/chat/fragment/di;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/animation/AnimatorSet;

.field final synthetic b:Lkik/android/chat/fragment/dg;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/dg;Landroid/animation/AnimatorSet;)V
    .locals 0

    .prologue
    .line 1778
    iput-object p1, p0, Lkik/android/chat/fragment/di;->b:Lkik/android/chat/fragment/dg;

    iput-object p2, p0, Lkik/android/chat/fragment/di;->a:Landroid/animation/AnimatorSet;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 1782
    iget-object v0, p0, Lkik/android/chat/fragment/di;->a:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 1783
    return-void
.end method
