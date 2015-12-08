.class final Lkik/android/widget/bu;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/widget/GifWidgetFragment;


# direct methods
.method constructor <init>(Lkik/android/widget/GifWidgetFragment;)V
    .locals 0

    .prologue
    .line 181
    iput-object p1, p0, Lkik/android/widget/bu;->a:Lkik/android/widget/GifWidgetFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 181
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/bu;->a:Lkik/android/widget/GifWidgetFragment;

    new-instance v1, Lkik/android/widget/bv;

    invoke-direct {v1, p0}, Lkik/android/widget/bv;-><init>(Lkik/android/widget/bu;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/GifWidgetFragment;->b(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
