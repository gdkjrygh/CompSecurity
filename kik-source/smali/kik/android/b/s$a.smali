.class final Lkik/android/b/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/b/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field a:Lcom/kik/n/a/b/i$a;


# direct methods
.method public constructor <init>(Lcom/kik/n/a/b/i$a;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lkik/android/b/s$a;->a:Lcom/kik/n/a/b/i$a;

    .line 35
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 27
    check-cast p1, Lcom/kik/n/a/b/c;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lkik/android/b/s$a;->a:Lcom/kik/n/a/b/i$a;

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p1}, Lcom/kik/n/a/b/c;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/n/a/b/i;

    iget-object v3, p0, Lkik/android/b/s$a;->a:Lcom/kik/n/a/b/i$a;

    invoke-virtual {v0}, Lcom/kik/n/a/b/i;->c()Lcom/kik/n/a/b/i$a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/kik/n/a/b/i$a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method
