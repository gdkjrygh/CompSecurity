.class final Lkik/android/gifs/a/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/r$b;


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/android/gifs/a/g;


# direct methods
.method constructor <init>(Lkik/android/gifs/a/g;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lkik/android/gifs/a/i;->b:Lkik/android/gifs/a/g;

    iput-object p2, p0, Lkik/android/gifs/a/i;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 78
    check-cast p1, Lorg/json/JSONObject;

    invoke-static {p1}, Lkik/android/gifs/a/n;->a(Lorg/json/JSONObject;)Lkik/android/gifs/a/d;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lkik/android/gifs/a/i;->a:Lcom/kik/g/p;

    new-instance v2, Ljava/lang/Throwable;

    const-string v3, "Null response"

    invoke-direct {v2, v3}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    :cond_0
    iget-object v1, p0, Lkik/android/gifs/a/i;->a:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void
.end method
