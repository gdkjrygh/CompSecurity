.class final Lkik/android/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/a;

.field final synthetic b:Lkik/android/j;


# direct methods
.method constructor <init>(Lkik/android/j;Lkik/android/a;)V
    .locals 0

    .prologue
    .line 126
    iput-object p1, p0, Lkik/android/k;->b:Lkik/android/j;

    iput-object p2, p0, Lkik/android/k;->a:Lkik/android/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lkik/android/k;->a:Lkik/android/a;

    invoke-virtual {v0}, Lkik/android/a;->f()V

    .line 131
    return-void
.end method
