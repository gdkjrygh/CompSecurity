.class final Lkik/android/f/a/h;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/android/f/a/f;


# direct methods
.method constructor <init>(Lkik/android/f/a/f;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 1297
    iput-object p1, p0, Lkik/android/f/a/h;->b:Lkik/android/f/a/f;

    iput-object p2, p0, Lkik/android/f/a/h;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 1297
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "SendToFragment.RESULT_JID"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/f/a/h;->a:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 1308
    iget-object v0, p0, Lkik/android/f/a/h;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 1309
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 1314
    iget-object v0, p0, Lkik/android/f/a/h;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 1315
    return-void
.end method
