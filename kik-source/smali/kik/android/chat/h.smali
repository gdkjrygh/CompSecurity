.class final Lkik/android/chat/h;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/KikApplication;


# direct methods
.method constructor <init>(Lkik/android/chat/KikApplication;)V
    .locals 0

    .prologue
    .line 559
    iput-object p1, p0, Lkik/android/chat/h;->a:Lkik/android/chat/KikApplication;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 559
    iget-object v0, p0, Lkik/android/chat/h;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->s(Lkik/android/chat/KikApplication;)Lkik/a/x;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/h;->a:Lkik/android/chat/KikApplication;

    invoke-static {v1}, Lkik/android/chat/KikApplication;->r(Lkik/android/chat/KikApplication;)Lkik/a/e/w;

    move-result-object v1

    invoke-interface {v1}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v1

    iget-object v1, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/a/x;->b(Ljava/lang/String;)Lkik/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lkik/android/chat/h;->a:Lkik/android/chat/KikApplication;

    invoke-static {}, Lkik/android/chat/KikApplication;->q()Lkik/android/chat/KikApplication;

    move-result-object v2

    invoke-virtual {v2}, Lkik/android/chat/KikApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lkik/android/chat/KikApplication;->a(Lkik/android/chat/KikApplication;Landroid/content/Context;Lkik/a/a;)V

    :cond_0
    iget-object v0, p0, Lkik/android/chat/h;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->t(Lkik/android/chat/KikApplication;)V

    return-void
.end method
