.class final Lcom/kik/android/c/n;
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
    .line 48
    iput-object p1, p0, Lcom/kik/android/c/n;->a:Lcom/kik/android/c/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 48
    check-cast p1, Lcom/kik/n/a/j/a;

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/kik/android/c/a;

    invoke-virtual {p1}, Lcom/kik/n/a/j/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/kik/n/a/j/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/kik/android/c/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
