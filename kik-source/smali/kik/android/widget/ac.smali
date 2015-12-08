.class final Lkik/android/widget/ac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/widget/ab;


# direct methods
.method constructor <init>(Lkik/android/widget/ab;)V
    .locals 0

    .prologue
    .line 146
    iput-object p1, p0, Lkik/android/widget/ac;->a:Lkik/android/widget/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lkik/android/widget/ac;->a:Lkik/android/widget/ab;

    iget-object v0, v0, Lkik/android/widget/ab;->a:Lkik/android/widget/aa;

    invoke-virtual {v0}, Lkik/android/widget/aa;->notifyDataSetChanged()V

    .line 151
    return-void
.end method
