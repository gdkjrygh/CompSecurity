.class final Lkik/android/gifs/e;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/android/gifs/b;


# direct methods
.method constructor <init>(Lkik/android/gifs/b;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 153
    iput-object p1, p0, Lkik/android/gifs/e;->b:Lkik/android/gifs/b;

    iput-object p2, p0, Lkik/android/gifs/e;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 153
    check-cast p1, Lkik/android/gifs/view/a;

    iget-object v0, p0, Lkik/android/gifs/e;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Lkik/android/gifs/e;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 164
    return-void
.end method
