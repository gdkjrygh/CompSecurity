.class final Lcom/android/volley/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

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

.field private final b:Lcom/android/volley/n;

.field private final c:Lcom/android/volley/r;

.field private final d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/android/volley/f;Lcom/android/volley/n;Lcom/android/volley/r;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/android/volley/f$a;->a:Lcom/android/volley/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object p2, p0, Lcom/android/volley/f$a;->b:Lcom/android/volley/n;

    .line 93
    iput-object p3, p0, Lcom/android/volley/f$a;->c:Lcom/android/volley/r;

    .line 94
    iput-object p4, p0, Lcom/android/volley/f$a;->d:Ljava/lang/Runnable;

    .line 95
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 102
    iget-object v0, p0, Lcom/android/volley/f$a;->b:Lcom/android/volley/n;

    invoke-virtual {v0}, Lcom/android/volley/n;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 103
    iget-object v0, p0, Lcom/android/volley/f$a;->b:Lcom/android/volley/n;

    const-string v1, "canceled-at-delivery"

    invoke-virtual {v0, v1}, Lcom/android/volley/n;->b(Ljava/lang/String;)V

    .line 128
    :cond_0
    :goto_0
    return-void

    .line 108
    :cond_1
    iget-object v0, p0, Lcom/android/volley/f$a;->c:Lcom/android/volley/r;

    iget-object v0, v0, Lcom/android/volley/r;->c:Lcom/android/volley/w;

    if-nez v0, :cond_2

    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    .line 109
    iget-object v0, p0, Lcom/android/volley/f$a;->b:Lcom/android/volley/n;

    iget-object v1, p0, Lcom/android/volley/f$a;->c:Lcom/android/volley/r;

    iget-object v1, v1, Lcom/android/volley/r;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/android/volley/n;->b(Ljava/lang/Object;)V

    .line 117
    :goto_2
    iget-object v0, p0, Lcom/android/volley/f$a;->c:Lcom/android/volley/r;

    iget-boolean v0, v0, Lcom/android/volley/r;->d:Z

    if-eqz v0, :cond_4

    .line 118
    iget-object v0, p0, Lcom/android/volley/f$a;->b:Lcom/android/volley/n;

    const-string v1, "intermediate-response"

    invoke-virtual {v0, v1}, Lcom/android/volley/n;->a(Ljava/lang/String;)V

    .line 125
    :goto_3
    iget-object v0, p0, Lcom/android/volley/f$a;->d:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/android/volley/f$a;->d:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 108
    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    .line 112
    :cond_3
    iget-object v0, p0, Lcom/android/volley/f$a;->b:Lcom/android/volley/n;

    iget-object v1, p0, Lcom/android/volley/f$a;->c:Lcom/android/volley/r;

    iget-object v1, v1, Lcom/android/volley/r;->c:Lcom/android/volley/w;

    invoke-virtual {v0, v1}, Lcom/android/volley/n;->b(Lcom/android/volley/w;)V

    goto :goto_2

    .line 121
    :cond_4
    iget-object v0, p0, Lcom/android/volley/f$a;->b:Lcom/android/volley/n;

    const-string v1, "done"

    invoke-virtual {v0, v1}, Lcom/android/volley/n;->b(Ljava/lang/String;)V

    goto :goto_3
.end method
