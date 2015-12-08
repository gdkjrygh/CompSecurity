.class Lcom/squareup/okhttp/Failure;
.super Ljava/lang/Object;
.source "Failure.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/Failure$Builder;
    }
.end annotation


# instance fields
.field private final exception:Ljava/lang/Throwable;

.field private final request:Lcom/squareup/okhttp/Request;


# direct methods
.method private constructor <init>(Lcom/squareup/okhttp/Failure$Builder;)V
    .locals 1
    .param p1, "builder"    # Lcom/squareup/okhttp/Failure$Builder;

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    # getter for: Lcom/squareup/okhttp/Failure$Builder;->request:Lcom/squareup/okhttp/Request;
    invoke-static {p1}, Lcom/squareup/okhttp/Failure$Builder;->access$000(Lcom/squareup/okhttp/Failure$Builder;)Lcom/squareup/okhttp/Request;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Failure;->request:Lcom/squareup/okhttp/Request;

    .line 30
    # getter for: Lcom/squareup/okhttp/Failure$Builder;->exception:Ljava/lang/Throwable;
    invoke-static {p1}, Lcom/squareup/okhttp/Failure$Builder;->access$100(Lcom/squareup/okhttp/Failure$Builder;)Ljava/lang/Throwable;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Failure;->exception:Ljava/lang/Throwable;

    .line 31
    return-void
.end method

.method synthetic constructor <init>(Lcom/squareup/okhttp/Failure$Builder;Lcom/squareup/okhttp/Failure$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/squareup/okhttp/Failure$Builder;
    .param p2, "x1"    # Lcom/squareup/okhttp/Failure$1;

    .prologue
    .line 24
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/Failure;-><init>(Lcom/squareup/okhttp/Failure$Builder;)V

    return-void
.end method


# virtual methods
.method public exception()Ljava/lang/Throwable;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/squareup/okhttp/Failure;->exception:Ljava/lang/Throwable;

    return-object v0
.end method

.method public request()Lcom/squareup/okhttp/Request;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/squareup/okhttp/Failure;->request:Lcom/squareup/okhttp/Request;

    return-object v0
.end method
