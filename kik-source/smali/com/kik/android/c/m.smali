.class final Lcom/kik/android/c/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Lcom/kik/android/c/l;


# direct methods
.method constructor <init>(Lcom/kik/android/c/l;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/kik/android/c/m;->a:Lcom/kik/android/c/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    .line 41
    check-cast p1, Lcom/kik/n/a/j/c;

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/kik/n/a/j/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/kik/n/a/j/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/kik/n/a/j/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/kik/n/a/j/c;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/kik/n/a/j/c;->f()Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static/range {v0 .. v5}, Lcom/kik/android/c/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/kik/android/c/e;

    move-result-object v0

    goto :goto_0
.end method
