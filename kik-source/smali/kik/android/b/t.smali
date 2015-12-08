.class final Lkik/android/b/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Lkik/android/b/s;


# direct methods
.method constructor <init>(Lkik/android/b/s;)V
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Lkik/android/b/t;->a:Lkik/android/b/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 70
    check-cast p1, Lcom/kik/n/a/b/c;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/kik/n/a/b/c;->c()Lcom/kik/n/a/b/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/kik/n/a/b/a;->c()Lcom/b/a/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/b/a/b;->c()[B

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
