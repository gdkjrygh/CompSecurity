.class final Lkik/android/b/y;
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
    .line 225
    iput-object p1, p0, Lkik/android/b/y;->a:Lkik/android/b/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 225
    check-cast p1, Lcom/kik/n/a/b/i;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/kik/n/a/b/i;->d()Lcom/kik/n/a/b/i$b;

    move-result-object v0

    sget-object v1, Lcom/kik/n/a/b/i$b;->b:Lcom/kik/n/a/b/i$b;

    invoke-virtual {v1, v0}, Lcom/kik/n/a/b/i$b;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method
