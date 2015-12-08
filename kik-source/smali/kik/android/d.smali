.class final Lkik/android/d;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/a;


# direct methods
.method constructor <init>(Lkik/android/a;)V
    .locals 0

    .prologue
    .line 233
    iput-object p1, p0, Lkik/android/d;->a:Lkik/android/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 233
    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/d;->a:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->k(Lkik/android/a;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkik/android/e;

    invoke-direct {v1, p0}, Lkik/android/e;-><init>(Lkik/android/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    invoke-super {p0}, Lcom/kik/g/r;->c()V

    return-void
.end method
