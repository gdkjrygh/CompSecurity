.class Lcom/android/volley/Request$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/volley/Request;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/android/volley/Request;

.field private final synthetic b:Ljava/lang/String;

.field private final synthetic c:J


# direct methods
.method constructor <init>(Lcom/android/volley/Request;Ljava/lang/String;J)V
    .locals 1

    .prologue
    .line 1
    iput-object p1, p0, Lcom/android/volley/Request$1;->a:Lcom/android/volley/Request;

    iput-object p2, p0, Lcom/android/volley/Request$1;->b:Ljava/lang/String;

    iput-wide p3, p0, Lcom/android/volley/Request$1;->c:J

    .line 229
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 232
    iget-object v0, p0, Lcom/android/volley/Request$1;->a:Lcom/android/volley/Request;

    invoke-static {v0}, Lcom/android/volley/Request;->b(Lcom/android/volley/Request;)Lcom/android/volley/n$a;

    move-result-object v0

    iget-object v1, p0, Lcom/android/volley/Request$1;->b:Ljava/lang/String;

    iget-wide v2, p0, Lcom/android/volley/Request$1;->c:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/android/volley/n$a;->a(Ljava/lang/String;J)V

    .line 233
    iget-object v0, p0, Lcom/android/volley/Request$1;->a:Lcom/android/volley/Request;

    invoke-static {v0}, Lcom/android/volley/Request;->b(Lcom/android/volley/Request;)Lcom/android/volley/n$a;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/volley/n$a;->a(Ljava/lang/String;)V

    .line 234
    return-void
.end method
