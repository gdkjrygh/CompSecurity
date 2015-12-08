.class final Lkik/android/widget/ax;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/GifSearchFragment;


# direct methods
.method constructor <init>(Lkik/android/widget/GifSearchFragment;)V
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lkik/android/widget/ax;->a:Lkik/android/widget/GifSearchFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/widget/ax;->a:Lkik/android/widget/GifSearchFragment;

    invoke-virtual {v0}, Lkik/android/widget/GifSearchFragment;->cancelSearchText()V

    .line 54
    return-void
.end method
