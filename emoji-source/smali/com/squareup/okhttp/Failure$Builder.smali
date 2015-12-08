.class public Lcom/squareup/okhttp/Failure$Builder;
.super Ljava/lang/Object;
.source "Failure.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/Failure;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private exception:Ljava/lang/Throwable;

.field private request:Lcom/squareup/okhttp/Request;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/squareup/okhttp/Failure$Builder;)Lcom/squareup/okhttp/Request;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/Failure$Builder;

    .prologue
    .line 41
    iget-object v0, p0, Lcom/squareup/okhttp/Failure$Builder;->request:Lcom/squareup/okhttp/Request;

    return-object v0
.end method

.method static synthetic access$100(Lcom/squareup/okhttp/Failure$Builder;)Ljava/lang/Throwable;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/Failure$Builder;

    .prologue
    .line 41
    iget-object v0, p0, Lcom/squareup/okhttp/Failure$Builder;->exception:Ljava/lang/Throwable;

    return-object v0
.end method


# virtual methods
.method public build()Lcom/squareup/okhttp/Failure;
    .locals 2

    .prologue
    .line 56
    new-instance v0, Lcom/squareup/okhttp/Failure;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/squareup/okhttp/Failure;-><init>(Lcom/squareup/okhttp/Failure$Builder;Lcom/squareup/okhttp/Failure$1;)V

    return-object v0
.end method

.method public exception(Ljava/lang/Throwable;)Lcom/squareup/okhttp/Failure$Builder;
    .locals 0
    .param p1, "exception"    # Ljava/lang/Throwable;

    .prologue
    .line 51
    iput-object p1, p0, Lcom/squareup/okhttp/Failure$Builder;->exception:Ljava/lang/Throwable;

    .line 52
    return-object p0
.end method

.method public request(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Failure$Builder;
    .locals 0
    .param p1, "request"    # Lcom/squareup/okhttp/Request;

    .prologue
    .line 46
    iput-object p1, p0, Lcom/squareup/okhttp/Failure$Builder;->request:Lcom/squareup/okhttp/Request;

    .line 47
    return-object p0
.end method
