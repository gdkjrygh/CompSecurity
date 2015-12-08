.class final Lkik/android/l;
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
    .line 143
    iput-object p1, p0, Lkik/android/l;->b:Lkik/android/j;

    iput-object p2, p0, Lkik/android/l;->a:Lkik/android/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lkik/android/l;->a:Lkik/android/a;

    invoke-virtual {v0}, Lkik/android/a;->f()V

    .line 148
    return-void
.end method
