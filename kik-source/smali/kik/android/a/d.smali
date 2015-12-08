.class final Lkik/android/a/d;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/a/b;


# direct methods
.method constructor <init>(Lkik/android/a/b;)V
    .locals 0

    .prologue
    .line 131
    iput-object p1, p0, Lkik/android/a/d;->a:Lkik/android/a/b;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 131
    iget-object v0, p0, Lkik/android/a/d;->a:Lkik/android/a/b;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkik/android/a/b;->a:Z

    iget-object v0, p0, Lkik/android/a/d;->a:Lkik/android/a/b;

    iget-object v0, v0, Lkik/android/a/b;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/a/d;->a:Lkik/android/a/b;

    iget-boolean v0, v0, Lkik/android/a/b;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/a/d;->a:Lkik/android/a/b;

    invoke-virtual {v0}, Lkik/android/a/b;->a()V

    :cond_0
    return-void
.end method
