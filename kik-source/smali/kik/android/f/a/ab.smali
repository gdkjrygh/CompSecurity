.class final Lkik/android/f/a/ab;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:Lkik/android/f/a/z;


# direct methods
.method constructor <init>(Lkik/android/f/a/z;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 1079
    iput-object p1, p0, Lkik/android/f/a/ab;->b:Lkik/android/f/a/z;

    iput-object p2, p0, Lkik/android/f/a/ab;->a:Ljava/lang/Throwable;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 1083
    iget-object v0, p0, Lkik/android/f/a/ab;->b:Lkik/android/f/a/z;

    iget-object v0, v0, Lkik/android/f/a/z;->b:Landroid/app/Activity;

    new-instance v1, Lkik/android/f/a/ac;

    invoke-direct {v1, p0}, Lkik/android/f/a/ac;-><init>(Lkik/android/f/a/ab;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1096
    iget-object v0, p0, Lkik/android/f/a/ab;->b:Lkik/android/f/a/z;

    iget-object v0, v0, Lkik/android/f/a/z;->b:Landroid/app/Activity;

    invoke-static {v0}, Lkik/android/f/a/f;->a(Landroid/app/Activity;)V

    .line 1097
    return-void
.end method
