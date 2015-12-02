.class Lcom/android/volley/j$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/android/volley/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/volley/j;->a(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/android/volley/j;

.field private final synthetic b:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/android/volley/j;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/android/volley/j$1;->a:Lcom/android/volley/j;

    iput-object p2, p0, Lcom/android/volley/j$1;->b:Ljava/lang/Object;

    .line 206
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/volley/Request;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/volley/Request",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 209
    invoke-virtual {p1}, Lcom/android/volley/Request;->b()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/android/volley/j$1;->b:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
