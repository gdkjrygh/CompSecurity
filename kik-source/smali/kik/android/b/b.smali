.class final Lkik/android/b/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Lkik/android/b/a;


# direct methods
.method constructor <init>(Lkik/android/b/a;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lkik/android/b/b;->a:Lkik/android/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    .line 43
    check-cast p1, Lcom/kik/n/a/c/e;

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/kik/n/a/c/e;->h()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/kik/n/a/c/e;->b()Ljava/lang/String;

    move-result-object v1

    :goto_1
    new-instance v0, Lkik/a/i/h$a;

    invoke-virtual {p1}, Lcom/kik/n/a/c/e;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/kik/n/a/c/e;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/kik/n/a/c/e;->e()Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lkik/a/i/h$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/kik/n/a/c/e;->h()Ljava/lang/String;

    move-result-object v1

    goto :goto_1
.end method
