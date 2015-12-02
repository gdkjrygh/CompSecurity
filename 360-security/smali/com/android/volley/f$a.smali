.class Lcom/android/volley/f$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/volley/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/android/volley/f;

.field private final b:Lcom/android/volley/Request;

.field private final c:Lcom/android/volley/k;

.field private final d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/android/volley/f;Lcom/android/volley/Request;Lcom/android/volley/k;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lcom/android/volley/f$a;->a:Lcom/android/volley/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    iput-object p2, p0, Lcom/android/volley/f$a;->b:Lcom/android/volley/Request;

    .line 88
    iput-object p3, p0, Lcom/android/volley/f$a;->c:Lcom/android/volley/k;

    .line 89
    iput-object p4, p0, Lcom/android/volley/f$a;->d:Ljava/lang/Runnable;

    .line 90
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 96
    iget-object v0, p0, Lcom/android/volley/f$a;->b:Lcom/android/volley/Request;

    invoke-virtual {v0}, Lcom/android/volley/Request;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    iget-object v0, p0, Lcom/android/volley/f$a;->b:Lcom/android/volley/Request;

    const-string/jumbo v1, "canceled-at-delivery"

    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->b(Ljava/lang/String;)V

    .line 120
    :cond_0
    :goto_0
    return-void

    .line 102
    :cond_1
    iget-object v0, p0, Lcom/android/volley/f$a;->c:Lcom/android/volley/k;

    invoke-virtual {v0}, Lcom/android/volley/k;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 103
    iget-object v0, p0, Lcom/android/volley/f$a;->b:Lcom/android/volley/Request;

    iget-object v1, p0, Lcom/android/volley/f$a;->c:Lcom/android/volley/k;

    iget-object v1, v1, Lcom/android/volley/k;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->b(Ljava/lang/Object;)V

    .line 110
    :goto_1
    iget-object v0, p0, Lcom/android/volley/f$a;->c:Lcom/android/volley/k;

    iget-boolean v0, v0, Lcom/android/volley/k;->d:Z

    if-eqz v0, :cond_3

    .line 111
    iget-object v0, p0, Lcom/android/volley/f$a;->b:Lcom/android/volley/Request;

    const-string/jumbo v1, "intermediate-response"

    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    .line 117
    :goto_2
    iget-object v0, p0, Lcom/android/volley/f$a;->d:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/android/volley/f$a;->d:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 105
    :cond_2
    iget-object v0, p0, Lcom/android/volley/f$a;->b:Lcom/android/volley/Request;

    iget-object v1, p0, Lcom/android/volley/f$a;->c:Lcom/android/volley/k;

    iget-object v1, v1, Lcom/android/volley/k;->c:Lcom/android/volley/VolleyError;

    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->b(Lcom/android/volley/VolleyError;)V

    goto :goto_1

    .line 113
    :cond_3
    iget-object v0, p0, Lcom/android/volley/f$a;->b:Lcom/android/volley/Request;

    const-string/jumbo v1, "done"

    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->b(Ljava/lang/String;)V

    goto :goto_2
.end method
