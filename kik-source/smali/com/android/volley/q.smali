.class final Lcom/android/volley/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/p$a;


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/android/volley/p;


# direct methods
.method constructor <init>(Lcom/android/volley/p;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 213
    iput-object p1, p0, Lcom/android/volley/q;->b:Lcom/android/volley/p;

    iput-object p2, p0, Lcom/android/volley/q;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/volley/n;)Z
    .locals 2

    .prologue
    .line 217
    invoke-virtual {p1}, Lcom/android/volley/n;->b()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/android/volley/q;->a:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
