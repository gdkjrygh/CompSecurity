.class final Lkik/android/b/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/b/s;


# direct methods
.method constructor <init>(Lkik/android/b/s;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 249
    iput-object p1, p0, Lkik/android/b/z;->b:Lkik/android/b/s;

    iput-object p2, p0, Lkik/android/b/z;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 249
    check-cast p1, Lcom/kik/n/a/b/c;

    if-nez p1, :cond_0

    new-instance v0, Lcom/kik/n/a/b/c;

    invoke-direct {v0}, Lcom/kik/n/a/b/c;-><init>()V

    iget-object v1, p0, Lkik/android/b/z;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/n/a/b/c;->a(Ljava/lang/String;)Lcom/kik/n/a/b/c;

    move-result-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1, v0}, Lcom/kik/n/a/b/c;->a(Ljava/util/List;)Lcom/kik/n/a/b/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/kik/n/a/b/c;->a(Lcom/kik/n/a/b/a;)Lcom/kik/n/a/b/c;

    return-object p1
.end method
