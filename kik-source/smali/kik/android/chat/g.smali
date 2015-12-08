.class final Lkik/android/chat/g;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/KikApplication;


# direct methods
.method constructor <init>(Lkik/android/chat/KikApplication;)V
    .locals 0

    .prologue
    .line 550
    iput-object p1, p0, Lkik/android/chat/g;->a:Lkik/android/chat/KikApplication;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 554
    iget-object v0, p0, Lkik/android/chat/g;->a:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "Contact List Size"

    iget-object v2, p0, Lkik/android/chat/g;->a:Lkik/android/chat/KikApplication;

    invoke-static {v2}, Lkik/android/chat/KikApplication;->b(Lkik/android/chat/KikApplication;)Lkik/a/e/r;

    move-result-object v2

    invoke-interface {v2}, Lkik/a/e/r;->h()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->a(Ljava/lang/String;I)Lcom/kik/android/a;

    .line 555
    iget-object v0, p0, Lkik/android/chat/g;->a:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "Block List Size"

    iget-object v2, p0, Lkik/android/chat/g;->a:Lkik/android/chat/KikApplication;

    invoke-static {v2}, Lkik/android/chat/KikApplication;->b(Lkik/android/chat/KikApplication;)Lkik/a/e/r;

    move-result-object v2

    invoke-interface {v2}, Lkik/a/e/r;->i()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->a(Ljava/lang/String;I)Lcom/kik/android/a;

    .line 556
    return-void
.end method
