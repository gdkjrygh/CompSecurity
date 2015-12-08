.class final Lkik/android/widget/bv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/widget/bu;


# direct methods
.method constructor <init>(Lkik/android/widget/bu;)V
    .locals 0

    .prologue
    .line 186
    iput-object p1, p0, Lkik/android/widget/bv;->a:Lkik/android/widget/bu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lkik/android/widget/bv;->a:Lkik/android/widget/bu;

    iget-object v0, v0, Lkik/android/widget/bu;->a:Lkik/android/widget/GifWidgetFragment;

    invoke-virtual {v0}, Lkik/android/widget/GifWidgetFragment;->a()V

    .line 191
    return-void
.end method
