.class final Lkik/android/widget/ei;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/widget/UpdatingDateView;


# direct methods
.method constructor <init>(Lkik/android/widget/UpdatingDateView;Landroid/os/Handler;)V
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lkik/android/widget/ei;->a:Lkik/android/widget/UpdatingDateView;

    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onChange(Z)V
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lkik/android/widget/ei;->a:Lkik/android/widget/UpdatingDateView;

    invoke-static {v0}, Lkik/android/widget/UpdatingDateView;->b(Lkik/android/widget/UpdatingDateView;)V

    .line 67
    return-void
.end method
