.class final Lkik/android/h/e;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/h/a;


# direct methods
.method constructor <init>(Lkik/android/h/a;)V
    .locals 0

    .prologue
    .line 211
    iput-object p1, p0, Lkik/android/h/e;->a:Lkik/android/h/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 211
    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 221
    invoke-static {}, Lkik/android/h/a;->i()Lorg/c/b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to save opt in as "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lkik/android/h/e;->a:Lkik/android/h/a;

    invoke-static {v2}, Lkik/android/h/a;->a(Lkik/android/h/a;)Lkik/a/d/c;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/c;->a()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "however it has been saved locally"

    invoke-interface {v0, v1, v2, p1}, Lorg/c/b;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 222
    return-void
.end method
